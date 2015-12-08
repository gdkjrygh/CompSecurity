// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

// Referenced classes of package com.facebook.share.internal:
//            ResultProcessor, ShareInternalUtility

final class val.callback extends ResultProcessor
{

    final FacebookCallback val$callback;

    public void onCancel(AppCall appcall)
    {
        ShareInternalUtility.invokeOnCancelCallback(val$callback);
    }

    public void onError(AppCall appcall, FacebookException facebookexception)
    {
        ShareInternalUtility.invokeOnErrorCallback(val$callback, facebookexception);
    }

    public void onSuccess(AppCall appcall, Bundle bundle)
    {
label0:
        {
            if (bundle != null)
            {
                appcall = ShareInternalUtility.getNativeDialogCompletionGesture(bundle);
                if (appcall != null && !"post".equalsIgnoreCase(appcall))
                {
                    break label0;
                }
                appcall = ShareInternalUtility.getShareDialogPostId(bundle);
                ShareInternalUtility.invokeOnSuccessCallback(val$callback, appcall);
            }
            return;
        }
        if ("cancel".equalsIgnoreCase(appcall))
        {
            ShareInternalUtility.invokeOnCancelCallback(val$callback);
            return;
        } else
        {
            ShareInternalUtility.invokeOnErrorCallback(val$callback, new FacebookException("UnknownError"));
            return;
        }
    }

    (FacebookCallback facebookcallback1)
    {
        val$callback = facebookcallback1;
        super(final_facebookcallback);
    }
}
