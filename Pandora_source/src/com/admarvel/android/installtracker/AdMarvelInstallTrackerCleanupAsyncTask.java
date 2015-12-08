// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.installtracker;

import android.os.AsyncTask;
import android.os.Environment;
import java.io.File;

// Referenced classes of package com.admarvel.android.installtracker:
//            Utils

public class AdMarvelInstallTrackerCleanupAsyncTask extends AsyncTask
{

    private static long INSTALL_TRACKER_TIMEOUT = 0x337f9800L;

    public AdMarvelInstallTrackerCleanupAsyncTask()
    {
    }

    protected transient Object doInBackground(Object aobj[])
    {
        int j;
        if (!"mounted".equals(Environment.getExternalStorageState()))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        aobj = new File(Environment.getExternalStorageDirectory(), (new StringBuilder("/")).append(Utils.encodeString("adm_tracker_dir")).toString());
        if (!((File) (aobj)).exists())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        aobj = ((File) (aobj)).listFiles();
        j = aobj.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aobj[i];
            try
            {
                if (System.currentTimeMillis() - ((File) (obj)).lastModified() > INSTALL_TRACKER_TIMEOUT)
                {
                    ((File) (obj)).delete();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                ((Exception) (aobj)).printStackTrace();
                break;
            }
            i++;
        }
        return null;
    }

}
