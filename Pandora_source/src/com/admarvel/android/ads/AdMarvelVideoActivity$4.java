// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.admarvel.android.util.Logging;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls0
    implements Runnable
{

    final AdMarvelVideoActivity this$0;

    public void run()
    {
        if (!AdMarvelVideoActivity.access$13(AdMarvelVideoActivity.this) || AdMarvelVideoActivity.access$12(AdMarvelVideoActivity.this) == null)
        {
            return;
        }
        Object obj;
        int i;
        AdMarvelVideoActivity.access$12(AdMarvelVideoActivity.this).setVisibility(0);
        i = AdMarvelVideoActivity.access$14(AdMarvelVideoActivity.this) - AdMarvelVideoActivity.access$2(AdMarvelVideoActivity.this, System.currentTimeMillis() - AdMarvelVideoActivity.access$15(AdMarvelVideoActivity.this));
        if (AdMarvelVideoActivity.access$16(AdMarvelVideoActivity.this) == null || AdMarvelVideoActivity.access$16(AdMarvelVideoActivity.this).length() <= 0 || !AdMarvelVideoActivity.access$16(AdMarvelVideoActivity.this).contains("@seconds"))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = AdMarvelVideoActivity.access$16(AdMarvelVideoActivity.this).replace("@seconds", String.valueOf(i));
_L1:
        ((TextView)AdMarvelVideoActivity.access$12(AdMarvelVideoActivity.this).getChildAt(0)).setText(((CharSequence) (obj)));
        return;
        try
        {
            obj = (new StringBuilder("You Can Skip Ad in ")).append(i).append(" seconds").toString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
          goto _L1
    }

    ()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
