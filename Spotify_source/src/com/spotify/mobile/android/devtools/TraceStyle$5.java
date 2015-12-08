// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.devtools;

import android.os.Debug;

// Referenced classes of package com.spotify.mobile.android.devtools:
//            TraceStyle

final class  extends Thread
{

    public final void run()
    {
        try
        {
            Thread.sleep(3000L);
        }
        catch (InterruptedException interruptedexception) { }
        Debug.stopMethodTracing();
        TraceStyle.b();
    }

    (String s)
    {
        super(s);
    }
}
