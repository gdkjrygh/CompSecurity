// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            cn

final class ck
    implements Comparator
{

    ck()
    {
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (cn)obj;
        obj1 = (cn)obj1;
        return ((cn) (obj)).a - ((cn) (obj1)).a;
    }
}
