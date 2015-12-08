// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.ui.AddToCirclesHelper;

public class AddToCirclesSharedObject extends AppContentFragment.SharedObject
{

    AddToCirclesHelper mHelper;

    public AddToCirclesSharedObject()
    {
    }

    public final void init(Context context)
    {
        super.init(context);
        mHelper = new AddToCirclesHelper(context);
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mHelper.loadData(googleapiclient);
    }
}
