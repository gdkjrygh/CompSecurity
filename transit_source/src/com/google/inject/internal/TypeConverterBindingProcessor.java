// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$SourceProvider;
import com.google.inject.internal.util.$Strings;
import com.google.inject.matcher.AbstractMatcher;
import com.google.inject.matcher.Matcher;
import com.google.inject.matcher.Matchers;
import com.google.inject.spi.TypeConverter;
import com.google.inject.spi.TypeConverterBinding;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, InjectorImpl, State, Errors

final class TypeConverterBindingProcessor extends AbstractProcessor
{

    TypeConverterBindingProcessor(Errors errors)
    {
        super(errors);
    }

    private void convertToClass(Class class1, TypeConverter typeconverter)
    {
        convertToClasses(Matchers.identicalTo(class1), typeconverter);
    }

    private void convertToClasses(final Matcher typeMatcher, TypeConverter typeconverter)
    {
        internalConvertToTypes(new AbstractMatcher() {

            final TypeConverterBindingProcessor this$0;
            final Matcher val$typeMatcher;

            public boolean matches(TypeLiteral typeliteral)
            {
                typeliteral = typeliteral.getType();
                if (!(typeliteral instanceof Class))
                {
                    return false;
                } else
                {
                    typeliteral = (Class)typeliteral;
                    return typeMatcher.matches(typeliteral);
                }
            }

            public volatile boolean matches(Object obj)
            {
                return matches((TypeLiteral)obj);
            }

            public String toString()
            {
                return typeMatcher.toString();
            }

            
            {
                this$0 = TypeConverterBindingProcessor.this;
                typeMatcher = matcher;
                super();
            }
        }, typeconverter);
    }

    private void convertToPrimitiveType(Class class1, Class class2)
    {
        try
        {
            convertToClass(class2, new TypeConverter() {

                final TypeConverterBindingProcessor this$0;
                final Method val$parser;
                final Class val$wrapperType;

                public Object convert(String s, TypeLiteral typeliteral)
                {
                    try
                    {
                        s = ((String) (parser.invoke(null, new Object[] {
                            s
                        })));
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw new AssertionError(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw new RuntimeException(s.getTargetException().getMessage());
                    }
                    return s;
                }

                public String toString()
                {
                    return (new StringBuilder()).append("TypeConverter<").append(wrapperType.getSimpleName()).append(">").toString();
                }

            
            {
                this$0 = TypeConverterBindingProcessor.this;
                parser = method;
                wrapperType = class1;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError(class1);
        }
    }

    private void internalConvertToTypes(Matcher matcher, TypeConverter typeconverter)
    {
        injector.state.addConverter(new TypeConverterBinding($SourceProvider.UNKNOWN_SOURCE, matcher, typeconverter));
    }

    void prepareBuiltInConverters(InjectorImpl injectorimpl)
    {
        injector = injectorimpl;
        convertToPrimitiveType(Integer.TYPE, java/lang/Integer);
        convertToPrimitiveType(Long.TYPE, java/lang/Long);
        convertToPrimitiveType(Boolean.TYPE, java/lang/Boolean);
        convertToPrimitiveType(Byte.TYPE, java/lang/Byte);
        convertToPrimitiveType(Short.TYPE, java/lang/Short);
        convertToPrimitiveType(Float.TYPE, java/lang/Float);
        convertToPrimitiveType(Double.TYPE, java/lang/Double);
        convertToClass(java/lang/Character, new TypeConverter() {

            final TypeConverterBindingProcessor this$0;

            public Object convert(String s, TypeLiteral typeliteral)
            {
                s = s.trim();
                if (s.length() != 1)
                {
                    throw new RuntimeException("Length != 1.");
                } else
                {
                    return Character.valueOf(s.charAt(0));
                }
            }

            public String toString()
            {
                return "TypeConverter<Character>";
            }

            
            {
                this$0 = TypeConverterBindingProcessor.this;
                super();
            }
        });
        convertToClasses(Matchers.subclassesOf(java/lang/Enum), new TypeConverter() {

            final TypeConverterBindingProcessor this$0;

            public Object convert(String s, TypeLiteral typeliteral)
            {
                return Enum.valueOf(typeliteral.getRawType(), s);
            }

            public String toString()
            {
                return "TypeConverter<E extends Enum<E>>";
            }

            
            {
                this$0 = TypeConverterBindingProcessor.this;
                super();
            }
        });
        internalConvertToTypes(new AbstractMatcher() {

            final TypeConverterBindingProcessor this$0;

            public boolean matches(TypeLiteral typeliteral)
            {
                return typeliteral.getRawType() == java/lang/Class;
            }

            public volatile boolean matches(Object obj)
            {
                return matches((TypeLiteral)obj);
            }

            public String toString()
            {
                return "Class<?>";
            }

            
            {
                this$0 = TypeConverterBindingProcessor.this;
                super();
            }
        }, new TypeConverter() {

            final TypeConverterBindingProcessor this$0;

            public Object convert(String s, TypeLiteral typeliteral)
            {
                try
                {
                    s = Class.forName(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new RuntimeException(s.getMessage());
                }
                return s;
            }

            public String toString()
            {
                return "TypeConverter<Class<?>>";
            }

            
            {
                this$0 = TypeConverterBindingProcessor.this;
                super();
            }
        });
        injector = null;
        return;
        injectorimpl;
        injector = null;
        throw injectorimpl;
    }

    public Boolean visit(TypeConverterBinding typeconverterbinding)
    {
        injector.state.addConverter(new TypeConverterBinding(typeconverterbinding.getSource(), typeconverterbinding.getTypeMatcher(), typeconverterbinding.getTypeConverter()));
        return Boolean.valueOf(true);
    }

    public volatile Object visit(TypeConverterBinding typeconverterbinding)
    {
        return visit(typeconverterbinding);
    }
}
