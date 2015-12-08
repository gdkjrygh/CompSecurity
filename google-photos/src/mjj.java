// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class mjj
    implements ato, mjc
{

    private mjk a;
    private final mjm b;

    public mjj()
    {
        this(null);
    }

    public mjj(mjk mjk, mjm mjm)
    {
        a = mjk;
        b = mjm;
    }

    private mjj(mjm mjm)
    {
        this(((mjk) (new mjl())), null);
    }

    public final atm a(Context context, atu atu)
    {
        return new mjh(context, this, a, b);
    }

    public final Object a(ByteBuffer bytebuffer)
    {
        return azx.b(bytebuffer);
    }

    public final void a()
    {
    }

    public final Class b()
    {
        return java/io/InputStream;
    }
}
