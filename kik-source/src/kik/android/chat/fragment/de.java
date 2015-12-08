// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.sdkutils.y;
import kik.android.widget.ImeAwareEditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class de
    implements Runnable
{

    final KikChatFragment a;

    de(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void run()
    {
        KikChatFragment.e(a).requestFocus();
        if (!KikChatFragment.Z(a) && y.b(11))
        {
            KikChatFragment.e(a).clearFocus();
        }
        a.b(true);
    }
}
