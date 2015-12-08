// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.Toast;

// Referenced classes of package kik.android.chat.fragment:
//            eq, KikChatFragment

final class er
    implements Runnable
{

    final eq a;

    er(eq eq1)
    {
        a = eq1;
        super();
    }

    public final void run()
    {
        Toast.makeText(KikChatFragment.aq(a.c).getContext(), KikChatFragment.b(0x7f09035d), 0).show();
    }
}
