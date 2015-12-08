// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ab;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.hi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            h

final class a
    implements cf
{

    final h a;

    public final void a(hi hi, Map map)
    {
        hi = new JSONObject();
        try
        {
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hi.put(s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (hi hi)
        {
            b.a("Unable to dispatch sendMessageToNativeJs event", hi);
            return;
        }
        hi.put("id", com.google.android.gms.ads.internal.formats.h.b(a));
        h.c(a).b("sendMessageToNativeJs", hi);
        return;
    }

    b(h h1)
    {
        a = h1;
        super();
    }
}
