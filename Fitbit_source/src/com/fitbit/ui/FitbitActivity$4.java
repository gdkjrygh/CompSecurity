// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.DialogInterface;

// Referenced classes of package com.fitbit.ui:
//            FitbitActivity

class a
    implements android.content.nCancelListener
{

    final FitbitActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        a.X();
    }

    (FitbitActivity fitbitactivity)
    {
        a = fitbitactivity;
        super();
    }
}
