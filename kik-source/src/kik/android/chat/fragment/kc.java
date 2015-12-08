// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kc extends r
{

    final KikConversationsFragment a;

    kc(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        if ((Boolean)obj == null)
        {
            KikConversationsFragment.a(a);
        }
    }

    public final void a(Throwable throwable)
    {
        KikConversationsFragment.a(a);
    }
}
