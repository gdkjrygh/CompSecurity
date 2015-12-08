// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.pinterest.kit.application.Resources;

public class IconView extends ImageView
{

    private com.pinterest.ui.imageview.GrayWebImageView.BorderStyle _borderStyle;
    private boolean _oval;
    private int _tintColor;

    public IconView(Context context)
    {
        this(context, null);
    }

    public IconView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IconView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _tintColor = Resources.color(0x7f0e006d);
        _borderStyle = com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.TRANSPARENT;
        _oval = false;
        updateView();
    }

    private void updateBorderStyle()
    {
        switch (_cls1..SwitchMap.com.pinterest.ui.imageview.GrayWebImageView.BorderStyle[_borderStyle.ordinal()])
        {
        default:
            setBackgroundResource(0);
            return;

        case 1: // '\001'
            int i;
            if (_oval)
            {
                i = 0x7f020247;
            } else
            {
                i = 0x7f02026d;
            }
            setBackgroundResource(i);
            return;

        case 2: // '\002'
            int j;
            if (_oval)
            {
                j = 0x7f020244;
            } else
            {
                j = 0x7f02026b;
            }
            setBackgroundResource(j);
            return;

        case 3: // '\003'
            break;
        }
        int k;
        if (_oval)
        {
            k = 0x7f020243;
        } else
        {
            k = 0x7f020269;
        }
        setBackgroundResource(k);
    }

    private void updateFilter()
    {
        setColorFilter(_tintColor, android.graphics.PorterDuff.Mode.SRC_IN);
    }

    private void updateView()
    {
        updateFilter();
        updateBorderStyle();
    }

    public void setBorderStyle(com.pinterest.ui.imageview.GrayWebImageView.BorderStyle borderstyle)
    {
        _borderStyle = borderstyle;
        updateBorderStyle();
    }

    public void setOval(boolean flag)
    {
        _oval = flag;
        updateBorderStyle();
    }

    public void setTint(int i)
    {
        int j = Resources.color(i);
        i = j;
_L2:
        _tintColor = i;
        updateFilter();
        return;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[];

        static 
        {
            $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle = new int[com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.LIGHT_GRAY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.GRAY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.NONE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.TRANSPARENT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
