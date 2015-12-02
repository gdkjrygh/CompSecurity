// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;


// Referenced classes of package com.nineoldandroids.a:
//            n

public class d
    implements n
{

    public d()
    {
    }

    public Object a(float f, Object obj, Object obj1)
    {
        int l = ((Integer)obj).intValue();
        int i = l >> 24;
        int j = l >> 16 & 0xff;
        int k = l >> 8 & 0xff;
        l &= 0xff;
        int i1 = ((Integer)obj1).intValue();
        int j1 = (int)((float)((i1 >> 24) - i) * f);
        int k1 = (int)((float)((i1 >> 16 & 0xff) - j) * f);
        int l1 = (int)((float)((i1 >> 8 & 0xff) - k) * f);
        return Integer.valueOf(l + (int)((float)((i1 & 0xff) - l) * f) | (i + j1 << 24 | j + k1 << 16 | l1 + k << 8));
    }
}
