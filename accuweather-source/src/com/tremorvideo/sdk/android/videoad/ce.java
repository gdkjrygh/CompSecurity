// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimerTask;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct

class ce extends TimerTask
{

    final bz.b a;

    ce(bz.b b)
    {
        a = b;
        super();
    }

    public void run()
    {
        long l = GregorianCalendar.getInstance().getTimeInMillis();
        long l1 = a.i;
        a.i = l;
        a.g = Math.max(0.0F, a.g - ((float)(l - l1) / 1000F) * 1.5F);
        try
        {
            a.postInvalidate();
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        if (a.g == 0.0F)
        {
            cancel();
        }
    }
}
