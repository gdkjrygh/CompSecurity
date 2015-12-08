// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tinder.events.match.EventMatchHeaderSizeChanged;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.views:
//            MatchListLayout

class t> extends Animation
{

    final eight this$1;
    final android.support.v7.widget.der val$rowZero;

    protected void applyTransformation(float f, Transformation transformation)
    {
        transformation = val$rowZero.itemView;
        android.view.ms ms = transformation.getLayoutParams();
        int i;
        if (f == 1.0F)
        {
            i = MatchListLayout.access$000(_fld0);
        } else
        {
            i = (int)((float)MatchListLayout.access$000(_fld0) * f);
        }
        ms.height = i;
        transformation.requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    w.ViewHolder()
    {
        this$1 = final_viewholder;
        val$rowZero = android.support.v7.widget.der.this;
        super();
    }

    // Unreferenced inner class com/tinder/views/MatchListLayout$1

/* anonymous class */
    class MatchListLayout._cls1
        implements android.view.View.OnLayoutChangeListener
    {

        final MatchListLayout this$0;

        public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
            i = view.getMeasuredHeight();
            j = layoutparams.topMargin;
            i = layoutparams.bottomMargin + (i + j);
            if (MatchListLayout.access$000(MatchListLayout.this) != i)
            {
                MatchListLayout.access$002(MatchListLayout.this, i);
                view = (android.widget.FrameLayout.LayoutParams)MatchListLayout.access$300(MatchListLayout.this).getLayoutParams();
                view.topMargin = MatchListLayout.access$000(MatchListLayout.this);
                MatchListLayout.access$300(MatchListLayout.this).setLayoutParams(view);
                view = MatchListLayout.access$400(MatchListLayout.this).findViewHolderForAdapterPosition(0);
                MatchListLayout._cls1._cls1 _lcls1 = view. new MatchListLayout._cls1._cls1();
                if (view != null && ((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView != null)
                {
                    ((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView.startAnimation(_lcls1);
                }
                mEventBus.d(new EventMatchHeaderSizeChanged(MatchListLayout.access$000(MatchListLayout.this)));
            }
        }

            
            {
                this$0 = MatchListLayout.this;
                super();
            }
    }

}
