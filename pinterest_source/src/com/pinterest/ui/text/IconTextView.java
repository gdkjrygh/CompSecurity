// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.ui.imageview.WebImageView;

public class IconTextView extends RelativeLayout
{

    protected ImageView _arrow;
    protected int _defaultPaddingDimen;
    protected WebImageView _iconIv;
    protected int _layoutId;
    protected TextView _lblTv;
    protected View _secretIv;
    protected TextView _titleTv;

    public IconTextView(Context context)
    {
        this(context, null);
    }

    public IconTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IconTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _layoutId = 0x7f030168;
        _defaultPaddingDimen = 0x7f0a015f;
        init();
    }

    public TextView getTitleView()
    {
        return _titleTv;
    }

    protected void init()
    {
        setBackgroundResource(0x7f020283);
        setPaddingDimen(_defaultPaddingDimen);
        LayoutInflater.from(getContext()).inflate(_layoutId, this, true);
        _iconIv = (WebImageView)findViewById(0x7f0f0325);
        _lblTv = (TextView)findViewById(0x7f0f0383);
        _titleTv = (TextView)findViewById(0x7f0f0077);
        _arrow = (ImageView)findViewById(0x7f0f0384);
        _secretIv = findViewById(0x7f0f0331);
    }

    public boolean isOval()
    {
        return _iconIv.isOval();
    }

    public void setArrowRes(int i)
    {
        _arrow.setImageResource(i);
    }

    public void setArrowVis(int i)
    {
        _arrow.setVisibility(i);
    }

    public void setImageClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _iconIv.setOnClickListener(onclicklistener);
    }

    public void setImageDrawable(Drawable drawable)
    {
        _iconIv.setImageDrawable(drawable);
    }

    public void setImageUrl(String s)
    {
        _iconIv.loadUrl(s);
    }

    public void setLabel(int i)
    {
        setLabel(getContext().getString(i));
    }

    public void setLabel(String s)
    {
        TextView textview = _lblTv;
        byte byte0;
        if (s == null || s.length() == 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        _lblTv.setText(Html.fromHtml(s));
    }

    public void setOval(boolean flag)
    {
        _iconIv.setOval(flag);
    }

    public void setPaddingDimen(int i)
    {
        if (i == -1)
        {
            return;
        } else
        {
            i = (int)getResources().getDimension(i);
            setPadding(i, i, i, i);
            return;
        }
    }

    public void setPaddingDimen(int i, int j)
    {
        i = (int)getResources().getDimension(i);
        j = (int)getResources().getDimension(j);
        setPadding(i, j, i, j);
    }

    public void setSecretIconVis(int i)
    {
        _secretIv.setVisibility(i);
    }

    public void setTitle(int i)
    {
        setTitle(getContext().getString(i));
    }

    public void setTitle(String s)
    {
        _titleTv.setText(Html.fromHtml(s));
    }

    public void setTitleColor(int i)
    {
        _titleTv.setTextColor(i);
    }

    public void setTitleMaxLines(int i)
    {
        setTitleMultiLine(true);
        _titleTv.setMaxLines(i);
    }

    public void setTitleMultiLine(boolean flag)
    {
        int i = 0;
        Object obj = _titleTv;
        TextView textview;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((TextView) (obj)).setSingleLine(flag1);
        obj = _titleTv;
        if (flag)
        {
            i = 0x7fffffff;
        }
        ((TextView) (obj)).setMaxLines(i);
        textview = _titleTv;
        if (flag)
        {
            obj = null;
        } else
        {
            obj = _titleTv.getEllipsize();
        }
        textview.setEllipsize(((android.text.TextUtils.TruncateAt) (obj)));
    }
}
