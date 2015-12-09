// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.view.OrientationEventListener;

// Referenced classes of package io.card.payment:
//            CardIOActivity

final class g extends OrientationEventListener
{

    private CardIOActivity a;

    g(CardIOActivity cardioactivity, Context context, int i)
    {
        a = cardioactivity;
        super(context, 2);
    }

    public final void onOrientationChanged(int i)
    {
        CardIOActivity.a(a, i);
    }
}
