// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.matcher.Matcher;

// Referenced classes of package com.google.inject.spi:
//            Element, TypeConverter, ElementVisitor

public final class TypeConverterBinding
    implements Element
{

    private final Object source;
    private final TypeConverter typeConverter;
    private final Matcher typeMatcher;

    public TypeConverterBinding(Object obj, Matcher matcher, TypeConverter typeconverter)
    {
        source = $Preconditions.checkNotNull(obj, "source");
        typeMatcher = (Matcher)$Preconditions.checkNotNull(matcher, "typeMatcher");
        typeConverter = (TypeConverter)$Preconditions.checkNotNull(typeconverter, "typeConverter");
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        binder.withSource(getSource()).convertToTypes(typeMatcher, typeConverter);
    }

    public Object getSource()
    {
        return source;
    }

    public TypeConverter getTypeConverter()
    {
        return typeConverter;
    }

    public Matcher getTypeMatcher()
    {
        return typeMatcher;
    }

    public String toString()
    {
        return (new StringBuilder()).append(typeConverter).append(" which matches ").append(typeMatcher).append(" (bound at ").append(source).append(")").toString();
    }
}
