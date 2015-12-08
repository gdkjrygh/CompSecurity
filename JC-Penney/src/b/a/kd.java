// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Comparator;

// Referenced classes of package b.a:
//            kg, jv

final class kd
    implements Comparator
{

    kd()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (kg)obj;
        obj1 = (kg)obj1;
        return ((kg) (obj)).a().compareTo(((kg) (obj1)).a());
    }
}
