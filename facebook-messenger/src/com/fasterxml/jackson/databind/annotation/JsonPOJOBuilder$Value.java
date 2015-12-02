// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.annotation;


// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//            JsonPOJOBuilder

public class efix
{

    public final String buildMethodName;
    public final String withPrefix;

    public (JsonPOJOBuilder jsonpojobuilder)
    {
        buildMethodName = jsonpojobuilder.buildMethodName();
        withPrefix = jsonpojobuilder.withPrefix();
    }
}
