// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.media.MediaPlayer;
import com.google.android.libraries.translate.tts.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.tts.network:
//            g

public final class c extends g
{

    public c(List list, e e)
    {
        super(list, e);
    }

    protected final void a()
    {
        Iterator iterator = a.iterator();
        MediaPlayer mediaplayer = null;
        while (iterator.hasNext()) 
        {
            MediaPlayer mediaplayer1 = (MediaPlayer)iterator.next();
            if (mediaplayer == null)
            {
                mediaplayer = mediaplayer1;
            } else
            {
                mediaplayer.setNextMediaPlayer(mediaplayer1);
                mediaplayer = mediaplayer1;
            }
        }
        mediaplayer.setOnCompletionListener(this);
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        b();
    }
}
