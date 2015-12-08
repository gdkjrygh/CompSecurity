// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.a.d;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class j
    implements d
{

    public j()
    {
    }

    private static String a(ZipInputStream zipinputstream)
        throws IOException
    {
        do
        {
            Object obj = zipinputstream.getNextEntry();
            if (obj != null)
            {
                obj = ((ZipEntry) (obj)).getName();
                if (((String) (obj)).startsWith("assets/com.crashlytics.android.beta/dirfactor-device-token="))
                {
                    return ((String) (obj)).substring(59, ((String) (obj)).length() - 1);
                }
            } else
            {
                return "";
            }
        } while (true);
    }

    private static String b(Context context)
        throws Exception
    {
        Object obj;
        String s;
        String s1;
        Object obj2;
        long l;
        l = System.nanoTime();
        s = "";
        obj2 = null;
        obj = null;
        s1 = null;
        context = new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir));
        obj = context;
        s1 = a(context);
        obj = s1;
        double d1;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b.a.a.a.d.a();
        }
_L2:
        d1 = (double)(System.nanoTime() - l) / 1000000D;
        b.a.a.a.d.a();
        (new StringBuilder("Beta device token load took ")).append(d1).append("ms");
        return ((String) (obj));
        context;
        context = null;
_L9:
        obj = context;
        b.a.a.a.d.a();
        obj = s;
        if (context == null) goto _L2; else goto _L1
_L1:
        context.close();
        obj = s;
          goto _L2
        context;
        b.a.a.a.d.a();
        obj = s;
          goto _L2
        context;
        context = s1;
_L8:
        obj = context;
        b.a.a.a.d.a();
        obj = s;
        if (context == null) goto _L2; else goto _L3
_L3:
        context.close();
        obj = s;
          goto _L2
        context;
        b.a.a.a.d.a();
        obj = s;
          goto _L2
        context;
        context = obj2;
_L7:
        obj = context;
        b.a.a.a.d.a();
        obj = s;
        if (context == null) goto _L2; else goto _L4
_L4:
        context.close();
        obj = s;
          goto _L2
        context;
        b.a.a.a.d.a();
        obj = s;
          goto _L2
        context;
_L6:
        if (obj != null)
        {
            try
            {
                ((ZipInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                b.a.a.a.d.a();
            }
        }
        throw context;
        context;
        if (true) goto _L6; else goto _L5
_L5:
        Object obj1;
        obj1;
          goto _L7
        obj1;
          goto _L8
        obj1;
          goto _L9
    }

    public final Object a(Context context)
        throws Exception
    {
        return b(context);
    }
}
