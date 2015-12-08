// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            di, az, dw, dv

final class nit> extends di
{

    final az a;
    final JSONObject b;
    final az c;

    public final void a()
    {
        if (!a.f.b())
        {
            a.y.a(b);
            if (a.y.b())
            {
                a.E();
                return;
            }
        }
    }

    (az az1, az az2, JSONObject jsonobject)
    {
        c = az1;
        a = az2;
        b = jsonobject;
        super();
    }
}
