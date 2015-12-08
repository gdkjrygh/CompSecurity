// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.ck;
import com.crashlytics.android.internal.cm;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.crashlytics.android:
//            ag, ad, ah, y, 
//            z

final class af
{

    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new ag();
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final z e;
    private Thread f;

    public af(z z1)
    {
        if (z1 == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = z1;
            return;
        }
    }

    static Thread a(af af1, Thread thread)
    {
        af1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        cm.a().b().a("Crashlytics", "Checking for crash reports...");
        File afile[];
        int j;
        synchronized (d)
        {
            afile = cm.a().i().listFiles(b);
        }
        obj = new LinkedList();
        j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            cm.a().b().a("Crashlytics", (new StringBuilder("Found crash report ")).append(file.getPath()).toString());
            ((List) (obj)).add(new ad(file));
        }

        if (((List) (obj)).size() == 0)
        {
            cm.a().b().a("Crashlytics", "No reports found.");
        }
        return ((List) (obj));
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new ah(this, f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(ad ad1)
    {
        boolean flag1 = false;
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        cj cj1;
        StringBuilder stringbuilder;
        boolean flag2;
        y y1 = new y(ck.a(cm.a().w(), cm.a().g()), ad1);
        flag2 = e.a(y1);
        cj1 = cm.a().b();
        stringbuilder = new StringBuilder("Crashlytics report upload ");
        String s;
        boolean flag;
        if (flag2)
        {
            s = "complete: ";
        } else
        {
            s = "FAILED: ";
        }
        cj1.b("Crashlytics", stringbuilder.append(s).append(ad1.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        ad1.a();
        flag = true;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        cm.a().b().a("Crashlytics", (new StringBuilder("Error occurred sending report ")).append(ad1).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        ad1;
        throw ad1;
    }

}
