// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;

public class e
{

    private final Context a;

    public e(Context context)
    {
        a = context;
    }

    public void a(OperationResult operationresult)
    {
        StringBuilder stringbuilder = new StringBuilder();
        t t1 = operationresult.d();
        stringbuilder.append("Error Code: ").append(t1.toString()).append("\n");
        stringbuilder.append("Error Description: ").append(operationresult.e()).append("\n");
        stringbuilder.append("\n");
        if (t1 == t.API_ERROR)
        {
            stringbuilder.append("API Error:\n");
            stringbuilder.append(((ApiErrorResult)operationresult.i()).b());
            stringbuilder.append("\n\n");
        }
        operationresult = operationresult.j();
        if (operationresult.containsKey("originalExceptionMessage"))
        {
            stringbuilder.append("Original Exception:");
            stringbuilder.append(operationresult.getString("originalExceptionMessage"));
            stringbuilder.append("\n");
            if (operationresult.containsKey("originalExceptionStack"))
            {
                stringbuilder.append(operationresult.getString("originalExceptionStack"));
                stringbuilder.append("\n\n");
            }
        }
        operationresult = new Intent("android.intent.action.SEND");
        operationresult.setType("text/html");
        operationresult.putExtra("android.intent.extra.EMAIL", new String[] {
            "orca-crashes@lists.facebook.com"
        });
        operationresult.putExtra("android.intent.extra.SUBJECT", "Android Error Report");
        operationresult.putExtra("android.intent.extra.TEXT", stringbuilder.toString());
        a.startActivity(Intent.createChooser(operationresult, "Email Report"));
    }
}
