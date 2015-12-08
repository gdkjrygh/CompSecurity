// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import p.di.b;
import p.di.t;
import p.di.w;
import p.di.x;

public class ac
{

    public static void a(aa aa1)
    {
        if (aa1 != null && !aa1.M())
        {
            (new x()).execute(new Object[] {
                aa1.w()
            });
        }
    }

    public static void a(aa aa1, String s)
    {
        if (aa1 != null && !aa1.M())
        {
            (new t()).execute(new Object[] {
                Integer.valueOf(2), aa1.w(), s
            });
        }
    }

    public static void a(y y1, String s)
    {
        if (y1 != null)
        {
            (new t()).execute(new Object[] {
                Integer.valueOf(1), y1.c(), s
            });
        }
    }

    public static void b(aa aa1)
    {
        if (aa1 != null && !aa1.M())
        {
            (new b()).execute(new Object[] {
                aa1.w(), aa1.t()
            });
        }
    }

    public static void c(aa aa1)
    {
        if (aa1 != null && !aa1.M())
        {
            (new w()).execute(new Object[] {
                aa1.w(), aa1.s()
            });
        }
    }
}
