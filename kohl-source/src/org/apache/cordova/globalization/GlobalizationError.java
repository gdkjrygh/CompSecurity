// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.globalization;

import org.json.JSONException;
import org.json.JSONObject;

public class GlobalizationError extends Exception
{

    public static final String FORMATTING_ERROR = "FORMATTING_ERROR";
    public static final String PARSING_ERROR = "PARSING_ERROR";
    public static final String PATTERN_ERROR = "PATTERN_ERROR";
    public static final String UNKNOWN_ERROR = "UNKNOWN_ERROR";
    private static final long serialVersionUID = 1L;
    int error;

    public GlobalizationError()
    {
        error = 0;
    }

    public GlobalizationError(String s)
    {
        error = 0;
        if (s.equalsIgnoreCase("FORMATTING_ERROR"))
        {
            error = 1;
        } else
        {
            if (s.equalsIgnoreCase("PARSING_ERROR"))
            {
                error = 2;
                return;
            }
            if (s.equalsIgnoreCase("PATTERN_ERROR"))
            {
                error = 3;
                return;
            }
        }
    }

    public int getErrorCode()
    {
        return error;
    }

    public String getErrorString()
    {
        switch (error)
        {
        default:
            return "";

        case 0: // '\0'
            return "UNKNOWN_ERROR";

        case 1: // '\001'
            return "FORMATTING_ERROR";

        case 2: // '\002'
            return "PARSING_ERROR";

        case 3: // '\003'
            return "PATTERN_ERROR";
        }
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("code", getErrorCode());
            jsonobject.put("message", getErrorString());
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }
}
