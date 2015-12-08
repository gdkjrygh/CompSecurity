// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.view.View;
import com.pandora.radio.data.a;

// Referenced classes of package com.pandora.android.ads:
//            AdView, g

class a
    implements android.view.ickListener
{

    final AdView a;

    public void onClick(View view)
    {
        if (com.pandora.android.ads.AdView.a(a))
        {
            return;
        }
        com.pandora.android.ads.AdView.a(a, true);
        if (a.d != null)
        {
            a.d.T();
        }
        com.pandora.android.ads.AdView.a(a, com.pandora.radio.util..a);
        AdView.c(a).b(AdView.b(a).C(), "adClose_onClickHandler", false);
    }

    (AdView adview)
    {
        a = adview;
        super();
    }
}
