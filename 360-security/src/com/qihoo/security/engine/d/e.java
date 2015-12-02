// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.qihoo.security.engine.FileInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.engine.d:
//            c, b

public class e extends c
{

    final Context c;
    final PackageManager d;
    final String e;
    final ArrayList f = new ArrayList();
    private int g;

    public e(Context context, String s, c.a a1)
    {
        super(a1);
        g = 0;
        c = context;
        d = context.getPackageManager();
        e = s;
    }

    private void a(String s)
    {
        try
        {
            f.add(d.getPackageInfo(s, 64));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public int a()
    {
        return 3;
    }

    public int a(String s, String s1)
    {
        return 0x80004001;
    }

    public int b()
    {
        Iterator iterator;
        f.clear();
        if (!TextUtils.isEmpty(e))
        {
            break MISSING_BLOCK_LABEL_72;
        }
        iterator = d.getInstalledApplications(0).iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        g = f.size();
        return 0;
_L2:
        a(((ApplicationInfo)iterator.next()).packageName);
          goto _L3
        a(e);
          goto _L1
    }

    public int c()
    {
        f.clear();
        return 0;
    }

    public int d()
    {
        Iterator iterator = f.iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        Object obj = (PackageInfo)iterator.next();
        if (b) goto _L1; else goto _L3
_L3:
        obj = new FileInfo(d, ((PackageInfo) (obj)));
        b b1 = new b(3, 1);
        b1.c = ((FileInfo) (obj));
        a.a(b1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int e()
    {
        return g;
    }
}
