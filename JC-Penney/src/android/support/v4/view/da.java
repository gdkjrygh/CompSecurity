// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            de

final class da
    implements Comparator
{

    da()
    {
    }

    public int a(de de1, de de2)
    {
        return de1.b - de2.b;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((de)obj, (de)obj1);
    }
}
