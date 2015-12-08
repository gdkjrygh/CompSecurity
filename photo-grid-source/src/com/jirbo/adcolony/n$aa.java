// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            a, d, o, b, 
//            q, l

class ta.g
{

    boolean a;
    int b;
    int c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    double k;
     l;
     m;
     n;
     o;

    boolean a()
    {
        if (a)
        {
            if (!a.l.c.a(d))
            {
                return false;
            }
            if (!l.())
            {
                return false;
            }
            if (!m.())
            {
                return false;
            }
            if (!o.())
            {
                return false;
            }
            if (!n.())
            {
                return false;
            }
            if (a.l.b.j..equals("online") && !q.c())
            {
                a.ac = 9;
                return l.c.b("Video not ready due to VIEW_FILTER_ONLINE");
            }
            if (a.l.b.j..equals("wifi") && !q.a())
            {
                a.ac = 9;
                return l.c.b("Video not ready due to VIEW_FILTER_WIFI");
            }
            if (a.l.b.j..equals("cell") && !q.b())
            {
                a.ac = 9;
                return l.c.b("Video not ready due to VIEW_FILTER_CELL");
            }
            if (a.l.b.j..equals("offline") && q.c())
            {
                a.ac = 9;
                return l.c.b("Video not ready due to VIEW_FILTER_OFFLINE");
            }
        }
        return true;
    }

    boolean a(ta.g g1)
    {
        if (g1 != null)
        {
            a = g1.h("enabled");
            if (!a)
            {
                return true;
            }
            b = g1.g("width");
            c = g1.g("height");
            d = g1.e("url");
            e = g1.e("last_modified");
            f = g1.e("video_frame_rate");
            g = g1.e("audio_channels");
            h = g1.e("audio_codec");
            i = g1.e("audio_sample_rate");
            j = g1.e("video_codec");
            k = g1.f("duration");
            l = new init>();
            if (l.(g1.b("skip_video")))
            {
                m = new init>();
                if (m.(g1.b("in_video_engagement")))
                {
                    o = new init>();
                    if (o.(g1.b("haptic")))
                    {
                        n = new init>();
                        if (n.(g1.b("in_video_engagement").b("image_overlay")))
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    String b()
    {
        return a.l.c.b(d);
    }

    void c()
    {
        a.l.c.a(d, e);
        m.();
        l.();
        o.();
        n.();
    }

    ta.g()
    {
    }
}
