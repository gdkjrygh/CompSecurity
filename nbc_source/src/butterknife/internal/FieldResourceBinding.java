// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


final class FieldResourceBinding
{

    private final int id;
    private final String method;
    private final String name;

    FieldResourceBinding(int i, String s, String s1)
    {
        id = i;
        name = s;
        method = s1;
    }

    public int getId()
    {
        return id;
    }

    public String getMethod()
    {
        return method;
    }

    public String getName()
    {
        return name;
    }
}
