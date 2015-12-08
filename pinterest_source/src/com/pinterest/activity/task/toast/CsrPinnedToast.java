// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.view.BaseToastView;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentData;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ToastType;
import com.pinterest.ui.imageview.WebImageView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class CsrPinnedToast extends BaseToast
{

    private static final int DOMAIN_IMAGE_SPACING_TOTAL;
    private static final int TOAST_MARGINS;
    List _domainPins;
    private Pin _pin;

    public CsrPinnedToast(Pin pin, List list)
    {
        _pin = pin;
        _domainPins = list;
    }

    public View getView(final ToastContainer container)
    {
        final BaseToastView toastView = _pin.getBoard();
        if (toastView != null)
        {
            setMessage(0x7f0704c3);
            setSecondaryMessage(toastView.getName());
        }
        setLayoutGravity(81);
        setArrowVis(false);
        toastView = (BaseToastView)super.getView(container);
        toastView.extendedView.setOrientation(1);
        Object obj = new TextView(container.getContext());
        ((TextView) (obj)).setTextAppearance(container.getContext(), 0x7f0b0223);
        ((TextView) (obj)).setTextColor(-1);
        ((TextView) (obj)).setText(Html.fromHtml(String.format(Resources.string(0x7f0701bb), new Object[] {
            _pin.getDomain()
        })));
        ((TextView) (obj)).setPadding(Constants.MARGIN, 0, Constants.MARGIN, Constants.MARGIN);
        toastView.extendedView.addView(((View) (obj)), -1, -2);
        obj = new LinearLayout(container.getContext());
        ((LinearLayout) (obj)).setOrientation(0);
        ((LinearLayout) (obj)).setPadding(Constants.MARGIN, 0, Constants.MARGIN, Constants.MARGIN);
        ((LinearLayout) (obj)).setGravity(1);
        int i;
        if (Device.isTablet())
        {
            i = (int)Resources.dimension(0x7f0a01f0);
        } else
        {
            i = (int)Device.getScreenWidth() - TOAST_MARGINS;
        }
        i = (int)((float)(i - DOMAIN_IMAGE_SPACING_TOTAL) / 4F);
        WebImageView webimageview;
        Object obj1;
        for (Iterator iterator = _domainPins.iterator(); iterator.hasNext(); ((LinearLayout) (obj)).addView(webimageview, ((android.view.ViewGroup.LayoutParams) (obj1))))
        {
            obj1 = (Pin)iterator.next();
            webimageview = new WebImageView(container.getContext());
            webimageview.setCornerRadius(Constants.CORNER_RADIUS);
            webimageview.loadUrl(((Pin) (obj1)).getImageSquareUrl());
            obj1 = new android.widget.LinearLayout.LayoutParams(i, i);
            if (((LinearLayout) (obj)).getChildCount() > 0)
            {
                ((android.widget.LinearLayout.LayoutParams) (obj1)).setMargins(Constants.MARGIN, 0, 0, 0);
            }
        }

        toastView.extendedView.addView(((View) (obj)), -1, -2);
        toastView.extendedView.setOnClickListener(new _cls1());
        return toastView;
    }

    public void onToastClicked(Context context)
    {
        super.onToastClicked(context);
        Pinalytics.a(ComponentType.TOAST, (new ComponentData()).setToastType(ToastType.CSR));
        context = _pin.getBoard();
        if (context != null)
        {
            Events.post(new Navigation(Location.BOARD, context.getUid()));
        }
    }

    static 
    {
        TOAST_MARGINS = Constants.MARGIN * 2;
        DOMAIN_IMAGE_SPACING_TOTAL = Constants.MARGIN * 5;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CsrPinnedToast this$0;
        final ToastContainer val$container;
        final BaseToastView val$toastView;

        public void onClick(View view)
        {
            container.dismiss(toastView);
            Pinalytics.a(ComponentType.TOAST, (new ComponentData()).setToastType(ToastType.CSR));
            view = new Navigation(Location.CSR_PICKER);
            view.putExtra("com.pinterest.EXTRA_DOMAIN", _pin.getDomain());
            Events.post(view);
        }

        _cls1()
        {
            this$0 = CsrPinnedToast.this;
            container = toastcontainer;
            toastView = basetoastview;
            super();
        }
    }

}
