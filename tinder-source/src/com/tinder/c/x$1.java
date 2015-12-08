// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.tinder.utils.DateUtils;

// Referenced classes of package com.tinder.c:
//            x

final class ownTimer extends CountDownTimer
{

    final x a;

    public final void onFinish()
    {
        a.dismiss();
    }

    public final void onTick(long l)
    {
        x.a(a, l - 1000L);
        x.b(a).setText(DateUtils.b(x.a(a)));
    }

    xtView(x x1, long l)
    {
        a = x1;
        super(l, 1000L);
    }
}
