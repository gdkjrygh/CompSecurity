// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.mutators:
//            LeaveThreadDialogFragment

class f
    implements android.content.DialogInterface.OnClickListener
{

    final LeaveThreadDialogFragment a;

    f(LeaveThreadDialogFragment leavethreaddialogfragment)
    {
        a = leavethreaddialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a();
    }
}
