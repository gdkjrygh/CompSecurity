// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.annotations;

import com.google.common.a.ec;
import com.google.common.a.ik;
import com.google.common.a.lx;
import com.google.common.base.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.util.Map;

public class a
{

    private static final a a = new a();
    private final lx b = ec.a();
    private final Map c = ik.a();
    private int d;
    private int e;

    a()
    {
    }

    public static a a()
    {
        return a;
    }

    public Annotation a(AnnotatedElement annotatedelement, Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = (Optional)b.a(annotatedelement, class1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        d = d + 1;
        annotatedelement = (Annotation)((Optional) (obj)).orNull();
_L4:
        this;
        JVM INSTR monitorexit ;
        return annotatedelement;
_L2:
        obj = annotatedelement.getAnnotation(class1);
        b.a(annotatedelement, class1, Optional.fromNullable(obj));
        e = e + 1;
        annotatedelement = ((AnnotatedElement) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        annotatedelement;
        throw annotatedelement;
    }

    public Annotation[][] a(Constructor constructor)
    {
        this;
        JVM INSTR monitorenter ;
        Annotation aannotation[][] = (Annotation[][])c.get(constructor);
        if (aannotation == null) goto _L2; else goto _L1
_L1:
        d = d + 1;
        constructor = aannotation;
_L4:
        this;
        JVM INSTR monitorexit ;
        return constructor;
_L2:
        aannotation = constructor.getParameterAnnotations();
        c.put(constructor, aannotation);
        e = e + 1;
        constructor = aannotation;
        if (true) goto _L4; else goto _L3
_L3:
        constructor;
        throw constructor;
    }

    public boolean b(AnnotatedElement annotatedelement, Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        annotatedelement = a(annotatedelement, class1);
        boolean flag;
        if (annotatedelement != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        annotatedelement;
        throw annotatedelement;
    }

}
