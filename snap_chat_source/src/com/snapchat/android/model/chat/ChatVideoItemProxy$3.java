// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import BJ;
import android.media.MediaPlayer;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.TextureVideoView;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy, ChatMedia

final class this._cls0
    implements android.media.pleteListener
{

    final ChatVideoItemProxy this$0;

    public final void onSeekComplete(MediaPlayer mediaplayer)
    {
        if (ChatVideoItemProxy.e(ChatVideoItemProxy.this) == 3)
        {
            Timber.a("ChatVideoItemProxy", "[%d] Starting chat video playback after onSeekComplete %s", new Object[] {
                Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
            });
            ChatVideoItemProxy.f(ChatVideoItemProxy.this).start();
            a(deoState.PLAYING);
            ChatVideoItemProxy.a(ChatVideoItemProxy.this, 3);
            if (ChatVideoItemProxy.g(ChatVideoItemProxy.this) != null)
            {
                ChatVideoItemProxy.g(ChatVideoItemProxy.this).f();
            }
        }
    }

    deoState()
    {
        this$0 = ChatVideoItemProxy.this;
        super();
    }
}
