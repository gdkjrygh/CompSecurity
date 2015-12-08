// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import com.roidapp.cloudlib.sns.b.a.e;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            v, d

public class w
    implements v
{

    public d a;
    public e b;
    public e c;

    public w()
    {
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        jsonobject = jsonobject.optJSONObject("data");
        if (jsonobject != null)
        {
            b = e.a(jsonobject.optJSONArray("tagTop"), null, flag);
            c = e.a(jsonobject.optJSONArray("data"), null, flag);
            a = d.a(jsonobject.optJSONObject("landingpage"));
        }
    }
}
