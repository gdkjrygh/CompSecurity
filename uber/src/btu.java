// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import org.json.JSONException;

public abstract class btu
    implements bug
{

    private static final String a = btu.getSimpleName();

    public btu()
    {
    }

    protected static void a(buj buj1)
    {
        try
        {
            (new StringBuilder("parsing success response\n:")).append(buj1.h());
            buj1.c();
            return;
        }
        catch (Exception exception)
        {
            Log.e("paypal.sdk", "Exception parsing server response", exception);
            buj1.a(new brg(brf.c, exception));
            return;
        }
    }

    protected static void a(buj buj1, int i)
    {
        buj1.a(Integer.valueOf(i));
        try
        {
            (new StringBuilder("parsing error response:\n")).append(buj1.h());
            buj1.d();
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("paypal.sdk", "Exception parsing server response", jsonexception);
            buj1.b(brf.a.toString(), (new StringBuilder()).append(i).append(" http response received.  Response not parsable: ").append(jsonexception.getMessage()).toString());
            return;
        }
    }

}
