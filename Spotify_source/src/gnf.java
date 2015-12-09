// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

final class gnf
    implements gnj
{

    private ConcurrentHashMap a;

    gnf()
    {
        a = new ConcurrentHashMap();
    }

    public final ObjectMapper a(gnh gnh1)
    {
        if (!a.containsKey(gnh1))
        {
            ObjectMapper objectmapper = new ObjectMapper();
            java.util.Map.Entry entry;
            for (Iterator iterator = gnh1.a.entrySet().iterator(); iterator.hasNext(); objectmapper.configure((SerializationFeature)entry.getKey(), ((Boolean)entry.getValue()).booleanValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            java.util.Map.Entry entry1;
            for (Iterator iterator1 = gnh1.b.entrySet().iterator(); iterator1.hasNext(); objectmapper.configure((DeserializationFeature)entry1.getKey(), ((Boolean)entry1.getValue()).booleanValue()))
            {
                entry1 = (java.util.Map.Entry)iterator1.next();
            }

            java.util.Map.Entry entry2;
            for (Iterator iterator2 = gnh1.c.entrySet().iterator(); iterator2.hasNext(); objectmapper.configure((MapperFeature)entry2.getKey(), ((Boolean)entry2.getValue()).booleanValue()))
            {
                entry2 = (java.util.Map.Entry)iterator2.next();
            }

            objectmapper.setSerializationInclusion(gnh1.d);
            objectmapper.addMixInAnnotations(android/os/Bundle, epz);
            a.putIfAbsent(gnh1, objectmapper);
        }
        return (ObjectMapper)a.get(gnh1);
    }
}
