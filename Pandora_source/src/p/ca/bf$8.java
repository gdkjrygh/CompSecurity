// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.media.MediaPlayer;
import android.telephony.PhoneStateListener;

// Referenced classes of package p.ca:
//            bf

class a extends PhoneStateListener
{

    int a;
    final bf b;

    public void onCallStateChanged(int i, String s)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 58
    //                   1 34
    //                   2 46;
           goto _L1 _L2 _L3 _L4
_L1:
        a = i;
        return;
_L3:
        b.a("onCallStateChanged: Call Ringing");
        continue; /* Loop/switch isn't completed */
_L4:
        b.a("onCallStateChanged: Call Off Hook");
        continue; /* Loop/switch isn't completed */
_L2:
        b.a("onCallStateChanged: Call IDLE");
        if (b.b != null && a != 0 && !b.b.isPlaying() && b.k && !b.l)
        {
            b.b.start();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    String(bf bf1)
    {
        b = bf1;
        super();
        a = 0;
    }
}
