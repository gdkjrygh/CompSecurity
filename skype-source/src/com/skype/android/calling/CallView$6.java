// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;


// Referenced classes of package com.skype.android.calling:
//            CallView, a, CallViewAdapter

final class a
    implements Runnable
{

    final CallView a;

    public final void run()
    {
        if (CallView.l(a) != null && CallView.j(a) != null)
        {
            CallView.j(a).bindTileView(CallView.m(a), CallView.l(a).a());
        }
    }

    pter(CallView callview)
    {
        a = callview;
        super();
    }
}
