// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.os.Message;
import com.kik.g.i;
import java.util.Iterator;
import java.util.List;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.n;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class by extends i
{

    final KikChatFragment a;

    by(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if (obj != null && KikChatFragment.j(a) != null)
        {
            if (KikChatFragment.w(a) != null || KikChatFragment.x(a) != null)
            {
                KikChatFragment.y(a).sendEmptyMessage(6);
            }
            if (((String) (obj)).equals(KikChatFragment.j(a).b()))
            {
                obj1 = KikChatFragment.y(a).obtainMessage(3);
                obj1.obj = obj;
                if (KikChatFragment.z(a) != null)
                {
                    KikChatFragment.z(a).v();
                }
                KikChatFragment.y(a).sendMessage(((Message) (obj1)));
                return;
            }
            if (KikChatFragment.j(a) instanceof n)
            {
                obj1 = ((n)KikChatFragment.j(a)).w().iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    if (((String) (obj)).equals((String)((Iterator) (obj1)).next()))
                    {
                        obj = KikChatFragment.y(a).obtainMessage(3);
                        obj.obj = KikChatFragment.j(a).b();
                        KikChatFragment.y(a).sendMessage(((Message) (obj)));
                        return;
                    }
                }
            }
        }
    }
}
