// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls0
    implements Runnable
{

    final AdMarvelVideoActivity this$0;

    public void run()
    {
        MarvelProgressDialog marvelprogressdialog;
        try
        {
            marvelprogressdialog = (MarvelProgressDialog)progressDialogReference.get();
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
            return;
        }
        if (marvelprogressdialog == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        marvelprogressdialog.dismiss();
    }

    MarvelProgressDialog()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
