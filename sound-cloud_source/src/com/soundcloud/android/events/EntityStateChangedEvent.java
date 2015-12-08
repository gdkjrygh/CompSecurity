// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import android.support.v4.util.ArrayMap;
import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.events:
//            UrnEvent, AutoValue_EntityStateChangedEvent

public abstract class EntityStateChangedEvent
    implements UrnEvent
{

    public static final int ENTITY_SYNCED = 0;
    public static final int FOLLOWING = 7;
    public static final f IS_OFFLINE_LIKES_EVENT_FILTER = new _cls4();
    public static final f IS_PLAYLIST_CONTENT_CHANGED_FILTER = new _cls10();
    public static final f IS_PLAYLIST_LIKED_FILTER = new _cls6();
    public static final f IS_PLAYLIST_OFFLINE_CONTENT_EVENT_FILTER = new _cls3();
    public static final f IS_PLAYLIST_UNLIKED_FILTER = new _cls8();
    public static final f IS_TRACK_ADDED_TO_PLAYLIST_FILTER = new _cls9();
    public static final f IS_TRACK_FILTER = new _cls1();
    public static final f IS_TRACK_LIKED_FILTER = new _cls5();
    public static final f IS_TRACK_LIKE_EVENT_FILTER = new _cls2();
    public static final f IS_TRACK_UNLIKED_FILTER = new _cls7();
    public static final int LIKE = 2;
    public static final int MARKED_FOR_OFFLINE = 4;
    public static final int PLAYLIST_CREATED = 8;
    public static final int REPOST = 3;
    public static final f TO_SINGULAR_CHANGE = new _cls12();
    public static final f TO_URN = new _cls11();
    public static final int TRACK_ADDED_TO_PLAYLIST = 5;
    public static final int TRACK_REMOVED_FROM_PLAYLIST = 6;

    public EntityStateChangedEvent()
    {
    }

    static EntityStateChangedEvent create(int i, PropertySet propertyset)
    {
        return create(i, ((Collection) (Collections.singleton(propertyset))));
    }

    static EntityStateChangedEvent create(int i, Collection collection)
    {
        ArrayMap arraymap = new ArrayMap(collection.size());
        PropertySet propertyset;
        for (collection = collection.iterator(); collection.hasNext(); arraymap.put(propertyset.get(EntityProperty.URN), propertyset))
        {
            propertyset = (PropertySet)collection.next();
        }

        return new AutoValue_EntityStateChangedEvent(i, arraymap);
    }

    public static EntityStateChangedEvent fromFollowing(PropertySet propertyset)
    {
        return create(7, propertyset);
    }

    public static EntityStateChangedEvent fromLike(Urn urn, boolean flag, int i)
    {
        return create(2, PropertySet.from(new PropertyBinding[] {
            PlayableProperty.URN.bind(urn), PlayableProperty.IS_LIKED.bind(Boolean.valueOf(flag)), PlayableProperty.LIKES_COUNT.bind(Integer.valueOf(i))
        }));
    }

    public static EntityStateChangedEvent fromLike(PropertySet propertyset)
    {
        return create(2, propertyset);
    }

    public static EntityStateChangedEvent fromLikesMarkedForOffline(boolean flag)
    {
        return create(4, PropertySet.from(new PropertyBinding[] {
            PlayableProperty.URN.bind(Urn.NOT_SET), com.soundcloud.android.offline.OfflineProperty.Collection.OFFLINE_LIKES.bind(Boolean.valueOf(flag))
        }));
    }

    public static EntityStateChangedEvent fromMarkedForOffline(Urn urn, boolean flag)
    {
        return create(4, PropertySet.from(new PropertyBinding[] {
            PlayableProperty.URN.bind(urn), com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE.bind(Boolean.valueOf(flag))
        }));
    }

    public static EntityStateChangedEvent fromPlaylistCreated(Urn urn)
    {
        return create(8, PropertySet.from(new PropertyBinding[] {
            PlaylistProperty.URN.bind(urn)
        }));
    }

    public static EntityStateChangedEvent fromRepost(Urn urn, boolean flag)
    {
        return fromRepost(PropertySet.from(new PropertyBinding[] {
            PlayableProperty.URN.bind(urn), PlayableProperty.IS_REPOSTED.bind(Boolean.valueOf(flag))
        }));
    }

    public static EntityStateChangedEvent fromRepost(PropertySet propertyset)
    {
        return create(3, propertyset);
    }

    public static EntityStateChangedEvent fromSync(PropertySet propertyset)
    {
        return create(0, Collections.singleton(propertyset));
    }

    public static EntityStateChangedEvent fromSync(Collection collection)
    {
        return create(0, collection);
    }

    public static EntityStateChangedEvent fromTrackAddedToPlaylist(Urn urn, int i)
    {
        return fromTrackAddedToPlaylist(PropertySet.from(new PropertyBinding[] {
            PlayableProperty.URN.bind(urn), PlaylistProperty.TRACK_COUNT.bind(Integer.valueOf(i))
        }));
    }

    public static EntityStateChangedEvent fromTrackAddedToPlaylist(PropertySet propertyset)
    {
        return create(5, propertyset);
    }

    public static EntityStateChangedEvent fromTrackRemovedFromPlaylist(PropertySet propertyset)
    {
        return create(6, propertyset);
    }

    private boolean isOfflineLikesEvent()
    {
        return getKind() == 4 && getNextChangeSet().contains(com.soundcloud.android.offline.OfflineProperty.Collection.OFFLINE_LIKES);
    }

    private boolean isTrackAddedEvent()
    {
        return getKind() == 5;
    }

    private boolean isTrackRemovedEvent()
    {
        return getKind() == 6;
    }

    public abstract Map getChangeMap();

    public Urn getFirstUrn()
    {
        return (Urn)getChangeMap().keySet().iterator().next();
    }

    public abstract int getKind();

    public PropertySet getNextChangeSet()
    {
        return (PropertySet)getChangeMap().values().iterator().next();
    }

    public boolean isLike()
    {
        return isSingularChange() && getKind() == 2;
    }

    public boolean isPlaylistLike()
    {
        return isSingularChange() && getFirstUrn().isPlaylist() && getKind() == 2;
    }

    public boolean isSingularChange()
    {
        return getChangeMap().size() == 1;
    }

    public boolean isTrackLikeEvent()
    {
        return isSingularChange() && getFirstUrn().isTrack() && getKind() == 2;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("kind", getKind()).add("changeMap", getChangeMap()).toString();
    }





    private class _cls1
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.isSingularChange() && entitystatechangedevent.getFirstUrn().isTrack())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            return Boolean.valueOf(entitystatechangedevent.isTrackLikeEvent());
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.isSingularChange() && entitystatechangedevent.getFirstUrn().isPlaylist() && entitystatechangedevent.getKind() == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls3()
        {
        }
    }


    private class _cls4
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            return Boolean.valueOf(entitystatechangedevent.isOfflineLikesEvent());
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls4()
        {
        }
    }


    private class _cls5
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.isTrackLikeEvent() && ((Boolean)entitystatechangedevent.getNextChangeSet().get(TrackProperty.IS_LIKED)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls5()
        {
        }
    }


    private class _cls6
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.isPlaylistLike() && ((Boolean)entitystatechangedevent.getNextChangeSet().get(PlaylistProperty.IS_LIKED)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls6()
        {
        }
    }


    private class _cls7
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.isTrackLikeEvent() && !((Boolean)entitystatechangedevent.getNextChangeSet().get(TrackProperty.IS_LIKED)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls7()
        {
        }
    }


    private class _cls8
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.isPlaylistLike() && !((Boolean)entitystatechangedevent.getNextChangeSet().get(PlaylistProperty.IS_LIKED)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls8()
        {
        }
    }


    private class _cls9
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            return Boolean.valueOf(entitystatechangedevent.isTrackAddedEvent());
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls9()
        {
        }
    }


    private class _cls10
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.isTrackAddedEvent() || entitystatechangedevent.isTrackRemovedEvent())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls10()
        {
        }
    }


    private class _cls11
        implements f
    {

        public final Urn call(EntityStateChangedEvent entitystatechangedevent)
        {
            return entitystatechangedevent.getFirstUrn();
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls11()
        {
        }
    }


    private class _cls12
        implements f
    {

        public final PropertySet call(EntityStateChangedEvent entitystatechangedevent)
        {
            return entitystatechangedevent.getNextChangeSet();
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls12()
        {
        }
    }

}
