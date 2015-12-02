// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;

import com.google.common.c.b;
import java.util.Comparator;

// Referenced classes of package com.facebook.analytics.periodicreporters:
//            f

final class g
    implements Comparator
{

    g()
    {
    }

    public int a(f f1, f f2)
    {
        return b.a(f.a(f2), f.a(f1));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((f)obj, (f)obj1);
    }
}
