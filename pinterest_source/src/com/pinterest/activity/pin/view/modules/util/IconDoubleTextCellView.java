// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.WebImageView;

public class IconDoubleTextCellView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private static int ICON_RIGHT_MARGIN_DEFAULT;
    private static int ICON_SIZE_DEFAULT = (int)Resources.dimension(0x7f0a01ec);
    private WebImageView _iconIv;
    private android.view.View.OnClickListener _onIconClickListener;
    private android.view.View.OnClickListener _onTextClickListener;
    private TextView _subTitleTv;
    private TextView _titleTv;
    private RelativeLayout _titleWrapper;

    public IconDoubleTextCellView(Context context)
    {
        super(context);
        init(TextOrientation.VERTICAL, 0x7f0100e0, 0x7f0100e0);
    }

    public IconDoubleTextCellView(Context context, TextOrientation textorientation, int i, int j)
    {
        super(context);
        init(textorientation, i, j);
    }

    private void init(TextOrientation textorientation, int i, int j)
    {
        setOrientation(0);
        setGravity(16);
        _iconIv = new WebImageView(getContext());
        _iconIv.setOval(true);
        addView(_iconIv, ICON_SIZE_DEFAULT, ICON_SIZE_DEFAULT);
        _titleWrapper = new RelativeLayout(getContext());
        boolean flag;
        if (textorientation == TextOrientation.HORIZONTAL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _titleTv = new TextView(getContext(), null, i);
        _titleTv.setId(0x7f0f000a);
        if (flag)
        {
            textorientation = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        } else
        {
            textorientation = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        }
        _titleWrapper.addView(_titleTv, textorientation);
        _subTitleTv = new TextView(getContext(), null, j);
        _subTitleTv.setId(0x7f0f0009);
        _subTitleTv.setTypeface(null, 1);
        textorientation = new android.widget.RelativeLayout.LayoutParams(((android.widget.RelativeLayout.LayoutParams) (textorientation)).width, ((android.widget.RelativeLayout.LayoutParams) (textorientation)).height);
        if (flag)
        {
            textorientation.addRule(1, _titleTv.getId());
            textorientation.addRule(11);
            textorientation.addRule(6, _titleTv.getId());
            setGravity(48);
        } else
        {
            textorientation.addRule(3, _titleTv.getId());
        }
        _titleWrapper.addView(_subTitleTv, textorientation);
        addView(_titleWrapper, -1, -2);
        showImage(false);
    }

    public void onClick(View view)
    {
        if (_onIconClickListener != null && view == _iconIv)
        {
            _onIconClickListener.onClick(view);
        } else
        if (_onTextClickListener != null && (view == _titleTv || view == _subTitleTv))
        {
            _onTextClickListener.onClick(view);
            return;
        }
    }

    public void setIconClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _onIconClickListener = onclicklistener;
        _iconIv.setOnClickListener(this);
    }

    public void setImageProperties(boolean flag, int i, int j, int k)
    {
        _iconIv.setOval(flag);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)_iconIv.getLayoutParams();
        marginlayoutparams.width = i;
        marginlayoutparams.height = j;
        marginlayoutparams.topMargin = k;
    }

    public void setImageResource(int i)
    {
        showImage(true);
        _iconIv.setImageResource(i);
    }

    public void setImageUrl(String s)
    {
        showImage(true);
        _iconIv.loadUrl(s);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        super.setOnClickListener(onclicklistener);
        setIconClickListener(onclicklistener);
        setTextClickListener(onclicklistener);
    }

    public void setSubTitle(Spanned spanned)
    {
        _subTitleTv.setText(spanned);
    }

    public void setSubTitle(String s)
    {
        _subTitleTv.setText(Html.fromHtml(s));
    }

    public void setSubTitleFontStyle(int i)
    {
        _subTitleTv.setTypeface(null, i);
    }

    public void setSubTitleGravity(int i)
    {
        _subTitleTv.setGravity(i);
    }

    public void setSubtitleEllipsize(android.text.TextUtils.TruncateAt truncateat)
    {
        _subTitleTv.setSingleLine(true);
        _subTitleTv.setEllipsize(truncateat);
    }

    public void setTextClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _onTextClickListener = onclicklistener;
        _titleTv.setOnClickListener(this);
        _subTitleTv.setOnClickListener(this);
    }

    public void setTitle(String s)
    {
        _titleTv.setText(Html.fromHtml(s));
    }

    public void showImage(boolean flag)
    {
        if (flag)
        {
            _titleTv.setPadding(ICON_RIGHT_MARGIN_DEFAULT, 0, 0, 0);
            _subTitleTv.setPadding(ICON_RIGHT_MARGIN_DEFAULT, 0, 0, 0);
            _iconIv.setVisibility(0);
            return;
        } else
        {
            _titleTv.setPadding(0, 0, 0, 0);
            _subTitleTv.setPadding(0, 0, 0, 0);
            _iconIv.setVisibility(8);
            return;
        }
    }

    static 
    {
        ICON_RIGHT_MARGIN_DEFAULT = Constants.MARGIN_HALF;
    }

    private class TextOrientation extends Enum
    {

        private static final TextOrientation $VALUES[];
        public static final TextOrientation HORIZONTAL;
        public static final TextOrientation VERTICAL;

        public static TextOrientation valueOf(String s)
        {
            return (TextOrientation)Enum.valueOf(com/pinterest/activity/pin/view/modules/util/IconDoubleTextCellView$TextOrientation, s);
        }

        public static TextOrientation[] values()
        {
            return (TextOrientation[])$VALUES.clone();
        }

        static 
        {
            HORIZONTAL = new TextOrientation("HORIZONTAL", 0);
            VERTICAL = new TextOrientation("VERTICAL", 1);
            $VALUES = (new TextOrientation[] {
                HORIZONTAL, VERTICAL
            });
        }

        private TextOrientation(String s, int i)
        {
            super(s, i);
        }
    }

}
