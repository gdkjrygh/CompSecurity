// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public static interface CheckResult
{
    public static class CheckResult
    {

        private Set zzMe;
        private boolean zzMs;

        public boolean zzic()
        {
            return zzMs;
        }

        public Set zzid()
        {
            return zzMe;
        }
    }


    public abstract CheckResult onCheckServerAuthorization(String s, Set set);

    public abstract boolean onUploadServerAuthCode(String s, String s1);
}
