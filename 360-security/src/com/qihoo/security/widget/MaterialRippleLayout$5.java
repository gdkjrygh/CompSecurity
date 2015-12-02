// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import com.nineoldandroids.util.c;

// Referenced classes of package com.qihoo.security.widget:
//            MaterialRippleLayout

class a extends c
{

    final MaterialRippleLayout a;

    public Integer a(MaterialRippleLayout materialripplelayout)
    {
        return Integer.valueOf(materialripplelayout.getRippleAlpha());
    }

    public volatile Object a(Object obj)
    {
        return a((MaterialRippleLayout)obj);
    }

    public void a(MaterialRippleLayout materialripplelayout, Integer integer)
    {
        materialripplelayout.setRippleAlpha(integer);
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((MaterialRippleLayout)obj, (Integer)obj1);
    }

    (MaterialRippleLayout materialripplelayout, Class class1, String s)
    {
        a = materialripplelayout;
        super(class1, s);
    }
}
