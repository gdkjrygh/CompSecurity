// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.MalformedJsonException;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class dmk extends dmn
{

    public dmk()
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
            a(i, new JSONArray(s));
            return;
        }
        catch (JSONException jsonexception)
        {
            a(((Throwable) (jsonexception)), s);
        }
    }

    public abstract void a(int i, JSONArray jsonarray);

    public abstract void a(Throwable throwable, String s);
}
