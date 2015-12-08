// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import com.roidapp.imagelib.c.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Referenced classes of package com.roidapp.imagelib.filter:
//            n

final class o
    implements f
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public final FileInputStream a()
    {
        FileInputStream fileinputstream;
        try
        {
            fileinputstream = new FileInputStream(new File(a.a));
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            filenotfoundexception.printStackTrace();
            return null;
        }
        return fileinputstream;
    }
}
