// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Device;
import com.pinterest.kit.anim.SlideUpDownAnimation;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.AnimationUtils;
import org.apache.commons.lang3.StringUtils;

public class MegaphoneView extends FrameLayout
{

    private static final int HORIZONTAL_PADDING = (int)Resources.dimension(0x7f0a0168);
    private static final int MAX_WIDTH = (int)Resources.dimension(0x7f0a0169);
    private static final int VERTICAL_PADDING = (int)Resources.dimension(0x7f0a016a);
    private ImageView _bgIv;
    private ViewGroup _content;
    protected Context _context;
    private TextView _descTv;
    private boolean _dismissable;
    private View _divider;
    private boolean _isShown;
    private boolean _isViewed;
    private Button _negativeBtn;
    private ListView _parentLv;
    private Button _positiveBtn;
    private TextView _titleTv;

    public MegaphoneView(Context context)
    {
        this(context, null, 0);
    }

    public MegaphoneView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MegaphoneView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _dismissable = true;
        _context = context;
    }

    private void slideUpAnimate()
    {
        int i = -(getMeasuredHeight() + (int)getY() + VERTICAL_PADDING);
        AnimationUtils.springAnimate(_content, "translationY", _content.getTranslationY(), i, 0.65F, 0.32F).start();
        SlideUpDownAnimation slideupdownanimation = new SlideUpDownAnimation(this, false, getMeasuredHeight());
        slideupdownanimation.setDuration(200L);
        slideupdownanimation.setAnimationListener(new _cls3());
        startAnimation(slideupdownanimation);
    }

    public void hide()
    {
        _isShown = false;
        slideUpAnimate();
    }

    public void hideAndUpdate(boolean flag)
    {
        _isShown = false;
        if (!flag)
        {
            hide();
        }
    }

    public boolean isShown()
    {
        return super.isShown() && _isShown;
    }

    public boolean isViewed()
    {
        return _isViewed;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        measure(-1, -2);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        _content = (ViewGroup)findViewById(0x7f0f03a5);
        _bgIv = (ImageView)findViewById(0x7f0f03a4);
        _titleTv = (TextView)findViewById(0x7f0f03a6);
        _descTv = (TextView)findViewById(0x7f0f03a7);
        _positiveBtn = (Button)findViewById(0x7f0f03aa);
        _negativeBtn = (Button)findViewById(0x7f0f03a9);
        _divider = findViewById(0x7f0f03a8);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (getLayoutParams() == null)
        {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutparams = _content.getLayoutParams();
        i = (int)Device.getScreenWidth();
        layoutparams.width = Math.min(MAX_WIDTH, i - HORIZONTAL_PADDING * 2);
        _content.setLayoutParams(layoutparams);
        layoutparams = getLayoutParams();
        if (_bgIv.getDrawable() == null)
        {
            if (layoutparams instanceof android.widget.LinearLayout.LayoutParams)
            {
                ((android.widget.LinearLayout.LayoutParams)layoutparams).topMargin = HORIZONTAL_PADDING;
                setLayoutParams(layoutparams);
                return;
            } else
            {
                setPadding(0, HORIZONTAL_PADDING, 0, HORIZONTAL_PADDING);
                return;
            }
        } else
        {
            android.view.ViewGroup.LayoutParams layoutparams1 = _bgIv.getLayoutParams();
            layoutparams1.width = i;
            layoutparams1.height = _content.getMeasuredHeight() + VERTICAL_PADDING * 2;
            _bgIv.setLayoutParams(layoutparams1);
            layoutparams.width = layoutparams1.width;
            layoutparams.height = layoutparams1.height;
            setLayoutParams(layoutparams);
            return;
        }
    }

    public void setDesc(String s)
    {
        _descTv.setText(s);
    }

    public void setDismissable(boolean flag)
    {
        _dismissable = flag;
    }

    public void setListViewParent(ListView listview)
    {
        _parentLv = listview;
    }

    public void setNegativeButton(String s, final android.view.View.OnClickListener onClick)
    {
        if (StringUtils.isNotEmpty(s))
        {
            _negativeBtn.setVisibility(0);
            _negativeBtn.setText(s);
            _negativeBtn.setOnClickListener(new _cls1());
            return;
        } else
        {
            _negativeBtn.setVisibility(8);
            return;
        }
    }

    public void setPositiveButton(String s, android.view.View.OnClickListener onclicklistener)
    {
        _positiveBtn.setText(s);
        _positiveBtn.setOnClickListener(onclicklistener);
    }

    public void setTitle(String s)
    {
        _titleTv.setText(s);
    }

    public void setViewed(String s)
    {
        _isViewed = true;
        AnalyticsApi.b((new StringBuilder("NAG_")).append(s).toString());
    }

    public void show()
    {
        boolean flag = true;
        _isShown = true;
        int i;
        if (_negativeBtn.getVisibility() != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        _titleTv.setGravity(i);
        _descTv.setGravity(i);
        setTranslationY(0.0F);
        measure(-1, -2);
        if (_parentLv != null)
        {
            _parentLv.removeHeaderView(this);
            _parentLv.addHeaderView(this);
        }
        post(new _cls2());
    }





    private class _cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final MegaphoneView this$0;

        public void onAnimationEnd(Animation animation)
        {
            setVisibility(8);
            if (_parentLv != null)
            {
                _parentLv.removeHeaderView(MegaphoneView.this);
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls3()
        {
            this$0 = MegaphoneView.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final MegaphoneView this$0;
        final android.view.View.OnClickListener val$onClick;

        public void onClick(View view)
        {
            if (onClick != null)
            {
                onClick.onClick(view);
            }
            if (_dismissable)
            {
                slideUpAnimate();
            }
        }

        _cls1()
        {
            this$0 = MegaphoneView.this;
            onClick = onclicklistener;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final MegaphoneView this$0;

        public void run()
        {
            if (getParent() != null)
            {
                setVisibility(0);
            }
        }

        _cls2()
        {
            this$0 = MegaphoneView.this;
            super();
        }
    }

}
