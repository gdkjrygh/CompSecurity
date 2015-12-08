// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikPromotedChatsFragment, oi

final class oh
    implements Runnable
{

    final KikPromotedChatsFragment a;

    oh(KikPromotedChatsFragment kikpromotedchatsfragment)
    {
        a = kikpromotedchatsfragment;
        super();
    }

    public final void run()
    {
        if (a.k != KikSponsoredBaseFragment.a.b)
        {
            a.k = KikSponsoredBaseFragment.a.c;
            a.b(new oi(this));
        }
    }
}
