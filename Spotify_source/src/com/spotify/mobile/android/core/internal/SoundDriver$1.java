// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import android.media.AudioTrack;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.spotify.mobile.android.core.internal:
//            SoundDriver

class this._cls0
    implements Runnable
{

    final SoundDriver this$0;

    public void run()
    {
        if (SoundDriver.access$000(SoundDriver.this) != null)
        {
            Iterator iterator = SoundDriver.access$100().iterator();
            while (iterator.hasNext()) 
            {
                ((undDriverListener)iterator.next()).onEqualizerShouldBeEnabled(SoundDriver.access$000(SoundDriver.this).getAudioSessionId());
            }
        }
    }

    undDriverListener()
    {
        this$0 = SoundDriver.this;
        super();
    }
}
