// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.MessageButton;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            InAppMessageViewWrapper, InAppMessageCloser

class this._cls0
    implements android.view.ViewWrapper._cls2
{

    final InAppMessageViewWrapper this$0;

    public void onClick(View view)
    {
        IInAppMessageImmersive iinappmessageimmersive = (IInAppMessageImmersive)InAppMessageViewWrapper.access$000(InAppMessageViewWrapper.this);
        int i = 0;
        do
        {
label0:
            {
                if (i < InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this).size())
                {
                    if (view.getId() != ((View)InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this).get(i)).getId())
                    {
                        break label0;
                    }
                    view = (MessageButton)iinappmessageimmersive.getMessageButtons().get(i);
                    InAppMessageViewWrapper.access$200(InAppMessageViewWrapper.this).onButtonClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), view, iinappmessageimmersive);
                }
                return;
            }
            i++;
        } while (true);
    }

    wLifecycleListener()
    {
        this$0 = InAppMessageViewWrapper.this;
        super();
    }
}
