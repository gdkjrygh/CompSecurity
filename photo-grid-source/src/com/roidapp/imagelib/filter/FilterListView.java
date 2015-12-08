// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.hlistview.AdapterView;
import com.roidapp.baselib.hlistview.HListView;
import com.roidapp.baselib.hlistview.s;
import com.roidapp.imagelib.a.h;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.BaseGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.LocalGroupInfo;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bj, d, m, ab, 
//            a, e, ax, l, 
//            i, j, r, k, 
//            h, g

public class FilterListView extends RelativeLayout
    implements s
{

    private l a;
    private HListView b;
    private int c;
    private ImageView d;
    private ab e;
    private bj f;
    private LocalGroupInfo g[];
    private List h;
    private Context i;
    private String j;
    private String k;

    public FilterListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 100;
        f = new bj();
        g = null;
        h = new ArrayList();
        k = "DefaultSelType";
    }

    public FilterListView(Context context, String s1)
    {
        super(context);
        c = 100;
        f = new bj();
        g = null;
        h = new ArrayList();
        k = "DefaultSelType";
        i = context;
        j = s1;
        d = new ImageView(i);
        d.setImageResource(f.a);
        d.setBackgroundResource(f.b);
        d.setId(g.g);
        d.setOnClickListener(new com.roidapp.imagelib.filter.d(this));
        d.setVisibility(8);
        context = new android.widget.RelativeLayout.LayoutParams(-2, (int)getResources().getDimension(e.h));
        context.addRule(9);
        addView(d, context);
        b = new HListView(i);
        context = new android.widget.RelativeLayout.LayoutParams(-1, (int)getResources().getDimension(e.h));
        context.addRule(1, g.g);
        addView(b, context);
        b.a(this);
        g = f.b;
        context = new ArrayList(Arrays.asList(g));
        h.add(new m(this, 0, 7));
        h.add(new m(this, 2, 1));
        h.add(new m(this, 2, 2));
        h.add(new m(this, 2, 8));
        h.add(new m(this, 4, 5));
        h.add(new m(this, 3, 3));
        h.add(new m(this, 1, 2));
        h.add(new m(this, 4, 1));
        h.add(new m(this, 4, 4));
        e = new ab(context, getContext(), false);
        b.a(e);
        b.a(new ColorDrawable(0));
        context = new a(getContext());
        context.a(new com.roidapp.imagelib.filter.e(this));
        context.a();
        setBackgroundColor(getResources().getColor(d.d));
    }

    static ab a(FilterListView filterlistview)
    {
        return filterlistview.e;
    }

    private void a(int i1)
    {
        k = "ManualSelType";
        b(i1);
        b.c(i1);
    }

    private void b(int i1)
    {
        Object obj = (BaseAdapter)b.z();
        if ((obj instanceof ax) && i1 >= 0)
        {
            Object obj1 = (ax)obj;
            obj = (IFilterInfo)((ax) (obj1)).getItem(i1);
            if (((IFilterInfo) (obj)).c() != ((ax) (obj1)).b)
            {
                obj1.b = ((IFilterInfo) (obj)).c();
                ((ax) (obj1)).notifyDataSetChanged();
                obj1 = ((ax) (obj1)).a();
                IGroupInfo igroupinfo = h.j;
                if (igroupinfo != null)
                {
                    igroupinfo.a(null);
                }
                b(((IGroupInfo) (obj1)), ((IFilterInfo) (obj)));
                return;
            }
        }
    }

    private void b(IGroupInfo igroupinfo, IFilterInfo ifilterinfo)
    {
        a.a(igroupinfo, ifilterinfo);
        if (a != null)
        {
            int i1 = igroupinfo.d().indexOf(ifilterinfo);
            if (i1 != -1)
            {
                a.a(i1, ifilterinfo.b());
            }
        }
        igroupinfo.a(ifilterinfo);
        if (e == null || e.a == igroupinfo)
        {
            return;
        } else
        {
            e.a = igroupinfo;
            return;
        }
    }

    private static int c(int i1)
    {
        return (new Random()).nextInt(i1) % (i1 + 0 + 1) + 0;
    }

    public final void a(AdapterView adapterview, View view, int i1)
    {
        view = (BaseAdapter)b.z();
        if (!(view instanceof ab)) goto _L2; else goto _L1
_L1:
        adapterview = (BaseGroupInfo)adapterview.j(i1);
        if (!(adapterview instanceof CloudGroupInfo)) goto _L4; else goto _L3
_L3:
        if (n.a(getContext(), ((CloudGroupInfo)adapterview).c)) goto _L6; else goto _L5
_L5:
        view = new android.app.AlertDialog.Builder(getContext());
        view.setTitle(j.m);
        view.setMessage(j.c);
        view.setNegativeButton(j.a, new i(this));
        view.setPositiveButton(j.d, new com.roidapp.imagelib.filter.j(this, adapterview));
        view.show();
_L8:
        return;
_L6:
        adapterview.a(r.b(getContext(), ((CloudGroupInfo)adapterview).c));
_L4:
        view = new k(this, adapterview, getContext());
        IFilterInfo ifilterinfo = adapterview.a();
        if (ifilterinfo != null)
        {
            view.b = ifilterinfo.c();
            int j1 = adapterview.b();
            i1 = j1;
            if (a != null)
            {
                i1 = j1;
                if (ifilterinfo.a() != 0)
                {
                    a.a(false);
                    i1 = j1;
                }
            }
        } else
        {
            i1 = 0;
        }
        b.a(view);
        b.i(i1);
        d.setVisibility(0);
        return;
_L2:
        if (view instanceof ax)
        {
            k = "ManualSelType";
            b(i1);
            if (b.t() + 1 == i1 || b.t() == i1)
            {
                b.c(i1 - 1);
                return;
            } else
            {
                b.c(i1 + 1);
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(IGroupInfo igroupinfo, IFilterInfo ifilterinfo)
    {
        Object obj1 = igroupinfo;
        Object obj = ifilterinfo;
        if (igroupinfo instanceof CloudGroupInfo)
        {
            obj1 = igroupinfo;
            obj = ifilterinfo;
            if (!n.a(getContext(), ((CloudGroupInfo)igroupinfo).c))
            {
                obj1 = f.b[0];
                obj = f.a[0][7];
            }
        }
        igroupinfo = new com.roidapp.imagelib.filter.h(this, ((IGroupInfo) (obj1)), getContext());
        ((IGroupInfo) (obj1)).a(((IFilterInfo) (obj)));
        ifilterinfo = ((IGroupInfo) (obj1)).a();
        int i1;
        int j1;
        if (ifilterinfo != null)
        {
            igroupinfo.b = ifilterinfo.c();
            i1 = ((IGroupInfo) (obj1)).b();
        } else
        {
            i1 = 0;
        }
        for (j1 = 0; j1 < e.getCount(); j1++)
        {
            ifilterinfo = e.a(j1);
            if (ifilterinfo.a(i).equalsIgnoreCase(((IGroupInfo) (obj1)).a(i)))
            {
                ifilterinfo.a(((IFilterInfo) (obj)));
            }
        }

        b.a(igroupinfo);
        b.i(i1);
        d.setVisibility(0);
        b(((IGroupInfo) (obj1)), ((IFilterInfo) (obj)));
    }

    public final void a(IGroupInfo igroupinfo, IFilterInfo ifilterinfo, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        if (igroupinfo == null || ifilterinfo == null)
        {
            igroupinfo = g[0];
        }
        ifilterinfo = (BaseAdapter)b.z();
        if ((ifilterinfo instanceof ab) || ((ax)ifilterinfo).a() != igroupinfo)
        {
            ifilterinfo = new com.roidapp.imagelib.filter.g(this, igroupinfo, getContext());
            IFilterInfo ifilterinfo1 = igroupinfo.a();
            int i1;
            int j1;
            if (ifilterinfo1 != null)
            {
                ifilterinfo.b = ifilterinfo1.c();
                i1 = igroupinfo.b();
            } else
            {
                i1 = 0;
            }
            b.a(ifilterinfo);
            b.i(i1);
            d.setVisibility(0);
        } else
        {
            ifilterinfo = (ax)ifilterinfo;
            i1 = igroupinfo.b();
        }
        j1 = igroupinfo.e();
        if (j1 == -1)
        {
            return;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        i1--;
        if (i1 >= 0) goto _L4; else goto _L3
_L3:
        i1 = e.a(igroupinfo);
        if (i1 <= 0)
        {
            igroupinfo = e.a(e.getCount() - 1);
        } else
        {
            igroupinfo = e.a(i1 - 1);
        }
        if (!(igroupinfo instanceof CloudGroupInfo)) goto _L6; else goto _L5
_L5:
        if (n.a(getContext(), ((CloudGroupInfo)igroupinfo).c)) goto _L8; else goto _L7
_L7:
        i1 = ((flag1) ? 1 : 0);
_L4:
        a(i1);
        return;
_L8:
        igroupinfo.a(r.b(getContext(), ((CloudGroupInfo)igroupinfo).c));
_L6:
        ifilterinfo.a(igroupinfo);
        i1 = ifilterinfo.getCount() - 1;
        if (true) goto _L4; else goto _L2
_L2:
        i1++;
        if (i1 < j1) goto _L10; else goto _L9
_L9:
        i1 = e.a(igroupinfo);
        if (i1 >= e.getCount() - 1)
        {
            igroupinfo = e.a(0);
        } else
        {
            igroupinfo = e.a(i1 + 1);
        }
        if (!(igroupinfo instanceof CloudGroupInfo)) goto _L12; else goto _L11
_L11:
        if (n.a(getContext(), ((CloudGroupInfo)igroupinfo).c)) goto _L14; else goto _L13
_L13:
        i1 = j1 - 1;
_L10:
        a(i1);
        return;
_L14:
        igroupinfo.a(r.b(getContext(), ((CloudGroupInfo)igroupinfo).c));
_L12:
        ifilterinfo.a(igroupinfo);
        i1 = ((flag2) ? 1 : 0);
        if (true) goto _L10; else goto _L15
_L15:
    }

    public final void a(l l1)
    {
        a = l1;
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            b.a(this);
            return;
        } else
        {
            b.a(null);
            return;
        }
    }

    public final boolean a()
    {
        return (BaseAdapter)b.z() instanceof ab;
    }

    public final String b()
    {
        return k;
    }

    public final void c()
    {
        Object obj;
        if (b != null)
        {
            if (((obj = (BaseAdapter)b.z()) instanceof ax) && ((obj = ((ax)obj).a()) != null && (obj instanceof CloudGroupInfo)) && !n.a(getContext(), ((CloudGroupInfo) (obj = (CloudGroupInfo)obj)).c))
            {
                if (f != null)
                {
                    a(f.b[0], f.a[0][7]);
                }
                d();
                return;
            }
        }
    }

    public final void d()
    {
        if (a != null)
        {
            a.a(true);
        }
        d.setVisibility(8);
        b.a(e);
    }

    public final void e()
    {
        Object obj2;
        k = "ShuffleSelType";
        obj2 = e.a();
        if (h.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        int i1;
        i1 = c(h.size());
        obj = (m)h.get(i1);
        int j1 = ((m) (obj)).a;
        int k1 = ((m) (obj)).b;
        obj = g[j1];
        obj1 = ((LocalGroupInfo) (obj)).a(k1);
        if (h.j != null)
        {
            h.j.a(null);
        }
        b(((IGroupInfo) (obj)), ((IFilterInfo) (obj1)));
        obj2 = (BaseAdapter)b.z();
        if (!(obj2 instanceof ab)) goto _L4; else goto _L3
_L3:
        ((BaseAdapter) (obj2)).notifyDataSetChanged();
_L8:
        h.remove(i1);
_L6:
        return;
_L4:
        if (obj2 instanceof ax)
        {
            obj2 = (ax)obj2;
            if (((ax) (obj2)).a() != obj)
            {
                ((ax) (obj2)).a(((IGroupInfo) (obj)));
            }
            obj2.b = ((IFilterInfo) (obj1)).c();
            ((ax) (obj2)).notifyDataSetChanged();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj = null;
        do
        {
            if (obj != null)
            {
                break;
            }
            obj1 = (BaseGroupInfo)((List) (obj2)).get(c(((List) (obj2)).size()));
            if (obj1 instanceof CloudGroupInfo)
            {
                if (n.a(getContext(), ((CloudGroupInfo)obj1).c))
                {
                    ((BaseGroupInfo) (obj1)).a(r.b(getContext(), ((CloudGroupInfo)obj1).c));
                    if (((BaseGroupInfo) (obj1)).d() != null)
                    {
                        obj = obj1;
                    }
                }
            } else
            {
                obj = obj1;
            }
        } while (true);
        obj1 = ((IGroupInfo) (obj)).d();
        obj1 = (IFilterInfo)((List) (obj1)).get(c(((List) (obj1)).size()));
        h.j.a(null);
        b(((IGroupInfo) (obj)), ((IFilterInfo) (obj1)));
        obj2 = (BaseAdapter)b.z();
        if (obj2 instanceof ab)
        {
            ((BaseAdapter) (obj2)).notifyDataSetChanged();
            return;
        }
        if (!(obj2 instanceof ax)) goto _L6; else goto _L5
_L5:
        obj2 = (ax)obj2;
        if (((ax) (obj2)).a() != obj)
        {
            ((ax) (obj2)).a(((IGroupInfo) (obj)));
        }
        obj2.b = ((IFilterInfo) (obj1)).c();
        ((ax) (obj2)).notifyDataSetChanged();
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
