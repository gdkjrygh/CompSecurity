// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;


// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

static final class nit> extends nit>
{

    final float a(int i, int j)
    {
        nit> nit>;
        if (i % 2 == 0)
        {
            nit> = b;
        } else
        {
            nit> = a;
        }
        return nit>.a(i, j * 2);
    }

    (String s)
    {
        super(s, 2, (byte)0);
    }
}
