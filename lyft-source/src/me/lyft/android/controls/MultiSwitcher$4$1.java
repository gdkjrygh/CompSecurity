// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package me.lyft.android.controls:
//            MultiSwitcher, ISwitcherItem

class val.currentIndex
    implements android.view.er
{

    final val.currentIndex this$1;
    final int val$currentIndex;

    public void onClick(View view)
    {
        MultiSwitcher.access$1002(_fld0, true);
        animateToItemIndex(val$currentIndex);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$currentIndex = I.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/controls/MultiSwitcher$4

/* anonymous class */
    class MultiSwitcher._cls4
        implements Runnable
    {

        final MultiSwitcher this$0;

        public void run()
        {
            if (!MultiSwitcher.access$800(MultiSwitcher.this))
            {
                MultiSwitcher.access$1400(MultiSwitcher.this);
                updateThumb();
            }
            itemsPlaceHolder.removeAllViews();
            Iterator iterator = MultiSwitcher.access$1500(MultiSwitcher.this).iterator();
            for (int i = 0; iterator.hasNext(); i++)
            {
                ISwitcherItem iswitcheritem = (ISwitcherItem)iterator.next();
                View view = createSwitcherItem(MultiSwitcher.access$1600(MultiSwitcher.this), iswitcheritem);
                bindSwitcherItem(view, iswitcheritem);
                view.setOnClickListener(i. new MultiSwitcher._cls4._cls1());
                itemsPlaceHolder.addView(view, new android.widget.LinearLayout.LayoutParams(MultiSwitcher.access$1700(MultiSwitcher.this), -1));
            }

        }

            
            {
                this$0 = MultiSwitcher.this;
                super();
            }
    }

}
