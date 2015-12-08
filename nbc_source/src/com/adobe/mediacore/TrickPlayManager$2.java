// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            SeekAdjustCompletedListener, TrickPlayManager, VideoEngineDispatcher, VideoEngineAdapter, 
//            MediaPlayer

class this._cls0
    implements SeekAdjustCompletedListener
{

    final TrickPlayManager this$0;

    public void onAdjustCompleted(long l)
    {
        if (TrickPlayManager.access$200(TrickPlayManager.this) != null)
        {
            TrickPlayManager.access$100(TrickPlayManager.this).removeEventListener(pe.SEEK_ADJUST_COMPLETED, TrickPlayManager.access$200(TrickPlayManager.this));
        }
        TrickPlayManager.access$300(TrickPlayManager.this).seek(.TimeMapping.create(-1, l));
        if (TrickPlayManager.access$400(TrickPlayManager.this) == 0.0F)
        {
            TrickPlayManager.access$600().i((new StringBuilder()).append(TrickPlayManager.access$500()).append("#changePlaybackRate").toString(), (new StringBuilder()).append("returning to pause mode, position: ").append(l).toString());
            TrickPlayManager.access$700(TrickPlayManager.this).pause();
        } else
        if (TrickPlayManager.access$400(TrickPlayManager.this) == 1.0F)
        {
            TrickPlayManager.access$600().i((new StringBuilder()).append(TrickPlayManager.access$500()).append("#changePlaybackRate").toString(), (new StringBuilder()).append("returning to play mode, position: ").append(l).toString());
            TrickPlayManager.access$700(TrickPlayManager.this).play();
        } else
        {
            TrickPlayManager.access$600().i((new StringBuilder()).append(TrickPlayManager.access$500()).append("#changePlaybackRate").toString(), (new StringBuilder()).append("returning to slow motion mode, position: ").append(l).toString());
            TrickPlayManager.access$800(TrickPlayManager.this, TrickPlayManager.access$400(TrickPlayManager.this));
        }
        TrickPlayManager.access$002(TrickPlayManager.this, false);
        TrickPlayManager.access$902(TrickPlayManager.this, -1L);
    }

    .TimeMapping()
    {
        this$0 = TrickPlayManager.this;
        super();
    }
}
