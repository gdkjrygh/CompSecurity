// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.skype.android.res.Sounds;

// Referenced classes of package com.skype.android.app.calling:
//            CallAgent

final class this._cls1 extends PhoneStateListener
{

    final l.sounds this$1;

    public final void onCallStateChanged(int i, String s)
    {
        i;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 82
    //                   2 25;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        boolean flag = CallAgent.access$000(_fld0);
        CallAgent.access$100(_fld0);
        CallAgent.access$200(_fld0);
        CallAgent.access$300(_fld0);
        if (flag)
        {
            audioManager.setSpeakerphoneOn(false);
            return;
        }
          goto _L1
_L2:
        CallAgent.access$300(_fld0);
        sounds.c();
        return;
    }

    l.sounds()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/calling/CallAgent$1

/* anonymous class */
    final class CallAgent._cls1
        implements Runnable
    {

        final CallAgent this$0;
        final AudioManager val$audioManager;
        final Sounds val$sounds;
        final TelephonyManager val$telephonyManager;

        public final void run()
        {
            telephonyManager.listen(new CallAgent._cls1._cls1(), 32);
        }

            
            {
                this$0 = final_callagent;
                telephonyManager = telephonymanager;
                audioManager = audiomanager;
                sounds = Sounds.this;
                super();
            }
    }

}
