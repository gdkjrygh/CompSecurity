// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

final class mjd
{

    static final Map a;
    final mjf b = new mjf(this);
    final Map c = new HashMap();
    final Context d;
    final mjk e;
    private final mjm f;

    mjd(Context context, mjk mjk, mjm mjm)
    {
        d = context;
        e = mjk;
        f = mjm;
    }

    static IOException a(HttpUrlRequest httpurlrequest)
    {
        if (!httpurlrequest.i())
        {
            if (httpurlrequest.d() != null)
            {
                return httpurlrequest.d();
            }
            if (httpurlrequest.b() != 200)
            {
                return new and("Request failed", httpurlrequest.b());
            }
            if (httpurlrequest.e() == null)
            {
                return new and("Failed to retrieve data");
            }
            if ((long)httpurlrequest.e().limit() != httpurlrequest.a())
            {
                String s = String.valueOf("Content length mismatch, expected: ");
                long l = httpurlrequest.a();
                int i = httpurlrequest.e().limit();
                return new and((new StringBuilder(String.valueOf(s).length() + 43)).append(s).append(l).append(", received: ").append(i).toString());
            }
        }
        return null;
    }

    static Map a(mjd mjd1)
    {
        return mjd1.c;
    }

    static mjm b(mjd mjd1)
    {
        return mjd1.f;
    }

    static mjf c(mjd mjd1)
    {
        return mjd1.b;
    }

    static 
    {
        EnumMap enummap = new EnumMap(amb);
        a = enummap;
        enummap.put(amb.a, Integer.valueOf(4));
        a.put(amb.b, Integer.valueOf(3));
        a.put(amb.c, Integer.valueOf(2));
        a.put(amb.d, Integer.valueOf(1));
    }
}
