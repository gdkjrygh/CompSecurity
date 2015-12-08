// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            Utils

class this._cls0
    implements Runnable
{

    final Utils this$0;

    public void run()
    {
        if (Utils.access$0(Utils.this) != null)
        {
            Context context = (Context)Utils.access$0(Utils.this).get();
            if (context != null)
            {
                (new WebView(context)).loadDataWithBaseURL(null, Utils.access$1(Utils.this), "text/html", "utf-8", null);
            }
        }
    }

    ()
    {
        this$0 = Utils.this;
        super();
    }
}
