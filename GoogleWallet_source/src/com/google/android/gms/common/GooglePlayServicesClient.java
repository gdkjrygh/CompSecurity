// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;


// Referenced classes of package com.google.android.gms.common:
//            ConnectionResult

public interface GooglePlayServicesClient
{
    public static interface OnConnectionFailedListener
    {

        public abstract void onConnectionFailed(ConnectionResult connectionresult);
    }


    public static final String DEFAULT_ACCOUNT = "<<default account>>";
}
