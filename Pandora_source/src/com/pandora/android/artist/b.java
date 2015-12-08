// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.y;
import p.cw.c;

public class b
{

    public static boolean a()
    {
        return c() == com.pandora.radio.data.ai.a.a;
    }

    public static boolean a(y y1)
    {
        return c() != com.pandora.radio.data.ai.a.a && y1.I();
    }

    public static boolean b()
    {
        boolean flag1 = true;
        boolean flag = false;
        com.pandora.radio.data.ai.a a1 = c();
        af af1 = com.pandora.android.provider.b.a.d();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.radio.data.ai.a.values().length];
                try
                {
                    a[com.pandora.radio.data.ai.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.radio.data.ai.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.ai.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.ai.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown ArtistEnabledState ").append(a1).toString());

        case 2: // '\002'
            if (af1 == null)
            {
                throw new IllegalStateException("User required, to check user artist message settings");
            }
            if (!af1.i())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            // fall through

        case 1: // '\001'
        case 4: // '\004'
            return flag;

        case 3: // '\003'
            return true;
        }
    }

    private static com.pandora.radio.data.ai.a c()
    {
        return com.pandora.android.provider.b.a.b().k().t().v();
    }
}
