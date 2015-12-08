// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            AutoLayoutSlotBuilder

private final class <init>
{

    public int mAnimationType;
    public ImageView mImage;
    public ViewGroup mImageContainer;
    public int mImageResizeMode;
    public String mLayoutSlotType;
    public ImageView mOverflowImage;
    public View mOverlay;
    public ProgressBar mProgressBar;
    public View mRoot;
    public ArrayList mSharedViews;
    public ArrayList mSlotArray;
    public TextView mSubtitle;
    public TextView mTitle;
    final AutoLayoutSlotBuilder this$0;

    private ()
    {
        this$0 = AutoLayoutSlotBuilder.this;
        super();
        mSlotArray = new ArrayList();
    }

    mSlotArray(byte byte0)
    {
        this();
    }
}
