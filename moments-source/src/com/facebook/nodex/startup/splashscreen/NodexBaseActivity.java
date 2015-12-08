// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.acra.ErrorReporter;

public class NodexBaseActivity extends Activity
{

    public NodexBaseActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ErrorReporter.getInstance().putCustomData("app_backgrounded", "false");
    }

    protected void onStart()
    {
        super.onStart();
        ErrorReporter.getInstance().putCustomData("app_backgrounded", "false");
    }

    protected void onStop()
    {
        super.onStop();
        ErrorReporter.getInstance().putCustomData("app_backgrounded", "true");
    }
}
