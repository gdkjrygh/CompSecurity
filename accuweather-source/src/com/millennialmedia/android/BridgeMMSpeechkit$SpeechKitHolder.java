// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            BridgeMMSpeechkit, NVASpeechKit

private static class <init>
{

    private NVASpeechKit _speechKit;

    public NVASpeechKit getSpeechKit()
    {
        return _speechKit;
    }

    public boolean release()
    {
        if (_speechKit == null)
        {
            return false;
        } else
        {
            _speechKit(new Runnable() {

                final BridgeMMSpeechkit.SpeechKitHolder this$0;

                public void run()
                {
                    synchronized (BridgeMMSpeechkit.SpeechKitHolder.this)
                    {
                        if (_speechKit != null)
                        {
                            _speechKit.cancelRecording();
                            _speechKit.release();
                            _speechKit = null;
                        }
                    }
                    return;
                    exception;
                    speechkitholder;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = BridgeMMSpeechkit.SpeechKitHolder.this;
                super();
            }
            });
            return true;
        }
    }

    public void setSpeechKit(NVASpeechKit nvaspeechkit)
    {
        _speechKit = nvaspeechkit;
    }



/*
    static NVASpeechKit access$002(_cls1 _pcls1, NVASpeechKit nvaspeechkit)
    {
        _pcls1._speechKit = nvaspeechkit;
        return nvaspeechkit;
    }

*/

    private _cls1.this._cls0()
    {
    }

    _cls1.this._cls0(_cls1.this._cls0 _pcls0)
    {
        this();
    }
}
