// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.support.v4.view.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.taplytics.a.j;
import com.tinder.enums.PaywallPerk;
import com.tinder.model.TinderPlusFeatureDisplay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class o extends t
{

    private static final HashMap a = new HashMap(5);
    private Context b;
    private List c;

    public o(Context context, List list)
    {
        b = context;
        j j1 = new j("Paywall Dialog Like Title", context.getString(0x7f060169));
        j j2 = new j("Paywall Dialog Like Text", context.getString(0x7f060161));
        j j3 = new j("Paywall Dialog Undo Title", context.getString(0x7f06016c));
        j j4 = new j("Paywall Dialog Undo Text", context.getString(0x7f060164));
        j j5 = new j("Paywall Dialog Ads Title", context.getString(0x7f060168));
        j j6 = new j("Paywall Dialog Ads Text", context.getString(0x7f060160));
        j j7 = new j("Paywall Dialog Passport Title", context.getString(0x7f06016a));
        j j8 = new j("Paywall Dialog Passport Text", context.getString(0x7f060162));
        j j9 = new j("Paywall Dialog Passport Title", context.getString(0x7f06016b));
        context = new j("Paywall Dialog Passport Text", context.getString(0x7f060163));
        a.put(PaywallPerk.UNLIMITED_LIKES.stringVal, new TinderPlusFeatureDisplay(0x7f020196, (String)j1.a, (String)j2.a));
        a.put(PaywallPerk.UNDO.stringVal, new TinderPlusFeatureDisplay(0x7f020199, (String)j3.a, (String)j4.a));
        a.put(PaywallPerk.NO_ADS.stringVal, new TinderPlusFeatureDisplay(0x7f020193, (String)j5.a, (String)j6.a));
        a.put(PaywallPerk.PASSPORT.stringVal, new TinderPlusFeatureDisplay(0x7f020197, (String)j7.a, (String)j8.a));
        a.put(PaywallPerk.SUPER_LIKE.stringVal, new TinderPlusFeatureDisplay(0x7f020198, (String)j9.a, (String)((j) (context)).a));
        if (list != null)
        {
            c = new ArrayList(list.size());
            context = list.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                list = (String)context.next();
                if (a.containsKey(list))
                {
                    c.add(a.get(list));
                }
            } while (true);
        }
        if (c == null || c.isEmpty())
        {
            c = new ArrayList(a.size());
            for (context = a.entrySet().iterator(); context.hasNext(); c.add(list.getValue()))
            {
                list = (java.util.Map.Entry)context.next();
            }

        }
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        TinderPlusFeatureDisplay tinderplusfeaturedisplay = (TinderPlusFeatureDisplay)c.get(i);
        View view = LayoutInflater.from(b).inflate(0x7f030074, viewgroup, false);
        ImageView imageview = (ImageView)view.findViewById(0x7f0e01b8);
        TextView textview = (TextView)view.findViewById(0x7f0e01ba);
        TextView textview1 = (TextView)view.findViewById(0x7f0e01bb);
        textview.setText(tinderplusfeaturedisplay.getPerk());
        textview1.setText(tinderplusfeaturedisplay.getByline());
        imageview.setContentDescription(tinderplusfeaturedisplay.getByline());
        viewgroup.addView(view);
        Picasso.a(b).a(tinderplusfeaturedisplay.getResource()).a(imageview, null);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

}
