// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards;


// Referenced classes of package com.kik.cards:
//            KikCardsWebViewFragment

final class i
    implements Runnable
{

    final KikCardsWebViewFragment a;

    i(KikCardsWebViewFragment kikcardswebviewfragment)
    {
        a = kikcardswebviewfragment;
        super();
    }

    public final void run()
    {
        KikCardsWebViewFragment.a(a);
    }
}
