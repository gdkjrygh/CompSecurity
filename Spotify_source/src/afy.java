// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class afy extends agr
    implements ahc
{

    private String a;

    public afy(afu afu, int i)
    {
        super(String.format("%s:%d", new Object[] {
            ((agw) (afu)).c, Integer.valueOf(i)
        }));
    }

    public final void a(String s)
    {
        a = s;
    }

    public final String b()
    {
        return a;
    }
}
