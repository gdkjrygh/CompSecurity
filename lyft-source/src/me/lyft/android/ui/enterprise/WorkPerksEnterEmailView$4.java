// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.widget.ScrollView;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

class this._cls0
    implements android.view.ayoutListener
{

    final WorkPerksEnterEmailView this$0;

    public void onGlobalLayout()
    {
        workPerksScrollView.post(new Runnable() {

            final WorkPerksEnterEmailView._cls4 this$1;

            public void run()
            {
                workPerksScrollView.fullScroll(130);
            }

            
            {
                this$1 = WorkPerksEnterEmailView._cls4.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = WorkPerksEnterEmailView.this;
        super();
    }
}
