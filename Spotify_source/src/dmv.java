// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.squareup.okhttp.Protocol;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public final class dmv
    implements grl
{

    private final HashMap a = new HashMap();

    public dmv()
    {
        ggb.a();
    }

    public final grt a(grm grm1)
    {
        Object obj1 = grm1.a();
        if (!dmw.a(((grq) (obj1)))) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        obj2 = Uri.parse(((grq) (obj1)).a().toExternalForm());
        obj = ((Uri) (obj2)).getPathSegments();
        obj2 = (new StringBuilder()).append(((Uri) (obj2)).getHost());
        if (((List) (obj)).isEmpty())
        {
            obj = "";
        } else
        {
            obj = (String)((List) (obj)).get(0);
        }
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj))).toString();
        obj = a.get(obj2);
        if (obj == null)
        {
            obj = Long.valueOf(0L);
        }
        if (((Long)obj).longValue() - gcf.b() > 0L)
        {
            return (new gru()).a(((grq) (obj1))).a(Protocol.b).a(429).a();
        }
        grm1 = grm1.a(((grq) (obj1)));
        obj = grm1.b("Retry-After");
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj1 = grm1.d().b("Retry-After");
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        long l;
        obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(((java.util.Date) (obj1)));
        l = gcf.b();
        l = (((Calendar) (obj)).getTimeInMillis() - gcf.a()) + l;
_L7:
        a.put(obj2, Long.valueOf(l));
_L4:
        return grm1;
_L6:
        long l1;
        l = gcf.b();
        l1 = Long.parseLong(((String) (obj)));
        l = l1 * 1000L + l;
        continue; /* Loop/switch isn't completed */
        obj1;
        Assertion.b((new StringBuilder("Could not parse Retry-After header as long: ")).append(((String) (obj))).toString());
        l = 0L;
        if (true) goto _L7; else goto _L2
_L2:
        return grm1.a(((grq) (obj1)));
    }
}
