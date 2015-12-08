// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.IOException;
import java.lang.reflect.Type;
import retrofit.client.Response;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;

public class RetrofitError extends RuntimeException
{
    public static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind CONVERSION;
        public static final Kind HTTP;
        public static final Kind NETWORK;
        public static final Kind UNEXPECTED;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(retrofit/RetrofitError$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            NETWORK = new Kind("NETWORK", 0);
            CONVERSION = new Kind("CONVERSION", 1);
            HTTP = new Kind("HTTP", 2);
            UNEXPECTED = new Kind("UNEXPECTED", 3);
            $VALUES = (new Kind[] {
                NETWORK, CONVERSION, HTTP, UNEXPECTED
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    private final Converter converter;
    private final Kind kind;
    private final Response response;
    private final Type successType;
    private final String url;

    RetrofitError(String s, String s1, Response response1, Converter converter1, Type type, Kind kind1, Throwable throwable)
    {
        super(s, throwable);
        url = s1;
        response = response1;
        converter = converter1;
        successType = type;
        kind = kind1;
    }

    public static RetrofitError conversionError(String s, Response response1, Converter converter1, Type type, ConversionException conversionexception)
    {
        return new RetrofitError(conversionexception.getMessage(), s, response1, converter1, type, Kind.CONVERSION, conversionexception);
    }

    public static RetrofitError httpError(String s, Response response1, Converter converter1, Type type)
    {
        return new RetrofitError((new StringBuilder()).append(response1.getStatus()).append(" ").append(response1.getReason()).toString(), s, response1, converter1, type, Kind.HTTP, null);
    }

    public static RetrofitError networkError(String s, IOException ioexception)
    {
        return new RetrofitError(ioexception.getMessage(), s, null, null, null, Kind.NETWORK, ioexception);
    }

    public static RetrofitError unexpectedError(String s, Throwable throwable)
    {
        return new RetrofitError(throwable.getMessage(), s, null, null, null, Kind.UNEXPECTED, throwable);
    }

    public Object getBody()
    {
        return getBodyAs(successType);
    }

    public Object getBodyAs(Type type)
    {
        retrofit.mime.TypedInput typedinput;
        if (response != null)
        {
            if ((typedinput = response.getBody()) != null)
            {
                try
                {
                    type = ((Type) (converter.fromBody(typedinput, type)));
                }
                // Misplaced declaration of an exception variable
                catch (Type type)
                {
                    throw new RuntimeException(type);
                }
                return type;
            }
        }
        return null;
    }

    public Kind getKind()
    {
        return kind;
    }

    public Response getResponse()
    {
        return response;
    }

    public Type getSuccessType()
    {
        return successType;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isNetworkError()
    {
        return kind == Kind.NETWORK;
    }
}
