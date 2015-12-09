// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.res.Resources;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.jcp.b.b;
import com.jcp.fragments.ProductDetailFragment;
import com.jcp.productentity.OptionValueEntity;
import com.jcp.util.bv;
import com.jcp.util.k;
import com.jcp.views.TypefaceButton;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.jcp.adapters:
//            cr, cq

public class cp extends BaseAdapter
{

    private ProductDetailFragment a;
    private List b;
    private LayoutInflater c;
    private String d;

    public cp(ProductDetailFragment productdetailfragment, String s, List list, String s1)
    {
        a = productdetailfragment;
        c = LayoutInflater.from(productdetailfragment.i());
        b = list;
        d = s1;
    }

    static void a(cp cp1, OptionValueEntity optionvalueentity)
    {
        cp1.a(optionvalueentity);
    }

    private void a(OptionValueEntity optionvalueentity)
    {
        if (com.jcp.b.b.a(a.i()))
        {
            boolean flag = optionvalueentity.getAvailable().booleanValue();
            if (flag || !flag && "OutOfStock".equalsIgnoreCase(optionvalueentity.getAvailability()))
            {
                boolean flag2 = false;
                String s = optionvalueentity.getInventoryMsg();
                boolean flag1 = flag2;
                if (!TextUtils.isEmpty(s))
                {
                    flag1 = flag2;
                    if ("Out Of Stock Online".equalsIgnoreCase(s))
                    {
                        flag1 = true;
                    }
                }
                a.a(optionvalueentity.getUrl(), optionvalueentity.getAvailability(), flag1);
            }
            return;
        } else
        {
            k.a(a.i().getResources().getString(0x7f0702b9), a.i().getResources().getString(0x7f0702b8), a.i());
            return;
        }
    }

    private boolean a(String s)
    {
        return "onlineonly".equalsIgnoreCase(s);
    }

    private boolean a(String s, String s1)
    {
        return "out of stock online".equalsIgnoreCase(s) && !a(s1);
    }

    public OptionValueEntity a(int i)
    {
        return (OptionValueEntity)b.get(i);
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        String s1;
        boolean flag;
        OptionValueEntity optionvalueentity;
        boolean flag1;
        if (view == null)
        {
            view = c.inflate(0x7f0300e2, viewgroup, false);
            viewgroup = new cr();
            cr.a(viewgroup, (TypefaceButton)view.findViewById(0x7f0e04be));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (cr)view.getTag();
        }
        optionvalueentity = (OptionValueEntity)b.get(i);
        flag = optionvalueentity.getSelected().booleanValue();
        flag1 = optionvalueentity.getAvailable().booleanValue();
        s = optionvalueentity.getAvailability();
        s1 = optionvalueentity.getInventoryMsg();
        cr.a(viewgroup).setTextColor(0xff000000);
        cr.a(viewgroup).setTextSize(15F);
        cr.a(viewgroup).setClickable(true);
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            if ("outofstock".equalsIgnoreCase(s))
            {
                cr.a(viewgroup).setClickable(false);
            } else
            {
                cr.a(viewgroup).setClickable(true);
            }
            cr.a(viewgroup).setBackgroundResource(0x7f020115);
            cr.a(viewgroup).setTextColor(-1);
        } else
        {
            cr.a(viewgroup).setBackgroundResource(0x7f020128);
            cr.a(viewgroup).setClickable(false);
        }
_L4:
        cr.a(viewgroup).setText(bv.b(optionvalueentity.getValue().toLowerCase(Locale.getDefault())));
        cr.a(viewgroup).setGravity(17);
        cr.a(viewgroup).invalidate();
        cr.a(viewgroup).setOnClickListener(new cq(this, i));
        return view;
_L2:
        if (!a(s1, d))
        {
            cr.a(viewgroup).setClickable(false);
            cr.a(viewgroup).setBackgroundResource(0x7f020128);
            cr.a(viewgroup).setTextColor(a.i().getResources().getColor(0x7f0d00a8));
        } else
        if ("outofstock".equalsIgnoreCase(s))
        {
            if ("Out Of Stock Online".equalsIgnoreCase(s1))
            {
                if (flag)
                {
                    cr.a(viewgroup).setTextColor(-1);
                    cr.a(viewgroup).setBackgroundResource(0x7f02017a);
                } else
                {
                    cr.a(viewgroup).setBackgroundResource(0x7f0201ef);
                    cr.a(viewgroup).setTextColor(a.i().getResources().getColor(0x7f0d00a8));
                }
            }
        } else
        {
            cr.a(viewgroup).setClickable(false);
            cr.a(viewgroup).setBackgroundResource(0x7f020128);
            cr.a(viewgroup).setTextColor(a.i().getResources().getColor(0x7f0d00a8));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
