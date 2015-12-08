// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.imageview.WebImageView;

public class  extends android.support.v7.widget.ewHolder
{

    TextView dateTv;
    LinearLayout likeActivityVw;
    WebImageView pinnerIv;
    TextView pinnerName;

    public (View view)
    {
        super(view);
        ButterKnife.a(this, view);
    }
}
