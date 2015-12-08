// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.offline;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import com.admarvel.android.ads.AdMarvelUtils;
import com.admarvel.android.ads.AdMarvelXMLElement;
import com.admarvel.android.ads.AdMarvelXMLReader;
import com.admarvel.android.offline.model.BannerFolderName;
import com.admarvel.android.util.Logging;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

// Referenced classes of package com.admarvel.android.offline:
//            CSVReader, AdmarvelOfflineUtils, ZipUtils

public class CheckForUpdatedPackage extends AsyncTask
{
    private static class Buffer
    {

        public byte buffer[];
        public int bytes;

        private Buffer()
        {
            buffer = null;
            bytes = 0;
        }

        Buffer(Buffer buffer1)
        {
            this();
        }
    }

    public class DownloadAndUnZip
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
            if (activityReference.get() == null)
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
            if (completeAdContentPathList == null)
            {
                completeAdContentPathList = (ArrayList)AdmarvelOfflineUtils.readObjectFromFile("/complete_ad_content_path_list", "/complete_ad_content_path_list", (Context)activityReference.get());
                if (completeAdContentPathList == null)
                {
                    completeAdContentPathList = new ArrayList();
                }
            }
            if (unzipFilesAbsPath != null)
            {
                completeAdContentPathList.addAll(unzipFilesAbsPath);
            }
            if (true) goto _L7; else goto _L2
_L2:
            isDownloadAndUnZipSucceded = false;
            Object obj1;
            if (activityReference.get() != null)
            {
                obj1 = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0);
            } else
            {
                obj1 = null;
            }
            if (obj1 == null)
            {
                Logging.log("Offline SDK:package cannot be downloaded shared preference is null ");
                CheckForUpdatedPackage.isDownloadStarted = false;
                CheckForUpdatedPackage.isUpdateProcessStarted = false;
                obj1 = ((SharedPreferences) (obj1)).edit();
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("download_started", true);
                ((android.content.SharedPreferences.Editor) (obj1)).commit();
                return;
            } else
            {
                obj1 = ((SharedPreferences) (obj1)).edit();
                updateVersionNumber(((android.content.SharedPreferences.Editor) (obj1)), "-1");
                ((android.content.SharedPreferences.Editor) (obj1)).commit();
                Logging.log("Offline SDK:package cannot be downloaded because internet is not available ");
                CheckForUpdatedPackage.isDownloadStarted = false;
                CheckForUpdatedPackage.isUpdateProcessStarted = false;
                return;
            }
        }

        public DownloadAndUnZip(URL url1, String s, Context context1)
        {
            this$0 = CheckForUpdatedPackage.this;
            super();
            isDownloadAndUnZipSucceded = false;
            url = url1;
            location = s;
            context = context1;
        }

        public DownloadAndUnZip(URL url1, String s, boolean flag, Context context1)
        {
            this$0 = CheckForUpdatedPackage.this;
            super();
            isDownloadAndUnZipSucceded = false;
            url = url1;
            location = s;
            context = context1;
        }
    }


    private static boolean isDownloadStarted = false;
    private static boolean isUpdateProcessStarted = false;
    private final WeakReference activityReference;
    private File adMarvelDir;
    private File childDirectory;
    private ArrayList completeAdContentPathList;
    private String current_version;
    private int downloadedBannersCount;
    private Activity mActivity;
    private String mPartnerId;
    private String postValue;
    private String versionNo;

    public CheckForUpdatedPackage(String s, Activity activity)
    {
        downloadedBannersCount = -1;
        activityReference = new WeakReference(activity);
        mPartnerId = s;
    }

    private void DownloadRestAdContent()
    {
        long l;
        l = System.nanoTime();
        Logging.log("Offline SDK:Admarvel Offline SDK download started");
        if (activityReference.get() != null) goto _L2; else goto _L1
_L1:
        SharedPreferences sharedpreferences;
        return;
_L2:
        if ((sharedpreferences = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0)) == null) goto _L1; else goto _L3
