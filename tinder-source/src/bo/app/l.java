// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            j, ag

public final class l
    implements j
{

    private static final String a;
    private final j b;

    public l(j j1)
    {
        b = j1;
    }

    public final JSONObject a(URI uri, Map map)
    {
        long l1 = System.currentTimeMillis();
        map = b.a(uri, map);
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l1), ag.a.toString(), uri.toString()
        });
        return map;
        map;
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l1), ag.a.toString(), uri.toString()
        });
        throw map;
    }

    public final JSONObject a(URI uri, Map map, JSONObject jsonobject)
    {
        long l1 = System.currentTimeMillis();
        map = b.a(uri, map, jsonobject);
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l1), ag.b.toString(), uri.toString()
        });
        return map;
        map;
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l1), ag.b.toString(), uri.toString()
        });
        throw map;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/l.getName()
        });
    }
}
