// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            GoogleHelpApiImpl

static abstract class piMethodImpl extends piMethodImpl
{

    protected final volatile Result createFailedResult(Status status)
    {
        return status;
    }

    public piMethodImpl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
