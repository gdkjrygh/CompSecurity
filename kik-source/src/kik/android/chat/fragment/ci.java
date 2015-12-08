// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.p;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, cj

final class ci
    implements kik.android.util.bw.a
{

    final KikChatFragment a;

    ci(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            KikChatFragment.a(a, s).a(new cj(this, s));
            return;
        }
    }
}
