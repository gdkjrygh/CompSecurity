// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            an

class nK
    implements Runnable
{

    final View nK;
    final an nL;

    public void run()
    {
        nL.h(nK);
    }

    (an an1, View view)
    {
        nL = an1;
        nK = view;
        super();
    }
}
