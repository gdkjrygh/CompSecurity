// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.util.av;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment, ii

final class ih
    implements Runnable
{

    final KikCodeFragment a;

    ih(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void run()
    {
        av.a(a._drawArea, 300, 0L, new ii(this));
        av.a(a._tellAFriendImage, 300, 0L, null);
    }
}
