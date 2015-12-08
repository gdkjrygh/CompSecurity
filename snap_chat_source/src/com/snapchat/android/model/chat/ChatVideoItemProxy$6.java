// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import android.media.MediaPlayer;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy, ChatMedia

final class this._cls0
    implements android.media.ionListener
{

    final ChatVideoItemProxy this$0;

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        Timber.a("ChatVideoItemProxy", "[%d] Chat video playback completed %s", new Object[] {
            Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
        });
        ChatVideoItemProxy.a(ChatVideoItemProxy.this, true);
        mediaplayer.setLooping(true);
        mediaplayer.start();
    }

    ()
    {
        this$0 = ChatVideoItemProxy.this;
        super();
    }
}
