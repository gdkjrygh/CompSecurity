// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

final class oum extends Thread
{

    private final ouo a;
    private final WritableByteChannel b;

    public oum(oul oul, ouo ouo1, WritableByteChannel writablebytechannel)
    {
        setName("Movie to Stream Thread");
        a = ouo1;
        b = writablebytechannel;
    }

    public final void run()
    {
        a.a().b(b);
        try
        {
            b.close();
        }
        catch (IOException ioexception)
        {
            orw.b("Failed to close movie resources", ioexception);
        }
        a.close();
        return;
        Object obj;
        obj;
        orw.b("Failed to read movie data", ((Throwable) (obj)));
        try
        {
            b.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            orw.b("Failed to close movie resources", ((Throwable) (obj)));
        }
        a.close();
        return;
        obj;
        try
        {
            b.close();
        }
        catch (IOException ioexception1)
        {
            orw.b("Failed to close movie resources", ioexception1);
        }
        a.close();
        throw obj;
    }
}
