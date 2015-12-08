// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.d.a;
import com.jcp.d.b;
import com.jcp.e.j;
import com.jcp.fragments.fa;
import com.jcp.fragments.gh;
import com.jcp.fragments.t;
import com.jcp.model.Coupons;
import com.jcp.model.Offers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jcp.adapters:
//            ab, z, ad, ae, 
//            ac, aa

public final class CouponAdapter extends BaseAdapter
{

    private static CouponAdapter d;
    private Coupons a[];
    private LayoutInflater b;
    private WeakReference c;
    private final Map e = new HashMap();

    private CouponAdapter(ac ac1, Coupons acoupons[])
    {
        c = new WeakReference(null);
        a = acoupons;
        c = new WeakReference(ac1);
        b = (LayoutInflater)a().getSystemService("layout_inflater");
        e.clear();
        a(acoupons);
    }

    private ac a()
    {
        if (c == null)
        {
            throw new b((new StringBuilder()).append(com/jcp/adapters/CouponAdapter.getName()).append(" activity reference is gone").toString());
        } else
        {
            return (ac)c.get();
        }
    }

    static ac a(CouponAdapter couponadapter)
    {
        return couponadapter.a();
    }

    private android.view.View.OnClickListener a(int i)
    {
        return new ab(this, i);
    }

    private android.view.View.OnClickListener a(Coupons coupons)
    {
        return new z(this, coupons);
    }

    public static CouponAdapter a(ac ac1, Coupons acoupons[])
    {
        if (d == null)
        {
            d = new CouponAdapter(ac1, acoupons);
        }
        return d;
    }

    static String a(CouponAdapter couponadapter, String s)
    {
        return couponadapter.c(s);
    }

    private String a(String s)
    {
        s.replace("|", "%7C");
        s.replace("}", "%7D");
        s.replace("{", "%7B");
        return s;
    }

    static void a(CouponAdapter couponadapter, int i)
    {
        couponadapter.f(i);
    }

    static void a(CouponAdapter couponadapter, String s, String s1)
    {
        couponadapter.a(s, s1);
    }

    private void a(String s, String s1)
    {
        s = a(s);
        if (s.startsWith("/"))
        {
            s = (new StringBuilder()).append("http://").append(com.jcp.b.b.b).append(s).toString();
        }
        if (!s.contains(a().getResources().getString(0x7f0703ff))) goto _L2; else goto _L1
_L1:
        ac ac1;
        if (s.contains(a().getResources().getString(0x7f070156)))
        {
            c();
        }
        ac1 = a();
        if (ac1 == null) goto _L4; else goto _L3
_L3:
        if (!(ac1 instanceof j)) goto _L6; else goto _L5
_L5:
        Iterator iterator = com.jcp.b.b.y(s).entrySet().iterator();
_L14:
        if (!iterator.hasNext()) goto _L4; else goto _L7
_L7:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        if (!((String)entry.getKey()).equals(a().getResources().getString(0x7f070153))) goto _L9; else goto _L8
_L8:
        if (!((String)entry.getValue()).contains(a().getResources().getString(0x7f07014d))) goto _L11; else goto _L10
_L10:
        s1 = (String)entry.getValue();
        if (!s.contains(a().getResources().getString(0x7f07014d))) goto _L13; else goto _L12
_L12:
        ((j)ac1).a(s1, null, s, 1);
_L4:
        return;
_L13:
        ((j)ac1).d(s1);
        return;
_L11:
        if (((String)entry.getValue()).contains(a().getResources().getString(0x7f070150)))
        {
            s = (String)entry.getValue();
            ((j)ac1).d(s);
            return;
        }
_L9:
        if (s.contains(a().getResources().getString(0x7f070151)))
        {
            String s2;
            if (s1 == null)
            {
                s2 = "";
            } else
            {
                s2 = s1;
            }
            s2 = (new StringBuilder()).append(s2).append("_SHOPNOW").toString();
            ((j)ac1).a("S2", "M2", s2);
        }
        if (true) goto _L14; else goto _L6
_L6:
        throw new a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
            android/app/Activity.getName(), com/jcp/e/j.getName()
        }));
