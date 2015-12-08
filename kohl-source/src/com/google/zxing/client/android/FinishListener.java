// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.DialogInterface;

public final class FinishListener
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnCancelListener
{

    private final Activity activityToFinish;

    public FinishListener(Activity activity)
    {
        activityToFinish = activity;
    }

    private void run()
    {
        activityToFinish.finish();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        run();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        run();
    }
}
