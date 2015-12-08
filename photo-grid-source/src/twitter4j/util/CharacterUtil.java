// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.util;


public final class CharacterUtil
{

    private CharacterUtil()
    {
        throw new AssertionError();
    }

    public static int count(String s)
    {
        return s.length();
    }

    public static boolean isExceedingLengthLimitation(String s)
    {
        return count(s) > 140;
    }
}
