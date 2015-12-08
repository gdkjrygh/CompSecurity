// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;

public class aag
{

    private File a;

    public aag(File file)
    {
        a = file;
    }

    public Object a()
    {
        String s;
        try
        {
            s = abn.b(a);
        }
        catch (IOException ioexception)
        {
            return "";
        }
        return s;
    }
}
