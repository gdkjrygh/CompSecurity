// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.analytics:
//            m, ak, aa, h

class a
    implements m
{

    private static Object tn = new Object();
    private static a to;
    private Context mContext;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info tp;
    private long tq;
    private String tr;
    private boolean ts;
    private Object tt;

    a(Context context)
    {
        ts = false;
        tt = new Object();
        mContext = context.getApplicationContext();
    }

    static String H(String s)
    {
        MessageDigest messagedigest = ak.W("MD5");
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

    private boolean I(String s)
    {
        try
        {
            s = H(s);
            aa.C("Storing hashed adid.");
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientIdData", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
            tr = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aa.A("Error creating hash file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aa.A("Error writing to hash file.");
            return false;
        }
        return true;
    }

    private boolean a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info1)
    {
        Object obj;
        String s;
        h h1;
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
        h.r(mContext);
        h1 = h.cq();
        s = h1.getValue("&cid");
        Object obj1 = tt;
        obj1;
        JVM INSTR monitorenter ;
        if (ts) goto _L2; else goto _L1
_L1:
        tr = q(mContext);
        ts = true;
_L4:
        info = H((new StringBuilder()).append(info1).append(s).toString());
        if (!TextUtils.isEmpty(info))
        {
            break MISSING_BLOCK_LABEL_207;
        }
        return false;
        info;
        obj1;
        JVM INSTR monitorexit ;
        throw info;
_L2:
        if (!TextUtils.isEmpty(tr)) goto _L4; else goto _L3
_L3:
        if (info != null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        info = obj;
_L5:
        if (info != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        boolean flag = I((new StringBuilder()).append(info1).append(s).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        info = info.getId();
          goto _L5
        tr = H((new StringBuilder()).append(info).append(s).toString());
          goto _L4
        if (!info.equals(tr))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj1;
        JVM INSTR monitorexit ;
        return true;
        if (TextUtils.isEmpty(tr))
        {
            break MISSING_BLOCK_LABEL_296;
        }
        aa.C("Resetting the client id because Advertising Id changed.");
        info = h1.cr();
        aa.C((new StringBuilder()).append("New client Id: ").append(info).toString());
_L6:
        flag = I((new StringBuilder()).append(info1).append(info).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        info = s;
          goto _L6
    }

    public static m p(Context context)
    {
        if (to == null)
        {
            synchronized (tn)
            {
                if (to == null)
                {
                    to = new a(context);
                }
            }
        }
        return to;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String q(Context context)
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
        aa.D("Hash file seems corrupted, deleting it.");
        fileinputstream.close();
        context.deleteFile("gaClientIdData");
        return null;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        aa.B("Hash file is empty.");
        fileinputstream.close();
        return null;
        Object obj1 = new String(abyte0, 0, i);
        fileinputstream.close();
        return ((String) (obj1));
        obj1;
_L2:
        aa.D("Error reading Hash file, deleting it.");
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

    com.google.android.gms.ads.identifier.AdvertisingIdClient.Info cf()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
        }
        catch (IllegalStateException illegalstateexception)
        {
            aa.D("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            aa.D("GooglePlayServicesRepairableException getting Ad Id Info");
            return null;
        }
        catch (IOException ioexception)
        {
            aa.D("IOException getting Ad Id Info");
            return null;
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            aa.D("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return null;
        }
        catch (Exception exception)
        {
            aa.D("Unknown exception. Could not get the ad Id.");
            return null;
        }
        return info;
    }

    public String getValue(String s)
    {
        long l = System.currentTimeMillis();
        if (l - tq > 1000L)
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = cf();
            if (a(tp, info))
            {
                tp = info;
            } else
            {
                tp = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info("", false);
            }
            tq = l;
        }
        if (tp != null)
        {
            if ("&adid".equals(s))
            {
                return tp.getId();
            }
            if ("&ate".equals(s))
            {
                if (tp.isLimitAdTrackingEnabled())
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

}
