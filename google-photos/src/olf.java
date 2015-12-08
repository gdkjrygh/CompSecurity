// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

public final class olf
    implements HttpRequestHandler
{

    private static final Pattern a = Pattern.compile("bytes=(\\d*)-(\\d*)");
    private final String b;
    private final olg c;
    private final String d;

    public olf(String s, String s1, olg olg1)
    {
        b = s;
        c = olg1;
        d = s1;
    }

    public final void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
    {
        try
        {
            httpcontext = httprequest.getRequestLine().getMethod().toUpperCase(Locale.US);
            if (!httpcontext.equals("GET"))
            {
                throw new MethodNotSupportedException(String.valueOf(httpcontext).concat(" method is not supported."));
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            throw new HttpException("Internal error while handling a local file request", httprequest);
        }
        if (!httprequest.getRequestLine().getUri().equals(b))
        {
            httpresponse.setStatusCode(404);
            return;
        }
        httpcontext = httprequest.getLastHeader("Range");
        boolean flag;
        int i;
        long l;
        long l1;
        long l2;
        long l3;
        l = 0L;
        l1 = 0x7fffffffL;
        i = 0;
        flag = i;
        l2 = l;
        l3 = l1;
        if (httpcontext == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        httpcontext = a.matcher(httpcontext.getValue());
        flag = i;
        l2 = l;
        l3 = l1;
        if (!httpcontext.matches())
        {
            break MISSING_BLOCK_LABEL_293;
        }
        flag = true;
        String s = httpcontext.group(1);
        if (!TextUtils.isEmpty(s))
        {
            l = Long.parseLong(s);
        }
        httpcontext = httpcontext.group(2);
        if (!TextUtils.isEmpty(httpcontext))
        {
            l1 = Long.parseLong(httpcontext);
        }
        (new StringBuilder(58)).append("Range requested: ").append(l).append(":").append(l1);
        if (l >= 0L)
        {
            l2 = l;
            l3 = l1;
            if (l <= l1)
            {
                break MISSING_BLOCK_LABEL_293;
            }
        }
        Log.e("VideoServer", String.format("Invalid range %d-%d requested", new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        }));
        httpresponse.setStatusCode(416);
        return;
        int j;
        httpcontext = new oli(d, l2, l3);
        httprequest = httprequest.getAllHeaders();
        j = httprequest.length;
        i = 0;
_L4:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        obj = httprequest[i];
        String s1;
        if ("Range".equals(((Header) (obj)).getName()))
        {
            break MISSING_BLOCK_LABEL_530;
        }
        s1 = ((Header) (obj)).getName();
        obj = ((Header) (obj)).getValue();
        boolean flag1;
        if (!"Range".equals(s1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, "must not add a Range header");
        ((oli) (httpcontext)).a.put(s1, obj);
        break MISSING_BLOCK_LABEL_530;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        httpresponse.setStatusCode(206);
        httpresponse.setHeader("Content-Range", String.format(Locale.US, "bytes %d-%d/*", new Object[] {
            Long.valueOf(l2), Long.valueOf(l3)
        }));
_L2:
        httpresponse.setHeader("Content-Type", "video/mp4");
        httprequest = c.a(new olh(httpcontext));
        httpresponse.setEntity(new ole(httprequest));
        return;
        httpresponse.setStatusCode(200);
        if (true) goto _L2; else goto _L1
_L1:
        httprequest;
        Log.e("VideoServer", httprequest.toString());
        httpresponse.setStatusCode(404);
        return;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
