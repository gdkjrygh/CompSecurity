// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phn extends qlq
{

    private static volatile phn a[];
    private int b;
    private Float c;

    public phn()
    {
        b = 0x80000000;
        c = null;
        F = null;
        G = -1;
    }

    public static phn[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new phn[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != 0x80000000)
        {
            i = j + qlp.e(1, b);
        }
        j = i;
        if (c != null)
        {
            c.floatValue();
            j = i + (qlp.c(2) + 4);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L5:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   21: 203;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.a(qlo1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c.floatValue());
        }
        super.a(qlp1);
    }
}
