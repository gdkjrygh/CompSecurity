// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.update;

import android.app.Activity;
import net.hockeyapp.android.UpdateManager;

// Referenced classes of package com.skype.android.update:
//            UpdateManager

public class HockeyAppUpdateManager
    implements com.skype.android.update.UpdateManager
{

    public HockeyAppUpdateManager()
    {
    }

    public final void a(Activity activity)
    {
        UpdateManager.register(activity, "74a6db1ddfb946077fcbe1649ad4ff1e");
    }
}
