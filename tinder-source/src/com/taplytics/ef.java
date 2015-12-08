// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import java.util.Date;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, bd, ek, gt, 
//            ci, hj, gu, ee

final class ef
    implements com.android.volley.i.b
{

    final Date a;
    final ek b;
    final ee c;

    ef(ee ee, Date date, ek ek1)
    {
        c = ee;
        a = date;
        b = ek1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        if (gs.b())
        {
            gs.a("Got Properties Response!", a);
        }
        Object obj1;
        Context context;
        obj1 = new bd(((JSONObject) (obj)));
        if (b != null)
        {
            b.a(((bd) (obj1)));
        }
        obj1 = gt.a();
        context = ci.b().u;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (gs.b())
        {
            gs.a("Writing Properties to Disk: No App Context to write JSON to disk");
            return;
        }
        break MISSING_BLOCK_LABEL_128;
        try
        {
            (new hj(obj, "TLProperties.json", context.getCacheDir(), new gu(((gt) (obj1))))).execute(new Void[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("Parsing TLProperties", ((Exception) (obj)));
        }
        if (b != null)
        {
            b.a(((Exception) (obj)));
        }
    }
}
