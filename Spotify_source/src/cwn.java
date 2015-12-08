// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cwn extends cwq
    implements cwl
{

    private String a;

    public cwn()
    {
        a = "*";
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        } else
        {
            a = s;
            return;
        }
    }
}
