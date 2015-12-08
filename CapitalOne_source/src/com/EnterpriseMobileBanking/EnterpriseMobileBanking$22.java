// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import android.widget.ImageView;
import com.EnterpriseMobileBanking.Plugins.Components.SwipeCover;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class er
    implements Runnable
{

    final EnterpriseMobileBanking this$0;
    final SwipeCover val$cover;
    final View val$v;

    public void run()
    {
        val$v.setPressed(false);
        val$cover.resetLast();
        if (val$cover.getScrollX() == 0)
        {
            ImageView imageview = (ImageView)val$v;
            String s = (String)imageview.getContentDescription();
            if (s.contains(getString(0x7f0900a3)))
            {
                imageview.setContentDescription(getString(0x7f090135));
            } else
            if (s.contains(getString(0x7f0900a4)))
            {
                imageview.setContentDescription(getString(0x7f090136));
            } else
            {
                imageview.setContentDescription(getString(0x7f090137));
            }
            val$cover.resetScroll();
            return;
        }
        ImageView imageview1 = (ImageView)val$v;
        String s1 = (String)imageview1.getContentDescription();
        if (s1.contains(getString(0x7f0900a3)))
        {
            imageview1.setContentDescription(getString(0x7f090138));
        } else
        if (s1.contains(getString(0x7f0900a4)))
        {
            imageview1.setContentDescription(getString(0x7f090139));
        } else
        {
            imageview1.setContentDescription(getString(0x7f09013a));
        }
        val$cover.openScroll();
    }

    er()
    {
        this$0 = final_enterprisemobilebanking;
        val$v = view;
        val$cover = SwipeCover.this;
        super();
    }
}
