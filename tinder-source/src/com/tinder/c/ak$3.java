// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.tinder.utils.DateUtils;

// Referenced classes of package com.tinder.c:
//            ak

final class wnTimer extends CountDownTimer
{

    final TextView a;
    final ak b;

    public final void onFinish()
    {
        b.dismiss();
    }

    public final void onTick(long l)
    {
        a.setText(DateUtils.b(l - 1000L));
    }

    tView(ak ak1, long l, TextView textview)
    {
        b = ak1;
        a = textview;
        super(l, 1000L);
    }
}
