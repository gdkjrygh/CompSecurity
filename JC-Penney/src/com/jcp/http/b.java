// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.http;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.util.ae;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{

    private static final String a = com/jcp/http/b.getName();
    private static final MediaType b = MediaType.parse("image/jpg");
    private static final MediaType c = MediaType.parse("application/json");

    private b()
    {
    }

    public static Request a(String s)
    {
        return a(s, ((Map) (null)));
    }

    public static Request a(String s, Map map)
    {
        return b(s, map).build();
    }

    protected static Request a(String s, Map map, String s1, int i)
    {
        s = b(s, map);
        if (!TextUtils.isEmpty(s1))
        {
            if (i == 1)
            {
                s.post(RequestBody.create(c, s1));
            } else
            {
                s.put(RequestBody.create(c, s1));
            }
        }
        return s.build();
    }

    protected static Request a(String s, Map map, byte abyte0[], int i)
    {
        s = b(s, null);
        if (abyte0 != null && abyte0.length > 0)
        {
            map = (new MultipartBuilder("my_boundary_string")).type(MultipartBuilder.FORM).addPart(Headers.of(new String[] {
                "Content-Disposition", "form-data; name=\"img\"; filename=\"image.jpg\""
            }), RequestBody.create(null, "Uploaded image")).addPart(Headers.of(new String[] {
                "Content-Disposition", "form-data; name=\"image\""
            }), RequestBody.create(b, abyte0)).build();
            if (i == 1)
            {
                s.post(map);
            } else
            {
                s.put(map);
            }
        }
        return s.build();
    }

    public static String a(Response response)
    {
        if (response != null)
        {
            try
            {
                ResponseBody responsebody = response.body();
                response = a(response.body().byteStream());
                responsebody.close();
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                ae.a(a, "Exception getting response body:", response);
                return null;
            }
            return response;
        } else
        {
            return null;
        }
    }

    private static String a(InputStream inputstream)
    {
        Object obj1;
        char ac[];
        obj1 = new StringBuilder();
        ac = new char[1024];
        BufferedReader bufferedreader1 = new BufferedReader(new InputStreamReader(inputstream));
_L2:
        BufferedReader bufferedreader = bufferedreader1;
        int i = bufferedreader1.read(ac, 0, 1024);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        bufferedreader = bufferedreader1;
        ((StringBuilder) (obj1)).append(ac, 0, i);
        if (true) goto _L2; else goto _L1
        obj1;
_L6:
        bufferedreader = bufferedreader1;
        ae.a(a, "Exception reading from input stream reader", ((Exception) (obj1)));
        bufferedreader = bufferedreader1;
        throw obj1;
        obj1;
        Object obj;
        bufferedreader1 = bufferedreader;
        obj = obj1;
_L4:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing input stream", inputstream);
            }
        }
        if (bufferedreader1 != null)
        {
            try
            {
                bufferedreader1.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing buffer reader", inputstream);
            }
        }
        throw obj;
_L1:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing input stream", inputstream);
            }
        }
        if (bufferedreader1 != null)
        {
            try
            {
                bufferedreader1.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing buffer reader", inputstream);
            }
        }
        return ((StringBuilder) (obj1)).toString();
        obj;
        bufferedreader1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        bufferedreader1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(com.jcp.pojo.Response response, int i)
    {
        response.setReJcpRequestTypes(i);
        response.setStatusCode(-2);
        response.setResponseBoday("");
        response.setErrorMsg("");
    }

    public static void a(com.jcp.pojo.Response response, Context context, String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("errorCode", "Special error");
            jsonobject.put("errorMessage", context.getString(0x7f0702b7));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        response.setResponseBoday(jsonobject.toString());
        response.setOptionalMsg(s);
    }

    public static boolean a(int i)
    {
        return i == 201 || i == 200;
    }

    protected static com.squareup.okhttp.Request.Builder b(String s, Map map)
    {
        com.squareup.okhttp.Request.Builder builder = new com.squareup.okhttp.Request.Builder();
        builder.url(s);
        if (map != null && !map.isEmpty())
        {
            builder.headers(Headers.of(map));
        }
        return builder;
    }

    public static boolean b(int i)
    {
        return i != 201 && i != 200;
    }

}
