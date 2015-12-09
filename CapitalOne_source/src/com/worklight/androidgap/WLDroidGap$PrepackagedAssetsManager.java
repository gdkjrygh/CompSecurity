// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.worklight.common.WLUtils;
import com.worklight.utils.Base64;
import com.worklight.utils.SecurityUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap:
//            WLDroidGap

public class this._cls0
{
    class Checksum
        implements Comparable
    {

        private String checksum;
        private Long date;
        private String machine;
        final WLDroidGap.PrepackagedAssetsManager this$1;

        public int compareTo(Checksum checksum1)
        {
            if (checksum.compareTo(checksum1.checksum) != 0)
            {
                return date.compareTo(checksum1.date);
            } else
            {
                return 0;
            }
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((Checksum)obj);
        }

        public String getChecksum()
        {
            return checksum;
        }

        public Long getDate()
        {
            return date;
        }

        public String getMachine()
        {
            return machine;
        }

        public Checksum(JSONObject jsonobject)
            throws JSONException
        {
            this$1 = WLDroidGap.PrepackagedAssetsManager.this;
            super();
            checksum = jsonobject.getString("checksum");
            date = Long.valueOf(jsonobject.getLong("date"));
            machine = jsonobject.getString("machine");
        }
    }


    final WLDroidGap this$0;

    private void copyPrepackagedAssetsToLocalCopy()
    {
        Object obj;
        byte abyte0[];
        AssetManager assetmanager;
        boolean flag;
        long l;
        long l1;
        assetmanager = getApplicationContext().getAssets();
        boolean flag1;
        boolean flag2;
        try
        {
            WLUtils.deleteDirectory(new File(getLocalStorageWebRoot()));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            WLUtils.error(String.format("Problem deleting directory %s. This might happen if the application was installed, then the shareduserID was changed, and the application was redeployed", new Object[] {
                getLocalStorageWebRoot()
            }));
            System.exit(0);
        }
        WLUtils.debug("Started copying files to local storage...");
        abyte0 = null;
        flag1 = false;
        flag2 = Arrays.asList(assetmanager.list("www")).contains("resources.zip");
        obj = abyte0;
        flag1 = flag2;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        flag1 = flag2;
        obj = assetmanager.open("www/resources.zip");
        flag1 = flag2;
_L6:
        if (!flag1) goto _L2; else goto _L1
_L1:
        WLUtils.debug("Found resources.zip file. Starting decryption and unzipping process.");
        abyte0 = Base64.decode("JfnnlDI7RTiF9RgfG2JNCw==".getBytes());
        l = assetmanager.openFd("www/resources.zip").getLength();
        l1 = WLUtils.getFreeSpaceOnDevice();
        if (3L * l < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l > 0L) goto _L4; else goto _L3
_L3:
        try
        {
            WLUtils.debug("Failed unzipping Resources.zip. File seems to be corruptted.");
            return;
        }
        catch (IOException ioexception)
        {
            WLUtils.debug((new StringBuilder("Error while unpacking resources.zip file.")).append(ioexception.getMessage()).toString());
            ioexception.printStackTrace();
        }
        catch (Exception exception)
        {
            WLUtils.debug((new StringBuilder("Error during decryption of resources.zip file.")).append(exception.getMessage()).toString());
        }
          goto _L5
        obj;
        WLUtils.debug((new StringBuilder("I/O failure while reading resources.zip from application package.")).append(((IOException) (obj)).getMessage()).toString());
        obj = abyte0;
          goto _L6
_L4:
        if (!flag) goto _L8; else goto _L7
_L7:
        WLUtils.unpack(SecurityUtils.decryptData(((InputStream) (obj)), abyte0), new File(getLocalStorageWebRoot()));
        WLUtils.debug("Resources.zip unzipped");
_L5:
        WLUtils.debug("Finished copying files to local storage...");
        return;
_L8:
        WLUtils.debug((new StringBuilder("Resources.zip cannot be unzipped. Not enough space available on the device. Required size: ")).append(3L * l).append(" Available size: ").append(l1).toString());
        DecimalFormat decimalformat = new DecimalFormat("#.##");
        WLUtils.showDialog(WLDroidGap.this, "Error", (new StringBuilder("The application needs ")).append(decimalformat.format((double)(3L * l) / 1048576D)).append(" MB to initialize, but only ").append(decimalformat.format((double)l1 / 1048576D)).append(" MB are available. Please free some space and try again.").toString(), "Exit", new android.content.DialogInterface.OnClickListener() {

            final WLDroidGap.PrepackagedAssetsManager this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                System.exit(0);
            }

            
            {
                this$1 = WLDroidGap.PrepackagedAssetsManager.this;
                super();
            }
        });
        WLDroidGap.access$1(WLDroidGap.this, true);
        return;
_L2:
        copyPrepackagedAssetsToLocalCopy(assetmanager, "www", getLocalStorageRoot());
        copyPrepackagedAssetsToLocalCopy(assetmanager, "wlclient.properties", getLocalStorageWebRoot());
        if (true) goto _L5; else goto _L9
_L9:
    }

    private void copyPrepackagedAssetsToLocalCopy(AssetManager assetmanager, String s, String s1)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        File file;
        obj3 = null;
        obj1 = null;
        obj6 = null;
        obj2 = null;
        obj8 = null;
        obj7 = null;
        file = new File((new StringBuilder(String.valueOf(s1))).append("/").append(s).toString());
        obj5 = obj2;
        obj4 = obj8;
        Object obj = assetmanager.open(s);
        obj6 = obj;
        obj3 = obj;
        obj5 = obj2;
        obj1 = obj;
        obj4 = obj8;
        obj2 = new FileOutputStream(file);
        WLUtils.copyFile(((InputStream) (obj)), ((OutputStream) (obj2)));
        obj6 = obj2;
        obj7 = obj;
