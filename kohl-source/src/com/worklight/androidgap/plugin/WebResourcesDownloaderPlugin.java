// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.worklight.androidgap.api.WL;
import com.worklight.androidgap.fips.FipsHandler;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.utils.SecurityUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.worklight.androidgap.plugin:
//            FIPSHttpPlugin

public class WebResourcesDownloaderPlugin extends CordovaPlugin
{
    public class WebResourcesDownloader extends AsyncTask
    {

        private static final String CONTENT_TYPE_APPLICATION_ZIP = "application/zip";
        private static final String DOWNLOADED_ZIP_FILE_NAME = "assets.zip";
        private static final int HONEYCOMB = 11;
        private Activity activity;
        private String cookies;
        private WebResourcesDownloader downloader;
        private String downloadingMessage;
        private String instanceAuthId;
        private boolean isDirectUpdateSuccess;
        private String kb;
        private ProgressDialog progressDialog;
        private boolean shouldUpdateSilently;
        private String skinName;
        private boolean startFreshDownload;
        final WebResourcesDownloaderPlugin this$0;
        private String url;
        private CordovaWebView webView;

        private void createProgressDialog()
        {
            progressDialog = new ProgressDialog(activity);
            progressDialog.setMessage(downloadingMessage);
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(1);
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            progressDialog.getClass().getDeclaredMethod("setProgressNumberFormat", new Class[] {
                java/lang/String
            }).invoke(progressDialog, new Object[] {
                (new StringBuilder()).append("%1d/%2d ").append(kb).toString()
            });
            return;
            Exception exception;
            exception;
            WebResourcesDownloaderPlugin.logger.warn((new StringBuilder()).append("Progress bar will be displayed without units, because ").append(exception.getMessage()).toString());
            return;
        }

        private void downloadZipFile()
            throws IOException
        {
            Object obj;
            Object obj1;
            Object obj2;
            Exception exception;
            Object obj3;
            HttpEntity httpentity;
            Object obj4;
            File file;
            long l;
            long l1;
            obj = null;
            exception = null;
            obj3 = null;
            obj4 = null;
            httpentity = null;
            file = new File((new StringBuilder()).append(WLConfig.getInstance().getApplicationAbsolutePathToExternalAppFiles()).append("/").append("assets.zip").toString());
            l1 = 0L;
            l = -1L;
            obj1 = obj;
            obj2 = obj4;
            long l2;
            long l3;
            int i;
            boolean flag;
            if (!startFreshDownload)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = obj;
            obj2 = obj4;
            Exception exception2;
            try
            {
                obj = new FileOutputStream(file, flag);
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                obj = httpentity;
                break MISSING_BLOCK_LABEL_522;
            }
            finally { }
            l3 = l1;
            l2 = l;
            if (startFreshDownload) goto _L2; else goto _L1
_L1:
            l3 = l1;
            l2 = l;
            try
            {
                l1 = WLConfig.getInstance().readLongWLPref("directUpdateBytesDownloaded");
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                l1 = l3;
                l = l2;
                break MISSING_BLOCK_LABEL_522;
            }
            finally
            {
                obj1 = exception;
                obj2 = obj;
                obj = exception2;
            }
            l3 = l1;
            l2 = l;
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append(l1).append(" bytes are already available. ").toString());
            l3 = l1;
            l2 = l;
            obj2 = sendRequest(l1);
            l3 = l1;
            l2 = l;
            httpentity = ((HttpResponse) (obj2)).getEntity();
            l3 = l1;
            l2 = l;
            obj1 = ((HttpResponse) (obj2)).getFirstHeader("Content-Range");
            if (obj1 == null) goto _L4; else goto _L3
_L3:
            l3 = l1;
            l2 = l;
            obj1 = ((Header) (obj1)).getValue();
            l3 = l1;
            l2 = l;
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append("Content Range header is ").append(((String) (obj1))).toString());
            l3 = l1;
            l2 = l;
            obj1 = ((String) (obj1)).split(" ");
            l3 = l1;
            l2 = l;
            if (obj1.length <= 1) goto _L6; else goto _L5
_L5:
            l3 = l1;
            l2 = l;
            obj1 = obj1[1].split("/");
            l3 = l1;
            l2 = l;
            i = obj1.length;
            if (i <= 1) goto _L8; else goto _L7
_L7:
            l3 = l1;
            l2 = l;
            i = Integer.parseInt(obj1[1]);
            l = i;
_L10:
            l3 = l1;
            l2 = l;
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append("Length of file is ").append(l).toString());
            l3 = l1;
            l2 = l;
            progressDialog.setMax((int)(l / 1024L));
            l3 = l1;
            l2 = l;
            obj1 = new BufferedInputStream(httpentity.getContent());
            l2 = l1;
            if (httpentity.getContentType().getValue().equals("application/zip"))
            {
                break; /* Loop/switch isn't completed */
            }
            l2 = l1;
            obj2 = (new StringBuilder()).append("The following message has been received from the server instead of the expected application update zip file: ").append(((HttpResponse) (obj2)).getStatusLine()).append(" ").append(WLUtils.convertStreamToString(((InputStream) (obj1)))).toString();
            l2 = l1;
            WebResourcesDownloaderPlugin.logger.debug(((String) (obj2)));
            l2 = l1;
            try
            {
                throw new IOException(((String) (obj2)));
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                obj3 = obj1;
            }
            finally
            {
                obj2 = obj;
            }
            l1 = l2;
            obj1 = obj3;
            obj2 = obj;
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append(l1).append(" bytes out of ").append(l).append(" were downloaded.").toString());
            obj1 = obj3;
            obj2 = obj;
            WLConfig.getInstance().writeLongWLPref("directUpdateBytesDownloaded", l1);
            obj1 = obj3;
            obj2 = obj;
            throw new IOException((new StringBuilder()).append("Error downloading update file ").append(exception.getLocalizedMessage()).toString());
            obj = exception1;
            if (obj2 != null)
            {
                ((FileOutputStream) (obj2)).close();
            }
            if (obj1 != null)
            {
                ((InputStream) (obj1)).close();
                WebResourcesDownloaderPlugin.logger.debug("Finish copy files to local storage from updated zip file...");
            }
            throw obj;
