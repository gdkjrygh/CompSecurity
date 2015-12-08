// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.Comparator;

// Referenced classes of package com.android.slyce.a:
//            ae

class af
    implements Comparator
{

    public static af a = new af();

    private af()
    {
    }

    public int a(ae ae1, ae ae2)
    {
        if (ae1.b == ae2.b)
        {
            return 0;
        }
        return ae1.b <= ae2.b ? -1 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ae)obj, (ae)obj1);
    }

}
