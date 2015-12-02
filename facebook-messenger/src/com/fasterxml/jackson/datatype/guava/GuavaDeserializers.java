// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.datatype.guava.deser.GuavaOptionalDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HashMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableBiMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableListDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedSetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.LinkedHashMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.MultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.TreeMultisetDeserializer;
import com.google.common.a.av;
import com.google.common.a.ds;
import com.google.common.a.dt;
import com.google.common.a.du;
import com.google.common.a.ee;
import com.google.common.a.eg;
import com.google.common.a.ej;
import com.google.common.a.em;
import com.google.common.a.es;
import com.google.common.a.eu;
import com.google.common.a.ev;
import com.google.common.a.ex;
import com.google.common.a.fe;
import com.google.common.a.fi;
import com.google.common.a.fn;
import com.google.common.a.fp;
import com.google.common.a.fy;
import com.google.common.a.gv;
import com.google.common.a.iw;
import com.google.common.a.jf;
import com.google.common.a.lx;
import com.google.common.a.mf;
import com.google.common.base.Optional;

public class GuavaDeserializers extends com.fasterxml.jackson.databind.deser.Deserializers.Base
{

    public GuavaDeserializers()
    {
    }

    public JsonDeserializer findBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
    {
        if (com/google/common/base/Optional.isAssignableFrom(javatype.getRawClass()))
        {
            return new GuavaOptionalDeserializer(javatype);
        } else
        {
            return super.findBeanDeserializer(javatype, deserializationconfig, beandescription);
        }
    }

    public JsonDeserializer findCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        deserializationconfig = collectiontype.getRawClass();
        if (com/google/common/a/em.isAssignableFrom(deserializationconfig))
        {
            if (com/google/common/a/es.isAssignableFrom(deserializationconfig))
            {
                return new ImmutableListDeserializer(collectiontype, typedeserializer, jsondeserializer);
            }
            if (com/google/common/a/fe.isAssignableFrom(deserializationconfig))
            {
                return new ImmutableMultisetDeserializer(collectiontype, typedeserializer, jsondeserializer);
            }
            if (com/google/common/a/fi.isAssignableFrom(deserializationconfig))
            {
                if (com/google/common/a/fy.isAssignableFrom(deserializationconfig))
                {
                    if (!java/lang/Comparable.isAssignableFrom(collectiontype.getContentType().getRawClass()))
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Can not handle ImmutableSortedSet with elements that are not Comparable<?> (").append(deserializationconfig.getName()).append(")").toString());
                    } else
                    {
                        return new ImmutableSortedSetDeserializer(collectiontype, typedeserializer, jsondeserializer);
                    }
                } else
                {
                    return new ImmutableSetDeserializer(collectiontype, typedeserializer, jsondeserializer);
                }
            } else
            {
                return new ImmutableListDeserializer(collectiontype, typedeserializer, jsondeserializer);
            }
        }
        if (com/google/common/a/jf.isAssignableFrom(deserializationconfig))
        {
            if (com/google/common/a/gv.isAssignableFrom(deserializationconfig))
            {
                return new LinkedHashMultisetDeserializer(collectiontype, typedeserializer, jsondeserializer);
            }
            if (com/google/common/a/eg.isAssignableFrom(deserializationconfig))
            {
                return new HashMultisetDeserializer(collectiontype, typedeserializer, jsondeserializer);
            }
            if (!com/google/common/a/du.isAssignableFrom(deserializationconfig));
            if (com/google/common/a/mf.isAssignableFrom(deserializationconfig))
            {
                return new TreeMultisetDeserializer(collectiontype, typedeserializer, jsondeserializer);
            } else
            {
                return new HashMultisetDeserializer(collectiontype, typedeserializer, jsondeserializer);
            }
        } else
        {
            return null;
        }
    }

    public JsonDeserializer findMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        deserializationconfig = maptype.getRawClass();
        if (com/google/common/a/ev.isAssignableFrom(deserializationconfig))
        {
            if (com/google/common/a/fp.isAssignableFrom(deserializationconfig))
            {
                return new ImmutableSortedMapDeserializer(maptype, keydeserializer, typedeserializer, jsondeserializer);
            }
            if (com/google/common/a/ej.isAssignableFrom(deserializationconfig))
            {
                return new ImmutableBiMapDeserializer(maptype, keydeserializer, typedeserializer, jsondeserializer);
            } else
            {
                return new ImmutableMapDeserializer(maptype, keydeserializer, typedeserializer, jsondeserializer);
            }
        }
        if (com/google/common/a/av.isAssignableFrom(deserializationconfig))
        {
            if (!com/google/common/a/ds.isAssignableFrom(deserializationconfig));
            if (!com/google/common/a/dt.isAssignableFrom(deserializationconfig));
            if (!com/google/common/a/ee.isAssignableFrom(deserializationconfig));
        }
        return null;
    }

    public JsonDeserializer findMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        deserializationconfig = mapliketype.getRawClass();
        if (com/google/common/a/ex.isAssignableFrom(deserializationconfig))
        {
            if (!com/google/common/a/eu.isAssignableFrom(deserializationconfig));
            if (!com/google/common/a/fn.isAssignableFrom(deserializationconfig));
        }
        if (com/google/common/a/iw.isAssignableFrom(deserializationconfig))
        {
            return new MultimapDeserializer(mapliketype, keydeserializer, typedeserializer, jsondeserializer);
        } else
        {
            if (!com/google/common/a/lx.isAssignableFrom(deserializationconfig));
            return null;
        }
    }
}