_L3:
        CSVReader csvreader;
        ArrayList arraylist;
        android.content.SharedPreferences.Editor editor;
        ArrayList arraylist1;
        HashMap hashmap;
        editor = sharedpreferences.edit();
        String s = (new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(mPartnerId).append("_banners.csv").toString();
        downloadedBannersCount = sharedpreferences.getInt("completed_banners_count", -1);
        try
        {
            csvreader = new CSVReader(new InputStreamReader(new FileInputStream(s)));
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            filenotfoundexception.printStackTrace();
            csvreader = null;
        }
        if (csvreader == null)
        {
            arraylist = null;
        } else
        {
            arraylist = csvreader.getAllData();
        }
        if (arraylist != null && downloadedBannersCount == arraylist.size())
        {
            editor.putInt("completed_banners_count", -1);
            editor.commit();
            downloadedFolderSanityCheck();
            return;
        }
        arraylist1 = new ArrayList();
        hashmap = new HashMap();
        if (arraylist == null) goto _L5; else goto _L4
_L4:
        int i;
        int j;
        j = arraylist.size();
        downloadedBannersCount = sharedpreferences.getInt("completed_banners_count", -1);
        i = downloadedBannersCount;
_L8:
        if (i < j) goto _L7; else goto _L6
_L6:
        Object obj;
        double d;
        String s1;
        File file;
        try
        {
            csvreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        AdmarvelOfflineUtils.writeObjectToFile(adMarvelDir, hashmap, "/banner_folder_map");
        obj = new BannerFolderName();
        ((BannerFolderName) (obj)).setBannerFolderName(arraylist1);
        if (!sharedpreferences.getString("/previous_banner_packages", "NULL").equals("NULL"))
        {
            continue; /* Loop/switch isn't completed */
        }
        editor.putString("/previous_banner_packages", "/previous_banner_packages");
        AdmarvelOfflineUtils.writeObjectToFile(adMarvelDir, obj, "/previous_banner_packages");
_L10:
        AdmarvelOfflineUtils.writeObjectToFile(adMarvelDir, obj, "/previous_banner_packages");
_L5:
        downloadedFolderSanityCheck();
        d = System.nanoTime() - l;
        Logging.log((new StringBuilder("Offline SDK:Admarvel Offline SDK download completed at ( ")).append(d * 1.0000000000000001E-09D).append("s").toString());
        updateVersionNumber(editor, versionNo);
        return;
_L7:
        obj = (String[])arraylist.get(i);
        if (!isCancelled())
        {
            s1 = (new StringBuilder(String.valueOf(obj[0]))).append("_").append(obj[1]).toString();
            arraylist1.add(s1);
            hashmap.put(obj[0], s1);
            file = new File((new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(s1).toString());
            if (!file.isDirectory())
            {
                file.mkdirs();
            }
            try
            {
                obj = new DownloadAndUnZip(new URL(URLDecoder.decode(obj[2], "UTF-8")), (new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(s1).toString(), (Context)activityReference.get());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log((new StringBuilder("Offline SDK:")).append(((MalformedURLException) (obj)).getMessage()).toString());
                obj = null;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log((new StringBuilder("Offline SDK:")).append(((UnsupportedEncodingException) (obj)).getMessage()).toString());
                obj = null;
            }
            if (obj != null)
            {
                ((DownloadAndUnZip) (obj)).run();
                downloadedBannersCount = downloadedBannersCount + 1;
            }
        }
        if (downloadedBannersCount == j)
        {
            downloadedFolderSanityCheck();
        }
        i++;
          goto _L8
        if (activityReference.get() == null) goto _L1; else goto _L9
_L9:
        Object obj1 = (BannerFolderName)AdmarvelOfflineUtils.readObjectFromFile("/previous_banner_packages", "BannerFolderName", (Context)activityReference.get());
        if (obj1 != null)
        {
            ((BannerFolderName) (obj1)).getBannerFolderName().removeAll(((BannerFolderName) (obj)).getBannerFolderName());
            obj1 = ((BannerFolderName) (obj1)).getBannerFolderName().iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                Object obj2 = (String)((Iterator) (obj1)).next();
                obj2 = new File(childDirectory, ((String) (obj2)));
                if (((File) (obj2)).isDirectory())
                {
                    ZipUtils.deleteDirectory(((File) (obj2)));
                }
            }
        }
          goto _L10
    }

    private String buildParamString(Activity activity, String s)
    {
        StringBuilder stringbuilder;
        boolean flag;
        boolean flag1;
        stringbuilder = new StringBuilder();
        adMarvelDir = activity.getDir("Admarvel", 0);
        childDirectory = new File(adMarvelDir, s);
        activity = activity.getSharedPreferences("admarvel_preferences", 0);
        Object obj = activity.getString("partner_id", "NULL");
        android.content.SharedPreferences.Editor editor = activity.edit();
        editor.putString("partner_id", s);
        if (!((String) (obj)).equals(s))
        {
            obj = new File(adMarvelDir, ((String) (obj)));
            if (((File) (obj)).isDirectory())
            {
                Logging.log("Offline SDK:deleting expired packages");
                ZipUtils.deleteDirectory(((File) (obj)));
            }
        }
        flag = childDirectory.mkdir();
        editor.putString("childDirectory", childDirectory.getAbsolutePath());
        editor.commit();
        current_version = "-1";
        flag1 = activity.getBoolean("download_started", false);
        if (flag) goto _L2; else goto _L1
_L1:
        if (!childDirectory.isDirectory()) goto _L2; else goto _L3
_L3:
        current_version = activity.getString("admarvel_current_version", "-1");
        activity = activity.getString("admarvel_temp_version", "-1");
        if (current_version.equals("-1")) goto _L5; else goto _L4
_L4:
        AdMarvelUtils.appendParams(stringbuilder, "current_version", current_version);
_L2:
        AdMarvelUtils.appendParams(stringbuilder, "partner_id", s);
        AdMarvelUtils.appendParams(stringbuilder, "banner_package", "1");
        return stringbuilder.toString();
_L5:
        if (!flag1) goto _L2; else goto _L6
_L6:
        if (activity.equals("-1")) goto _L2; else goto _L7
_L7:
        AdMarvelUtils.appendParams(stringbuilder, "current_version", activity);
          goto _L2
        activity;
        Logging.log((new StringBuilder("Offline SDK:")).append(Log.getStackTraceString(activity)).toString());
        return null;
    }

    private Void checkforUpdate()
    {
        int k;
        k = 0;
        Logging.log("Offline SDK:checkforUpdate called");
        if (isUpdateProcessStarted) goto _L2; else goto _L1
_L1:
        Object obj;
        Logging.log("Offline SDK:isUpdateProcessStarted");
        isUpdateProcessStarted = true;
        obj = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/.admfiles").toString());
        if (((File) (obj)).exists())
        {
            ZipUtils.deleteDirectory(((File) (obj)));
        }
        if (activityReference != null)
        {
            obj = (Activity)activityReference.get();
        } else
        {
            obj = null;
        }
        mActivity = ((Activity) (obj));
        Logging.log("Offline SDK:check for update for offline package");
        if (mPartnerId == null || mActivity == null || !AdMarvelUtils.isNetworkAvailable(mActivity)) goto _L2; else goto _L3
_L3:
        (new AdmarvelOfflineUtils()).firePixelCleanup(mActivity);
        obj = buildParamString(mActivity, mPartnerId);
        if (obj != null) goto _L4; else goto _L2
_L2:
        return null;
_L4:
        Logging.log((new StringBuilder("Offline SDK:checkforUpdate PostString :- ")).append(((String) (obj))).toString());
        HttpURLConnection httpurlconnection;
        int i;
        httpurlconnection = (HttpURLConnection)(new URL("http://ads.admarvel.com/fam/getOfflineAndroidPackage.php")).openConnection();
        httpurlconnection.setRequestMethod("POST");
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setDoInput(true);
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setRequestProperty("User-Agent", (new AdMarvelUtils(mActivity)).getUserAgent());
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setRequestProperty("Content-Length", Integer.toString(((String) (obj)).length()));
        httpurlconnection.setConnectTimeout(2000);
        httpurlconnection.setReadTimeout(10000);
        httpurlconnection.getOutputStream().write(((String) (obj)).getBytes());
        i = httpurlconnection.getResponseCode();
        httpurlconnection.getContentLength();
        if (i != 200) goto _L6; else goto _L5
_L5:
        byte abyte0[];
        abyte0 = (InputStream)httpurlconnection.getContent();
        obj = new ArrayList();
        int j;
        i = 8192;
        j = 0;
_L14:
        if (i != '\uFFFF') goto _L8; else goto _L7
_L7:
        abyte0.close();
        if (j <= 0) goto _L6; else goto _L9
_L9:
        abyte0 = new byte[j];
        j = 0;
        i = k;
_L16:
        if (i < ((List) (obj)).size()) goto _L11; else goto _L10
_L10:
        obj = new String(abyte0);
_L15:
        if (((String) (obj)).length() <= 0) goto _L2; else goto _L12
_L12:
        try
        {
            createSubdirectories(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log((new StringBuilder("Offline SDK:")).append(((Exception) (obj)).getMessage()).append("Exception in calling creating subdirectories method ").toString());
            return null;
        }
        return null;
_L8:
        byte abyte1[];
        int l;
        abyte1 = new byte[8192];
        l = abyte0.read(abyte1, 0, 8192);
        i = l;
        if (l <= 0) goto _L14; else goto _L13
_L13:
        Buffer buffer1;
        buffer1 = new Buffer(null);
        buffer1.buffer = abyte1;
        buffer1.bytes = l;
        j += l;
        ((List) (obj)).add(buffer1);
        i = l;
          goto _L14
        obj;
        Logging.log((new StringBuilder("Offline SDK:")).append(((Exception) (obj)).getMessage()).append("Exception in checking for Update").toString());
_L6:
        obj = "";
          goto _L15
_L11:
        Buffer buffer = (Buffer)((List) (obj)).get(i);
        System.arraycopy(buffer.buffer, 0, abyte0, j, buffer.bytes);
        k = buffer.bytes;
        j += k;
        i++;
          goto _L16
    }

    private void createSubdirectories(String s)
        throws Exception
    {
        Object obj;
        if (s == null)
        {
            Logging.log("Offline SDK:xml Data is null Exception");
            throw new Exception("xml Data is null");
        }
        Logging.log((new StringBuilder("Offline SDK:check for Update Response:")).append(s).toString());
        if (isDownloadStarted)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        isDownloadStarted = true;
        obj = new AdMarvelXMLReader();
        ((AdMarvelXMLReader) (obj)).parseXMLString(s);
        s = ((AdMarvelXMLReader) (obj)).getParsedXMLData();
        if (activityReference == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = activityReference.get();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
        Object obj1;
        Object obj2;
        Object obj5;
        obj2 = s.getChildren();
        s = (ArrayList)((LinkedHashMap) (obj2)).get("action");
        obj5 = ((AdMarvelXMLElement)((ArrayList)((LinkedHashMap) (obj2)).get("geoinfo")).get(0)).getAttributes();
        obj1 = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        Logging.log("Offline SDK:package cannot be downloaded shared preference is null ");
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
        Object obj6;
        obj = ((SharedPreferences) (obj1)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("download_started", true);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        obj6 = ((LinkedHashMap) (obj5)).keySet().iterator();
_L17:
        if (((Iterator) (obj6)).hasNext()) goto _L2; else goto _L1
_L1:
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        if (s == null) goto _L4; else goto _L3
_L3:
        if (s.size() <= 0) goto _L4; else goto _L5
_L5:
        if (!((AdMarvelXMLElement)s.get(0)).getData().equals("update")) goto _L7; else goto _L6
_L6:
        long l;
        downloadedBannersCount = 0;
        postValue = "Update Available";
        Logging.log("Offline SDK:Update Available ");
        Logging.log("Offline SDK:Admarvel SDK Offline Packager Downloads Started");
        l = System.nanoTime();
        if (activityReference == null) goto _L9; else goto _L8
_L8:
        s = (Activity)activityReference.get();
_L18:
        mActivity = s;
        s = (ArrayList)((LinkedHashMap) (obj2)).get("package");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_2168;
        }
        if (s.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_2168;
        }
        versionNo = (String)((AdMarvelXMLElement)s.get(0)).getAttributes().get("version");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        if (versionNo != null)
        {
            ((android.content.SharedPreferences.Editor) (obj)).putString("admarvel_temp_version", versionNo);
            if (!((android.content.SharedPreferences.Editor) (obj)).commit())
            {
                Logging.log("Offline SDK:package cannot be downloaded because current version cannot be comitted ");
                isDownloadStarted = false;
                isUpdateProcessStarted = false;
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("download_started", true);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
            }
        }
        current_version = ((SharedPreferences) (obj1)).getString("admarvel_current_version", "-1");
        s = ((AdMarvelXMLElement)s.get(0)).getData();
        ((android.content.SharedPreferences.Editor) (obj)).putString("download_csv_url", s);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        s = new DownloadAndUnZip(new URL(s), childDirectory.getAbsolutePath(), false, (Context)activityReference.get());
        s.run();
        s = s.getUnzipFilesAbsPath();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_2168;
        }
        if (s.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_2168;
        }
        Logging.log("Offline SDK: Writing Utility Objects for offline Ads");
        AdmarvelOfflineUtils.writeUtilityObjects(adMarvelDir, (String)s.get(0));
        AdmarvelOfflineUtils.writeBannerPathMAP(adMarvelDir, (String)s.get(1));
        Logging.log("Offline SDK: Writing BannerPathMAP for offline Ads");
_L19:
        obj5 = new CSVReader(new InputStreamReader(new FileInputStream((String)s.get(1))));
        s = ((CSVReader) (obj5)).getAllData();
        obj2 = new ArrayList();
        obj6 = new HashMap();
        if (s == null) goto _L11; else goto _L10
_L10:
        Object obj7 = s.iterator();
_L20:
        if (((Iterator) (obj7)).hasNext()) goto _L13; else goto _L12
_L12:
        ((CSVReader) (obj5)).close();
        AdmarvelOfflineUtils.writeObjectToFile(adMarvelDir, obj6, "/banner_folder_map");
        obj5 = new BannerFolderName();
        ((BannerFolderName) (obj5)).setBannerFolderName(((ArrayList) (obj2)));
        if (!((SharedPreferences) (obj1)).getString("/previous_banner_packages", "NULL").equals("NULL")) goto _L15; else goto _L14
_L14:
        ((android.content.SharedPreferences.Editor) (obj)).putString("/previous_banner_packages", "/previous_banner_packages");
        AdmarvelOfflineUtils.writeObjectToFile(adMarvelDir, obj5, "/previous_banner_packages");
        if (!((android.content.SharedPreferences.Editor) (obj)).commit())
        {
            throw new Exception("previous banner packages list not added to shared preference");
        }
          goto _L16
        s;
        Logging.log((new StringBuilder("Offline SDK:")).append(s.getMessage()).toString());
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
_L2:
        obj7 = (String)((Iterator) (obj6)).next();
        if (!((String)((LinkedHashMap) (obj5)).get(obj7)).equals(""))
        {
            ((android.content.SharedPreferences.Editor) (obj)).putString(((String) (obj7)), (String)((LinkedHashMap) (obj5)).get(obj7));
        }
          goto _L17
        s;
        Logging.log((new StringBuilder("Offline SDK:")).append(s.getMessage()).toString());
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
_L9:
        s = null;
          goto _L18
        s;
        Logging.log("Offline SDK: Exception in Writing Utility Objects for offline Ads");
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("download_started", true);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        updateVersionNumber(((android.content.SharedPreferences.Editor) (obj)), "-1");
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
        obj2;
        Logging.log("Offline SDK:Eror writing BannerPathMAP for offline Ads");
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("download_started", true);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
          goto _L19
        s;
        Logging.log((new StringBuilder("Offline SDK:")).append(s.getMessage()).toString());
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
_L13:
        String as[] = (String[])((Iterator) (obj7)).next();
        if (!isCancelled())
        {
            Object obj8 = (new StringBuilder(String.valueOf(as[0]))).append("_").append(as[1]).toString();
            ((ArrayList) (obj2)).add(obj8);
            ((HashMap) (obj6)).put(as[0], obj8);
            File file = new File((new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(((String) (obj8))).toString());
            if (!file.isDirectory())
            {
                file.mkdirs();
            }
            DownloadAndUnZip downloadandunzip = new DownloadAndUnZip(new URL(URLDecoder.decode(as[2], "UTF-8")), (new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(((String) (obj8))).toString(), (Context)activityReference.get());
            obj8 = new Thread(downloadandunzip);
            ((Thread) (obj8)).start();
            ((Thread) (obj8)).join();
            if (downloadandunzip.isDownloadAndUnZipSucceded)
            {
                downloadedBannersCount = downloadedBannersCount + 1;
            }
        }
          goto _L20
        s;
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        obj = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("download_started", false);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        throw s;
        s;
        Logging.log("Offline SDK: Exception in Writing BANNER_FOLDER_MAP for offline Ads");
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        updateVersionNumber(((android.content.SharedPreferences.Editor) (obj)), "-1");
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("download_started", true);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
_L15:
        obj1 = (BannerFolderName)AdmarvelOfflineUtils.readObjectFromFile("/previous_banner_packages", "BannerFolderName", (Context)activityReference.get());
        if (obj1 == null) goto _L16; else goto _L21
_L21:
        ((BannerFolderName) (obj1)).getBannerFolderName().removeAll(((BannerFolderName) (obj5)).getBannerFolderName());
        Logging.log("Offline SDK:Deleting Obsolete Packages");
        obj1 = ((BannerFolderName) (obj1)).getBannerFolderName().iterator();
_L26:
        if (((Iterator) (obj1)).hasNext()) goto _L22; else goto _L16
_L16:
        AdmarvelOfflineUtils.writeObjectToFile(adMarvelDir, obj5, "/previous_banner_packages");
_L11:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1738;
        }
        if (downloadedBannersCount == s.size())
        {
            downloadedFolderSanityCheck();
        }
_L27:
        if (s == null) goto _L24; else goto _L23
_L23:
        if (downloadedBannersCount != s.size()) goto _L24; else goto _L25
_L25:
        double d = System.nanoTime() - l;
        Logging.log((new StringBuilder("Offline SDK:Admarvel SDK Offline Packager Downloads Completed at ( ")).append(d * 1.0000000000000001E-09D).append("s").toString());
        Logging.log((new StringBuilder("Offline SDK:")).append(downloadedBannersCount).append("packages downloaded").toString());
        updateVersionNumber(((android.content.SharedPreferences.Editor) (obj)), versionNo);
_L4:
        isDownloadStarted = false;
        isUpdateProcessStarted = false;
        s = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0).edit();
        s.putBoolean("download_started", false);
        s.commit();
        return;
_L22:
        Object obj3 = (String)((Iterator) (obj1)).next();
        obj3 = new File(childDirectory, ((String) (obj3)));
        if (((File) (obj3)).isDirectory())
        {
            ZipUtils.deleteDirectory(((File) (obj3)));
        }
          goto _L26
_L24:
        Logging.log("Offline SDK:Admarvel SDK Offline Packager Downloads interupted because of Above erors");
          goto _L4
_L7:
        int i;
        Object obj4 = (new StringBuilder(String.valueOf(((SharedPreferences) (obj1)).getString("childDirectory", "NULL")))).append("/").append(mPartnerId).append(".csv").toString();
        s = (new StringBuilder(String.valueOf(((SharedPreferences) (obj1)).getString("childDirectory", "NULL")))).append("/").append(mPartnerId).append("_banners.csv").toString();
        obj4 = new File(((String) (obj4)));
        s = new File(s);
        if (!((File) (obj4)).exists() || !s.exists())
        {
            s = ((SharedPreferences) (obj1)).getString("download_csv_url", "NULL");
            if (!s.equals("NULL"))
            {
                (new DownloadAndUnZip(new URL(s), childDirectory.getAbsolutePath(), false, (Context)activityReference.get())).run();
            }
        }
        i = ((SharedPreferences) (obj1)).getInt("completed_banners_count", -1);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_2144;
        }
        DownloadRestAdContent();
        postValue = "Update Not Available";
        utilityObjectFilesSanity();
        updateVersionNumber(((android.content.SharedPreferences.Editor) (obj)), versionNo);
          goto _L4
        s = null;
          goto _L27
    }

    private void downloadedFolderSanityCheck()
    {
        if (activityReference.get() != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0)) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((SharedPreferences) (obj)).edit();
        if (completeAdContentPathList == null)
        {
            completeAdContentPathList = (ArrayList)AdmarvelOfflineUtils.readObjectFromFile("/complete_ad_content_path_list", "/complete_ad_content_path_list", (Context)activityReference.get());
        }
        if (completeAdContentPathList != null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((android.content.SharedPreferences.Editor) (obj)).putString("admarvel_current_version", "-1");
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        checkforUpdate();
_L5:
        obj = ((Activity)activityReference.get()).getDir("Admarvel", 0);
        if (obj != null)
        {
            obj = new File(((File) (obj)), "/complete_ad_content_path_list");
            if (((File) (obj)).exists())
            {
                ((File) (obj)).delete();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        Iterator iterator = completeAdContentPathList.iterator();
_L7:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        if ((new File((String)iterator.next())).exists()) goto _L7; else goto _L6
_L6:
        ((android.content.SharedPreferences.Editor) (obj)).putString("admarvel_current_version", "-1");
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        checkforUpdate();
          goto _L5
    }

    private void updateVersionNumber(android.content.SharedPreferences.Editor editor, String s)
    {
        if (editor != null && s != null)
        {
            editor.putString("admarvel_current_version", s);
            if (!editor.commit())
            {
                Logging.log("Offline SDK:package cannot be downloaded because current version cannot be comitted ");
                isDownloadStarted = false;
                isUpdateProcessStarted = false;
            }
        }
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        return checkforUpdate();
    }

    protected void onCancelled()
    {
        super.onCancelled();
        Object obj = (new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(mPartnerId).append("_banners.csv").toString();
        Object obj1 = (new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(mPartnerId).append(".csv").toString();
        obj = new File(((String) (obj)));
        obj1 = new File(((String) (obj1)));
        Object obj2;
        if (activityReference.get() != null)
        {
            if ((obj2 = ((Activity)activityReference.get()).getSharedPreferences("admarvel_preferences", 0)) != null)
            {
                obj2 = ((SharedPreferences) (obj2)).edit();
                if (!((File) (obj)).exists() || !((File) (obj1)).exists())
                {
                    ((android.content.SharedPreferences.Editor) (obj2)).putString("admarvel_current_version", "-1");
                }
                ((android.content.SharedPreferences.Editor) (obj2)).putInt("completed_banners_count", downloadedBannersCount);
                ((android.content.SharedPreferences.Editor) (obj2)).commit();
                AdmarvelOfflineUtils.writeObjectToFile(adMarvelDir, completeAdContentPathList, "/complete_ad_content_path_list");
                return;
            }
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        super.onPostExecute(void1);
    }

    public void utilityObjectFilesSanity()
    {
        HashMap hashmap = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/site_id_banner_map", "/site_id_banner_map", mActivity);
        HashMap hashmap1 = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/ad_link_object", "/ad_link_object", mActivity);
        String s = (new StringBuilder(String.valueOf(childDirectory.getAbsolutePath()))).append("/").append(mPartnerId).append(".csv").toString();
        if (s != null && hashmap == null || hashmap1 == null)
        {
            AdmarvelOfflineUtils.writeUtilityObjects(adMarvelDir, s);
        }
    }







}
