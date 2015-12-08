// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            co

class cr
    implements android.view.View.OnClickListener
{

    final co a;

    cr(co co1)
    {
        a = co1;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
        co.b(a).a(true);
    }
}
