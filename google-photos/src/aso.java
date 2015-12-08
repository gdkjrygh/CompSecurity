// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class aso
    implements anc
{

    public aso()
    {
    }

    private static boolean a(ByteBuffer bytebuffer, File file)
    {
        try
        {
            azx.a(bytebuffer, file);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            return false;
        }
        return true;
    }

    public final volatile boolean a(Object obj, File file, ani ani)
    {
        return a((ByteBuffer)obj, file);
    }
}
