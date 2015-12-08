// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis;


// Referenced classes of package com.google.api.client.googleapis:
//            MethodOverride

public static final class 
{

    private boolean overrideAllMethods;

    public MethodOverride build()
    {
        return new MethodOverride(overrideAllMethods);
    }

    public boolean getOverrideAllMethods()
    {
        return overrideAllMethods;
    }

    public overrideAllMethods setOverrideAllMethods(boolean flag)
    {
        overrideAllMethods = flag;
        return this;
    }

    public ()
    {
    }
}
