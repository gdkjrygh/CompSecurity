// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;
import org.chromium.base.CommandLine;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.library_loader.ProcessInitException;
import org.chromium.content.browser.BrowserStartupController;
import org.chromium.content.browser.DeviceUtils;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewDelegate, XWalkPreferencesInternal

static final class val.context
    implements Runnable
{

    final Context val$context;

    public void run()
    {
        try
        {
            LibraryLoader.ensureInitialized();
        }
        catch (ProcessInitException processinitexception)
        {
            throw new RuntimeException("Cannot initialize Crosswalk Core", processinitexception);
        }
        DeviceUtils.addDeviceSpecificUserAgentSwitch(val$context);
        CommandLine.getInstance().appendSwitchWithValue("profile-name", XWalkPreferencesInternal.getStringValue("profile-name"));
        try
        {
            BrowserStartupController.get(val$context).startBrowserProcessesSync(true);
            return;
        }
        catch (ProcessInitException processinitexception1)
        {
            throw new RuntimeException("Cannot initialize Crosswalk Core", processinitexception1);
        }
    }

    Exception(Context context1)
    {
        val$context = context1;
        super();
    }
}
