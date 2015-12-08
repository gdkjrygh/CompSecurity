// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.b;
import com.tinder.enums.StatusCode;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ac

public final class a
    implements com.android.volley.
{

    final b a;
    final ac b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        if (StatusCode.OK.getCode() == ((JSONObject) (obj)).optInt("status"))
        {
            a.a();
            return;
        } else
        {
            a.b();
            return;
        }
    }

    public de(ac ac1, b b1)
    {
        b = ac1;
        a = b1;
        super();
    }
}
