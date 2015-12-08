// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bof
{

    static String a(String s, int i)
    {
        if (i <= 0)
        {
            bmo.a("index out of range for prefix", s);
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
    }
}
