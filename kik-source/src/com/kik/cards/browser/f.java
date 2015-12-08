// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;


// Referenced classes of package com.kik.cards.browser:
//            SamsungCanvasWitchcraft

final class f
    implements Runnable
{

    final SamsungCanvasWitchcraft a;

    f(SamsungCanvasWitchcraft samsungcanvaswitchcraft)
    {
        a = samsungcanvaswitchcraft;
        super();
    }

    public final void run()
    {
        a.a();
    }
}
