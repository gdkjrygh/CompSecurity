// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            JsonSerializerMap

private static final class value
{

    public final com.fasterxml.jackson.databind.ser.cket key;
    public final value next;
    public final JsonSerializer value;

    public ( , com.fasterxml.jackson.databind.ser.cket cket, JsonSerializer jsonserializer)
    {
        next = ;
        key = cket;
        value = jsonserializer;
    }
}
