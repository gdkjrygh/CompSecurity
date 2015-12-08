// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.b.e;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            gp, fr, fm, ag, 
//            ah, ac

public final class en extends gp
{

    private final b a;

    en(b b1)
    {
        super(b1.b(), "log", "TransactionListenerSendLog");
        a = b1;
    }

    public final volatile void a(x x)
    {
        super.a(x);
    }

    public final volatile void a(x x, an an)
    {
        super.a(x, an);
    }

    public final void a(x x, ao ao1, boolean flag)
    {
        super.a(x, ao1, flag);
        com.nuance.b.b.fr.e(ao1.toString());
        if (!ao1.e())
        {
            break MISSING_BLOCK_LABEL_298;
        }
        x = ao1.d().e("adk_result").a;
        fr.c((new StringBuilder()).append(d()).append("Response: ").append(x).toString());
        x = new JSONObject(x);
        if (!fm.a(x))
        {
            break MISSING_BLOCK_LABEL_277;
        }
        if (fm.c(x))
        {
            a.b(new ag(a.b(), com.nuance.b.b.ah.e, null, "session expired"));
            return;
        }
        try
        {
            x = com.nuance.b.b.fm.b(x);
            fr.a((new StringBuilder()).append(d()).append(" Request failed: ").append(x).toString());
            a.b(new ag(a.b(), ah.f, null, x));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (x x) { }
        try
        {
            fr.a((new StringBuilder()).append(d()).append("Error processing json response. ").append(x.toString()).toString());
            a.b(new ag(a.b(), ah.d, x, "Exception processing response"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (x x)
        {
            fr.a("Unable to read sendLog response");
        }
        fr.a(x.getStackTrace());
        a.b(new ag(a.b(), ah.d, x, "Unable to read sendLog response"));
        return;
        a.a(new ac(a.b()));
    }
}
