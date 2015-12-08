// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            zznn, zznq

class zzaDT
    implements Comparator
{

    final zznn zzaDT;

    public int compare(Object obj, Object obj1)
    {
        return zza((zznq)obj, (zznq)obj1);
    }

    public int zza(zznq zznq1, zznq zznq2)
    {
        return zznq1.getClass().getCanonicalName().compareTo(zznq2.getClass().getCanonicalName());
    }

    (zznn zznn1)
    {
        zzaDT = zznn1;
        super();
    }
}
