// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.widget.Button;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.development:
//            DevelopmentInappNotificationView

class this._cls0
    implements Action1
{

    final DevelopmentInappNotificationView this$0;

    public void call(Boolean boolean1)
    {
        developmentInappNotificationShowButton.setEnabled(boolean1.booleanValue());
        developmentShowInviteRecommended.setEnabled(boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = DevelopmentInappNotificationView.this;
        super();
    }
}
