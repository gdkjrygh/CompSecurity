// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import JF;
import JG;
import Jw;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy

final class this._cls0
    implements JG
{

    final ChatVideoItemProxy this$0;

    public final void a(Jw jw, JF jf)
    {
        int i = ChatVideoItemProxy.a(ChatVideoItemProxy.this);
        boolean flag;
        if (jw.mBitmap == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Timber.a("ChatVideoItemProxy", "[%d] Chat video overlay bitmap decoded, bitmap null? %b", new Object[] {
            Integer.valueOf(i), Boolean.valueOf(flag)
        });
        if (jw.mBitmap != null)
        {
            ChatVideoItemProxy.l(ChatVideoItemProxy.this);
            ChatVideoItemProxy.b(ChatVideoItemProxy.this, false);
            if (ChatVideoItemProxy.e(ChatVideoItemProxy.this) == 3)
            {
                c();
            }
            return;
        } else
        {
            ChatVideoItemProxy.b(ChatVideoItemProxy.this, true);
            ChatVideoItemProxy.this.a(deoState.ERROR);
            return;
        }
    }

    deoState()
    {
        this$0 = ChatVideoItemProxy.this;
        super();
    }
}
