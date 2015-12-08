// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupStatsModule extends PinCloseupBaseModule
    implements android.view.View.OnClickListener
{

    private PTextView _commentCountTv;
    private PTextView _likeCountTv;
    private PTextView _repinCountTv;

    public PinCloseupStatsModule(Context context)
    {
        super(context);
    }

    private void setCountViewText(TextView textview, int i)
    {
        textview.setText(String.valueOf(i));
        if (i > 0)
        {
            textview.setEnabled(true);
            return;
        } else
        {
            textview.setEnabled(false);
            return;
        }
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_STATS;
    }

    protected boolean hasContent()
    {
        return true;
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        setOrientation(0);
        int i = (int)Resources.dimension(0x7f0a0184);
        _commentCountTv = new PTextView(getContext(), null, 0x7f0100da);
        _commentCountTv.setOnClickListener(this);
        _commentCountTv.setPadding(i, Constants.MARGIN, Constants.MARGIN, Constants.MARGIN);
        _commentCountTv.setBackgroundResource(0x7f020283);
        _commentCountTv.setGravity(16);
        addView(_commentCountTv, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F));
        _repinCountTv = new PTextView(getContext(), null, 0x7f0100da);
        _repinCountTv.setCompoundDrawablesWithIntrinsicBounds(Resources.drawable(0x7f0201e9), null, null, null);
        _repinCountTv.setCompoundDrawablePadding(Constants.MARGIN_HALF);
        _repinCountTv.setOnClickListener(this);
        _repinCountTv.setPadding(Constants.MARGIN_HALF, Constants.MARGIN, Constants.MARGIN_HALF, Constants.MARGIN);
        _repinCountTv.setGravity(16);
        _repinCountTv.setBackgroundResource(0x7f020283);
        addView(_repinCountTv, -2, -2);
        _likeCountTv = new PTextView(getContext(), null, 0x7f0100da);
        _likeCountTv.setCompoundDrawablesWithIntrinsicBounds(Resources.drawable(0x7f0201c2), null, null, null);
        _likeCountTv.setCompoundDrawablePadding(Constants.MARGIN_HALF);
        _likeCountTv.setOnClickListener(this);
        _likeCountTv.setPadding(Constants.MARGIN_HALF, Constants.MARGIN, i, Constants.MARGIN);
        _likeCountTv.setGravity(16);
        _likeCountTv.setBackgroundResource(0x7f020283);
        addView(_likeCountTv, -2, -2);
    }

    public void onClick(View view)
    {
        ElementType elementtype = null;
        if (view == _commentCountTv)
        {
            elementtype = ElementType.PIN_COMMENT_BUTTON;
            view = Location.PIN_COMMENTS;
        } else
        if (view == _repinCountTv)
        {
            elementtype = ElementType.REPINS_BUTTON;
            view = Location.PIN_REPINS;
        } else
        if (view == _likeCountTv)
        {
            elementtype = ElementType.LIKES_BUTTON;
            view = Location.PIN_LIKES;
        } else
        {
            Object obj = null;
            view = elementtype;
            elementtype = obj;
        }
        Pinalytics.a(elementtype, ComponentType.MODAL_PIN, _pin.getUid());
        Events.post(new Navigation(view, _pin));
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        if (_pin.isCSR())
        {
            setVisibility(8);
            return;
        }
        int i = _pin.getCommentCountDisplay();
        int j = _pin.getRepinCountDisplay();
        int k = _pin.getLikeCountDisplay();
        if (i <= 0)
        {
            _commentCountTv.setText(0x7f0703fd);
        } else
        {
            _commentCountTv.setText(Resources.stringPlural(0x7f090003, Integer.valueOf(i)));
        }
        setCountViewText(_repinCountTv, j);
        setCountViewText(_likeCountTv, k);
    }
}
