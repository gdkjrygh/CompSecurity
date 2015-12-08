// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.outgoing;

import bo.app.ab;
import bo.app.el;
import bo.app.ep;
import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppboyProperties
    implements IPutIntoJson
{

    private static final String a;
    private JSONObject b;

    public AppboyProperties()
    {
        b = new JSONObject();
    }

    public AppboyProperties(JSONObject jsonobject)
    {
        Iterator iterator;
        b = new JSONObject();
        b = jsonobject;
        iterator = jsonobject.keys();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        if (!a(s))
        {
            b.remove(s);
            continue; /* Loop/switch isn't completed */
        }
        JSONException jsonexception;
        if (jsonobject.get(s) instanceof String)
        {
            if (!b(jsonobject.getString(s)))
            {
                b.remove(s);
            }
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (jsonobject.get(s) == JSONObject.NULL)
            {
                b.remove(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, (new StringBuilder("Caught json exception validating property with key name: ")).append(s).toString(), jsonexception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean a(String s)
    {
        if (ep.c(s))
        {
            AppboyLogger.w(a, "The Appboy property key cannot be null or contain only whitespaces. Not adding property.");
            return false;
        }
        if (s.startsWith("$"))
        {
            AppboyLogger.w(a, "The leading character in the key string may not be '$'. Not adding property.");
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean b(String s)
    {
        if (ep.c(s))
        {
            AppboyLogger.w(a, "The Appboy property value cannot be null or contain only whitespaces. Not adding property.");
            return false;
        } else
        {
            return true;
        }
    }

    public final AppboyProperties addProperty(String s, double d)
    {
        if (!a(s))
        {
            return this;
        }
        try
        {
            b.put(ValidationUtils.ensureAppboyFieldLength(s), d);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            AppboyLogger.e(a, "Caught json exception trying to add property.", s);
            return this;
        }
        return this;
    }

    public final AppboyProperties addProperty(String s, int i)
    {
        if (!a(s))
        {
            return this;
        }
        try
        {
            b.put(ValidationUtils.ensureAppboyFieldLength(s), i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            AppboyLogger.e(a, "Caught json exception trying to add property.", s);
            return this;
        }
        return this;
    }

    public final AppboyProperties addProperty(String s, String s1)
    {
        if (!a(s) || !b(s1))
        {
            return this;
        }
        try
        {
            b.put(ValidationUtils.ensureAppboyFieldLength(s), ValidationUtils.ensureAppboyFieldLength(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            AppboyLogger.e(a, "Caught json exception trying to add property.", s);
            return this;
        }
        return this;
    }

    public final AppboyProperties addProperty(String s, Date date)
    {
        while (!a(s) || date == null) 
        {
            return this;
        }
        try
        {
            date = el.a(date, ab.b);
            b.put(ValidationUtils.ensureAppboyFieldLength(s), date);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            AppboyLogger.e(a, "Caught json exception trying to add property.", s);
            return this;
        }
        return this;
    }

    public final AppboyProperties addProperty(String s, boolean flag)
    {
        if (!a(s))
        {
            return this;
        }
        try
        {
            b.put(ValidationUtils.ensureAppboyFieldLength(s), flag);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            AppboyLogger.e(a, "Caught json exception trying to add property.", s);
            return this;
        }
        return this;
    }

    public final volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public final JSONObject forJsonPut()
    {
        return b;
    }

    public final int size()
    {
        return b.length();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/outgoing/AppboyProperties.getName()
        });
    }
}
