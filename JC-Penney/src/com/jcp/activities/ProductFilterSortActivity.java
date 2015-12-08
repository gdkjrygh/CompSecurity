// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.f.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.JCP;
import com.jcp.adapters.ProductFilterRatingAdapter;
import com.jcp.adapters.ProductFilterSortListAdapter;
import com.jcp.adapters.az;
import com.jcp.adapters.bw;
import com.jcp.b.b;
import com.jcp.c.p;
import com.jcp.e.z;
import com.jcp.fragments.el;
import com.jcp.helper.y;
import com.jcp.productfilter.pojo.ProductList;
import com.jcp.productlistentity.ProductListEntityContainer;
import com.jcp.productlistentity.ProductListFilterEntity;
import com.jcp.productlistentity.ProductListSortOptionEntity;
import com.jcp.productlistentity.ProductListValueEntity;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.util.bi;
import com.jcp.views.c;
import com.jcp.views.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

// Referenced classes of package com.jcp.activities:
//            an, bd, av, aw, 
//            ax, ay, ba, bb, 
//            bc, be, az

public class ProductFilterSortActivity extends an
    implements android.view.View.OnClickListener, z
{

    private static final String g = com/jcp/activities/ProductFilterSortActivity.getName();
    private List A;
    private List B;
    private boolean C;
    private String D;
    private boolean E;
    private boolean F;
    private int G;
    private AlertDialog H;
    private String a;
    private String b;
    private ListView c;
    private TextView d;
    private p e;
    private RelativeLayout f;
    private ProductListSortOptionEntity h;
    private ListView i;
    private ListView j;
    private bw k;
    private ProductListEntityContainer l;
    private ProductFilterSortListAdapter m;
    private int n;
    private int o;
    private RelativeLayout p;
    private String q;
    private List r;
    private List s;
    private List t;
    private Map u;
    private Map v;
    private Map w;
    private Map x;
    private List y;
    private List z;

    public ProductFilterSortActivity()
    {
        y = new ArrayList();
        z = new ArrayList();
    }

    static int a(ProductFilterSortActivity productfiltersortactivity, int i1)
    {
        productfiltersortactivity.n = i1;
        return i1;
    }

    private void a(int i1, ProductListFilterEntity productlistfilterentity)
    {
        productlistfilterentity = productlistfilterentity.getValues();
        Collections.sort(productlistfilterentity, new bd(this));
        if (productlistfilterentity == null) goto _L2; else goto _L1
_L1:
        int j1;
        B.clear();
        j1 = 5 - i1;
        if (j1 != 5) goto _L4; else goto _L3
_L3:
        try
        {
            B.add(((ProductListValueEntity)productlistfilterentity.get(productlistfilterentity.size() - 1)).getId());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ProductListFilterEntity productlistfilterentity)
        {
            ae.a(g, productlistfilterentity.getMessage());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ProductListFilterEntity productlistfilterentity)
        {
            ae.a(g, productlistfilterentity.getMessage());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ProductListFilterEntity productlistfilterentity)
        {
            ae.a(g, productlistfilterentity.getMessage());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ProductListFilterEntity productlistfilterentity)
        {
            ae.a(g, productlistfilterentity.getMessage());
        }
          goto _L2
_L7:
        if (i1 > j1) goto _L2; else goto _L5
_L5:
        B.add(((ProductListValueEntity)productlistfilterentity.get(i1)).getId());
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        return;
_L4:
        i1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(AlertDialog alertdialog)
    {
        if (alertdialog != null)
        {
            alertdialog.dismiss();
        }
    }

    private void a(TextView textview, Integer integer, List list)
    {
        if (integer.intValue() != list.size() - 1)
        {
            integer = com.jcp.helper.y.b(((ProductListValueEntity)list.get(integer.intValue())).getName());
        } else
        {
            integer = com.jcp.helper.y.b(((ProductListValueEntity)list.get(list.size() - 1)).getName());
        }
        textview.setText(integer);
    }

    static void a(ProductFilterSortActivity productfiltersortactivity)
    {
        productfiltersortactivity.r();
    }

    static void a(ProductFilterSortActivity productfiltersortactivity, TextView textview, Integer integer, List list)
    {
        productfiltersortactivity.b(textview, integer, list);
    }

    static void a(ProductFilterSortActivity productfiltersortactivity, ProductListFilterEntity productlistfilterentity)
    {
        productfiltersortactivity.b(productlistfilterentity);
    }

    private void a(ProductListEntityContainer productlistentitycontainer)
    {
        productlistentitycontainer = productlistentitycontainer.getFilters();
        if (productlistentitycontainer != null && productlistentitycontainer.size() != 0)
        {
            for (productlistentitycontainer = productlistentitycontainer.iterator(); productlistentitycontainer.hasNext();)
            {
                Object obj1 = (ProductListFilterEntity)productlistentitycontainer.next();
                String s1 = ((ProductListFilterEntity) (obj1)).getType();
                Object obj = ((ProductListFilterEntity) (obj1)).getId();
                obj1 = ((ProductListFilterEntity) (obj1)).getValues();
                if (obj != null)
                {
                    a(((String) (obj)));
                    obj = (List)x.get(obj);
                    obj1 = ((List) (obj1)).iterator();
                    while (((Iterator) (obj1)).hasNext()) 
                    {
                        ProductListValueEntity productlistvalueentity = (ProductListValueEntity)((Iterator) (obj1)).next();
                        if (s1 != null)
                        {
                            if (s1.equalsIgnoreCase("DEFAULT"))
                            {
                                if (productlistvalueentity.getSelected().booleanValue())
                                {
                                    r.add(productlistvalueentity.getId());
                                    ((List) (obj)).add(productlistvalueentity.getName());
                                }
                            } else
                            if (s1.equalsIgnoreCase("PRICE_RANGE"))
                            {
                                if (productlistvalueentity.getSelected().booleanValue())
                                {
                                    A.add(productlistvalueentity.getId());
                                    ((List) (obj)).add(productlistvalueentity.getName());
                                }
                            } else
                            if (s1.equalsIgnoreCase("RANGE") && productlistvalueentity.getSelected().booleanValue())
                            {
                                if (!"unrated".equalsIgnoreCase(productlistvalueentity.getName()))
                                {
                                    G = G + 1;
                                }
                                B.add(productlistvalueentity.getId());
                                ((List) (obj)).add(productlistvalueentity.getName());
                            }
                        }
                    }
                }
            }

        }
    }

    private void a(ProductListFilterEntity productlistfilterentity)
    {
        int i1 = bi.b(this);
        android.app.AlertDialog.Builder builder = p();
        View view = q();
        builder.setView(view);
        ListView listview = (ListView)view.findViewById(0x7f0e03b7);
        listview.setVisibility(0);
        TextView textview = (TextView)view.findViewById(0x7f0e03b6);
        TextView textview1 = (TextView)view.findViewById(0x7f0e03b4);
        view = view.findViewById(0x7f0e03b5);
        textview1.setVisibility(8);
        view.setVisibility(8);
        builder.setOnCancelListener(new av(this, productlistfilterentity));
        H = builder.create();
        listview.setAdapter(new ProductFilterRatingAdapter(this, 6, G));
        textview.setOnClickListener(new aw(this, productlistfilterentity));
        H.show();
        H.getWindow().setLayout(i1, i1);
    }

    private void a(String s1)
    {
        if (s1 != null && !x.containsKey(s1))
        {
            x.put(s1, new ArrayList());
        }
    }

    static int b(ProductFilterSortActivity productfiltersortactivity)
    {
        return productfiltersortactivity.n;
    }

    static int b(ProductFilterSortActivity productfiltersortactivity, int i1)
    {
        productfiltersortactivity.o = i1;
        return i1;
    }

    private int b(String s1)
    {
        byte byte0 = 2;
        if (s1.equals("PRICE_RANGE"))
        {
            byte0 = 0;
        } else
        {
            if (s1.equals("RANGE"))
            {
                return 1;
            }
            if (s1.equals("DEFAULT"))
            {
                return 2;
            }
        }
        return byte0;
    }

    private Map b(ProductListEntityContainer productlistentitycontainer)
    {
        a a1 = new a();
        if (productlistentitycontainer != null && productlistentitycontainer.getFilters() != null)
        {
            productlistentitycontainer = productlistentitycontainer.getFilters().listIterator();
        } else
        {
            productlistentitycontainer = null;
        }
        if (productlistentitycontainer != null)
        {
            ProductListFilterEntity productlistfilterentity;
            for (; productlistentitycontainer.hasNext(); a1.put(productlistfilterentity.getId(), productlistfilterentity.getValues()))
            {
                productlistfilterentity = (ProductListFilterEntity)productlistentitycontainer.next();
            }

        }
        return a1;
    }

    private void b(TextView textview, Integer integer, List list)
    {
        if (integer.intValue() != 0)
        {
            integer = com.jcp.helper.y.b(((ProductListValueEntity)list.get(integer.intValue())).getName());
        } else
        {
            integer = com.jcp.helper.y.a(((ProductListValueEntity)list.get(0)).getName());
        }
        textview.setText(integer);
    }

    static void b(ProductFilterSortActivity productfiltersortactivity, TextView textview, Integer integer, List list)
    {
        productfiltersortactivity.a(textview, integer, list);
    }

    private void b(ProductListFilterEntity productlistfilterentity)
    {
        p.setVisibility(0);
        a(G, productlistfilterentity);
        a(((ProductListValueEntity) (null)), 3, -1);
        if (l != null)
        {
            k();
        }
        t();
        a(H);
    }

    private void b(List list)
    {
        int i1 = bi.d(this);
        int j1 = bi.c(this);
        android.app.AlertDialog.Builder builder = p();
        View view = q();
        builder.setView(view);
        LinearLayout linearlayout1 = (LinearLayout)view.findViewById(0x7f0e03b9);
        LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0e03bc);
        TextView textview = (TextView)view.findViewById(0x7f0e03ba);
        TextView textview1 = (TextView)view.findViewById(0x7f0e03bb);
        TextView textview2 = (TextView)view.findViewById(0x7f0e03b6);
        TextView textview3 = (TextView)view.findViewById(0x7f0e03b4);
        view = view.findViewById(0x7f0e03b5);
        textview3.setVisibility(8);
        view.setVisibility(8);
        linearlayout1.setVisibility(0);
        if (list != null)
        {
            Collections.sort(list, new bd(this));
            if (list.size() > 0)
            {
                z.clear();
                z.addAll(list);
                c c1 = a(list.size() - 1, textview, textview1, list);
                linearlayout.addView(c1);
                if (n == 0 && o == 0)
                {
                    b(textview, Integer.valueOf(0), list);
                    a(textview1, Integer.valueOf(list.size() - 1), list);
                } else
                {
                    b(textview, Integer.valueOf(n), list);
                    a(textview1, Integer.valueOf(o), list);
                    c1.setSelectedMinValue(Integer.valueOf(n));
                    c1.setSelectedMaxValue(Integer.valueOf(o));
                }
            }
        }
        builder.setOnCancelListener(new ax(this));
        H = builder.create();
        textview2.setOnClickListener(new ay(this));
        H.show();
        H.getWindow().setLayout(i1, j1 + 100);
    }

    static int c(ProductFilterSortActivity productfiltersortactivity)
    {
        return productfiltersortactivity.o;
    }

    private Map c(List list)
    {
        a a1 = new a();
        ProductListValueEntity productlistvalueentity;
        for (list = list.iterator(); list.hasNext(); a1.put(productlistvalueentity.getId(), productlistvalueentity))
        {
            productlistvalueentity = (ProductListValueEntity)list.next();
        }

        return a1;
    }

    private void c(ProductListFilterEntity productlistfilterentity)
    {
        android.app.AlertDialog.Builder builder = p();
        Object obj = q();
        builder.setView(((View) (obj)));
        i = (ListView)((View) (obj)).findViewById(0x7f0e03b7);
        i.setVisibility(0);
        f = (RelativeLayout)((View) (obj)).findViewById(0x7f0e03bd);
        TextView textview = (TextView)((View) (obj)).findViewById(0x7f0e03b4);
        obj = (TextView)((View) (obj)).findViewById(0x7f0e03b6);
        int i1 = bi.b(this);
        int j1 = bi.a(this);
        if ("color".equalsIgnoreCase(productlistfilterentity.getName()))
        {
            E = true;
        } else
        {
            E = false;
        }
        s.clear();
        z();
        y();
        x();
        builder.setOnCancelListener(new ba(this));
        H = builder.create();
        textview.setOnClickListener(new bb(this));
        ((TextView) (obj)).setOnClickListener(new bc(this));
        H.show();
        H.getWindow().setLayout(i1, j1);
    }

    private void c(String s1)
    {
        if (d != null)
        {
            d.setText((new StringBuilder()).append(s1).append(" Results").toString());
        }
    }

    static void d(ProductFilterSortActivity productfiltersortactivity)
    {
        productfiltersortactivity.s();
    }

    private void d(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ProductListSortOptionEntity productlistsortoptionentity = (ProductListSortOptionEntity)list.next();
                if (productlistsortoptionentity.getSelected().booleanValue())
                {
                    h = productlistsortoptionentity;
                }
            } while (true);
        }
    }

    static String e(ProductFilterSortActivity productfiltersortactivity)
    {
        return productfiltersortactivity.b;
    }

    static Map f(ProductFilterSortActivity productfiltersortactivity)
    {
        return productfiltersortactivity.w;
    }

    static String h()
    {
        return g;
    }

    private void i()
    {
        a(l);
        ae.d(g, (new StringBuilder()).append("mRatingBarSelectedCount value  ").append(G).toString());
        if (G != 0)
        {
            G = 6 - G;
        }
        if (B.size() > 0)
        {
            Collections.sort(B);
        }
        if (t != null)
        {
            t.addAll(l.getSortOptions());
            v = b(l);
            w.putAll(v);
            k();
            d(t);
        }
        if (h != null)
        {
            Object obj = h.getName();
            Collections.sort(t, new be(this));
            if (!C)
            {
                int i1 = g();
                if (i1 != -1)
                {
                    Collections.swap(t, i1, 0);
                }
            }
            obj = new az(this, t, ((String) (obj)));
            j.setAdapter(((ListAdapter) (obj)));
            a(j);
        }
    }

    private void j()
    {
        H = null;
        r = new ArrayList();
        s = new ArrayList();
        t = new ArrayList();
        u = new a();
        v = new a();
        w = new a();
        x = new a();
        y = new ArrayList();
        z = new ArrayList();
        A = new ArrayList();
        B = new ArrayList();
    }

    private void k()
    {
        y.clear();
        if (l.getFilters() != null)
        {
            y.addAll(l.getFilters());
        }
        if (y != null)
        {
            if (k != null)
            {
                k.a(x, G);
                k.notifyDataSetChanged();
            } else
            {
                k = new bw(this, y, x, G);
                c.setAdapter(k);
            }
            a(c);
        }
    }

    private void l()
    {
        ActionBar actionbar = getActionBar();
        actionbar.setDisplayShowHomeEnabled(false);
        actionbar.setDisplayShowTitleEnabled(false);
        View view = LayoutInflater.from(this).inflate(0x7f030062, null);
        TextView textview = (TextView)view.findViewById(0x7f0e0220);
        TextView textview1 = (TextView)view.findViewById(0x7f0e021e);
        d = (TextView)view.findViewById(0x7f0e021f);
        if (l != null && l.getCount().intValue() > 0)
        {
            textview1.setOnClickListener(this);
        }
        textview.setOnClickListener(this);
        if (l != null)
        {
            c(String.valueOf(l.getCount()));
        }
        actionbar.setCustomView(view);
        actionbar.setDisplayShowCustomEnabled(true);
    }

    private void m()
    {
label0:
        {
            if (n())
            {
                F = true;
                p.setVisibility(0);
                e = new p(this);
                e.a(this);
                if (!C)
                {
                    break label0;
                }
                e.b(com.jcp.b.b.p(D));
            }
            return;
        }
        e.b(com.jcp.b.b.D(a));
    }

    private boolean n()
    {
        while (A.size() > 0 || r.size() > 0 || B.size() > 0 || C && !"best match".equalsIgnoreCase(h.getName()) || !"featured".equalsIgnoreCase(h.getName())) 
        {
            return true;
        }
        return false;
    }

    private void o()
    {
        String s2 = "";
        String s1 = v();
        if (h != null)
        {
            s2 = h.getName();
        }
        Intent intent;
        if (s1.length() != 0)
        {
            if (C)
            {
                s1 = com.jcp.b.b.b(D, s1, s2);
            } else
            {
                s1 = com.jcp.b.b.a(a, s1, s2);
            }
        } else
        if (C)
        {
            s1 = (new StringBuilder()).append(com.jcp.b.b.p(D)).append("&sortBy=").append(s2).append(b.g).toString();
        } else
        {
            com.jcp.b.b.e(a, s2);
            s1 = com.jcp.b.b.e(a, s2);
        }
        ae.d(g, (new StringBuilder()).append("ProductFilterURL  url  ").append(s1).toString());
        intent = new Intent();
        intent.putExtra("ProductFilterURL", s1);
        if (l != null)
        {
            if (l.getCount().intValue() > 0)
            {
                intent.putExtra("count_flag", true);
            } else
            {
                intent.putExtra("count_flag", false);
            }
        }
        if (C)
        {
            intent.putExtra("SEARCH_TAG", D);
            intent.putExtra(getResources().getString(0x7f070404), s2);
        }
        intent.putExtra("Title", q);
        setResult(100, intent);
    }

    private android.app.AlertDialog.Builder p()
    {
        return new android.app.AlertDialog.Builder(this);
    }

    private View q()
    {
        View view = null;
        LayoutInflater layoutinflater = getLayoutInflater();
        if (layoutinflater != null)
        {
            view = layoutinflater.inflate(0x7f0300c0, null);
        }
        return view;
    }

    private void r()
    {
        boolean flag = true;
        int j1 = z.size();
        int i1;
        if (n == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (o != j1 - 1)
        {
            flag = false;
        }
        if (!(i1 & flag))
        {
            p.setVisibility(0);
            A.clear();
            if (x.get(b) != null)
            {
                ((List)x.get(b)).clear();
            }
            i1 = n;
            while (i1 <= o) 
            {
                try
                {
                    if (z.get(i1) != null && !r.contains(((ProductListValueEntity)z.get(i1)).getId()))
                    {
                        A.add(((ProductListValueEntity)z.get(i1)).getId());
                        ((List)x.get(b)).add(((ProductListValueEntity)z.get(i1)).getName());
                    }
                }
                catch (IndexOutOfBoundsException indexoutofboundsexception)
                {
                    Log.e(g, "IndexOutOfBoundsException while getting the entity from the specified list : ", indexoutofboundsexception);
                }
                i1++;
            }
            a(((ProductListValueEntity) (null)), 3, -1);
            k();
        }
        t();
        a(H);
    }

    private void s()
    {
        if (l != null)
        {
            k();
        }
        t();
        a(H);
    }

    private void t()
    {
        Object obj = u();
        if (obj != null)
        {
            obj = bi.a(((ProductListFilterEntity) (obj)));
            if (obj != null)
            {
                JCP.b(((com.jcp.h.d) (obj)));
                if (JCP.A() == null)
                {
                    JCP.a(((com.jcp.h.d) (obj)));
                }
            }
        }
    }

    private ProductListFilterEntity u()
    {
label0:
        {
            if (TextUtils.isEmpty(b))
            {
                break label0;
            }
            Iterator iterator = y.iterator();
            ProductListFilterEntity productlistfilterentity;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                productlistfilterentity = (ProductListFilterEntity)iterator.next();
            } while (!b.equals(productlistfilterentity.getId()));
            return productlistfilterentity;
        }
        return null;
    }

    private String v()
    {
        StringBuilder stringbuilder = new StringBuilder();
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(r);
        arraylist.addAll(A);
        arraylist.addAll(B);
        for (int i1 = 0; i1 < arraylist.size(); i1++)
        {
            stringbuilder.append((String)arraylist.get(i1));
            if (i1 != arraylist.size() - 1)
            {
                stringbuilder.append(",");
            }
        }

        ae.d(g, (new StringBuilder()).append("selected id data  ").append(stringbuilder.toString()).toString());
        return stringbuilder.toString();
    }

    private void w()
    {
        if (w != null)
        {
            y();
            if (m != null)
            {
                m.a(E, u);
                m.notifyDataSetChanged();
            }
        }
    }

    private void x()
    {
        m = new ProductFilterSortListAdapter(this, s, E, u);
        i.setAdapter(m);
        a(i);
    }

    private void y()
    {
        if (w != null)
        {
            List list = (List)w.get(b);
            if (s != null)
            {
                s.clear();
            }
            if (u != null)
            {
                u.clear();
            }
            z();
            if (list != null && u != null)
            {
                u.putAll(c(list));
            }
        }
    }

    private void z()
    {
        int j1 = 0;
        int i1;
        if (v.get(b) != null)
        {
            i1 = ((List)v.get(b)).size();
        } else
        {
            i1 = 0;
        }
        if (w.get(b) != null)
        {
            j1 = ((List)w.get(b)).size();
        }
        if (i1 < j1)
        {
            s.addAll((Collection)w.get(b));
            if (v.get(b) == null)
            {
                v.put(b, new ArrayList());
            } else
            {
                ((List)v.get(b)).clear();
            }
            ((List)v.get(b)).addAll((Collection)w.get(b));
        } else
        {
            s.addAll((Collection)v.get(b));
        }
        if (m != null)
        {
            m.notifyDataSetChanged();
        }
    }

    public c a(int i1, TextView textview, TextView textview1, List list)
    {
        m m1 = new m(Integer.valueOf(0), Integer.valueOf(i1), Integer.valueOf(1), this);
        m1.setOnRangeSeekBarChangeListener(new com.jcp.activities.az(this, textview, list, textview1));
        return m1;
    }

    protected String a()
    {
        return "PRODUCTFILTERSORT";
    }

    public void a(int i1)
    {
        G = i1;
    }

    public void a(ProductList productlist, int i1)
    {
    }

    public void a(ProductListEntityContainer productlistentitycontainer, int i1)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (f != null)
                    {
                        f.setVisibility(8);
                    }
                    if (productlistentitycontainer != null)
                    {
                        c(String.valueOf(productlistentitycontainer.getCount()));
                        l = productlistentitycontainer;
                        if (F)
                        {
                            break label0;
                        }
                        w.clear();
                        w.putAll(b(productlistentitycontainer));
                        if (p == null)
                        {
                            break label1;
                        }
                        if (p.getVisibility() != 0)
                        {
                            break label2;
                        }
                        p.setVisibility(8);
                    }
                    return;
                }
                w();
                return;
            }
            w();
            return;
        }
        F = false;
        if (p != null && p.getVisibility() == 0)
        {
            p.setVisibility(8);
        }
        x.clear();
        r.clear();
        A.clear();
        t.clear();
        w.clear();
        v.clear();
        B.clear();
        G = 0;
        n = 0;
        o = 0;
        i();
    }

    public void a(ProductListFilterEntity productlistfilterentity, int i1)
    {
        if (productlistfilterentity == null) goto _L2; else goto _L1
_L1:
        String s1 = productlistfilterentity.getType();
        if (s1 == null) goto _L2; else goto _L3
_L3:
        i1 = b(s1);
        b = productlistfilterentity.getId();
        i1;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 57
    //                   1 78
    //                   2 84;
           goto _L2 _L4 _L5 _L6
_L2:
        return;
_L4:
        b((List)v.get(b));
        return;
_L5:
        a(productlistfilterentity);
        return;
_L6:
        c(productlistfilterentity);
        return;
    }

    public void a(ProductListSortOptionEntity productlistsortoptionentity)
    {
        if (productlistsortoptionentity != null)
        {
            h = null;
            h = productlistsortoptionentity;
        }
    }

    public void a(ProductListValueEntity productlistvalueentity, int i1, int j1)
    {
        i1;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 93
    //                   1 202
    //                   2 314;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_314;
_L5:
        productlistvalueentity = v();
        List list;
        if (C)
        {
            productlistvalueentity = com.jcp.b.b.g(D, productlistvalueentity);
        } else
        {
            productlistvalueentity = com.jcp.b.b.f(a, productlistvalueentity);
        }
        if (f != null)
        {
            f.setVisibility(0);
        }
        e = new p(this);
        e.a(this);
        e.b(productlistvalueentity);
        return;
_L2:
        if (productlistvalueentity != null)
        {
            if (!r.contains(productlistvalueentity.getId()))
            {
                r.add(productlistvalueentity.getId());
            }
            if (x.size() != 0 && x.get(b) != null)
            {
                list = (List)x.get(b);
                if (!list.contains(productlistvalueentity.getName()))
                {
                    list.add(productlistvalueentity.getName());
                }
            }
        }
          goto _L5
_L3:
        if (productlistvalueentity.getId() != null)
        {
            if (r.contains(productlistvalueentity.getId()))
            {
                r.remove(productlistvalueentity.getId());
            }
            if (x.size() != 0 && x.get(b) != null)
            {
                list = (List)x.get(b);
                if (list.contains(productlistvalueentity.getName()))
                {
                    list.remove(productlistvalueentity.getName());
                }
            }
        }
          goto _L5
        productlistvalueentity = (List)x.get(b);
        if (productlistvalueentity != null)
        {
            productlistvalueentity.clear();
        }
          goto _L5
    }

    public void a(String s1, int i1)
    {
        if (f != null)
        {
            f.setVisibility(8);
        }
        if (p != null && p.getVisibility() == 0)
        {
            p.setVisibility(8);
        }
        if (F)
        {
            F = false;
        }
        au.a(this, "Error", s1);
    }

    protected void a(List list)
    {
        list = list.listIterator();
        if (list != null)
        {
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ProductListValueEntity productlistvalueentity = (ProductListValueEntity)list.next();
                if (productlistvalueentity.getSelected().booleanValue())
                {
                    r.remove(productlistvalueentity.getId());
                }
            } while (true);
        }
    }

    public boolean a(ListView listview)
    {
        boolean flag = false;
        Object obj = listview.getAdapter();
        if (obj != null)
        {
            int k1 = ((ListAdapter) (obj)).getCount();
            int j1 = 0;
            int i1 = 0;
            for (; j1 < k1; j1++)
            {
                View view = ((ListAdapter) (obj)).getView(j1, null, listview);
                view.measure(0, 0);
                i1 += view.getMeasuredHeight();
            }

            j1 = listview.getDividerHeight();
            obj = listview.getLayoutParams();
            obj.height = j1 * (k1 - 1) + i1;
            listview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            listview.requestLayout();
            flag = true;
        }
        return flag;
    }

    public void b(ProductListEntityContainer productlistentitycontainer, int i1)
    {
    }

    public void c()
    {
        if (H != null)
        {
            H.dismiss();
        }
    }

    public int g()
    {
        if (t != null && t.size() > 0)
        {
            for (int i1 = 0; i1 < t.size(); i1++)
            {
                if ("Featured".equalsIgnoreCase(((ProductListSortOptionEntity)t.get(i1)).getName()))
                {
                    return i1;
                }
            }

        }
        return -1;
    }

    public void onBackPressed()
    {
        o();
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131624479: 
        default:
            return;

        case 2131624478: 
            m();
            return;

        case 2131624480: 
            o();
            break;
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300bf);
        j();
        bundle = getIntent();
        q = bundle.getStringExtra("Title");
        C = bundle.getBooleanExtra("SEARCH", false);
        D = bundle.getStringExtra("SEARCH_TAG");
        c = (ListView)findViewById(0x7f0e03b1);
        j = (ListView)findViewById(0x7f0e03af);
        p = (RelativeLayout)findViewById(0x7f0e02c0);
        l = el.U();
        if (l != null)
        {
            if (l.getCount().intValue() > 0)
            {
                a = l.getId();
                i();
            } else
            {
                ((TextView)findViewById(0x7f0e03ae)).setVisibility(8);
                ((TextView)findViewById(0x7f0e03b0)).setVisibility(8);
                c.setVisibility(8);
                j.setVisibility(8);
            }
        }
        l();
    }

}
