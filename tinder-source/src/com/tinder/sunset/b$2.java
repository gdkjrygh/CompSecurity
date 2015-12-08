// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.support.v4.app.i;
import android.view.View;

// Referenced classes of package com.tinder.sunset:
//            b

final class >
    implements android.view..OnClickListener
{

    final b a;

    public final void onClick(View view)
    {
        a.getActivity().onBackPressed();
    }

    .i(b b1)
    {
        a = b1;
        super();
    }
}
