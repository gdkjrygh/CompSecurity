// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.amazon.device.associates:
//            bg, x, RequestId, ay

final class t
    implements bg
{

    private static final String a = com/amazon/device/associates/t.getSimpleName();

    t()
    {
    }

    public void a(Context context, Intent intent, ay ay1)
    {
        x.b(a, "handleResponse");
        context = intent.getExtras();
        intent = context.getString("notifyType");
        if (intent.equalsIgnoreCase("physical_purchase_done"))
        {
            context = context.getString("requestId");
            ay1.a(ay.a.f, RequestId.a(context), null);
            return;
        }
        try
        {
            x.a(a, (new StringBuilder()).append("unknown notifyType: ").append(intent).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            x.a(a, (new StringBuilder()).append("Error in handleResponse: ").append(context).toString());
        }
        return;
    }

}
