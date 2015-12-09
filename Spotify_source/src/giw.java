// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.graphics.SpotifyIcon;

public final class giw
{

    String a;
    int b;
    int c;
    int d;
    SpotifyIcon e;
    int f;
    giv g;

    public giw()
    {
    }

    public final giu a()
    {
        boolean flag1 = true;
        geh.a(a, "Showcase's id not set");
        boolean flag;
        if (b > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Showcase's title resource not set");
        if (c > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Showcase's description resource not set");
        if (f > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Showcase's image resource not set");
        ctz.a(g);
        return new giu(a, b, c, d, e, f, g);
    }
}
