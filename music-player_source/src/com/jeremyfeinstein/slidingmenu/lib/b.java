// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;


// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib:
//            d, CustomViewAbove, CustomViewBehind

final class b extends d
{

    final CustomViewAbove a;

    b(CustomViewAbove customviewabove)
    {
        a = customviewabove;
        super();
    }

    public final void a(int i)
    {
        if (CustomViewAbove.a(a) == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 37
    //                   1 49
    //                   2 37;
           goto _L2 _L3 _L4 _L3
_L2:
        return;
_L3:
        CustomViewAbove.a(a).a(true);
        return;
_L4:
        CustomViewAbove.a(a).a(false);
        return;
    }
}
