// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.p;
import com.tinder.parse.h;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            y

public final class a
    implements com.android.volley.
{

    final p a;
    final y b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        try
        {
            ((JSONObject) (obj)).toString();
            a.a(h.a(((JSONObject) (obj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b(((Exception) (obj)).toString());
        }
        a.e();
    }

    public (y y1, p p1)
    {
        b = y1;
        a = p1;
        super();
    }
}
