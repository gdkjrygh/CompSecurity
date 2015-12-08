// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.Map;

// Referenced classes of package crittercism.android:
//            di, az, dw, cu, 
//            dv, dj, dc, db, 
//            bb, dd

final class nit> extends di
{

    final az a;
    final az b;

    public final void a()
    {
        if (a.f.b())
        {
            return;
        } else
        {
            cu cu1 = new cu(a);
            org.json.JSONObject jsonobject = a.y.a();
            cu1.a.put("metadata", jsonobject);
            (new dj(cu1, new dc((new db(b.v.b(), "/android_v2/update_user_metadata")).a()), new dd(a.y))).run();
            return;
        }
    }

    (az az1, az az2)
    {
        b = az1;
        a = az2;
        super();
    }
}
