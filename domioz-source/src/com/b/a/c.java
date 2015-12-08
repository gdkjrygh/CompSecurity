// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            aa

public final class c
    implements aa
{

    public c()
    {
    }

    public final Object a(float f, Object obj, Object obj1)
    {
        obj = (Number)obj;
        obj1 = (Number)obj1;
        float f1 = ((Number) (obj)).floatValue();
        return Float.valueOf(f1 + (((Number) (obj1)).floatValue() - f1) * f);
    }
}
