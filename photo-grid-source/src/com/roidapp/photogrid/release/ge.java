// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.common.d;
import com.roidapp.photogrid.cloud.aj;
import com.roidapp.photogrid.cloud.ak;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, rc, PhotoView, ra, 
//            ha, gv, gr, gs, 
//            gt, gu, gg, gh, 
//            gj, gi, gx, gp, 
//            gq, gk, gm, gl, 
//            gz, gf, gn, go

public final class ge extends Fragment
{

    private static ThreadPoolExecutor A;
    private static ThreadPoolExecutor z;
    private PhotoGridActivity a;
    private HashMap b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private String g[] = {
        "Default", "Bold", "Monospace", "Sans_serif", "Serif", "ahundredmiles", "Blunt", "Binz", "desyrel", "FreeUniversal-Bold", 
        "gtw", "HandTest", "Impact", "Jester", "Junction 02", "Laine", "NotCourierSans", "OSP-DIN", "otfpoc", "Polsku", 
        "PressStart2P", "Quicksand-Regular", "Roboto Thin", "RomanAntique", "SerreriaSobria", "Strato-linked", "Thonburi", "waltographUI"
    };
    private String h[];
    private String i[];
    private long j[];
    private long k[];
    private ArrayList l;
    private ArrayList m;
    private File n;
    private ListView o;
    private ListView p;
    private AlertDialog q;
    private ProgressBar r;
    private TextView s;
    private aj t;
    private List u;
    private Handler v;
    private boolean w;
    private boolean x;
    private WeakReference y;

    public ge()
    {
        c = 0;
        d = false;
        h = new String[0];
        i = new String[0];
        j = new long[0];
        k = new long[0];
        l = new ArrayList();
        m = new ArrayList();
        w = true;
    }

    static int a(ge ge1, int i1)
    {
        ge1.c = i1;
        return i1;
    }

    private static long a(File file)
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        Method method;
        long l1;
        try
        {
            method = java/io/File.getMethod("getUsableSpace", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
            return 0L;
        }
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        l1 = ((Long)method.invoke(file, null)).longValue();
        return l1;
        int i1;
        long l2;
        try
        {
            file = new StatFs(file.getPath());
            l2 = file.getBlockSize();
            i1 = file.getAvailableBlocks();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
            return 0L;
        }
        return (long)i1 * l2;
    }

    static HashMap a(ge ge1, HashMap hashmap)
    {
        ge1.b = hashmap;
        return hashmap;
    }

    static void a(ge ge1, File file)
    {
        if (ge1.a != null && !ge1.a.isFinishing() && ge1.p != null && ge1.p.getVisibility() != 8 && file != null && file.exists())
        {
            PhotoView photoview = ge1.a.O();
            if (photoview != null)
            {
                file = rc.a(ge1.a).a(file);
                Object obj = photoview.g();
                if (obj != null && (obj instanceof ra))
                {
                    ge1.c = 0;
                    obj = (ra)obj;
                    if (file != null)
                    {
                        ((ra) (obj)).b(file);
                        rc.a(ge1.a).b(ge1.a);
                        ge1.b = rc.a(ge1.a).a();
                        ge1.e();
                        if (ge1.p != null)
                        {
                            ge1 = (ha)ge1.p.getAdapter();
                            if (ge1 != null)
                            {
                                ge1.notifyDataSetChanged();
                            }
                        }
                        photoview.invalidate();
                        return;
                    }
                }
            }
        }
    }

