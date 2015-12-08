// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.converter;

import java.lang.reflect.Type;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit.converter:
//            ConversionException

public interface Converter
{

    public abstract Object fromBody(TypedInput typedinput, Type type)
        throws ConversionException;

    public abstract TypedOutput toBody(Object obj);
}
