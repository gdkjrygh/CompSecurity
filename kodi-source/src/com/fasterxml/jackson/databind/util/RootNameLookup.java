// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            LRUMap

public class RootNameLookup
    implements Serializable
{

    protected transient LRUMap _rootNames;

    public RootNameLookup()
    {
        _rootNames = new LRUMap(20, 200);
    }

    public PropertyName findRootName(JavaType javatype, MapperConfig mapperconfig)
    {
        return findRootName(javatype.getRawClass(), mapperconfig);
    }

    public PropertyName findRootName(Class class1, MapperConfig mapperconfig)
    {
        ClassKey classkey;
label0:
        {
            classkey = new ClassKey(class1);
            Object obj = (PropertyName)_rootNames.get(classkey);
            if (obj != null)
            {
                return ((PropertyName) (obj));
            }
            obj = mapperconfig.introspectClassAnnotations(class1);
            obj = mapperconfig.getAnnotationIntrospector().findRootName(((BeanDescription) (obj)).getClassInfo());
            if (obj != null)
            {
                mapperconfig = ((MapperConfig) (obj));
                if (((PropertyName) (obj)).hasSimpleName())
                {
                    break label0;
                }
            }
            mapperconfig = new PropertyName(class1.getSimpleName());
        }
        _rootNames.put(classkey, mapperconfig);
        return mapperconfig;
    }
}
