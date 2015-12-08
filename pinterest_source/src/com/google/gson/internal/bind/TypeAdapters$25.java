// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Currency;

final class  extends TypeAdapter
{

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final Currency read(JsonReader jsonreader)
    {
        return Currency.getInstance(jsonreader.nextString());
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (Currency)obj);
    }

    public final void write(JsonWriter jsonwriter, Currency currency)
    {
        jsonwriter.value(currency.getCurrencyCode());
    }

    ()
    {
    }
}
