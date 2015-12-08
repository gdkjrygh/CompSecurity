// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.WireType;

final class gxp extends gxo
{

    private final Integer b;

    public gxp(Integer integer)
    {
        super(WireType.f);
        b = integer;
    }

    public final int a()
    {
        return 4;
    }

    public final void a(int i, gxv gxv1)
    {
        gxv1.b(i, WireType.f);
        gxv1.e(b.intValue());
    }
}
