// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            e

private static final class 
    implements 
{

    public static final t a = new <init>();

    public final int a(CharSequence charsequence, int i)
    {
        int k = 2;
        for (int j = 0; j < i + 0 && k == 2; j++)
        {
            k = e.a(Character.getDirectionality(charsequence.charAt(j)));
        }

        return k;
    }


    private ()
    {
    }
}
