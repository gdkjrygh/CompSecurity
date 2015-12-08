// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.Context;
import com.facebook.aq;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.b:
//            b, al, z, c, 
//            d

public class a
{

    private static final Map a = new b();

    public static JSONObject a(c c, d d, String s, boolean flag, Context context)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("event", a.get(c));
        al.a(jsonobject, d, s, flag);
        try
        {
            al.a(jsonobject, context);
        }
        // Misplaced declaration of an exception variable
        catch (c c)
        {
            z.a(aq.e, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] {
                c.toString()
            });
        }
        jsonobject.put("application_package_name", context.getPackageName());
        return jsonobject;
    }

}
