// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import java.util.Random;
import org.acra.ErrorReporter;

// Referenced classes of package com.facebook.common.e:
//            h, m, n, c

public class b
{

    static final Random a = new Random();
    private static h b;

    public b()
    {
    }

    public static final void a(String s, String s1)
    {
        if (b != null)
        {
            b.a(s, s1);
            return;
        } else
        {
            a(s, s1, null, false, 1000);
            return;
        }
    }

    public static final void a(String s, String s1, Throwable throwable)
    {
        if (b != null)
        {
            b.a(s, s1, throwable);
            return;
        } else
        {
            a(s, s1, throwable, false, 1000);
            return;
        }
    }

    public static final void a(String s, String s1, Throwable throwable, boolean flag, int i)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        b.a(m.a(s, s1).a(throwable).a(flag).a(i).g());
_L4:
        return;
_L2:
        String s2;
        boolean flag1 = com.facebook.base.b.a();
        if (flag && flag1)
        {
            ErrorReporter.getInstance().putCustomData("soft_error_message", s1.replace("\n", "\\n"));
            throw new RuntimeException((new StringBuilder()).append("Soft error FAILING HARDER: ").append(s).toString(), throwable);
        }
        s2 = s;
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a.nextInt() % i != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        s2 = s;
        if (i != 1)
        {
            s2 = (new StringBuilder()).append(s).append(" [freq=").append(i).append("]").toString();
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        if (throwable == null)
        {
            throwable = new Exception("Soft error", throwable);
        }
        (new Thread(new c(s2, s1, throwable))).start();
        return;
    }

}
