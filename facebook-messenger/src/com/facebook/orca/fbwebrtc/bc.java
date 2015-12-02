// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb, ag

class bc extends PhoneStateListener
{

    final bb a;

    bc(bb bb1)
    {
        a = bb1;
        super();
    }

    public void onCallStateChanged(int i, String s)
    {
        boolean flag = bb.a(a).isMicrophoneMute();
        if (i != 0)
        {
            flag = true;
        }
        bb.b(a).a(flag);
        super.onCallStateChanged(i, s);
    }
}
