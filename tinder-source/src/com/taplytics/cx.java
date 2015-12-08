// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;

// Referenced classes of package com.taplytics:
//            cv, gs

final class cx
    implements Runnable
{

    final cv a;

    cx(cv cv1)
    {
        a = cv1;
        super();
    }

    public final void run()
    {
        try
        {
            if (cv.d(a).findViewById(0x17ccbc35) != null)
            {
                cv.d(a).removeView(cv.d(a).findViewById(0x17ccbc35));
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("problem removing border", exception);
        }
    }
}
