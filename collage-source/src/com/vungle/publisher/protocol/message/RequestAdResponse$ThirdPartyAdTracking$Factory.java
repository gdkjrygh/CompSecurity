// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.ci;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            JsonDeserializationFactory

public static class kpoint.Factory extends JsonDeserializationFactory
{

    protected kpoint.Factory a;

    protected final Object a()
    {
        return new kpoint.Factory();
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

    protected final b b(JSONObject jsonobject)
        throws JSONException
    {
        b b1 = null;
        if (jsonobject != null)
        {
            b1 = new b();
            b1.b = ci.f(jsonobject, "postroll_click");
            b1.b = ci.f(jsonobject, "video_click");
            b1.b = ci.f(jsonobject, "video_close");
            b1.b = ci.f(jsonobject, "error");
            b1.b = ci.f(jsonobject, "mute");
            b1.b = ci.f(jsonobject, "pause");
            b1.b = (kpoint[])a.a(jsonobject.optJSONArray("play_percentage"));
            b1.a = ci.f(jsonobject, "postroll_view");
            b1.a = ci.f(jsonobject, "resume");
            b1.a = ci.f(jsonobject, "unmute");
        }
        return b1;
    }

    protected kpoint.Factory()
    {
    }
}
