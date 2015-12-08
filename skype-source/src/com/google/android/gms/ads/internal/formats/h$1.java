// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ab;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            h

final class a
    implements cf
{

    final h a;

    public final void a(hi hi1, Map map)
    {
        h.d(a).j().a(new com.google.android.gms.internal.hj.a(map) {

            final Map a;
            final h._cls1 b;

            public final void a(hi hi2, boolean flag)
            {
                h.a(b.a, (String)a.get("id"));
                hi2 = new JSONObject();
                try
                {
                    hi2.put("messageType", "htmlLoaded");
                    hi2.put("id", com.google.android.gms.ads.internal.formats.h.b(b.a));
                    h.c(b.a).b("sendMessageToNativeJs", hi2);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (hi hi2)
                {
                    com.google.android.gms.ads.internal.util.client.b.a("Unable to dispatch sendMessageToNativeJsevent", hi2);
                }
            }

            
            {
                b = h._cls1.this;
                a = map;
                super();
            }
        });
        hi1 = (String)map.get("overlayHtml");
        h.d(a).loadData(hi1, "text/html", "UTF-8");
    }

    _cls1.a(h h1)
    {
        a = h1;
        super();
    }
}
