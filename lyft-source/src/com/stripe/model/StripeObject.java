// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Field;

// Referenced classes of package com.stripe.model:
//            EventData, EventDataDeserializer

public abstract class StripeObject
{

    public static final Gson PRETTY_PRINT_GSON;

    public StripeObject()
    {
    }

    protected static boolean equals(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    private Object getIdString()
    {
        Object obj;
        try
        {
            obj = getClass().getDeclaredField("id").get(this);
        }
        catch (SecurityException securityexception)
        {
            return "";
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return "";
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return "";
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return "";
        }
        return obj;
    }

    public String toString()
    {
        return String.format("<%s@%s id=%s> JSON: %s", new Object[] {
            getClass().getName(), Integer.valueOf(System.identityHashCode(this)), getIdString(), PRETTY_PRINT_GSON.a(this)
        });
    }

    static 
    {
        PRETTY_PRINT_GSON = (new GsonBuilder()).b().a().a(FieldNamingPolicy.d).a(com/stripe/model/EventData, new EventDataDeserializer()).c();
    }
}
