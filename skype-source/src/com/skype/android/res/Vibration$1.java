// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.os.Vibrator;
import java.util.TimerTask;

// Referenced classes of package com.skype.android.res:
//            Vibration

final class a extends TimerTask
{

    final Vibration a;

    public final void run()
    {
        a.a.vibrate(750L);
    }

    (Vibration vibration)
    {
        a = vibration;
        super();
    }
}