_L2:
            l3 = l1;
            l2 = l;
            WebResourcesDownloaderPlugin.logger.debug("Starting fresh download since app was changed on the server since last download attempt");
            break MISSING_BLOCK_LABEL_125;
            obj1;
            l3 = l1;
            l2 = l;
            l = httpentity.getContentLength();
            continue; /* Loop/switch isn't completed */
_L8:
            l3 = l1;
            l2 = l;
            l = httpentity.getContentLength();
            continue; /* Loop/switch isn't completed */
_L6:
            l3 = l1;
            l2 = l;
            l = httpentity.getContentLength();
            continue; /* Loop/switch isn't completed */
_L4:
            l3 = l1;
            l2 = l;
            l = httpentity.getContentLength();
            if (true) goto _L10; else goto _L9
_L9:
            l2 = l1;
            WebResourcesDownloaderPlugin.logger.debug("Start copy files to local storage from updated zip file...");
            l2 = l1;
            l3 = activity.getApplicationContext().getFilesDir().getFreeSpace();
            l2 = l1;
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append("Free space is ").append(l3).toString());
            if (l3 >= l)
            {
                break MISSING_BLOCK_LABEL_838;
            }
            l2 = l1;
            throw new IOException("Not enough free space to download the update.");
            l2 = l1;
            obj2 = new byte[8192];
_L12:
            l2 = l1;
            i = ((InputStream) (obj1)).read(((byte []) (obj2)));
            l3 = l1;
            if (i == -1)
            {
                break MISSING_BLOCK_LABEL_956;
            }
            l3 = l1 + (long)i;
            l2 = l3;
            publishProgress(new Integer[] {
                Integer.valueOf((int)(l3 / 1024L))
            });
            l2 = l3;
            ((FileOutputStream) (obj)).write(((byte []) (obj2)), 0, i);
            l2 = l3;
            l1 = l3;
            if (!isCancelled()) goto _L12; else goto _L11
