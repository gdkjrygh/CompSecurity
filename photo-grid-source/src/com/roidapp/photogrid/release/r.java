// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            b, rd, PhotoGridActivity, GridImageView, 
//            aa, v, u, s, 
//            t, a

public final class r extends Fragment
{

    private PhotoGridActivity a;
    private LruCache b;
    private v c;
    private boolean d;
    private int e;
    private int f;
    private a g;
    private final int h = 15;
    private ArrayList i;
    private int j;
    private Context k;
    private TextView l;
    private GridView m;
    private View n;
    private boolean o;

    public r()
    {
        d = false;
        e = -1;
        f = -1;
        i = new ArrayList();
        j = 0;
        o = false;
    }

    static int a(Bitmap bitmap)
    {
        return b(bitmap);
    }

    private Bitmap a(b b1)
    {
        if (b1 == null || b == null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        String s1;
        LruCache lrucache;
        if (b1.g)
        {
            s1 = b1.e;
        } else
        {
            s1 = String.valueOf(b1.a);
        }
        lrucache = b;
        lrucache;
        JVM INSTR monitorenter ;
        if (b == null || b.size() <= 0) goto _L4; else goto _L3
_L3:
        bitmap = (Bitmap)b.get(s1);
        if (bitmap == null) goto _L4; else goto _L5
_L5:
        lrucache;
        JVM INSTR monitorexit ;
        if (bitmap == null) goto _L7; else goto _L6
_L6:
        return bitmap;
_L4:
        bitmap = null;
        continue; /* Loop/switch isn't completed */
        b1;
        lrucache;
        JVM INSTR monitorexit ;
        throw b1;
_L7:
        if (b1.f)
        {
            rd.a();
            return rd.a(b1.c, f, e);
        }
        if (!b1.h)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (!(new File(s1)).exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        rd.a();
        b1 = rd.a(s1, f, e);
        return b1;
        if (b1.g)
        {
            if (k == null)
            {
                try
                {
                    k = a.createPackageContext(b1.d, 2);
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    namenotfoundexception.printStackTrace();
                }
            }
            if (k != null)
            {
                rd.a();
                return rd.a(k, b1.e, f, e);
            }
        } else
        {
            rd.a();
            return rd.a(a, b1.a, f, e);
        }
        if (true) goto _L6; else goto _L2
_L2:
        return null;
        b1;
        return bitmap;
        if (true) goto _L5; else goto _L8
_L8:
    }

    static Bitmap a(r r1, b b1)
    {
        return r1.a(b1);
    }

    static PhotoGridActivity a(r r1)
    {
        return r1.a;
    }

    static u a(GridImageView gridimageview)
    {
        return b(gridimageview);
    }

    static boolean a(r r1, boolean flag)
    {
        r1.o = flag;
        return flag;
    }

    private static int b(Bitmap bitmap)
    {
        if (!com.roidapp.baselib.c.n.e())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        Method method = android/graphics/Bitmap.getMethod("getByteCount", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        int i1 = ((Integer)method.invoke(bitmap, null)).intValue();
        return i1;
        Exception exception;
        exception;
        exception.printStackTrace();
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    private static u b(GridImageView gridimageview)
    {
        if (gridimageview != null)
        {
            gridimageview = gridimageview.a();
            if (gridimageview instanceof aa)
            {
                return ((aa)gridimageview).a();
            }
        }
        return null;
    }

    static ArrayList b(r r1)
    {
        return r1.i;
    }

    static LruCache c(r r1)
    {
        return r1.b;
    }

    private void c()
    {
        if (b != null)
        {
            b.evictAll();
        }
    }

    static boolean d(r r1)
    {
        return r1.d;
    }

    static int e(r r1)
    {
        return r1.e;
    }

    static int f(r r1)
    {
        return r1.f;
    }

    static a g(r r1)
    {
        return r1.g;
    }

    static boolean h(r r1)
    {
        return r1.o;
    }

    protected final void a()
    {
        if (j == 2)
        {
            if (i.isEmpty())
            {
                l.setVisibility(0);
            } else
            {
                l.setVisibility(8);
            }
            n.setVisibility(0);
        } else
        if (j == 3)
        {
            l.setVisibility(8);
            n.setVisibility(8);
            c();
        } else
        {
            n.setVisibility(8);
            l.setVisibility(8);
        }
        if (m != null)
        {
            m.setAdapter(null);
            c = new v(this, i);
            m.setAdapter(c);
        }
    }

    public final void a(int i1, int j1, a a1)
    {
        e = i1;
        f = j1;
        g = a1;
    }

    public final void a(int i1, GridImageView gridimageview)
    {
        if (i != null && !i.isEmpty() && i1 <= i.size() && i.size() > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1 = i;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = (b)i.get(i1);
        if (!((b) (obj)).g) goto _L4; else goto _L3
_L3:
        obj = ((b) (obj)).e;
_L6:
        boolean flag;
        obj1 = b(gridimageview);
        if (obj1 != null)
        {
            String s1 = u.a(((u) (obj1)));
            if (s1 != null && s1.equals(obj))
            {
                break MISSING_BLOCK_LABEL_179;
            }
            ((u) (obj1)).cancel(true);
        }
        flag = true;
_L7:
        if (!flag) goto _L1; else goto _L5
_L5:
        obj = new u(this, gridimageview);
        gridimageview.a(new aa(this, ((u) (obj))));
        ((u) (obj)).execute(new Integer[] {
            Integer.valueOf(i1)
        });
        return;
_L4:
        obj = String.valueOf(((b) (obj)).a);
          goto _L6
        gridimageview;
        obj1;
        JVM INSTR monitorexit ;
        throw gridimageview;
        flag = false;
          goto _L7
    }

    public final void a(int i1, ArrayList arraylist, Context context, boolean flag)
    {
        j = i1;
        i = arraylist;
        k = context;
        d = flag;
    }

    protected final void a(boolean flag)
    {
        d = flag;
        b(true);
    }

    protected final void b()
    {
        if (m != null)
        {
            m.setAdapter(null);
            m = null;
        }
        c = null;
        c();
    }

    protected final void b(boolean flag)
    {
        if (flag)
        {
            if (m != null)
            {
                m.setAdapter(null);
                c = new v(this, i);
                m.setAdapter(c);
            }
        } else
        if (c != null)
        {
            c.notifyDataSetChanged();
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030003, null);
        l = (TextView)layoutinflater.findViewById(0x7f0d0034);
        m = (GridView)layoutinflater.findViewById(0x7f0d0035);
        n = layoutinflater.findViewById(0x7f0d0036);
        layoutinflater.findViewById(0x7f0d0037).setOnClickListener(new s(this));
        if (b == null)
        {
            b = new t(this, (int)Runtime.getRuntime().maxMemory() / 10);
        }
        a();
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        if (m != null)
        {
            m.setAdapter(null);
            m = null;
        }
        c = null;
        c();
    }
}
