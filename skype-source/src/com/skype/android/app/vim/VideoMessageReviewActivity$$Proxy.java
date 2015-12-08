// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.widget.TextView;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageReviewActivity

public class <init> extends <init>
{

    public void clearViews()
    {
        super.clearViews();
        ((VideoMessageReviewActivity)getTarget()).cancelButton = null;
        ((VideoMessageReviewActivity)getTarget()).durationText = null;
        ((VideoMessageReviewActivity)getTarget()).acceptButton = null;
    }

    public void injectViews()
    {
        super.injectViews();
        ((VideoMessageReviewActivity)getTarget()).cancelButton = findViewById(0x7f100325);
        ((VideoMessageReviewActivity)getTarget()).durationText = (TextView)findViewById(0x7f100594);
        ((VideoMessageReviewActivity)getTarget()).acceptButton = findViewById(0x7f100260);
    }

    public A(VideoMessageReviewActivity videomessagereviewactivity)
    {
        super(videomessagereviewactivity);
    }
}
