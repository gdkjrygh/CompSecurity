// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;
import com.thetransitapp.droid.model.RouteImage;
import com.thetransitapp.droid.model.RoutingLeg;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.viewmodel.RouteViewModel;
import com.thetransitapp.droid.ui.ShadowImageView;
import com.thetransitapp.droid.util.BitmapUtility;
import com.thetransitapp.droid.util.DistanceUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RoutingStepAdapter extends ArrayAdapter
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType[];
    private SharedPreferences preferences;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.thetransitapp.droid.model.RoutingLeg.LegType.values().length];
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.LegType.END.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.LegType.START.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.LegType.TRANSIT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.LegType.WAIT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.LegType.WALK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType = ai;
        return ai;
    }

    public RoutingStepAdapter(Context context, SharedPreferences sharedpreferences)
    {
        super(context, 0x7f030027, new ArrayList());
        preferences = sharedpreferences;
    }

    public void addAll(Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return;
            }
            super.add((RoutingLeg)collection.next());
        } while (true);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = ((LayoutInflater)super.getContext().getSystemService("layout_inflater")).inflate(0x7f030026, null);
        }
        RoutingLeg routingleg = (RoutingLeg)super.getItem(i);
        ImageView imageview;
        TextView textview;
        TextView textview1;
        TextView textview2;
        Context context;
        ShadowImageView shadowimageview;
        TextView textview3;
        java.text.DateFormat dateformat;
        int j;
        if (routingleg.getLegType() == com.thetransitapp.droid.model.RoutingLeg.LegType.TRANSIT)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        viewgroup = (TextView)view.findViewById(0x7f050076);
        textview3 = (TextView)view.findViewById(0x7f050078);
        imageview = (ImageView)view.findViewById(0x7f050079);
        shadowimageview = (ShadowImageView)view.findViewById(0x7f05007a);
        textview = (TextView)view.findViewById(0x7f05007b);
        textview1 = (TextView)view.findViewById(0x7f05007c);
        textview2 = (TextView)view.findViewById(0x7f05007d);
        context = view.getContext();
        dateformat = DateFormat.getTimeFormat(context);
        shadowimageview.setVisibility(8);
        textview3.setVisibility(i);
        if (routingleg.getLegType() != com.thetransitapp.droid.model.RoutingLeg.LegType.WALK)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        textview1.setVisibility(j);
        textview2.setVisibility(i);
        view.findViewById(0x7f050077).setVisibility(i);
        switch ($SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType()[routingleg.getLegType().ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            i = (int)(routingleg.getDuration() / 60000L);
            double d = routingleg.getDistance();
            viewgroup.setText((new StringBuilder(String.valueOf(i))).append(" min").toString());
            textview.setText((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(textview.getResources().getString(0x7f0a0093)))).append(" ").toString()))).append(DistanceUtility.getDistanceString(d, preferences.getBoolean("useImperialSystem", false))).toString());
            imageview.setImageResource(0x7f0200b9);
            return view;

        case 5: // '\005'
            viewgroup.setText(dateformat.format(routingleg.getEndTime()));
            textview.setText(textview.getResources().getString(0x7f0a0094));
            textview1.setText(routingleg.getToPlacemark().getName());
            imageview.setImageResource(0x7f0200b7);
            return view;

        case 1: // '\001'
            viewgroup.setText(dateformat.format(routingleg.getStartTime()));
            textview.setText(textview.getResources().getString(0x7f0a0092));
            textview1.setText(routingleg.getFromPlacemark().getName());
            imageview.setImageResource(0x7f0200b8);
            return view;

        case 4: // '\004'
            viewgroup.setText(dateformat.format(routingleg.getStartTime()));
            textview3.setText(dateformat.format(routingleg.getEndTime()));
            viewgroup = "";
            break;
        }
        int k;
        int l;
        if (routingleg.getRoute().getRouteImage() != null)
        {
            shadowimageview.setImageBitmap(null);
            shadowimageview.setVisibility(0);
            shadowimageview.setColorFilter(new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN));
            shadowimageview.setShadowLayer(2.0F, 0.0F, -2F, 0xff000000);
            android.util.DisplayMetrics displaymetrics = shadowimageview.getResources().getDisplayMetrics();
            UrlImageViewHelper.setUrlDrawable(shadowimageview, routingleg.getRoute().getRouteImage().getUrlWithScreenMetrics(displaymetrics, true));
        } else
        {
            viewgroup = (new StringBuilder(String.valueOf(routingleg.getRoute().getShortName()))).append(" ").toString();
        }
        textview.setText((new StringBuilder(String.valueOf(viewgroup))).append(routingleg.getHeadsign()).toString());
        textview1.setText(routingleg.getFromPlacemark().getName());
        textview2.setText(routingleg.getToPlacemark().getName());
        view.measure(-2, -2);
        i = context.getResources().getDrawable(0x7f0200b9).getIntrinsicWidth();
        j = view.getMeasuredHeight();
        k = view.getPaddingTop();
        l = view.getPaddingBottom();
        imageview.setImageBitmap(BitmapUtility.getStepIcon(routingleg.getRoute().getColor(), i, j - k - l));
        return view;
    }
}
