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
    implements com.google.android.gms.internal.rmats.h._cls1._cls1
{

    final Map a;
    final a b;

    public final void a(hi hi, boolean flag)
    {
        h.a(b.b, (String)a.get("id"));
        hi = new JSONObject();
        try
        {
            hi.put("messageType", "htmlLoaded");
            hi.put("id", com.google.android.gms.ads.internal.formats.h.b(b.b));
            h.c(b.b).b("sendMessageToNativeJs", hi);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (hi hi)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Unable to dispatch sendMessageToNativeJsevent", hi);
        }
    }

    ( , Map map)
    {
        b = ;
        a = map;
        super();
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/formats/h$1

/* anonymous class */
    final class h._cls1
        implements cf
    {

        final h a;

        public final void a(hi hi1, Map map)
        {
            h.d(a).j().a(new h._cls1._cls1(this, map));
            hi1 = (String)map.get("overlayHtml");
            h.d(a).loadData(hi1, "text/html", "UTF-8");
        }

            
            {
                a = h1;
                super();
            }
    }

}
