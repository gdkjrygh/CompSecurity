// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.i;
import kik.a.d.f;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class cf extends i
{

    final KikChatFragment a;

    cf(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        for (obj = (f)obj1; obj == null || KikChatFragment.j(a) == null || !((f) (obj)).b().equals(KikChatFragment.j(a).b());)
        {
            return;
        }

        KikChatFragment.y(a).sendEmptyMessage(1);
    }
}
