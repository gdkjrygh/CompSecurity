// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;

// Referenced classes of package com.appboy.ui.inappmessage:
//            InAppMessageViewWrapper

class this._cls0
    implements com.appboy.ui.inappmessage.listeners.DismissCallbacks
{

    final InAppMessageViewWrapper this$0;

    public boolean canDismiss(Object obj)
    {
        return true;
    }

    public void onDismiss(View view, Object obj)
    {
        InAppMessageViewWrapper.access$200(InAppMessageViewWrapper.this).onDismissed(InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this));
        InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this).setAnimateOut(false);
        close();
    }

    wLifecycleListener()
    {
        this$0 = InAppMessageViewWrapper.this;
        super();
    }
}
