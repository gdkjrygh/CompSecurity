// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.util.Log;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;

public abstract class DefaultCallback extends Callback
{

    private static final String TAG = "com.uservoice.uservoicesdk";
    private final Context context;

    public DefaultCallback(Context context1)
    {
        context = context1;
    }

    public void onError(RestResult restresult)
    {
        Log.e("com.uservoice.uservoicesdk", restresult.getMessage());
        try
        {
            (new android.app.AlertDialog.Builder(context)).setTitle(com.uservoice.uservoicesdk.R.string.uv_network_error).show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RestResult restresult)
        {
            Log.e("com.uservoice.uservoicesdk", (new StringBuilder()).append("Failed trying to show alert: ").append(restresult.getMessage()).toString());
        }
    }
}
