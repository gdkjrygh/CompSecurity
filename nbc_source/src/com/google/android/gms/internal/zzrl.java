// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrj

public final class zzrl
{

    public static final Object zzaWe = new Object();

    public static boolean equals(int ai[], int ai1[])
    {
        if (ai == null || ai.length == 0)
        {
            return ai1 == null || ai1.length == 0;
        } else
        {
            return Arrays.equals(ai, ai1);
        }
    }

    public static boolean equals(Object aobj[], Object aobj1[])
    {
        int j;
        int k;
        int l;
        boolean flag3;
        flag3 = false;
        if (aobj == null)
        {
            k = 0;
        } else
        {
            k = aobj.length;
        }
        if (aobj1 == null)
        {
            l = 0;
        } else
        {
            l = aobj1.length;
        }
        j = 0;
_L7:
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        for (i = 0; i < k && aobj[i] == null; i++) { }
        for (; j < l && aobj1[j] == null; j++) { }
        if (i >= k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j >= l)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag3;
        if (flag != flag1) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (!aobj[i].equals(aobj1[j])) goto _L4; else goto _L5
_L5:
        j++;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static int hashCode(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return 0;
        } else
        {
            return Arrays.hashCode(ai);
        }
    }

    public static int hashCode(Object aobj[])
    {
        int k = 0;
        int i;
        int j;
        if (aobj == null)
        {
            i = 0;
        } else
        {
            i = aobj.length;
        }
        for (j = 0; j < i;)
        {
            Object obj = aobj[j];
            int l = k;
            if (obj != null)
            {
                l = k * 31 + obj.hashCode();
            }
            j++;
            k = l;
        }

        return k;
    }

    public static void zza(zzrh zzrh1, zzrh zzrh2)
    {
        if (zzrh1.zzaVU != null)
        {
            zzrh2.zzaVU = zzrh1.zzaVU.zzBL();
        }
    }

}
