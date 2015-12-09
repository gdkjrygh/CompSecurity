// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzv;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public static interface CheckResult.zzPP
{
    public static class CheckResult
    {

        private boolean zzPO;
        private Set zzPP;

        public static CheckResult newAuthNotRequiredResult()
        {
            return new CheckResult(false, null);
        }

        public static CheckResult newAuthRequiredResult(Set set)
        {
            boolean flag;
            if (set != null && !set.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "A non-empty scope set is required if further auth is needed.");
            return new CheckResult(true, set);
        }

        public boolean zzkN()
        {
            return zzPO;
        }

        public Set zzkO()
        {
            return zzPP;
        }

        private CheckResult(boolean flag, Set set)
        {
            zzPO = flag;
            zzPP = set;
        }
    }


    public abstract CheckResult onCheckServerAuthorization(String s, Set set);

    public abstract boolean onUploadServerAuthCode(String s, String s1);
}
