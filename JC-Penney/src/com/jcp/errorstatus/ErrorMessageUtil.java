// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.errorstatus;

import android.text.Html;
import org.json.JSONException;
import org.json.JSONObject;

public final class ErrorMessageUtil
{

    private static final String ERROR_CODE = "errorCode";
    private static final String ERROR_MESSAGE = "errorMessage";

    private ErrorMessageUtil()
    {
    }

    public static String getErrorCode(String s)
    {
        return parseJson(s, "errorCode");
    }

    public static String getErrorMessageFromJSONResponse(String s)
    {
        return parseJson(s, "errorMessage");
    }

    private static String parseJson(String s, String s1)
    {
        String s3 = "";
        String s2 = s3;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return Html.fromHtml(s).toString();
        }
        s2 = s3;
        if (jsonobject.has(s1))
        {
            s2 = jsonobject.getString(s1);
        }
        return s2;
    }
}
