// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import android.view.View;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy, ChatMedia

final class this._cls0
    implements android.view.atVideoItemProxy._cls1
{

    final ChatVideoItemProxy this$0;

    public final void onClick(View view)
    {
        Timber.a("ChatVideoItemProxy", "[%d] Chat video reload clicked %s", new Object[] {
            Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
        });
        if (ChatVideoItemProxy.c(ChatVideoItemProxy.this) || ChatVideoItemProxy.d(ChatVideoItemProxy.this))
        {
            b();
        }
    }

    ()
    {
        this$0 = ChatVideoItemProxy.this;
        super();
    }
}
