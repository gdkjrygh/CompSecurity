// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            an

class nA
    implements Runnable
{

    final View nA;
    final an nB;

    public void run()
    {
        nB.h(nA);
    }

    (an an1, View view)
    {
        nB = an1;
        nA = view;
        super();
    }
}
