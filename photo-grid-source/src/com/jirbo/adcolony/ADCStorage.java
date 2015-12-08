// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

// Referenced classes of package com.jirbo.adcolony:
//            l, a, ab, f, 
//            k, AdColony, d

public class ADCStorage
{

    d a;
    String b;
    String c;
    String d;
    File e;
    File f;

    ADCStorage(d d1)
    {
        a = d1;
    }

    double a(String s)
    {
        int i;
        long l1;
        try
        {
            s = new StatFs(s);
            l1 = s.getBlockSize();
            i = s.getAvailableBlocks();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0.0D;
        }
        return (double)((long)i * l1);
    }

    void a()
    {
        l.a.b("Configuring storage");
        boolean flag1 = true;
        boolean flag = flag1;
        if (d() != null)
        {
            flag = flag1;
            if (a(d()) > a(c()) + 1048576D)
            {
                flag = flag1;
                if (a(c()) < 31457280D)
                {
                    flag = false;
                }
            }
        }
        if (flag)
        {
            l.b.b("Using internal storage:");
            b = (new StringBuilder()).append(c()).append("/adc/").toString();
        } else
        {
            b = (new StringBuilder()).append(d()).append("/.adc2/").append(ab.f()).append("/").toString();
            l.b.b("Using external storage:");
        }
        c = (new StringBuilder()).append(b).append("media/").toString();
        l.a.b(c);
        e = new File(c);
        if (!e.isDirectory())
        {
            e.delete();
            e.mkdirs();
        }
        if (!e.isDirectory())
        {
            com.jirbo.adcolony.a.a("Cannot create media folder.");
            return;
        }
        if (a(c) < 20971520D)
        {
            com.jirbo.adcolony.a.a((new StringBuilder("Not enough space to store temporary files (")).append(a(c)).append(" bytes available).").toString());
            return;
        }
        d = (new StringBuilder()).append(c()).append("/adc/data/").toString();
        if (a.n == 0)
        {
            d = (new StringBuilder()).append(b).append("data/").toString();
        }
        l.a.a("Internal data path: ").b(d);
        f = new File(d);
        if (!f.isDirectory())
        {
            f.delete();
        }
        f.mkdirs();
        f f1 = new f("iap_cache.txt");
        f1.c();
        k.a(f1, a.Z);
    }

    void b()
    {
        if (e == null || f == null)
        {
            return;
        }
        if (!e.isDirectory())
        {
            e.delete();
        }
        if (!f.isDirectory())
        {
            f.delete();
        }
        e.mkdirs();
        f.mkdirs();
    }

    String c()
    {
        return AdColony.activity().getFilesDir().getAbsolutePath();
    }

    String d()
    {
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        } else
        {
            return null;
        }
    }
}
