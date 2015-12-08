// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import com.cardinalblue.android.piccollage.a.b;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

class a
    implements android.content..OnDismissListener
{

    final AtomicBoolean a;
    final HomeActivity b;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!a.get())
        {
            com.cardinalblue.android.piccollage.a.b.aN("skip");
        }
    }

    (HomeActivity homeactivity, AtomicBoolean atomicboolean)
    {
        b = homeactivity;
        a = atomicboolean;
        super();
    }
}
