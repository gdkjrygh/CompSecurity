// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.activities:
//            MainActivity

class af
    implements android.content.DialogInterface.OnClickListener
{

    final MainActivity a;

    af(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        MainActivity.a(a);
    }
}
