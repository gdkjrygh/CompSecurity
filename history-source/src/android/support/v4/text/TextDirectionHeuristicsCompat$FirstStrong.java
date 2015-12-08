// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicsCompat

private static class nAlgorithm
    implements nAlgorithm
{

    public static final nAlgorithm INSTANCE = new <init>();

    public int checkRtl(CharSequence charsequence, int i, int j)
    {
        int l = 2;
        for (int k = i; k < i + j && l == 2; k++)
        {
            l = TextDirectionHeuristicsCompat.access$100(Character.getDirectionality(charsequence.charAt(k)));
        }

        return l;
    }


    private nAlgorithm()
    {
    }
}
