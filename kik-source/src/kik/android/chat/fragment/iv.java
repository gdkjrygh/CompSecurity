// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.chat.activity.k;
import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class iv
    implements Runnable
{

    final String a;
    final KikCodeFragment b;

    iv(KikCodeFragment kikcodefragment, String s)
    {
        b = kikcodefragment;
        a = s;
        super();
    }

    public final void run()
    {
        k.a((new KikChatFragment.a()).a(a).d(false), b._drawArea.getContext()).b().f();
    }
}
