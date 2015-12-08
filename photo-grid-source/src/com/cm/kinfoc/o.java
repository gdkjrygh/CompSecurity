// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.cm.kinfoc:
//            p, n

public final class o
{

    private static o a = null;
    private p b;
    private int c;
    private int d;
    private String e;
    private String f;
    private n g;
    private volatile boolean h;
    private final Object i = new Object();
    private Timer j;
    private TimerTask k;
    private final Object l = new Object();

    public o()
    {
        b = new p();
        c = -1;
        d = 0;
        e = null;
        f = null;
        g = null;
        h = false;
        j = null;
        k = null;
    }

    public static o a()
    {
        if (a == null)
        {
            a = new o();
        }
        return a;
    }

    public final void a(n n, String s, int i1, int j1, String s1)
    {
        g = n;
        c = i1;
        d = j1;
        e = s1;
        f = s;
    }

}
