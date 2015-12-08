// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


public class type extends RuntimeException
{

    public final String type;

    public (String s, String s1)
    {
        super(s1);
        type = s;
    }

    public type(String s, String s1, Throwable throwable)
    {
        super((new StringBuilder()).append("Binding for ").append(s).append(" was invalid: ").append(s1).toString(), throwable);
        type = s;
    }
}
