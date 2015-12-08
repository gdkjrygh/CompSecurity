// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.pin.view.modules.util.VerifiedDomainUtil;
import com.pinterest.activity.user.view.FollowUserButton;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupFollowModule extends PinCloseupBaseModule
{

    FollowUserButton _followButton;
    TextView _textView;

    public PinCloseupFollowModule(Context context)
    {
        super(context);
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_FOLLOW;
    }

    protected boolean hasContent()
    {
        return VerifiedDomainUtil.shouldShowFollowModule(_pin);
    }

    protected void initView()
    {
        super.initView();
        removeAllViews();
        setOrientation(1);
        _padding.top = (int)Resources.dimension(0x7f0a017d);
        int i = (int)Resources.dimension(0x7f0a0184);
        _margin.left = i;
        _margin.right = i;
        Object obj = new ImageView(getContext());
        ((ImageView) (obj)).setImageResource(0x7f020146);
        ((ImageView) (obj)).setPadding((int)Resources.dimension(0x7f0a017b), 0, 0, 0);
        addView(((View) (obj)), new android.widget.LinearLayout.LayoutParams(-2, -2));
        i = (int)Resources.dimension(0x7f0a0186);
        obj = new LinearLayout(getContext());
        ((LinearLayout) (obj)).setOrientation(0);
        ((LinearLayout) (obj)).setGravity(16);
        ((LinearLayout) (obj)).setBackgroundResource(0x7f020147);
        ((LinearLayout) (obj)).setPadding(i, i, i, i);
        _textView = new TextView(getContext(), null, 0x7f0100e1);
        ((LinearLayout) (obj)).addView(_textView, new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F));
        _followButton = new FollowUserButton(getContext(), null, 0x7f0100de);
        _followButton.setTypeface(null, 1);
        _followButton.setOnClickListener(new _cls1());
        ((LinearLayout) (obj)).addView(_followButton, new android.widget.LinearLayout.LayoutParams(-2, -2, 0.0F));
        addView(((View) (obj)), -1, -2);
        setVisibility(8);
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        super.updateView();
        if (VerifiedDomainUtil.shouldShowFollowModule(_pin))
        {
            _followButton.setUser(VerifiedDomainUtil.getOfficialUser(_pin));
            String s = VerifiedDomainUtil.getOfficialUserFullName(_pin);
            _textView.setText(Html.fromHtml(Resources.string(0x7f0702b0, new Object[] {
                s
            })));
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseupFollowModule this$0;

        public void onClick(View view)
        {
            _followButton.onClick(view);
            Pinalytics.a(EventType.TAP, ElementType.USER_FOLLOW, ComponentType.PIN_CLOSEUP_FOLLOW, null);
        }

        _cls1()
        {
            this$0 = PinCloseupFollowModule.this;
            super();
        }
    }

}
