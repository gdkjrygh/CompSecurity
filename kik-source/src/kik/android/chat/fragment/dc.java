// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.android.c.f;
import kik.android.widget.ImeAwareEditText;

// Referenced classes of package kik.android.chat.fragment:
//            db, KikChatFragment

final class dc
    implements Runnable
{

    final db a;

    dc(db db1)
    {
        a = db1;
        super();
    }

    public final void run()
    {
        if (a.a.q != null && KikChatFragment.e(a.a) != null)
        {
            f f1 = a.a.q;
            f.b(KikChatFragment.e(a.a).getText());
        }
    }
}
