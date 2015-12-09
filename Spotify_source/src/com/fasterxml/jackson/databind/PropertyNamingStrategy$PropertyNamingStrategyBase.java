// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

// Referenced classes of package com.fasterxml.jackson.databind:
//            PropertyNamingStrategy

public abstract class  extends PropertyNamingStrategy
{

    public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
    {
        return translate(s);
    }

    public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
    {
        return translate(s);
    }

    public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return translate(s);
    }

    public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return translate(s);
    }

    public abstract String translate(String s);

    public ()
    {
    }
}
