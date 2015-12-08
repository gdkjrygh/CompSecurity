// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.PinCloseupView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinMetadata;
import com.pinterest.api.model.Place;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;

public abstract class PinCloseupBaseModule extends LinearLayout
{

    protected String _apiTag;
    protected boolean _detailsLoaded;
    protected Rect _margin;
    protected Rect _padding;
    protected Pin _pin;
    protected PinMetadata _pinMetadata;
    protected Place _pinPlace;
    protected String _pinUid;
    protected boolean _sentViewEvent;
    protected int _viewLocation[];

    public PinCloseupBaseModule(Context context)
    {
        this(context, null);
    }

    public PinCloseupBaseModule(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinCloseupBaseModule(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _padding = new Rect();
        _margin = new Rect();
        init();
        initView();
        _viewLocation = new int[2];
        _sentViewEvent = false;
    }

    private void updateViewInternal()
    {
        setPadding(_padding.left, _padding.top, _padding.right, _padding.bottom);
        ((android.widget.LinearLayout.LayoutParams)getLayoutParams()).setMargins(_margin.left, _margin.top, _margin.right, _margin.bottom);
    }

    public void beginView()
    {
        if (_sentViewEvent || _pin == null)
        {
            return;
        } else
        {
            HashMap hashmap = getCardViewAuxData();
            Pinalytics.a(EventType.PIN_CARD_VIEW, null, getComponentType(), null, hashmap, null);
            _sentViewEvent = true;
            return;
        }
    }

    public void checkForBeginView(int i)
    {
        while (_sentViewEvent || !hasContent() || !isOnScreen(i)) 
        {
            return;
        }
        beginView();
    }

    public void endView()
    {
        _sentViewEvent = false;
    }

    protected HashMap getCardViewAuxData()
    {
        return null;
    }

    protected abstract ComponentType getComponentType();

    protected View getDividerView()
    {
        View view = new View(getContext());
        view.setBackgroundColor(Resources.color(0x7f0e008d));
        return view;
    }

    protected FragmentManager getFragmentManager()
    {
        android.view.ViewParent viewparent = getParent();
        if (viewparent instanceof PinCloseupView)
        {
            return ((PinCloseupView)viewparent).getFragmentManager();
        } else
        {
            return null;
        }
    }

    protected abstract boolean hasContent();

    protected void init()
    {
    }

    protected void initView()
    {
    }

    protected boolean isOnScreen(int i)
    {
        getLocationOnScreen(_viewLocation);
        int j = _viewLocation[1];
        int k = getMeasuredHeight() + j;
        i = (int)Device.getScreenHeight() - i;
        return j >= 0 && j <= i || k >= 0 && k <= i || j <= 0 && k >= i;
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setPin(Pin pin, boolean flag)
    {
        _pin = pin;
        if (_pin != null)
        {
            _detailsLoaded = flag;
            _pinUid = _pin.getUid();
            _pinMetadata = _pin.getMetadata();
            _pinPlace = _pin.getPlace();
            if (shouldUpdateView())
            {
                updateViewInternal();
                updateView();
                return;
            }
        }
    }

    protected abstract boolean shouldUpdateView();

    protected void updateView()
    {
    }
}
