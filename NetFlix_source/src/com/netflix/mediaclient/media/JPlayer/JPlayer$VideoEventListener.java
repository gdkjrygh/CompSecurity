// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.util.Log;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            JPlayer, MediaDecoderPipe

public class this._cls0
    implements ner
{

    final JPlayer this$0;

    public void onDecoderStarted()
    {
        if (JPlayer.access$900(JPlayer.this) != null && JPlayer.access$900(JPlayer.this).isPauseded())
        {
            JPlayer.access$900(JPlayer.this).unpause();
        }
    }

    public void onStartRender()
    {
        if (JPlayer.access$500(JPlayer.this) != JPlayer.access$600(JPlayer.this))
        {
            Log.d("NF_JPlayer", "mVideoPipe2 is current");
            if (JPlayer.access$700(JPlayer.this) != null)
            {
                JPlayer.access$700(JPlayer.this).urface2Visibility(true);
            }
            if (JPlayer.access$600(JPlayer.this) != null && !JPlayer.access$600(JPlayer.this).isStopped())
            {
                JPlayer.access$600(JPlayer.this).stop();
            }
            JPlayer.access$602(JPlayer.this, null);
            return;
        }
        Log.d("NF_JPlayer", "mVideoPipe1 is current");
        if (JPlayer.access$700(JPlayer.this) != null)
        {
            JPlayer.access$700(JPlayer.this).urface2Visibility(false);
        }
        if (JPlayer.access$800(JPlayer.this) != null && !JPlayer.access$800(JPlayer.this).isStopped())
        {
            JPlayer.access$800(JPlayer.this).stop();
        }
        JPlayer.access$802(JPlayer.this, null);
    }

    public void onStop()
    {
    }

    public ner()
    {
        this$0 = JPlayer.this;
        super();
    }
}
