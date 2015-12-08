// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements android.view.kListener
{

    private ChatFragment a;

    public final boolean onLongClick(View view)
    {
        ChatFragment.D(a);
        return true;
    }

    (ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
