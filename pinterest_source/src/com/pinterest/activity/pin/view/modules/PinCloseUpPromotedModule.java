// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseUpPromotedModule extends PinCloseupBaseModule
{

    private View _divider;
    private Pin _pin;
    private PTextView _promotedTv;

    public PinCloseUpPromotedModule(Context context)
    {
        this(context, null);
    }

    public PinCloseUpPromotedModule(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_PROMOTED;
    }

    protected boolean hasContent()
    {
        return _pin.shouldShowPromoterInCloseup();
    }

    protected void initView()
    {
        setBackgroundResource(0x7f02028b);
        removeAllViews();
        setOrientation(1);
        int i = (int)Resources.dimension(0x7f0a0184);
        _divider = new View(getContext());
        _divider.setBackgroundColor(Colors.LIGHT_GRAY_SOLID);
        addView(_divider, -1, Constants.HAIRLINE);
        _promotedTv = new PTextView(getContext());
        _promotedTv.setTextAppearance(getContext(), 0x7f0b022d);
        _promotedTv.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f02018f), null);
        _promotedTv.setPadding(i, Constants.MARGIN_HALF, i, Constants.MARGIN_HALF);
        _promotedTv.setGravity(16);
        _promotedTv.setText(Resources.string(0x7f07046e));
        addView(_promotedTv, new android.widget.LinearLayout.LayoutParams(-1, -2));
        setOnClickListener(new _cls1());
    }

    public void setPin(Pin pin, boolean flag)
    {
        _pin = pin;
        pin = _promotedTv;
        int i;
        if (_pin.shouldShowPromoterInCloseup())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        pin.setVisibility(i);
        _divider.setVisibility(_promotedTv.getVisibility());
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseUpPromotedModule this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(PromotedPinFeedbackDialog.newInstance(_pin, true)));
        }

        _cls1()
        {
            this$0 = PinCloseUpPromotedModule.this;
            super();
        }
    }

}
