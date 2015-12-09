// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface GoogleHelpApi
{

    public abstract PendingResult startHelp(GoogleApiClient googleapiclient, Activity activity, Intent intent);
}
