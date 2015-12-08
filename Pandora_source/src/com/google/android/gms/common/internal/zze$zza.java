// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zze, zzv

public static final class zzTa
{

    public final Set zzPP;
    public final boolean zzTa;

    public (Set set, boolean flag)
    {
        zzv.zzr(set);
        zzPP = Collections.unmodifiableSet(set);
        zzTa = flag;
    }
}
