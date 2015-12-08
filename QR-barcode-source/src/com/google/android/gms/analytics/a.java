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
//            l, h, z, aj

class a
    implements l
{

    private static a xA;
    private static Object xz = new Object();
    private Context mContext;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info xB;
    private long xC;
    private String xD;
    private boolean xE;
    private Object xF;

    a(Context context)
    {
        xE = false;
        xF = new Object();
        mContext = context.getApplicationContext();
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
        h.y(mContext);
        h1 = h.dQ();
        s = h1.getValue("&cid");
        Object obj1 = xF;
        obj1;
        JVM INSTR monitorenter ;
        if (xE) goto _L2; else goto _L1
_L1:
        xD = x(mContext);
        xE = true;
_L4:
        info = aa((new StringBuilder()).append(info1).append(s).toString());
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
        if (!TextUtils.isEmpty(xD)) goto _L4; else goto _L3
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
        boolean flag = ab((new StringBuilder()).append(info1).append(s).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        info = info.getId();
          goto _L5
        xD = aa((new StringBuilder()).append(info).append(s).toString());
          goto _L4
        if (!info.equals(xD))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj1;
        JVM INSTR monitorexit ;
        return true;
        if (TextUtils.isEmpty(xD))
        {
            break MISSING_BLOCK_LABEL_296;
        }
        z.V("Resetting the client id because Advertising Id changed.");
        info = h1.dR();
        z.V((new StringBuilder()).append("New client Id: ").append(info).toString());
_L6:
        flag = ab((new StringBuilder()).append(info1).append(info).toString());
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        info = s;
          goto _L6
    }

    static String aa(String s)
    {
        MessageDigest messagedigest = aj.ap("MD5");
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

    private boolean ab(String s)
    {
        try
        {
            s = aa(s);
            z.V("Storing hashed adid.");
            FileOutputStream fileoutputstream = mContext.openFileOutput("gaClientIdData", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
            xD = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            z.T("Error creating hash file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            z.T("Error writing to hash file.");
            return false;
        }
        return true;
    }

    public static l w(Context context)
    {
        if (xA == null)
        {
            synchronized (xz)
            {
                if (xA == null)
                {
                    xA = new a(context);
                }
            }
        }
        return xA;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String x(Context context)
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
        z.W("Hash file seems corrupted, deleting it.");
        fileinputstream.close();
        context.deleteFile("gaClientIdData");
        return null;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        z.U("Hash file is empty.");
        fileinputstream.close();
        return null;
        Object obj1 = new String(abyte0, 0, i);
        fileinputstream.close();
        return ((String) (obj1));
        obj1;
_L2:
        z.W("Error reading Hash file, deleting it.");
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

    com.google.android.gms.ads.identifier.AdvertisingIdClient.Info dG()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
        }
        catch (IllegalStateException illegalstateexception)
        {
            z.W("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            z.W("GooglePlayServicesRepairableException getting Ad Id Info");
            return null;
        }
        catch (IOException ioexception)
        {
            z.W("IOException getting Ad Id Info");
            return null;
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            z.W("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return null;
        }
        catch (Throwable throwable)
        {
            z.W("Unknown exception. Could not get the ad Id.");
            return null;
        }
        return info;
    }

    public String getValue(String s)
    {
        long l1 = System.currentTimeMillis();
        if (l1 - xC > 1000L)
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = dG();
            if (a(xB, info))
            {
                xB = info;
            } else
            {
                xB = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info("", false);
            }
            xC = l1;
        }
        if (xB != null)
        {
            if ("&adid".equals(s))
            {
                return xB.getId();
            }
            if ("&ate".equals(s))
            {
                if (xB.isLimitAdTrackingEnabled())
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