_L2:
        String as[];
        int i;
        if (obj7 != null)
        {
            try
            {
                ((InputStream) (obj7)).close();
            }
            // Misplaced declaration of an exception variable
            catch (AssetManager assetmanager)
            {
                WLUtils.error((new StringBuilder("Failed close file input stream: ")).append(s).append(". ").append(assetmanager.toString()).toString());
            }
        }
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        ((OutputStream) (obj6)).close();
        return;
        obj;
        obj2 = obj7;
        obj = obj6;
_L8:
        obj3 = obj;
        obj5 = obj2;
        obj1 = obj;
        obj4 = obj2;
        file.mkdirs();
        obj3 = obj;
        obj5 = obj2;
        obj1 = obj;
        obj4 = obj2;
        as = assetmanager.list(s);
        i = 0;
_L3:
        obj7 = obj;
        obj6 = obj2;
        obj3 = obj;
        obj5 = obj2;
        obj1 = obj;
        obj4 = obj2;
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        obj3 = obj;
        obj5 = obj2;
        obj1 = obj;
        obj4 = obj2;
        copyPrepackagedAssetsToLocalCopy(assetmanager, (new StringBuilder(String.valueOf(s))).append("/").append(as[i]).toString(), s1);
        i++;
          goto _L3
        assetmanager;
        obj4 = obj5;
        obj = obj3;
_L7:
        obj1 = obj;
        throw new RuntimeException((new StringBuilder("PrepackagedAssetsManager Failure. Failed copying prepackaged assets to local storage. The exception occurred when copying the following file/directory: ")).append(file.getAbsoluteFile()).toString(), assetmanager);
        assetmanager;
        obj = obj1;
_L5:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                WLUtils.error((new StringBuilder("Failed close file input stream: ")).append(s).append(". ").append(s1.toString()).toString());
            }
        }
        if (obj4 != null)
        {
            try
            {
                ((OutputStream) (obj4)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                WLUtils.error((new StringBuilder("Failed close file output stream: ")).append(file.getAbsolutePath()).append(". ").append(s.toString()).toString());
            }
        }
        throw assetmanager;
        assetmanager;
        WLUtils.error((new StringBuilder("Failed close file output stream: ")).append(file.getAbsolutePath()).append(". ").append(assetmanager.toString()).toString());
        return;
        assetmanager;
        obj4 = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        assetmanager;
        obj4 = obj2;
        if (true) goto _L7; else goto _L6
_L6:
        IOException ioexception;
        ioexception;
          goto _L8
    }

    private void copyPrepackagedAssetsToLocalCopyIfNeeded()
    {
        if (isNewPackage())
        {
            WLUtils.debug("New installation/upgrade detected, copying resources and saving new checksum");
            WLUtils.clearWLPref(getApplicationContext());
            copyPrepackagedAssetsToLocalCopy();
        }
        WLDroidGap.access$0(WLDroidGap.this);
    }

    private boolean isNewPackage()
    {
label0:
        {
            boolean flag = false;
            try
            {
                long l = (new File(getPackageManager().getApplicationInfo(getPackageName(), 0).sourceDir)).lastModified();
                Object obj = getPreferences(0);
                if (l <= ((SharedPreferences) (obj)).getLong("appInstallTime", 0L))
                {
                    break label0;
                }
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.) (obj)).("appInstallTime", l);
                ((android.content.) (obj)).();
            }
            catch (android.content.pm. )
            {
                throw new RuntimeException("PrepackagedAssetsManager Failure. Can't retrieve ApplicationInfo - something fundumental went wrong here.", );
            }
            flag = true;
        }
        return flag;
    }


    public _cls1.this._cls1()
    {
        this$0 = WLDroidGap.this;
        super();
    }
}
