// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.n;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.FirmwareVersion;
import com.fitbit.data.domain.device.c;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.dncs.NotificationManager;
import com.fitbit.pedometer.h;
import com.fitbit.savedstate.d;
import com.fitbit.ui.s;
import com.fitbit.util.bh;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.util.a.a;

public class b
{

    public static final String a = "Entered Login";
    private static final String b = "FeedbackUtils";
    private static final String c = "Please set up Gmail app for sending the logs";
    private static final String d = System.getProperty("line.separator");
    private static final String e = "....";
    private static final String f = "------ DB -------";
    private static final String g = "------ RUN DB -------";
    private static final int h = 0x32000;
    private static final int i = 0x100000;

    public b()
    {
    }

    public static String a()
    {
        byte abyte0[];
        Object obj3;
        File file;
        file = DaoFactory.getInstance().exportDBToFile("export-db.zip");
        abyte0 = new byte[8096];
        obj3 = new ByteArrayOutputStream();
        Object obj2 = new FileInputStream(file);
_L2:
        Object obj = obj2;
        int j = ((FileInputStream) (obj2)).read(abyte0);
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        ((ByteArrayOutputStream) (obj3)).write(abyte0, 0, j);
        if (true) goto _L2; else goto _L1
        obj;
        Object obj1;
        obj1 = obj2;
        obj2 = obj;
_L6:
        obj = obj1;
        obj2 = (new StringBuilder()).append("Exception: ").append(((IOException) (obj2)).toString()).toString();
        obj = obj2;
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        obj2 = obj;
        if (file != null)
        {
            file.delete();
            obj2 = obj;
        }
        return ((String) (obj2));
_L1:
        obj = obj2;
        obj3 = new String(org.spongycastle.util.a.a.a(((ByteArrayOutputStream) (obj3)).toByteArray()));
        obj1 = obj3;
        obj = obj2;
        if (bh.c(((String) (obj3))) > e())
        {
            obj1 = "The database is too big";
        }
        if (obj2 != null)
        {
            try
            {
                ((FileInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        obj2 = obj1;
        if (file != null)
        {
            file.delete();
            return ((String) (obj1));
        } else
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj1;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        if (file != null)
        {
            file.delete();
        }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String a(int j)
    {
        String s1 = "";
        if (j > 0)
        {
            s1 = a(((Context) (FitBitApplication.a())), null);
            s1 = (new StringBuilder()).append(s1).append("").toString();
        }
        return s1;
    }

    public static String a(Context context, Bundle bundle)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("My environment: ").append(d);
        if (bundle != null && bundle.containsKey("Entered Login"))
        {
            stringbuilder.append("Entered Login").append(" = ").append(bundle.get("Entered Login")).append(d);
        }
        stringbuilder.append("Last Successful Login = ").append(com.fitbit.savedstate.d.h());
        stringbuilder.append(d);
        stringbuilder.append("AppVersion = ").append(com.fitbit.config.a.a(context));
        stringbuilder.append(d);
        stringbuilder.append("AppVersion chain = ").append(com.fitbit.savedstate.d.i());
        stringbuilder.append(d);
        context = an.a().f();
        if (context != null && context.size() > 0)
        {
            stringbuilder.append("Devices:\n");
            for (context = context.iterator(); context.hasNext(); stringbuilder.append(d))
            {
                bundle = (Device)context.next();
                stringbuilder.append("....Device = ").append(bundle.h()).append(" ").append(bundle.d());
                stringbuilder.append(d);
                if (bundle.m() != null)
                {
                    stringbuilder.append("........vers = app:").append(bundle.m().a().toString()).append(" bsl:").append(bundle.m().b().toString());
                    stringbuilder.append(d);
                }
                stringbuilder.append("........battery = ").append(bundle.f());
                stringbuilder.append(d);
                stringbuilder.append("........bond status = ").append(NotificationManager.a().c(bundle));
                stringbuilder.append(d);
            }

        }
        stringbuilder.append(g());
        stringbuilder.append(d);
        return stringbuilder.toString();
    }

    public static void a(Activity activity)
    {
        a(activity, null);
    }

    public static void a(Activity activity, Bundle bundle)
    {
        com.fitbit.e.a.a("FeedbackUtils", "sendLogs(): %s", new Object[] {
            new Date()
        });
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        Object obj = Collections.singletonList(activity.getString(0x7f0803b3));
        String s1 = activity.getString(0x7f0803b6);
        if (!TextUtils.isEmpty(com.fitbit.config.b.e))
        {
            obj = new ArrayList(((java.util.Collection) (obj)));
            ((List) (obj)).add(com.fitbit.config.b.e);
        }
        String as[] = (String[])((List) (obj)).toArray(new String[((List) (obj)).size()]);
        bundle = a(((Context) (activity)), bundle);
        intent.putExtra("android.intent.extra.EMAIL", as);
        intent.putExtra("android.intent.extra.SUBJECT", s1);
        intent.putExtra("android.intent.extra.TEXT", bundle);
        bundle = new ArrayList();
        if (false)
        {
            new StringBuilder();
            throw new NullPointerException();
        }
        com.fitbit.pedometer.h.a().b();
        as = com.fitbit.pedometer.h.a().c();
        if (as != null)
        {
            as = com.fitbit.util.e.a.a(as, (new StringBuilder()).append(as.getAbsolutePath()).append(".zip").toString());
            if (as != null)
            {
                bundle.add(Uri.fromFile(as));
            }
        }
        as = com.fitbit.pedometer.h.a().d();
        if (as != null)
        {
            as = com.fitbit.util.e.a.a(as, (new StringBuilder()).append(as.getAbsolutePath()).append(".zip").toString());
            if (as != null)
            {
                bundle.add(Uri.fromFile(as));
            }
        }
        as = com.fitbit.pedometer.h.a().e();
        if (as != null)
        {
            as = com.fitbit.util.e.a.a(as, (new StringBuilder()).append(as.getAbsolutePath()).append(".zip").toString());
            if (as != null)
            {
                bundle.add(Uri.fromFile(as));
            }
        }
        as = DaoFactory.getInstance().exportDBToFile("db.zip");
        if (as != null)
        {
            bundle.add(Uri.fromFile(as));
        }
        try
        {
            bundle.add(Uri.fromFile(d()));
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.e("FeedbackUtils", "Could not generate Run DB Copy", exception, new Object[0]);
        }
        if (bundle.size() > 0)
        {
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", bundle);
        }
        intent.setType("text/plain");
        bundle = FitBitApplication.a().getPackageManager().queryIntentActivities(intent, 0x10000);
        if (bundle == null || bundle.size() < 1)
        {
            s.a(activity, "Please set up Gmail app for sending the logs", 1).i();
            return;
        } else
        {
            activity.startActivity(intent);
            return;
        }
    }

    public static String b()
    {
        StringBuilder stringbuilder = new StringBuilder("");
        stringbuilder.append(d);
        stringbuilder.append("------ DB -------");
        stringbuilder.append(d);
        stringbuilder.append(a());
        return stringbuilder.toString();
    }

    public static String c()
    {
        StringBuilder stringbuilder = new StringBuilder("");
        stringbuilder.append(d);
        stringbuilder.append("------ RUN DB -------");
        stringbuilder.append(d);
        stringbuilder.append(h());
        return null;
    }

    public static File d()
        throws IOException
    {
        new com.fitbit.runtrack.data.b();
        File file = FitBitApplication.a().getDatabasePath("exercise_data");
        File file1 = File.createTempFile("run_db", ".db.zip", FitBitApplication.a().getExternalCacheDir());
        file1.deleteOnExit();
        com.fitbit.util.e.a.a(file, file1.getAbsolutePath());
        return file1;
    }

    private static int e()
    {
        return !f() ? 0x100000 : 0x32000;
    }

    private static boolean f()
    {
        return false;
    }

    private static String g()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (n.b())
        {
            stringbuilder.append("BTLE library: ").append(n.d());
        }
        stringbuilder.append(d);
        stringbuilder.append("Build.DISPLAY: ").append(Build.DISPLAY);
        stringbuilder.append(d);
        stringbuilder.append("Build.MANUFACTURER: ").append(Build.MANUFACTURER);
        stringbuilder.append(d);
        stringbuilder.append("Build.MODEL: ").append(Build.MODEL);
        stringbuilder.append(d);
        stringbuilder.append("Build.PRODUCT: ").append(Build.PRODUCT);
        stringbuilder.append(d);
        stringbuilder.append("Build.DEVICE: ").append(Build.DEVICE);
        stringbuilder.append(d);
        stringbuilder.append("Build.BRAND: ").append(Build.BRAND);
        stringbuilder.append(d);
        stringbuilder.append("Build.BOARD: ").append(Build.BOARD);
        stringbuilder.append(d);
        stringbuilder.append("Build.VERSION.RELEASE: ").append(android.os.Build.VERSION.RELEASE);
        stringbuilder.append(d);
        stringbuilder.append("Build.VERSION.SDK_INT = ").append(android.os.Build.VERSION.SDK_INT);
        stringbuilder.append(d);
        return stringbuilder.toString();
    }

    private static String h()
    {
        Object obj;
        Object obj1;
        byte abyte0[];
        obj1 = d();
        obj = new ByteArrayOutputStream((int)((File) (obj1)).length());
        obj1 = new FileInputStream(((File) (obj1)));
        abyte0 = new byte[4096];
_L1:
        int j = ((FileInputStream) (obj1)).read(abyte0);
label0:
        {
            if (j == -1)
            {
                break label0;
            }
            try
            {
                ((ByteArrayOutputStream) (obj)).write(abyte0, 0, j);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.fitbit.e.a.f("FeedbackUtils", "Bad things while Base64 Encoding the DB", ((Throwable) (obj)), new Object[0]);
                return "";
            }
        }
          goto _L1
        ((ByteArrayOutputStream) (obj)).close();
        ((FileInputStream) (obj1)).close();
        obj = new String(org.spongycastle.util.a.a.a(((ByteArrayOutputStream) (obj)).toByteArray()));
        return ((String) (obj));
    }

}
