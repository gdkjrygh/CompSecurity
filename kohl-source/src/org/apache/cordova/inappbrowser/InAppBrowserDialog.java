// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.app.Dialog;
import android.content.Context;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowser

public class InAppBrowserDialog extends Dialog
{

    Context context;
    InAppBrowser inAppBrowser;

    public InAppBrowserDialog(Context context1, int i)
    {
        super(context1, i);
        inAppBrowser = null;
        context = context1;
    }

    public void onBackPressed()
    {
        if (inAppBrowser == null)
        {
            dismiss();
            return;
        } else
        {
            inAppBrowser.closeDialog();
            return;
        }
    }

    public void setInAppBroswer(InAppBrowser inappbrowser)
    {
        inAppBrowser = inappbrowser;
    }
}
