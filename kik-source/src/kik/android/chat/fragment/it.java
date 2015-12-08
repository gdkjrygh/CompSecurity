// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class it
    implements Runnable
{

    final KikCodeFragment a;

    it(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void run()
    {
        a._drawArea.a(KikCodeFragment.i(a));
        KikCodeFragment.g(a);
    }
}
