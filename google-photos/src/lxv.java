// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lxv extends juo
{

    private lxh a;
    private lxu b;

    lxv(lxu lxu, lxh lxh1)
    {
        b = lxu;
        a = lxh1;
        super();
    }

    public final void a(int i)
    {
        lxh lxh1;
        lxh1 = a;
        lxu lxu = b;
        i;
        JVM INSTR lookupswitch 9: default 92
    //                   7: 133
    //                   13: 151
    //                   15: 145
    //                   2000: 115
    //                   2001: 127
    //                   2002: 121
    //                   2003: 139
    //                   2004: 103
    //                   2005: 109;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        String s = "UNKNOWN_ERROR";
_L12:
        lxh1.a(s);
        return;
_L9:
        s = "APPLICATION_NOT_FOUND";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "APPLICATION_NOT_RUNNING";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "AUTHENTICATION_FAILED";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "CANCELED";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "INVALID_REQUEST";
        continue; /* Loop/switch isn't completed */
_L2:
        s = "NETWORK_ERROR";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "NOT_ALLOWED";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "UNKNOWN_ERROR";
        if (true) goto _L12; else goto _L11
_L11:
    }
}
