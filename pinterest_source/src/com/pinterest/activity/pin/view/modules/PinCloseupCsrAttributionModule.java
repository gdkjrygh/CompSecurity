// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.widget.TextView;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupCsrAttributionModule extends PinCloseupBaseModule
{

    private TextView _attribution;

    public PinCloseupCsrAttributionModule(Context context)
    {
        super(context);
    }

    protected ComponentType getComponentType()
    {
        return null;
    }

    protected boolean hasContent()
    {
        return _pin.isCSR();
    }

    protected void init()
    {
        _padding.top = (int)Resources.dimension(0x7f0a0186);
        _padding.left = (int)Resources.dimension(0x7f0a0184);
    }

    protected void initView()
    {
        setOrientation(1);
        addView(getDividerView(), -1, Constants.HAIRLINE);
        _attribution = new TextView(getContext());
        int i = (int)Resources.dimension(0x7f0a0186);
        _attribution.setPadding(0, i, 0, i);
        addView(_attribution, -1, -2);
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        if (_pin.isCSR())
        {
            _attribution.setText(Html.fromHtml(Resources.string(0x7f0701b7)));
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }
}
