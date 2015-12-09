// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicsCompat

private static class mLookForRtl
    implements ionAlgorithm
{

    public static final mLookForRtl INSTANCE_LTR = new <init>(false);
    public static final <init> INSTANCE_RTL = new <init>(true);
    private final boolean mLookForRtl;

    public int checkRtl(CharSequence charsequence, int i, int j)
    {
        int k;
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        k = i;
_L6:
        int l = k;
        if (l >= i + j) goto _L2; else goto _L1
_L1:
        TextDirectionHeuristicsCompat.access$200(Character.getDirectionality(charsequence.charAt(l)));
        JVM INSTR tableswitch 0 1: default 56
    //                   0 77
    //                   1 96;
           goto _L3 _L4 _L5
_L3:
        k = ((flag) ? 1 : 0);
_L9:
        l++;
        flag = k;
        k = l;
          goto _L6
_L4:
        if (!mLookForRtl) goto _L8; else goto _L7
_L7:
        k = 0;
_L11:
        return k;
_L8:
        k = 1;
          goto _L9
_L5:
        k = ((flag1) ? 1 : 0);
        if (!mLookForRtl) goto _L11; else goto _L10
_L10:
        k = 1;
          goto _L9
_L2:
        if (!flag) goto _L13; else goto _L12
_L12:
        k = ((flag1) ? 1 : 0);
        if (!mLookForRtl)
        {
            return 0;
        }
          goto _L11
_L13:
        return 2;
          goto _L9
    }


    private ionAlgorithm(boolean flag)
    {
        mLookForRtl = flag;
    }
}
