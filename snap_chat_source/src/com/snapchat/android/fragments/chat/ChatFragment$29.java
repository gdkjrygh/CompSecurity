// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import PI;
import android.view.View;
import su;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements android.view.ener
{

    private ChatFragment a;

    public final void onClick(View view)
    {
        if (a.e == null)
        {
            ChatFragment.l(a).a();
        }
        if (a.e != null && ChatFragment.l(a).b() && a.e.a(a.f))
        {
            a.p();
        }
    }

    _cls9(ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
