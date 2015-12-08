// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Payload extends JSONObject
{
    public static final class BaseType extends Enum
    {

        private static final BaseType $VALUES[];
        public static final BaseType app_release;
        public static final BaseType device;
        public static final BaseType event;
        public static final BaseType message;
        public static final BaseType person;
        public static final BaseType sdk;
        public static final BaseType survey;
        public static final BaseType unknown;

        public static BaseType parse(String s)
        {
            BaseType basetype;
            try
            {
                basetype = valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.v((new StringBuilder()).append("Error parsing unknown Payload.BaseType: ").append(s).toString(), new Object[0]);
                return unknown;
            }
            return basetype;
        }

        public static BaseType valueOf(String s)
        {
            return (BaseType)Enum.valueOf(com/apptentive/android/sdk/model/Payload$BaseType, s);
        }

        public static BaseType[] values()
        {
            return (BaseType[])$VALUES.clone();
        }

        static 
        {
            message = new BaseType("message", 0);
            event = new BaseType("event", 1);
            device = new BaseType("device", 2);
            sdk = new BaseType("sdk", 3);
            app_release = new BaseType("app_release", 4);
            person = new BaseType("person", 5);
            unknown = new BaseType("unknown", 6);
            survey = new BaseType("survey", 7);
            $VALUES = (new BaseType[] {
                message, event, device, sdk, app_release, person, unknown, survey
            });
        }

        private BaseType(String s, int i)
        {
            super(s, i);
        }
    }


    private BaseType baseType;
    private Long databaseId;

    public Payload()
    {
        initBaseType();
    }

    public Payload(String s)
        throws JSONException
    {
        super(s);
        initBaseType();
    }

    public BaseType getBaseType()
    {
        return baseType;
    }

    public long getDatabaseId()
    {
        return databaseId.longValue();
    }

    public boolean has(String s)
    {
        return super.has(s);
    }

    protected abstract void initBaseType();

    public String marshallForSending()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put(getBaseType().name(), this);
        }
        catch (JSONException jsonexception)
        {
            Log.w("Error wrapping Payload in JSONObject.", jsonexception, new Object[0]);
            return null;
        }
        return jsonobject.toString();
    }

    protected void setBaseType(BaseType basetype)
    {
        baseType = basetype;
    }

    public void setDatabaseId(long l)
    {
        databaseId = Long.valueOf(l);
    }
}
