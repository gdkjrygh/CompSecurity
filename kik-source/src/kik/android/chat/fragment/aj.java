// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment

final class aj extends i
{

    final ConversationsBaseFragment a;

    aj(ConversationsBaseFragment conversationsbasefragment)
    {
        a = conversationsbasefragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if (!ConversationsBaseFragment.a(a))
        {
            obj = a.a.a(((String) (obj)));
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
