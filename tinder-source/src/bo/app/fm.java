// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            eu, fl

public final class fm
{

    static final eu a = eu.a(", ").b("null");

    static StringBuilder a(int i)
    {
        fl.a(i, "size");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

}
