// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.File;
import java.io.IOException;

// Referenced classes of package crittercism.android:
//            eb

public class bp
{

    protected File a;

    public bp(File file)
    {
        a = file;
    }

    public Object a()
    {
        String s;
        try
        {
            s = eb.b(a);
        }
        catch (IOException ioexception)
        {
            return "";
        }
        return s;
    }
}
