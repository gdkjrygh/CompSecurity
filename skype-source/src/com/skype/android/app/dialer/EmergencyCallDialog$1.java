// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.skype.android.app.dialer:
//            EmergencyCallDialog

final class val.number
    implements android.content.kListener
{

    final EmergencyCallDialog this$0;
    final String val$number;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (!TextUtils.isEmpty(val$number))
        {
            dialoginterface = getActivity().getPackageManager();
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder("tel:")).append(val$number).toString()));
            intent.addFlags(0x10000000);
            if (dialoginterface.queryIntentActivities(intent, 0).size() > 0)
            {
                startActivity(intent);
            }
        }
    }

    ()
    {
        this$0 = final_emergencycalldialog;
        val$number = String.this;
        super();
    }
}
