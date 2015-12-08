// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.s;
import com.nuance.b.b.a.t;
import com.nuance.b.b.a.u;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.b.e;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            gp, fm, fr

final class gm extends gp
{

    private b a;

    gm(b b1)
    {
        super(b1.b(), "sendCloudSMS", "TransactionListenerCloudSMS");
        a = b1;
    }

    public final void a(x x, an an1)
    {
        super.a(x, an1);
        a.b(new t(a.b(), u.h, null, an1.d()));
    }

    public final void a(x x, ao ao1, boolean flag)
    {
        super.a(x, ao1, flag);
        if (!ao1.e())
        {
            break MISSING_BLOCK_LABEL_228;
        }
        x = ao1.d().e("adk_result").a;
        try
        {
            x = new JSONObject(x.replaceAll(",$", ""));
            if (!fm.a(x))
            {
                break MISSING_BLOCK_LABEL_207;
            }
            if (fm.c(x))
            {
                a.b(new t(a.b(), u.g, null, "session expired"));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (x x)
        {
            try
            {
                fr.a((new StringBuilder("Error processing json response. ")).append(x.toString()).toString());
                a.b(new t(a.b(), u.f, x, "JSON response parse error"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (x x)
            {
                fr.a("Unable to read cloud SMS response");
            }
            fr.a(x.getStackTrace());
            a.b(new t(a.b(), u.f, x, x.getMessage()));
            return;
        }
        a.b(new t(a.b(), u.h, null, "ADK failure"));
        return;
        a.a(new s(a.b()));
    }
}
