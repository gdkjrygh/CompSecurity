// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.worklight.androidgap.api.WLInitWebFrameworkResult;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.utils.Base64;
import com.worklight.utils.MultifileAssetStream;
import com.worklight.utils.SecurityUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.worklight.androidgap:
//            WLInitError

public class PrepackagedAssetsManager
{

    private static final String RESOURCES_ZIP = "resources.zip";
    ApplicationInfo appInfo;
    private long appInstallTime;
    AssetManager assetManager;
    private Logger logger;

    public PrepackagedAssetsManager(Context context)
    {
        appInstallTime = -1L;
        logger = Logger.getInstance("prepackagedAssetManager");
        try
        {
            assetManager = context.getAssets();
            appInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new WLInitError(WLInitWebFrameworkResult.FAILURE_INTERNAL, "PrepackagedAssetsManager Failure. Can't retrieve ApplicationInfo - something fundumental went wrong here.", context);
        }
    }

    private String calculateChecksum()
    {
        String s = WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles();
        if ((new File(s)).isDirectory() && WLConfig.getInstance().isExternalWebResources())
        {
            s = Long.toString(WLUtils.computeChecksumOnExternal(s));
        } else
        {
            s = Long.toString(computeChecksumOnBundle());
        }
        return SecurityUtils.hashData(s, "SHA-1");
    }

    private void checkFreeSpaceOnDevice()
    {
        long l = Long.parseLong(WLConfig.getInstance().getWebResourcesUnpackedSize()) + 0x100000L;
        if (l > WLUtils.getFreeSpaceOnDevice())
        {
            Object obj = new DecimalFormat("#.##");
            obj = (new StringBuilder()).append("Application installation has failed because there is no sufficient storage space available. Free ").append(((DecimalFormat) (obj)).format((double)l / 1048576D)).append(" MB and relaunch the application").toString();
            HashMap hashmap = new HashMap();
            hashmap.put(WLInitWebFrameworkResult.DATA_SPACE_REQUIRED, Long.valueOf(l));
            throw new WLInitError(WLInitWebFrameworkResult.FAILURE_NOT_ENOUGH_SPACE, ((String) (obj)), hashmap);
        } else
        {
            return;
        }
    }

