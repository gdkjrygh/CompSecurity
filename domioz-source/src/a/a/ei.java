// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            dp, eh

public final class ei
{

    static final dp a = dp.a(", ").b("null");

    static StringBuilder a(int i)
    {
        eh.a(i, "size");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

}
