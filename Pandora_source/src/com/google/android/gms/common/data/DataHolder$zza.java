// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final String zzRA[];
    private final ArrayList zzRJ;
    private final String zzRK;
    private final HashMap zzRL;
    private boolean zzRM;
    private String zzRN;

    static String[] zza(<init> <init>1)
    {
        return <init>1.zzRA;
    }

    static ArrayList zzb(zzRA zzra)
    {
        return zzra.zzRJ;
    }

    private (String as[], String s)
    {
        zzRA = (String[])zzv.zzr(as);
        zzRJ = new ArrayList();
        zzRK = s;
        zzRL = new HashMap();
        zzRM = false;
        zzRN = null;
    }

    zzRN(String as[], String s, zzRN zzrn)
    {
        this(as, s);
    }
}
