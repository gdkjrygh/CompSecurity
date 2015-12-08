// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import android.media.MediaPlayer;
import com.snapchat.android.analytics.framework.EasyMetric;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy, ChatMedia

final class this._cls0
    implements android.media.stener
{

    final ChatVideoItemProxy this$0;

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = String.format("[%d] Chat video error %s what(%d) extra(%d)", new Object[] {
            Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d(), Integer.valueOf(i), Integer.valueOf(j)
        });
        if (ChatVideoItemProxy.i(ChatVideoItemProxy.this) == 1 && i == 1)
        {
            if (ChatVideoItemProxy.j(ChatVideoItemProxy.this) < 3)
            {
                ChatVideoItemProxy.b(ChatVideoItemProxy.this, ChatVideoItemProxy.j(ChatVideoItemProxy.this) + 1);
                ChatVideoItemProxy.k(ChatVideoItemProxy.this);
            } else
            {
                (new EasyMetric("CHAT_VIDEO_RETRY_LIMIT_REACHED")).a("mediaId", ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()).b(false);
            }
        }
        ChatVideoItemProxy.a(ChatVideoItemProxy.this, mediaplayer, i);
        return true;
    }

    ()
    {
        this$0 = ChatVideoItemProxy.this;
        super();
    }
}
