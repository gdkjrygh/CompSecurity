// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.timeline.TimelineMarker;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            Ad, PlacementInformation

public final class AdBreak
    implements TimelineMarker, Comparable
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type MID_ROLL;
        public static final Type POST_ROLL;
        public static final Type PRE_ROLL;
        public static final Type UNKNOWN;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/adobe/mediacore/timeline/advertising/AdBreak$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            PRE_ROLL = new Type("PRE_ROLL", 0);
            MID_ROLL = new Type("MID_ROLL", 1);
            POST_ROLL = new Type("POST_ROLL", 2);
            UNKNOWN = new Type("UNKNOWN", 3);
            $VALUES = (new Type[] {
                PRE_ROLL, MID_ROLL, POST_ROLL, UNKNOWN
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int REPLACE_DURATION_ALLOWED_VARIATION = 2000;
    private static final boolean USE_REPLACE_DURATION_FROM_CUE_DURATION = false;
    private final List _ads;
    private final long _duration = calculateBreakDuration();
    private Boolean _isWatched;
    private long _localTime;
    private final long _replaceDuration;
    private String _restoreId;
    private final String _tag;
    private long _time;
    private Type _type;

    private AdBreak(List list, long l, long l1, String s)
    {
        _ads = list;
        _time = l;
        _replaceDuration = l1;
        _tag = s;
        _isWatched = Boolean.valueOf(false);
        _restoreId = null;
        _localTime = -1L;
        _type = Type.UNKNOWN;
    }

    private long calculateBreakDuration()
    {
        long l1 = 0L;
        long l = l1;
        if (_ads != null)
        {
            l = l1;
            if (!_ads.isEmpty())
            {
                Iterator iterator = _ads.iterator();
                for (l = 0L; iterator.hasNext(); l = ((Ad)iterator.next()).getDuration() + l) { }
            }
        }
        return l;
    }

    public static AdBreak createAdBreak(List list, long l, long l1, String s)
    {
        return new AdBreak(list, l, l1, s);
    }

    public Iterator adsIterator()
    {
        return _ads.iterator();
    }

    public AdBreak cloneFor(PlacementInformation placementinformation)
    {
        long l = getDuration();
        return new AdBreak(_ads, placementinformation.getTime(), l, _tag);
    }

    public int compareTo(AdBreak adbreak)
    {
        if (_time < adbreak.getTime())
        {
            return -1;
        }
        return _time != adbreak.getTime() ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((AdBreak)obj);
    }

    public Ad getAdForContentId(int i)
    {
        for (Iterator iterator = _ads.iterator(); iterator.hasNext();)
        {
            Ad ad = (Ad)iterator.next();
            if (ad.getId() == i)
            {
                return ad;
            }
        }

        return null;
    }

    public long getDuration()
    {
        return _duration;
    }

    public Ad getFirstAd()
    {
        Iterator iterator;
        for (iterator = adsIterator(); iterator == null || !iterator.hasNext();)
        {
            return null;
        }

        return (Ad)iterator.next();
    }

    public long getInitialReplaceDuration()
    {
        return _replaceDuration;
    }

    public Ad getLastAd()
    {
        Iterator iterator = adsIterator();
        if (iterator == null)
        {
            return null;
        }
        while (iterator.hasNext()) 
        {
            Ad ad = (Ad)iterator.next();
            if (!iterator.hasNext())
            {
                return ad;
            }
        }
        return null;
    }

    public long getLocalTime()
    {
        return _localTime;
    }

    public long getReplaceDuration()
    {
        long l1 = _replaceDuration;
        long l = l1;
        if (l1 > 0L)
        {
            l = Math.min(_replaceDuration + 2000L, _duration);
        }
        return l;
    }

    public String getRestoreId()
    {
        return _restoreId;
    }

    public String getTag()
    {
        return _tag;
    }

    public long getTime()
    {
        return _time;
    }

    public Type getType()
    {
        return _type;
    }

    public boolean isValid()
    {
        return _replaceDuration <= 0L || _replaceDuration + 2000L >= _duration;
    }

    public Boolean isWatched()
    {
        return _isWatched;
    }

    public void setIsWatched(Boolean boolean1)
    {
        _isWatched = boolean1;
    }

    public void setLocalTime(long l)
    {
        _localTime = l;
    }

    public void setRestoreId(String s)
    {
        _restoreId = s;
    }

    public void setType(Type type)
    {
        if (_type == Type.UNKNOWN)
        {
            _type = type;
        }
    }

    public long size()
    {
        if (_ads != null)
        {
            return (long)_ads.size();
        } else
        {
            return 0L;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append(" Object {");
        stringbuilder.append(" ad count=").append(_ads.size());
        stringbuilder.append(" ,type=").append(_type);
        stringbuilder.append(" ,time=").append(_time);
        stringbuilder.append(" ,local time=").append(_localTime);
        stringbuilder.append(" ,duration=").append(_duration);
        stringbuilder.append(" ,replace duration=").append(_replaceDuration);
        stringbuilder.append(" ,tag=").append(_tag);
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
