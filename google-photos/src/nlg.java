// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nlg
{

    final nlq a;
    final long b;
    final long c;
    long d;
    volatile boolean e;
    volatile nlr f;

    public nlg(nlq nlq1, long l, long l1)
    {
        d = -1L;
        a = nlq1;
        b = l;
        c = l1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = false;
        f.h = true;
        f = null;
        d = c;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof nlg)
            {
                obj = (nlg)obj;
                flag = flag1;
                if (b == ((nlg) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((nlg) (obj)).c)
                    {
                        flag = flag1;
                        if (a.equals(((nlg) (obj)).a))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(a, c.a(b, c.a(c, 31)));
    }

    public final String toString()
    {
        String s = String.valueOf("LocalMediaSyncRequest{lastScanTime=");
        long l = c;
        long l1 = b;
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 67 + String.valueOf(s1).length())).append(s).append(l).append(", mediaItemIdToScanFrom=").append(l1).append(", ").append(s1).append("}").toString();
    }
}
