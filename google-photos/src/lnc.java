// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Pattern;

public final class lnc
{

    public static final lnc a = new lnc();
    private Pattern b[];

    private lnc()
    {
        b = new Pattern[0];
    }

    public final void a(String as[], String as1[])
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (as.length == as1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag);
        b = new Pattern[as.length];
_L1:
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        b[i] = Pattern.compile(as[i]);
        i++;
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        as;
        throw as;
    }

}
