// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

public final class gvm
{

    public final InputStream a;
    public final boolean b;
    public final long c;

    public gvm(InputStream inputstream, boolean flag, long l)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("Stream may not be null.");
        } else
        {
            a = inputstream;
            b = flag;
            c = l;
            return;
        }
    }
}
