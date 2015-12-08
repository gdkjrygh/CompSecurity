// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            TalkToCoverView

final class ec
    implements Runnable
{

    final TalkToCoverView a;

    ec(TalkToCoverView talktocoverview)
    {
        a = talktocoverview;
        super();
    }

    public final void run()
    {
        if (TalkToCoverView.f(a) != null && TalkToCoverView.g(a) != null)
        {
            TalkToCoverView.h(a);
        }
    }
}
