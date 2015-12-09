// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib;


// Referenced classes of package com.slidingmenu.lib:
//            CustomViewAbove, CustomViewBehind

class <init> extends <init>
{

    final CustomViewAbove a;

    public void a(int i)
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
        CustomViewAbove.a(a).setChildrenEnabled(true);
        return;
_L4:
        CustomViewAbove.a(a).setChildrenEnabled(false);
        return;
    }

    (CustomViewAbove customviewabove)
    {
        a = customviewabove;
        super();
    }
}
