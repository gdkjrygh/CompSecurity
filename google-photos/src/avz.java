// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;

public class avz extends IOException
{

    private static final long serialVersionUID = 0xc3cafb6c37664863L;

    public avz(int i, int j)
    {
        super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
    }

    public avz(File file, File file1)
    {
        super(String.format("Failed to rename %s to %s", new Object[] {
            file.getAbsolutePath(), file1.getAbsolutePath()
        }));
    }

    public avz(IOException ioexception)
    {
        super(ioexception);
    }

    public avz(Exception exception)
    {
        String s = String.valueOf(exception.getClass().getSimpleName());
        String s1 = String.valueOf(exception.getMessage());
        super((new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(s1).length())).append("Unexpected ").append(s).append(": ").append(s1).toString(), exception);
    }

    public avz(String s)
    {
        super(s);
    }
}
