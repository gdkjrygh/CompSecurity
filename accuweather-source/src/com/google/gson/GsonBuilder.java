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
//            Gson, JsonSerializer, JsonDeserializer, InstanceCreator, 
//            TypeAdapter, FieldNamingStrategy, ExclusionStrategy, TypeAdapterFactory

public final class GsonBuilder
{

    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List factories = new ArrayList();
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List hierarchyFactories = new ArrayList();
    private final Map instanceCreators = new HashMap();
    private LongSerializationPolicy longSerializationPolicy;
    private boolean prettyPrinting;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;

    public GsonBuilder()
    {
        excluder = Excluder.DEFAULT;
        longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        dateStyle = 2;
        timeStyle = 2;
        escapeHtmlChars = true;
    }

    private void addTypeAdaptersForDate(String s, int i, int j, List list)
    {
        if (s == null || "".equals(s.trim())) goto _L2; else goto _L1
_L1:
        s = new DefaultDateTypeAdapter(s);
_L6:
        list.add(TreeTypeAdapter.newFactory(TypeToken.get(java/util/Date), s));
        list.add(TreeTypeAdapter.newFactory(TypeToken.get(java/sql/Timestamp), s));
        list.add(TreeTypeAdapter.newFactory(TypeToken.get(java/sql/Date), s));
_L4:
        return;
_L2:
        if (i == 2 || j == 2) goto _L4; else goto _L3
_L3:
        s = new DefaultDateTypeAdapter(i, j);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionstrategy)
    {
        excluder = excluder.withExclusionStrategy(exclusionstrategy, false, true);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionstrategy)
    {
        excluder = excluder.withExclusionStrategy(exclusionstrategy, true, false);
        return this;
    }

    public Gson create()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(factories);
        Collections.reverse(arraylist);
        arraylist.addAll(hierarchyFactories);
        addTypeAdaptersForDate(datePattern, dateStyle, timeStyle, arraylist);
        return new Gson(excluder, fieldNamingPolicy, instanceCreators, serializeNulls, complexMapKeySerialization, generateNonExecutableJson, escapeHtmlChars, prettyPrinting, serializeSpecialFloatingPointValues, longSerializationPolicy, arraylist);
    }

    public GsonBuilder disableHtmlEscaping()
    {
        escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization()
    {
        excluder = excluder.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization()
    {
        complexMapKeySerialization = true;
        return this;
    }

    public transient GsonBuilder excludeFieldsWithModifiers(int ai[])
    {
        excluder = excluder.withModifiers(ai);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation()
    {
        excluder = excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public GsonBuilder generateNonExecutableJson()
    {
        generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj)
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
            instanceCreators.put(type, (InstanceCreator)obj);
        }
        if ((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer))
        {
            TypeToken typetoken = TypeToken.get(type);
            factories.add(TreeTypeAdapter.newFactoryWithMatchRawType(typetoken, obj));
        }
        if (obj instanceof TypeAdapter)
        {
            factories.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter)obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeadapterfactory)
    {
        factories.add(typeadapterfactory);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class class1, Object obj)
    {
        boolean flag;
        if ((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer) || (obj instanceof TypeAdapter))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
        if ((obj instanceof JsonDeserializer) || (obj instanceof JsonSerializer))
        {
            hierarchyFactories.add(0, TreeTypeAdapter.newTypeHierarchyFactory(class1, obj));
        }
        if (obj instanceof TypeAdapter)
        {
            factories.add(TypeAdapters.newTypeHierarchyFactory(class1, (TypeAdapter)obj));
        }
        return this;
    }

    public GsonBuilder serializeNulls()
    {
        serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues()
    {
        serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(int i)
    {
        dateStyle = i;
        datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(int i, int j)
    {
        dateStyle = i;
        timeStyle = j;
        datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(String s)
    {
        datePattern = s;
        return this;
    }

    public transient GsonBuilder setExclusionStrategies(ExclusionStrategy aexclusionstrategy[])
    {
        int j = aexclusionstrategy.length;
        for (int i = 0; i < j; i++)
        {
            ExclusionStrategy exclusionstrategy = aexclusionstrategy[i];
            excluder = excluder.withExclusionStrategy(exclusionstrategy, true, true);
        }

        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldnamingpolicy)
    {
        fieldNamingPolicy = fieldnamingpolicy;
        return this;
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldnamingstrategy)
    {
        fieldNamingPolicy = fieldnamingstrategy;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longserializationpolicy)
    {
        longSerializationPolicy = longserializationpolicy;
        return this;
    }

    public GsonBuilder setPrettyPrinting()
    {
        prettyPrinting = true;
        return this;
    }

    public GsonBuilder setVersion(double d)
    {
        excluder = excluder.withVersion(d);
        return this;
    }
}
