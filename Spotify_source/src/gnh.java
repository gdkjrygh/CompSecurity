// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

final class gnh
{

    Map a;
    Map b;
    Map c;
    com.fasterxml.jackson.annotation.JsonInclude.Include d;

    gnh()
    {
        a = new EnumMap(com/fasterxml/jackson/databind/SerializationFeature);
        b = new EnumMap(com/fasterxml/jackson/databind/DeserializationFeature);
        c = new EnumMap(com/fasterxml/jackson/databind/MapperFeature);
        d = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (gnh)obj;
            if (!cty.a(a, ((gnh) (obj)).a) || !cty.a(b, ((gnh) (obj)).b) || !cty.a(c, ((gnh) (obj)).c) || !cty.a(d, ((gnh) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b, c, d
        });
    }
}