    private long computeChecksumOnBundle()
    {
        Object obj = null;
        String as[] = readZipToString(assetManager.open("assets.zip")).replace("\n", "").split(";");
        obj = as;
_L3:
        CRC32 crc32;
        Object obj1;
        IOException ioexception;
        String s;
        Iterator iterator;
        if (obj == null)
        {
            obj = getBundleTree("www", assetManager, new ArrayList());
        } else
        {
            obj = Arrays.asList(((Object []) (obj)));
        }
        Collections.sort(((List) (obj)));
        crc32 = new CRC32();
        iterator = ((List) (obj)).iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        obj = s;
        obj1 = s;
        if (s.startsWith("www"))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj1 = s;
        obj = (new StringBuilder()).append("www/").append(s).toString();
        obj1 = obj;
        try
        {
            WLUtils.calculateCheckSum(assetManager.open(((String) (obj)), 3), crc32);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            logger.debug((new StringBuilder()).append("Failed to find file ").append(((String) (obj1))).toString(), ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L1
        ioexception;
        logger.debug("Failed to read assets list from assets.txt, this may cause poor permormance at application startup.", ioexception);
          goto _L3
_L1:
        return crc32.getValue();
    }

    private void deleteOldAssets()
    {
        try
        {
            WLUtils.deleteDirectory(new File(WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles()));
            return;
        }
        catch (Exception exception)
        {
            String s = String.format("Failed deleting directory %s. This might happen if the application was installed, then the shareduserID  in AndroidManifest.xml was changed, and the application was redeployed.", new Object[] {
                WLConfig.getInstance().getWebResourcesUrl()
            });
            throw new WLInitError(WLInitWebFrameworkResult.FAILURE_INTERNAL, s, exception);
        }
    }

    private List getBundleTree(String s, AssetManager assetmanager, List list)
    {
        String as[] = assetmanager.list(s);
        if (as == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L8:
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        if (as[i].contains(".")) goto _L5; else goto _L4
_L4:
        getBundleTree((new StringBuilder()).append(s).append("/").append(as[i]).toString(), assetmanager, list);
          goto _L6
_L5:
        if (!isMediaFile(s))
        {
            list.add((new StringBuilder()).append(s).append("/").append(as[i]).toString());
        }
          goto _L6
        s;
        logger.debug("An error occured while proccessing the bundle tree", s);
_L2:
        return list;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean isMediaFile(String s)
    {
        String as[];
        boolean flag;
        boolean flag1;
        flag1 = false;
        as = WLConfig.getInstance().getMediaExtensions();
        flag = flag1;
        if (as == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s = s.substring(s.lastIndexOf(".") + 1, s.length());
        j = as.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (!as[i].equals(s)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean isResourcesZippedInApk()
    {
        String as[];
        int i;
        int j;
        boolean flag;
        try
        {
            as = assetManager.list("www");
        }
        catch (IOException ioexception)
        {
            throw new WLInitError(WLInitWebFrameworkResult.FAILURE_INTERNAL, "Cannot retrive www list under assets", ioexception);
        }
        if (as == null) goto _L2; else goto _L1
_L1:
        if (as.length <= 0) goto _L2; else goto _L3
_L3:
        j = as.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = as[i].contains("resources.zip");
        if (flag)
        {
            return true;
        }
        i++;
        if (true) goto _L4; else goto _L2
_L2:
        return false;
    }

    private String readZipToString(InputStream inputstream)
        throws IOException
    {
        Object obj = null;
        inputstream = new ZipInputStream(new BufferedInputStream(inputstream));
        if (inputstream.getNextEntry() == null) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        obj = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
_L5:
        int i = inputstream.read(abyte0);
        if (i == -1) goto _L4; else goto _L3
_L3:
        ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i);
          goto _L5
        obj;
_L7:
        inputstream.close();
        throw obj;
_L4:
        obj = new String(((ByteArrayOutputStream) (obj)).toByteArray());
        inputstream.close();
        return ((String) (obj));
_L2:
        inputstream.close();
        return "";
        Exception exception;
        exception;
        inputstream = ((InputStream) (obj));
        obj = exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean unzipAssetsToLocalCopy()
    {
        Object obj;
        Object obj1;
        checkFreeSpaceOnDevice();
        logger.debug("Started copying files to local storage...");
        obj1 = null;
        long l = 0L;
        boolean flag = false;
        int i;
        try
        {
            obj = new MultifileAssetStream("www/resources.zip", assetManager);
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception = ((IOException) (obj1));
            continue; /* Loop/switch isn't completed */
        }
        i = ((InputStream) (obj)).available();
        l = i;
        flag = true;
_L4:
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        IOException ioexception;
        try
        {
            obj1 = new MultifileAssetStream("www/resources.zip.unencrypted", assetManager);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = ((InputStream) (obj1)).available();
        l = i;
        flag = false;
        obj = obj1;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        logger.debug("Found resources zip stream. Starting decryption and unzipping process.");
        obj1 = Base64.decode("JfnnlDI7RTiF9RgfG2JNCw==".getBytes());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = SecurityUtils.decryptData(((InputStream) (obj)), ((byte []) (obj1)));
        WLUtils.unpack(((InputStream) (obj)), new File(WLConfig.getInstance().getApplicationAbsolutePathToExternalWWWFiles()));
        logger.debug("Resources.zip unzipped");
        logger.debug("Finished copying files to local storage...");
        return true;
        ioexception;
        obj1 = (new StringBuilder()).append("Cannot install or update the application, because failed to extract the application's web resources with ").append(ioexception.getMessage()).toString();
        throw new WLInitError(WLInitWebFrameworkResult.FAILURE_UNZIP, ((String) (obj1)), ioexception);
        ioexception;
        obj1 = (new StringBuilder()).append("Cannot install or update the application, because failed to decrypt the application's web resources with ").append(ioexception.getMessage()).toString();
        throw new WLInitError(WLInitWebFrameworkResult.FAILURE_UNZIP, ((String) (obj1)), ioexception);
        IOException ioexception1;
        ioexception1;
        ioexception1 = ((IOException) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception2;
        ioexception2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void copyPrepackagedAssetsToLocalStorage()
    {
        logger.debug("New installation/upgrade detected, copying resources and saving new checksum");
        WLConfig.getInstance().clearWLPref();
        deleteOldAssets();
        if (isResourcesZippedInApk())
        {
            if (unzipAssetsToLocalCopy())
            {
                WLConfig.getInstance().setExternalWebResourcesPref(true);
                WLConfig.getInstance().setApplicationInstallTime(appInstallTime);
                return;
            } else
            {
                WLConfig.getInstance().setExternalWebResourcesPref(false);
                return;
            }
        } else
        {
            WLConfig.getInstance().setExternalWebResourcesPref(false);
            WLConfig.getInstance().setApplicationInstallTime(appInstallTime);
            return;
        }
    }

    public boolean isNewInstallOrUpgrade()
    {
        boolean flag = false;
        long l;
        long l1;
        try
        {
            appInstallTime = (new File(appInfo.sourceDir)).lastModified();
            l = WLConfig.getInstance().getApplicationInstallTime();
            l1 = appInstallTime;
        }
        catch (Exception exception)
        {
            throw new WLInitError(WLInitWebFrameworkResult.FAILURE_INTERNAL, "PrepackagedAssetsManager Failure. Can't retrieve ApplicationInfo - something fundumental went wrong here.", exception);
        }
        if (l1 != l)
        {
            flag = true;
        }
        return flag;
    }

    public void testResourcesChecksum()
    {
        String s;
        String s1;
label0:
        {
            logger.debug("start web resource integrity test");
            s = calculateChecksum();
            s1 = WLConfig.getInstance().getResourceChecksumPref();
            if (!s.equals(s1))
            {
                logger.debug(String.format("Checksomes are different, current checksum is %s, last checksum was %s", new Object[] {
                    s, s1
                }));
                if (s1 != null)
                {
                    break label0;
                }
                logger.debug("Save web resources checksum on device");
                WLConfig.getInstance().setResourceChecksumPref(s);
            }
            return;
        }
        s = (new StringBuilder()).append("Application failed to load, because its checksum ").append(s1).append(" does not match ").append(s).append(". This may indicate unintended change to the application.").toString();
        throw new WLInitError(WLInitWebFrameworkResult.FAILURE_CHECKSUM, s);
    }
}
