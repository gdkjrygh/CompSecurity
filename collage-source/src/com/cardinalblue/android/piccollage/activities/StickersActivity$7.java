// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import com.cardinalblue.android.piccollage.controller.o;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            StickersActivity

class a
    implements android.content.ancelListener
{

    final StickersActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        o.a().o();
    }

    (StickersActivity stickersactivity)
    {
        a = stickersactivity;
        super();
    }
}
