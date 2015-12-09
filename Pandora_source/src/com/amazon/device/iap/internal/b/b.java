// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.SimplePrompt;
import com.amazon.device.iap.internal.util.e;

public class b extends SimplePrompt
{

    private static final String a = com/amazon/device/iap/internal/b/b.getSimpleName();
    private ContextManager b;
    private final PromptContent c;

    public b(PromptContent promptcontent)
    {
        super(promptcontent);
        c = promptcontent;
    }

    protected void doAction()
    {
        e.a(a, "doAction");
        if (!"Amazon Appstore required".equalsIgnoreCase(c.getTitle()) && !"Amazon Appstore Update Required".equalsIgnoreCase(c.getTitle()))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Activity activity;
        Activity activity1;
        try
        {
            activity1 = b.getVisible();
        }
        catch (Exception exception)
        {
            e.b(a, (new StringBuilder()).append("Exception in PurchaseItemCommandTask.OnSuccess: ").append(exception).toString());
            return;
        }
        activity = activity1;
        if (activity1 != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        activity = b.getRoot();
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl")));
    }

    protected long getExpirationDurationInSeconds()
    {
        return 0x1e13380L;
    }

    public String toString()
    {
        return a;
    }

}
