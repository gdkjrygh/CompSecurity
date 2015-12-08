// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.os.Message;
import com.kik.g.i;
import kik.a.d.f;
import kik.a.e.v;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ch extends i
{

    final KikChatFragment a;

    ch(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String[])obj1;
        obj1 = KikChatFragment.y(a).obtainMessage(2);
        obj1.obj = obj;
        KikChatFragment.y(a).sendMessage(((Message) (obj1)));
        if (obj != null && obj.length > 0 && KikChatFragment.z(a) != null && obj[0].equals(KikChatFragment.z(a).b()))
        {
            a.d.a(KikChatFragment.z(a), KikChatFragment.G(a));
        }
    }
}
