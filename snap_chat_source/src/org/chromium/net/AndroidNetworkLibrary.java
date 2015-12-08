// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.security.KeyChain;
import android.telephony.TelephonyManager;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;

// Referenced classes of package org.chromium.net:
//            X509Util, AndroidCertVerifyResult

class AndroidNetworkLibrary
{

    AndroidNetworkLibrary()
    {
    }

    public static void addTestRootCertificate(byte abyte0[])
    {
        X509Util.a(abyte0);
    }

    public static void clearTestRootCertificates()
    {
        X509Util.a();
    }

    private static boolean getIsRoaming(Context context)
    {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo().isRoaming();
    }

    public static String getMimeTypeFromExtension(String s)
    {
        return URLConnection.guessContentTypeFromName((new StringBuilder("foo.")).append(s).toString());
    }

    private static String getNetworkCountryIso(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            return "";
        } else
        {
            return context.getNetworkCountryIso();
        }
    }

    private static String getNetworkOperator(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            return "";
        } else
        {
            return context.getNetworkOperator();
        }
    }

    private static String getSimOperator(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            return "";
        } else
        {
            return context.getSimOperator();
        }
    }

    public static boolean haveOnlyLoopbackAddresses()
    {
        Object obj;
label0:
        {
            try
            {
                obj = NetworkInterface.getNetworkInterfaces();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                (new StringBuilder("could not get network interfaces: ")).append(obj);
                return false;
            }
            if (obj == null)
            {
                return false;
            }
            break label0;
        }
        SocketException socketexception;
        socketexception;
_L2:
        NetworkInterface networkinterface;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        networkinterface = (NetworkInterface)((Enumeration) (obj)).nextElement();
        boolean flag;
        if (!networkinterface.isUp())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = networkinterface.isLoopback();
        if (!flag)
        {
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return true;
    }

    public static boolean storeCertificate(Context context, int i, byte abyte0[])
    {
        Intent intent;
        try
        {
            intent = KeyChain.createInstallIntent();
            intent.addFlags(0x10000000);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            (new StringBuilder("could not store crypto file: ")).append(context);
            return false;
        }
        switch (i)
        {
        default:
            break MISSING_BLOCK_LABEL_83;

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_55;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        intent.putExtra("CERT", abyte0);
_L1:
        context.startActivity(intent);
        return true;
        intent.putExtra("PKCS12", abyte0);
          goto _L1
        return false;
    }

    public static boolean storeKeyPair(Context context, byte abyte0[], byte abyte1[])
    {
        try
        {
            Intent intent = KeyChain.createInstallIntent();
            intent.putExtra("PKEY", abyte1);
            intent.putExtra("KEY", abyte0);
            intent.addFlags(0x10000000);
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            (new StringBuilder("could not store key pair: ")).append(context);
            return false;
        }
        return true;
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte abyte0[][], String s, String s1)
    {
        try
        {
            abyte0 = X509Util.a(abyte0, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[][])
        {
            return new AndroidCertVerifyResult(-1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[][])
        {
            return new AndroidCertVerifyResult(-1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[][])
        {
            return new AndroidCertVerifyResult(-1);
        }
        return abyte0;
    }
}
