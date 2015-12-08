// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.w;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.b.c;
import com.nuance.dragon.toolkit.b.e;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            gp, gd, fr, as, 
//            fm, ar, v, aq, 
//            fc, fv, fu

final class ft extends gp
{

    private static final String g = com/nuance/b/b/ft.getSimpleName();
    final as a;
    private gd h;
    private final b i;

    ft(b b1, String s, as as1)
    {
        super(b1.b(), s, g);
        i = b1;
        a = as1;
        h = new gd();
    }

    static String c()
    {
        return g;
    }

    public final void a(com.nuance.dragon.toolkit.a.x x1, an an1)
    {
label0:
        {
label1:
            {
                super.a(x1, an1);
                if (an1.b() != 0)
                {
                    x1 = (new StringBuilder()).append(c).append(" failed: ").append(an1.d()).toString();
                    if (an1.b() != 2)
                    {
                        break label0;
                    }
                    fr.f(String.format("RetryErr  \ntype[%d] \nparam[%s] \ncode[%d] \nerrTxt[%s] \nprompt[%s]", new Object[] {
                        Integer.valueOf(an1.b()), an1.e(), Integer.valueOf(an1.g()), an1.d(), an1.f()
                    }));
                    if (a != com.nuance.b.b.as.e)
                    {
                        break label1;
                    }
                    x1 = i;
                    long l = i.b();
                    new gd();
                    x1.a(new w(l, com.nuance.b.b.gd.b(i.b())));
                }
                return;
            }
            x1 = i;
            long l1 = i.b();
            new gd();
            x1.a(new w(l1, gd.a(i.b())));
            return;
        }
        i.b(new x(i.b(), y.d, null, x1));
    }

    public final void a(com.nuance.dragon.toolkit.a.x x1, ao ao1, boolean flag)
    {
        super.a(x1, ao1, flag);
        if (ao1.e())
        {
            a(ao1.d());
        }
    }

    final void a(e e1)
    {
        aq aq1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        aq1 = null;
        Object obj = e1.d("completionCode");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (((c) (obj)).a != 0)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        e1 = e1.e("adk_result").a;
        try
        {
            e1 = new JSONObject(e1);
            if (!fm.a(e1))
            {
                break MISSING_BLOCK_LABEL_241;
            }
            if (com.nuance.b.b.fm.c(e1))
            {
                i.b(new x(i.b(), y.g, null, "session expired"));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            try
            {
                fr.a((new StringBuilder()).append(d()).append("Error processing json response. ").append(e1.toString()).toString());
                i.b(new x(i.b(), y.f, e1, "JSONException processing response"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                fr.a((new StringBuilder()).append(d()).append(" Exception: ").append(e1.toString()).toString());
            }
            i.b(new x(i.b(), y.f, e1, "Unable to read response"));
            return;
        }
        e1 = com.nuance.b.b.fm.b(e1);
        i.b(new x(i.b(), y.d, null, e1));
        return;
        e1 = gd.a(b, ar.a, a, e1);
        v.r().p().a(((aq) (e1)).w);
        i.a(new w(i.b(), e1));
        return;
        obj = fv.a(((c) (obj)).a);
        com.nuance.b.b.fr.e((new StringBuilder()).append(d()).append(" handleRecognitionError... (").append(obj).append(")").toString());
        fu.a[((fv) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 558
    //                   1 445
    //                   2 452
    //                   3 459
    //                   4 466;
           goto _L1 _L2 _L3 _L4 _L5
_L13:
        if (e1 == null) goto _L7; else goto _L6
_L6:
        aq1 = gd.a(b, e1, a);
        i.a(new w(i.b(), aq1));
        if (com.nuance.b.b.ar.b != e1) goto _L9; else goto _L8
_L8:
        com.nuance.b.b.fr.e("Sending log command to server (response)");
        e1 = v.r();
        if (a != com.nuance.b.b.as.e)
        {
            flag = false;
        }
        e1.a(flag);
        return;
_L2:
        e1 = com.nuance.b.b.ar.b;
        continue; /* Loop/switch isn't completed */
_L3:
        e1 = com.nuance.b.b.ar.c;
        continue; /* Loop/switch isn't completed */
_L4:
        e1 = ar.d;
        continue; /* Loop/switch isn't completed */
_L5:
        e1 = com.nuance.b.b.ar.e;
        continue; /* Loop/switch isn't completed */
_L9:
        if (com.nuance.b.b.ar.c != e1) goto _L11; else goto _L10
_L10:
        com.nuance.b.b.fr.e("Sending log command to server (response)");
        if (a == as.a)
        {
            v.r().o();
            return;
        }
        e1 = v.r();
        if (a == com.nuance.b.b.as.e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        e1.b(flag);
        return;
_L7:
        i.b(new x(i.b(), y.d, null, ((fv) (obj)).a()));
_L11:
        return;
_L1:
        e1 = aq1;
        if (true) goto _L13; else goto _L12
_L12:
    }

}
