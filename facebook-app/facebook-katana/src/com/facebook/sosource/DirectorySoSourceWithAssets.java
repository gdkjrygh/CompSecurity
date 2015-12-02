// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sosource;

import android.content.Context;
import com.facebook.soloader.DirectorySoSource;
import com.facebook.soloader.FileLocker;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.sosource:
//            ApkXzsTools

public class DirectorySoSourceWithAssets extends DirectorySoSource
{

    private final File c;
    private Context d;
    private List e;
    private Map f;
    private Map g;

    public DirectorySoSourceWithAssets(Context context, File file, int i)
    {
        super(file, i);
        d = context;
        c = SysUtil.c(context);
        e = new ArrayList();
        f = new HashMap();
        g = new HashMap();
    }

    public final int a(String s, int i)
    {
        int j = a(s, i, a);
        if (j != 0)
        {
            return j;
        } else
        {
            return a(s, i, c);
        }
    }

    public final File a(String s)
    {
        File file = super.a(s);
        if (file != null)
        {
            s = file;
        } else
        {
            File file1 = new File(c, s);
            s = file1;
            if (!file1.exists())
            {
                return null;
            }
        }
        return s;
    }

    public final void a()
    {
        FileLocker filelocker;
        boolean flag;
        ApkXzsTools.a(d, e, f);
        ApkXzsTools.a(c, g);
        filelocker = SysUtil.a(d);
        flag = true;
        ApkXzsTools.a(c, f, g);
        flag = false;
        ApkXzsTools.a(d, c, e, f, filelocker);
        return;
        Exception exception;
        exception;
        if (flag)
        {
            filelocker.close();
        }
        throw exception;
    }
}
