// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.security.KeyChain;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.chromium.net:
//            X509Util, AndroidCertVerifyResult

class AndroidNetworkLibrary
{

    private static final String TAG = "AndroidNetworkLibrary";

    AndroidNetworkLibrary()
    {
    }

    public static void addTestRootCertificate(byte abyte0[])
        throws CertificateException, KeyStoreException, NoSuchAlgorithmException
    {
        X509Util.addTestRootCertificate(abyte0);
    }

    public static void clearTestRootCertificates()
        throws NoSuchAlgorithmException, CertificateException, KeyStoreException
    {
        X509Util.clearTestRootCertificates();
    }

    public static String getMimeTypeFromExtension(String s)
    {
        return URLConnection.guessContentTypeFromName((new StringBuilder()).append("foo.").append(s).toString());
    }

    private static String getNetworkCountryIso(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context != null)
        {
            return context.getNetworkCountryIso();
        } else
        {
            return "";
        }
    }

    public static String getNetworkList()
    {
        Enumeration enumeration;
        StringBuilder stringbuilder;
        try
        {
            enumeration = NetworkInterface.getNetworkInterfaces();
        }
        catch (SocketException socketexception)
        {
            Log.w("AndroidNetworkLibrary", (new StringBuilder()).append("Unable to get network interfaces: ").append(socketexception).toString());
            return "";
        }
        if (enumeration == null)
        {
            return "";
        }
        stringbuilder = new StringBuilder();
_L3:
        NetworkInterface networkinterface;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        networkinterface = (NetworkInterface)enumeration.nextElement();
        Iterator iterator;
        if (!networkinterface.isUp() || networkinterface.isLoopback())
        {
            continue; /* Loop/switch isn't completed */
        }
        iterator = networkinterface.getInterfaceAddresses().iterator();
_L1:
        String s1;
        InterfaceAddress interfaceaddress;
        StringBuilder stringbuilder1;
        InetAddress inetaddress;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            interfaceaddress = (InterfaceAddress)iterator.next();
            inetaddress = interfaceaddress.getAddress();
        } while (inetaddress.isLoopbackAddress());
        stringbuilder1 = new StringBuilder();
        stringbuilder1.append(networkinterface.getName());
        stringbuilder1.append("\t");
        s1 = inetaddress.getHostAddress();
        String s = s1;
        if (!(inetaddress instanceof Inet6Address))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        s = s1;
        if (s1.contains("%"))
        {
            s = s1.substring(0, s1.lastIndexOf("%"));
        }
        stringbuilder1.append(s);
        stringbuilder1.append("/");
        stringbuilder1.append(interfaceaddress.getNetworkPrefixLength());
        stringbuilder1.append("\t");
        stringbuilder1.append("0");
        if (stringbuilder.length() != 0)
        {
            stringbuilder.append("\n");
        }
        stringbuilder.append(stringbuilder1.toString());
          goto _L1
        SocketException socketexception1;
        socketexception1;
        if (true) goto _L3; else goto _L2
_L2:
        return stringbuilder.toString();
    }

    private static String getNetworkOperator(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context != null)
        {
            return context.getNetworkOperator();
        } else
        {
            return "";
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
                Log.w("AndroidNetworkLibrary", (new StringBuilder()).append("could not get network interfaces: ").append(obj).toString());
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
            Log.w("AndroidNetworkLibrary", (new StringBuilder()).append("could not store crypto file: ").append(context).toString());
            return false;
        }
        i;
        JVM INSTR tableswitch 1 3: default 121
    //                   1 67
    //                   2 67
    //                   3 82;
           goto _L1 _L2 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_82;
_L1:
        Log.w("AndroidNetworkLibrary", (new StringBuilder()).append("invalid certificate type: ").append(i).toString());
        return false;
_L2:
        intent.putExtra("CERT", abyte0);
_L4:
        context.startActivity(intent);
        return true;
        intent.putExtra("PKCS12", abyte0);
          goto _L4
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
            Log.w("AndroidNetworkLibrary", (new StringBuilder()).append("could not store key pair: ").append(context).toString());
            return false;
        }
        return true;
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte abyte0[][], String s, String s1)
    {
        try
        {
            abyte0 = X509Util.verifyServerCertificates(abyte0, s, s1);
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
