// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;

// Referenced classes of package com.facebook.share.widget:
//            AppInviteDialog

class <init> extends ResultProcessor
{

    final AppInviteDialog this$0;
    final FacebookCallback val$callback;

    public void onSuccess(AppCall appcall, Bundle bundle)
    {
        if ("cancel".equalsIgnoreCase(ShareInternalUtility.getNativeDialogCompletionGesture(bundle)))
        {
            val$callback.onCancel();
            return;
        } else
        {
            val$callback.onSuccess(new sult(bundle));
            return;
        }
    }

    sult(FacebookCallback facebookcallback1)
    {
        this$0 = final_appinvitedialog;
        val$callback = facebookcallback1;
        super(FacebookCallback.this);
    }
}
