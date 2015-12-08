// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            TypeEvaluator

public class ArgbEvaluator
    implements TypeEvaluator
{

    public ArgbEvaluator()
    {
    }

    public Object evaluate(float f, Object obj, Object obj1)
    {
        int l = ((Integer)obj).intValue();
        int i = l >> 24;
        int j = l >> 16 & 0xff;
        int k = l >> 8 & 0xff;
        l &= 0xff;
        int i1 = ((Integer)obj1).intValue();
        return Integer.valueOf((int)((float)((i1 >> 24) - i) * f) + i << 24 | (int)((float)((i1 >> 16 & 0xff) - j) * f) + j << 16 | (int)((float)((i1 >> 8 & 0xff) - k) * f) + k << 8 | (int)((float)((i1 & 0xff) - l) * f) + l);
    }
}
