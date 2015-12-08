// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bo;


// Referenced classes of package p.bo:
//            a

public static class .Long.valueOf extends RuntimeException
{

    public .String(long l, .String s, .String s1)
    {
        super(String.format("Expected type '%s', but got '%s' for key 0x%08x", new Object[] {
            s.name(), s1.name(), Long.valueOf(l)
        }));
    }
}
