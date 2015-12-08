// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, cv, turkey, gs, 
//            fa

final class fb
    implements Runnable
{

    final JSONObject a;
    final String b;
    final String c;
    final fa d;

    fb(fa fa, JSONObject jsonobject, String s, String s1)
    {
        d = fa;
        a = jsonobject;
        b = s;
        c = s1;
        super();
    }

    public final void run()
    {
        Object obj;
        try
        {
            ci.b().a(a.optString("experiment_id"), a.optString("variation_id"), b, c);
            cv.a().a = true;
            obj = cv.a();
            obj.g = null;
            obj.d = turkey.a;
            ((cv) (obj)).d();
            obj = cv.a().j.findViewById(0x17ccbc3b);
        }
        catch (Exception exception)
        {
            gs.b("ClientShowExperiment inner error", exception);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        cv.a().j.removeView(((android.view.View) (obj)));
    }
}
