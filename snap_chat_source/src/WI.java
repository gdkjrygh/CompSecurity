// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import junit.framework.Assert;

public final class WI
{

    private final Resources a;

    public WI(Context context)
    {
        a = context.getResources();
    }

    public final String a(int i)
    {
        InputStream inputstream = a.openRawResource(i);
        String s;
        byte abyte0[] = new byte[inputstream.available()];
        inputstream.read(abyte0);
        s = new String(abyte0);
        Exception exception;
        try
        {
            inputstream.close();
        }
        catch (IOException ioexception) { }
        Assert.assertNotNull(s);
        return s;
        exception;
        try
        {
            inputstream.close();
        }
        catch (IOException ioexception1) { }
        throw exception;
    }
}
