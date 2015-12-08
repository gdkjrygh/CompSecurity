// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class amh
    implements axs
{

    public static final ayt a;
    private static final ayt g;
    private static final ayt h;
    public final ama b;
    final axy c;
    public final axx d;
    final ayb e;
    aym f;
    private final axr i;
    private final Runnable j;
    private final Handler k;
    private final ds l;
    private aym m;

    public amh(Context context, axr axr1, axx axx1)
    {
        this(context, axr1, axx1, new axy(), new axn());
    }

    private amh(Context context, axr axr1, axx axx1, axy axy1, axn axn1)
    {
        e = new ayb();
        j = new ami(this);
        k = new Handler(Looper.getMainLooper());
        b = aly.b(context).b;
        i = axr1;
        d = axx1;
        c = axy1;
        axx1 = new axm(axy1);
        boolean flag;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            axx1 = new axo(context, axx1);
        } else
        {
            axx1 = new axt();
        }
        l = axx1;
        if (bag.d())
        {
            k.post(j);
        } else
        {
            axr1.a(this);
        }
        axr1.a(l);
        m = b.c;
        f = m;
        axr1 = aly.b(context);
        context = ((aly) (axr1)).d;
        context;
        JVM INSTR monitorenter ;
        if (((aly) (axr1)).d.contains(this))
        {
            throw new IllegalStateException("Cannot register already registered manager");
        }
        break MISSING_BLOCK_LABEL_224;
        axr1;
        context;
        JVM INSTR monitorexit ;
        throw axr1;
        ((aly) (axr1)).d.add(this);
        context;
        JVM INSTR monitorexit ;
    }

    static axr a(amh amh1)
    {
        return amh1.i;
    }

    private void i()
    {
        bag.a();
        axy axy1 = c;
        axy1.c = false;
        Iterator iterator = bag.a(axy1.a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ayo ayo1 = (ayo)iterator.next();
            if (!ayo1.f() && !ayo1.h() && !ayo1.e())
            {
                ayo1.a();
            }
        } while (true);
        axy1.b.clear();
    }

    public final ame a(Class class1)
    {
        return new ame(b, this, class1);
    }

    public final ame a(Object obj)
    {
        return g().a(obj);
    }

    public final void a()
    {
        bag.a();
        axy axy1 = c;
        axy1.c = true;
        Iterator iterator = bag.a(axy1.a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ayo ayo1 = (ayo)iterator.next();
            if (ayo1.e())
            {
                ayo1.c();
                axy1.b.add(ayo1);
            }
        } while (true);
    }

    public final void a(int i1)
    {
        b.onTrimMemory(i1);
    }

    public final void a(View view)
    {
        a(((azh) (new amk(view))));
    }

    public final void a(azh azh1)
    {
        if (azh1 != null)
        {
            if (bag.c())
            {
                if (!b(azh1))
                {
                    aly.b(b).a(azh1);
                    return;
                }
            } else
            {
                k.post(new amj(this, azh1));
                return;
            }
        }
    }

    public final ame b(Object obj)
    {
        return h().a(obj);
    }

    public final void b()
    {
        bag.a();
        i();
        for (Iterator iterator = d.a().iterator(); iterator.hasNext(); ((amh)iterator.next()).i()) { }
    }

    final boolean b(azh azh1)
    {
        ayo ayo1 = azh1.a();
        if (ayo1 == null)
        {
            return true;
        }
        if (c.a(ayo1))
        {
            e.a.remove(azh1);
            azh1.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public final void c_()
    {
        i();
        e.c_();
    }

    public final void d_()
    {
        a();
        e.d_();
    }

    public final ame f()
    {
        return a(android/graphics/Bitmap).a(new avg()).a(g);
    }

    public final ame g()
    {
        return a(android/graphics/drawable/Drawable).a(new awl());
    }

    public final ame h()
    {
        return a(java/io/File).a(h);
    }

    public final void j_()
    {
        Object obj;
        e.j_();
        for (Iterator iterator = (new ArrayList(e.a)).iterator(); iterator.hasNext(); a((azh)iterator.next())) { }
        e.a.clear();
        c.a();
        i.b(this);
        i.b(l);
        k.removeCallbacks(j);
        obj = aly.b(b);
        List list = ((aly) (obj)).d;
        list;
        JVM INSTR monitorenter ;
        if (!((aly) (obj)).d.contains(this))
        {
            throw new IllegalStateException("Cannot register not yet registered manager");
        }
        break MISSING_BLOCK_LABEL_149;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        ((aly) (obj)).d.remove(this);
        list;
        JVM INSTR monitorexit ;
    }

    public String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(c);
        String s2 = String.valueOf(d);
        return (new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append("{tracker=").append(s1).append(", treeNode=").append(s2).append("}").toString();
    }

    static 
    {
        ayt ayt1 = ayt.b(android/graphics/Bitmap);
        ayt1.s = true;
        g = (ayt)ayt1;
        ayt1 = ayt.b(awr);
        ayt1.s = true;
        a = (ayt)ayt1;
        h = (ayt)((ayt)ayt.b(apa.c).a(amb.d)).a(true);
    }
}
