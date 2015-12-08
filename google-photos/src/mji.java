// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.nio.ByteBuffer;

public final class mji
    implements ato, mjc
{

    private mjk a;
    private final mjm b;

    public mji()
    {
        this(null);
    }

    public mji(mjk mjk, mjm mjm)
    {
        a = mjk;
        b = mjm;
    }

    private mji(mjm mjm)
    {
        this(((mjk) (new mjl())), null);
    }

    public final atm a(Context context, atu atu)
    {
        return new mjh(context, this, a, b);
    }

    public final Object a(ByteBuffer bytebuffer)
    {
        return bytebuffer;
    }

    public final void a()
    {
    }

    public final Class b()
    {
        return java/nio/ByteBuffer;
    }
}
