// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

public class GoogleAuthApiException extends Exception
{

    private Status CM;
    private PendingIntent mPendingIntent;

    public GoogleAuthApiException(String s, Status status)
    {
        super(s);
        CM = status;
    }

    public GoogleAuthApiException(String s, Status status, PendingIntent pendingintent)
    {
        super(s);
        CM = status;
        mPendingIntent = pendingintent;
    }

    public PendingIntent getPendingIntent()
    {
        return mPendingIntent;
    }

    public Status getStatus()
    {
        return CM;
    }

    public boolean isUserRecoverable()
    {
        return mPendingIntent != null;
    }
}
