// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import kik.a.e.b;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kk extends r
{

    final KikConversationsFragment a;

    kk(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Boolean)obj;
        if (obj != null && ((Boolean) (obj)).booleanValue())
        {
            a.n.f();
        }
    }
}
