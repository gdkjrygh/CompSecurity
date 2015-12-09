// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.i;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

class a
    implements android.content..OnClickListener
{

    final AtomicBoolean a;
    final HomeActivity b;

    public void onClick(DialogInterface dialoginterface, int j)
    {
        a.set(true);
        com.cardinalblue.android.piccollage.a.b.aN("uservoice");
        i.c(b);
    }

    (HomeActivity homeactivity, AtomicBoolean atomicboolean)
    {
        b = homeactivity;
        a = atomicboolean;
        super();
    }
}
