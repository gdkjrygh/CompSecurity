// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            zzqw, zzqy

class zzarU
    implements Comparator
{

    final zzqw zzarU;

    public int compare(Object obj, Object obj1)
    {
        return zza((zzqy)obj, (zzqy)obj1);
    }

    public int zza(zzqy zzqy1, zzqy zzqy2)
    {
        return zzqy1.getClass().getCanonicalName().compareTo(zzqy2.getClass().getCanonicalName());
    }

    (zzqw zzqw1)
    {
        zzarU = zzqw1;
        super();
    }
}
