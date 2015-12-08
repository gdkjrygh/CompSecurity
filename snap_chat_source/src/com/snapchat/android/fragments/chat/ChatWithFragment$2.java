// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatWithFragment

final class a
    implements android.view.r
{

    private ChatWithFragment a;

    public final void onClick(View view)
    {
        ChatWithFragment.a(a).setText("");
    }

    (ChatWithFragment chatwithfragment)
    {
        a = chatwithfragment;
        super();
    }
}
