// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.animation.TimeInterpolator;
import android.view.View;
import android.widget.AbsListView;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class this._cls0
    implements android.widget.lListener
{

    final TimeInterpolator invitesHeaderInterpolator = new TimeInterpolator() {

        final float HEADER_SCALE_FACTOR = 0.0009F;
        final float MIN_HEADER_SCALE = 0.75F;
        final InviteScreenView._cls8 this$1;

        public float getInterpolation(float f)
        {
            return Math.max(Math.min(1.0F - 0.0009F * f, 1.0F), 0.75F);
        }

            
            {
                this$1 = InviteScreenView._cls8.this;
                super();
            }
    };
    final InviteScreenView this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (abslistview.getCount() > 0 && i == 0)
        {
            abslistview = abslistview.getChildAt(0);
            if (abslistview != null)
            {
                float f = abslistview.getHeight();
                float f1 = abslistview.getBottom();
                setScaleAndAlpha(invitesHeaderContainer, invitesHeaderInterpolator.getInterpolation(f - f1));
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = InviteScreenView.this;
        super();
    }
}
