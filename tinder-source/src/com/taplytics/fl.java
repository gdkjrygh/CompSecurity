// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.DialogInterface;

// Referenced classes of package com.taplytics:
//            em

final class fl
    implements android.content.DialogInterface.OnClickListener
{

    final em a;

    fl(em em1)
    {
        a = em1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        em.h(a);
    }
}
