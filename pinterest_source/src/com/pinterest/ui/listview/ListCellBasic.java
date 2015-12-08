// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.GrayWebImageView;

public class ListCellBasic extends FrameLayout
{

    private static final int DIMEN_NORMAL = (int)Resources.dimension(0x7f0a01eb);
    private static final int DIMEN_SMALL = (int)Resources.dimension(0x7f0a01ed);
    private View _dividerVw;
    private GrayWebImageView _imageVw;
    private boolean _smallMode;
    private TextView _superTextVw;
    private TextView _textVw;

    public ListCellBasic(Context context)
    {
        this(context, null);
    }

    public ListCellBasic(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ListCellBasic get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ListCellBasic))
        {
            return new ListCellBasic(viewgroup.getContext());
        } else
        {
            return (ListCellBasic)view;
        }
    }

    private void init()
    {
        setMinimumHeight(getResources().getDimensionPixelSize(0x7f0a0155));
        setBackgroundResource(0x7f020283);
        inflate(getContext(), 0x7f03013c, this);
        _imageVw = (GrayWebImageView)findViewById(0x7f0f0325);
        _textVw = (TextView)findViewById(0x7f0f0077);
        _superTextVw = (TextView)findViewById(0x7f0f032a);
        _dividerVw = findViewById(0x7f0f0322);
    }

    private void updateStyle()
    {
        Object obj = _imageVw.getLayoutParams();
        int i;
        if (_smallMode)
        {
            i = DIMEN_SMALL;
        } else
        {
            i = DIMEN_NORMAL;
        }
        obj.width = i;
        if (_smallMode)
        {
            i = DIMEN_SMALL;
        } else
        {
            i = DIMEN_NORMAL;
        }
        obj.height = i;
        _imageVw.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = _textVw;
        if (_smallMode)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((TextView) (obj)).setTypeface(null, i);
    }

    public void enableSmallMode(boolean flag)
    {
        if (flag == _smallMode)
        {
            return;
        } else
        {
            _smallMode = flag;
            updateStyle();
            return;
        }
    }

    public void setDividerVisibility(int i)
    {
        _dividerVw.setVisibility(i);
    }

    public void setImage(Drawable drawable)
    {
        if (drawable == null)
        {
            return;
        } else
        {
            _imageVw.setVisibility(0);
            _imageVw.prepareForReuse();
            _imageVw.setImageDrawable(drawable);
            return;
        }
    }

    public void setImageBackground(int i)
    {
        _imageVw.setBackgroundResource(i);
    }

    public void setImageBorderStyle(com.pinterest.ui.imageview.GrayWebImageView.BorderStyle borderstyle)
    {
        _imageVw.setBorderStyle(borderstyle);
    }

    public void setImageRes(int i)
    {
        if (i <= 0)
        {
            return;
        } else
        {
            _imageVw.setVisibility(0);
            _imageVw.prepareForReuse();
            _imageVw.setImageResource(i);
            return;
        }
    }

    public void setImageUrl(String s)
    {
        _imageVw.setVisibility(0);
        _imageVw.loadUrl(s);
    }

    public void setSuperText(String s)
    {
        if (s == null)
        {
            _superTextVw.setVisibility(8);
            return;
        } else
        {
            _superTextVw.setVisibility(0);
            _superTextVw.setText(s);
            return;
        }
    }

    public void setText(String s)
    {
        _textVw.setText(s);
    }

}
