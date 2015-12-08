// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.api.model.User;
import com.pinterest.kit.utils.AnimationUtils;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PTextView;

public class NUXSocialGridCell extends RelativeLayout
{

    private boolean _bounceOnTouch;
    private boolean _checked;
    private ImageView _checkmarkOverlay;
    private boolean _dimOnTouch;
    protected ProportionalImageView _image;
    private int _imageBackground;
    private boolean _isFirstCell;
    private boolean _isSelected;
    protected PTextView _name;
    private User _user;
    android.view.View.OnTouchListener touchListener;

    public NUXSocialGridCell(Context context)
    {
        this(context, null);
    }

    public NUXSocialGridCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NUXSocialGridCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        touchListener = new _cls2();
        init();
    }

    public static NUXSocialGridCell from(View view, Context context)
    {
        if (view instanceof NUXSocialGridCell)
        {
            return (NUXSocialGridCell)view;
        } else
        {
            return new NUXSocialGridCell(context);
        }
    }

    private boolean touchEvent(View view, ImageView imageview, MotionEvent motionevent)
    {
        if (_bounceOnTouch)
        {
            AnimatorSet animatorset = new AnimatorSet();
            if (motionevent.getAction() == 0 && !_isSelected)
            {
                animatorset.playTogether(new Animator[] {
                    AnimationUtils.springAnimate(view, "scaleX", 1.0F, 0.85F, 1.0F, 1.25F), AnimationUtils.springAnimate(view, "scaleY", 1.0F, 0.85F, 1.0F, 1.25F)
                });
                animatorset.start();
            } else
            if ((motionevent.getAction() == 1 || motionevent.getAction() == 3) && _isSelected)
            {
                animatorset.playTogether(new Animator[] {
                    AnimationUtils.springAnimate(view, "scaleX", 0.85F, 1.0F, 1.0F, 1.25F), AnimationUtils.springAnimate(view, "scaleY", 0.85F, 1.0F, 1.0F, 1.25F)
                });
                animatorset.start();
            }
        }
        if (_dimOnTouch)
        {
            if (motionevent.getAction() == 0 && !_isSelected)
            {
                imageview.setColorFilter(getResources().getColor(0x7f0e0076));
                _isSelected = true;
                return true;
            }
            if (motionevent.getAction() == 1 && _isSelected)
            {
                imageview.setColorFilter(0);
                _isSelected = false;
                callOnClick();
                return true;
            }
            if (motionevent.getAction() == 3 && _isSelected)
            {
                imageview.setColorFilter(0);
                _isSelected = false;
                return true;
            }
        }
        return false;
    }

    public User getUser()
    {
        return _user;
    }

    public void init()
    {
        inflate(getContext(), 0x7f030129, this);
        _checked = false;
        _image = (ProportionalImageView)findViewById(0x7f0f004b);
        _image.setOval(true);
        _name = (PTextView)findViewById(0x7f0f01e9);
        _isFirstCell = false;
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, _name);
        View view = LayoutInflater.from(getContext()).inflate(0x7f0301ed, null, false);
        addView(view);
        setOnTouchListener(touchListener);
        _checkmarkOverlay = (ImageView)view.findViewById(0x7f0f04af);
        _checkmarkOverlay.setVisibility(4);
        _image.setImageListener(new _cls1());
        _dimOnTouch = true;
        _bounceOnTouch = true;
        _isSelected = false;
    }

    public boolean isChecked()
    {
        return _checked;
    }

    public boolean isFirstCell()
    {
        return _isFirstCell;
    }

    public void loadImage(Bitmap bitmap)
    {
        _image.setBitmap(bitmap, false);
    }

    public void loadImageUrl(String s)
    {
        if (s != null && _image.getUrl() != null && s.equals(_image.getUrl()))
        {
            return;
        } else
        {
            _image.loadUrl(s);
            return;
        }
    }

    public void setBackgroundImage(Drawable drawable)
    {
        setBackgroundDrawable(drawable);
    }

    public void setBounceOnTouch(boolean flag)
    {
        _bounceOnTouch = flag;
    }

    public void setChecked(boolean flag)
    {
        _checked = flag;
        ImageView imageview = _checkmarkOverlay;
        int i;
        if (_checked)
        {
            i = 0x7f020236;
        } else
        {
            i = 0x7f020235;
        }
        imageview.setImageResource(i);
    }

    public void setDimOnTouch(boolean flag)
    {
        _dimOnTouch = flag;
    }

    public void setImageBackgroundResource(int i)
    {
        _imageBackground = i;
        _image.setBackgroundResource(_imageBackground);
    }

    public void setImageVisiblity(int i)
    {
        _checkmarkOverlay.setVisibility(i);
        _image.setVisibility(i);
        _name.setVisibility(i);
    }

    public void setIsFirstCell(boolean flag, boolean flag1)
    {
        _isFirstCell = flag;
        ImageView imageview;
        byte byte0;
        if (_isFirstCell)
        {
            if (flag1)
            {
                setNameText(com.pinterest.kit.application.Resources.string(0x7f0705b3));
                _image.setImageDrawable(getResources().getDrawable(0x7f020233));
            } else
            {
                setNameText(com.pinterest.kit.application.Resources.string(0x7f0702ac));
                _image.setImageDrawable(getResources().getDrawable(0x7f020234));
            }
        }
        imageview = _checkmarkOverlay;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    public void setNameText(String s)
    {
        if (s != null)
        {
            _name.setText(s);
        }
    }

    public void setUser(User user)
    {
        if (user != null)
        {
            _user = user;
            loadImageUrl(user.getImageLargeUrl());
            setNameText(user.getFullName());
            if (_imageBackground != 0)
            {
                _image.setBackgroundResource(_imageBackground);
                return;
            }
        }
    }



    private class _cls2
        implements android.view.View.OnTouchListener
    {

        final NUXSocialGridCell this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            return touchEvent(view, _image, motionevent);
        }

        _cls2()
        {
            this$0 = NUXSocialGridCell.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final NUXSocialGridCell this$0;

        public void onBitmapSet()
        {
            _checkmarkOverlay.setVisibility(0);
        }

        _cls1()
        {
            this$0 = NUXSocialGridCell.this;
            super();
        }
    }

}
