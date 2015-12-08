// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea, bm

class bp
    implements android.view.View.OnClickListener
{

    final bm a;

    bp(bm bm1)
    {
        a = bm1;
        super();
    }

    public void onClick(View view)
    {
        bm.a(a, (ea)view.getTag());
    }
}
