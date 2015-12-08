// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.util.Log;
import org.json.JSONException;

// Referenced classes of package com.paypal.android.sdk:
//            br, bu, aL, aK

public abstract class bf
    implements br
{

    private static final String a = com/paypal/android/sdk/bf.getSimpleName();

    public bf()
    {
    }

    protected static void a(bu bu1)
    {
        try
        {
            (new StringBuilder("parsing success response\n:")).append(bu1.h());
            bu1.c();
            return;
        }
        catch (Exception exception)
        {
            Log.e("paypal.sdk", "Exception parsing server response", exception);
            bu1.a(new aL(aK.c, exception));
            return;
        }
    }

    protected static void a(bu bu1, int i)
    {
        bu1.a(Integer.valueOf(i));
        try
        {
            (new StringBuilder("parsing error response:\n")).append(bu1.h());
            bu1.d();
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("paypal.sdk", "Exception parsing server response", jsonexception);
            bu1.b(aK.a.toString(), (new StringBuilder()).append(i).append(" http response received.  Response not parsable: ").append(jsonexception.getMessage()).toString());
            return;
        }
    }

}
