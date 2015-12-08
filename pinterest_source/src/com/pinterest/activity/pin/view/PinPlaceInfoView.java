// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.view.ExpandableView;
import java.util.Iterator;
import java.util.List;

public class PinPlaceInfoView extends LinearLayout
{

    private static final int NUM_ADDITIONAL_TIPS = 2;
    private static final boolean SHOW_TIPS = false;
    private IconDoubleTextCellView _call;
    private IconDoubleTextCellView _directions;
    private ExpandableView _hours;
    private IconDoubleTextCellView _moreInfo;
    private ExpandableView _moreTips;
    private Pin _pin;
    private Place _place;
    private LinearLayout _tips;
    private TextView _title;

    public PinPlaceInfoView(Context context, Pin pin)
    {
        super(context);
        _pin = pin;
        _place = pin.getPlace();
        init();
    }

    private IconDoubleTextCellView addIconView(int i, int j, String s)
    {
        return addIconView(i, j, s, false);
    }

    private IconDoubleTextCellView addIconView(int i, int j, String s, boolean flag)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F);
        int k = (int)Resources.dimension(0x7f0a015f);
        int l = (int)Resources.dimension(0x7f0a0162);
        IconDoubleTextCellView icondoubletextcellview = new IconDoubleTextCellView(getContext(), com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView.TextOrientation.HORIZONTAL, 0x7f0100e6, 0x7f0100e7);
        icondoubletextcellview.setPadding(k, l, k, l);
        icondoubletextcellview.setLayoutParams(layoutparams);
        icondoubletextcellview.setImageResource(i);
        icondoubletextcellview.setTitle(Resources.string(j));
        icondoubletextcellview.setSubTitleFontStyle(0);
        icondoubletextcellview.setSubTitleGravity(5);
        if (flag)
        {
            icondoubletextcellview.setSubtitleEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        i = (int)Resources.dimension(0x7f0a019e);
        icondoubletextcellview.setImageProperties(false, i, i, (int)Resources.dimension(0x7f0a01a6));
        if (ModelHelper.isValidString(s))
        {
            icondoubletextcellview.setSubTitle(s);
            icondoubletextcellview.setVisibility(0);
        } else
        {
            icondoubletextcellview.setVisibility(8);
        }
        addView(icondoubletextcellview);
        return icondoubletextcellview;
    }

    private void init()
    {
        setBackgroundColor(-1);
        setOrientation(1);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        int i = (int)Resources.dimension(0x7f0a015f);
        int j = (int)((float)(FragmentHelper.getCloseupWidth() - Constants.MARGIN_DOUBLE) * 0.2F);
        _title = new TextView(getContext(), null, 0x7f0100e2);
        _title.setText(_place.getName());
        _title.setTypeface(null, 1);
        _title.setPadding(i, i, j, i);
        addView(_title, -1, -2);
        _directions = addIconView(0x7f0201d9, 0x7f070439, _place.getAddress());
        _directions.setPadding(_directions.getPaddingLeft(), 0, _directions.getPaddingRight(), _directions.getPaddingBottom());
        _directions.setOnClickListener(new _cls1());
        _call = addIconView(0x7f0201d8, 0x7f070436, _place.getPhone());
        _call.setOnClickListener(new _cls2());
        _moreInfo = addIconView(0x7f0201dd, 0x7f07043f, _place.getUrl(), true);
        _moreInfo.setOnClickListener(new _cls3());
        _hours = new ExpandableView(getContext());
        if (_place.getDisplayHours() != null && !_place.getDisplayHours().isEmpty())
        {
            int k = (int)Resources.dimension(0x7f0a0162);
            LinearLayout linearlayout = new LinearLayout(getContext());
            linearlayout.setOrientation(0);
            linearlayout.setGravity(16);
            linearlayout.setPadding(Constants.MARGIN, k, 0, k);
            Object obj = new ImageView(getContext());
            ((ImageView) (obj)).setImageResource(0x7f0201da);
            linearlayout.addView(((View) (obj)));
            obj = new TextView(getContext(), null, 0x7f0100e6);
            ((TextView) (obj)).setPadding(Constants.MARGIN_HALF, 0, Constants.MARGIN_HALF, 0);
            ((TextView) (obj)).setText(0x7f07043b);
            linearlayout.addView(((View) (obj)));
            _hours.a(linearlayout);
            IconDoubleTextCellView icondoubletextcellview;
            for (Iterator iterator = _place.getDisplayHours().iterator(); iterator.hasNext(); _hours.b(icondoubletextcellview))
            {
                com.pinterest.api.model.Place.DisplayHours displayhours = (com.pinterest.api.model.Place.DisplayHours)iterator.next();
                icondoubletextcellview = new IconDoubleTextCellView(getContext(), com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView.TextOrientation.HORIZONTAL, 0x7f0100e0, 0x7f0100e7);
                icondoubletextcellview.showImage(false);
                icondoubletextcellview.setTitle(displayhours.getDaysDisplay());
                icondoubletextcellview.setSubTitle(displayhours.getTimesDisplay());
                icondoubletextcellview.setSubTitleGravity(0x800005);
                icondoubletextcellview.setSubTitleFontStyle(0);
                icondoubletextcellview.setPadding(Constants.MARGIN + Constants.MARGIN_HALF + (int)Resources.dimension(0x7f0a019e), 0, Constants.MARGIN, Constants.MARGIN_QUARTER);
            }

        } else
        {
            _hours.setVisibility(8);
        }
        addView(_hours);
        _tips = new LinearLayout(getContext());
        _tips.setOrientation(1);
        _tips.setVisibility(8);
        addView(_tips);
        TextView textview = new TextView(getContext(), null, 0x7f0100e4);
        textview.setPadding(i, i, i, i);
        textview.setText(0x7f070441);
        addView(textview);
    }

    public int getTitleHeight()
    {
        return _title.getHeight();
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinPlaceInfoView this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PLACE_VIEW_PHONE_BUTTON, ComponentType.PLACE_VIEW, _pin.getUid());
            ActivityHelper.goIntentPlace(getContext(), _place);
        }

        _cls1()
        {
            this$0 = PinPlaceInfoView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinPlaceInfoView this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PLACE_VIEW_PHONE_BUTTON, ComponentType.PLACE_VIEW, _pin.getUid());
            ActivityHelper.goIntentView(getContext(), (new StringBuilder("tel:")).append(_place.getPhone()).toString());
        }

        _cls2()
        {
            this$0 = PinPlaceInfoView.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinPlaceInfoView this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PLACE_VIEW_SITE_BUTTON, ComponentType.PLACE_VIEW, _pin.getUid());
            Events.post(new Navigation(Location.BROWSER, _place.getUrl()));
        }

        _cls3()
        {
            this$0 = PinPlaceInfoView.this;
            super();
        }
    }

}
