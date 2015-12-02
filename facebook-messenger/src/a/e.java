// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package a:
//            d, b

public class e
    implements Serializable, Comparator
{

    public static final Comparator a = new e();

    private e()
    {
    }

    public int a(d d1, d d2)
    {
        int i = d1.a().a();
        int j = d2.a().a();
        if (i > j)
        {
            return 1;
        }
        return i >= j ? 0 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((d)obj, (d)obj1);
    }

}
