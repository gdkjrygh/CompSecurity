// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.widget.TextView;

// Referenced classes of package com.accuweather.android.services.request:
//            MCSummaryRefreshTime

class val.minuteCastText
    implements Runnable
{

    final val.minuteCastText this$1;
    final String val$minuteCastText;

    public void run()
    {
        MCSummaryRefreshTime.access$600(_fld0).setText(val$minuteCastText);
    }

    ()
    {
        this$1 = final_;
        val$minuteCastText = String.this;
        super();
    }
}
