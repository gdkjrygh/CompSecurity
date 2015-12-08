// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.roidapp.baselib.b.i;
import com.roidapp.baselib.c.c;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.roidapp.photogrid.release:
//            rd, GridImageView, kq, kr, 
//            ks

public final class kp
{

    private Context a;
    private Bitmap b;
    private i c;
    private Resources d;
    private HashSet e;
    private HashSet f;
    private HashSet g;
    private HashSet h;
    private int i;
    private boolean j;
    private rd k;
    private Handler l;

    public kp(Context context, int i1, Handler handler)
    {
        i = i1;
        e = new HashSet();
        f = new HashSet();
        g = new HashSet();
        h = new HashSet();
        a = context;
        d = context.getResources();
        c = new i(Math.round(0.15F * (float)Runtime.getRuntime().maxMemory()));
        k = rd.a();
        l = handler;
    }

    static Bitmap a(kp kp1, String s, int i1, boolean flag)
    {
        return kp1.a(s, i1, flag);
    }

    private Bitmap a(String s, int i1, boolean flag)
    {
        l.sendEmptyMessage(5);
        if (flag)
        {
            try
            {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inScaled = false;
                s = BitmapFactory.decodeResource(a.getResources(), Integer.valueOf(s).intValue(), options);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            return s;
        } else
        {
            return rd.b(s, i1, i1);
        }
    }

    static kr a(GridImageView gridimageview)
    {
        return b(gridimageview);
    }

    static void a(kp kp1, kr kr1, boolean flag)
    {
        if (flag)
        {
            kp1.e.remove(kr1);
            if (kp1.e.size() == 0)
            {
                kp1.l.sendEmptyMessage(6);
            }
        } else
        {
            kp1.f.remove(kr1);
            if (kp1.f.size() == 0)
            {
                kp1.l.sendEmptyMessage(6);
                return;
            }
        }
    }

    static boolean a(kp kp1)
    {
        return kp1.j;
    }

    static int b(kp kp1)
    {
        return kp1.i;
    }

    private static kr b(GridImageView gridimageview)
    {
        if (gridimageview != null)
        {
            gridimageview = gridimageview.a();
            if (gridimageview instanceof kq)
            {
                return ((kq)gridimageview).a();
            }
        }
        return null;
    }

    static i c(kp kp1)
    {
        return kp1.c;
    }

    protected final void a()
    {
        l.sendEmptyMessage(6);
        kr kr1;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); kr1.cancel(true))
        {
            kr1 = (kr)iterator.next();
            g.add(new ks(this, kr1.a, kr1.b, true, kr1.d));
        }

        e.clear();
    }

    public final void a(Bitmap bitmap)
    {
        b = bitmap;
    }

    protected final void a(String s, GridImageView gridimageview, boolean flag, boolean flag1)
    {
        Bitmap bitmap;
        if (c != null)
        {
            bitmap = c.a(s);
        } else
        {
            bitmap = null;
        }
        if (bitmap == null || bitmap.isRecycled()) goto _L2; else goto _L1
_L1:
        gridimageview.a(bitmap);
_L4:
        return;
_L2:
        boolean flag2;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        kr kr1 = b(gridimageview);
        if (kr1 != null)
        {
            String s1 = kr1.a;
            if (s1 != null && s1.equals(s))
            {
                break MISSING_BLOCK_LABEL_168;
            }
            kr1.cancel(true);
            e.remove(kr1);
        }
        flag2 = true;
_L5:
        if (!flag2) goto _L4; else goto _L3
_L3:
        kr kr2 = new kr(this, s, gridimageview, true, flag1);
        gridimageview.a(new kq(d, b, kr2));
        e.add(kr2);
        kr2.executeOnExecutor(c.EXECUTOR_SHAPE, new String[] {
            s
        });
        return;
        flag2 = false;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected final void b()
    {
        l.sendEmptyMessage(6);
        kr kr1;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); kr1.cancel(true))
        {
            kr1 = (kr)iterator.next();
            h.add(new ks(this, kr1.a, kr1.b, false, kr1.d));
        }

        f.clear();
    }

    public final void b(String s, GridImageView gridimageview, boolean flag, boolean flag1)
    {
        Bitmap bitmap;
        if (c != null)
        {
            bitmap = c.a(s);
        } else
        {
            bitmap = null;
        }
        if (bitmap == null || bitmap.isRecycled()) goto _L2; else goto _L1
_L1:
        gridimageview.a(bitmap);
_L4:
        return;
_L2:
        boolean flag2;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        kr kr1 = b(gridimageview);
        if (kr1 != null)
        {
            String s1 = kr1.a;
            if (s1 != null && s1.equals(s))
            {
                break MISSING_BLOCK_LABEL_177;
            }
            kr1.cancel(true);
            f.remove(kr1);
        }
        flag2 = true;
_L5:
        if (!flag2) goto _L4; else goto _L3
_L3:
        l.sendEmptyMessage(5);
        kr kr2 = new kr(this, s, gridimageview, false, flag1);
        gridimageview.a(new kq(d, b, kr2));
        f.add(kr2);
        kr2.executeOnExecutor(c.EXECUTOR_SHAPE, new String[] {
            s
        });
        return;
        flag2 = false;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected final void c()
    {
        ks ks1;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); a(ks1.a, ks1.b, true, ks1.d))
        {
            ks1 = (ks)iterator.next();
        }

        g.clear();
    }

    protected final void d()
    {
        ks ks1;
        for (Iterator iterator = h.iterator(); iterator.hasNext(); b(ks1.a, ks1.b, true, ks1.d))
        {
            ks1 = (ks)iterator.next();
        }

        h.clear();
    }

    public final void e()
    {
        j = true;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((kr)iterator.next()).cancel(true)) { }
        e.clear();
        for (Iterator iterator1 = f.iterator(); iterator1.hasNext(); ((kr)iterator1.next()).cancel(true)) { }
        f.clear();
        g.clear();
        h.clear();
    }

    public final void f()
    {
        c.a();
        if (b != null && !b.isRecycled())
        {
            b.recycle();
            b = null;
        }
    }

    protected final void g()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((kr)iterator.next()).cancel(true)) { }
        f.clear();
        h.clear();
    }
}
