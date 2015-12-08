// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class StoryThumbnailView extends ImageView
{

    String a;

    public StoryThumbnailView(Context context)
    {
        this(context, null);
    }

    public StoryThumbnailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setCacheKey(String s)
    {
        a = s;
    }
}
