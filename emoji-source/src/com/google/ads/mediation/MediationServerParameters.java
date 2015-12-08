// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.internal.eu;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class MediationServerParameters
{
    public static final class MappingException extends Exception
    {

        public MappingException(String s)
        {
            super(s);
        }
    }

    protected static interface Parameter
        extends Annotation
    {

        public abstract String name();

        public abstract boolean required();
    }


    public MediationServerParameters()
    {
    }

    protected void a()
    {
    }

    public void load(Map map)
        throws MappingException
    {
        Object obj = new HashMap();
        Field afield[] = getClass().getFields();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Field field1 = afield[i];
            Parameter parameter = (Parameter)field1.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter);
            if (parameter != null)
            {
                ((Map) (obj)).put(parameter.name(), field1);
            }
        }

        if (((Map) (obj)).isEmpty())
        {
            eu.D("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            Field field2 = (Field)((Map) (obj)).remove(entry.getKey());
            if (field2 != null)
            {
                try
                {
                    field2.set(this, entry.getValue());
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    eu.D((new StringBuilder()).append("Server option \"").append((String)entry.getKey()).append("\" could not be set: Illegal Access").toString());
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    eu.D((new StringBuilder()).append("Server option \"").append((String)entry.getKey()).append("\" could not be set: Bad Type").toString());
                }
            } else
            {
                eu.z((new StringBuilder()).append("Unexpected server option: ").append((String)entry.getKey()).append(" = \"").append((String)entry.getValue()).append("\"").toString());
            }
        }

        map = new StringBuilder();
        obj = ((Map) (obj)).values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Field field = (Field)((Iterator) (obj)).next();
            if (((Parameter)field.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).required())
            {
                eu.D((new StringBuilder()).append("Required server option missing: ").append(((Parameter)field.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).name()).toString());
                if (map.length() > 0)
                {
                    map.append(", ");
                }
                map.append(((Parameter)field.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).name());
            }
        } while (true);
        if (map.length() > 0)
        {
            throw new MappingException((new StringBuilder()).append("Required server option(s) missing: ").append(map.toString()).toString());
        } else
        {
            a();
            return;
        }
    }
}
