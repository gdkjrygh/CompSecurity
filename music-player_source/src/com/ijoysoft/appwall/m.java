// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.view.View;

// Referenced classes of package com.ijoysoft.appwall:
//            GiftActivity

final class m
    implements android.view.View.OnClickListener
{

    final GiftActivity a;

    m(GiftActivity giftactivity)
    {
        a = giftactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
