// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp;


public class NccpError
{

    public String actionId;
    public String code;
    public String description;

    public NccpError(String s, String s1, String s2)
    {
        code = s;
        description = s1;
        actionId = s2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("NccpError [code=").append(code).append(", description=").append(description).append(", actionId=").append(actionId).append("]").toString();
    }
}
