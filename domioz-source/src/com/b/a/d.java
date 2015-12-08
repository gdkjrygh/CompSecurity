// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            aa

public final class d
    implements aa
{

    public d()
    {
    }

    public final Object a(float f, Object obj, Object obj1)
    {
        obj = (Integer)obj;
        obj1 = (Integer)obj1;
        int i = ((Integer) (obj)).intValue();
        float f1 = i;
        return Integer.valueOf((int)((float)(((Integer) (obj1)).intValue() - i) * f + f1));
    }
}
