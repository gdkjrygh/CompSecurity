// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            dt

class sv
    implements Runnable
{

    private final WeakReference su;
    final dt sv;
    final  sw;

    public void run()
    {
        dt dt1 = (dt)su.get();
        if (!su(sw) && dt1 != null)
        {
            dt1.cr();
            sw.();
        }
    }

    ( , dt dt1)
    {
        sw = ;
        sv = dt1;
        super();
        su = new WeakReference(sv);
    }
}
