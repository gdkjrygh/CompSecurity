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

    public Float a(MaterialRippleLayout materialripplelayout)
    {
        return Float.valueOf(MaterialRippleLayout.e(materialripplelayout));
    }

    public volatile Object a(Object obj)
    {
        return a((MaterialRippleLayout)obj);
    }

    public void a(MaterialRippleLayout materialripplelayout, Float float1)
    {
        materialripplelayout.setRadius(float1.floatValue());
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((MaterialRippleLayout)obj, (Float)obj1);
    }

    (MaterialRippleLayout materialripplelayout, Class class1, String s)
    {
        a = materialripplelayout;
        super(class1, s);
    }
}
