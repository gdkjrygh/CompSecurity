// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.ci;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            JsonDeserializationFactory

public static class i extends JsonDeserializationFactory
{

    protected final Object a()
    {
        return new i();
    }

    protected final Object a(JSONObject jsonobject)
        throws JSONException
    {
        i i = null;
        if (jsonobject != null)
        {
            i = new i();
            i.i = ci.b(jsonobject, "checkpoint");
            a(jsonobject, "checkpoint", i.a);
            i.a = ci.f(jsonobject, "urls");
            a(jsonobject, "urls", i.a);
        }
        return i;
    }

    protected final volatile Object[] a(int i)
    {
        return new a[i];
    }

    protected i()
    {
    }
}
