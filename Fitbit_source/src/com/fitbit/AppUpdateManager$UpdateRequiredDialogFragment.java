// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.fitbit.util.r;

// Referenced classes of package com.fitbit:
//            AppUpdateManager

public static class _cls1.a extends 
{

    protected int d()
    {
        return 0x7f080534;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app..a(new ContextThemeWrapper(getActivity(), 0x7f0c01d0));
        bundle.etActivity(r.b(this));
        bundle.etActivity(r.a(this));
        bundle.etActivity(0x7f08036d, new android.content.DialogInterface.OnClickListener() {

            final AppUpdateManager.UpdateRequiredDialogFragment a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                a.e();
                a.a();
            }

            
            {
                a = AppUpdateManager.UpdateRequiredDialogFragment.this;
                super();
            }
        });
        return bundle.();
    }

    public _cls1.a()
    {
    }
}
