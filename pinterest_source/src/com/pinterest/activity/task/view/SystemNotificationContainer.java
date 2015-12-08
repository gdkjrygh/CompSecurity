// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.networking.events.ConnectivityChanged;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.BooleanUtils;

public class SystemNotificationContainer extends FrameLayout
    implements android.view.View.OnClickListener
{

    public static final int HEIGHT = (int)Resources.dimension(0x7f0a0059);
    private static boolean _isVisible;
    private PTextView _displayTv;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;

    public SystemNotificationContainer(Context context)
    {
        this(context, null);
    }

    public SystemNotificationContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _eventsSubscriber = new _cls2();
        init(context);
    }

    private void animateContainer(int i, int j, int k)
    {
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setFloatValues(new float[] {
            (float)i, (float)j
        });
        valueanimator.addUpdateListener(new _cls1());
        valueanimator.setDuration(k);
        valueanimator.start();
    }

    private void hide(boolean flag)
    {
        _isVisible = false;
        int i = _displayTv.getLayoutParams().height;
        char c;
        if (flag)
        {
            c = '\372';
        } else
        {
            c = '\0';
        }
        animateContainer(i, 0, c);
    }

    private void init(Context context)
    {
        _displayTv = new PTextView(context);
        _displayTv.setGravity(16);
        _displayTv.setBackgroundResource(0x7f020284);
        _displayTv.setTextColor(Colors.WHITE);
        _displayTv.setTextSize(0, Resources.dimension(0x7f0a01d8));
        _displayTv.setIconTint(Colors.WHITE);
        _displayTv.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        _displayTv.setMarqueeRepeatLimit(-1);
        _displayTv.setHorizontalFadingEdgeEnabled(true);
        _displayTv.setSingleLine(true);
        _displayTv.setMaxLines(1);
        _displayTv.setSelected(true);
        _displayTv.setPadding(Constants.MARGIN, Constants.MARGIN_HALF, Constants.MARGIN, Constants.MARGIN_HALF);
        addView(_displayTv, -1, 0);
        setBackgroundColor(Colors.BLACK);
        setMessage(0x7f070176, true);
    }

    public static boolean isVisible()
    {
        return _isVisible;
    }

    private void setMessage(int i, boolean flag)
    {
        _displayTv.setText(Html.fromHtml(Resources.string(i)));
        if (flag)
        {
            _displayTv.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f0201a2, 0);
            _displayTv.setOnClickListener(this);
            return;
        } else
        {
            _displayTv.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            _displayTv.setOnClickListener(null);
            return;
        }
    }

    private void show(boolean flag)
    {
        _isVisible = true;
        int i = _displayTv.getLayoutParams().height;
        int j = HEIGHT;
        char c;
        if (flag)
        {
            c = '\u014A';
        } else
        {
            c = '\0';
        }
        animateContainer(i, j, c);
    }

    private void updateDisplay(Boolean boolean1, boolean flag)
    {
        if (!Experiments.v())
        {
            hide(false);
        } else
        if (boolean1 != null)
        {
            if (BooleanUtils.isTrue(boolean1))
            {
                hide(flag);
                return;
            }
            if (BooleanUtils.isFalse(boolean1))
            {
                show(flag);
                return;
            }
        } else
        if (NetworkUtils.getInstance().hasInternet())
        {
            hide(flag);
            return;
        } else
        {
            show(flag);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        updateDisplay(null, false);
        Events.register(_eventsSubscriber, com/pinterest/activity/task/model/Navigation, new Class[] {
            com/pinterest/networking/events/ConnectivityChanged
        });
    }

    public void onClick(View view)
    {
        if (view == _displayTv)
        {
            Events.post(new Navigation(Location.USER, MyUser.get()));
        }
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }





    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final SystemNotificationContainer this$0;

        public void onEventMainThread(Navigation navigation)
        {
            if (navigation.getLocation() == Location.USER && MyUser.isUserMe(navigation.getId()))
            {
                setMessage(0x7f070175, false);
                return;
            } else
            {
                setMessage(0x7f070176, true);
                return;
            }
        }

        public void onEventMainThread(ConnectivityChanged connectivitychanged)
        {
            updateDisplay(Boolean.valueOf(connectivitychanged.a()), true);
        }

        _cls2()
        {
            this$0 = SystemNotificationContainer.this;
            super();
        }
    }


    private class _cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final SystemNotificationContainer this$0;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            _displayTv.getLayoutParams().height = ((Float)valueanimator.getAnimatedValue()).intValue();
            _displayTv.requestLayout();
        }

        _cls1()
        {
            this$0 = SystemNotificationContainer.this;
            super();
        }
    }

}
