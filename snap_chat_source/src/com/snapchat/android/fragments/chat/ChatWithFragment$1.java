// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import Jo;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatWithFragment

final class a
    implements android.view.istener
{

    private ChatWithFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            Jo.h(a.getActivity());
        }
    }

    (ChatWithFragment chatwithfragment)
    {
        a = chatwithfragment;
        super();
    }
}
