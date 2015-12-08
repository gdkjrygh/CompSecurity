// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.i;
import kik.a.d.a.g;
import kik.a.d.s;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment

final class al extends i
{

    final ConversationsBaseFragment a;

    al(ConversationsBaseFragment conversationsbasefragment)
    {
        a = conversationsbasefragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        boolean flag1 = true;
        obj = (s)obj1;
        boolean flag2 = g.b(((s) (obj)));
        byte byte0;
        boolean flag;
        if (ConversationsBaseFragment.c(a) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null)
        {
            obj = a.a.a(((s) (obj)).i());
            if ((a.a.a(((kik.a.d.f) (obj))) & a.a()) != 0)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
        } else
        {
            byte0 = 0;
        }
        if (flag2 && !flag && byte0 != 0)
        {
            byte0 = flag1;
        } else
        {
            byte0 = 0;
        }
        obj = ConversationsBaseFragment.d(a);
        if (byte0 != 0)
        {
            byte0 = 4;
        } else
        {
            byte0 = 3;
        }
        ((Handler) (obj)).sendEmptyMessage(byte0);
    }
}
