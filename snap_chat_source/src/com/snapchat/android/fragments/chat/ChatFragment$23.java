// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import PI;
import android.view.View;
import com.snapchat.android.ui.CashSwiperView;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements 
{

    private ChatFragment a;

    public final void a(View view)
    {
        ((CashSwiperView)ChatFragment.f(a).a()).setListener(a);
    }

    _cls9(ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
