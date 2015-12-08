// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore, ContentViewClient, PopupZoomer

class this._cls0
    implements org.chromium.content.browser.input.terDelegate
{

    final ContentViewCore this$0;

    public View getAttachedView()
    {
        return ContentViewCore.access$000(ContentViewCore.this);
    }

    public ResultReceiver getNewShowKeyboardReceiver()
    {
        return new ResultReceiver(new Handler()) {

            final ContentViewCore._cls3 this$1;

            public void onReceiveResult(int i, Bundle bundle)
            {
                bundle = getContentViewClient();
                boolean flag;
                if (i == 2 || i == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                bundle.onImeStateChangeRequested(flag);
                if (i == 2)
                {
                    getContainerView().getWindowVisibleDisplayFrame(ContentViewCore.access$600(this$0));
                } else
                if (hasFocus() && i == 0)
                {
                    ContentViewCore.access$700(this$0);
                    return;
                }
            }

            
            {
                this$1 = ContentViewCore._cls3.this;
                super(handler);
            }
        };
    }

    public void onDismissInput()
    {
        getContentViewClient().onImeStateChangeRequested(false);
    }

    public void onImeEvent()
    {
        ContentViewCore.access$300(ContentViewCore.this).hide(true);
        getContentViewClient().onImeEvent();
        if (ContentViewCore.access$400(ContentViewCore.this))
        {
            ContentViewCore.access$500(ContentViewCore.this);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = ContentViewCore.this;
        super();
    }
}
