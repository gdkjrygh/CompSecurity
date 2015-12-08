// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.net.http.AndroidHttpClient;
import com.android.volley.p;
import com.android.volley.toolbox.a;
import com.android.volley.toolbox.e;
import com.android.volley.toolbox.h;
import java.io.File;
import kik.android.util.d;

public final class al
{

    private p a;
    private com.android.volley.toolbox.d b;
    private File c;

    public al(File file)
    {
        c = null;
        c = file;
    }

    public final p a()
    {
        return a;
    }

    public final void a(String s, File file)
    {
        File file1 = new File(c, s);
        d.a(new File(file, s), file1);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            s = new h();
        } else
        {
            s = new e(AndroidHttpClient.newInstance("AN"));
        }
        s = new a(s);
        b = new com.android.volley.toolbox.d(file1, 0x100000);
        a = new p(b, s, 2);
        a.a();
    }

    public final void b()
    {
        b.b();
    }
}
