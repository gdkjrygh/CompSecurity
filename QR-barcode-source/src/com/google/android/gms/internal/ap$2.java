// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            ap

class nO
    implements Comparator
{

    final ap nO;

    public int a(nO no, nO no1)
    {
        return (int)(no.value - no1.value);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }

    (ap ap1)
    {
        nO = ap1;
        super();
    }
}
