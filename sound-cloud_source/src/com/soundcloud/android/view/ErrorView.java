// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ErrorView extends ScrollView
{

    private TextView connectionErrorSubtitle;
    private TextView connectionErrorTitle;
    private ImageView imageView;
    private TextView serverErrorText;

    public ErrorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        imageView = (ImageView)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_error_image);
        serverErrorText = (TextView)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_error_message1);
        connectionErrorTitle = (TextView)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_error_message2);
        connectionErrorSubtitle = (TextView)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_error_message3);
    }

    public void setConnectionErrorState()
    {
        imageView.setImageResource(com.soundcloud.androidkit.R.drawable.ak_emptyview_error_connectivity);
        serverErrorText.setVisibility(8);
        connectionErrorTitle.setVisibility(0);
        connectionErrorSubtitle.setVisibility(0);
    }

    public void setServerErrorState()
    {
        imageView.setImageResource(com.soundcloud.androidkit.R.drawable.ak_emptyview_error_server);
        serverErrorText.setVisibility(0);
        connectionErrorTitle.setVisibility(8);
        connectionErrorSubtitle.setVisibility(8);
    }
}
