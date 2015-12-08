// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            LockPatternActivity

class val.errmsg
    implements android.content.kListener
{

    final LockPatternActivity this$0;
    final String val$errmsg;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$errmsg.substring(val$errmsg.indexOf("1-8") + 2, val$errmsg.indexOf("1-8") + 14);
        dialoginterface = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(dialoginterface.replaceAll("[\\D]", "")).toString()));
        startActivity(dialoginterface);
    }

    ()
    {
        this$0 = final_lockpatternactivity;
        val$errmsg = String.this;
        super();
    }
}
