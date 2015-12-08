// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;
import org.json.JSONObject;

final class goe
    implements dmh
{

    private final WeakReference a;

    public goe(goc goc1)
    {
        a = new WeakReference(goc1);
    }

    public final void a(int i, Object obj)
    {
label0:
        {
            obj = (JSONObject)obj;
            goc goc1 = (goc)a.get();
            if (goc1 != null)
            {
                String s = ((JSONObject) (obj)).optString("statusCode", "");
                long l;
                if ("1200".equals(s))
                {
                    l = ((JSONObject) (obj)).optLong("msisdn", 0L);
                } else
                {
                    l = 0L;
                }
                goc.a(goc1, l, s, i);
                if (l == 0L)
                {
                    break label0;
                }
                goc.a(goc1, l);
            }
            return;
        }
        goc.b();
    }

    public final void a(Throwable throwable, String s)
    {
        if ((goc)a.get() == null)
        {
            return;
        } else
        {
            goc.b();
            return;
        }
    }
}
