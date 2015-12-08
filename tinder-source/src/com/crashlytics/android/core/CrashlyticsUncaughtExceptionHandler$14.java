// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, ClsFileOutputStream, CrashlyticsCore

class a
    implements Runnable
{

    final CrashlyticsUncaughtExceptionHandler a;

    public void run()
    {
        CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = a;
        File afile[] = CrashlyticsUncaughtExceptionHandler.a(a, ClsFileOutputStream.a);
        File file = new File(crashlyticsuncaughtexceptionhandler.g.g(), "invalidClsFiles");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile2[] = file.listFiles();
                int l = afile2.length;
                for (int i = 0; i < l; i++)
                {
                    afile2[i].delete();
                }

            }
            file.delete();
        }
        int j1 = afile.length;
        for (int j = 0; j < j1; j++)
        {
            Object obj = afile[j];
            c.a().a("CrashlyticsCore", (new StringBuilder("Found invalid session part file: ")).append(obj).toString());
            obj = CrashlyticsUncaughtExceptionHandler.a(((File) (obj)));
            a a1 = new <init>(crashlyticsuncaughtexceptionhandler, ((String) (obj)));
            c.a().a("CrashlyticsCore", (new StringBuilder("Deleting all part files for invalid session: ")).append(((String) (obj))).toString());
            File afile1[] = crashlyticsuncaughtexceptionhandler.a(a1);
            int k1 = afile1.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                File file1 = afile1[i1];
                c.a().a("CrashlyticsCore", (new StringBuilder("Deleting session file: ")).append(file1).toString());
                file1.delete();
            }

        }

    }

    I(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        a = crashlyticsuncaughtexceptionhandler;
        super();
    }
}
