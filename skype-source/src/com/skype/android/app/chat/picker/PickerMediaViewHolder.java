// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PickerMediaViewHolder extends android.support.v7.widget.RecyclerView.v
{

    private ImageView imageView;
    private View sendView;
    private TextView textView;
    private int type;

    public PickerMediaViewHolder(View view, int i)
    {
        super(view);
        type = i;
        imageView = (ImageView)view.findViewById(0x7f100492);
        textView = (TextView)view.findViewById(0x7f1004ac);
        sendView = view.findViewById(0x7f1004a9);
    }

    public ImageView getImageView()
    {
        return imageView;
    }

    public View getSendView()
    {
        return sendView;
    }

    public TextView getTextView()
    {
        return textView;
    }

    public int getType()
    {
        return type;
    }
}
