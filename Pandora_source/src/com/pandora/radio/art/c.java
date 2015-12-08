// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.art;

import java.io.InputStream;
import p.df.a;
import p.k.m;
import p.l.i;
import p.p.b;
import p.x.d;

public class c extends b
{

    public c(m m, d d1, p.p.a a1)
    {
        super(m, d1, a1);
    }

    private void d()
        throws InterruptedException
    {
        for (; p.cw.c.z != null && !p.cw.c.z.D(); Thread.sleep(250L))
        {
            p.df.a.d("PandoraVolleyStreamFetcher", "Sleeping - Can't download non music resources.");
        }

    }

    public InputStream a(i j)
        throws Exception
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[i.values().length];
                try
                {
                    a[i.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[i.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[i.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[i.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.radio.art._cls1.a[j.ordinal()])
        {
        default:
            d();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return super.a(j);
        }
    }

    public Object b(i j)
        throws Exception
    {
        return a(j);
    }
}
