// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.launchscreen;

import android.content.Context;
import android.content.Intent;
import org.xwalk.core.internal.XWalkExtensionInternal;
import org.xwalk.core.internal.XWalkLaunchScreenManager;

public class LaunchScreenExtension extends XWalkExtensionInternal
{

    private static final String CMD_HIDE_LAUNCH_SCREEN = "hideLaunchScreen";
    public static final String JS_API_PATH = "jsapi/launch_screen_api.js";
    private static final String JS_ENTRY_POINTS[] = {
        "window.screen.show"
    };
    private static final String NAME = "xwalk.launchscreen";
    private Context mContext;

    public LaunchScreenExtension(String s, Context context)
    {
        super("xwalk.launchscreen", s, JS_ENTRY_POINTS);
        mContext = context;
    }

    private void hideLaunchScreen()
    {
        Intent intent = new Intent(XWalkLaunchScreenManager.getHideLaunchScreenFilterStr());
        mContext.sendBroadcast(intent);
    }

    public void onMessage(int i, String s)
    {
        if (s.equals("hideLaunchScreen"))
        {
            hideLaunchScreen();
        }
    }

    public String onSyncMessage(int i, String s)
    {
        return null;
    }

}
