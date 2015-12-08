// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.crashlytics.android:
//            as, aB, Crashlytics, aq, 
//            at, aa, ab

final class ar
{

    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new as();
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final ab e;
    private Thread f;

    public ar(ab ab1)
    {
        if (ab1 == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = ab1;
            return;
        }
    }

    static Thread a(ar ar1, Thread thread)
    {
        ar1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        aB.c("Checking for crash reports...");
        File afile[];
        int j;
        synchronized (d)
        {
            afile = Crashlytics.j().listFiles(b);
        }
        obj = new LinkedList();
        j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            aB.c((new StringBuilder("Found crash report ")).append(file.getPath()).toString());
            ((List) (obj)).add(new aq(file));
        }

        if (((List) (obj)).size() == 0)
        {
            aB.c("No reports found.");
        }
        return ((List) (obj));
    }

    public final void a(Context context, float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new at(this, context, f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    final boolean a(aq aq1)
    {
        boolean flag1 = false;
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        boolean flag2;
        aB.d();
        aa aa1 = new aa(Crashlytics.i(), aq1);
        flag2 = e.a(aa1);
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
        aB.a(4, "Crashlytics", stringbuilder.append(s).append(aq1.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        aq1.a();
        flag = true;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        aB.a((new StringBuilder("Error occurred sending report ")).append(aq1).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        aq1;
        throw aq1;
    }

}
