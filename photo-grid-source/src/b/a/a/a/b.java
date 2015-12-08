// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;


public final class b extends Exception
{

    private int a;
    private Object b;
    private int c;

    public b(int i, int j, Object obj)
    {
        c = i;
        a = j;
        b = obj;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        a;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 64
    //                   1 98
    //                   2 132;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuffer.append("Unkown error at position ").append(c).append(".");
_L6:
        return stringbuffer.toString();
_L2:
        stringbuffer.append("Unexpected character (").append(b).append(") at position ").append(c).append(".");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("Unexpected token ").append(b).append(" at position ").append(c).append(".");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("Unexpected exception at position ").append(c).append(": ").append(b);
        if (true) goto _L6; else goto _L5
_L5:
    }
}
