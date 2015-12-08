// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            bj

class gi
    implements Runnable
{

    private final WeakReference gh;
    final bj gi;
    final  gj;

    public void run()
    {
        bj bj1 = (bj)gh.get();
        if (!gh(gj) && bj1 != null)
        {
            bj1.aa();
            gj.();
        }
    }

    ( , bj bj1)
    {
        gj = ;
        gi = bj1;
        super();
        gh = new WeakReference(gi);
    }
}
