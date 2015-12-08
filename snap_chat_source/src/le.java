// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.ui.swipefilters.FilterPageType;
import java.util.Map;

public final class le
{

    private static final String TAG = "FilterMetricsProvider";

    public le()
    {
    }

    public static hs a(AA aa)
    {
        if (aa != null) goto _L2; else goto _L1
_L1:
        Timber.e("FilterMetricsProvider", "Snapbryo was null", new Object[0]);
_L4:
        return null;
_L2:
        aa = a(aa, FilterPageType.INFOFILTER);
        if (aa == null) goto _L4; else goto _L3
_L3:
        byte byte0;
        aa = ((lU) (aa)).a;
        byte0 = -1;
        aa.hashCode();
        JVM INSTR lookupswitch 3: default 76
    //                   -1406873644: 131
    //                   2606829: 145
    //                   80089127: 117;
           goto _L5 _L6 _L7 _L8
_L5:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_145;
_L9:
        switch (byte0)
        {
        default:
            Timber.e("FilterMetricsProvider", "Conversion to FilterInfoType available", new Object[0]);
            return null;

        case 0: // '\0'
            return hs.SPEED;

        case 1: // '\001'
            return hs.WEATHER;

        case 2: // '\002'
            return hs.TIMESTAMP;
        }
_L8:
        if (aa.equals("Speed"))
        {
            byte0 = 0;
        }
          goto _L9
_L6:
        if (aa.equals("Weather"))
        {
            byte0 = 1;
        }
          goto _L9
        if (aa.equals("Time"))
        {
            byte0 = 2;
        }
          goto _L9
    }

    private static lU a(AA aa, FilterPageType filterpagetype)
    {
        if (aa.mBaseFilter != null && aa.mBaseFilter.c != null && aa.mBaseFilter.c.equals(filterpagetype))
        {
            return aa.mBaseFilter;
        }
        if (aa.mStackedFilter != null && aa.mStackedFilter.c != null && aa.mStackedFilter.c.equals(filterpagetype))
        {
            return aa.mStackedFilter;
        } else
        {
            return null;
        }
    }

    public static void a(AA aa, Map map)
    {
        if (aa == null)
        {
            Timber.e("FilterMetricsProvider", "Snapbryo was null", new Object[0]);
            return;
        } else
        {
            a(aa.mBaseFilter, map);
            a(aa.mStackedFilter, map);
            return;
        }
    }

    private static void a(lU lu, Map map)
    {
        if (lu != null && lu.c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$ui$swipefilters$FilterPageType[];

            static 
            {
                $SwitchMap$com$snapchat$android$ui$swipefilters$FilterPageType = new int[FilterPageType.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$ui$swipefilters$FilterPageType[FilterPageType.GEOFILTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ui$swipefilters$FilterPageType[FilterPageType.INFOFILTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ui$swipefilters$FilterPageType[FilterPageType.BACKGROUNDFILTER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ui$swipefilters$FilterPageType[FilterPageType.VIDEO_SPEED_FILTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.snapchat.android.ui.swipefilters.FilterPageType[lu.c.ordinal()])
        {
        default:
            Timber.e("FilterMetricsProvider", (new StringBuilder("No metric set for ")).append(lu.c).toString(), new Object[0]);
            return;

        case 1: // '\001'
            break;

        case 2: // '\002'
            map.put("filter_info", lu.a);
            return;

        case 3: // '\003'
            map.put("filter_visual", lu.a);
            return;

        case 4: // '\004'
            map.put("filter_video_speed", lu.a);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static hw b(AA aa)
    {
        if (aa != null) goto _L2; else goto _L1
_L1:
        Timber.e("FilterMetricsProvider", "Snapbryo was null", new Object[0]);
_L4:
        return null;
_L2:
        aa = a(aa, FilterPageType.BACKGROUNDFILTER);
        if (aa == null) goto _L4; else goto _L3
_L3:
        byte byte0;
        aa = ((lU) (aa)).a;
        byte0 = -1;
        aa.hashCode();
        JVM INSTR lookupswitch 3: default 76
    //                   -1005110339: 145
    //                   353604011: 117
    //                   2033224965: 131;
           goto _L5 _L6 _L7 _L8
_L5:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_145;
_L9:
        switch (byte0)
        {
        default:
            Timber.e("FilterMetricsProvider", "Conversion to FilterVisualType available", new Object[0]);
            return null;

        case 0: // '\0'
            return hw.GRAYSCALE;

        case 1: // '\001'
            return hw.INSTASNAP;

        case 2: // '\002'
            return hw.MISS_ETIKATE;
        }
_L7:
        if (aa.equals("Greyscale"))
        {
            byte0 = 0;
        }
          goto _L9
_L8:
        if (aa.equals("Instasnap"))
        {
            byte0 = 1;
        }
          goto _L9
        if (aa.equals("Miss Etikate"))
        {
            byte0 = 2;
        }
          goto _L9
    }
}
