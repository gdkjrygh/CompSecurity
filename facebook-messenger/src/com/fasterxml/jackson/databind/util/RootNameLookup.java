// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            LRUMap

public class RootNameLookup
{

    protected LRUMap _rootNames;

    public RootNameLookup()
    {
    }

    public SerializedString findRootName(JavaType javatype, MapperConfig mapperconfig)
    {
        return findRootName(javatype.getRawClass(), mapperconfig);
    }

    public SerializedString findRootName(Class class1, MapperConfig mapperconfig)
    {
        this;
        JVM INSTR monitorenter ;
        ClassKey classkey = new ClassKey(class1);
        if (_rootNames != null) goto _L2; else goto _L1
_L1:
        _rootNames = new LRUMap(20, 200);
_L4:
        BeanDescription beandescription = mapperconfig.introspectClassAnnotations(class1);
        mapperconfig = mapperconfig.getAnnotationIntrospector().findRootName(beandescription.getClassInfo());
        if (mapperconfig != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        class1 = class1.getSimpleName();
_L7:
        class1 = new SerializedString(class1);
        _rootNames.put(classkey, class1);
_L6:
        this;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        SerializedString serializedstring = (SerializedString)_rootNames.get(classkey);
        if (serializedstring == null) goto _L4; else goto _L3
_L3:
        class1 = serializedstring;
        if (true) goto _L6; else goto _L5
_L5:
          goto _L4
        class1;
        throw class1;
        class1 = mapperconfig;
          goto _L7
    }
}
