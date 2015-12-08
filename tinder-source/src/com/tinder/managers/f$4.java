// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            f

public final class a
    implements com.android.volley.
{

    final a a;
    final f b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        ((JSONObject) (obj)).toString();
        obj = ((JSONObject) (obj)).optString("email", null);
        a.a(((String) (obj)));
    }

    public (f f1,  )
    {
        b = f1;
        a = ;
        super();
    }
}
