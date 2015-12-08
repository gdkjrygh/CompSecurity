// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            AbstractSnapTimerView

final class a
    implements Runnable
{

    private int a;
    private AbstractSnapTimerView b;

    public final void run()
    {
        AbstractSnapTimerView.a(b, a);
        if (a == 0)
        {
            b.run();
        }
    }

    (AbstractSnapTimerView abstractsnaptimerview, int i)
    {
        b = abstractsnaptimerview;
        a = i;
        super();
    }
}
