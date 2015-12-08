// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            zznn, zznq

class a
    implements Comparator
{

    final zznn a;

    public int a(zznq zznq1, zznq zznq2)
    {
        return zznq1.getClass().getCanonicalName().compareTo(zznq2.getClass().getCanonicalName());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((zznq)obj, (zznq)obj1);
    }

    (zznn zznn1)
    {
        a = zznn1;
        super();
    }
}
