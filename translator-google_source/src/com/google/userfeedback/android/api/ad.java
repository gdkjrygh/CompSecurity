// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.userfeedback.android.api.a.a.a.a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.google.userfeedback.android.api:
//            ah, z, m, ag, 
//            c, y

public final class ad
{

    private static final Object a = "com.google";
    private final ah b;

    protected ad(ah ah1)
    {
        b = ah1;
    }

    private static String a(List list)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        list = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec((String[])list.toArray(new String[0])).getInputStream()));
        obj = list;
        obj1 = new StringBuilder();
        obj = list;
        String s = System.getProperty("line.separator");
_L2:
        obj = list;
        String s1 = list.readLine();
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = list;
        ((StringBuilder) (obj1)).append(s1);
        obj = list;
        ((StringBuilder) (obj1)).append(s);
        if (true) goto _L2; else goto _L1
        obj1;
_L8:
        obj = list;
        ((IOException) (obj1)).getMessage();
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.getMessage();
            }
        }
_L3:
        return "";
_L1:
        obj = list;
        obj1 = ((StringBuilder) (obj1)).toString();
        try
        {
            list.close();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.getMessage();
            return ((String) (obj1));
        }
        return ((String) (obj1));
        obj;
        list = ((List) (obj1));
        obj1 = obj;
_L6:
        obj = list;
        ((OutOfMemoryError) (obj1)).getMessage();
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.getMessage();
            }
        }
          goto _L3
        list;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.getMessage();
            }
        }
        throw list;
        list;
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
          goto _L6
        obj1;
        list = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(ad ad1, z z1)
    {
        if (ad1.b.i)
        {
            Object obj = ((ActivityManager)ad1.b.a.getSystemService("activity")).getRunningAppProcesses();
            if (obj != null)
            {
                android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); z1.p.add(runningappprocessinfo.processName))
                {
                    runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
                }

            }
        }
        z1.d = Build.DEVICE;
        z1.e = Build.DISPLAY;
        z1.f = Build.TYPE;
        z1.g = Build.MODEL;
        z1.m = Build.BOARD;
        z1.n = Build.BRAND;
        z1.l = android.os.Build.VERSION.CODENAME;
        z1.k = android.os.Build.VERSION.INCREMENTAL;
        z1.j = android.os.Build.VERSION.RELEASE;
        z1.h = Build.PRODUCT;
        Object obj1;
        ArrayList arraylist;
        try
        {
            z1.i = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException numberformatexception)
        {
            z1.i = -1;
        }
        z1.a = m.c.b;
        z1.H = Locale.getDefault().toString();
        if (m.c.a.f.size() > 0)
        {
            z1.G = m.c.a.f;
        }
        obj1 = (TelephonyManager)ad1.b.a.getSystemService("phone");
        z1.r = ((TelephonyManager) (obj1)).getPhoneType();
        z1.s = ((TelephonyManager) (obj1)).getNetworkType();
        z1.t = ((TelephonyManager) (obj1)).getNetworkOperatorName();
        z1.B = System.currentTimeMillis();
        obj1 = ad1.b.d;
        arraylist = new ArrayList(Arrays.asList(new String[] {
            "logcat", "-v", "time", "-d"
        }));
        if (obj1 != null)
        {
            arraylist.add(obj1);
        }
        z1.q = a(((List) (arraylist)));
        if ((z1.q == null || z1.q.equals("")) && ad1.b.p != null)
        {
            z1.q = ad1.b.p;
        }
        z1.I = ad1.b.m;
        obj1 = ad1.b.a.getPackageManager();
        z1.x = ad1.b.a.getPackageName();
        try
        {
            ApplicationInfo applicationinfo = ((PackageManager) (obj1)).getApplicationInfo(z1.x, 0);
            PackageInfo packageinfo = ((PackageManager) (obj1)).getPackageInfo(z1.x, 0);
            z1.z = applicationinfo.processName;
            z1.b = packageinfo.versionCode;
            z1.c = packageinfo.versionName;
            z1.y = ((PackageManager) (obj1)).getInstallerPackageName(z1.x);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        z1.z = m.c.a.a.getPackageName();
        z1.A = false;
        ad1.b(z1);
    }

    private void b(z z1)
    {
        if (b.g && b.a() != null)
        {
            Bitmap bitmap = b.a();
            if (!bitmap.isRecycled())
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 70, bytearrayoutputstream);
                z1.u = bytearrayoutputstream.toByteArray();
                z1.w = bitmap.getWidth();
                z1.v = bitmap.getHeight();
            }
        }
        z1.C = new ArrayList();
        Account aaccount[];
        int j;
        aaccount = AccountManager.get(b.a).getAccounts();
        j = aaccount.length;
        int i = 0;
