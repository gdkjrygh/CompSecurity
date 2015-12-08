// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Function, Preconditions

public abstract class Converter
    implements Function
{

    private final boolean handleNullAutomatically;
    private transient Converter reverse;

    protected Converter()
    {
        this(true);
    }

    Converter(boolean flag)
    {
        handleNullAutomatically = flag;
    }

    public static Converter from(Function function, Function function1)
    {
        return new FunctionBasedConverter(function, function1, null);
    }

    public static Converter identity()
    {
        return IdentityConverter.INSTANCE;
    }

    public final Converter andThen(Converter converter)
    {
        return doAndThen(converter);
    }

    public final Object apply(Object obj)
    {
        return convert(obj);
    }

    public final Object convert(Object obj)
    {
        return correctedDoForward(obj);
    }

    public Iterable convertAll(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new _cls1(iterable);
    }

    Object correctedDoBackward(Object obj)
    {
        if (handleNullAutomatically)
        {
            if (obj == null)
            {
                return null;
            } else
            {
                return Preconditions.checkNotNull(doBackward(obj));
            }
        } else
        {
            return doBackward(obj);
        }
    }

    Object correctedDoForward(Object obj)
    {
        if (handleNullAutomatically)
        {
            if (obj == null)
            {
                return null;
            } else
            {
                return Preconditions.checkNotNull(doForward(obj));
            }
        } else
        {
            return doForward(obj);
        }
    }

    Converter doAndThen(Converter converter)
    {
        return new ConverterComposition((Converter)Preconditions.checkNotNull(converter));
    }

    protected abstract Object doBackward(Object obj);

    protected abstract Object doForward(Object obj);

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public Converter reverse()
    {
        Converter converter = reverse;
        Object obj = converter;
        if (converter == null)
        {
            obj = new ReverseConverter();
            reverse = ((Converter) (obj));
        }
        return ((Converter) (obj));
    }

    /* member class not found */
    class FunctionBasedConverter {}


    /* member class not found */
    class IdentityConverter {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class ConverterComposition {}


    /* member class not found */
    class ReverseConverter {}

}
