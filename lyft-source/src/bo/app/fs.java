// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fa, fr

public final class fs
{

    static final fa a = fa.a(", ").b("null");

    static StringBuilder a(int i)
    {
        fr.a(i, "size");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

}
