// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.ArrayList;

public final class kC
{

    public String a;
    public String b;
    public ArrayList c;
    public ArrayList d;

    public kC(String s, String s1)
    {
        a = s;
        b = s1;
        if (c == null)
        {
            c = new ArrayList();
            d = new ArrayList();
        } else
        {
            c.clear();
            d.clear();
        }
        a(null);
    }

    public static void a(String s, String s1, long l)
    {
        Lw.a(com.snapchat.android.Timber.LogType.DEBUG.name(), s, s1, l);
    }

    public final void a(String s)
    {
        long l = SystemClock.elapsedRealtime();
        c.add(Long.valueOf(l));
        d.add(s);
    }
}
