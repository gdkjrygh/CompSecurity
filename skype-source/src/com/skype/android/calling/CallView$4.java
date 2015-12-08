// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;


// Referenced classes of package com.skype.android.calling:
//            CallView

final class a
    implements Runnable
{

    final CallView a;

    public final void run()
    {
        a.requestLayout();
    }

    (CallView callview)
    {
        a = callview;
        super();
    }
}
