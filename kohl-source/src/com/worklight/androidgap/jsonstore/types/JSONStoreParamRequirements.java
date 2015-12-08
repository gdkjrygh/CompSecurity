// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.types;


// Referenced classes of package com.worklight.androidgap.jsonstore.types:
//            JSONStoreParameterType

public class JSONStoreParamRequirements
{

    private boolean loggable;
    private String name;
    private boolean required;
    private JSONStoreParameterType types[];

    public JSONStoreParamRequirements(String s, boolean flag, boolean flag1, JSONStoreParameterType ajsonstoreparametertype[])
    {
        name = s;
        required = flag;
        loggable = flag1;
        types = ajsonstoreparametertype;
    }

    public String getName()
    {
        return name;
    }

    public JSONStoreParameterType[] getTypes()
    {
        return types;
    }

    public boolean isLoggable()
    {
        return loggable;
    }

    public boolean isRequired()
    {
        return required;
    }
}
