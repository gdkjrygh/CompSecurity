// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;

public class PeopleGraphRequester
{

    public PeopleGraphRequester()
    {
    }

    public static void loadOwners(GoogleApiClient googleapiclient, com.google.android.gms.people.Graph.LoadOwnersOptions loadownersoptions, ResultCallback resultcallback)
    {
        People.GraphApi.loadOwners(googleapiclient, loadownersoptions).setResultCallback(resultcallback);
    }
}
