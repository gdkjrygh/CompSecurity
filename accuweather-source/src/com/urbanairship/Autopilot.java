// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.urbanairship:
//            UAirship

public abstract class Autopilot
{

    public static final String AUTOPILOT_MANIFEST_KEY = "com.urbanairship.autopilot";

    public Autopilot()
    {
    }

    public static final void automaticTakeOff(Application application)
    {
        Object obj;
        if (UAirship.isFlying() || UAirship.isTakingOff())
        {
            return;
        }
        obj = null;
        String s = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData.getString("com.urbanairship.autopilot");
        obj = s;
_L2:
        if (obj == null)
        {
            Log.e("UA AP", "Unable to takeOff automatically");
            return;
        }
        break; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        Log.e("UA AP", (new StringBuilder()).append("Failed to load meta-data, NameNotFound: ").append(((android.content.pm.PackageManager.NameNotFoundException) (obj1)).getMessage()).toString());
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.e("UA AP", (new StringBuilder()).append("Failed to load meta-data, NullPointer: ").append(((NullPointerException) (obj1)).getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            obj = Class.forName(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e("UA AP", (new StringBuilder()).append("Unable to load the defined Autopilot instance. ClassNotFoundException: ").append(application.getMessage()).toString());
            return;
        }
        try
        {
            obj = (Autopilot)((Class) (obj)).newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e("UA AP", (new StringBuilder()).append("Unable to instantiate the defined Autopilot instance. IllegalAccessException: ").append(application.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e("UA AP", (new StringBuilder()).append("Unable to instantiate the defined Autopilot instance. InstantiationException: ").append(application.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e("UA AP", (new StringBuilder()).append("Unable to instantiate the defined Autopilot instance. ClassCastException: ").append(application.getMessage()).toString());
            return;
        }
        if (obj == null)
        {
            Log.e("UA AP", "Unable to instantiate the defined Autopilot instance. Instance is null.");
            return;
        } else
        {
            ((Autopilot) (obj)).execute(application);
            return;
        }
    }

    public abstract void execute(Application application);
}
