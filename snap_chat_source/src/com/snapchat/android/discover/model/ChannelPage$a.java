// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import SG;
import android.graphics.Color;
import ep;
import java.util.Map;
import uA;

// Referenced classes of package com.snapchat.android.discover.model:
//            ChannelPage, MediaState

public static final class _STARTED
{

    public MediaState A;
    public MediaState B;
    public SG C;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    int f;
    int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public String q;
    public int r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public Map x;
    public MediaState y;
    public MediaState z;

    private static int a(String s1)
    {
        String s2 = s1;
        if (s1.charAt(0) != '#')
        {
            s2 = (new StringBuilder("#")).append(s1).toString();
        }
        return Color.parseColor(s2);
    }

    public final ChannelPage a()
    {
        if (a == null)
        {
            throw new uA("Cannot build ChannelPage with null publisher name.", "publisher_name");
        }
        if (d == null || d.length() == 0)
        {
            throw new uA((new StringBuilder("Cannot build ChannelPage with primary color: ")).append(d).toString(), "primary_color");
        }
        f = a(d);
        if (e == null || e.length() == 0)
        {
            throw new uA((new StringBuilder("Cannot build ChannelPage with secondary color: ")).append(e).toString(), "secondary_color");
        }
        g = a(e);
        if (h == null)
        {
            throw new uA("Cannot build ChannelPage with null filled icon URL.", "filled_icon");
        }
        if (i == null)
        {
            throw new uA("Cannot build ChannelPage with null inverted icon URL.", "inverted_icon");
        }
        if (k == null)
        {
            throw new uA("Cannot build ChannelPage with null intro video URL.", "intro_video");
        } else
        {
            return new ChannelPage(this, (byte)0);
        }
    }

    public ()
    {
        q = null;
        x = ep.a();
        y = MediaState.NOT_STARTED;
        z = MediaState.NOT_STARTED;
        A = MediaState.NOT_STARTED;
        B = MediaState.NOT_STARTED;
    }
}
