// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import java.util.Iterator;
import java.util.List;
import kik.a.d.k;
import kik.a.d.n;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class cl extends i
{

    final KikChatFragment a;

    cl(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (k)obj1;
        if (obj != null) goto _L2; else goto _L1
_L1:
        a.b(false);
_L4:
        return;
_L2:
        if (!(KikChatFragment.j(a) instanceof n))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((n)KikChatFragment.j(a)).w().iterator();
        String s;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)((Iterator) (obj1)).next();
        } while (!((k) (obj)).b().equals(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        a.b(false);
        return;
        if (!((k) (obj)).equals(KikChatFragment.j(a))) goto _L4; else goto _L5
_L5:
        a.b(false);
        return;
    }
}
