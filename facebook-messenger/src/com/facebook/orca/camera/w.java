// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.app.Activity;
import android.os.Environment;
import android.os.StatFs;
import android.widget.Toast;
import com.facebook.o;
import java.io.File;

// Referenced classes of package com.facebook.orca.camera:
//            ImageManager

public class w
{

    private static final Class a = com/facebook/orca/camera/w;

    public w()
    {
    }

    public static int a()
    {
        if (!ImageManager.a())
        {
            return -1;
        }
        float f;
        int i;
        try
        {
            StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().toString());
            f = statfs.getAvailableBlocks();
            i = statfs.getBlockSize();
        }
        catch (Exception exception)
        {
            return -2;
        }
        return (int)((f * (float)i) / 1500000F);
    }

    public static void a(Activity activity)
    {
        a(activity, a());
    }

    public static void a(Activity activity, int i)
    {
        String s = null;
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (Environment.getExternalStorageState() == "checking")
        {
            s = activity.getString(o.camera_preparing_sd);
        } else
        {
            s = activity.getString(o.camera_no_storage);
        }
_L4:
        if (s != null)
        {
            Toast.makeText(activity, s, 5000).show();
        }
        return;
_L2:
        if (i < 1)
        {
            s = activity.getString(o.camera_not_enough_space);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
