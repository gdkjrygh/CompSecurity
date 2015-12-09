// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public class dk extends Throwable
{

    private String a;

    public final String b()
    {
        return a;
    }

    public final String toString()
    {
        String s = getLocalizedMessage();
        String s1 = a;
        if (s == null)
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s1).append(": ").append(s).toString();
        }
    }
}
