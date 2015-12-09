// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class ang.Object
    implements cdi
{

    final bhg a;

    public final void a(ckw ckw1, Map map)
    {
        a.e.k().d = new cky(map) {

            private Map a;
            private bhg._cls1 b;

            public final void a(ckw ckw2, boolean flag)
            {
                b.a.f = (String)a.get("id");
                ckw2 = new JSONObject();
                try
                {
                    ckw2.put("messageType", "htmlLoaded");
                    ckw2.put("id", b.a.f);
                    b.a.b.b("sendMessageToNativeJs", ckw2);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ckw ckw2)
                {
                    bka.b("Unable to dispatch sendMessageToNativeJsevent", ckw2);
                }
            }

            
            {
                b = bhg._cls1.this;
                a = map;
                super();
            }
        };
        ckw1 = (String)map.get("overlayHtml");
        map = (String)map.get("baseUrl");
        if (TextUtils.isEmpty(map))
        {
            a.e.loadData(ckw1, "text/html", "UTF-8");
            return;
        } else
        {
            a.e.loadDataWithBaseURL(map, ckw1, "text/html", "UTF-8", null);
            return;
        }
    }

    (bhg bhg1)
    {
        a = bhg1;
        super();
    }
}
