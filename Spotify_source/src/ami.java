// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

final class ami
{

    private static final amj b = new amj((byte)0);
    amh a;
    private final Context c;
    private final File d;

    public ami(Context context, File file)
    {
        this(context, file, null);
    }

    public ami(Context context, File file, String s)
    {
        c = context;
        d = new File(file, "log-files");
        a = b;
        a(s);
    }

    public final alr a()
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
            gya.a().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            return;
        }
        if (!d.exists())
        {
            d.mkdirs();
        }
        s = (new StringBuilder("crashlytics-userlog-")).append(s).append(".temp").toString();
        a = new amz(new File(d, s));
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
                int k = s.lastIndexOf(".temp");
                if (k != -1)
                {
                    s = s.substring(20, k);
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
