// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;


final class x
    implements v.a
{

    x()
    {
    }

    public final boolean a(CharSequence charsequence, int i, int j)
    {
        if (charsequence.length() >= 30)
        {
            return false;
        }
        int k;
        for (int l = 0; i < j; l = k)
        {
            k = l;
            if (Character.isDigit(charsequence.charAt(i)))
            {
                l++;
                k = l;
                if (l >= 5)
                {
                    return true;
                }
            }
            i++;
        }

        return false;
    }
}
