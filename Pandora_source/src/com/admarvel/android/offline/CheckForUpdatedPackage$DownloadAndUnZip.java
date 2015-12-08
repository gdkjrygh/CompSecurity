// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.offline;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.admarvel.android.ads.AdMarvelUtils;
import com.admarvel.android.util.Logging;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.admarvel.android.offline:
//            CheckForUpdatedPackage, ZipUtils, AdmarvelOfflineUtils

public class context
    implements Runnable
{

    private Context context;
    public boolean isDownloadAndUnZipSucceded;
    private String location;
    final CheckForUpdatedPackage this$0;
    private ArrayList unzipFilesAbsPath;
    private URL url;

    public ArrayList getUnzipFilesAbsPath()
    {
        return unzipFilesAbsPath;
    }

    public void run()
    {
        if (url == null || !AdMarvelUtils.isNetworkAvailable(context)) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        byte abyte0[];
        obj2 = url.openConnection();
        ((URLConnection) (obj2)).connect();
        obj = new BufferedInputStream(url.openStream());
        if ("gzip".equals(((URLConnection) (obj2)).getContentEncoding()))
        {
            obj = new GZIPInputStream(((InputStream) (obj)));
            System.err.println("!!! gzip in connection");
        }
        obj2 = new FileOutputStream((new StringBuilder(String.valueOf(location))).append("/tmp.zip").toString());
        abyte0 = new byte[4096];
_L6:
        int i = ((InputStream) (obj)).read(abyte0);
        if (i != -1) goto _L4; else goto _L3
_L3:
        ((OutputStream) (obj2)).flush();
        ((OutputStream) (obj2)).close();
        ((InputStream) (obj)).close();
        unzipFilesAbsPath = ZipUtils.unzipAndDelete((new StringBuilder(String.valueOf(location))).append("/tmp.zip").toString(), location);
        if (CheckForUpdatedPackage.access$2(CheckForUpdatedPackage.this).get() == null)
        {
            return;
        }
          goto _L5
_L4:
        ((OutputStream) (obj2)).write(abyte0, 0, i);
          goto _L6
        IOException ioexception;
        ioexception;
        Logging.log((new StringBuilder("Offline SDK:")).append(Log.getStackTraceString(ioexception)).toString());
        isDownloadAndUnZipSucceded = false;
_L7:
        isDownloadAndUnZipSucceded = true;
        return;
_L5:
        if (CheckForUpdatedPackage.access$3(CheckForUpdatedPackage.this) == null)
        {
            CheckForUpdatedPackage.access$4(CheckForUpdatedPackage.this, (ArrayList)AdmarvelOfflineUtils.readObjectFromFile("/complete_ad_content_path_list", "/complete_ad_content_path_list", (Context)CheckForUpdatedPackage.access$2(CheckForUpdatedPackage.this).get()));
            if (CheckForUpdatedPackage.access$3(CheckForUpdatedPackage.this) == null)
            {
                CheckForUpdatedPackage.access$4(CheckForUpdatedPackage.this, new ArrayList());
            }
        }
        if (unzipFilesAbsPath != null)
        {
            CheckForUpdatedPackage.access$3(CheckForUpdatedPackage.this).addAll(unzipFilesAbsPath);
        }
        if (true) goto _L7; else goto _L2
_L2:
        isDownloadAndUnZipSucceded = false;
        Object obj1;
        if (CheckForUpdatedPackage.access$2(CheckForUpdatedPackage.this).get() != null)
        {
            obj1 = ((Activity)CheckForUpdatedPackage.access$2(CheckForUpdatedPackage.this).get()).getSharedPreferences("admarvel_preferences", 0);
        } else
        {
            obj1 = null;
        }
        if (obj1 == null)
        {
            Logging.log("Offline SDK:package cannot be downloaded shared preference is null ");
            CheckForUpdatedPackage.access$5(false);
            CheckForUpdatedPackage.access$6(false);
            obj1 = ((SharedPreferences) (obj1)).edit();
            ((android.content.ss._cls6) (obj1))._mth6("download_started", true);
            ((android.content.ss._cls6) (obj1))._mth6();
            return;
        } else
        {
            obj1 = ((SharedPreferences) (obj1)).edit();
            CheckForUpdatedPackage.access$7(CheckForUpdatedPackage.this, ((android.content.loadAndUnZip.this._cls0) (obj1)), "-1");
            ((android.content.loadAndUnZip.this._cls0) (obj1))._mth0();
            Logging.log("Offline SDK:package cannot be downloaded because internet is not available ");
            CheckForUpdatedPackage.access$5(false);
            CheckForUpdatedPackage.access$6(false);
            return;
        }
    }

    public (URL url1, String s, Context context1)
    {
        this$0 = CheckForUpdatedPackage.this;
        super();
        isDownloadAndUnZipSucceded = false;
        url = url1;
        location = s;
        context = context1;
    }

    public context(URL url1, String s, boolean flag, Context context1)
    {
        this$0 = CheckForUpdatedPackage.this;
        super();
        isDownloadAndUnZipSucceded = false;
        url = url1;
        location = s;
        context = context1;
    }
}
