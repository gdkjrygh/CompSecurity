// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            bi, bj

public final class bh
    implements bi
{

    private Map a;

    public bh()
    {
        a = new HashMap();
    }

    public final bh a(bj bj1)
    {
        if (bj1.b() != null)
        {
            a.put(bj1.a(), bj1.b());
        }
        return this;
    }

    public final JSONObject a()
    {
        return new JSONObject(a);
    }

    public final Object b()
    {
        return a();
    }
}
