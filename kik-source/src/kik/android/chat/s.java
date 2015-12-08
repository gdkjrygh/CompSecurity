// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.content.Context;
import java.security.SecureRandom;
import kik.a.e.o;
import kik.android.d.l;
import kik.android.util.ar;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class s extends l
{

    final o a;
    final KikApplication b;

    s(KikApplication kikapplication, Context context, String s1, String s2, String as[], Runnable runnable, ar ar, 
            o o1)
    {
        b = kikapplication;
        a = o1;
        super(context, s1, s2, as, runnable, ar);
    }

    public final boolean a(Object obj)
    {
        SecureRandom securerandom;
        byte abyte0[];
        obj = (String)obj;
        securerandom = new SecureRandom();
        abyte0 = new byte[128];
        securerandom.nextBytes(abyte0);
        if (!"none".equals(obj)) goto _L2; else goto _L1
_L1:
        a.b(null);
        a.a(null);
_L4:
        return true;
_L2:
        if ("corrupt public".equals(obj))
        {
            a.b(abyte0);
        } else
        if ("corrupt public private".equals(obj))
        {
            a.b(abyte0);
            securerandom.nextBytes(abyte0);
            a.a(abyte0);
        } else
        if ("corrupt private".equals(obj))
        {
            a.a(abyte0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
