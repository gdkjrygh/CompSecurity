// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import com.artfulbits.aiCharts.Enums.Alignment;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ac, a

class a
    implements ac
{

    private a a;

    public static int a(Alignment alignment, Alignment alignment1)
    {
        return alignment.ordinal() | alignment1.ordinal() << 4;
    }

    public static Alignment b(int i)
    {
        return Alignment.values()[i & 0xf];
    }

    public static Alignment c(int i)
    {
        return Alignment.values()[i >> 4 & 0xf];
    }

    public final void a(int i)
    {
        switch (i)
        {
        default:
            return;

        case 16: // '\020'
        case 64: // '@'
            a.b(3);
            break;
        }
    }

    gnment(a a1)
    {
        a = a1;
        super();
    }
}
