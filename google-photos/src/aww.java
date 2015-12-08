// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class aww
{

    final amu a;
    final Handler b;
    final List c;
    final amh d;
    boolean e;
    boolean f;
    awx g;
    boolean h;
    awx i;
    Bitmap j;
    private final Context k;
    private ame l;

    private aww(Context context, amh amh1, amu amu1, Handler handler, ame ame1, anl anl, Bitmap bitmap)
    {
        c = new ArrayList();
        e = false;
        f = false;
        d = amh1;
        amh1 = new Handler(Looper.getMainLooper(), new awz(this));
        k = context;
        b = amh1;
        l = ame1;
        a = amu1;
        a(anl, bitmap);
    }

    public aww(Context context, amu amu1, int i1, int j1, anl anl, Bitmap bitmap)
    {
        this(context, aly.c(context), amu1, null, aly.c(context).f().a(((ayt)ayt.b(apa.b).a(true)).a(i1, j1)), anl, bitmap);
    }

    final Bitmap a()
    {
        if (g != null)
        {
            return g.b;
        } else
        {
            return j;
        }
    }

    final void a(anl anl, Bitmap bitmap)
    {
        b.a(anl, "Argument must not be null");
        j = (Bitmap)b.a(bitmap, "Argument must not be null");
        l = l.a((new ayt()).a(k, anl));
    }

    void b()
    {
        amu amu1;
        if (!e || f)
        {
            return;
        }
        f = true;
        amu1 = a;
        if (amu1.g.c > 0 && amu1.f >= 0) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        long l1 = SystemClock.uptimeMillis();
        long l2 = i1;
        a.a();
        i = new awx(b, a.f, l2 + l1);
        l.a().a(ayt.b(new axa())).a(a).a(i);
        return;
_L2:
        int j1 = amu1.f;
        byte byte0 = -1;
        i1 = byte0;
        if (j1 >= 0)
        {
            i1 = byte0;
            if (j1 < amu1.g.c)
            {
                i1 = ((amw)amu1.g.e.get(j1)).i;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void c()
    {
        if (j != null)
        {
            aly.b(k).a.a(j);
            j = null;
        }
    }
}
