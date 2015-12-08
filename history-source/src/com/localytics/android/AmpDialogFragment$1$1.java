// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpDialogFragment

class val.url
    implements Runnable
{

    final val.url this$1;
    final ialog.AmpWebView val$mWebView;
    final String val$url;

    public void run()
    {
        val$mWebView.loadUrl(val$url);
    }

    ialog.AmpWebView()
    {
        this$1 = final_ampwebview;
        val$mWebView = ampwebview1;
        val$url = String.this;
        super();
    }

    // Unreferenced inner class com/localytics/android/AmpDialogFragment$1

/* anonymous class */
    class AmpDialogFragment._cls1 extends AmpCallable
    {

        final AmpDialogFragment this$0;

        Object call(Object aobj[])
        {
            aobj = (String)aobj[0];
            final AmpDialogFragment.AmpDialog.AmpWebView mWebView = AmpDialogFragment.AmpDialog.access$100(AmpDialogFragment.access$000(AmpDialogFragment.this));
            if (handleUrl(((String) (aobj)), getActivity()))
            {
                (new Handler(Looper.getMainLooper())).post(((AmpDialogFragment._cls1._cls1) (aobj)). new AmpDialogFragment._cls1._cls1());
            }
            return null;
        }

            
            {
                this$0 = AmpDialogFragment.this;
                super();
            }
    }

}
