// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.MalformedJsonException;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class dml extends dmn
{

    public dml()
    {
    }

    public final void a(int i, String s)
    {
        if (s == null)
        {
            a(((Throwable) (new MalformedJsonException("response body is null"))), s);
            return;
        }
        try
        {
            a(i, new JSONObject(s));
            return;
        }
        catch (JSONException jsonexception)
        {
            a(((Throwable) (jsonexception)), s);
        }
    }

    public abstract void a(int i, JSONObject jsonobject);

    public abstract void a(Throwable throwable, String s);
}
