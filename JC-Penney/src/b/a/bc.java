// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.File;
import java.io.IOException;

// Referenced classes of package b.a:
//            ez

public class bc
{

    protected File a;

    public bc(File file)
    {
        a = file;
    }

    public Object a()
    {
        String s;
        try
        {
            s = ez.b(a);
        }
        catch (IOException ioexception)
        {
            return "";
        }
        return s;
    }
}
