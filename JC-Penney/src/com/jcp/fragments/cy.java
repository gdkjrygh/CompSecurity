// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import com.jcp.b.b;
import com.jcp.c.aa;
import com.jcp.c.ah;
import com.jcp.h.a;
import com.jcp.productentity.OptionEntity;
import com.jcp.productentity.OptionValueEntity;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class cy
    implements android.view.View.OnClickListener
{

    final ProductEntityContainer a;
    final ProductDetailFragment b;

    cy(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        b = productdetailfragment;
        a = productentitycontainer;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
label1:
            {
                if (!((CheckBox)view).isChecked())
                {
                    break label0;
                }
                ProductDetailFragment.d(b, true);
                if (b.mSelectionOptionsLayout.getVisibility() == 0)
                {
                    view = new ArrayList();
                    Iterator iterator = a.getOptions().iterator();
                    boolean flag = false;
                    while (iterator.hasNext()) 
                    {
                        Object obj1 = (OptionEntity)iterator.next();
                        Object obj = ((OptionEntity) (obj1)).getDisplayText();
                        obj1 = ((OptionEntity) (obj1)).getOptionValues().listIterator();
                        boolean flag2 = false;
                        do
                        {
                            if (!((ListIterator) (obj1)).hasNext())
                            {
                                break;
                            }
                            OptionValueEntity optionvalueentity = (OptionValueEntity)((ListIterator) (obj1)).next();
                            if ("color".equalsIgnoreCase(((String) (obj))) && optionvalueentity.getSelected().booleanValue() && optionvalueentity.getAvailable().booleanValue())
                            {
                                ProductDetailFragment.e(b, true);
                            } else
                            if (optionvalueentity.getSelected().booleanValue() && optionvalueentity.getAvailable().booleanValue())
                            {
                                ProductDetailFragment.e(b, true);
                                flag2 = true;
                            }
                        } while (true);
                        boolean flag1 = flag;
                        if (!"color".equalsIgnoreCase(((String) (obj))))
                        {
                            HashMap hashmap = new HashMap();
                            hashmap.put(obj, Boolean.valueOf(flag2));
                            obj = hashmap.entrySet().iterator();
                            do
                            {
                                flag1 = flag;
                                if (!((Iterator) (obj)).hasNext())
                                {
                                    break;
                                }
                                Object obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                                String s = (String)((java.util.Map.Entry) (obj2)).getKey();
                                obj2 = (Boolean)((java.util.Map.Entry) (obj2)).getValue();
                                TextView textview = (TextView)ProductDetailFragment.u(b).get(s);
                                if (((Boolean) (obj2)).booleanValue())
                                {
                                    textview.setTextColor(0xff000000);
                                    flag = true;
                                } else
                                {
                                    textview.setTextColor(Color.parseColor("#cc0000"));
                                    textview.setText((new StringBuilder()).append(s).append(": ").append(b.j().getString(0x7f0703c0)).toString());
                                    com.jcp.fragments.ProductDetailFragment.a(b, b.mSaveForLaterIcon, false);
                                    b.mSelectOptionsScroll.fullScroll(33);
                                    view.add(s);
                                    flag = false;
                                }
                            } while (true);
                        }
                        if ("GIFTCARD".equalsIgnoreCase(a.getType()))
                        {
                            ProductDetailFragment.e(b, true);
                        }
                        if (ProductDetailFragment.v(b))
                        {
                            b.mSelectedColor.setTextColor(0xff000000);
                            com.jcp.fragments.ProductDetailFragment.a(b, b.mSaveForLaterIcon, true);
                        } else
                        {
                            b.mSelectedColor.setTextColor(Color.parseColor("#cc0000"));
                            b.mSelectedColor.setText(b.j().getString(0x7f0702f6));
                            com.jcp.fragments.ProductDetailFragment.a(b, b.mSaveForLaterIcon, false);
                            b.mSelectOptionsScroll.fullScroll(33);
                        }
                        flag = flag1;
                    }
                    if (!ProductDetailFragment.v(b) || !flag)
                    {
                        break label1;
                    }
                    com.jcp.fragments.ProductDetailFragment.a(b, b.mSaveForLaterIcon, true);
                    com.jcp.h.a.a(true, ProductDetailFragment.j(b));
                    view = new ah(b.i());
                    view.a(b);
                    view.a(ProductDetailFragment.c(b), ProductDetailFragment.d(b), ProductDetailFragment.l(b));
                }
                return;
            }
            au.a(b.i(), b.a(0x7f07005e));
            b.mSelectOptionsScroll.fullScroll(33);
            com.jcp.fragments.ProductDetailFragment.a(b, b.mSaveForLaterIcon, false);
            com.jcp.fragments.ProductDetailFragment.a(b, view, ProductDetailFragment.v(b));
            return;
        }
        com.jcp.fragments.ProductDetailFragment.a(b, b.mSaveForLaterIcon, false);
        ProductDetailFragment.n(b).b(com.jcp.b.b.l(ProductDetailFragment.m(b)));
    }
}
