// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.feedback.PinFeedbackState;
import org.apache.commons.lang3.StringUtils;

public class PinGridFeedbackView extends LinearLayout
{

    private Navigation _destination;
    ImageView _imageVw;
    private Pin _pin;
    TextView _subtitle;
    TextView _title;

    public PinGridFeedbackView(Context context)
    {
        this(context, null);
    }

    public PinGridFeedbackView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinGridFeedbackView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static PinGridFeedbackView from(View view, ViewGroup viewgroup)
    {
        if (view instanceof PinGridFeedbackView)
        {
            return (PinGridFeedbackView)view;
        }
        if (view != null)
        {
            PLog.warn((new StringBuilder("PinGridFeedbackView v: ")).append(view).toString(), new Object[0]);
        }
        return new PinGridFeedbackView(ViewHelper.getContext(view, viewgroup));
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030125, this, true);
        ButterKnife.a(this);
        setOrientation(1);
        setBackgroundResource(0x7f02003c);
        ViewHelper.setViewPadding(this, Constants.MARGIN);
    }

    private void update()
    {
        if (_pin.getFeedbackState() == null)
        {
            return;
        } else
        {
            PinFeedbackState pinfeedbackstate = _pin.getFeedbackState();
            setBackgroundResource(pinfeedbackstate.getBackground());
            _imageVw.setImageResource(pinfeedbackstate.getImageRes());
            setTitle(pinfeedbackstate.getTitle());
            setSubtitle(pinfeedbackstate.getSubtitle());
            _destination = pinfeedbackstate.getDestination();
            return;
        }
    }

    public void setPin(Pin pin, boolean flag)
    {
        if (pin != null)
        {
            _pin = pin;
            if (!flag)
            {
                update();
                requestLayout();
                return;
            }
        }
    }

    public void setSubtitle(String s)
    {
        _subtitle.setText(s);
        TextView textview = _subtitle;
        boolean flag;
        if (!StringUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(textview, flag);
    }

    public void setTitle(String s)
    {
        _title.setText(s);
    }

    void subtitleClicked()
    {
        if (_destination == null)
        {
            return;
        } else
        {
            Events.post(_destination);
            return;
        }
    }
}
