// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android:
//            ByteString

class LogFileManager
{

    private final Context a;
    private final File b;
    private QueueFile c;

    public LogFileManager(Context context, File file)
    {
        this(context, file, null);
    }

    LogFileManager(Context context, File file, QueueFile queuefile)
    {
        a = context;
        b = file;
        c = queuefile;
    }

    private boolean c()
    {
        if (!CommonUtils.a(a, "com.crashlytics.CollectCustomLogs", true))
        {
            Fabric.g().a("Fabric", "Preferences requested no custom logs. Aborting log file creation.");
            return false;
        }
        CommonUtils.a(c, (new StringBuilder()).append("Could not close log file: ").append(c).toString());
        File file;
        String s = (new StringBuilder()).append("crashlytics-userlog-").append(UUID.randomUUID().toString()).append(".temp").toString();
        file = new File(b, s);
        c = new QueueFile(file);
        file.delete();
        return true;
        Exception exception;
        exception;
        file = null;
_L2:
        Fabric.g().d("Fabric", (new StringBuilder()).append("Could not create log file: ").append(file).toString(), exception);
        return false;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    ByteString a()
    {
        if (c == null)
        {
            return null;
        }
        int ai[] = new int[1];
        ai[0] = 0;
        byte abyte0[] = new byte[c.a()];
        try
        {
            c.a(new io.fabric.sdk.android.services.common.QueueFile.ElementReader(abyte0, ai) {

                final byte a[];
                final int b[];
                final LogFileManager c;

                public void a(InputStream inputstream, int i)
                {
                    int ai1[];
                    inputstream.read(a, b[0], i);
                    ai1 = b;
                    ai1[0] = ai1[0] + i;
                    inputstream.close();
                    return;
                    Exception exception;
                    exception;
                    inputstream.close();
                    throw exception;
                }

            
            {
                c = LogFileManager.this;
                a = abyte0;
                b = ai;
                super();
            }
            });
        }
        catch (IOException ioexception)
        {
            Fabric.g().d("Fabric", "A problem occurred while reading the Crashlytics log file.", ioexception);
        }
        return ByteString.a(abyte0, 0, ai[0]);
    }

    void a(int i, long l, String s)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (s == null)
        {
            s = "null";
        }
        String s1;
        int j;
        try
        {
            j = i / 4;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Fabric.g().d("Fabric", "There was a problem writing to the Crashlytics log.", s);
            return;
        }
        s1 = s;
        if (s.length() > j)
        {
            s1 = (new StringBuilder()).append("...").append(s.substring(s.length() - j)).toString();
        }
        s = s1.replaceAll("\r", " ").replaceAll("\n", " ");
        s = String.format(Locale.US, "%d %s%n", new Object[] {
            Long.valueOf(l), s
        }).getBytes("UTF-8");
        c.a(s);
        while (!c.b() && c.a() > i) 
        {
            c.c();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(long l, String s)
    {
        if (c == null)
        {
            c();
        }
        a(0x10000, l, s);
    }

    void b()
    {
        CommonUtils.a(c, "There was a problem closing the Crashlytics log file.");
        c = null;
    }
}
