// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;


public final class d
{

    public int a;
    public Object b;

    public d(int i, Object obj)
    {
        a = 0;
        b = null;
        a = i;
        b = obj;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        a;
        JVM INSTR tableswitch -1 6: default 60
    //                   -1 147
    //                   0 65
    //                   1 87
    //                   2 97
    //                   3 107
    //                   4 117
    //                   5 127
    //                   6 137;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return stringbuffer.toString();
_L3:
        stringbuffer.append("VALUE(").append(b).append(")");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("LEFT BRACE({)");
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append("RIGHT BRACE(})");
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuffer.append("LEFT SQUARE([)");
        continue; /* Loop/switch isn't completed */
_L7:
        stringbuffer.append("RIGHT SQUARE(])");
        continue; /* Loop/switch isn't completed */
_L8:
        stringbuffer.append("COMMA(,)");
        continue; /* Loop/switch isn't completed */
_L9:
        stringbuffer.append("COLON(:)");
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuffer.append("END OF FILE");
        if (true) goto _L1; else goto _L10
_L10:
    }
}
