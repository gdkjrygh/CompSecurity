// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            ic, k

public final class kd
    implements ic
{

    private static final String a;
    private final ic b;

    public kd(ic ic1)
    {
        b = ic1;
    }

    public final JSONObject a(URI uri, Map map)
    {
        long l = System.currentTimeMillis();
        map = b.a(uri, map);
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l), k.a.toString(), uri.toString()
        });
        return map;
        map;
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l), k.a.toString(), uri.toString()
        });
        throw map;
    }

    public final JSONObject a(URI uri, Map map, JSONObject jsonobject)
    {
        long l = System.currentTimeMillis();
        map = b.a(uri, map, jsonobject);
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l), k.b.toString(), uri.toString()
        });
        return map;
        map;
        String.format("Request Executed in [%dms] [%s:%s]", new Object[] {
            Long.valueOf(System.currentTimeMillis() - l), k.b.toString(), uri.toString()
        });
        throw map;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/kd.getName()
        });
    }
}