    static void a(ge ge1, String s1, String s2)
    {
        long l1;
        long l2;
        l2 = -1L;
        NetworkInfo networkinfo = ((ConnectivityManager)ge1.a.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean flag;
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            ge1.h();
            return;
        }
        if (!ge1.n.exists() && !ge1.n.mkdirs())
        {
            an.a(new WeakReference(ge1.a), ge1.a.getResources().getString(0x7f07016f));
            return;
        }
        ge1.f();
        int i1 = 0;
        do
        {
            if (i1 >= ge1.h.length)
            {
                break MISSING_BLOCK_LABEL_602;
            }
            if (ge1.h[i1].equals(s1))
            {
                l1 = ge1.k[i1];
                l2 = ge1.j[i1];
                break MISSING_BLOCK_LABEL_149;
            }
            i1++;
        } while (true);
_L2:
        if (!ge1.n.canWrite())
        {
            ge1.v.sendEmptyMessage(4);
            return;
        }
        if (a(ge1.n) < 0xf00000L)
        {
            ge1.v.sendEmptyMessage(6);
            return;
        }
        File file = new File(ge1.n, s1);
        gv gv1 = new gv(ge1.a.getApplicationContext(), ge1.v, s1, s2, file, l1, l2, (byte)0);
        ge1.y = new WeakReference(gv1);
        if (ge1.a == null || ge1.a.isFinishing())
        {
            if (file.exists())
            {
                file.delete();
            }
        } else
        {
            Object obj = new android.app.AlertDialog.Builder(ge1.a);
            if (ge1.q == null)
            {
                ge1.q = ((android.app.AlertDialog.Builder) (obj)).create();
                ge1.q.setIcon(0x1080055);
                obj = LayoutInflater.from(ge1.a).inflate(0x7f030005, null);
                ge1.q.setView(((View) (obj)));
                ge1.q.setCancelable(true);
                ge1.q.setCanceledOnTouchOutside(false);
            }
            ge1.q.setOnCancelListener(new gr(ge1));
            ge1.q.setOnDismissListener(new gs(ge1));
            ge1.q.show();
            ge1.a.i = true;
            ge1.r = (ProgressBar)ge1.q.findViewById(0x7f0d0045);
            ge1.r.setProgress(0);
            ge1.r.setMax(100);
            ge1.s = (TextView)ge1.q.findViewById(0x7f0d0044);
            ge1.s.setText("");
            ((TextView)ge1.q.findViewById(0x7f0d0048)).setTextColor(ge1.getResources().getColor(0x7f0c00bf));
            ge1.r.setVisibility(0);
            ((TextView)ge1.q.findViewById(0x7f0d0043)).setText(0x7f070039);
            obj = ge1.q.findViewById(0x7f0d0046);
            ((View) (obj)).setOnClickListener(new gt(ge1, file, s1, s2));
            ((View) (obj)).setVisibility(8);
            s1 = ge1.q.findViewById(0x7f0d0047);
            s1.setClickable(true);
            s1.setOnClickListener(new gu(ge1));
        }
        z.execute(gv1);
        return;
        l1 = -1L;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    static boolean a(ge ge1)
    {
        return ge1.d;
    }

    static boolean a(ge ge1, String s1)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < ge1.l.size())
                {
                    if (!s1.equals(ge1.l.get(i1)))
                    {
                        break label0;
                    }
                    if (ge1.a.O() != null)
                    {
                        s1 = (Typeface)ge1.b.get(Integer.valueOf(i1));
                        ra ra1 = (ra)ge1.a.O().g();
                        if (ra1 != null && (ra1 instanceof ra))
                        {
                            ((ra)ra1).b(s1);
                            ge1.a.O().invalidate();
                        }
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    static ListView b(ge ge1)
    {
        return ge1.o;
    }

    static ThreadPoolExecutor b()
    {
        return A;
    }

    static void b(ge ge1, int i1)
    {
        if (ge1.r != null)
        {
            ge1.r.setProgress(i1);
        }
        if (ge1.s != null)
        {
            ge1.s.setText((new StringBuilder()).append(i1).append("%").toString());
        }
    }

    static void b(ge ge1, File file)
    {
        if (file.exists())
        {
            file.delete();
        }
        if (ge1.a == null || ge1.a.isFinishing())
        {
            return;
        } else
        {
            ge1.h();
            return;
        }
    }

    static void b(ge ge1, String s1, String s2)
    {
        ge1.d = true;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(ge1.a);
        builder.setOnKeyListener(new gg(ge1));
        builder.setOnCancelListener(new gh(ge1));
        builder.setMessage(ge1.a.getString(0x7f070125)).setPositiveButton(ge1.a.getString(0x7f07016b), new gj(ge1, s1, s2)).setNegativeButton(ge1.a.getString(0x7f070049), new gi(ge1)).show();
    }

    static boolean b(ge ge1, String s1)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < ge1.l.size())
                {
                    if (!s1.equals(ge1.l.get(i1)))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    static ListView c(ge ge1)
    {
        return ge1.p;
    }

    private void c()
    {
        h = new String[u.size()];
        i = new String[u.size()];
        j = new long[u.size()];
        k = new long[u.size()];
        for (int i1 = 0; i1 < u.size(); i1++)
        {
            ak ak1 = (ak)u.get(i1);
            h[i1] = ak1.a();
            i[i1] = ak1.c();
            j[i1] = ak1.d();
            k[i1] = ak1.e();
        }

    }

    static void c(ge ge1, String s1)
    {
        if (ge1.q != null)
        {
            ge1.q.findViewById(0x7f0d0045).setVisibility(8);
            ge1.q.findViewById(0x7f0d0046).setVisibility(0);
            ((TextView)ge1.q.findViewById(0x7f0d0043)).setText(s1);
        }
    }

    static void c(ge ge1, String s1, String s2)
    {
        boolean flag1;
label0:
        {
            flag1 = false;
            s1 = new File(s1, s2);
            if (s1.exists())
            {
                s1.delete();
                if (ge1.a.O() != null)
                {
                    s1 = ge1.a.O().g();
                    if (s1 != null && (s1 instanceof ra))
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        s1 = (ra)s1;
        int i1 = s1.a(s1.b(ge1.c));
        s2 = s2.substring(0, s2.indexOf("."));
        boolean flag = flag1;
        if (ge1.l != null)
        {
            flag = flag1;
            if (i1 >= 0)
            {
                flag = flag1;
                if (i1 < ge1.l.size())
                {
                    flag = flag1;
                    if (s2.equals(ge1.l.get(i1)))
                    {
                        flag = true;
                    }
                }
            }
        }
        ge1.e();
        if (flag)
        {
            s1.b(Typeface.DEFAULT);
            ge1.c = s1.a(Typeface.DEFAULT);
        }
        ((ha)ge1.p.getAdapter()).notifyDataSetChanged();
        ge1.a.O().invalidate();
    }

    private void d()
    {
        if (a.O() == null)
        {
            c = 0;
            return;
        }
        ao ao = a.O().g();
        if (ao == null || !(ao instanceof ra) || b == null)
        {
            c = 0;
            return;
        } else
        {
            c = ((ra)ao).o();
            return;
        }
    }

    static void d(ge ge1)
    {
        ge1.p.setAdapter(null);
        ge1.o.setAdapter(new gx(ge1));
        ge1.d();
        ge1.o.setSelection(ge1.c);
        ge1.o.setOnItemClickListener(new gp(ge1));
    }

    private void e()
    {
        l.clear();
        m.clear();
        for (int i1 = 0; i1 < g.length; i1++)
        {
            l.add(g[i1]);
            m.add(g[i1]);
        }

        Object obj1 = rc.a(a).c();
        Object obj = rc.a(a).d();
        String s2;
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); l.add(0, s2))
        {
            s2 = (String)((Iterator) (obj1)).next();
        }

        String s1;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); m.add(0, s1))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

    }

    static void e(ge ge1)
    {
        ge1.p.setAdapter(new ha(ge1));
        ge1.p.setOnItemClickListener(new gq(ge1));
    }

    static PhotoGridActivity f(ge ge1)
    {
        return ge1.a;
    }

    private void f()
    {
        gv gv1;
        if (y != null)
        {
            gv1 = (gv)y.get();
        } else
        {
            gv1 = null;
        }
        if (gv1 != null)
        {
            gv.a(gv1);
        }
        y = null;
    }

    static HashMap g(ge ge1)
    {
        return ge1.b;
    }

    private void g()
    {
        if (q == null || a == null || a.isFinishing())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        q.dismiss();
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    private void h()
    {
        g();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        builder.setOnKeyListener(new gk(this));
        builder.setTitle(a.getString(0x7f070110)).setMessage(a.getString(0x7f0701f8)).setPositiveButton(a.getString(0x7f070298), new gm(this)).setNegativeButton(a.getString(0x7f070049), new gl(this)).show();
    }

    static void h(ge ge1)
    {
        ((gx)ge1.o.getAdapter()).notifyDataSetChanged();
    }

    static String[] i(ge ge1)
    {
        return ge1.h;
    }

    static AlertDialog j(ge ge1)
    {
        return ge1.q;
    }

    static void k(ge ge1)
    {
        ge1.e();
    }

    static ArrayList l(ge ge1)
    {
        return ge1.m;
    }

    static int m(ge ge1)
    {
        return ge1.c;
    }

    static String[] n(ge ge1)
    {
        return ge1.i;
    }

    static long[] o(ge ge1)
    {
        return ge1.j;
    }

    static boolean p(ge ge1)
    {
        return ge1.x;
    }

    static WeakReference q(ge ge1)
    {
        return ge1.y;
    }

    static void r(ge ge1)
    {
        ge1.g();
    }

    static void s(ge ge1)
    {
        ge1.f();
    }

    static boolean t(ge ge1)
    {
        ge1.d = false;
        return false;
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        v = new gz(this, (byte)0);
        b = rc.a(activity).a();
        rc.a(activity);
        n = new File(rc.e());
        e = getResources().getDimensionPixelSize(0x7f0900c3);
        f = com.roidapp.cloudlib.common.d.a(getResources(), 150F);
        e();
        t = new aj();
        aj aj1 = t;
        Locale locale = a.getResources().getConfiguration().locale;
        u = aj1.a((new StringBuilder()).append(locale.getLanguage()).toString());
        if (u == null)
        {
            w = false;
        } else
        {
            c();
        }
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bf, null);
        o = (ListView)layoutinflater.findViewById(0x7f0d0315);
        p = (ListView)layoutinflater.findViewById(0x7f0d0316);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0d0310);
        bundle = (RelativeLayout)layoutinflater.findViewById(0x7f0d0311);
        if (w)
        {
            bundle.setVisibility(0);
            viewgroup.setBackgroundResource(0x7f020074);
        } else
        {
            bundle.setVisibility(8);
            viewgroup.setBackgroundDrawable(null);
        }
        viewgroup.setOnClickListener(new gf(this, viewgroup, bundle));
        bundle.setOnClickListener(new gn(this, viewgroup, bundle));
        viewgroup.setBackgroundResource(0x7f020074);
        o.setAdapter(new gx(this));
        d();
        o.setSelection(c);
        o.setOnItemClickListener(new go(this));
        return layoutinflater;
    }

    public final void onDetach()
    {
        super.onDetach();
        f();
        x = true;
    }

    static 
    {
        z = new ThreadPoolExecutor(0, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(2), new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
        A = new ThreadPoolExecutor(0, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(2), new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
    }
}
