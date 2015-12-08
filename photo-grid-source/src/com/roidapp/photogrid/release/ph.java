// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.os.Build;
import android.os.Message;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import com.roidapp.videolib.a.a;
import com.roidapp.videolib.core.a.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            pg, ml

final class ph
    implements b
{

    final ml a;
    final Activity b;
    final pg c;

    ph(pg pg1, ml ml1, Activity activity)
    {
        c = pg1;
        a = ml1;
        b = activity;
        super();
    }

    public final void a()
    {
        com.roidapp.photogrid.release.pg.a(c, System.currentTimeMillis());
    }

    public final void a(int i, int j)
    {
        com.roidapp.photogrid.release.pg.a(c, j);
        if (com.roidapp.photogrid.release.pg.a(c) && i == -1)
        {
            return;
        } else
        {
            a.b(i, j);
            return;
        }
    }

    public final void a(int i, int j, String s, String s1, String s2)
    {
        af.b(b, (new StringBuilder("Video/VideoActivity/Save/Failed/")).append(pg.d(c)).toString());
        (new StringBuilder("(Product Model:")).append(Build.MODEL).append(",SDK:").append(android.os.Build.VERSION.RELEASE).append(")");
        com.roidapp.videolib.a.a.a();
        s = Message.obtain();
        s.what = 21;
        s.arg1 = i;
        s.arg2 = j;
        s.obj = s2;
        a.sendMessage(s);
    }

    public final void a(String s)
    {
        String s1 = s;
        if (com.roidapp.photogrid.release.pg.b(c) != null)
        {
            s1 = s;
            if (ae.a(b, s, com.roidapp.photogrid.release.pg.b(c)))
            {
                s1 = com.roidapp.photogrid.release.pg.b(c);
            }
            pg.c(c);
        }
        com.roidapp.videolib.a.a.a();
        c.e = s1;
        az.v = true;
        Activity activity = b;
        StringBuilder stringbuilder = (new StringBuilder("Video/VideoActivity/Save/Success/")).append(pg.d(c)).append("/").append(pg.e(c)).append("/").append(pg.f(c)).append("/");
        if (pg.g(c) == null)
        {
            s = "none/";
        } else
        {
            s = "has/";
        }
        stringbuilder = stringbuilder.append(s).append(pg.h(c)).append("/").append(pg.i(c)).append("/").append(pg.j(c)).append("/");
        if (pg.k(c))
        {
            s = "BackgroundOn/";
        } else
        {
            s = "BackgroundOff/";
        }
        stringbuilder = stringbuilder.append(s);
        if (pg.l(c))
        {
            s = "BorderOn/";
        } else
        {
            s = "BorderOff/";
        }
        stringbuilder = stringbuilder.append(s);
        if (pg.m(c))
        {
            s = (new StringBuilder("/signshow/")).append(pg.n(c)).toString();
        } else
        {
            s = "";
        }
        af.b(activity, stringbuilder.append(s).toString());
        c.a(b, s1);
    }

    public final void b()
    {
        com.roidapp.videolib.a.a.a();
        a.sendEmptyMessage(20);
        Message message = Message.obtain();
        message.what = 2;
        a.sendMessage(message);
    }
}
