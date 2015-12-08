// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import android.view.View;
import com.google.android.apps.translate.m;

// Referenced classes of package com.google.android.apps.translate.cards:
//            d, TranslateErrorCard

final class e
    implements Runnable
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
        a.a.findViewById(m.btn_action).setVisibility(8);
        a.a.findViewById(m.msg_download_added).setVisibility(0);
    }
}
