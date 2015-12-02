// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

// Referenced classes of package com.facebook.common.hardware:
//            f, g

class i extends PhoneStateListener
{

    final f a;

    private i(f f1)
    {
        a = f1;
        super();
    }

    i(f f1, g g)
    {
        this(f1);
    }

    public void onSignalStrengthsChanged(SignalStrength signalstrength)
    {
        f.a(a);
    }
}
