// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ingest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;
import b;
import cn;
import com.google.android.libraries.social.ingest.ui.DateTileView;
import com.google.android.libraries.social.ingest.ui.IngestGridView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ncp;
import ncq;
import ncr;
import ncs;
import nct;
import ncu;
import ncv;
import nda;
import ndb;
import nde;
import ndf;
import ndg;
import ndh;
import ndl;
import ndm;
import rz;

// Referenced classes of package com.google.android.libraries.social.ingest:
//            IngestService

public final class IngestActivity extends rz
    implements ndf, ndm
{

    private IngestService d;
    private boolean e;
    private IngestGridView f;
    private nda g;
    private Handler h;
    private ProgressDialog i;
    private ActionMode j;
    private View k;
    private TextView l;
    private int m;
    private ViewPager n;
    private ndb o;
    private boolean p;
    private MenuItem q;
    private MenuItem r;
    private android.widget.AdapterView.OnItemClickListener s;
    private android.widget.AbsListView.MultiChoiceModeListener t;
    private ncu u;
    private DataSetObserver v;
    private ncv w;
    private ServiceConnection x;

    public IngestActivity()
    {
        e = false;
        m = 0;
        p = false;
        s = new ncp(this);
        t = new ncq(this);
        u = new ncu(this);
        v = new ncr(this);
        w = new ncv();
        x = new ncs(this);
    }

    public static int a(IngestActivity ingestactivity, int i1)
    {
        ingestactivity.m = i1;
        return i1;
    }

    public static ActionMode a(IngestActivity ingestactivity, ActionMode actionmode)
    {
        ingestactivity.j = actionmode;
        return actionmode;
    }

    public static MenuItem a(IngestActivity ingestactivity, MenuItem menuitem)
    {
        ingestactivity.r = menuitem;
        return menuitem;
    }

    public static IngestService a(IngestActivity ingestactivity, IngestService ingestservice)
    {
        ingestactivity.d = ingestservice;
        return ingestservice;
    }

    public static IngestGridView a(IngestActivity ingestactivity)
    {
        return ingestactivity.f;
    }

    private void a(int i1)
    {
        if (k == null)
        {
            k = findViewById(b.FH);
            l = (TextView)k.findViewById(b.FI);
        }
        l.setText(i1);
        k.setVisibility(0);
        b(false);
        f.setVisibility(8);
        c(false);
    }

    private void a(MenuItem menuitem, boolean flag)
    {
        if (menuitem == null)
        {
            return;
        }
        if (!flag)
        {
            int i1;
            if (j == null)
            {
                i1 = b.Fu;
            } else
            {
                i1 = b.Fv;
            }
            menuitem.setIcon(i1);
            menuitem.setTitle(b.FX);
            return;
        }
        int j1;
        if (j == null)
        {
            j1 = b.Fs;
        } else
        {
            j1 = b.Ft;
        }
        menuitem.setIcon(j1);
        menuitem.setTitle(b.FY);
    }

    public static void a(IngestActivity ingestactivity, MenuItem menuitem, boolean flag)
    {
        ingestactivity.a(menuitem, flag);
    }

    public static nda b(IngestActivity ingestactivity)
    {
        return ingestactivity.g;
    }

    private void b(boolean flag)
    {
        boolean flag1 = false;
        p = flag;
        int i1;
        if (flag)
        {
            if (o == null)
            {
                o = new ndb(this, u);
                o.a(g.a);
            }
            n.a(o);
            Object obj = n;
            ndb ndb1 = o;
            int j1 = f.getFirstVisiblePosition();
            i1 = j1;
            if (m > j1)
            {
                if (m > f.getLastVisiblePosition())
                {
                    i1 = j1;
                } else
                {
                    i1 = m;
                }
            }
            ((ViewPager) (obj)).a(ndb1.a(i1), false);
        } else
        if (o != null)
        {
            f.setSelection(g.a(n.c));
            n.a(null);
        }
        obj = f;
        if (flag)
        {
            i1 = 4;
        } else
        {
            i1 = 0;
        }
        ((IngestGridView) (obj)).setVisibility(i1);
        obj = n;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 4;
        }
        ((ViewPager) (obj)).setVisibility(i1);
        if (r != null)
        {
            a(r, flag);
        }
        a(q, flag);
    }

    public static ncu c(IngestActivity ingestactivity)
    {
        return ingestactivity.u;
    }

    private void c(boolean flag)
    {
        if (r != null)
        {
            r.setVisible(flag);
        }
        if (q != null)
        {
            q.setVisible(flag);
        }
    }

    public static MenuItem d(IngestActivity ingestactivity)
    {
        return ingestactivity.r;
    }

    public static boolean e(IngestActivity ingestactivity)
    {
        return ingestactivity.p;
    }

    public static Handler f(IngestActivity ingestactivity)
    {
        return ingestactivity.h;
    }

    public static ndb g(IngestActivity ingestactivity)
    {
        return ingestactivity.o;
    }

    public static boolean h(IngestActivity ingestactivity)
    {
        return ingestactivity.e;
    }

    public static void i(IngestActivity ingestactivity)
    {
        ingestactivity.l();
    }

    private void j()
    {
        nda nda1 = g;
        boolean flag;
        if (nda1.a != null && nda1.a.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a(b.FT);
            return;
        }
        nda1 = g;
        if (nda1.a != null && nda1.a.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && g.getCount() == 0)
        {
            a(b.FQ);
            return;
        }
        if (k != null)
        {
            k.setVisibility(8);
            b(false);
        }
        c(true);
    }

    public static void j(IngestActivity ingestactivity)
    {
        int i1 = 0;
        ProgressDialog progressdialog = ingestactivity.k();
        boolean flag;
        if (ingestactivity.w.d == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        progressdialog.setIndeterminate(flag);
        if (!flag)
        {
            i1 = 1;
        }
        progressdialog.setProgressStyle(i1);
        if (ingestactivity.w.b != null)
        {
            progressdialog.setTitle(ingestactivity.w.b);
        }
        if (ingestactivity.w.a != null)
        {
            progressdialog.setMessage(ingestactivity.w.a);
        }
        if (!flag)
        {
            progressdialog.setProgress(ingestactivity.w.c);
            progressdialog.setMax(ingestactivity.w.d);
        }
        if (!progressdialog.isShowing())
        {
            progressdialog.show();
        }
    }

    private ProgressDialog k()
    {
        if (i == null || !i.isShowing())
        {
            i = new ProgressDialog(this);
            i.setCancelable(false);
        }
        return i;
    }

    public static void k(IngestActivity ingestactivity)
    {
        ingestactivity.g.notifyDataSetChanged();
        if (ingestactivity.j != null)
        {
            ingestactivity.j.finish();
            ingestactivity.j = null;
        }
        ingestactivity.j();
    }

    private void l()
    {
        if (i != null)
        {
            i.dismiss();
            i = null;
        }
    }

    public static void l(IngestActivity ingestactivity)
    {
        ingestactivity.k().setIndeterminate(true);
    }

    public static IngestService m(IngestActivity ingestactivity)
    {
        return ingestactivity.d;
    }

    public final void a(int i1, int j1, String s1)
    {
        w.a();
        w.d = j1;
        w.c = i1;
        w.b = getResources().getString(b.FS);
        h.sendEmptyMessage(0);
        h.removeMessages(4);
        h.sendEmptyMessageDelayed(4, 3000L);
    }

    public final void a(Collection collection, int i1)
    {
        h.sendEmptyMessage(1);
        h.removeMessages(4);
    }

    public final void a(ndg ndg1, int i1)
    {
        w.a();
        w.d = 0;
        w.a = getResources().getQuantityString(b.FO, i1, new Object[] {
            Integer.valueOf(i1)
        });
        h.sendEmptyMessage(0);
    }

    protected final void f()
    {
        h.sendEmptyMessage(2);
    }

    public final void g()
    {
        w.a();
        w.d = 0;
        w.a = getResources().getString(b.FW);
        h.sendEmptyMessage(0);
    }

    public final void h()
    {
        h.sendEmptyMessage(1);
        h.sendEmptyMessage(2);
    }

    public final void i()
    {
        h.sendEmptyMessage(1);
        h.sendEmptyMessage(2);
        h.removeMessages(4);
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        ndh.a(this);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bindService(new Intent(getApplicationContext(), com/google/android/libraries/social/ingest/IngestService), x, 1);
        setContentView(b.FJ);
        f = (IngestGridView)findViewById(b.FB);
        g = new nda(this);
        g.registerDataSetObserver(v);
        f.setAdapter(g);
        f.setMultiChoiceModeListener(t);
        f.setOnItemClickListener(s);
        f.a = u;
        n = (ViewPager)findViewById(b.FG);
        h = new nct(this);
        ndh.a(this);
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(b.FN, menu);
        q = menu.findItem(b.FF);
        menu.findItem(b.FC).setVisible(false);
        a(q, p);
        return true;
    }

    protected final void onDestroy()
    {
        if (d != null)
        {
            d.a(null);
            unbindService(x);
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        int i1 = menuitem.getItemId();
        if (i1 == b.FC)
        {
            if (j != null)
            {
                menuitem = d;
                Object obj = f.getCheckedItemPositions();
                nda nda1 = g;
                ArrayList arraylist = new ArrayList();
                for (i1 = 0; i1 < ((SparseBooleanArray) (obj)).size(); i1++)
                {
                    if (!((SparseBooleanArray) (obj)).valueAt(i1))
                    {
                        continue;
                    }
                    Object obj1 = nda1.getItem(((SparseBooleanArray) (obj)).keyAt(i1));
                    if (obj1 instanceof ndg)
                    {
                        arraylist.add((ndg)obj1);
                    }
                }

                obj = new nde(((IngestService) (menuitem)).a, arraylist, ((IngestService) (menuitem)).b, menuitem);
                obj.a = menuitem;
                ((IngestService) (menuitem)).d.a(0, 0, true).b(menuitem.getResources().getText(b.FS));
                menuitem.startForeground(b.FD, ((IngestService) (menuitem)).d.a());
                (new Thread(((Runnable) (obj)))).start();
                j.finish();
            }
            return true;
        }
        if (i1 == b.FF)
        {
            if (!p)
            {
                flag = true;
            }
            b(flag);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected final void onPause()
    {
        if (d != null)
        {
            d.a(null);
        }
        e = false;
        l();
        super.onPause();
    }

    protected final void onResume()
    {
        DateTileView.a();
        e = true;
        if (d != null)
        {
            d.a(this);
        }
        j();
        super.onResume();
    }
}
