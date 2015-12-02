// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sosource;

import com.facebook.androidcompat.AndroidCompat;
import com.facebook.soloader.FileLocker;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

final class c extends Thread
{

    final File a;
    final List b;
    final FileLocker c;

    public final void run()
    {
        Object obj1;
        Object obj2;
        Throwable throwable;
        boolean flag;
        flag = false;
        throwable = null;
        obj1 = null;
        obj2 = null;
        Object obj;
        FileWriter filewriter;
        obj = new File(a, "metadata.tmp");
        filewriter = new FileWriter(((File) (obj)));
        BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
        PrintWriter printwriter = new PrintWriter(bufferedwriter);
        int i = 0;
_L2:
        if (i >= b.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Info info = (Info)b.get(i);
        printwriter.println((new StringBuilder()).append(info.d).append('/').append(info.c).append(' ').append(info.a).append(' ').append(info.e).toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        printwriter.close();
        bufferedwriter.close();
        filewriter.close();
        i = ((flag) ? 1 : 0);
_L4:
        if (i >= b.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Info)b.get(i);
        obj2 = new FileOutputStream(new File(a, ((Info) (obj2)).c), true);
        ((FileOutputStream) (obj2)).getFD().sync();
        ((FileOutputStream) (obj2)).close();
        i++;
        if (true) goto _L4; else goto _L3
        obj1;
        throw obj1;
        obj;
_L20:
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        printwriter.close();
_L11:
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        throw obj1;
        obj;
_L21:
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        bufferedwriter.close();
_L12:
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        throw obj1;
        obj;
_L22:
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        filewriter.close();
_L13:
        throw obj;
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        try
        {
            c.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        throw obj;
        throwable;
        AndroidCompat.addSuppressed(((Throwable) (obj1)), throwable);
          goto _L11
_L6:
        printwriter.close();
          goto _L11
        throwable;
        AndroidCompat.addSuppressed(((Throwable) (obj1)), throwable);
          goto _L12
_L8:
        bufferedwriter.close();
          goto _L12
        obj2;
        AndroidCompat.addSuppressed(((Throwable) (obj1)), ((Throwable) (obj2)));
          goto _L13
_L10:
        filewriter.close();
          goto _L13
        obj1;
        throw obj1;
        obj;
_L19:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        ((FileOutputStream) (obj2)).close();
_L14:
        throw obj;
        obj2;
        AndroidCompat.addSuppressed(((Throwable) (obj1)), ((Throwable) (obj2)));
          goto _L14
        ((FileOutputStream) (obj2)).close();
          goto _L14
_L3:
        obj2 = new File(a, "metadata.txt");
        ((File) (obj)).renameTo(((File) (obj2)));
        obj2 = new FileOutputStream(((File) (obj2)), true);
        ((FileOutputStream) (obj2)).getFD().sync();
        ((FileOutputStream) (obj2)).close();
        try
        {
            c.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        obj1;
        throw obj1;
        obj;
_L17:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        ((FileOutputStream) (obj2)).close();
_L15:
        throw obj;
        obj2;
        AndroidCompat.addSuppressed(((Throwable) (obj1)), ((Throwable) (obj2)));
          goto _L15
        ((FileOutputStream) (obj2)).close();
          goto _L15
        obj;
        if (true) goto _L17; else goto _L16
_L16:
        obj;
        obj1 = throwable;
        if (true) goto _L19; else goto _L18
_L18:
        obj;
        obj1 = null;
          goto _L20
        obj;
        obj1 = null;
          goto _L21
        obj;
        obj1 = obj2;
          goto _L22
    }

    mpat(File file, List list, FileLocker filelocker)
    {
        a = file;
        b = list;
        c = filelocker;
        super();
    }
}
