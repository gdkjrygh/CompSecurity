// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.amazon.device.associates:
//            au

final class ax
{

    private static ax l = null;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;

    private ax(Context context)
    {
        a = "android";
        c = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = false;
        j = false;
        k = false;
        b = "app";
        d = "3p";
        c(context);
        b(context);
        b();
    }

    protected static final ax a(Context context)
    {
        com/amazon/device/associates/ax;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = new ax(context);
        }
        context = l;
        com/amazon/device/associates/ax;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private String a(String s)
        throws NoSuchAlgorithmException
    {
        Object obj;
        int i1;
        try
        {
            obj = MessageDigest.getInstance("SHA-1");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i1 = 0;
        if (i1 >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuffer) (obj)).append(Integer.toHexString(s[i1] & 0xff | 0x100).substring(1));
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_29;
_L1:
        s = ((StringBuffer) (obj)).toString();
        return s;
    }

    private void b()
    {
        String s = (String)android/os/Build.getDeclaredField("SERIAL").get(android/os/Build);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (s.length() != 0 && !s.equalsIgnoreCase("unknown"))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        i = true;
        return;
        try
        {
            g = au.a(a(s));
            return;
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            i = true;
        }
        catch (Exception exception)
        {
            return;
        }
        return;
    }

    private void b(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (context.length() != 0 && !context.equalsIgnoreCase("9774d56d682e549c"))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        f = null;
        j = true;
        return;
        try
        {
            f = au.a(a(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            j = true;
        }
        return;
    }

    private void c(Context context)
    {
        context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        context = null;
_L1:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (context.length() != 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        e = null;
        k = true;
        return;
        context = context.getMacAddress();
          goto _L1
        if (!Pattern.compile("((([0-9a-fA-F]){1,2}[-:]){5}([0-9a-fA-F]){1,2})").matcher(context).find())
        {
            e = null;
            k = true;
            return;
        }
        try
        {
            e = au.a(a(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            k = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e = null;
        }
        return;
    }

    protected ArrayList a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("dt", a));
        arraylist.add(new BasicNameValuePair("app", b));
        arraylist.add(new BasicNameValuePair("aud", d));
        arraylist.add(new BasicNameValuePair("sdkVer", "123"));
        if (e != null)
        {
            arraylist.add(new BasicNameValuePair("sha1_mac", e));
        }
        if (f != null)
        {
            arraylist.add(new BasicNameValuePair("sha1_udid", f));
        }
        if (g != null)
        {
            arraylist.add(new BasicNameValuePair("sha1_serial", g));
        }
        if (h != null)
        {
            arraylist.add(new BasicNameValuePair("ua", au.a(h)));
        }
        if (k)
        {
            arraylist.add(new BasicNameValuePair("badMac", "true"));
        }
        if (i)
        {
            arraylist.add(new BasicNameValuePair("badSerial", "true"));
        }
        if (j)
        {
            arraylist.add(new BasicNameValuePair("badUdid", "true"));
        }
        return arraylist;
    }

}
