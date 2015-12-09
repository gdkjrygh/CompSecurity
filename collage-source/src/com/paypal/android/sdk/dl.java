// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.util.Log;
import org.json.JSONException;

// Referenced classes of package com.paypal.android.sdk:
//            dt, dw, as, aq

public abstract class dl
    implements dt
{

    private static final String a = com/paypal/android/sdk/dl.getSimpleName();

    public dl()
    {
    }

    protected static void a(dw dw1)
    {
        try
        {
            (new StringBuilder("parsing success response\n:")).append(dw1.h());
            dw1.c();
            return;
        }
        catch (Exception exception)
        {
            Log.e("paypal.sdk", "Exception parsing server response", exception);
            dw1.a(new as(aq.c, exception));
            return;
        }
    }

    protected static void a(dw dw1, int i)
    {
        dw1.a(Integer.valueOf(i));
        try
        {
            (new StringBuilder("parsing error response:\n")).append(dw1.h());
            dw1.d();
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("paypal.sdk", "Exception parsing server response", jsonexception);
            dw1.a(aq.a.toString(), (new StringBuilder()).append(i).append(" http response received.  Response not parsable: ").append(jsonexception.getMessage()).toString(), null);
            return;
        }
    }

}
