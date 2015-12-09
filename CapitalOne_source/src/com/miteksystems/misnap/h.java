// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.content.Context;
import android.view.OrientationEventListener;

// Referenced classes of package com.miteksystems.misnap:
//            MiSnap

final class h extends OrientationEventListener
{

    final MiSnap a;

    h(MiSnap misnap, Context context)
    {
        a = misnap;
        super(context, 3);
    }

    public final void onOrientationChanged(int i)
    {
        MiSnap.b(a, i);
    }
}
