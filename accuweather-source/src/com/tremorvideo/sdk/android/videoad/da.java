// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            cy

class da
    implements android.view.View.OnFocusChangeListener
{

    final cy a;

    da(cy cy1)
    {
        a = cy1;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        a.a = flag;
        cy.a(a);
        view.invalidate();
    }
}
