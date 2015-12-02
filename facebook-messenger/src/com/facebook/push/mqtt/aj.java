// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            ai

class aj
    implements Runnable
{

    final ai a;

    aj(ai ai1)
    {
        a = ai1;
        super();
    }

    public void run()
    {
        ai.a(a, false);
        a.b();
    }
}
