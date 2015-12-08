// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.sdk.ssologin;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.sdk.ssologin:
//            a

public class SsoService extends Service
{

    public static final String DATA_APPLICATION_SID = "com.cleanmaster.sdk.cmloginsdk.data.APPLICATION_SID";
    public static final String EXTRA_APPLICATION_PID = "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_PID";
    public static final String EXTRA_APPLICATION_SID = "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SID";
    public static final String EXTRA_APPLICATION_SSOTOKEN = "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SSOTOKEN";
    public static final int MESSAGE_GET_SID_ACCESS_TOKEN_REPLY = 0x10001;
    public static final int MESSAGE_GET_SID_ACCESS_TOKEN_REQUEST = 0x10000;
    public static final int MESSAGE_SET_CM_SID = 1;
    private static String cm_sid;
    private static boolean isRunning = false;
    final Messenger mMessenger = new Messenger(new a(this));

    public SsoService()
    {
    }

    private String findHash(String s)
    {
        PackageManager packagemanager = getPackageManager();
        Object obj = null;
        try
        {
            s = getPkgSignatureMD5(packagemanager.getPackageInfo(s, 64).signatures);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = obj;
        }
        return s[0];
    }

    private String findName(int i)
    {
label0:
        {
            Object obj = ((ActivityManager)getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
            if (obj == null || ((List) (obj)).size() <= 0)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
            } while (runningappprocessinfo.pid != i || runningappprocessinfo.pkgList.length <= 0);
            return runningappprocessinfo.pkgList[0];
        }
        return null;
    }

    public static boolean isRunning()
    {
        return isRunning;
    }

    private String toHexString(byte abyte0[], String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = Integer.toHexString(abyte0[i] & 0xff);
            if (s1.length() == 1)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(s1).append(s);
        }

        return stringbuilder.toString();
    }

    public String getMD5String(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.reset();
            messagedigest.update(abyte0);
            abyte0 = toHexString(messagedigest.digest(), "");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public String[] getPkgSignatureMD5(Signature asignature[])
    {
        if (asignature.length != 0 && asignature[0] != null)
        {
            asignature = asignature[0].toByteArray();
            if (asignature.length > 0)
            {
                Object obj = new ByteArrayInputStream(asignature);
                asignature = new String[2];
                try
                {
                    obj = (X509Certificate)CertificateFactory.getInstance("X509").generateCertificate(((java.io.InputStream) (obj)));
                    asignature[0] = getMD5String(Base64.encodeToString(((X509Certificate) (obj)).getEncoded(), 2).getBytes());
                    asignature[1] = ((X509Certificate) (obj)).getIssuerDN().toString();
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
                return asignature;
            }
        }
        return null;
    }

    public IBinder onBind(Intent intent)
    {
        return mMessenger.getBinder();
    }

    public void onCreate()
    {
        super.onCreate();
        Log.i("SSOService", "Service Started.");
        isRunning = true;
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i("SSOService", "Service Stopped.");
        isRunning = false;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Log.i("SSOService", (new StringBuilder("Received start id ")).append(j).append(": ").append(intent).toString());
        return 1;
    }




/*
    static String access$002(String s)
    {
        cm_sid = s;
        return s;
    }

*/


}
