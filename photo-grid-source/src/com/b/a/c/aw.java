// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.l;
import a.a.a.a.f;
import android.content.Context;
import java.io.File;
import java.util.Set;

// Referenced classes of package com.b.a.c:
//            ax, av, bo, b

final class aw
{

    private static final ax a = new ax((byte)0);
    private final Context b;
    private final File c;
    private av d;

    public aw(Context context, File file)
    {
        this(context, file, null);
    }

    public aw(Context context, File file, String s)
    {
        b = context;
        c = new File(file, "log-files");
        d = a;
        a(s);
    }

    public final b a()
    {
        return d.a();
    }

    public final void a(String s)
    {
        d.b();
        d = a;
        if (s == null)
        {
            return;
        }
        if (!l.a(b, "com.crashlytics.CollectCustomLogs", true))
        {
            f.d();
            return;
        }
        if (!c.exists())
        {
            c.mkdirs();
        }
        s = (new StringBuilder("crashlytics-userlog-")).append(s).append(".temp").toString();
        d = new bo(new File(c, s));
    }

    public final void a(Set set)
    {
        File afile[] = c.listFiles();
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
        d.c();
    }

}