_L2:
        Account account;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        account = aaccount[i];
        if (account.type.equals(a))
        {
            z1.C.add(account.name);
        }
        i++;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        z1.D = z1.C.size();
        z1.F = b.e;
        z1.J = b.n;
        return;
        obj;
          goto _L1
    }

    protected final File a(z z1)
    {
        Object obj1;
label0:
        {
            Object obj = new ag(z1);
            a a1 = new a(com.google.android.a.a.a.g);
            z1 = new a(com.google.android.a.a.a.d);
            z1.b(2, ((ag) (obj)).a.a);
            z1.b(6, ((ag) (obj)).a.H);
            if (!"".equals(((ag) (obj)).a.E))
            {
                z1.b(3, ((ag) (obj)).a.E);
            }
            a1.b(1, z1);
            obj1 = new a(com.google.android.a.a.a.h);
            z1 = new a(com.google.android.a.a.a.i);
            if (m.c.e)
            {
                z1.b(2, ((ag) (obj)).a.q);
            }
            z1.a(1, ((ag) (obj)).a.B);
            Object obj2 = new a(com.google.android.a.a.a.q);
            ((a) (obj2)).a(1, ((ag) (obj)).a.r);
            ((a) (obj2)).a(3, ((ag) (obj)).a.s);
            ((a) (obj2)).b(2, ((ag) (obj)).a.t);
            z1.b(6, obj2);
            for (obj2 = ((ag) (obj)).a.p.iterator(); ((Iterator) (obj2)).hasNext(); z1.a(5, (String)((Iterator) (obj2)).next())) { }
            ((a) (obj1)).b(1, z1);
            obj2 = new a(com.google.android.a.a.a.j);
            ((a) (obj2)).b(1, ((ag) (obj)).a.x);
            ((a) (obj2)).b(2, ((ag) (obj)).a.y);
            ((a) (obj2)).b(3, ((ag) (obj)).a.z);
            ((a) (obj2)).a(4, ((ag) (obj)).a.b);
            ((a) (obj2)).b(5, ((ag) (obj)).a.c);
            int i;
            if (((ag) (obj)).a.A)
            {
                z1 = a.b;
            } else
            {
                z1 = a.a;
            }
            ((a) (obj2)).b(6, z1);
            ((a) (obj1)).b(2, obj2);
            z1 = new a(com.google.android.a.a.a.k);
            z1.b(1, ((ag) (obj)).a.d);
            z1.b(2, ((ag) (obj)).a.e);
            z1.b(3, ((ag) (obj)).a.f);
            z1.b(4, ((ag) (obj)).a.g);
            z1.b(5, ((ag) (obj)).a.h);
            z1.b(7, ((ag) (obj)).a.j);
            z1.b(8, ((ag) (obj)).a.k);
            z1.b(9, ((ag) (obj)).a.l);
            z1.b(10, ((ag) (obj)).a.m);
            z1.b(11, ((ag) (obj)).a.n);
            z1.a(6, ((ag) (obj)).a.i);
            ((a) (obj1)).b(3, z1);
            z1 = new a(com.google.android.a.a.a.p);
            if (m.c.d && m.c.a.g && ((ag) (obj)).a.u != null)
            {
                obj2 = new a(com.google.android.a.a.a.f);
                ((a) (obj2)).b(1, "image/jpeg");
                ((a) (obj2)).b(2, com.google.userfeedback.android.api.b.a.a(((ag) (obj)).a.u));
                a a2 = new a(com.google.android.a.a.a.a);
                a2.a(2, ((ag) (obj)).a.v);
                a2.a(1, ((ag) (obj)).a.w);
                ((a) (obj2)).b(3, a2);
                z1.b(4, obj2);
            }
            if (((ag) (obj)).a.F != null)
            {
                z1.b(6, ((ag) (obj)).a.F);
            }
            if (((ag) (obj)).a.J != null)
            {
                z1.b(7, ((ag) (obj)).a.J);
            }
            i = ((ag) (obj)).a.D;
            z1.b(1, (new StringBuilder(11)).append(i).toString());
            obj2 = ((ag) (obj)).a.G.iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                c c1 = (c)((Iterator) (obj2)).next();
                byte abyte0[] = c1.b;
                if (abyte0 != null)
                {
                    a a3 = new a(com.google.android.a.a.a.e);
                    a3.b(1, c1.c);
                    a3.b(2, c1.a);
                    a3.b(3, abyte0);
                    z1.a(2, a3);
                }
            } while (true);
            ((a) (obj1)).b(9, z1);
            if (((ag) (obj)).a.I != null)
            {
                z1 = new a(com.google.android.a.a.a.l);
                z1.b(1, ((ag) (obj)).a.I.a);
                z1.b(3, ((ag) (obj)).a.I.b);
                z1.a(4, ((ag) (obj)).a.I.c);
                z1.b(5, ((ag) (obj)).a.I.d);
                z1.b(6, ((ag) (obj)).a.I.e);
                z1.b(7, ((ag) (obj)).a.I.f);
                if (((ag) (obj)).a.I.g != null)
                {
                    z1.b(2, ((ag) (obj)).a.I.g);
                }
                ((a) (obj1)).b(4, z1);
            }
            a1.b(2, obj1);
            obj = new File(b.a.getFilesDir(), "reports");
            if (!((File) (obj)).exists() && !((File) (obj)).mkdirs())
            {
                throw new IOException("Unable to create directory structure for base directory provided");
            }
            long l = System.currentTimeMillis();
            i = a1.hashCode();
            obj2 = (new StringBuilder(32)).append(l).append(".").append(i).toString();
            z1 = String.valueOf(obj2);
            obj1 = String.valueOf(".tmp");
            if (((String) (obj1)).length() != 0)
            {
                z1 = z1.concat(((String) (obj1)));
            } else
            {
                z1 = new String(z1);
            }
            obj1 = new File(((File) (obj)), z1);
            z1 = String.valueOf(obj2);
            obj2 = String.valueOf(".proto.gz");
            if (((String) (obj2)).length() != 0)
            {
                z1 = z1.concat(((String) (obj2)));
            } else
            {
                z1 = new String(z1);
            }
            z1 = new File(((File) (obj)), z1);
            try
            {
                GZIPOutputStream gzipoutputstream = new GZIPOutputStream(new FileOutputStream(((File) (obj1))));
                a1.a(gzipoutputstream);
                gzipoutputstream.close();
                if (!((File) (obj1)).renameTo(z1))
                {
                    throw new IOException("Failed to rename temporary file");
                }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (z z1) { }
            finally
            {
                ((File) (obj1)).delete();
                throw z1;
            }
        }
        z1.printStackTrace();
        throw z1;
        ((File) (obj1)).delete();
        return z1;
    }

}
