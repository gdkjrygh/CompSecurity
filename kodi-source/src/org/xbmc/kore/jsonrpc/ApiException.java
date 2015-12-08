// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.utils.JsonUtils;

public class ApiException extends Exception
{

    public static int API_ERROR = 100;
    public static int API_METHOD_WITH_SAME_ID_ALREADY_EXECUTING = 102;
    public static int API_NO_CONNECTION = 101;
    private int code;

    public ApiException(int i, ObjectNode objectnode)
    {
        if (objectnode.get("error") != null)
        {
            objectnode = JsonUtils.stringFromJsonNode(objectnode.get("error"), "message");
        } else
        {
            objectnode = "No message returned";
        }
        super(objectnode);
        code = i;
    }

    public ApiException(int i, Exception exception)
    {
        super(exception);
        code = i;
    }

    public ApiException(int i, String s)
    {
        super(s);
        code = i;
    }

    public int getCode()
    {
        return code;
    }

}
