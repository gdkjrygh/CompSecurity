// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.acra.ErrorReporter;
import com.facebook.loom.logger.Logger;

public class NodexBaseActivity extends Activity
{

    public NodexBaseActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        int i = Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_ACTIVITY_START, 0x58af3d20);
        super.onCreate(bundle);
        ErrorReporter.getInstance().putCustomData("app_backgrounded", "false");
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_ACTIVITY_END, 0xd6ce5be8, i);
    }

    protected void onStart()
    {
        int i = Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_ACTIVITY_START, 0x2600000d);
        super.onStart();
        ErrorReporter.getInstance().putCustomData("app_backgrounded", "false");
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_ACTIVITY_END, 0xab829e34, i);
    }

    protected void onStop()
    {
        int i = Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_ACTIVITY_START, 0x7cb54d34);
        super.onStop();
        ErrorReporter.getInstance().putCustomData("app_backgrounded", "true");
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_ACTIVITY_END, 0x112f4e88, i);
    }
}
