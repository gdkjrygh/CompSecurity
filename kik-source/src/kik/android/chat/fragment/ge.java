// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.Toast;
import com.kik.g.r;
import kik.a.d.a.a;
import kik.android.f.a.f;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, gf

final class ge extends r
{

    final KikChatFragment a;

    ge(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        KikChatFragment.ag(a).a(((a) (obj)), false, null);
        a.b(new gf(this));
        super.c();
    }

    public final void a(Throwable throwable)
    {
        if (KikChatFragment.aq(a) != null)
        {
            Toast.makeText(KikChatFragment.aq(a).getContext(), "Failed to attach!", 0).show();
        }
        super.a(throwable);
    }
}
