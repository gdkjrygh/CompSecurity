// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.ClassInfo;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.api.client.http:
//            HttpHeaders

private static final class arrayValueMap
{

    final ArrayValueMap arrayValueMap;
    final ClassInfo classInfo;
    final List context;
    final StringBuilder logger;

    void finish()
    {
        arrayValueMap.setValues();
    }

    public (HttpHeaders httpheaders, StringBuilder stringbuilder)
    {
        Class class1 = httpheaders.getClass();
        context = Arrays.asList(new Type[] {
            class1
        });
        classInfo = ClassInfo.of(class1, true);
        logger = stringbuilder;
        arrayValueMap = new ArrayValueMap(httpheaders);
    }
}
