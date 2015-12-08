// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library;

import android.content.DialogInterface;

// Referenced classes of package com.aviary.android.feather.library:
//            MonitoredActivity

class a
    implements android.content.ickListener
{

    final MonitoredActivity a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.finish();
    }

    (MonitoredActivity monitoredactivity)
    {
        a = monitoredactivity;
        super();
    }
}
