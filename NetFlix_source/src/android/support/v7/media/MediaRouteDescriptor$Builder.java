// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouteDescriptor

public static final class setName
{

    private final Bundle mBundle;
    private ArrayList mControlFilters;

    public setName addControlFilter(IntentFilter intentfilter)
    {
        if (intentfilter == null)
        {
            throw new IllegalArgumentException("filter must not be null");
        }
        if (mControlFilters == null)
        {
            mControlFilters = new ArrayList();
        }
        if (!mControlFilters.contains(intentfilter))
        {
            mControlFilters.add(intentfilter);
        }
        return this;
    }

    public mControlFilters addControlFilters(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); addControlFilter((IntentFilter)collection.next())) { }
        }
        return this;
    }

    public MediaRouteDescriptor build()
    {
        if (mControlFilters != null)
        {
            mBundle.putParcelableArrayList("controlFilters", mControlFilters);
        }
        return new MediaRouteDescriptor(mBundle, mControlFilters, null);
    }

    public mControlFilters setConnecting(boolean flag)
    {
        mBundle.putBoolean("connecting", flag);
        return this;
    }

    public mBundle setDescription(String s)
    {
        mBundle.putString("status", s);
        return this;
    }

    public mBundle setEnabled(boolean flag)
    {
        mBundle.putBoolean("enabled", flag);
        return this;
    }

    public mBundle setExtras(Bundle bundle)
    {
        mBundle.putBundle("extras", bundle);
        return this;
    }

    public mBundle setId(String s)
    {
        mBundle.putString("id", s);
        return this;
    }

    public mBundle setName(String s)
    {
        mBundle.putString("name", s);
        return this;
    }

    public mBundle setPlaybackStream(int i)
    {
        mBundle.putInt("playbackStream", i);
        return this;
    }

    public mBundle setPlaybackType(int i)
    {
        mBundle.putInt("playbackType", i);
        return this;
    }

    public mBundle setPresentationDisplayId(int i)
    {
        mBundle.putInt("presentationDisplayId", i);
        return this;
    }

    public mBundle setVolume(int i)
    {
        mBundle.putInt("volume", i);
        return this;
    }

    public mBundle setVolumeHandling(int i)
    {
        mBundle.putInt("volumeHandling", i);
        return this;
    }

    public mBundle setVolumeMax(int i)
    {
        mBundle.putInt("volumeMax", i);
        return this;
    }

    public (MediaRouteDescriptor mediaroutedescriptor)
    {
        if (mediaroutedescriptor == null)
        {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        mBundle = new Bundle(MediaRouteDescriptor.access$000(mediaroutedescriptor));
        MediaRouteDescriptor.access$100(mediaroutedescriptor);
        if (!MediaRouteDescriptor.access$200(mediaroutedescriptor).isEmpty())
        {
            mControlFilters = new ArrayList(MediaRouteDescriptor.access$200(mediaroutedescriptor));
        }
    }

    public _cls00(String s, String s1)
    {
        mBundle = new Bundle();
        setId(s);
        setName(s1);
    }
}
