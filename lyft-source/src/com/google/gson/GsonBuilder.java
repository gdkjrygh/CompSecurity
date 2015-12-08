// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.gson:
//            LongSerializationPolicy, FieldNamingPolicy, DefaultDateTypeAdapter, TreeTypeAdapter, 
//            JsonSerializer, JsonDeserializer, InstanceCreator, TypeAdapter, 
//            Gson, FieldNamingStrategy, TypeAdapterFactory

public final class GsonBuilder
{

    private Excluder a;
    private LongSerializationPolicy b;
    private FieldNamingStrategy c;
    private final Map d = new HashMap();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private boolean g;
    private String h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public GsonBuilder()
    {
        a = Excluder.a;
        b = LongSerializationPolicy.a;
        c = FieldNamingPolicy.a;
        i = 2;
        j = 2;
        m = true;
    }

    private void a(String s, int i1, int j1, List list)
    {
        if (s == null || "".equals(s.trim())) goto _L2; else goto _L1
_L1:
        s = new DefaultDateTypeAdapter(s);
_L6:
        list.add(TreeTypeAdapter.a(TypeToken.get(java/util/Date), s));
        list.add(TreeTypeAdapter.a(TypeToken.get(java/sql/Timestamp), s));
        list.add(TreeTypeAdapter.a(TypeToken.get(java/sql/Date), s));
_L4:
        return;
_L2:
        if (i1 == 2 || j1 == 2) goto _L4; else goto _L3
_L3:
        s = new DefaultDateTypeAdapter(i1, j1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public GsonBuilder a()
    {
        g = true;
        return this;
    }

    public GsonBuilder a(FieldNamingPolicy fieldnamingpolicy)
    {
        c = fieldnamingpolicy;
        return this;
    }

    public GsonBuilder a(TypeAdapterFactory typeadapterfactory)
    {
        e.add(typeadapterfactory);
        return this;
    }

    public GsonBuilder a(Type type, Object obj)
    {
        boolean flag;
        if ((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.gson.internal..Gson.Preconditions.a(flag);
        if (obj instanceof InstanceCreator)
        {
            d.put(type, (InstanceCreator)obj);
        }
        if ((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer))
        {
            TypeToken typetoken = TypeToken.get(type);
            e.add(TreeTypeAdapter.b(typetoken, obj));
        }
        if (obj instanceof TypeAdapter)
        {
            e.add(TypeAdapters.a(TypeToken.get(type), (TypeAdapter)obj));
        }
        return this;
    }

    public GsonBuilder b()
    {
        n = true;
        return this;
    }

    public Gson c()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(e);
        Collections.reverse(arraylist);
        arraylist.addAll(f);
        a(h, i, j, arraylist);
        return new Gson(a, c, d, g, k, o, m, n, l, b, arraylist);
    }
}
