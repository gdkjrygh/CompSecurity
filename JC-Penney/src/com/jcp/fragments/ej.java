// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.graphics.Color;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.jcp.productentity.OptionEntity;
import com.jcp.productentity.OptionValueEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class ej
{

    final ProductDetailFragment a;
    private String b;
    private OptionEntity c;
    private String d;

    public ej(ProductDetailFragment productdetailfragment, String s, OptionEntity optionentity, String s1)
    {
        a = productdetailfragment;
        super();
        b = s;
        c = optionentity;
        d = s1;
    }

    public ej a()
    {
        String s = c.getDisplayText();
        ListIterator listiterator = c.getOptionValues().listIterator();
        boolean flag = false;
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            OptionValueEntity optionvalueentity = (OptionValueEntity)listiterator.next();
            if ("color".equalsIgnoreCase(s) && optionvalueentity.getSelected().booleanValue())
            {
                b = optionvalueentity.getValue();
                ProductDetailFragment.e(a, true);
            } else
            if (optionvalueentity.getSelected().booleanValue() && optionvalueentity.getAvailable().booleanValue())
            {
                flag = true;
            }
        } while (true);
        if (!"color".equalsIgnoreCase(s))
        {
            HashMap hashmap = new HashMap();
            hashmap.put(s, Boolean.valueOf(flag));
            for (Iterator iterator = hashmap.entrySet().iterator(); iterator.hasNext();)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (Boolean)((java.util.Map.Entry) (obj)).getValue();
                TextView textview = (TextView)ProductDetailFragment.u(a).get(s1);
                if (((Boolean) (obj)).booleanValue())
                {
                    textview.setTextColor(0xff000000);
                } else
                {
                    textview.setTextColor(Color.parseColor("#cc0000"));
                    textview.setText((new StringBuilder()).append(s1).append(": ").append(a.j().getString(0x7f0703c0)).toString());
                    a.mSelectOptionsScroll.fullScroll(33);
                }
            }

        }
        if ("GIFTCARD".equalsIgnoreCase(d) || a.mColorSectionLayout.getVisibility() == 8)
        {
            ProductDetailFragment.e(a, true);
        }
        if (ProductDetailFragment.v(a))
        {
            a.mSelectedColor.setTextColor(0xff000000);
            a.mSelectedColor.setText(Html.fromHtml((new StringBuilder()).append(a.j().getString(0x7f0700fe)).append("<b>").append(b).append("</b> ").toString()));
            return this;
        } else
        {
            a.mSelectedColor.setTextColor(Color.parseColor("#cc0000"));
            a.mSelectedColor.setText(a.j().getString(0x7f0702f6));
            a.mSelectOptionsScroll.fullScroll(33);
            return this;
        }
    }
}
