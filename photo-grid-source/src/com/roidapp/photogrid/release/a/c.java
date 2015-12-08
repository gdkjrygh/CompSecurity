// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release.a;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.a.k;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.d.a;
import java.io.File;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release.a:
//            a, d

public class c
{

    private static c d = null;
    List a;
    com.roidapp.photogrid.release.a.a b;
    private File c;

    private c()
    {
        c = aj.a().getFileStreamPath("sticker_data_file");
    }

    public static c a()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/roidapp/photogrid/release/a/c;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new c();
        }
        com/roidapp/photogrid/release/a/c;
        JVM INSTR monitorexit ;
_L2:
        return d;
        Exception exception;
        exception;
        com/roidapp/photogrid/release/a/c;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        long l = PreferenceManager.getDefaultSharedPreferences(aj.a()).getLong("sticker_check_cycle", -1L);
        boolean flag;
        if (System.currentTimeMillis() - l >= 0x5265c00L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (b == null)
            {
                b = new com.roidapp.photogrid.release.a.a();
            }
            b.a(c);
        }
    }

    public final List c()
    {
        if (a == null)
        {
            if (c.exists())
            {
                String s = com.roidapp.baselib.d.a.a(c, "UTF-8");
                a = (List)(new k()).a(s, (new d(this)).b());
            } else
            {
                b();
            }
        }
        return a;
    }

}
