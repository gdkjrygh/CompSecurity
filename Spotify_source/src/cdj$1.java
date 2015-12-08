// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Map;
import org.json.JSONObject;

final class ang.Object
    implements Runnable
{

    final ckw a;
    private Map b;
    private cdj c;

    public final void run()
    {
        bka.a("Received Http request.");
        Object obj = (String)b.get("http_request");
        obj = c.a(((String) (obj)));
        if (obj == null)
        {
            bka.b("Response should not be null.");
            return;
        } else
        {
            cjj.a.post(new Runnable(((JSONObject) (obj))) {

                private JSONObject a;
                private cdj._cls1 b;

                public final void run()
                {
                    b.a.a("fetchHttpRequestCompleted", a);
                    bka.a("Dispatched http response.");
                }

            
            {
                b = cdj._cls1.this;
                a = jsonobject;
                super();
            }
            });
            return;
        }
    }

    (cdj cdj1, Map map, ckw ckw)
    {
        c = cdj1;
        b = map;
        a = ckw;
        super();
    }
}
