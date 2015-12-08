// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.Toast;

// Referenced classes of package kik.android.chat.fragment:
//            en, KikChatFragment

final class ep
    implements Runnable
{

    final en a;

    ep(en en1)
    {
        a = en1;
        super();
    }

    public final void run()
    {
        Toast.makeText(KikChatFragment.aq(a.c).getContext(), a.c.getString(0x7f090204), 0).show();
    }
}
