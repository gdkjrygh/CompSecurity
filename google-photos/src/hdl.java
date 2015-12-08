// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hdl
    implements nko
{

    private long a;

    hdl(hdk hdk, long l)
    {
        a = l;
        super();
    }

    public final String a()
    {
        throw new UnsupportedOperationException();
    }

    public final String b()
    {
        String s = String.valueOf("fake:");
        long l = a;
        return (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString();
    }
}
