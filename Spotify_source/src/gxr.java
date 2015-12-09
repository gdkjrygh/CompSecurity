// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.WireType;
import okio.ByteString;

final class gxr extends gxo
{

    private final ByteString b;

    public gxr(ByteString bytestring)
    {
        super(WireType.c);
        b = bytestring;
    }

    public final int a()
    {
        return gxv.b(b.f()) + b.f();
    }

    public final void a(int i, gxv gxv1)
    {
        gxv1.b(i, WireType.c);
        gxv1.d(b.f());
        gxv1.a(b.g());
    }
}
