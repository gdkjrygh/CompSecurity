// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.DialogFragment;
import android.os.Handler;
import com.admarvel.android.util.Logging;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity

private class <init>
    implements Runnable
{

    final AdMarvelActivity this$0;

    public void run()
    {
        logFragment logfragment;
        try
        {
            logfragment = logFragment.newInstance(AdMarvelActivity.this);
        }
        catch (Exception exception)
        {
            Logging.log(exception.getMessage());
            AdMarvelActivity.access$19(AdMarvelActivity.this).sendEmptyMessage(0);
            return;
        }
        if (logfragment == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        logfragment.show(getFragmentManager(), "dialog");
    }

    private logFragment()
    {
        this$0 = AdMarvelActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
