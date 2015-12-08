// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p.q.e;
import p.s.k;

public class c
    implements e
{
    static class a
    {

        public InputStream a(File file)
            throws FileNotFoundException
        {
            return new FileInputStream(file);
        }

        a()
        {
        }
    }


    private static final a a = new a();
    private e b;
    private final a c;

    public c(e e1)
    {
        this(e1, a);
    }

    c(e e1, a a1)
    {
        b = e1;
        c = a1;
    }

    public String a()
    {
        return "";
    }

    public k a(File file, int i, int j)
        throws IOException
    {
        File file1 = null;
        file = c.a(file);
        file1 = file;
        k k = b.a(file, i, j);
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return k;
            }
        }
        return k;
        file;
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            catch (IOException ioexception) { }
        }
        throw file;
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((File)obj, i, j);
    }

}
