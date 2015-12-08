// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.math.BigInteger;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            qa

public final class pi
{

    private static final Object a = new Object();
    private static String b;

    public static String a()
    {
        String s;
        synchronized (a)
        {
            s = b;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(Context context, String s, String s1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        boolean flag = TextUtils.isEmpty(s);
        if (flag) goto _L2; else goto _L3
_L3:
        Class class1;
        s1 = context.createPackageContext(s1, 3).getClassLoader();
        class1 = Class.forName("com.google.ads.mediation.MediationAdapter", false, s1);
        String as[];
        context = new BigInteger(new byte[1]);
        as = s.split(",");
        int i = 0;
_L8:
        if (i >= as.length) goto _L5; else goto _L4
_L4:
        zzp.zzbv();
        s = context;
        if (qa.a(s1, class1, as[i]))
        {
            s = context.setBit(i);
        }
          goto _L6
        context;
        b = "err";
_L2:
        context = b;
        obj;
        JVM INSTR monitorexit ;
        return context;
_L5:
        b = String.format(Locale.US, "%X", new Object[] {
            context
        });
          goto _L2
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L6:
        i++;
        context = s;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
