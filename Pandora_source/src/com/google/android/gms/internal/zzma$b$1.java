// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

// Referenced classes of package com.google.android.gms.internal:
//            zzma

class nit> extends nit>
{

    final thState a;

    public void zza(Status status, GoogleNowAuthState googlenowauthstate)
    {
        if (thState(a))
        {
            Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
        }
        a.tResult(new nit>(status, googlenowauthstate));
    }

    thState(thState thstate)
    {
        a = thstate;
        super();
    }
}
