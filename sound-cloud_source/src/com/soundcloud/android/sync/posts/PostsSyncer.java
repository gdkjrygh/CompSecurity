// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import android.text.TextUtils;
import com.soundcloud.android.commands.BulkFetchCommand;
import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.collections.Sets;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            LoadLocalPostsCommand, FetchPostsCommand, RemovePostsCommand, StorePostsCommand

public class PostsSyncer
    implements Callable
{

    private static final String TAG = "PostsSyncer";
    private final EventBus eventBus;
    private final BulkFetchCommand fetchPostResources;
    private final FetchPostsCommand fetchRemotePosts;
    private final LoadLocalPostsCommand loadLocalPosts;
    private final RemovePostsCommand removePostsCommand;
    private final WriteStorageCommand storePostResources;
    private final StorePostsCommand storePostsCommand;

    public PostsSyncer(LoadLocalPostsCommand loadlocalpostscommand, FetchPostsCommand fetchpostscommand, StorePostsCommand storepostscommand, RemovePostsCommand removepostscommand, BulkFetchCommand bulkfetchcommand, WriteStorageCommand writestoragecommand, EventBus eventbus)
    {
        loadLocalPosts = loadlocalpostscommand;
        fetchRemotePosts = fetchpostscommand;
        storePostsCommand = storepostscommand;
        removePostsCommand = removepostscommand;
        fetchPostResources = bulkfetchcommand;
        storePostResources = writestoragecommand;
        eventBus = eventbus;
    }

    private Set createChangedEntities(Set set, boolean flag)
    {
        java.util.HashSet hashset = Sets.newHashSetWithExpectedSize(set.size());
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            PropertySet propertyset = (PropertySet)set.next();
            if (((Boolean)propertyset.get(PostProperty.IS_REPOST)).booleanValue())
            {
                hashset.add(PropertySet.from(new PropertyBinding[] {
                    PlayableProperty.URN.bind(propertyset.get(PlayableProperty.URN)), PlayableProperty.IS_REPOSTED.bind(Boolean.valueOf(flag))
                }));
            }
        } while (true);
        return hashset;
    }

    private void fetchResourcesForAdditions(Set set)
        throws Exception
    {
        ArrayList arraylist = new ArrayList(set.size());
        for (set = set.iterator(); set.hasNext(); arraylist.add(((PropertySet)set.next()).get(LikeProperty.TARGET_URN))) { }
        set = ((BulkFetchCommand)fetchPostResources.with(arraylist)).call();
        storePostResources.call(set);
    }

    private transient Set getSetDifference(Set set, Set aset[])
    {
        TreeSet treeset = new TreeSet(PostProperty.COMPARATOR);
        treeset.addAll(set);
        int j = aset.length;
        for (int i = 0; i < j; i++)
        {
            treeset.removeAll(aset[i]);
        }

        return treeset;
    }

    private void publishStateChanged(Set set, Set set1)
    {
        java.util.HashSet hashset = Sets.newHashSetWithExpectedSize(set.size() + set1.size());
        hashset.addAll(createChangedEntities(set, true));
        hashset.addAll(createChangedEntities(set1, false));
        if (!hashset.isEmpty())
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromSync(hashset));
        }
    }

    private void removeRecentPosts(Set set, List list)
    {
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            if (list.contains(((PropertySet)set.next()).get(PostProperty.TARGET_URN)))
            {
                set.remove();
            }
        } while (true);
    }

    public Boolean call()
        throws Exception
    {
        return call(Collections.emptyList());
    }

    public Boolean call(List list)
        throws Exception
    {
        Object obj = new TreeSet(PostProperty.COMPARATOR);
        ((Set) (obj)).addAll(loadLocalPosts.call());
        NavigableSet navigableset = fetchRemotePosts.call();
        (new StringBuilder("Syncing Posts : Local Count = ")).append(((Set) (obj)).size()).append(" , Remote Count = ").append(navigableset.size());
        Set set = getSetDifference(navigableset, new Set[] {
            obj
        });
        obj = getSetDifference(((Set) (obj)), new Set[] {
            navigableset
        });
        removeRecentPosts(set, list);
        removeRecentPosts(((Set) (obj)), list);
        if (set.isEmpty() && ((Set) (obj)).isEmpty())
        {
            return Boolean.valueOf(false);
        }
        if (!((Set) (obj)).isEmpty())
        {
            (new StringBuilder("Removing items ")).append(TextUtils.join(",", ((Iterable) (obj))));
            removePostsCommand.call(obj);
        }
        if (!set.isEmpty())
        {
            (new StringBuilder("Adding items ")).append(TextUtils.join(",", set));
            fetchResourcesForAdditions(set);
            storePostsCommand.call(set);
        }
        publishStateChanged(set, ((Set) (obj)));
        return Boolean.valueOf(true);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }
}
