// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.i;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, hy

final class hx extends i
{

    final KikChatInfoFragment a;

    hx(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if (obj != null && ((String) (obj)).equals(KikChatInfoFragment.a(a).b()))
        {
            KikChatInfoFragment.g(a).postAtFrontOfQueue(new hy(this));
        }
    }
}
