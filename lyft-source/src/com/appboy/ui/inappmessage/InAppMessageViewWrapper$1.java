// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            InAppMessageViewWrapper, InAppMessageCloser

class this._cls0
    implements android.view.ViewWrapper._cls1
{

    final InAppMessageViewWrapper this$0;

    public void onClick(View view)
    {
        if (InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this) instanceof IInAppMessageImmersive)
        {
            view = (IInAppMessageImmersive)InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this);
            if (view.getMessageButtons() == null || view.getMessageButtons().size() == 0)
            {
                InAppMessageViewWrapper.access$200(InAppMessageViewWrapper.this).onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this));
            }
            return;
        } else
        {
            InAppMessageViewWrapper.access$200(InAppMessageViewWrapper.this).onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this));
            return;
        }
    }

    wLifecycleListener()
    {
        this$0 = InAppMessageViewWrapper.this;
        super();
    }
}
