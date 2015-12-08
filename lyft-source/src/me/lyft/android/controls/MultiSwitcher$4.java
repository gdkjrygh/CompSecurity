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

class this._cls0
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
        for (final int currentIndex = 0; iterator.hasNext(); currentIndex++)
        {
            ISwitcherItem iswitcheritem = (ISwitcherItem)iterator.next();
            View view = createSwitcherItem(MultiSwitcher.access$1600(MultiSwitcher.this), iswitcheritem);
            bindSwitcherItem(view, iswitcheritem);
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final MultiSwitcher._cls4 this$1;
                final int val$currentIndex;

                public void onClick(View view1)
                {
                    MultiSwitcher.access$1002(this$0, true);
                    animateToItemIndex(currentIndex);
                }

            
            {
                this$1 = MultiSwitcher._cls4.this;
                currentIndex = i;
                super();
            }
            });
            itemsPlaceHolder.addView(view, new android.widget.outParams(MultiSwitcher.access$1700(MultiSwitcher.this), -1));
        }

    }

    _cls1.val.currentIndex()
    {
        this$0 = MultiSwitcher.this;
        super();
    }
}
