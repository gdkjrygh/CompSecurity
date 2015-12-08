// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.ci;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            JsonDeserializationFactory

public static class Y extends JsonDeserializationFactory
{

    protected static Y b(JSONObject jsonobject)
        throws JSONException
    {
        Y y = null;
        if (jsonobject != null)
        {
            y = new Y();
            y.Y = ci.b(jsonobject, "click_area");
            y.Y = ci.a(jsonobject, "enabled");
            y.Y = ci.a(jsonobject, "show_onclick");
            y.Y = ci.c(jsonobject, "time_show");
            y.Y = ci.c(jsonobject, "time_enabled");
        }
        return y;
    }

    protected final Object a()
    {
        return new Y();
    }

    protected final Object a(JSONObject jsonobject)
        throws JSONException
    {
        return b(jsonobject);
    }

    protected final volatile Object[] a(int i)
    {
        return new b[i];
    }

    protected Y()
    {
    }
}
