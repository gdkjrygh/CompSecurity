// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

final class asq
    implements ann
{

    private final File a;

    public asq(File file)
    {
        a = file;
    }

    public final void a()
    {
    }

    public final void a(amb amb, ano ano1)
    {
        try
        {
            amb = azx.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (amb amb)
        {
            ano1.a(amb);
            return;
        }
        ano1.a(amb);
    }

    public final void b()
    {
    }

    public final amz c()
    {
        return amz.a;
    }

    public final Class d()
    {
        return java/nio/ByteBuffer;
    }
}