_L2:
        if (b(s))
        {
            b(s, s1);
            return;
        } else
        {
            a("", a().getResources().getString(0x7f0701cc), s);
            return;
        }
    }

    private void a(String s, String s1, String s2)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(a())).create();
        alertdialog.setTitle(s);
        alertdialog.setMessage(s1);
        alertdialog.setButton(-1, a().getResources().getString(0x7f070049), new ad(this, s2));
        alertdialog.setButton(-2, a().getResources().getString(0x7f070041), new ae(this, alertdialog));
        alertdialog.show();
    }

    private void a(Coupons acoupons[])
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < acoupons.length) 
        {
            String s = acoupons[i].getGroup();
            if (arraylist.contains(s))
            {
                e.put((new StringBuilder()).append("").append(i).toString(), a().getResources().getString(0x7f070183));
            } else
            {
                e.put((new StringBuilder()).append("").append(i).toString(), s);
                arraylist.add(s);
            }
            i++;
        }
    }

    private android.view.View.OnClickListener b(int i)
    {
        return new com.jcp.adapters.ac(this, i);
    }

    private android.view.View.OnClickListener b(Coupons coupons)
    {
        return new aa(this, coupons);
    }

    private t b()
    {
        ac ac1 = a();
        if (ac1 instanceof t)
        {
            return (t)ac1;
        } else
        {
            throw new a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
                android/app/Activity.getName(), com/jcp/fragments/t.getName()
            }));
        }
    }

    private void b(String s, String s1)
    {
        if (!a().isFinishing())
        {
            Bundle bundle = new Bundle();
            bundle.putString(a().getResources().getString(0x7f07016e), s);
            bundle.putBoolean(a().getResources().getString(0x7f0701ec), true);
            bundle.putString("COUPON_CODE", s1);
            s = new fa();
            s.g(bundle);
            b().b(s, "PromotionFragment");
        }
    }

    private boolean b(String s)
    {
        while (s.contains(a().getResources().getString(0x7f070154)) && s.contains(a().getResources().getString(0x7f070155)) || s.contains(a().getResources().getString(0x7f070152))) 
        {
            return true;
        }
        return false;
    }

    static Coupons[] b(CouponAdapter couponadapter)
    {
        return couponadapter.a;
    }

    private int c(int i)
    {
label0:
        {
            byte byte0 = 2;
            Object obj = a[i];
            String s = ((Coupons) (obj)).getInStoreOnlineOnly();
            i = byte0;
            if (!TextUtils.isEmpty(s))
            {
                i = byte0;
                if ("false".equalsIgnoreCase(s))
                {
                    obj = ((Coupons) (obj)).getOnlineOnly();
                    if (TextUtils.isEmpty(((CharSequence) (obj))) || !"true".equalsIgnoreCase(((String) (obj))))
                    {
                        break label0;
                    }
                    i = 1;
                }
            }
            return i;
        }
        return 0;
    }

    private String c(String s)
    {
        String s1 = s;
        if (s.contains(a().getResources().getString(0x7f070421)))
        {
            s1 = (new StringBuilder()).append(s).append(com.jcp.b.b.h).toString();
        }
        return s1;
    }

    private void c()
    {
        b().c(new gh(), "StoreListFragment");
    }

    private String d(int i)
    {
        switch (i)
        {
        default:
            return a().getResources().getString(0x7f070134);

        case 0: // '\0'
            return a().getResources().getString(0x7f070136);

        case 1: // '\001'
            return a().getResources().getString(0x7f070135);
        }
    }

    private String e(int i)
    {
        switch (i)
        {
        default:
            return a().getResources().getString(0x7f07012c);

        case 1: // '\001'
            return a().getResources().getString(0x7f070132);
        }
    }

    private void f(int i)
    {
        String s1 = a(a[i].getDetailMobileURL());
        String s2 = a[i].getCode();
        String s = s1;
        if (s1.startsWith("/"))
        {
            s = (new StringBuilder()).append("http://").append(com.jcp.b.b.b).append(s1).toString();
        }
        if (b(s))
        {
            b(s, s2);
            return;
        } else
        {
            a("", a().getResources().getString(0x7f0701cc), s);
            return;
        }
    }

    public int getCount()
    {
        return a.length;
    }

    public Object getItem(int i)
    {
        return a[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int k = c(i);
        Object obj;
        if (view == null)
        {
            view = b.inflate(0x7f030050, viewgroup, false);
            viewgroup = new ViewHolder(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        obj = (String)e.get(String.valueOf(i));
        if (((String) (obj)).equalsIgnoreCase(a().getResources().getString(0x7f070183)))
        {
            ((ViewHolder) (viewgroup)).mHeader.setVisibility(8);
        } else
        {
            ((ViewHolder) (viewgroup)).mHeader.setText(((CharSequence) (obj)));
            ((ViewHolder) (viewgroup)).mHeader.setVisibility(0);
        }
        ((ViewHolder) (viewgroup)).mCouponType.setText(d(k));
        ((ViewHolder) (viewgroup)).mViewDetails.setText(e(k));
        obj = a[i];
        if (((ViewHolder) (viewgroup)).mCouponOfferSection != null)
        {
            Offers aoffers[] = ((Coupons) (obj)).getOffers();
            ((ViewHolder) (viewgroup)).mCouponOfferSection.removeAllViews();
            if (aoffers != null)
            {
                int i1 = aoffers.length;
                for (int l = 0; l < i1; l++)
                {
                    Object obj1 = aoffers[l];
                    String s = ((Offers) (obj1)).getName();
                    obj1 = ((Offers) (obj1)).getDescription();
                    if (TextUtils.isEmpty(s) && TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        continue;
                    }
                    View view1 = a().getLayoutInflater().inflate(0x7f030051, ((ViewHolder) (viewgroup)).mCouponOfferSection, false);
                    if (!TextUtils.isEmpty(s))
                    {
                        ((TextView)view1.findViewById(0x7f0e0214)).setText(s);
                    }
                    if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        ((TextView)view1.findViewById(0x7f0e0215)).setText(((CharSequence) (obj1)));
                    }
                    ((ViewHolder) (viewgroup)).mCouponOfferSection.addView(view1);
                }

            }
        }
        if (!TextUtils.isEmpty(((Coupons) (obj)).getValidTill()))
        {
            ((ViewHolder) (viewgroup)).mCouponValidity.setText((new StringBuilder()).append(a().getResources().getString(0x7f07045a)).append(((Coupons) (obj)).getValidTill()).toString());
        }
        if (!TextUtils.isEmpty(((Coupons) (obj)).getCode()))
        {
            if (!TextUtils.isEmpty(((Coupons) (obj)).getCode()))
            {
                ((ViewHolder) (viewgroup)).mCouponCode.setText(((Coupons) (obj)).getCode());
            }
            ((ViewHolder) (viewgroup)).mBottomBarOne.setVisibility(0);
            ((ViewHolder) (viewgroup)).mBottomBarTwo.setVisibility(8);
            ((ViewHolder) (viewgroup)).mCodeBar.setVisibility(0);
            if (!TextUtils.isEmpty(((Coupons) (obj)).getShopTitle()))
            {
                ((ViewHolder) (viewgroup)).mShopNowBtn.setText(((Coupons) (obj)).getShopTitle().toUpperCase());
            }
            ((ViewHolder) (viewgroup)).mShopNowBtn.setOnClickListener(a(((Coupons) (obj))));
        } else
        {
            ((ViewHolder) (viewgroup)).mCodeBar.setVisibility(8);
            ((ViewHolder) (viewgroup)).mBottomBarTwo.setVisibility(0);
            ((ViewHolder) (viewgroup)).mApplyCodeBtn.setText(a().getResources().getString(0x7f070129));
            if (!TextUtils.isEmpty(((Coupons) (obj)).getShopTitle()))
            {
                ((Button)view.findViewById(0x7f0e0212)).setText(((Coupons) (obj)).getShopTitle().toUpperCase());
            }
            ((ViewHolder) (viewgroup)).mBottomBarOne.setVisibility(8);
            view.findViewById(0x7f0e0212).setOnClickListener(a(((Coupons) (obj))));
        }
        ((ViewHolder) (viewgroup)).mApplyCodeBtn.setOnClickListener(b(((Coupons) (obj))));
        ((ViewHolder) (viewgroup)).mViewDetails.setOnClickListener(b(i));
        view.findViewById(0x7f0e0207).setOnClickListener(b(i));
        view.findViewById(0x7f0e0208).setOnClickListener(a(i));
        return view;
    }

    private class ViewHolder
    {

        protected Button mApplyCodeBtn;
        protected LinearLayout mBottomBarOne;
        protected LinearLayout mBottomBarTwo;
        protected LinearLayout mCodeBar;
        protected TextView mCouponCode;
        protected LinearLayout mCouponOfferSection;
        protected TextView mCouponType;
        protected TextView mCouponValidity;
        protected TextView mHeader;
        protected Button mShopNowBtn;
        protected TextView mViewDetails;

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
