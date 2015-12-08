// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.ArrayList;
import java.util.List;
import retrofit.client.Header;
import retrofit.client.Response;
import retrofit.converter.Converter;

// Referenced classes of package retrofit:
//            MockTypedInput

public class MockHttpException extends RuntimeException
{

    final int code;
    final List headers = new ArrayList(2);
    final String reason;
    final Object responseBody;

    public MockHttpException(int i, String s, Object obj)
    {
        super((new StringBuilder("HTTP ")).append(i).append(" ").append(s).toString());
        if (i < 300 || i > 599)
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported HTTP error code: ")).append(i).toString());
        }
        if (s == null || "".equals(s.trim()))
        {
            throw new IllegalArgumentException("Reason must not be blank.");
        } else
        {
            code = i;
            reason = s;
            responseBody = obj;
            return;
        }
    }

    public static MockHttpException newBadRequest(Object obj)
    {
        return new MockHttpException(400, "Bad Request", obj);
    }

    public static MockHttpException newForbidden(Object obj)
    {
        return new MockHttpException(403, "Forbidded", obj);
    }

    public static MockHttpException newInternalError(Object obj)
    {
        return new MockHttpException(500, "Internal Server Error", obj);
    }

    public static MockHttpException newMovedPermanentely(String s, Object obj)
    {
        if (s == null || "".equals(s.trim()))
        {
            throw new IllegalArgumentException("Location must not be blank.");
        } else
        {
            return (new MockHttpException(301, "Moved Permanently", obj)).withHeader("Location", s);
        }
    }

    public static MockHttpException newMovedTemporarily(String s, Object obj)
    {
        if (s == null || "".equals(s.trim()))
        {
            throw new IllegalArgumentException("Location must not be blank.");
        } else
        {
            return (new MockHttpException(302, "Moved Temporarily", obj)).withHeader("Location", s);
        }
    }

    public static MockHttpException newNotFound(Object obj)
    {
        return new MockHttpException(404, "Not Found", obj);
    }

    public static MockHttpException newUnauthorized(Object obj)
    {
        return new MockHttpException(401, "Unauthorized", obj);
    }

    Response toResponse(Converter converter)
    {
        return new Response("", code, reason, headers, new MockTypedInput(converter, responseBody));
    }

    public MockHttpException withHeader(String s, String s1)
    {
        if (s == null || "".equals(s.trim()))
        {
            throw new IllegalArgumentException("Header name must not be blank.");
        }
        if (s1 == null || "".equals(s1.trim()))
        {
            throw new IllegalArgumentException("Header value must not be blank.");
        } else
        {
            headers.add(new Header(s, s1));
            return this;
        }
    }
}
