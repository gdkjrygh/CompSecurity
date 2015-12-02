// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.facebook.debug.log.b;
import com.facebook.n;
import com.facebook.widget.refreshablelistview.c;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment, av

class au extends c
{

    final ThreadListFragment a;

    au(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    public void a(boolean flag)
    {
        if (flag && !com.facebook.orca.threadlist.ThreadListFragment.c(a).isMusicActive())
        {
            try
            {
                AssetFileDescriptor assetfiledescriptor = a.o().openRawResourceFd(n.refresh);
                MediaPlayer mediaplayer = new MediaPlayer();
                mediaplayer.setDataSource(assetfiledescriptor.getFileDescriptor(), assetfiledescriptor.getStartOffset(), assetfiledescriptor.getLength());
                assetfiledescriptor.close();
                mediaplayer.setAudioStreamType(1);
                mediaplayer.setVolume(0.3F, 0.3F);
                mediaplayer.setOnCompletionListener(new av(this));
                mediaplayer.prepare();
                mediaplayer.start();
            }
            catch (Throwable throwable)
            {
                b.b(ThreadListFragment.d(), "MediaPlayer create failed: ", throwable);
            }
        }
        a.a();
    }
}
