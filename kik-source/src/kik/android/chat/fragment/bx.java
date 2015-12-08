// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import kik.a.d.f;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class bx extends i
{

    final KikChatFragment a;

    bx(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (f)obj1;
        if (obj == null || KikChatFragment.z(a) != null && KikChatFragment.z(a).b() != null && ((f) (obj)).b() != null && ((f) (obj)).b().equals(KikChatFragment.z(a).b()))
        {
            KikChatFragment.A(a);
        }
    }
}
