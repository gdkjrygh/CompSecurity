// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.f;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.errorstatus.ErrorMessageArrayEntityContainer;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.util.aa;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{

    public static ErrorMessageEntityContainer a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if ((new JSONObject(s)).has("exceptionMessage"))
        {
            return b(s);
        }
        s = c(s);
        return s;
        s;
        return null;
    }

    public static String a(Context context, String s)
    {
        String s1 = context.getString(0x7f0703c5);
        context = s1;
        if (s != null)
        {
            s = a(s);
            context = s1;
            if (s != null)
            {
                context = s.getErrorMessage();
            }
        }
        return context;
    }

    private static ErrorMessageEntityContainer b(String s)
    {
        s = (ErrorMessageArrayEntityContainer)aa.a(s, com/jcp/errorstatus/ErrorMessageArrayEntityContainer);
        if (s != null && s.getExceptionMessage().length > 0)
        {
            return s.getExceptionMessage()[0];
        } else
        {
            return null;
        }
    }

    private static ErrorMessageEntityContainer c(String s)
    {
        return (ErrorMessageEntityContainer)aa.a(s, com/jcp/errorstatus/ErrorMessageEntityContainer);
    }
}
