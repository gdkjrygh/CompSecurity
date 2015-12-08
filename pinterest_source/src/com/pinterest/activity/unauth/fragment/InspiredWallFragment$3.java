// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.pinterest.kit.utils.ImageUtils;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            InspiredWallFragment

class > extends com.pinterest.kit.utils.nListener
{

    final InspiredWallFragment this$0;
    final ImageView val$previousIv;

    public void onAnimationEnd(Animator animator)
    {
        InspiredWallFragment.access$100(InspiredWallFragment.this).removeView(val$previousIv);
        ImageUtils.recycleBitmap(val$previousIv);
    }

    ()
    {
        this$0 = final_inspiredwallfragment;
        val$previousIv = ImageView.this;
        super();
    }
}
