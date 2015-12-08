// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;


// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment, bd

final class u
    implements Runnable
{

    final CardsWebViewFragment a;

    u(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void run()
    {
        CardsWebViewFragment.b(a).stopLoading();
        CardsWebViewFragment.b(a).clearFormData();
        CardsWebViewFragment.b(a).clearAnimation();
        CardsWebViewFragment.b(a).clearDisappearingChildren();
        CardsWebViewFragment.b(a).clearView();
        CardsWebViewFragment.b(a).clearHistory();
        CardsWebViewFragment.b(a).destroyDrawingCache();
        CardsWebViewFragment.b(a).freeMemory();
        CardsWebViewFragment.b(a).destroy();
        System.gc();
    }
}
