// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.WireType;

final class gxs extends gxo
{

    private final Long b;

    public gxs(Long long1)
    {
        super(WireType.a);
        b = long1;
    }

    public final int a()
    {
        return gxv.a(b.longValue());
    }

    public final void a(int i, gxv gxv1)
    {
        gxv1.b(i, WireType.a);
        gxv1.b(b.longValue());
    }
}
