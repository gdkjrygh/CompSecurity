// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ExtendedData extends JSONObject
{
    protected static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type commerce;
        public static final Type location;
        public static final Type time;
        public static final Type unknown;

        public static Type parse(String s)
        {
            Type type1;
            try
            {
                type1 = valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.v((new StringBuilder()).append("Error parsing unknown ExtendedData.BaseType: ").append(s).toString(), new Object[0]);
                return unknown;
            }
            return type1;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/apptentive/android/sdk/model/ExtendedData$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            time = new Type("time", 0);
            location = new Type("location", 1);
            commerce = new Type("commerce", 2);
            unknown = new Type("unknown", 3);
            $VALUES = (new Type[] {
                time, location, commerce, unknown
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String KEY_VERSION = "version";
    private Type type;

    protected ExtendedData()
    {
        type = Type.unknown;
        init();
    }

    public String getTypeName()
    {
        return type.name();
    }

    protected abstract void init();

    protected void setType(Type type1)
    {
        type = type1;
    }

    protected void setVersion(int i)
    {
        try
        {
            put("version", i);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.w("Error adding %s to ExtendedData.", new Object[] {
                "version", jsonexception
            });
        }
    }
}
