// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.impl;

import org.codehaus.jackson.map.JsonSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.impl:
//            JsonSerializerMap

static final class value
{

    public final value key;
    public final value next;
    public final JsonSerializer value;

    public ( ,  1, JsonSerializer jsonserializer)
    {
        next = ;
        key = 1;
        value = jsonserializer;
    }
}
