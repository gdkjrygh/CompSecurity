// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.DialogInterface;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity

class a
    implements android.content.nClickListener
{

    final UpdateActivity a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        UpdateActivity.a(a, null);
        dialoginterface.cancel();
    }

    Listener(UpdateActivity updateactivity)
    {
        a = updateactivity;
        super();
    }
}
