// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

public final class aiv
{

    private static final Object a = new Object();
    private static abp b;
    private static String c;

    public static String a()
    {
        String s;
        synchronized (a)
        {
            s = c;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(Context context, String s, String s1)
    {
        synchronized (a)
        {
            if (c == null && !TextUtils.isEmpty(s))
            {
                b(context, s, s1);
            }
            context = c;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void a(Context context, String s)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        abo abo1;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        abo1 = new abo();
        abo1.a(context, s);
        b = ot.j().b(abo1);
_L1:
        return;
        context;
        of.e((new StringBuilder("Cannot initialize CSI reporter.")).append(context.getMessage()).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static abp b()
    {
        abp abp;
        synchronized (a)
        {
            abp = b;
        }
        return abp;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void b(Context context, String s, String s1)
    {
        Class class1;
        String as[];
        try
        {
            s1 = context.createPackageContext(s1, 3).getClassLoader();
            class1 = Class.forName("com.google.ads.mediation.MediationAdapter", false, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            c = "err";
            return;
        }
        context = new BigInteger(new byte[1]);
        as = s.split(",");
        for (int i = 0; i < as.length;)
        {
            ot.e();
            s = context;
            if (ajc.a(s1, class1, as[i]))
            {
                s = context.setBit(i);
            }
            i++;
            context = s;
        }

        c = String.format(Locale.US, "%X", new Object[] {
            context
        });
    }

}
