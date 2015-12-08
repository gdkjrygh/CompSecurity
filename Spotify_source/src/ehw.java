// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

final class ehw
    implements ehn
{

    private final JsonNode a;
    private ehv b;

    public ehw(ehv ehv1, JsonNode jsonnode)
    {
        b = ehv1;
        super();
        a = jsonnode;
    }

    public final int a()
    {
        return a.get(0).asInt();
    }

    public final Object a(int i, Class class1)
    {
        return b.a.convertValue(a.get(i), class1);
    }

    public final String a(int i)
    {
        return a.get(i).asText();
    }

    public final int b()
    {
        return a.get(1).asInt();
    }

    public final String toString()
    {
        return a.toString();
    }
}
