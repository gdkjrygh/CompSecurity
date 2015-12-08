// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package com.facebook.login.widget:
//            ToolTipPopup

private class init extends FrameLayout
{

    private View bodyFrame;
    private ImageView bottomArrow;
    final ToolTipPopup this$0;
    private ImageView topArrow;
    private ImageView xOut;

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(com.facebook.bubble, this);
        topArrow = (ImageView)findViewById(com.facebook.le_view_top_pointer);
        bottomArrow = (ImageView)findViewById(com.facebook.le_view_bottom_pointer);
        bodyFrame = findViewById(com.facebook.pContentView.findViewById);
        xOut = (ImageView)findViewById(com.facebook.pContentView.findViewById);
    }

    public void showBottomArrow()
    {
        topArrow.setVisibility(4);
        bottomArrow.setVisibility(0);
    }

    public void showTopArrow()
    {
        topArrow.setVisibility(0);
        bottomArrow.setVisibility(4);
    }





    public (Context context)
    {
        this$0 = ToolTipPopup.this;
        super(context);
        init();
    }
}
