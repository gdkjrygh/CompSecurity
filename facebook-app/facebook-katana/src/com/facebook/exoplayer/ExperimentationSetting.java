// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import java.util.Map;

public class ExperimentationSetting
{

    public static String a = "dash.audio_buffer_segment_num";
    public static String b = "dash.video_buffer_segment_num";
    public static String c = "dash.enable_abr";
    public static String d = "dash.buffer_segment_size";
    public static String e = "video.buffer_segment_size";
    public static String f = "video.buffer_segments_num";
    public static String g = "video.min_buffer_ms";
    public static String h = "video.min_rebuffer_ms";

    public ExperimentationSetting()
    {
    }

    public static int a(Map map)
    {
        if (map.containsKey(a))
        {
            return Integer.parseInt((String)map.get(a));
        } else
        {
            return 60;
        }
    }

    public static int b(Map map)
    {
        if (map.containsKey(b))
        {
            return Integer.parseInt((String)map.get(b));
        } else
        {
            return 200;
        }
    }

    public static boolean c(Map map)
    {
        if (map.containsKey(c))
        {
            return Integer.parseInt((String)map.get(c)) != 0;
        } else
        {
            return false;
        }
    }

    public static int d(Map map)
    {
        if (map.containsKey(d))
        {
            return Integer.parseInt((String)map.get(d));
        } else
        {
            return 0x10000;
        }
    }

    public static int e(Map map)
    {
        if (map.containsKey(e))
        {
            return Integer.parseInt((String)map.get(e));
        } else
        {
            return 0x10000;
        }
    }

    public static int f(Map map)
    {
        if (map.containsKey(f))
        {
            return Integer.parseInt((String)map.get(f));
        } else
        {
            return 32;
        }
    }

    public static int g(Map map)
    {
        if (map.containsKey(g))
        {
            return Integer.parseInt((String)map.get(g));
        } else
        {
            return 500;
        }
    }

    public static int h(Map map)
    {
        if (map.containsKey(h))
        {
            return Integer.parseInt((String)map.get(h));
        } else
        {
            return 2000;
        }
    }

}
