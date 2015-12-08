// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;

final class u extends ActionCallback
{

    u()
    {
    }

    public final boolean onResponse(ActionContext actioncontext)
    {
        actioncontext = actioncontext.stringNamed("URL");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(actioncontext));
        try
        {
            LeanplumActivityHelper.getCurrentActivity().startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Log.e("Leanplum", (new StringBuilder("Unable to handle URL ")).append(actioncontext).toString());
            return false;
        }
        return true;
    }
}
