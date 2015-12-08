// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.b;

import android.app.Activity;
import android.graphics.Rect;
import android.view.SurfaceView;
import com.android.slyce.i.l;
import com.android.slyce.i.p;
import com.android.slyce.i.s;
import com.android.slyce.k.h;
import com.google.b.b.j;
import com.google.b.c;
import com.google.b.e;
import com.google.b.n;
import com.google.b.q;
import com.moodstocks.android.advanced.Tools;
import com.moodstocks.android.core.Loader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.android.slyce.b:
//            b

public class a
    implements p
{

    public static final List a;
    private final String b = com/android/slyce/b/a.getSimpleName();
    private b c;
    private l d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private com.google.b.j j;

    public a(Activity activity, SurfaceView surfaceview, b b1)
    {
        e = false;
        f = false;
        g = false;
        h = false;
        i = true;
        c = b1;
        d = new l(activity, this, surfaceview);
        i();
    }

    private void a(byte abyte0[], int k, int i1, int j1)
    {
        if (j1 != 90)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        byte abyte1[] = new byte[abyte0.length];
        for (j1 = 0; j1 < k; j1++)
        {
            for (int k1 = 0; k1 < i1; k1++)
            {
                abyte1[(k1 * k + k) - j1 - 1] = abyte0[j1 * i1 + k1];
            }

        }

        abyte0 = abyte1;
        j1 = i1;
        i1 = k;
_L4:
        Object obj;
        obj = null;
        n n1 = a(abyte0, i1, j1);
        abyte0 = obj;
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        abyte0 = new c(new j(n1));
        abyte0 = j.a(abyte0);
        j.a();
_L3:
        if (abyte0 != null)
        {
            if (f && !g)
            {
                e();
            }
            c.a(abyte0.d().name(), abyte0.a());
            return;
        }
          goto _L1
        abyte0;
        com.android.slyce.k.h.b(b, "ReaderException");
        j.a();
        abyte0 = obj;
          goto _L3
        abyte0;
        com.android.slyce.k.h.b(b, "NullPointerException");
        j.a();
        abyte0 = obj;
          goto _L3
        abyte0;
        com.android.slyce.k.h.b(b, "ArrayIndexOutOfBoundsException");
        j.a();
        abyte0 = obj;
          goto _L3
        abyte0;
        j.a();
        throw abyte0;
        j1 = k;
          goto _L4
    }

    private void i()
    {
        EnumMap enummap = new EnumMap(com/google/b/e);
        enummap.put(e.c, a);
        j = new com.google.b.j();
        j.a(enummap);
    }

    public n a(byte abyte0[], int k, int i1)
    {
        try
        {
            abyte0 = new n(abyte0, k, i1, 0, 0, k, i1, false);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public void a()
    {
        e = true;
    }

    public void a(com.android.slyce.i.e e1)
    {
        if (!h && !g)
        {
            a(e1.a, e1.b.b, e1.b.a, e1.c);
        }
        if (e)
        {
            e = false;
            android.graphics.Bitmap bitmap = Tools.convertNV21ToBitmap(e1.a, e1.b.a, e1.b.b, e1.c);
            c.a(bitmap);
        }
        e1.a();
    }

    public void a(Exception exception)
    {
    }

    public void a(boolean flag)
    {
        c.a(flag);
    }

    public void a(boolean flag, Rect rect)
    {
        d.a(flag, rect);
    }

    public void a(boolean flag, boolean flag1)
    {
        d.a(flag, flag1);
        f = true;
    }

    public void b()
    {
        f = false;
        d.b();
    }

    public void c()
    {
        g = false;
    }

    public void d()
    {
        g = true;
    }

    public void e()
    {
        h = true;
    }

    public void f()
    {
        h = false;
    }

    public void g()
    {
        boolean flag1 = true;
        b();
        boolean flag;
        if (!i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, i);
        if (!i)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i = flag;
    }

    public boolean h()
    {
        return f;
    }

    static 
    {
        a = new ArrayList();
        Loader.load();
        a.add(com.google.b.a.h);
        a.add(com.google.b.a.g);
        a.add(com.google.b.a.f);
        a.add(com.google.b.a.l);
        a.add(com.google.b.a.a);
        a.add(com.google.b.a.b);
        a.add(com.google.b.a.e);
        a.add(com.google.b.a.c);
        a.add(com.google.b.a.d);
        a.add(com.google.b.a.i);
        a.add(com.google.b.a.j);
        a.add(com.google.b.a.m);
        a.add(com.google.b.a.n);
        a.add(com.google.b.a.p);
        a.add(com.google.b.a.o);
        a.add(com.google.b.a.q);
    }
}
