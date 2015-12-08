// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.error;

import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.server.response.FastParser;
import com.google.android.gms.common.util.IOUtils;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.google.android.gms.common.server.error:
//            ErrorInstanceResponse, ErrorResponse, TopLevelErrorResponse

public final class ErrorUtils
{

    private static final FastParser sErrorParser = new FastParser();

    public static String analyzeReason(VolleyError volleyerror)
    {
        Object obj;
        byte abyte0[];
        String s;
        obj = volleyerror.networkResponse;
        if (obj == null)
        {
            return null;
        }
        Map map = ((NetworkResponse) (obj)).headers;
        if (map == null)
        {
            return null;
        }
        s = (String)map.get("Content-Type");
        if (s == null)
        {
            return null;
        }
        abyte0 = ((NetworkResponse) (obj)).data;
        obj = abyte0;
        if (!IOUtils.isGzipByteBuffer(abyte0)) goto _L2; else goto _L1
_L1:
        ByteArrayInputStream bytearrayinputstream;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayinputstream = new ByteArrayInputStream(abyte0);
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = bytearrayinputstream;
        Object obj1 = new GZIPInputStream(bytearrayinputstream);
        obj = new byte[4096];
_L5:
        int i = ((InputStream) (obj1)).read(((byte []) (obj)), 0, 4096);
        if (i == -1) goto _L4; else goto _L3
_L3:
        bytearrayoutputstream.write(((byte []) (obj)), 0, i);
          goto _L5
        obj;
        volleyerror = ((VolleyError) (obj1));
        obj1 = obj;
_L9:
        obj = volleyerror;
        Log.e("ErrorUtils", ((IOException) (obj1)).toString());
        try
        {
            volleyerror.close();
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            Log.e("ErrorUtils", volleyerror.toString());
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            Log.e("ErrorUtils", volleyerror.toString());
        }
        return null;
_L4:
        bytearrayoutputstream.flush();
        obj = bytearrayoutputstream.toByteArray();
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("ErrorUtils", ((IOException) (obj1)).toString());
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("ErrorUtils", ((IOException) (obj1)).toString());
        }
          goto _L2
        volleyerror;
_L7:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("ErrorUtils", ((IOException) (obj)).toString());
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("ErrorUtils", ((IOException) (obj)).toString());
        }
        throw volleyerror;
_L2:
        if (s.startsWith("application/json"))
        {
            volleyerror = getErrorInstance(volleyerror, null);
            if (volleyerror == null)
            {
                return null;
            } else
            {
                return volleyerror.getReason();
            }
        }
        if (s.startsWith("application/x-protobuf"))
        {
            volleyerror = new com.google.api.server.core.errors.proto.Output.ErrorBody();
            try
            {
                MessageNano.mergeFrom$1ec43da(volleyerror, ((byte []) (obj)), obj.length);
            }
            // Misplaced declaration of an exception variable
            catch (VolleyError volleyerror)
            {
                Log.e("ErrorUtils", volleyerror.toString());
                return null;
            }
            if (((com.google.api.server.core.errors.proto.Output.ErrorBody) (volleyerror)).error != null && ((com.google.api.server.core.errors.proto.Output.ErrorBody) (volleyerror)).error.errors != null && ((com.google.api.server.core.errors.proto.Output.ErrorBody) (volleyerror)).error.errors.length > 0)
            {
                return ((com.google.api.server.core.errors.proto.Output.ErrorBody) (volleyerror)).error.errors[0].reason;
            } else
            {
                return null;
            }
        }
        if (s.startsWith("text/html"))
        {
            volleyerror = new String(((byte []) (obj)));
            if ("Invalid Credentials".equalsIgnoreCase(volleyerror))
            {
                return "authError";
            }
            if ("Session Expired".equalsIgnoreCase(volleyerror))
            {
                return "expired";
            }
            if ("User Rate Limit Exceeded".equalsIgnoreCase(volleyerror))
            {
                return "userRateLimitExceeded";
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
        volleyerror;
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        volleyerror = bytearrayinputstream;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static ErrorInstanceResponse getErrorInstance(VolleyError volleyerror, String s)
    {
        volleyerror = parseAndLogErrorResponse(volleyerror, s);
        if (volleyerror != null)
        {
            if ((volleyerror = volleyerror.getErrors()) != null && volleyerror.size() != 0)
            {
                return (ErrorInstanceResponse)volleyerror.get(0);
            }
        }
        return null;
    }

    public static boolean hasStatusCode(VolleyError volleyerror, int i)
    {
        while (volleyerror.networkResponse == null || volleyerror.networkResponse.statusCode != i) 
        {
            return false;
        }
        return true;
    }

    public static boolean isTransientError(VolleyError volleyerror)
    {
        if (volleyerror.networkResponse == null)
        {
            return true;
        }
        switch (volleyerror.networkResponse.statusCode)
        {
        case 401: 
        case 402: 
        default:
            return true;

        case 400: 
        case 403: 
        case 404: 
            return false;
        }
    }

    public static ErrorResponse parseAndLogErrorResponse(VolleyError volleyerror, String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        byte abyte0[];
        Asserts.checkNotNull(volleyerror);
        if (volleyerror.networkResponse == null || volleyerror.networkResponse.data == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        abyte0 = volleyerror.networkResponse.data;
        obj4 = null;
        obj5 = null;
        obj = null;
        obj2 = obj;
        obj3 = obj4;
        obj1 = obj5;
        if (!IOUtils.isGzipByteBuffer(abyte0)) goto _L2; else goto _L1
_L1:
        obj2 = obj;
        obj3 = obj4;
        obj1 = obj5;
        obj = new GZIPInputStream(new ByteArrayInputStream(abyte0));
_L4:
        obj2 = obj;
        obj3 = obj;
        obj1 = obj;
        obj4 = new TopLevelErrorResponse();
        obj2 = obj;
        obj3 = obj;
        obj1 = obj;
        sErrorParser.parse(((InputStream) (obj)), ((com.google.android.gms.common.server.response.FastJsonResponse) (obj4)));
        obj2 = obj;
        obj3 = obj;
        obj1 = obj;
        obj4 = (ErrorResponse)((TopLevelErrorResponse) (obj4)).mConcreteTypes.get("error");
        if (s == null || obj4 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj2 = obj;
        obj3 = obj;
        obj1 = obj;
        Log.w(s, ((ErrorResponse) (obj4)).toString());
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            Log.e("ErrorUtils", "Failed to close input stream", volleyerror);
            return ((ErrorResponse) (obj4));
        }
        return ((ErrorResponse) (obj4));
_L2:
        obj2 = obj;
        obj3 = obj4;
        obj1 = obj5;
        obj = new ByteArrayInputStream(abyte0);
        if (true) goto _L4; else goto _L3
_L3:
        volleyerror;
        obj1 = obj2;
        Log.e("ErrorUtils", "Unable to read error response", volleyerror);
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (VolleyError volleyerror)
            {
                Log.e("ErrorUtils", "Failed to close input stream", volleyerror);
            }
        }
_L6:
        return null;
        s;
        obj1 = obj3;
        int i = volleyerror.networkResponse.statusCode;
        obj1 = obj3;
        Log.e("ErrorUtils", (new StringBuilder("Received generic error from server: ")).append(i).toString());
        if (obj3 != null)
        {
            try
            {
                ((InputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (VolleyError volleyerror)
            {
                Log.e("ErrorUtils", "Failed to close input stream", volleyerror);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        volleyerror;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("ErrorUtils", "Failed to close input stream", s);
            }
        }
        throw volleyerror;
    }

}
