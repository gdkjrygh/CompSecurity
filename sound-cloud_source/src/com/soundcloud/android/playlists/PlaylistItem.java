// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.offline.OfflineProperty;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import java.util.Collections;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistProperty

public class PlaylistItem extends PlayableItem
{

    public PlaylistItem(PropertySet propertyset)
    {
        super(propertyset);
    }

    public static PlaylistItem from(ApiPlaylist apiplaylist)
    {
        return new PlaylistItem(apiplaylist.toPropertySet());
    }

    public static PlaylistItem from(PropertySet propertyset)
    {
        return new PlaylistItem(propertyset);
    }

    public static f fromApiPlaylists()
    {
        return new _cls3();
    }

    public static f fromPropertySet()
    {
        return new _cls1();
    }

    public static f fromPropertySets()
    {
        return new _cls2();
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof PlaylistItem) && ((PlaylistItem)obj).source.equals(source);
    }

    public OfflineState getDownloadState()
    {
        if (source.contains(com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE) && !((Boolean)source.get(com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE)).booleanValue())
        {
            return OfflineState.NO_OFFLINE;
        } else
        {
            return (OfflineState)source.getOrElse(OfflineProperty.OFFLINE_STATE, OfflineState.NO_OFFLINE);
        }
    }

    public long getDuration()
    {
        return ((Long)source.get(PlayableProperty.DURATION)).longValue();
    }

    public List getTags()
    {
        Optional optional = (Optional)source.get(PlaylistProperty.TAGS);
        if (optional.isPresent())
        {
            return (List)optional.get();
        } else
        {
            return Collections.emptyList();
        }
    }

    public int getTrackCount()
    {
        return ((Integer)source.get(PlaylistProperty.TRACK_COUNT)).intValue();
    }

    public int hashCode()
    {
        return source.hashCode();
    }

    public Optional isMarkedForOffline()
    {
        return Optional.fromNullable(source.getOrElseNull(com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE));
    }

    public boolean isPosted()
    {
        return ((Boolean)source.getOrElse(PlaylistProperty.IS_POSTED, Boolean.valueOf(false))).booleanValue();
    }

    private class _cls3
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((Iterable)obj);
        }

        public final List call(Iterable iterable)
        {
            ArrayList arraylist = new ArrayList();
            for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(PlaylistItem.from(((ApiPlaylist)iterable.next()).toPropertySet()))) { }
            return arraylist;
        }

        _cls3()
        {
        }
    }


    private class _cls1
        implements f
    {

        public final PlaylistItem call(PropertySet propertyset)
        {
            return PlaylistItem.from(propertyset);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public final List call(List list)
        {
            ArrayList arraylist = new ArrayList(list.size());
            for (list = list.iterator(); list.hasNext(); arraylist.add(PlaylistItem.from((PropertySet)list.next()))) { }
            return arraylist;
        }

        _cls2()
        {
        }
    }

}
