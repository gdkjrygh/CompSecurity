// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lomo.VideoViewGroup;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsHorizontalVideoView, KidsOneToOneVideoView

public class KidsLoMoViewGroup extends VideoViewGroup
{

    private final boolean shouldIncludePeekDimen;

    public KidsLoMoViewGroup(Context context, boolean flag)
    {
        super(context, flag);
        shouldIncludePeekDimen = flag;
    }

    protected View createChildView(Context context)
    {
        if (KidsUtils.shouldShowHorizontalImages((NetflixActivity)context))
        {
            return new KidsHorizontalVideoView((NetflixActivity)context, shouldIncludePeekDimen);
        } else
        {
            return new KidsOneToOneVideoView(context, shouldIncludePeekDimen);
        }
    }

    protected int getChildPaddingDimenResId()
    {
        return !KidsUtils.shouldShowHorizontalImages((NetflixActivity)getContext()) ? 0x7f0a007d : 0x7f0a007c;
    }

    protected boolean shouldApplyPaddingToChildren()
    {
        return shouldIncludePeekDimen;
    }

    protected void updateViewIds(View view, int i, int j, int k)
    {
    }
}
