// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class njw
{

    int a;
    String b;
    njw c;
    private int d;

    public njw(int i, int j)
    {
        this(i, j, null);
    }

    private njw(int i, int j, njw njw1)
    {
        StringBuilder stringbuilder;
        d = i;
        a = j;
        stringbuilder = new StringBuilder();
        stringbuilder.append('-');
        i;
        JVM INSTR tableswitch 3 8: default 72
    //                   3 115
    //                   4 72
    //                   5 72
    //                   6 126
    //                   7 137
    //                   8 148;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L5
_L1:
        j;
        JVM INSTR tableswitch 1 3: default 100
    //                   1 159
    //                   2 170
    //                   3 181;
           goto _L6 _L7 _L8 _L9
_L6:
        b = stringbuilder.toString();
        c = njw1;
        return;
_L2:
        stringbuilder.append('l');
          goto _L1
_L3:
        stringbuilder.append('A');
          goto _L1
_L4:
        stringbuilder.append('B');
          goto _L1
_L5:
        stringbuilder.append('C');
          goto _L1
_L7:
        stringbuilder.append('p');
          goto _L6
_L8:
        stringbuilder.append('s');
          goto _L6
_L9:
        stringbuilder.append('h');
          goto _L6
    }

    public final njw a(njw njw1)
    {
        return new njw(d, a, njw1);
    }
}
