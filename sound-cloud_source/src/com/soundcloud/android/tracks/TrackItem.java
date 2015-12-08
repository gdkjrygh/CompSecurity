// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.offline.OfflineProperty;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackProperty

public class TrackItem extends PlayableItem
{

    private boolean isPlaying;

    public TrackItem(PropertySet propertyset)
    {
        super(propertyset);
    }

    public static TrackItem from(ApiTrack apitrack)
    {
        return new TrackItem(apitrack.toPropertySet());
    }

    public static TrackItem from(PropertySet propertyset)
    {
        return new TrackItem(propertyset);
    }

    public static f fromApiTracks()
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
        return (obj instanceof TrackItem) && ((TrackItem)obj).source.equals(source);
    }

    public OfflineState getDownloadedState()
    {
        return (OfflineState)source.getOrElse(OfflineProperty.OFFLINE_STATE, OfflineState.NO_OFFLINE);
    }

    public long getDuration()
    {
        return ((Long)source.get(TrackProperty.DURATION)).longValue();
    }

    String getGenre()
    {
        return (String)((Optional)source.get(TrackProperty.GENRE)).or("");
    }

    public int getPlayCount()
    {
        return ((Integer)source.getOrElse(TrackProperty.PLAY_COUNT, Integer.valueOf(-1))).intValue();
    }

    public boolean hasPlayCount()
    {
        return getPlayCount() > 0;
    }

    public int hashCode()
    {
        return source.hashCode();
    }

    public boolean isMidTier()
    {
        return ((Boolean)source.getOrElse(TrackProperty.SUB_MID_TIER, Boolean.valueOf(false))).booleanValue();
    }

    public boolean isPlaying()
    {
        return isPlaying;
    }

    public boolean isUnavailableOffline()
    {
        return getDownloadedState() == OfflineState.UNAVAILABLE;
    }

    public void setIsPlaying(boolean flag)
    {
        isPlaying = flag;
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
            for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(TrackItem.from(((ApiTrack)iterable.next()).toPropertySet()))) { }
            return arraylist;
        }

        _cls3()
        {
        }
    }


    private class _cls1
        implements f
    {

        public final TrackItem call(PropertySet propertyset)
        {
            return TrackItem.from(propertyset);
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
            for (list = list.iterator(); list.hasNext(); arraylist.add(TrackItem.from((PropertySet)list.next()))) { }
            return arraylist;
        }

        _cls2()
        {
        }
    }

}
