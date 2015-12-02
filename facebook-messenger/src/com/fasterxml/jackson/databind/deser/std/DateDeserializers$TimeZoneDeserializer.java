// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer

public class  extends FromStringDeserializer
{

    protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return _deserialize(s, deserializationcontext);
    }

    protected TimeZone _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return TimeZone.getTimeZone(s);
    }

    public ()
    {
        super(java/util/TimeZone);
    }
}
