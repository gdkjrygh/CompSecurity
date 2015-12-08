// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import eY;
import eZ;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.gson:
//            LongSerializationPolicy, FieldNamingPolicy, Gson, JsonSerializer, 
//            JsonDeserializer, InstanceCreator, TypeAdapter, FieldNamingStrategy

public final class GsonBuilder
{

    private Excluder a;
    private LongSerializationPolicy b;
    private FieldNamingStrategy c;
    private final Map d = new HashMap();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private int g;
    private int h;
    private boolean i;
    private boolean j;

    public GsonBuilder()
    {
        a = Excluder.DEFAULT;
        b = LongSerializationPolicy.DEFAULT;
        c = FieldNamingPolicy.IDENTITY;
        g = 2;
        h = 2;
        j = true;
    }

    public final Gson create()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(e);
        Collections.reverse(arraylist);
        arraylist.addAll(f);
        int k = g;
        int l = h;
        if (k != 2 && l != 2)
        {
            eY ey = new eY(k, l);
            arraylist.add(eZ.a(TypeToken.get(java/util/Date), ey));
            arraylist.add(eZ.a(TypeToken.get(java/sql/Timestamp), ey));
            arraylist.add(eZ.a(TypeToken.get(java/sql/Date), ey));
        }
        return new Gson(a, c, d, i, j, b, arraylist);
    }

    public final GsonBuilder enableComplexMapKeySerialization()
    {
        i = true;
        return this;
    }

    public final GsonBuilder registerTypeAdapter(Type type, Object obj)
    {
        boolean flag;
        if ((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
        if (obj instanceof InstanceCreator)
        {
            d.put(type, (InstanceCreator)obj);
        }
        if ((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer))
        {
            TypeToken typetoken = TypeToken.get(type);
            e.add(eZ.b(typetoken, obj));
        }
        if (obj instanceof TypeAdapter)
        {
            e.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter)obj));
        }
        return this;
    }

    public final GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldnamingpolicy)
    {
        c = fieldnamingpolicy;
        return this;
    }
}
