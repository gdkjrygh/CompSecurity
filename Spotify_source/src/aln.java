// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class aln
    implements gyo
{

    public aln()
    {
    }

    private static String a(ZipInputStream zipinputstream)
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
    {
        Object obj;
        Object obj1;
        String s;
        Object obj2;
        long l;
        l = System.nanoTime();
        s = "";
        obj2 = null;
        obj = null;
        obj1 = null;
        context = new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir));
        obj = context;
        obj1 = a(context);
        obj = obj1;
        double d;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gya.a().c("Beta", "Failed to close the APK file", context);
        }
_L2:
        d = (double)(System.nanoTime() - l) / 1000000D;
        gya.a().a("Beta", (new StringBuilder("Beta device token load took ")).append(d).append("ms").toString());
        return ((String) (obj));
        obj1;
        context = null;
_L9:
        obj = context;
        gya.a().c("Beta", "Failed to find this app in the PackageManager", ((Throwable) (obj1)));
        obj = s;
        if (context == null) goto _L2; else goto _L1
_L1:
        context.close();
        obj = s;
          goto _L2
        context;
        gya.a().c("Beta", "Failed to close the APK file", context);
        obj = s;
          goto _L2
        obj;
        context = ((Context) (obj1));
        obj1 = obj;
_L8:
        obj = context;
        gya.a().c("Beta", "Failed to find the APK file", ((Throwable) (obj1)));
        obj = s;
        if (context == null) goto _L2; else goto _L3
_L3:
        context.close();
        obj = s;
          goto _L2
        context;
        gya.a().c("Beta", "Failed to close the APK file", context);
        obj = s;
          goto _L2
        IOException ioexception1;
        ioexception1;
        context = obj2;
_L7:
        obj = context;
        gya.a().c("Beta", "Failed to read the APK file", ioexception1);
        obj = s;
        if (context == null) goto _L2; else goto _L4
_L4:
        context.close();
        obj = s;
          goto _L2
        context;
        gya.a().c("Beta", "Failed to close the APK file", context);
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
                gya.a().c("Beta", "Failed to close the APK file", ioexception);
            }
        }
        throw context;
        context;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception1;
          goto _L7
        ioexception1;
          goto _L8
        ioexception1;
          goto _L9
    }

    public final Object a(Context context)
    {
        return b(context);
    }
}
