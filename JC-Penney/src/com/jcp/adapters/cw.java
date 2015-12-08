// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.aa;
import com.jcp.util.au;
import com.jcp.util.bt;
import com.jcp.views.HtmlTypefaceTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.jcp.adapters:
//            cx, cy, cz

public class cw extends BaseAdapter
    implements android.view.View.OnClickListener
{

    private Context a;
    private LayoutInflater b;
    private List c;
    private List d;
    private boolean e;
    private List f;
    private int g;
    private boolean h;

    public cw(Context context, List list)
    {
        d = new ArrayList();
        f = new ArrayList();
        g = -1;
        a = context;
        c = list;
        d.addAll(c);
        b = (LayoutInflater)a.getSystemService("layout_inflater");
        e();
    }

    private List c(List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(list);
        Collections.sort(arraylist, new cx(this));
        return arraylist;
    }

    private List d(List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(list);
        Collections.sort(arraylist, new cy(this));
        return arraylist;
    }

    private void e()
    {
        List list = null;
        if (!e) goto _L2; else goto _L1
_L1:
        if (!f.contains("Distance")) goto _L4; else goto _L3
_L3:
        list = c(c);
_L6:
        if (!c.isEmpty())
        {
            c.clear();
        }
        c.addAll(list);
        return;
_L4:
        if (f.contains("Product Availability"))
        {
            list = d(c);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        list = f();
        if (true) goto _L6; else goto _L5
_L5:
    }

    private List f()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        ((List) (obj)).addAll(d);
        if (f.isEmpty())
        {
            return ((List) (obj));
        }
        obj = ((List) (obj)).iterator();
label0:
        do
        {
            if (((Iterator) (obj)).hasNext())
            {
                Stores stores = (Stores)((Iterator) (obj)).next();
                List list = Arrays.asList(stores.getServices());
                int i = 0;
                do
                {
                    if (i >= f.size())
                    {
                        continue label0;
                    }
                    if (list.contains(f.get(i)))
                    {
                        arraylist.add(stores);
                        continue label0;
                    }
                    i++;
                } while (true);
            }
            return arraylist;
        } while (true);
    }

    public void a()
    {
        c.clear();
        notifyDataSetChanged();
    }

    public void a(int i)
    {
        g = i;
        notifyDataSetChanged();
    }

    public void a(List list)
    {
        if (!f.isEmpty())
        {
            f.clear();
        }
        f.addAll(list);
        e();
        notifyDataSetChanged();
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public Stores b(int i)
    {
        return (Stores)c.get(i);
    }

    public List b()
    {
        return d;
    }

    public void b(List list)
    {
        d.addAll(list);
        c.addAll(list);
        e();
        notifyDataSetChanged();
    }

    public void b(boolean flag)
    {
        h = flag;
    }

    public List c()
    {
        return c;
    }

    public List d()
    {
        ArrayList arraylist = new ArrayList();
        if (e)
        {
            arraylist.add("Product Availability");
            arraylist.add("Distance");
            return arraylist;
        }
        for (int i = 0; i < c.size(); i++)
        {
            String as[] = ((Stores)c.get(i)).getServices();
            for (int j = 0; j < as.length; j++)
            {
                arraylist.add(as[j]);
            }

        }

        HashSet hashset = new HashSet();
        hashset.addAll(arraylist);
        arraylist.clear();
        arraylist.addAll(hashset);
        return arraylist;
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        return b(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Stores stores = b(i);
        View view1;
        if (view == null)
        {
            view1 = b.inflate(0x7f03009d, null);
            viewgroup = new cz();
            viewgroup.a = (TextView)view1.findViewById(0x7f0e035d);
            viewgroup.b = (TextView)view1.findViewById(0x7f0e01ac);
            viewgroup.c = (TextView)view1.findViewById(0x7f0e01ad);
            viewgroup.d = (TextView)view1.findViewById(0x7f0e01af);
            viewgroup.e = (TextView)view1.findViewById(0x7f0e04e2);
            viewgroup.f = (TextView)view1.findViewById(0x7f0e01ae);
            viewgroup.g = (TextView)view1.findViewById(0x7f0e04e3);
            viewgroup.h = (HtmlTypefaceTextView)view1.findViewById(0x7f0e035f);
            viewgroup.i = (ImageView)view1.findViewById(0x7f0e029b);
            view1.setTag(viewgroup);
        } else
        {
            viewgroup = (cz)view.getTag();
            view1 = view;
        }
        ((cz) (viewgroup)).a.setTag(stores);
        ((cz) (viewgroup)).a.setText(String.valueOf(i + 1));
        ((cz) (viewgroup)).b.setText(stores.getName());
        ((cz) (viewgroup)).c.setText(stores.getStreet());
        if (e)
        {
            view = String.format("%s, %s %s", new Object[] {
                stores.getCity(), stores.getStateCode(), stores.getZip()
            });
        } else
        {
            view = String.format("%s, %s %s", new Object[] {
                stores.getCity(), stores.getState(), stores.getZip()
            });
        }
        ((cz) (viewgroup)).d.setText(view);
        ((cz) (viewgroup)).f.setText(String.format(a.getString(0x7f070175), new Object[] {
            stores.getDistance()
        }));
        ((cz) (viewgroup)).g.setText(stores.getPhone());
        ((cz) (viewgroup)).g.setTag(stores.getPhone());
        ((cz) (viewgroup)).g.setOnClickListener(this);
        if (e)
        {
            ((cz) (viewgroup)).i.setVisibility(8);
            ((cz) (viewgroup)).h.setVisibility(0);
            bt.a(a, ((cz) (viewgroup)).h, stores.getInventory());
        } else
        {
            if (!f.isEmpty())
            {
                ((cz) (viewgroup)).e.setVisibility(0);
                view = null;
                int j = 0;
                while (j < stores.getServices().length) 
                {
                    String s = stores.getServices()[j];
                    if (f.contains(s))
                    {
                        if (view == null)
                        {
                            view = s;
                        } else
                        {
                            view = (new StringBuilder()).append(view).append(", ").append(s).toString();
                        }
                    }
                    j++;
                }
                ((cz) (viewgroup)).e.setText(view);
            } else
            {
                ((cz) (viewgroup)).e.setVisibility(8);
            }
            ((cz) (viewgroup)).h.setVisibility(8);
            if (h)
            {
                view = (Stores)aa.a(a.getSharedPreferences("MyPrefsForStore", 0).getString("storeList", ""), com/jcp/storepickup/pojo/Stores);
                ((cz) (viewgroup)).i.setVisibility(8);
                ((cz) (viewgroup)).a.setVisibility(8);
                if (view != null && ((Stores)c.get(i)).getId().equals(view.getId()))
                {
                    ((cz) (viewgroup)).i.setVisibility(0);
                    ((cz) (viewgroup)).i.setImageResource(0x7f02014b);
                }
            }
        }
        if (i == g)
        {
            view1.setBackgroundResource(0x7f02011e);
            return view1;
        } else
        {
            view1.setBackgroundColor(a.getResources().getColor(0x7f0d00c3));
            return view1;
        }
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0e04e3)
        {
            view = (String)view.getTag();
            au.c(a, view);
        }
    }
}
