// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

final class asw
    implements ann
{

    private final File a;
    private final asx b;
    private Object c;

    public asw(File file, asx asx1)
    {
        a = file;
        b = asx1;
    }

    public final void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        b.a(c);
        return;
        IOException ioexception;
        ioexception;
    }

    public final void a(amb amb, ano ano1)
    {
        try
        {
            c = b.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (amb amb)
        {
            ano1.a(amb);
            return;
        }
        ano1.a(c);
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
        return b.a();
    }
}
