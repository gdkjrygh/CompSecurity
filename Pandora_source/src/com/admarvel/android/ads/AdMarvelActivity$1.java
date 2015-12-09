// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity

class this._cls0
    implements Runnable
{

    final AdMarvelActivity this$0;

    public void run()
    {
        AdMarvelActivity.access$0(AdMarvelActivity.this, false);
        if (progressDialogReference == null) goto _L2; else goto _L1
_L1:
        MarvelProgressDialog marvelprogressdialog = (MarvelProgressDialog)progressDialogReference.get();
_L4:
        if (marvelprogressdialog == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        marvelprogressdialog.setCancelable(true);
        return;
_L2:
        marvelprogressdialog = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        Logging.log((new StringBuilder("Exception in disable Back press button ")).append(exception.getMessage()).toString());
        return;
    }

    MarvelProgressDialog()
    {
        this$0 = AdMarvelActivity.this;
        super();
    }
}
