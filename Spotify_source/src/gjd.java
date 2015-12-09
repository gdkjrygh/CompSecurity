// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.tracking.ViewLoadTimerMessage;

public final class gjd
{

    boolean a;
    boolean b;
    String c;
    private final String d;
    private final String e;
    private final long f;

    private gjd(String s, String s1, long l)
    {
        d = s;
        e = s1;
        f = l;
        a = false;
        b = false;
    }

    public gjd(String s, String s1, long l, byte byte0)
    {
        this(s, s1, l);
    }

    public final ViewLoadTimerMessage a()
    {
        return new ViewLoadTimerMessage(d, a, b, e, f, c, (byte)0);
    }
}
