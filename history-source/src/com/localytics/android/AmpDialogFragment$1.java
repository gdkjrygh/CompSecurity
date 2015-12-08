// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpDialogFragment

class this._cls0 extends AmpCallable
{

    final AmpDialogFragment this$0;

    Object call(final Object url[])
    {
        url = (String)url[0];
        final pDialog.AmpWebView mWebView = pDialog.access._mth100(AmpDialogFragment.access$000(AmpDialogFragment.this));
        if (handleUrl(((String) (url)), getActivity()))
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final AmpDialogFragment._cls1 this$1;
                final AmpDialogFragment.AmpDialog.AmpWebView val$mWebView;
                final String val$url;

                public void run()
                {
                    mWebView.loadUrl(url);
                }

            
            {
                this$1 = AmpDialogFragment._cls1.this;
                mWebView = ampwebview;
                url = s;
                super();
            }
            });
        }
        return null;
    }

    _cls1.val.url()
    {
        this$0 = AmpDialogFragment.this;
        super();
    }
}
