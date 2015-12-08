// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.snapchat.android.Timber;
import java.lang.reflect.Type;

public final class Iz
{

    private static final String TAG = "JsonSerializer";
    protected final Gson mGson;

    public Iz()
    {
        this((new GsonBuilder()).create());
    }

    private Iz(Gson gson)
    {
        mGson = gson;
    }

    public final Object a(String s, Class class1, boolean flag)
    {
        s = ((String) (mGson.fromJson(s, class1)));
        return s;
        s;
_L2:
        Timber.a("JsonSerializer", s);
        if (flag)
        {
            return null;
        } else
        {
            throw s;
        }
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Object a(String s, Type type)
    {
        s = ((String) (mGson.fromJson(s, type)));
        return s;
        s;
_L2:
        Timber.a("JsonSerializer", s);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a(Object obj)
    {
        try
        {
            obj = mGson.toJson(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new UnsupportedOperationException("Failed to serialize object.", ((Throwable) (obj)));
        }
        return ((String) (obj));
    }

    public final String a(Object obj, Type type)
    {
        try
        {
            obj = mGson.toJson(obj, type);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new UnsupportedOperationException("Failed to serialize object.", ((Throwable) (obj)));
        }
        return ((String) (obj));
    }
}
