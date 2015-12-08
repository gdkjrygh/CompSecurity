// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.commands.BulkFetchCommand;
import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.utils.PropertySetComparator;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.collections.Sets;
import com.soundcloud.propeller.PropellerWriteException;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            PushLikesCommand, StoreLikesCommand, RemoveLikesCommand, FetchLikesCommand, 
//            LoadLikesCommand, LoadLikesPendingAdditionCommand, LoadLikesPendingRemovalCommand

public class LikesSyncer
    implements Callable
{

    private static final Comparator LIKES_COMPARATOR;
    private final EventBus eventBus;
    private final BulkFetchCommand fetchLikedResources;
    private final FetchLikesCommand fetchLikes;
    private final LoadLikesCommand loadLikes;
    private final LoadLikesPendingAdditionCommand loadLikesPendingAddition;
    private final LoadLikesPendingRemovalCommand loadLikesPendingRemoval;
    private final PushLikesCommand pushLikeAdditions;
    private final PushLikesCommand pushLikeDeletions;
    private final RemoveLikesCommand removeLikes;
    private final DefaultWriteStorageCommand storeLikedResources;
    private final StoreLikesCommand storeLikes;

    LikesSyncer(FetchLikesCommand fetchlikescommand, BulkFetchCommand bulkfetchcommand, PushLikesCommand pushlikescommand, PushLikesCommand pushlikescommand1, LoadLikesCommand loadlikescommand, LoadLikesPendingAdditionCommand loadlikespendingadditioncommand, LoadLikesPendingRemovalCommand loadlikespendingremovalcommand, 
            DefaultWriteStorageCommand defaultwritestoragecommand, StoreLikesCommand storelikescommand, RemoveLikesCommand removelikescommand, EventBus eventbus)
    {
        fetchLikes = fetchlikescommand;
        pushLikeAdditions = pushlikescommand;
        pushLikeDeletions = pushlikescommand1;
        loadLikes = loadlikescommand;
        loadLikesPendingAddition = loadlikespendingadditioncommand;
        loadLikesPendingRemoval = loadlikespendingremovalcommand;
        removeLikes = removelikescommand;
        fetchLikedResources = bulkfetchcommand;
        storeLikedResources = defaultwritestoragecommand;
        storeLikes = storelikescommand;
        eventBus = eventbus;
    }

    private Set createChangedEntities(Set set, boolean flag)
    {
        HashSet hashset = Sets.newHashSetWithExpectedSize(set.size());
        PropertySet propertyset;
        for (set = set.iterator(); set.hasNext(); hashset.add(PropertySet.from(new PropertyBinding[] {
    PlayableProperty.URN.bind(propertyset.get(PlayableProperty.URN)), PlayableProperty.IS_LIKED.bind(Boolean.valueOf(flag))
})))
        {
            propertyset = (PropertySet)set.next();
        }

        return hashset;
    }

    private void fetchAndWriteNewLikedEntities(Set set)
        throws Exception
    {
        if (!set.isEmpty())
        {
            ArrayList arraylist = new ArrayList(set.size());
            for (set = set.iterator(); set.hasNext(); arraylist.add(((PropertySet)set.next()).get(LikeProperty.TARGET_URN))) { }
            set = ((BulkFetchCommand)fetchLikedResources.with(arraylist)).call();
            storeLikedResources.call(set);
        }
    }

    private transient Set getSetDifference(Set set, Set aset[])
    {
        TreeSet treeset = new TreeSet(LIKES_COMPARATOR);
        treeset.addAll(set);
        int j = aset.length;
        for (int i = 0; i < j; i++)
        {
            treeset.removeAll(aset[i]);
        }

        return treeset;
    }

    private Set getSetIntersection(Set set, Set set1)
    {
        TreeSet treeset = new TreeSet(LIKES_COMPARATOR);
        treeset.addAll(set);
        treeset.retainAll(set1);
        return treeset;
    }

    private void publishStateChanged(Set set, Set set1)
    {
        HashSet hashset = Sets.newHashSetWithExpectedSize(set.size() + set1.size());
        hashset.addAll(createChangedEntities(set, true));
        hashset.addAll(createChangedEntities(set1, false));
        if (!hashset.isEmpty())
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromSync(hashset));
        }
    }

    private void pushPendingAdditionsToApi(Set set, Set set1)
        throws Exception
    {
        if (!set.isEmpty())
        {
            set1.addAll(((PushLikesCommand)pushLikeAdditions.with(set)).call());
        }
    }

    private void pushPendingRemovalsToApi(Set set, Set set1)
        throws Exception
    {
        if (!set.isEmpty())
        {
            set1.addAll(((PushLikesCommand)pushLikeDeletions.with(set)).call());
        }
    }

    private void writePendingAdditionsToLocalStorage(Set set)
        throws PropellerWriteException
    {
        if (!set.isEmpty())
        {
            storeLikes.call(set);
        }
    }

    private void writePendingRemovalsToLocalStorage(Set set)
        throws PropellerWriteException
    {
        if (!set.isEmpty())
        {
            removeLikes.call(set);
        }
    }

    public Boolean call()
        throws Exception
    {
        boolean flag = false;
        Object obj = fetchLikes.call();
        Object obj1 = new TreeSet(LIKES_COMPARATOR);
        ((Set) (obj1)).addAll(loadLikes.call());
        Object obj2 = new TreeSet(LIKES_COMPARATOR);
        ((Set) (obj2)).addAll(loadLikesPendingAddition.call());
        TreeSet treeset = new TreeSet(LIKES_COMPARATOR);
        treeset.addAll(loadLikesPendingRemoval.call());
        Set set = getSetDifference(((Set) (obj2)), new Set[] {
            obj
        });
        Set set1 = getSetDifference(((Set) (obj)), new Set[] {
            obj1, treeset
        });
        obj1 = getSetDifference(getSetDifference(((Set) (obj1)), new Set[] {
            obj2
        }), new Set[] {
            obj
        });
        obj2 = new HashSet(set1);
        HashSet hashset = new HashSet(((java.util.Collection) (obj1)));
        hashset.addAll(getSetDifference(treeset, new Set[] {
            obj
        }));
        obj = getSetIntersection(treeset, ((Set) (obj)));
        pushPendingAdditionsToApi(set, ((Set) (obj2)));
        pushPendingRemovalsToApi(((Set) (obj)), hashset);
        writePendingRemovalsToLocalStorage(hashset);
        fetchAndWriteNewLikedEntities(getSetDifference(((Set) (obj2)), new Set[] {
            set
        }));
        writePendingAdditionsToLocalStorage(((Set) (obj2)));
        publishStateChanged(set1, ((Set) (obj1)));
        if (!((Set) (obj2)).isEmpty() || !hashset.isEmpty())
        {
            flag = true;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    static 
    {
        LIKES_COMPARATOR = new PropertySetComparator(LikeProperty.TARGET_URN);
    }
}
