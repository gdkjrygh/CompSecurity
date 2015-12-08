// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class lgd
    implements Runnable
{

    private String a;
    private byte b[];
    private lgb c;

    lgd(lgb lgb1, String s, byte abyte0[])
    {
        c = lgb1;
        a = s;
        b = abyte0;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        File file;
        obj1 = c;
        obj = a;
        byte abyte0[] = b;
        file = ((lgb) (obj1)).b(((String) (obj)));
        try
        {
            obj1 = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            lqh.a("Error opening resource file for writing");
            return;
        }
        ((FileOutputStream) (obj1)).write(abyte0);
        try
        {
            ((FileOutputStream) (obj1)).close();
            lqh.d((new StringBuilder("Resource ")).append(((String) (obj))).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            lqh.a("Error closing stream for writing resource to disk");
        }
        return;
        Object obj2;
        obj2;
        lqh.a("Error writing resource to disk. Removing resource from disk");
        file.delete();
        try
        {
            ((FileOutputStream) (obj1)).close();
            lqh.d((new StringBuilder("Resource ")).append(((String) (obj))).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            lqh.a("Error closing stream for writing resource to disk");
        }
        return;
        obj2;
        try
        {
            ((FileOutputStream) (obj1)).close();
            lqh.d((new StringBuilder("Resource ")).append(((String) (obj))).append(" saved on Disk.").toString());
        }
        catch (IOException ioexception)
        {
            lqh.a("Error closing stream for writing resource to disk");
        }
        throw obj2;
    }
}
