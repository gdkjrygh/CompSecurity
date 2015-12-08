// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bz

class cc
    implements android.view.View.OnFocusChangeListener
{

    final bz a;
    final bz.b b;

    cc(bz.b b1, bz bz)
    {
        b = b1;
        a = bz;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        b.c = flag;
        view.invalidate();
    }
}
