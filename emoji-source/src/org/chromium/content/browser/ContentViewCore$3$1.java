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

class this._cls1 extends ResultReceiver
{

    final is._cls0 this$1;

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
            getContainerView().getWindowVisibleDisplayFrame(ContentViewCore.access$600(_fld0));
        } else
        if (hasFocus() && i == 0)
        {
            ContentViewCore.access$700(_fld0);
            return;
        }
    }

    is._cls0(Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler);
    }

    // Unreferenced inner class org/chromium/content/browser/ContentViewCore$3

/* anonymous class */
    class ContentViewCore._cls3
        implements org.chromium.content.browser.input.ImeAdapter.ImeAdapterDelegate
    {

        final ContentViewCore this$0;

        public View getAttachedView()
        {
            return ContentViewCore.access$000(ContentViewCore.this);
        }

        public ResultReceiver getNewShowKeyboardReceiver()
        {
            return new ContentViewCore._cls3._cls1(new Handler());
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

            
            {
                this$0 = ContentViewCore.this;
                super();
            }
    }

}
