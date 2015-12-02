// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.impl;

import org.codehaus.jackson.map.JsonSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.impl:
//            PropertySerializerMap

static final class serializer
{

    public final JsonSerializer serializer;
    public final Class type;

    public (Class class1, JsonSerializer jsonserializer)
    {
        type = class1;
        serializer = jsonserializer;
    }
}
