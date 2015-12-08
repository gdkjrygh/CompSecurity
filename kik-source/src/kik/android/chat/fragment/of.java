// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;

// Referenced classes of package kik.android.chat.fragment:
//            KikPromotedChatsFragment, og

final class of extends i
{

    final KikPromotedChatsFragment a;

    of(KikPromotedChatsFragment kikpromotedchatsfragment)
    {
        a = kikpromotedchatsfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        if (a.k != KikSponsoredBaseFragment.a.a)
        {
            a.h = true;
        }
        a.b(new og(this));
    }
}
