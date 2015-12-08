// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            ConfigDebugActivity

class a
    implements android.content.kListener
{

    final String a;
    final ConfigDebugActivity b;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent();
        dialoginterface.setAction("android.intent.action.SEND");
        dialoginterface.putExtra("android.intent.extra.TEXT", a);
        dialoginterface.setType("text/plain");
        b.startActivity(dialoginterface);
    }

    (ConfigDebugActivity configdebugactivity, String s)
    {
        b = configdebugactivity;
        a = s;
        super();
    }
}
