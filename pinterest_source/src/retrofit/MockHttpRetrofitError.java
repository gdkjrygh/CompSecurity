// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.reflect.Type;
import retrofit.client.Response;

// Referenced classes of package retrofit:
//            RetrofitError

class MockHttpRetrofitError extends RetrofitError
{

    private final Object body;

    MockHttpRetrofitError(String s, String s1, Response response, Object obj, Type type)
    {
        super(s, s1, response, null, type, RetrofitError.Kind.HTTP, null);
        body = obj;
    }

    public Object getBody()
    {
        return body;
    }

    public Object getBodyAs(Type type)
    {
        return body;
    }
}
