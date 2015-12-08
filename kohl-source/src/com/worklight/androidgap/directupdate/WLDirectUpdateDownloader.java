// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.util.Base64;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.HttpClientManager;
import com.worklight.wlclient.WLAuthorizationManagerInternal;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.BasicHttpContext;
import org.bouncycastle.util.Arrays;

// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateStatus, WLDirectUpdateListener, WLDirectUpdateZipFileIntegrityValidator

public class WLDirectUpdateDownloader extends AsyncTask
{
    public class DirectUpdateError extends Error
    {

        private WLDirectUpdateStatus status;
        final WLDirectUpdateDownloader this$0;

        public WLDirectUpdateStatus getStatus()
        {
            return status;
        }

        public DirectUpdateError(WLDirectUpdateStatus wldirectupdatestatus)
        {
            this$0 = WLDirectUpdateDownloader.this;
            super();
            status = wldirectupdatestatus;
        }
    }


    private static final String BYTE_RANGE_SPECIFIER = "bytes";
    private static final String CONTENT_TYPE_APPLICATION_ZIP = "application/zip";
    private static final String DDU_SCRIPT_FILE_NAME = "ddu.script";
    private static final String DOWNLOADED_ZIP_FILE_NAME = "assets.zip";
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/directupdate/WLDirectUpdateDownloader.getName());
    private static final int progressBarUpdateRate = 32;
    private File assetsFile;
    private long assetsFileSize;
    private boolean isStartFreshDownload;
    private WLDirectUpdateListener listener;
    private String skinName;
    private String url;

    public WLDirectUpdateDownloader(String s, long l, String s1, boolean flag, WLDirectUpdateListener wldirectupdatelistener)
    {
        listener = wldirectupdatelistener;
        skinName = s1;
        assetsFileSize = l;
        url = s;
        isStartFreshDownload = flag;
        assetsFile = new File((new StringBuilder()).append(WLConfig.getInstance().getApplicationAbsolutePathToExternalAppFiles()).append("/").append("assets.zip").toString());
    }

    private void copyFile(String s, InputStream inputstream, File file)
        throws IOException
    {
        s = new File(file, s);
        s.getParentFile().mkdirs();
        s = new FileOutputStream(s);
        WLUtils.copyFile(inputstream, s);
        s.close();
        inputstream.close();
    }

    private void copyList(File file, File file1, List list)
        throws IOException
    {
        String s;
        for (list = list.iterator(); list.hasNext(); copyFile(s, new FileInputStream(new File(file, s)), file1))
        {
            s = (String)list.next();
        }

    }

    private void copyListFromAssets(AssetManager assetmanager, File file, List list)
        throws IOException
    {
        String s;
        for (list = list.iterator(); list.hasNext(); copyFile(s, assetmanager.open((new StringBuilder()).append("www/").append(s).toString()), file))
        {
            s = (String)list.next();
        }

    }

    private long downloadData(HttpEntity httpentity, long l, long l1)
    {
        byte abyte0[];
        Exception exception2;
        Object obj1;
        Object obj2;
        boolean flag1;
        obj1 = null;
        obj2 = null;
        abyte0 = null;
        exception2 = null;
        flag1 = false;
        httpentity = new BufferedInputStream(httpentity.getContent());
        Object obj = assetsFile;
        int i;
        int j;
        int k;
        boolean flag2;
        if (!isStartFreshDownload)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj = new FileOutputStream(((File) (obj)), flag2);
        abyte0 = new byte[8192];
        i = 0;
_L3:
        k = httpentity.read(abyte0);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 += k;
        j = i;
        if (i != 32)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        publishProgress(new Long[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
        j = 0;
        i = j + 1;
        Exception exception;
        boolean flag;
        try
        {
            ((FileOutputStream) (obj)).write(abyte0, 0, k);
            if (!isCancelled())
            {
                continue; /* Loop/switch isn't completed */
            }
            logger.debug("User cancelled direct update download");
            break; /* Loop/switch isn't completed */
        }
        catch (Exception exception1) { }
        finally
        {
            abyte0 = ((byte []) (obj));
            obj = exception2;
        }
          goto _L1
        if (true) goto _L3; else goto _L2
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        ((FileOutputStream) (obj)).close();
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        httpentity.close();
        flag = flag1;
        break MISSING_BLOCK_LABEL_180;
        httpentity;
        logger.warn("Unable to close input stream of assets.zip file");
        flag = flag1;
          goto _L4
        httpentity;
        obj = exception2;
        httpentity = obj2;
_L1:
        j = 1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        ((FileOutputStream) (obj)).close();
        flag = j;
        if (httpentity == null) goto _L4; else goto _L5
_L5:
        httpentity.close();
        flag = j;
          goto _L4
        httpentity;
        logger.warn("Unable to close input stream of assets.zip file");
        flag = j;
          goto _L4
        obj;
        httpentity = obj1;
_L7:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        abyte0.close();
        if (httpentity != null)
        {
            try
            {
                httpentity.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntity httpentity)
            {
                logger.warn("Unable to close input stream of assets.zip file");
            }
        }
        throw obj;
_L4:
        if (isCancelled())
        {
            throw new DirectUpdateError(WLDirectUpdateStatus.CANCELED);
        }
        if (flag)
        {
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNKNOWN);
        } else
        {
            return l;
        }
        obj;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        exception = exception2;
          goto _L1
    }

    private String downloadFirstBytes(HttpEntity httpentity, int i)
    {
        String s;
        try
        {
            httpentity = new BufferedInputStream(httpentity.getContent());
            byte abyte0[] = new byte[i];
            s = new String(Arrays.copyOf(abyte0, httpentity.read(abyte0)));
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            return "";
        }
        try
        {
            httpentity.close();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            return s;
        }
        return s;
    }

    private void downloadZipFile()
    {
        long l = 0L;
        HttpEntity httpentity;
        if (!isStartFreshDownload)
        {
            l = assetsFile.length();
            logger.debug((new StringBuilder()).append(l).append(" bytes are already available. ").toString());
        } else
        {
            logger.debug("Starting fresh download since app was changed on the server since last download attempt");
        }
        httpentity = sendRequest(l).getEntity();
        if (!isDownloadedFileOfZipType(httpentity))
        {
            logger.debug("The server returned file different than expected application update zip file");
            logger.debug((new StringBuilder()).append("Response Data: ").append(downloadFirstBytes(httpentity, 1024)).toString());
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNKNOWN);
        }
        l = downloadData(httpentity, assetsFileSize, l);
        if (l < assetsFileSize)
        {
            logger.debug((new StringBuilder()).append("Length of file is ").append(assetsFileSize).append(". Total bytes downloaded is ").append(l).toString());
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_DOWNLOADING);
        } else
        {
            return;
        }
    }

    private void extractZipFile(Context context)
    {
        logger.debug("Start copy files to local storage from updated zip file...");
        logger.debug((new StringBuilder()).append("Size of zip file is ").append(assetsFile.length()).toString());
        listener.onProgress(WLDirectUpdateStatus.UNZIP_IN_PROGRESS, assetsFileSize, assetsFileSize);
        File file2 = new File(WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles());
        File file = new File(file2, "TempSkinFolder");
        File file1 = new File(file2, skinName);
        if (file.exists() && !WLUtils.deleteDirectory(file))
        {
            logger.warn((new StringBuilder()).append("Can't delete ").append(file.getAbsolutePath()).toString());
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNZIPPING);
        }
        file.mkdirs();
        try
        {
            WLUtils.unpack(new FileInputStream(assetsFile), file);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNZIPPING);
        }
        handleDeltaUpdate(context, file2, file);
        context = new File(WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles(), "currentSkinForDeletion");
        WLConfig.getInstance().writeWLPref("wlDirectUppdateTempFolder", context.getAbsolutePath());
        if (file1.exists() && !file1.renameTo(context))
        {
            logger.warn((new StringBuilder()).append("Can't rename ").append(file1.getAbsolutePath()).toString());
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNZIPPING);
        }
        if (!(new File(file, skinName)).renameTo(file1))
        {
            logger.warn((new StringBuilder()).append("Can't rename ").append(file1.getAbsolutePath()).toString());
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNZIPPING);
        }
        WLConfig.getInstance().writeWLPref("wlDirectUppdateTempFolder", null);
        if (context.exists() && !WLUtils.deleteDirectory(context))
        {
            logger.warn((new StringBuilder()).append("Can't delete ").append(file1.getAbsolutePath()).toString());
        }
        assetsFile.delete();
        logger.debug("Finish copy files to local storage from updated zip file...");
    }

    private void handleDeltaUpdate(Context context, File file, File file1)
        throws DirectUpdateError
    {
        File file2 = new File(file1, "ddu.script");
        if (!file2.exists()) goto _L2; else goto _L1
_L1:
        List list;
        logger.debug("Differential Direct Update - delta package detected");
        try
        {
            list = parseDDUScriptFile(file2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            logger.warn((new StringBuilder()).append("Can't parse file ").append(file2.getAbsolutePath()).toString());
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNZIPPING);
        }
        if (!WLConfig.getInstance().isExternalWebResources()) goto _L4; else goto _L3
_L3:
        copyList(file, file1, list);
_L6:
        file2.delete();
_L2:
        return;
_L4:
        try
        {
            copyListFromAssets(context.getAssets(), file1, list);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            logger.error("Can't copy web resources:", context);
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_UNZIPPING);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean isDownloadedFileOfZipType(HttpEntity httpentity)
    {
        return httpentity.getContentType().getValue().equals("application/zip");
    }

    private List parseDDUScriptFile(File file)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        file = new FileReader(file);
        BufferedReader bufferedreader = new BufferedReader(file);
        do
        {
            String s = bufferedreader.readLine();
            if (s == null)
            {
                break;
            }
            if (s.startsWith("/www/"))
            {
                arraylist.add(s.substring("/www/".length()));
            }
        } while (true);
        bufferedreader.close();
        file.close();
        return arraylist;
    }

    private HttpResponse sendRequest(long l)
    {
        Object obj;
        try
        {
            obj = HttpClientManager.getInstance().getHttpClient();
            HttpGet httpget = new HttpGet(url);
            BasicHttpContext basichttpcontext = new BasicHttpContext();
            httpget.addHeader("Range", (new StringBuilder()).append("bytes=").append(String.valueOf(l)).append("-").toString());
            WLAuthorizationManagerInternal.getInstance().addClientIdHeaderToRequest(httpget);
            obj = ((HttpClient) (obj)).execute(httpget, basichttpcontext);
        }
        catch (Exception exception)
        {
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_NETWORK_PROBLEM);
        }
        return ((HttpResponse) (obj));
    }

    private WLDirectUpdateStatus startDirectUpdate(Context context)
    {
        try
        {
            downloadZipFile();
            validateZipFileIntegrity();
            extractZipFile(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return context.getStatus();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return WLDirectUpdateStatus.FAILURE_UNKNOWN;
        }
        return WLDirectUpdateStatus.SUCCESS;
    }

    private void validateZipFileIntegrity()
    {
        Object obj = WLConfig.getInstance().getDirectUpdatePublicKey();
        if (obj == null || ((String) (obj)).isEmpty())
        {
            logger.info("Direct update authenticity public key not provided, direct update authenticity check disabled");
            return;
        }
        Signature signature;
        try
        {
            obj = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(((String) (obj)), 0)));
            signature = Signature.getInstance("SHA256withRSA");
        }
        catch (Exception exception)
        {
            assetsFile.delete();
            logger.error("Failed to parse direct update authenticity public key, make sure valid key was used");
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_INTEGRITY);
        }
        if (!(new WLDirectUpdateZipFileIntegrityValidator(signature, ((java.security.PublicKey) (obj)))).verify(assetsFile))
        {
            assetsFile.delete();
            logger.error("Invalid direct update zip file, original file might have been altered or replaced.");
            throw new DirectUpdateError(WLDirectUpdateStatus.FAILURE_INTEGRITY);
        } else
        {
            logger.debug("Update file integrity validated!");
            return;
        }
    }

    protected transient WLDirectUpdateStatus doInBackground(Context acontext[])
    {
        return startDirectUpdate(acontext[0]);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Context[])aobj);
    }

    protected transient void onProgressUpdate(Long along[])
    {
        listener.onProgress(WLDirectUpdateStatus.DOWNLOAD_IN_PROGRESS, along[0].longValue(), along[1].longValue());
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Long[])aobj);
    }

}
