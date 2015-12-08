// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzra;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.analytics:
//            zzq, zzae, zzk, zzan

class zza
    implements zzq
{

    private final zzra zzAM;
    private final zzk zzAN;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzAO;
    private long zzAP;
    private String zzAQ;
    private boolean zzAR;
    private Object zzAS;

    zza(zzra zzra1, zzk zzk1)
    {
        zzAR = false;
        zzAS = new Object();
        zzx.zzl(zzra1);
        zzx.zzl(zzk1);
        zzAM = zzra1;
        zzAN = zzk1;
    }

    static String zzB(Context context)
    {
        Object obj = null;
        byte abyte0[];
        FileInputStream fileinputstream;
        int i;
        fileinputstream = context.openFileInput("gaClientIdData");
        abyte0 = new byte[128];
        i = fileinputstream.read(abyte0, 0, 128);
        if (fileinputstream.available() <= 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzae.zzac("Hash file seems corrupted, deleting it.");
        fileinputstream.close();
        context.deleteFile("gaClientIdData");
        return null;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzae.zzaa("Hash file is empty.");
        fileinputstream.close();
        return null;
        Object obj1 = new String(abyte0, 0, i);
        fileinputstream.close();
        return ((String) (obj1));
        obj1;
_L2:
        zzae.zzac("Error reading Hash file, deleting it.");
        context.deleteFile("gaClientIdData");
        return ((String) (obj));
        IOException ioexception;
        ioexception;
        ioexception = ((IOException) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        context;
        return ((String) (obj1));
        context;
        return null;
    }

    private boolean zza(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info1)
    {
        Object obj;
        String s;
        obj = null;
        if (info1 == null)
        {
            info1 = null;
        } else
        {
            info1 = info1.getId();
        }
        if (TextUtils.isEmpty(info1))
        {
            return true;
        }
        s = zzAN.getValue("&cid");
        Object obj1 = zzAS;
        obj1;
        JVM INSTR monitorenter ;
        if (zzAR) goto _L2; else goto _L1
_L1:
        zzAQ = zzB(zzAM.getContext());
        zzAR = true;
_L4:
        info = zzah((new StringBuilder()).append(info1).append(s).toString());
        if (!TextUtils.isEmpty(info))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        return false;
        info;
        obj1;
        JVM INSTR monitorexit ;
        throw info;
_L2:
        if (!TextUtils.isEmpty(zzAQ)) goto _L4; else goto _L3
_L3:
        if (info != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        info = obj;
_L5:
        if (info != null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        boolean flag = zzai((new StringBuilder()).append(info1).append(s).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        info = info.getId();
          goto _L5
        zzAQ = zzah((new StringBuilder()).append(info).append(s).toString());
          goto _L4
        if (!info.equals(zzAQ))
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj1;
        JVM INSTR monitorexit ;
        return true;
        if (TextUtils.isEmpty(zzAQ))
        {
            break MISSING_BLOCK_LABEL_288;
        }
        zzae.zzab("Resetting the client id because Advertising Id changed.");
        info = zzAN.zzfw();
        zzae.zzab((new StringBuilder("New client Id: ")).append(info).toString());
_L6:
        flag = zzai((new StringBuilder()).append(info1).append(info).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        info = s;
          goto _L6
    }

    static String zzah(String s)
    {
        MessageDigest messagedigest = zzan.zzav("MD5");
        if (messagedigest == null)
        {
            return null;
        } else
        {
            return String.format(Locale.US, "%032X", new Object[] {
                new BigInteger(1, messagedigest.digest(s.getBytes()))
            });
        }
    }

    private boolean zzai(String s)
    {
        try
        {
            s = zzah(s);
            zzae.zzab("Storing hashed adid.");
            FileOutputStream fileoutputstream = zzAM.getContext().openFileOutput("gaClientIdData", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
            zzAQ = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzae.zzZ("Error creating hash file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzae.zzZ("Error writing to hash file.");
            return false;
        }
        return true;
    }

    public String getValue(String s)
    {
        long l = System.currentTimeMillis();
        if (Math.abs(l - zzAP) > 1000L)
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = zzeZ();
            if (zza(zzAO, info))
            {
                zzAO = info;
            } else
            {
                zzAO = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info("", false);
            }
            zzAP = l;
        }
        if (zzAO != null)
        {
            if ("&adid".equals(s))
            {
                return zzAO.getId();
            }
            if ("&ate".equals(s))
            {
                if (zzAO.isLimitAdTrackingEnabled())
                {
                    return "0";
                } else
                {
                    return "1";
                }
            }
        }
        return null;
    }

    com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzeZ()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(zzAM.getContext());
        }
        catch (IllegalStateException illegalstateexception)
        {
            zzae.zzac("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            zzae.zzac("GooglePlayServicesRepairableException getting Ad Id Info");
            return null;
        }
        catch (IOException ioexception)
        {
            zzae.zzac("IOException getting Ad Id Info");
            return null;
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            zzae.zzac("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return null;
        }
        catch (Throwable throwable)
        {
            zzae.zzac("Unknown exception. Could not get the ad Id.");
            return null;
        }
        return info;
    }
}
