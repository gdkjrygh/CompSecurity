// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            x, af

final class ag extends x
{

    ag()
    {
        super(null);
    }

    public final void a(Object obj)
    {
        af.a("us".equals(((JSONObject)obj).optString("data")));
    }
}
