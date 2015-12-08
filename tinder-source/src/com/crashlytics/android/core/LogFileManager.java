// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//            FileLogStore, QueueFileLogStore, ByteString

class LogFileManager
{
    private static final class NoopLogStore
        implements FileLogStore
    {

        public final ByteString a()
        {
            return null;
        }

        public final void a(long l, String s)
        {
        }

        public final void b()
        {
        }

        public final void c()
        {
        }

        private NoopLogStore()
        {
        }

        NoopLogStore(byte byte0)
        {
            this();
        }
    }


    private static final NoopLogStore b = new NoopLogStore((byte)0);
    FileLogStore a;
    private final Context c;
    private final File d;

    public LogFileManager(Context context, File file)
    {
        this(context, file, null);
    }

    public LogFileManager(Context context, File file, String s)
    {
        c = context;
        d = new File(file, "log-files");
        a = b;
        a(s);
    }

    public final ByteString a()
    {
        return a.a();
    }

    public final void a(String s)
    {
        a.b();
        a = b;
        if (s == null)
        {
            return;
        }
        if (!CommonUtils.a(c, "com.crashlytics.CollectCustomLogs", true))
        {
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            return;
        }
        if (!d.exists())
        {
            d.mkdirs();
        }
        s = (new StringBuilder("crashlytics-userlog-")).append(s).append(".temp").toString();
        a = new QueueFileLogStore(new File(d, s));
    }

    public final void a(Set set)
    {
        File afile[] = d.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            int i = 0;
            while (i < j) 
            {
                File file = afile[i];
                String s = file.getName();
                int l = s.lastIndexOf(".temp");
                if (l != -1)
                {
                    s = s.substring(20, l);
                }
                if (!set.contains(s))
                {
                    file.delete();
                }
                i++;
            }
        }
    }

    public final void b()
    {
        a.c();
    }

}
