// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;


final class w
    implements v.a
{

    w()
    {
    }

    public final boolean a(CharSequence charsequence, int i, int j)
    {
        while (i == 0 || charsequence.charAt(i - 1) != '@') 
        {
            return true;
        }
        return false;
    }
}
