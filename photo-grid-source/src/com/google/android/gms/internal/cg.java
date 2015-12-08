// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            cl, ce

final class cg
    implements Comparator
{

    final ce a;

    cg(ce ce)
    {
        a = ce;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (cl)obj;
        obj1 = (cl)obj1;
        return (int)(((cl) (obj)).a - ((cl) (obj1)).a);
    }
}
