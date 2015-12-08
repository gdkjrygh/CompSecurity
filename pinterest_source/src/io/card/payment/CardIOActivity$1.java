// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.view.OrientationEventListener;

// Referenced classes of package io.card.payment:
//            CardIOActivity

class ener extends OrientationEventListener
{

    final CardIOActivity this$0;

    public void onOrientationChanged(int i)
    {
        CardIOActivity.access$000(CardIOActivity.this, i);
    }

    ener(Context context, int i)
    {
        this$0 = CardIOActivity.this;
        super(context, i);
    }
}
