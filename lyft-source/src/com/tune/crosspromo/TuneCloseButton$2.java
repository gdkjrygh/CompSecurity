// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.view.View;

// Referenced classes of package com.tune.crosspromo:
//            TuneCloseButton, TuneAdActivity, TuneAdClient

class a
    implements android.view.er
{

    final TuneCloseButton a;

    public void onClick(View view)
    {
        TuneAdClient.c(TuneCloseButton.b(a).a, TuneCloseButton.b(a).b);
        TuneCloseButton.b(a).finish();
    }

    (TuneCloseButton tuneclosebutton)
    {
        a = tuneclosebutton;
        super();
    }
}
