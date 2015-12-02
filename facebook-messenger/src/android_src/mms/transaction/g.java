// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import java.util.Comparator;

// Referenced classes of package android_src.mms.transaction:
//            f, e

final class g
    implements Comparator
{

    private g()
    {
    }

    g(e e)
    {
        this();
    }

    public int a(f f1, f f2)
    {
        return Long.signum(f2.a() - f1.a());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((f)obj, (f)obj1);
    }
}
