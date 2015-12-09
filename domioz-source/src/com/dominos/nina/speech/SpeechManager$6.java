// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.app.Activity;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.nuance.b.b.bx;
import com.nuance.b.e.c;
import com.nuance.b.e.u;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager

class this._cls0
    implements u
{

    final SpeechManager this$0;

    public void started()
    {
        class _cls1
            implements r
        {

            final SpeechManager._cls6 this$1;

            public void onEnergyLevel(p p1)
            {
                PowerManager powermanager = (PowerManager)getCurrentNinaActivity().getSystemService("power");
                if (p1.b > 40F)
                {
                    int i;
                    if (q.a == p1.c)
                    {
                        i = 0x2000000a;
                    } else
                    {
                        i = 0x20000006;
                    }
                    powermanager.newWakeLock(i, "NinaWake").acquire(1L);
                }
            }

            _cls1()
            {
                this$1 = SpeechManager._cls6.this;
                super();
            }
        }

        class _cls2
            implements o
        {

            final SpeechManager._cls6 this$1;

            public void onEndOfSpeech(n n)
            {
            }

            public void onStartOfSpeech(ap ap)
            {
                c.a("I only heard noise. Tap to wake me up.");
            }

            _cls2()
            {
                this$1 = SpeechManager._cls6.this;
                super();
            }
        }

        class _cls3
            implements am
        {

            final SpeechManager._cls6 this$1;

            public void onAudioCollected(a a)
            {
            }

            public void onRecordingError(ak ak)
            {
            }

            public void onRecordingStarted(an an)
            {
                c.a();
            }

            public void onRecordingStopped(ao ao)
            {
            }

            _cls3()
            {
                this$1 = SpeechManager._cls6.this;
                super();
            }
        }

        boolean flag;
        if (getCurrentNinaActivity().checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && SpeechManager.access$500(SpeechManager.this) == null)
        {
            SpeechManager.access$502(SpeechManager.this, new _cls1());
        }
        c.f().a(SpeechManager.access$500(SpeechManager.this));
        SpeechManager.access$702(SpeechManager.this, new _cls2());
        c.f().a(SpeechManager.access$700(SpeechManager.this));
        SpeechManager.access$602(SpeechManager.this, new _cls3());
        c.f().a(SpeechManager.access$600(SpeechManager.this));
    }

    public void stopped()
    {
        SpeechManager.access$302(SpeechManager.this, true);
        SpeechManager.access$402(SpeechManager.this, true);
        if (SpeechManager.access$500(SpeechManager.this) != null)
        {
            c.f().b(SpeechManager.access$500(SpeechManager.this));
            SpeechManager.access$502(SpeechManager.this, null);
        }
        if (SpeechManager.access$600(SpeechManager.this) != null)
        {
            c.f().b(SpeechManager.access$600(SpeechManager.this));
            SpeechManager.access$602(SpeechManager.this, null);
        }
        if (SpeechManager.access$700(SpeechManager.this) != null)
        {
            c.f().b(SpeechManager.access$700(SpeechManager.this));
            SpeechManager.access$702(SpeechManager.this, null);
        }
        App.getInstance().bus.post(new com.dominos.bus.events.eSpeechBarEvent(getCurrentNinaActivity()));
    }

    ventBus()
    {
        this$0 = SpeechManager.this;
        super();
    }
}
