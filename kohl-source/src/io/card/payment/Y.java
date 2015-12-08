// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.view.View;

// Referenced classes of package io.card.payment:
//            DataEntryActivity

final class Y
    implements android.view.View.OnClickListener
{

    private DataEntryActivity a;

    Y(DataEntryActivity dataentryactivity)
    {
        a = dataentryactivity;
        super();
    }

    public final void onClick(View view)
    {
        DataEntryActivity.a(a);
    }
}
