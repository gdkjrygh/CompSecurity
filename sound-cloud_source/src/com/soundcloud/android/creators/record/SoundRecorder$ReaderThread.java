// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Intent;
import android.media.AudioRecord;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.soundcloud.android.api.legacy.model.Recording;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, AudioConfig, RecordStream, PlaybackStream

class setPriority extends Thread
{

    final SoundRecorder this$0;

    public void run()
    {
label0:
        {
            obj = null;
            synchronized (SoundRecorder.access$500(SoundRecorder.this))
            {
                String s = SoundRecorder.TAG;
                (new StringBuilder("starting reader thread: state=")).append(SoundRecorder.access$000(SoundRecorder.this));
                if (SoundRecorder.access$500(SoundRecorder.this).getState() == 1)
                {
                    break label0;
                }
                obj = SoundRecorder.TAG;
                SoundRecorder.access$002(SoundRecorder.this, this._fld0);
                SoundRecorder.access$700(SoundRecorder.this, "com.soundcloud.android.recorderror");
            }
            return;
        }
        SoundRecorder.access$500(SoundRecorder.this).startRecording();
        SoundRecorder.access$500(SoundRecorder.this).setPositionNotificationPeriod(SoundRecorder.access$1200(SoundRecorder.this).sampleRate);
_L1:
        int i;
        if (SoundRecorder.access$000(SoundRecorder.this) !=  && SoundRecorder.access$000(SoundRecorder.this) != NG)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        SoundRecorder.access$1500(SoundRecorder.this).rewind();
        i = SoundRecorder.access$500(SoundRecorder.this).read(SoundRecorder.access$1500(SoundRecorder.this), SoundRecorder.access$1600(SoundRecorder.this));
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        String s1 = SoundRecorder.TAG;
        SoundRecorder.access$002(SoundRecorder.this, this._fld0);
          goto _L1
        obj;
        audiorecord;
        JVM INSTR monitorexit ;
        throw obj;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        Object obj1 = SoundRecorder.TAG;
          goto _L1
label1:
        {
            if (SoundRecorder.access$000(SoundRecorder.this) != NG || SoundRecorder.access$100(SoundRecorder.this) > 0L)
            {
                break label1;
            }
            obj1 = SoundRecorder.TAG;
            SoundRecorder.access$002(SoundRecorder.this, G);
        }
          goto _L1
        int j;
        SoundRecorder.access$1500(SoundRecorder.this).limit(i);
        j = SoundRecorder.access$1700(SoundRecorder.this).write(SoundRecorder.access$1500(SoundRecorder.this), i);
        if (j < 0 || j >= i)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        obj1 = SoundRecorder.TAG;
        obj1 = (new Intent("com.soundcloud.android.recordsample")).putExtra("amplitude", SoundRecorder.access$1700(SoundRecorder.this).getLastAmplitude()).putExtra("elapsedTime", getRecordingElapsedTime());
        SoundRecorder.access$300(SoundRecorder.this).sendBroadcast(((Intent) (obj1)));
          goto _L1
        IOException ioexception;
        ioexception;
        ioexception = SoundRecorder.TAG;
        SoundRecorder.access$002(SoundRecorder.this, this._fld0);
        ioexception = SoundRecorder.TAG;
        (new StringBuilder("exiting reader loop, stopping recording (state=")).append(SoundRecorder.access$000(SoundRecorder.this)).append(")");
        SoundRecorder.access$500(SoundRecorder.this).stop();
        if (SoundRecorder.access$1800(SoundRecorder.this) == null) goto _L3; else goto _L2
_L2:
        obj = SoundRecorder.access$000(SoundRecorder.this);
        ioexception = this._fld0;
        if (obj == ioexception) goto _L5; else goto _L4
_L4:
        SoundRecorder.access$1700(SoundRecorder.this).finalizeStream(SoundRecorder.access$1800(SoundRecorder.this).getAmplitudeFile());
        if (SoundRecorder.access$900(SoundRecorder.this) != null) goto _L7; else goto _L6
_L6:
        SoundRecorder.access$902(SoundRecorder.this, new PlaybackStream(SoundRecorder.access$1700(SoundRecorder.this).getAudioReader()));
_L8:
        saveState();
        obj = "com.soundcloud.android.recordfinished";
_L3:
        SoundRecorder.access$002(SoundRecorder.this, this._fld0);
        readerThread = null;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            SoundRecorder.access$700(SoundRecorder.this, ((String) (obj)));
        }
        audiorecord;
        JVM INSTR monitorexit ;
        return;
_L7:
        SoundRecorder.access$900(SoundRecorder.this).reopen();
        SoundRecorder.access$900(SoundRecorder.this).resetBounds();
          goto _L8
        obj;
        SoundRecorder.access$002(SoundRecorder.this, this._fld0);
        obj = "com.soundcloud.android.recorderror";
        ioexception = SoundRecorder.TAG;
          goto _L3
_L5:
        SoundRecorder.access$902(SoundRecorder.this, null);
        obj = "com.soundcloud.android.recorderror";
          goto _L3
    }

    ()
    {
        this$0 = SoundRecorder.this;
        super("ReaderThread");
        setPriority(10);
    }
}
