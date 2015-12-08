// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import kik.a.d.a.g;
import kik.a.d.s;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment

final class ak extends i
{

    final ConversationsBaseFragment a;

    ak(ConversationsBaseFragment conversationsbasefragment)
    {
        a = conversationsbasefragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (s)obj1;
        if (!ConversationsBaseFragment.a(a) && g.b(((s) (obj))))
        {
            obj = a.a.a(((s) (obj)).i());
            boolean flag;
            if ((a.a.a(((kik.a.d.f) (obj))) & a.a()) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ConversationsBaseFragment.b(a);
            }
        }
    }
}
