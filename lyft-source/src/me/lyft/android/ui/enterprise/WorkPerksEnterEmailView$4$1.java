// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.widget.ScrollView;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

class this._cls1
    implements Runnable
{

    final PerksScrollView this$1;

    public void run()
    {
        workPerksScrollView.fullScroll(130);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/enterprise/WorkPerksEnterEmailView$4

/* anonymous class */
    class WorkPerksEnterEmailView._cls4
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final WorkPerksEnterEmailView this$0;

        public void onGlobalLayout()
        {
            workPerksScrollView.post(new WorkPerksEnterEmailView._cls4._cls1());
        }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                super();
            }
    }

}
