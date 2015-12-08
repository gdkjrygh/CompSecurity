// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaFormat;
import android.util.Log;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            JPlayer, MediaDecoderPipe, VideoDecoderPipe

class this._cls0
    implements Runnable
{

    final JPlayer this$0;

    public void run()
    {
        Object obj;
        obj = new MediaFormat();
        ((MediaFormat) (obj)).setString("mime", "video/avc");
        if (AndroidUtils.getAndroidVersion() > 18)
        {
            ((MediaFormat) (obj)).setInteger("max-width", 720);
            ((MediaFormat) (obj)).setInteger("max-height", 480);
            ((MediaFormat) (obj)).setInteger("width", 720);
            ((MediaFormat) (obj)).setInteger("height", 480);
        } else
        {
            ((MediaFormat) (obj)).setInteger("max-input-size", 0x20000);
            ((MediaFormat) (obj)).setInteger("width", 720);
            ((MediaFormat) (obj)).setInteger("height", 480);
        }
_L3:
        if (JPlayer.access$600(JPlayer.this) != null && (JPlayer.access$500(JPlayer.this) == JPlayer.access$600(JPlayer.this) || !JPlayer.access$600(JPlayer.this).isStopped())) goto _L2; else goto _L1
_L1:
        Log.d("NF_JPlayer", "mVideoPipe1 is idle");
        try
        {
            JPlayer.access$602(JPlayer.this, new VideoDecoderPipe(new deoDataSource(JPlayer.this), "video/avc", ((MediaFormat) (obj)), JPlayer.access$1000(JPlayer.this), "1", JPlayer.access$1100(JPlayer.this)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("NF_JPlayer", Log.getStackTraceString(((Throwable) (obj))));
            if (!JPlayer.access$1200(JPlayer.this))
            {
                JPlayer.access$1300(JPlayer.this, -2, Log.getStackTraceString(((Throwable) (obj))));
            }
            JPlayer.access$502(JPlayer.this, null);
            return;
        }
        JPlayer.access$502(JPlayer.this, JPlayer.access$600(JPlayer.this));
        JPlayer.access$1202(JPlayer.this, true);
        JPlayer.access$600(JPlayer.this).setEventListener(mListener);
_L4:
        InterruptedException interruptedexception;
        if (JPlayer.access$500(JPlayer.this).isDecoderCreated())
        {
            obj = JPlayer.access$900(JPlayer.this).getClock();
            JPlayer.access$500(JPlayer.this).start();
            JPlayer.access$500(JPlayer.this).setReferenceClock(((erPipe.Clock) (obj)));
            return;
        } else
        {
            Log.e("NF_JPlayer", "VideoDecoder initialization failed, exiting...");
            JPlayer.access$502(JPlayer.this, null);
            return;
        }
_L2:
        if (JPlayer.access$800(JPlayer.this) != null && (JPlayer.access$500(JPlayer.this) == JPlayer.access$800(JPlayer.this) || !JPlayer.access$800(JPlayer.this).isStopped()))
        {
            break MISSING_BLOCK_LABEL_541;
        }
        Log.d("NF_JPlayer", "mVideoPipe2 is idle");
        if (JPlayer.access$1400(JPlayer.this) != null)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        if (JPlayer.access$700(JPlayer.this) != null)
        {
            JPlayer.access$1402(JPlayer.this, JPlayer.access$700(JPlayer.this).onGetTextureSurface());
        }
        if (JPlayer.access$1400(JPlayer.this) != null)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        Log.d("NF_JPlayer", "TextureSurface is not ready, wait...");
        Thread.sleep(10L);
          goto _L3
        obj;
        Log.d("NF_JPlayer", "configureVideoPipe interrupted");
          goto _L4
        try
        {
            JPlayer.access$802(JPlayer.this, new VideoDecoderPipe(new deoDataSource(JPlayer.this), "video/avc", ((MediaFormat) (obj)), JPlayer.access$1400(JPlayer.this), "2", JPlayer.access$1100(JPlayer.this)));
        }
        catch (Exception exception)
        {
            JPlayer.access$502(JPlayer.this, null);
            Log.e("NF_JPlayer", Log.getStackTraceString(exception));
            return;
        }
        JPlayer.access$502(JPlayer.this, JPlayer.access$800(JPlayer.this));
        JPlayer.access$800(JPlayer.this).setEventListener(mListener);
          goto _L4
        Thread.sleep(50L);
        Log.d("NF_JPlayer", "video pipe is not ready, wait...");
          goto _L3
        interruptedexception;
        Log.d("NF_JPlayer", "configureVideoPipe interrupted");
          goto _L4
    }

    layerListener()
    {
        this$0 = JPlayer.this;
        super();
    }
}
