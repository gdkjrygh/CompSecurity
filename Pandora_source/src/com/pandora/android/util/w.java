// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import com.pandora.android.provider.b;
import java.security.InvalidParameterException;
import p.bz.q;
import p.cw.c;
import p.dd.ag;
import p.dd.aj;
import p.dg.i;

public class w
{

    private static volatile w a;
    private boolean b;

    private w()
    {
        b = false;
        b.a.e().c(this);
        b.a.b().b(this);
    }

    private static void a()
    {
        if (a == null)
        {
            a = new w();
        }
    }

    public static void a(String s, String s1, Runnable runnable)
    {
        a();
        b.a.b().f().a(s, s1, b.a.h(), runnable);
    }

    private void b()
    {
        if (b)
        {
            b.a.b().d().a(p.cw.b.c.a);
            b = false;
        }
    }

    private void c()
    {
        if (b.a.b().d().o())
        {
            b.a.b().d().b(p.cw.b.c.a);
            b = true;
        }
    }

    public void onPlayerStateChangeEvent(ag ag1)
    {
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.cw.b.a.values().length];
                try
                {
                    b[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.cw.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.cw.b.a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[p.cw.b.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[p.cw.b.a.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                a = new int[p.dd.aj.a.values().length];
                try
                {
                    a[p.dd.aj.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.aj.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.util._cls1.b[ag1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onPlayerStateChangeEvent called with unknown PlayerStateChangeEvent state: ").append(ag1.a).toString());

        case 5: // '\005'
            b.a.b().f().b();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }

    public void onSampleTrack(aj aj1)
    {
        switch (_cls1.a[aj1.a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            c();
            return;

        case 2: // '\002'
            b();
            break;
        }
    }

    public void onSleepTimerEnd(q q)
    {
        b = false;
    }
}
