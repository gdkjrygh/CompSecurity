// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class s
{

    private static String a[];
    private static String b;

    public static String a(Context context, String s1)
    {
        int j = 0;
        Object obj1 = null;
        Object obj = null;
        s1 = b(context, s1);
        context = obj1;
        if (((ApplicationInfo) (s1)).metaData != null)
        {
            String as[] = a;
            int i = 0;
            context = obj;
            while (i < 2) 
            {
                String s2 = as[i];
                int k = j;
                if (((ApplicationInfo) (s1)).metaData.containsKey(s2))
                {
                    context = ((ApplicationInfo) (s1)).metaData.getString(s2);
                    k = j + 1;
                }
                i++;
                j = k;
            }
            if (j > 1)
            {
                context = String.valueOf("The API key can only be specified once. It is recommended that you use the meta-data tag with the name: ");
                s1 = b;
                throw new RuntimeException((new StringBuilder(String.valueOf(context).length() + 52 + String.valueOf(s1).length())).append(context).append(s1).append(" in the <application> element of AndroidManifest.xml").toString());
            }
        }
        if (context == null)
        {
            context = b;
            throw new RuntimeException((new StringBuilder(String.valueOf(context).length() + 143)).append("API key not found.  Check that <meta-data android:name=\"").append(context).append("\" android:value=\"your API key\"/> is in the <application> element of AndroidManifest.xml").toString());
        } else
        {
            return context;
        }
    }

    public static String a(PackageManager packagemanager, String s1)
    {
        int i = 0;
        packagemanager = packagemanager.getPackageInfo(s1, 64);
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        if (((PackageInfo) (packagemanager)).signatures == null || ((PackageInfo) (packagemanager)).signatures.length == 0)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        if (((PackageInfo) (packagemanager)).signatures[0] == null)
        {
            return null;
        }
        packagemanager = ((PackageInfo) (packagemanager)).signatures[0].toByteArray();
        s1 = MessageDigest.getInstance("SHA-1");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        packagemanager = s1.digest(packagemanager);
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        StringBuffer stringbuffer;
        int j;
        s1 = new char[16];
        s1;
        s1[0] = '0';
        s1[1] = '1';
        s1[2] = '2';
        s1[3] = '3';
        s1[4] = '4';
        s1[5] = '5';
        s1[6] = '6';
        s1[7] = '7';
        s1[8] = '8';
        s1[9] = '9';
        s1[10] = 'A';
        s1[11] = 'B';
        s1[12] = 'C';
        s1[13] = 'D';
        s1[14] = 'E';
        s1[15] = 'F';
        stringbuffer = new StringBuffer(packagemanager.length * 2);
        j = packagemanager.length;
_L2:
        byte byte0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = packagemanager[i];
        stringbuffer.append(s1[byte0 >> 4 & 0xf]);
        stringbuffer.append(s1[byte0 >> 0 & 0xf]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        packagemanager = stringbuffer.toString();
        return packagemanager;
        packagemanager;
        return null;
        packagemanager;
        return null;
    }

    private static ApplicationInfo b(Context context, String s1)
    {
        try
        {
            context = context.getPackageManager().getApplicationInfo(s1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AssertionError(context);
        }
        return context;
    }

    static 
    {
        String as[] = new String[2];
        as[0] = "com.google.android.geo.API_KEY";
        as[1] = "com.google.android.maps.v2.API_KEY";
        a = as;
        b = as[0];
    }
}
