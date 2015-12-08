// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import java.io.IOException;

// Referenced classes of package b.a.a.a.a.e:
//            d

public static final class ble extends RuntimeException
{

    public final volatile Throwable getCause()
    {
        return (IOException)super.getCause();
    }

    protected ble(IOException ioexception)
    {
        super(ioexception);
    }
}
