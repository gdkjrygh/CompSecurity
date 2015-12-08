// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.reflection;

import java.util.ArrayList;
import java.util.Collection;

public class Method
{

    public static final int READ_PERMISSION = 1;
    public static final int WRITE_PERMISSION = 2;
    private Collection arguments;
    private String description;
    private Collection errors;
    private String explanation;
    private String name;
    private boolean needsLogin;
    private boolean needsSigning;
    private int requiredPerms;
    private String response;

    public Method()
    {
    }

    public Collection getArguments()
    {
        if (arguments == null)
        {
            arguments = new ArrayList();
        }
        return arguments;
    }

    public String getDescription()
    {
        return description;
    }

    public Collection getErrors()
    {
        if (errors == null)
        {
            errors = new ArrayList();
        }
        return errors;
    }

    public String getExplanation()
    {
        return explanation;
    }

    public String getName()
    {
        return name;
    }

    public int getRequiredPerms()
    {
        return requiredPerms;
    }

    public String getResponse()
    {
        return response;
    }

    public boolean needsLogin()
    {
        return needsLogin;
    }

    public boolean needsSigning()
    {
        return needsSigning;
    }

    public void setArguments(Collection collection)
    {
        arguments = collection;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setErrors(Collection collection)
    {
        errors = collection;
    }

    public void setExplanation(String s)
    {
        explanation = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNeedsLogin(boolean flag)
    {
        needsLogin = flag;
    }

    public void setNeedsSigning(boolean flag)
    {
        needsSigning = flag;
    }

    public void setRequiredPerms(int i)
    {
        requiredPerms = i;
    }

    public void setResponse(String s)
    {
        response = s;
    }
}
