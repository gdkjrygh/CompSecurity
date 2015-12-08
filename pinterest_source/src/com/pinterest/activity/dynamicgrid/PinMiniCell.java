// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.ProportionalImageView;
import org.apache.commons.lang3.StringUtils;

public class PinMiniCell extends FrameLayout
{

    private static final int CORNER_RADIUS = (int)Resources.dimension(0x7f0a00f5);
    protected TextView _descTv;
    protected ProportionalImageView _icon;
    protected GrayWebImageView _image;
    protected MODE _mode;
    private Pin _pin;
    protected TextView _priceTv;
    private DynamicStory _story;
    protected TextView _subtitle;
    protected TextView _title;

    public PinMiniCell(Context context)
    {
        this(context, null);
    }

    public PinMiniCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinMiniCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _mode = MODE.DYNAMIC_GRID;
        init();
    }

    public static PinMiniCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof PinMiniCell)
        {
            return (PinMiniCell)view;
        } else
        {
            return new PinMiniCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void updateUi()
    {
        String s2 = null;
        String s = _pin.getDominantColor();
        if (StringUtils.isNotEmpty(s))
        {
            _image.setBackgroundColor(Color.parseColor(s));
        }
        _image.setCornerRadius(CORNER_RADIUS);
        _image.setImageListener(new _cls1());
        _image.loadUrl(_pin.getImageMediumUrl());
        Pin pin = _pin;
        String s1;
        if (BuyableProductHelper.isPinBuyable(pin))
        {
            s = BuyableProductHelper.getPriceDisplay(_pin.getBuyableProduct());
            _priceTv.setText(s);
            ViewHelper.setVisibility(_priceTv, StringUtils.isNotEmpty(s));
            s1 = _pin.getBuyableProduct().getTitle();
            s = pin.getBuyableProduct().getMerchantName();
        } else
        if (pin.hasPlaceGridData())
        {
            s1 = _pin.getPlace().getName();
            s = pin.getPlace().getSourceName();
            s2 = _pin.getPlace().getSourceIcon();
        } else
        if (pin.hasRichPinGridData())
        {
            s1 = _pin.getRichTitle();
            s = pin.getRichSiteName();
            s2 = _pin.getRichIcon();
        } else
        {
            s = null;
            s1 = null;
        }
        ViewHelper.setVisibility(_title, StringUtils.isNotEmpty(s1));
        if (StringUtils.isEmpty(s1))
        {
            s1 = _pin.getDescription();
            ViewHelper.setVisibility(_descTv, StringUtils.isNotEmpty(s1));
            if (StringUtils.isNotEmpty(s1))
            {
                _descTv.setText(s1);
            }
        } else
        {
            ViewHelper.setVisibility(_descTv, false);
            _title.setText(s1);
        }
        _icon.loadUrl(s2);
        ViewHelper.setVisibility(_icon, StringUtils.isNotEmpty(s2));
        s1 = s;
        if (s == null)
        {
            if (StringUtils.isNotEmpty(_pin.getDomain()))
            {
                s1 = pin.getDomain();
            } else
            {
                s1 = Resources.string(0x7f070340);
            }
        }
        _subtitle.setText(s1);
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301f2, this, true);
        ButterKnife.a(this);
    }

    void onImageClicked(View view)
    {
        EventType eventtype = EventType.TAP;
        ElementType elementtype = ElementType.STORY_FEATURED_ITEM;
        ComponentType componenttype = ComponentType.DYNAMIC_GRID_STORY;
        String s = _pin.getUid();
        if (_mode == MODE.DYNAMIC_GRID)
        {
            view = _story.getAuxData();
        } else
        {
            view = null;
        }
        Pinalytics.a(eventtype, elementtype, componenttype, s, view, null);
        Events.post(new Navigation(Location.PIN, _pin));
    }

    public void setMode(MODE mode)
    {
        _mode = mode;
    }

    public void setPin(Pin pin, boolean flag)
    {
        if (pin == null)
        {
            return;
        } else
        {
            _pin = pin;
            updateUi();
            return;
        }
    }

    public void setStory(DynamicStory dynamicstory)
    {
        _story = dynamicstory;
    }


    private class MODE extends Enum
    {

        private static final MODE $VALUES[];
        public static final MODE DYNAMIC_GRID;
        public static final MODE SEARCH;

        public static MODE valueOf(String s)
        {
            return (MODE)Enum.valueOf(com/pinterest/activity/dynamicgrid/PinMiniCell$MODE, s);
        }

        public static MODE[] values()
        {
            return (MODE[])$VALUES.clone();
        }

        static 
        {
            SEARCH = new MODE("SEARCH", 0);
            DYNAMIC_GRID = new MODE("DYNAMIC_GRID", 1);
            $VALUES = (new MODE[] {
                SEARCH, DYNAMIC_GRID
            });
        }

        private MODE(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final PinMiniCell this$0;

        public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            _image.setBackgroundColor(0);
            super.onBitmapLoaded(bitmap, loadedfrom);
        }

        _cls1()
        {
            this$0 = PinMiniCell.this;
            super();
        }
    }

}
