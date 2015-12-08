// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.json;

import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.java.reflect.TypeToken;
import java.io.IOException;

public interface JsonTransformer
{

    public abstract Object fromJson(String s, TypeToken typetoken)
        throws IOException, ApiMapperException;

    public abstract String toJson(Object obj)
        throws ApiMapperException;
}
