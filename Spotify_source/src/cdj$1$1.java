// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Map;
import org.json.JSONObject;

final class g.Object
    implements Runnable
{

    private JSONObject a;
    private .JSONObject b;

    public final void run()
    {
        b.b.a("fetchHttpRequestCompleted", a);
        bka.a("Dispatched http response.");
    }

    .JSONObject(ect ect, JSONObject jsonobject)
    {
        b = ect;
        a = jsonobject;
        super();
    }

    // Unreferenced inner class cdj$1

/* anonymous class */
    final class cdj._cls1
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
                cjj.a.post(new cdj._cls1._cls1(this, ((JSONObject) (obj))));
                return;
            }
        }

            
            {
                c = cdj1;
                b = map;
                a = ckw1;
                super();
            }
    }

}
