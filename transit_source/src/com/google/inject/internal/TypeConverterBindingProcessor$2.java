// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.TypeLiteral;
import com.google.inject.spi.TypeConverter;

// Referenced classes of package com.google.inject.internal:
//            TypeConverterBindingProcessor

class this._cls0
    implements TypeConverter
{

    final TypeConverterBindingProcessor this$0;

    public Object convert(String s, TypeLiteral typeliteral)
    {
        return Enum.valueOf(typeliteral.getRawType(), s);
    }

    public String toString()
    {
        return "TypeConverter<E extends Enum<E>>";
    }

    ()
    {
        this$0 = TypeConverterBindingProcessor.this;
        super();
    }
}
