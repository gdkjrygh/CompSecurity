// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import com.tremorvideo.sdk.android.videoad.ct;
import java.util.TimerTask;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            o

class p extends TimerTask
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public void run()
    {
        try
        {
            a.j();
            return;
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
    }
}
