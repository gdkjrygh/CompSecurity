// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import android.media.MediaPlayer;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.TextureVideoView;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy, ChatMedia

final class this._cls0
    implements android.media.dListener
{

    final ChatVideoItemProxy this$0;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        Timber.a("ChatVideoItemProxy", "[%d] Chat video prepared %s", new Object[] {
            Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
        });
        int i = mediaplayer.getVideoWidth();
        int j = mediaplayer.getVideoHeight();
        if (i <= 0 || j <= 0)
        {
            ChatVideoItemProxy.f(ChatVideoItemProxy.this).a();
            mediaplayer = String.format("[%d] Video %s could not be loaded due to invalid dimensions: %d x %d", new Object[] {
                Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d(), Integer.valueOf(i), Integer.valueOf(j)
            });
            ChatVideoItemProxy.a(ChatVideoItemProxy.this, mediaplayer, 1);
        } else
        {
            ChatVideoItemProxy.a(ChatVideoItemProxy.this, 2);
            ChatVideoItemProxy.h(ChatVideoItemProxy.this);
            ChatVideoItemProxy.a(ChatVideoItemProxy.this, false);
            if (!ChatVideoItemProxy.b(ChatVideoItemProxy.this).P() || ChatVideoItemProxy.f(ChatVideoItemProxy.this).g)
            {
                mediaplayer.setVolume(0.0F, 0.0F);
            }
            if (ChatVideoItemProxy.e(ChatVideoItemProxy.this) == 3)
            {
                c();
                return;
            }
        }
    }

    ()
    {
        this$0 = ChatVideoItemProxy.this;
        super();
    }
}
