// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.actionsender;

import org.json.JSONObject;

public class WLAction
{

    private final String action;
    private final JSONObject data;
    private final String tag;

    public WLAction(String s, JSONObject jsonobject, String s1)
    {
        if (s == null)
        {
            throw new RuntimeException("action cannot be null");
        } else
        {
            action = s;
            data = jsonobject;
            tag = s1;
            return;
        }
    }

    String getAction()
    {
        return action;
    }

    JSONObject getData()
    {
        return data;
    }

    String getTag()
    {
        return tag;
    }
}
