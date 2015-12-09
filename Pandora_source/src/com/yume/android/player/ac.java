// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


// Referenced classes of package com.yume.android.player:
//            YuMePlayerInterfaceImpl, J

final class ac
    implements Runnable
{

    ac()
    {
    }

    public final void run()
    {
        try
        {
            YuMePlayerInterfaceImpl.d.d();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
