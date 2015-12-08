// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.text.IconView;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.menu:
//            SpringLinearLayout

public class ContextMenuItemView extends SpringLinearLayout
{

    private static final float IMAGE_FRICTION = 0.37F;
    private static final float IMAGE_TENSION = 0.055F;
    private static final float TOOLTIP_BOTTOM_PADDING = Resources.dimension(0x7f0a00c1);
    private static final float TOOLTIP_FRICTION = 0.75F;
    private static final float TOOLTIP_TENSION = 0.25F;
    private Drawable _bgOff;
    private Drawable _bgOn;
    private int _imageResourceId;
    private IconView _imageView;
    private boolean _isCurrentlySelected;
    private int _toolTipResId;
    private boolean _tooltipAlwaysVisible;
    private TextView _tooltipView;

    public ContextMenuItemView(Context context)
    {
        this(context, null);
    }

    public ContextMenuItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _bgOn = DrawableUtils.tintIcon(0x7f020120, 0x7f0e009c);
        _bgOff = DrawableUtils.tintIcon(0x7f020120, 0x7f0e000a);
    }

    private float getImageViewX(float f)
    {
        return f - (float)(_imageView.getMeasuredWidth() / 2);
    }

    private float getImageViewY(float f)
    {
        return f - (float)(_imageView.getMeasuredHeight() / 2) - _imageView.getY();
    }

    private void updateView()
    {
        if (!_tooltipAlwaysVisible)
        {
            if (_isCurrentlySelected)
            {
                _tooltipView.setScaleX(1.0F);
                _tooltipView.setScaleY(1.0F);
            } else
            {
                _tooltipView.setVisibility(4);
                _tooltipView.setScaleX(0.0F);
                _tooltipView.setScaleY(0.0F);
            }
        }
        updateViewTints(_isCurrentlySelected);
    }

    private void updateViewTints(boolean flag)
    {
        if (!isOriginItem())
        {
            Object obj = _imageView;
            IconView iconview;
            int i;
            if (flag)
            {
                i = 0x7f0e00bf;
            } else
            {
                i = 0x7f0e0070;
            }
            ((IconView) (obj)).setTint(i);
            iconview = _imageView;
            if (flag)
            {
                obj = _bgOn;
            } else
            {
                obj = _bgOff;
            }
            iconview.setBackgroundDrawable(((Drawable) (obj)));
        }
    }

    public void centerAround(float f, float f1)
    {
        setX(getImageViewX(f));
        setY(getImageViewY(f1));
    }

    public int getToolTipTextResId()
    {
        return _toolTipResId;
    }

    public boolean isOriginItem()
    {
        return StringUtils.isEmpty(_tooltipView.getText().toString());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        _imageView = (IconView)findViewById(0x7f0f004b);
        _imageView.setTint(0x7f0e00bf);
        _tooltipView = (TextView)findViewById(0x7f0f0118);
        _tooltipView.setVisibility(4);
        updateView();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!isOriginItem())
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)_tooltipView.getLayoutParams();
            i = (int)((float)(int)(((float)_imageView.getMeasuredWidth() * _imageView.getScaleX() - (float)_tooltipView.getMeasuredWidth()) / 2.0F) + _imageView.getTranslationX());
            layoutparams.setMargins(i, 0, i, 0);
            ((android.widget.LinearLayout.LayoutParams)_imageView.getLayoutParams()).setMargins(0, (int)(-1F * _imageView.getTranslationY() + TOOLTIP_BOTTOM_PADDING), 0, 0);
            _tooltipView.setPivotX(_tooltipView.getMeasuredWidth() / 2);
            _tooltipView.setPivotY(_tooltipView.getMeasuredHeight());
        }
    }

    public void scaleAndFadeToolTip(float f, float f1)
    {
        setProperty(0, 3, f, f1, 0.75F, 0.25F, null);
        setProperty(0, 2, f, f1, 0.75F, 0.25F, null);
    }

    public void setImage(int i)
    {
        _imageResourceId = i;
        _imageView.setImageResource(_imageResourceId);
        updateView();
    }

    public void setStateSelected(boolean flag)
    {
        if (_isCurrentlySelected != flag && _tooltipView.getText() != null)
        {
            _isCurrentlySelected = flag;
            if (!_tooltipAlwaysVisible)
            {
                if (flag)
                {
                    scaleAndFadeToolTip(0.0F, 1.0F);
                } else
                {
                    scaleAndFadeToolTip(1.0F, 0.0F);
                }
            }
            updateViewTints(flag);
        }
    }

    public void setToolTip(int i)
    {
        _toolTipResId = i;
        _tooltipView.setText(i);
        updateView();
    }

    public void setToolTipAlwaysVisible(boolean flag)
    {
        _tooltipAlwaysVisible = flag;
        if (_tooltipAlwaysVisible)
        {
            _tooltipView.setVisibility(0);
            _tooltipView.setScaleX(1.0F);
            _tooltipView.setScaleY(1.0F);
            return;
        } else
        {
            updateView();
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("ContextMenuItemView{toolTip=")).append(_tooltipView.getText()).append('}').toString();
    }

    public void translateAndScaleImage(float f, float f1, float f2)
    {
        translateAndScaleImage(f, f1, f2, null);
    }

    public void translateAndScaleImage(float f, float f1, float f2, SpringLinearLayout.AnimListener animlistener)
    {
        f = getImageViewX(f) - getX();
        f1 = getImageViewY(f1) - getY();
        setProperty(0, 0, 0.0F, f, 0.37F, 0.055F, null);
        setProperty(0, 1, 0.0F, f1, 0.37F, 0.055F, null);
        setProperty(1, 0, 0.0F, f, 0.37F, 0.055F, animlistener);
        setProperty(1, 1, 0.0F, f1, 0.37F, 0.055F, null);
        setProperty(1, 2, 0.0F, f2, 0.37F, 0.055F, null);
    }

}
