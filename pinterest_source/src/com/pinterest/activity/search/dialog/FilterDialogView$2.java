// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;

import android.view.animation.Animation;
import com.pinterest.activity.task.event.DialogHideEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.search.dialog:
//            FilterDialogView

class this._cls0
    implements android.view.animation.Listener
{

    final FilterDialogView this$0;

    public void onAnimationEnd(Animation animation)
    {
        Events.post(new DialogHideEvent());
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = FilterDialogView.this;
        super();
    }
}
