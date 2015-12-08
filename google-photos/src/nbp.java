// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.io.Writer;

final class nbp extends PrintWriter
{

    nbp(nbl nbl, Writer writer)
    {
        super(writer);
    }

    public final String toString()
    {
        return out.toString();
    }
}
