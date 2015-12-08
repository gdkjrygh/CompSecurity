// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.content.Context;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.WebImageView;

public class IconTextCellView extends LinearLayout
{

    private static int ICON_MARGIN;
    private static int ICON_SIZE = (int)Resources.dimension(0x7f0a01ed);
    private static int OVAL_ICON_MARGIN;
    private static int OVAL_ICON_SIZE = (int)Resources.dimension(0x7f0a01ec);
    private WebImageView _iconIv;
    private TextView _titleTv;

    public IconTextCellView(Context context)
    {
        super(context);
        init();
    }

    private void init()
    {
        setOrientation(0);
        setGravity(16);
        _iconIv = new WebImageView(getContext());
        addView(_iconIv, ICON_SIZE, ICON_SIZE);
        _titleTv = new TextView(getContext(), null, 0x7f0100db);
        _titleTv.setPadding(Constants.MARGIN_HALF, 0, 0, 0);
        _titleTv.setMaxLines(1);
        addView(_titleTv, -1, -2);
    }

    public void setImageOval(boolean flag)
    {
        _iconIv.setOval(flag);
        android.view.ViewGroup.LayoutParams layoutparams = _iconIv.getLayoutParams();
        int i;
        if (flag)
        {
            i = OVAL_ICON_SIZE;
        } else
        {
            i = ICON_SIZE;
        }
        layoutparams.width = i;
        if (flag)
        {
            i = OVAL_ICON_SIZE;
        } else
        {
            i = ICON_SIZE;
        }
        layoutparams.height = i;
        _iconIv.setLayoutParams(layoutparams);
        _titleTv.setPadding(ICON_MARGIN, 0, 0, 0);
    }

    public void setImageRounded(boolean flag)
    {
        WebImageView webimageview = _iconIv;
        float f;
        if (flag)
        {
            f = Constants.CORNER_RADIUS;
        } else
        {
            f = 0.0F;
        }
        webimageview.setCornerRadius(f);
    }

    public void setImageUrl(String s)
    {
        _iconIv.loadUrl(s);
    }

    public void setTitle(String s)
    {
        _titleTv.setText(Html.fromHtml(s));
    }

    static 
    {
        ICON_MARGIN = Constants.MARGIN_HALF;
        OVAL_ICON_MARGIN = (int)((float)Constants.MARGIN_HALF - Device.dpToPixel(2.0F));
    }
}
