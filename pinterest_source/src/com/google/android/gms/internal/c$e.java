// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qq, qu, qp, qo, 
//            qw

public final class j extends qq
{

    private static volatile azh fD[];
    public int key;
    public int value;

    public static j[] i()
    {
        if (fD == null)
        {
            synchronized (qu.azg)
            {
                if (fD == null)
                {
                    fD = new fD[0];
                }
            }
        }
        return fD;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(qp qp1)
    {
        qp1.t(1, key);
        qp1.t(2, value);
        super.a(qp1);
    }

    public final qw b(qo qo1)
    {
        return f(qo1);
    }

    protected final int c()
    {
        return super.c() + qp.v(1, key) + qp.v(2, value);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof value)
            {
                obj = (value)obj;
                flag = flag1;
                if (key == ((key) (obj)).key)
                {
                    flag = flag1;
                    if (value == ((value) (obj)).value)
                    {
                        return a(((qq) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public final a f(qo qo1)
    {
        do
        {
            int k = qo1.rz();
            switch (k)
            {
            default:
                if (a(qo1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                key = qo1.rC();
                break;

            case 16: // '\020'
                value = qo1.rC();
                break;
            }
        } while (true);
    }

    public final int hashCode()
    {
        return ((key + 527) * 31 + value) * 31 + rQ();
    }

    public final rQ j()
    {
        key = 0;
        value = 0;
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        j();
    }
}
