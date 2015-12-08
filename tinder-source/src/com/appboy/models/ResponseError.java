// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import bo.app.eo;
import com.appboy.enums.ErrorType;
import org.json.JSONObject;

public final class ResponseError
{

    private final ErrorType a;
    private final String b;

    public ResponseError(ErrorType errortype, String s)
    {
        a = errortype;
        b = s;
    }

    public ResponseError(JSONObject jsonobject)
    {
        a = (ErrorType)eo.a(jsonobject, "type", com/appboy/enums/ErrorType);
        b = jsonobject.getString("message");
    }

    public final String getMessage()
    {
        return b;
    }

    public final ErrorType getType()
    {
        return a;
    }
}
