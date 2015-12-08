// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.util.Map;

final class boy
    implements bsg
{

    private boj a;

    boy(boj boj1)
    {
        a = boj1;
        super();
    }

    public final void a()
    {
        if (((bmb) (boj.k(a))).d)
        {
            boj.k(a).l();
        }
    }

    public final void a(int i)
    {
        if (ddy.i.a() && a.c.c.d && a.c.f())
        {
            Object obj = a.c.c.e;
            obj = ((cqf) (obj)).b(blj.a(i, ((cqf) (obj))));
            if (((cnq) (obj)).d != cnt.c)
            {
                Object obj1 = a.c;
                int j = ((bww) (obj1)).a(((cnq) (obj)).e.b);
                boolean flag;
                if (j != -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b.a(flag, "uri not found");
                if (((bww) (obj1)).b(j).a().f < boj.b())
                {
                    Toast.makeText(boj.g(a), c.bS, 0).show();
                    return;
                }
                obj = (Boolean)a.c.z().get(((cnq) (obj)).e.a);
                if (obj == null)
                {
                    Log.w(boj.d(), "Can't find CloudMediaId in map; assuming video stream isn't local.");
                    obj = Boolean.valueOf(false);
                }
                boj.k(a).l();
                boj.l(a).a(i);
                obj1 = (bzg)olm.a(boj.g(a), bzg);
                String s = boj.l(a).b();
                obj1 = (File)((bzg) (obj1)).b.get(s);
                if (obj1 == null)
                {
                    obj1 = null;
                } else
                {
                    obj1 = Uri.fromFile(((File) (obj1)));
                }
                if (((Boolean) (obj)).booleanValue() || obj1 != null)
                {
                    boj.l(a).b = ((Uri) (obj1));
                    boj.a(a).i();
                    return;
                } else
                {
                    boj.i(a).b.a(bze.a);
                    boj.a(a).k();
                    return;
                }
            }
        }
    }

    public final void a(boolean flag)
    {
        a.c.a(bwy.a);
        if (flag)
        {
            boj.m(a).b();
        }
    }

    public final void b()
    {
        if (((bmb) (boj.k(a))).d)
        {
            boj.k(a).t();
        }
    }
}
