// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.Toast;
import kik.android.v;

// Referenced classes of package kik.android.chat.fragment:
//            eq, KikChatFragment

final class es
    implements Runnable
{

    final Throwable a;
    final eq b;

    es(eq eq1, Throwable throwable)
    {
        b = eq1;
        a = throwable;
        super();
    }

    public final void run()
    {
        if (a instanceof v)
        {
            Toast.makeText(KikChatFragment.aq(b.c).getContext(), KikChatFragment.b(0x7f090205), 0).show();
            return;
        } else
        {
            Toast.makeText(KikChatFragment.aq(b.c).getContext(), KikChatFragment.b(0x7f090204), 0).show();
            return;
        }
    }
}
