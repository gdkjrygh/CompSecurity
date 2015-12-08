// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            e

private static final class c
    implements c
{

    public static final c a = new <init>(true);
    public static final <init> b = new <init>(false);
    private final boolean c;

    public final int a(CharSequence charsequence, int i)
    {
        boolean flag;
        int j;
        flag = false;
        j = 0;
_L6:
        if (j >= i + 0) goto _L2; else goto _L1
_L1:
        e.b(Character.getDirectionality(charsequence.charAt(j)));
        JVM INSTR tableswitch 0 1: default 48
    //                   0 57
    //                   1 71;
           goto _L3 _L4 _L5
_L3:
        j++;
          goto _L6
_L4:
        if (!c) goto _L8; else goto _L7
_L7:
        return 0;
_L8:
        flag = true;
          goto _L3
_L5:
        if (!c)
        {
            return 1;
        }
        flag = true;
          goto _L3
_L2:
        if (!flag) goto _L10; else goto _L9
_L9:
        if (c)
        {
            return 1;
        }
          goto _L7
_L10:
        return 2;
          goto _L3
    }


    private (boolean flag)
    {
        c = flag;
    }
}
