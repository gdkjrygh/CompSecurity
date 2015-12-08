// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class g.Object
    implements cky
{

    private Map a;
    private l.Map b;

    public final void a(ckw ckw, boolean flag)
    {
        b.b.f = (String)a.get("id");
        ckw = new JSONObject();
        try
        {
            ckw.put("messageType", "htmlLoaded");
            ckw.put("id", b.b.f);
            b.b.b.b("sendMessageToNativeJs", ckw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ckw ckw)
        {
            bka.b("Unable to dispatch sendMessageToNativeJsevent", ckw);
        }
    }

    l.Map(l.Map map, Map map1)
    {
        b = map;
        a = map1;
        super();
    }

    // Unreferenced inner class bhg$1

/* anonymous class */
    final class bhg._cls1
        implements cdi
    {

        final bhg a;

        public final void a(ckw ckw1, Map map)
        {
            a.e.k().d = new bhg._cls1._cls1(this, map);
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

            
            {
                a = bhg1;
                super();
            }
    }

}
