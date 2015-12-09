// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


// Referenced classes of package com.yume.android.player:
//            YuMePlayerInterfaceImpl, J, S, B

final class ab
    implements Runnable
{

    private S a;

    ab(S s)
    {
        a = s;
        super();
    }

    public final void run()
    {
        try
        {
            if (YuMePlayerInterfaceImpl.d != null)
            {
                YuMePlayerInterfaceImpl.d.o();
            }
            return;
        }
        catch (Exception exception)
        {
            a.a.c("Exception Notifying Orientation Change.");
            exception.printStackTrace();
            return;
        }
    }
}
