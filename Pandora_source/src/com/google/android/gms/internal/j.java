// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzhi

abstract class j extends com.google.android.gms.common.api.zza.zza
{
    static abstract class a extends j
    {

        public Status a(Status status)
        {
            return status;
        }

        public Result createFailedResult(Status status)
        {
            return a(status);
        }

        public a(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public j(GoogleApiClient googleapiclient)
    {
        super(zzhi.zzKh, googleapiclient);
    }
}
