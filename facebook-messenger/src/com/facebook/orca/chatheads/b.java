// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.chatheads:
//            AutoDismissAlertFragment, c

class b
    implements android.content.DialogInterface.OnClickListener
{

    final AutoDismissAlertFragment a;

    b(AutoDismissAlertFragment autodismissalertfragment)
    {
        a = autodismissalertfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (AutoDismissAlertFragment.b(a) != null)
        {
            AutoDismissAlertFragment.b(a).a();
        }
    }
}
