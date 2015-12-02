// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class StdSubtypeResolver extends SubtypeResolver
{

    protected LinkedHashSet _registeredSubtypes;

    public StdSubtypeResolver()
    {
    }

    protected void _collectAndResolve(AnnotatedClass annotatedclass, NamedType namedtype, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, HashMap hashmap)
    {
        NamedType namedtype1;
        namedtype1 = namedtype;
        if (!namedtype.hasName())
        {
            String s = annotationintrospector.findTypeName(annotatedclass);
            namedtype1 = namedtype;
            if (s != null)
            {
                namedtype1 = new NamedType(namedtype.getType(), s);
            }
        }
        if (!hashmap.containsKey(namedtype1)) goto _L2; else goto _L1
_L1:
        if (namedtype1.hasName() && !((NamedType)hashmap.get(namedtype1)).hasName())
        {
            hashmap.put(namedtype1, namedtype1);
        }
_L4:
        return;
_L2:
        hashmap.put(namedtype1, namedtype1);
        annotatedclass = annotationintrospector.findSubtypes(annotatedclass);
        if (annotatedclass != null && !annotatedclass.isEmpty())
        {
            namedtype = annotatedclass.iterator();
            while (namedtype.hasNext()) 
            {
                annotatedclass = (NamedType)namedtype.next();
                AnnotatedClass annotatedclass1 = AnnotatedClass.constructWithoutSuperTypes(annotatedclass.getType(), annotationintrospector, mapperconfig);
                if (!annotatedclass.hasName())
                {
                    annotatedclass = new NamedType(annotatedclass.getType(), annotationintrospector.findTypeName(annotatedclass1));
                }
                _collectAndResolve(annotatedclass1, ((NamedType) (annotatedclass)), mapperconfig, annotationintrospector, hashmap);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Collection collectAndResolveSubtypes(AnnotatedClass annotatedclass, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector)
    {
        HashMap hashmap = new HashMap();
        if (_registeredSubtypes != null)
        {
            Class class1 = annotatedclass.getRawType();
            Iterator iterator = _registeredSubtypes.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                NamedType namedtype = (NamedType)iterator.next();
                if (class1.isAssignableFrom(namedtype.getType()))
                {
                    _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), annotationintrospector, mapperconfig), namedtype, mapperconfig, annotationintrospector, hashmap);
                }
            } while (true);
        }
        _collectAndResolve(annotatedclass, new NamedType(annotatedclass.getRawType(), null), mapperconfig, annotationintrospector, hashmap);
        return new ArrayList(hashmap.values());
    }

    public Collection collectAndResolveSubtypes(AnnotatedMember annotatedmember, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector)
    {
        HashMap hashmap = new HashMap();
        if (_registeredSubtypes != null)
        {
            Class class1 = annotatedmember.getRawType();
            Iterator iterator = _registeredSubtypes.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                NamedType namedtype1 = (NamedType)iterator.next();
                if (class1.isAssignableFrom(namedtype1.getType()))
                {
                    _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedtype1.getType(), annotationintrospector, mapperconfig), namedtype1, mapperconfig, annotationintrospector, hashmap);
                }
            } while (true);
        }
        Object obj = annotationintrospector.findSubtypes(annotatedmember);
        if (obj != null)
        {
            NamedType namedtype;
            for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedtype.getType(), annotationintrospector, mapperconfig), namedtype, mapperconfig, annotationintrospector, hashmap))
            {
                namedtype = (NamedType)((Iterator) (obj)).next();
            }

        }
        obj = new NamedType(annotatedmember.getRawType(), null);
        _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(annotatedmember.getRawType(), annotationintrospector, mapperconfig), ((NamedType) (obj)), mapperconfig, annotationintrospector, hashmap);
        return new ArrayList(hashmap.values());
    }

    public transient void registerSubtypes(NamedType anamedtype[])
    {
        if (_registeredSubtypes == null)
        {
            _registeredSubtypes = new LinkedHashSet();
        }
        int j = anamedtype.length;
        for (int i = 0; i < j; i++)
        {
            NamedType namedtype = anamedtype[i];
            _registeredSubtypes.add(namedtype);
        }

    }

    public transient void registerSubtypes(Class aclass[])
    {
        NamedType anamedtype[] = new NamedType[aclass.length];
        int i = 0;
        for (int j = aclass.length; i < j; i++)
        {
            anamedtype[i] = new NamedType(aclass[i]);
        }

        registerSubtypes(anamedtype);
    }
}