_L11:
            l2 = l3;
            WebResourcesDownloaderPlugin.logger.debug("User cancelled the download");
            l2 = l3;
            WLConfig.getInstance().writeLongWLPref("directUpdateBytesDownloaded", l3);
            l2 = l3;
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append("Length of file is ").append(l).append(". Total bytes downloaded is ").append(l3).toString());
            if (l3 >= l)
            {
                break MISSING_BLOCK_LABEL_1076;
            }
            l2 = l3;
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append(l3).append(" bytes out of ").append(l).append(" were downloaded.").toString());
            l2 = l3;
            WLConfig.getInstance().writeLongWLPref("directUpdateBytesDownloaded", l3);
            l2 = l3;
            throw new IOException("Update file not downloaded completely.");
            l2 = l3;
            WLConfig.getInstance().writeLongWLPref("directUpdateBytesDownloaded", 0L);
            if (obj != null)
            {
                ((FileOutputStream) (obj)).close();
            }
            if (obj1 != null)
            {
                ((InputStream) (obj1)).close();
                WebResourcesDownloaderPlugin.logger.debug("Finish copy files to local storage from updated zip file...");
            }
            return;
        }

        private void extractZipFile(String s, String s1)
            throws IOException
        {
            File file = new File(s);
            WebResourcesDownloaderPlugin.logger.debug((new StringBuilder()).append("Size of zip file is ").append(file.length()).toString());
            try
            {
                WLUtils.deleteDirectory(new File((new StringBuilder()).append(s1).append("/").append(skinName).toString()));
            }
            catch (Exception exception)
            {
                WebResourcesDownloaderPlugin.logger.error(exception.getLocalizedMessage());
            }
            (new File((new StringBuilder()).append(s1).append("/").append(skinName).toString())).mkdirs();
            s = new ZipFile(s);
            for (Enumeration enumeration = s.entries(); enumeration.hasMoreElements();)
            {
                Object obj = (ZipEntry)enumeration.nextElement();
                if (((ZipEntry) (obj)).isDirectory())
                {
                    (new File((new StringBuilder()).append(s1).append("/").append(((ZipEntry) (obj)).getName()).toString())).mkdirs();
                } else
                {
                    InputStream inputstream = s.getInputStream(((ZipEntry) (obj)));
                    obj = new FileOutputStream((new StringBuilder()).append(s1).append("/").append(((ZipEntry) (obj)).getName()).toString());
                    WLUtils.copyFile(inputstream, ((java.io.OutputStream) (obj)));
                    inputstream.close();
                    ((FileOutputStream) (obj)).close();
                }
            }

            s.close();
        }

        private void handleCookies(HttpContext httpcontext)
        {
            Object obj = new HashSet();
            String as[] = cookies.split(";");
            int i = 0;
            while (i < as.length) 
            {
                String as1[] = as[i].trim().split("=");
                if (as1.length == 2)
                {
                    BasicClientCookie basicclientcookie = new BasicClientCookie(as1[0].trim(), as1[1].trim());
                    basicclientcookie.setDomain(WLConfig.getInstance().getAppURL().getHost());
                    ((HashSet) (obj)).add(basicclientcookie);
                } else
                {
                    WebResourcesDownloaderPlugin.logger.debug(String.format("setCookies() can't parse cookie %s.", new Object[] {
                        as[i]
                    }));
                }
                i++;
            }
            if (!((HashSet) (obj)).isEmpty())
            {
                BasicCookieStore basiccookiestore = new BasicCookieStore();
                for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); basiccookiestore.addCookie((Cookie)((Iterator) (obj)).next())) { }
                httpcontext.setAttribute("http.cookie-store", basiccookiestore);
            }
        }

        private String handleUpdateException(String s, String s1, int i)
        {
            WebResourcesDownloaderPlugin.logger.log(s1);
            isDirectUpdateSuccess = false;
            StringBuilder stringbuilder = (new StringBuilder()).append("javascript:WL.App._showDirectUpdateErrorMessage(");
            if (s != null)
            {
                s = (new StringBuilder()).append("WL.ClientMessages.").append(s).toString();
            } else
            {
                s = (new StringBuilder()).append("\"").append(s1).append("\"").toString();
            }
            return stringbuilder.append(s).append(")").toString();
        }

        private void processZipFile()
            throws IOException
        {
            String s = (new StringBuilder()).append(WLConfig.getInstance().getApplicationAbsolutePathToExternalAppFiles()).append("/").append("assets.zip").toString();
            extractZipFile(s, WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles());
            (new File(s)).delete();
            WLConfig.getInstance().setClearCacheNextLoadPref(true);
        }

        private String runDirectUpdate()
        {
            try
            {
                downloadZipFile();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                return handleUpdateException("directUpdateErrorMessageFailedDownloadingZipFile", (new StringBuilder()).append("Failed downloading application update file because ").append(ioexception.getLocalizedMessage()).toString(), 6);
            }
            WLConfig.getInstance().writeLongWLPref("directUpdateBytesDownloaded", 0L);
            try
            {
                processZipFile();
            }
            catch (IOException ioexception1)
            {
                return handleUpdateException("directUpdateErrorMessageFailedProcessingZipFile", "Failed processing application update file.", 6);
            }
            if ("true".equals(WLConfig.getInstance().getTestWebResourcesChecksumFlag()))
            {
                String s = SecurityUtils.hashData(Long.toString(WLUtils.computeChecksumOnExternal(WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles())), "SHA-1");
                WebResourcesDownloaderPlugin.logger.debug("save the new web resources checksum on device");
                WLConfig.getInstance().setResourceChecksumPref(s);
            }
            WLConfig.getInstance().setExternalWebResourcesPref(true);
            return "OK";
        }

        private HttpResponse sendRequest(long l)
            throws ClientProtocolException, IOException
        {
            char c;
            Object obj;
            Object obj1;
            String s;
            HttpGet httpget;
            String s1;
            if (FIPSHttpPlugin.isFipsEnabled())
            {
                obj = FipsHandler.getInstance(activity).getHttpClientInstance();
            } else
            {
                obj = new DefaultHttpClient();
            }
            s = WLConfig.getInstance().getApplicationVersion();
            if (url.indexOf('?') == -1)
            {
                c = '?';
            } else
            {
                c = '&';
            }
            obj1 = (new StringBuilder()).append(c).append(URLEncoder.encode("x-wl-app-version", "UTF-8")).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
            url = (new StringBuilder()).append(url).append(((String) (obj1))).toString();
            httpget = new HttpGet(url);
            s1 = WLConfig.getInstance().getServerContext();
            obj1 = WLConfig.getInstance().getAppURL().getHost();
            if (s1 != null && s1.trim().length() > 1)
            {
                obj1 = (new StringBuilder()).append(((String) (obj1))).append(s1).toString();
            }
            cookies = (new StringBuilder()).append(cookies).append(";").append(CookieManager.getInstance().getCookie(((String) (obj1)))).toString();
            obj1 = new BasicHttpContext();
            handleCookies(((HttpContext) (obj1)));
            httpget.addHeader("x-wl-app-version", s);
            httpget.addHeader("WL-Instance-Id", instanceAuthId);
            httpget.addHeader("Range", (new StringBuilder()).append("bytes=").append(String.valueOf(l)).append("-").toString());
            return ((HttpClient) (obj)).execute(httpget, ((HttpContext) (obj1)));
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            return runDirectUpdate();
        }

        protected void onCancelled()
        {
            WebResourcesDownloaderPlugin.logger.debug("Cancelled");
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            webView.clearCache(true);
            if (!isDirectUpdateSuccess) goto _L2; else goto _L1
_L1:
            CookieSyncManager.createInstance(activity);
            CookieManager.getInstance().removeSessionCookie();
            WLConfig.getInstance().setExitOnSkinLoaderPref(false);
            webView.loadUrl(WL.getInstance().getMainHtmlFilePath());
            progressDialog.dismiss();
_L4:
            WebResourcesDownloaderPlugin.isUpdating = false;
            return;
_L2:
            progressDialog.dismiss();
            webView.loadUrl(s);
            if (true) goto _L4; else goto _L3
_L3:
            s;
            WebResourcesDownloaderPlugin.logger.error(s.getMessage());
            WebResourcesDownloaderPlugin.isUpdating = false;
            return;
            s;
            WebResourcesDownloaderPlugin.isUpdating = false;
            throw s;
        }

        protected void onPreExecute()
        {
            WebResourcesDownloaderPlugin.isUpdating = true;
            createProgressDialog();
            if (!shouldUpdateSilently)
            {
                progressDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final WebResourcesDownloader this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        WebResourcesDownloaderPlugin.logger.debug("OnCancelListeneter called");
                        downloader.cancel(true);
                        webView.sendJavascript("wl_directUpdateChallengeHandler.submitFailure()");
                    }

            
            {
                this$1 = WebResourcesDownloader.this;
                super();
            }
                });
                progressDialog.show();
            }
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            progressDialog.setProgress(ainteger[0].intValue());
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }



        public WebResourcesDownloader(Activity activity1, CordovaWebView cordovawebview, String s, String s1, boolean flag, String s2, 
                String s3, String s4, boolean flag1)
        {
            this$0 = WebResourcesDownloaderPlugin.this;
            super();
            isDirectUpdateSuccess = true;
            instanceAuthId = null;
            url = null;
            shouldUpdateSilently = false;
            downloader = this;
            activity = activity1;
            webView = cordovawebview;
            cookies = s;
            instanceAuthId = s1;
            downloadingMessage = WLUtils.getResourceString(s2, activity1);
            skinName = s4;
            url = s3;
            shouldUpdateSilently = flag;
            startFreshDownload = flag1;
            kb = WLUtils.getResourceString("kb", activity1);
        }
    }


    private static final String ACTION_SWITCH_APP = "switchApp";
    private static final String ACTION_UPDATE_APP = "updateApp";
    private static final String BYTE_RANGE_SPECIFIER = "bytes";
    private static final String CONTENT_RANGE = "Content-Range";
    private static final String PARTIAL_DOWNLOAD_PREF = "directUpdateBytesDownloaded";
    private static boolean isUpdating = false;
    private static Logger logger = Logger.getInstance("WebResourceDownloadPlugin");

    public WebResourcesDownloaderPlugin()
    {
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if ("updateApp".equals(s) || "switchApp".equals(s))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        callbackcontext.error((new StringBuilder()).append("Invalid action: ").append(s).toString());
        return true;
        String s1;
        String s2;
        String s3;
        String s4;
        boolean flag;
        boolean flag1;
        try
        {
            s3 = CookieManager.getInstance().getCookie(WLConfig.getInstance().getAppURL().toString());
            s2 = jsonarray.getString(0);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            callbackcontext.error((new StringBuilder()).append("Action: ").append(s).append(" failed. ").append(jsonarray.getMessage()).toString());
            return true;
        }
        s1 = s2;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        s1 = s2.trim();
        flag = jsonarray.getString(1).equals("true");
        flag1 = jsonarray.getString(2).equals("true");
        logger.debug((new StringBuilder()).append("Start Fresh download is ").append(jsonarray.getString(2)).append(" ( ").append(flag1).append(")").toString());
        s2 = WLConfig.getInstance().getSkinNamePref();
        s4 = jsonarray.getString(3);
        if (!"updateApp".equals(s)) goto _L2; else goto _L1
_L1:
        jsonarray = (new StringBuilder()).append(WLConfig.getInstance().getRootURL()).append("/").append(s4).append("&action=getzip").toString();
        (new WebResourcesDownloader(cordova.getActivity(), webView, s3, s1, flag, "directUpdateDownloadingMessage", jsonarray, s2, flag1)).execute(new Void[0]);
_L4:
        callbackcontext.success(org.apache.cordova.PluginResult.Status.OK.name());
        return true;
_L2:
        if (!"switchApp".equals(s)) goto _L4; else goto _L3
_L3:
        s4 = jsonarray.getString(1);
        jsonarray = jsonarray.getString(2);
        jsonarray = (new StringBuilder()).append(WLConfig.getInstance().getRootURL().toString()).append("/dev/appdata?appId=").append(s4).append("&appVer=").append(jsonarray).append("&appEnv=android&skin=").append(s2).toString();
        (new WebResourcesDownloader(cordova.getActivity(), webView, s3, s1, false, "downloadingWebResourcesMessage", jsonarray, s2, flag1)).execute(new Void[0]);
          goto _L4
    }

    public boolean isUpdating()
    {
        return isUpdating;
    }



/*
    static boolean access$002(boolean flag)
    {
        isUpdating = flag;
        return flag;
    }

*/

}
