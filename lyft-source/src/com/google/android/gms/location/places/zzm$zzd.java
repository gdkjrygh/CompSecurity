// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceLikelihoodBuffer

public abstract class  extends 
{

    protected Result b(Status status)
    {
        return d(status);
    }

    protected PlaceLikelihoodBuffer d(Status status)
    {
        return new PlaceLikelihoodBuffer(DataHolder.b(status.g()), 100, null);
    }

    public nt(com.google.android.gms.common.api.ntKey ntkey, GoogleApiClient googleapiclient)
    {
        super(ntkey, googleapiclient);
    }
}
