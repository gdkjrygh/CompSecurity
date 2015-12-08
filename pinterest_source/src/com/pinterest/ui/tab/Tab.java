// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.tab;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.base.Colors;
import com.pinterest.kit.utils.DrawableUtils;

public class Tab extends LinearLayout
    implements Checkable
{

    public static final int POP_ICON_DURATION = 100;
    public static final float POP_ICON_SCALE_DOWN = 0.9F;
    public static final float POP_ICON_SCALE_UP = 1.02F;
    public static final int STATE_ALL = 2;
    public static final int STATE_OFF = 0;
    public static final int STATE_ON = 1;
    private boolean _checked;
    private Drawable _drawableOff;
    private Drawable _drawableOn;
    private int _iconOffColor;
    private int _iconOnColor;
    private boolean _iconPop;
    protected ImageView _iv;
    private int _orientation;
    private String _text;
    private int _textOffColor;
    private int _textOnColor;
    private float _textSize;
    protected TextView _tv;

    public Tab(Context context)
    {
        this(context, null);
    }

    public Tab(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public Tab(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context, attributeset);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        int i;
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, com.pinterest.R.styleable.Tab);
            _drawableOn = context.getDrawable(1);
            _drawableOff = context.getDrawable(2);
            _iconOnColor = context.getColor(7, 0);
            _iconOffColor = context.getColor(8, 0);
            if (_iconOnColor != 0)
            {
                _drawableOn = DrawableUtils.tintIcon(_drawableOn, _iconOnColor);
            }
            if (_iconOffColor != 0)
            {
                _drawableOff = DrawableUtils.tintIcon(_drawableOff, _iconOffColor);
            }
            _text = context.getString(3);
            _textSize = context.getDimension(4, getResources().getDimension(0x7f0a01d8));
            _textOnColor = context.getColor(5, Colors.RED);
            _textOffColor = context.getColor(6, Colors.TEXT_DARK);
            _orientation = context.getInt(0, 0);
            _iconPop = context.getBoolean(9, false);
            context.recycle();
        } else
        {
            _textOnColor = Colors.RED;
            _textOffColor = Colors.TEXT_DARK;
        }
        if (_orientation == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setOrientation(i);
        setGravity(17);
        context = new android.widget.LinearLayout.LayoutParams(-2, -1);
        if (_orientation == 1)
        {
            setGravity(1);
            context.height = -2;
            context.topMargin = getResources().getDimensionPixelOffset(0x7f0a0162);
            context.bottomMargin = getResources().getDimensionPixelOffset(0x7f0a0162);
        }
        _iv = new ImageView(getContext());
        _iv.setLayoutParams(context);
        addView(_iv);
        context = new android.widget.LinearLayout.LayoutParams(-2, -1);
        if (_orientation == 1)
        {
            context.height = -2;
        }
        _tv = new TextView(getContext());
        _tv.setLayoutParams(context);
        _tv.setTextSize(0, _textSize);
        _tv.setMaxLines(1);
        _tv.setEllipsize(android.text.TextUtils.TruncateAt.END);
        _tv.setGravity(16);
        setTextColor(_textOffColor);
        _tv.setTypeface(null, 1);
        addView(_tv);
        if (_drawableOff == null)
        {
            context = _drawableOn;
        } else
        {
            context = _drawableOff;
        }
        setIcon(context);
        setIconPop();
        setText(_text);
    }

    public ImageView getImageView()
    {
        return _iv;
    }

    public String getText()
    {
        return _tv.getText().toString();
    }

    public boolean isChecked()
    {
        return _checked;
    }

    public void setChecked(boolean flag)
    {
        _checked = flag;
        int i;
        if (_drawableOn == null)
        {
            setIcon(_drawableOff);
        } else
        if (_drawableOff == null)
        {
            setIcon(_drawableOn);
        } else
        {
            Drawable drawable;
            if (_checked)
            {
                drawable = _drawableOn;
            } else
            {
                drawable = _drawableOff;
            }
            setIcon(drawable);
            setIconPop();
        }
        if (_checked)
        {
            i = _textOnColor;
        } else
        {
            i = _textOffColor;
        }
        setTextColor(i);
        setSelected(_checked);
    }

    public void setIcon(int i)
    {
        setIcon(getContext().getResources().getDrawable(i));
    }

    public void setIcon(int i, int j)
    {
        setIcon(getContext().getResources().getDrawable(i), j);
    }

    public void setIcon(Drawable drawable)
    {
        _iv.setImageDrawable(drawable);
        requestLayout();
    }

    public void setIcon(Drawable drawable, int i)
    {
        i;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 42
    //                   2 50;
           goto _L1 _L2 _L3
_L1:
        _drawableOff = drawable;
_L5:
        if (_iv != null)
        {
            setIcon(drawable);
        }
        return;
_L2:
        _drawableOn = drawable;
        continue; /* Loop/switch isn't completed */
_L3:
        _drawableOff = drawable;
        _drawableOn = drawable;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setIconPop()
    {
        float f1 = 1.0F;
        if (_iconPop && _iv != null)
        {
            AnimatorSet animatorset = new AnimatorSet();
            AnimatorSet animatorset1 = new AnimatorSet();
            AnimatorSet animatorset2 = new AnimatorSet();
            animatorset1.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(_iv, "scaleX", new float[] {
                    1.02F
                }), ObjectAnimator.ofFloat(_iv, "scaleY", new float[] {
                    1.02F
                })
            });
            animatorset1.setInterpolator(new DecelerateInterpolator());
            animatorset1.setDuration(100L);
            Object obj = _iv;
            float f;
            ImageView imageview;
            if (isChecked())
            {
                f = 1.0F;
            } else
            {
                f = 0.9F;
            }
            obj = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
                f
            });
            imageview = _iv;
            if (isChecked())
            {
                f = f1;
            } else
            {
                f = 0.9F;
            }
            animatorset2.playTogether(new Animator[] {
                obj, ObjectAnimator.ofFloat(imageview, "scaleY", new float[] {
                    f
                })
            });
            animatorset2.setInterpolator(new DecelerateInterpolator());
            animatorset2.setDuration(100L);
            if (isChecked())
            {
                animatorset.playSequentially(new Animator[] {
                    animatorset1, animatorset2
                });
            } else
            {
                animatorset.play(animatorset2);
            }
            animatorset.start();
        }
    }

    public void setText(Spanned spanned)
    {
        if (spanned != null && spanned.length() > 0)
        {
            _tv.setText(spanned);
            _tv.setVisibility(0);
            return;
        } else
        {
            _tv.setVisibility(8);
            return;
        }
    }

    public void setText(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        setText(Html.fromHtml(s1.toUpperCase()));
    }

    public void setTextColor(int i)
    {
        if (_tv != null)
        {
            _tv.setTextColor(i);
        }
    }

    public void toggle()
    {
        boolean flag;
        if (!_checked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }
}
