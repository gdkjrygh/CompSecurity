// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Intent;
import android.util.Log;
import com.accuweather.android.WhatsNewActivity1;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.ZipUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.accuweather.android.services:
//            FileDownloadService

public class ImageFileDownloadService extends FileDownloadService
{

    public static final String DOWNLOAD_BROADCAST_PROGRESS_ACTION = "com.accuweather.android.download_progress";
    public static final String EXTRACT_PATH_KEY = "extract_path_key";
    public static final String FILE_MAP_KEY = "file_map_key";
    private String mExtractPath;
    private HashMap mTargetFilesMap;
    private int notificationFlag;

    public ImageFileDownloadService()
    {
        notificationFlag = 34;
        mTargetFilesMap = new HashMap();
    }

    public String getDownloadUpdateIntentAction()
    {
        return "com.accuweather.android.download_progress";
    }

    protected Class getIntentForLatestInfo()
    {
        return com/accuweather/android/WhatsNewActivity1;
    }

    protected int getNotificationFlag()
    {
        return notificationFlag;
    }

    protected int getNotificationIcon()
    {
        return com.accuweather.android.R.drawable.ic_download;
    }

    protected HashMap getTargetFiles()
    {
        return mTargetFilesMap;
    }

    protected void onFinishDownload_Background(HashMap hashmap, HashMap hashmap1)
    {
        Iterator iterator;
        Log.d(getClass().getName(), "In onFinishedDownload_Background()");
        iterator = hashmap.values().iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ZipInputStream zipinputstream;
        Object obj;
        zipinputstream = null;
        obj = null;
        hashmap = zipinputstream;
        String s = (String)iterator.next();
        hashmap = zipinputstream;
        Logger.d(getClass().getName(), (new StringBuilder()).append("In onFinishedDownload(), localFile = ").append(s).append(", extract path = ").append(mExtractPath).toString());
        hashmap = zipinputstream;
        zipinputstream = new ZipInputStream(new FileInputStream(new File(s)));
        ZipUtils.extractFolder(zipinputstream, mExtractPath);
        (new File(s)).delete();
        if (zipinputstream != null)
        {
            try
            {
                zipinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap) { }
        }
          goto _L3
        hashmap;
        zipinputstream = ((ZipInputStream) (obj));
        obj = hashmap;
_L6:
        hashmap = zipinputstream;
        Log.d(getClass().getName(), "Error occurred in onFinishDownload_Background", ((Throwable) (obj)));
        if (zipinputstream != null)
        {
            try
            {
                zipinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap) { }
        }
          goto _L3
        hashmap1;
_L5:
        boolean flag;
        if (hashmap != null)
        {
            try
            {
                hashmap.close();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap) { }
        }
        throw hashmap1;
_L2:
        hashmap = new Intent("com.accuweather.android.download_progress");
        if (hashmap1.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sendBroadcast(hashmap.putExtra("complete", flag));
        return;
        hashmap1;
        hashmap = zipinputstream;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
          goto _L6
    }

    protected void onFinishDownload_UI(HashMap hashmap, HashMap hashmap1)
    {
        Log.d(getClass().getName(), "In onFinishedDownload_UI()");
        notificationFlag = 16;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null)
        {
            mTargetFilesMap = (HashMap)intent.getSerializableExtra("file_map_key");
            mExtractPath = intent.getStringExtra("extract_path_key");
        }
        return super.onStartCommand(intent, i, j);
    }
}
