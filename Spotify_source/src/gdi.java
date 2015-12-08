// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class gdi
{

    public static void a(File file)
    {
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            if (afile != null)
            {
                int j = afile.length;
                for (int i = 0; i < j; i++)
                {
                    a(afile[i]);
                }

            }
        }
        file.delete();
    }
}
