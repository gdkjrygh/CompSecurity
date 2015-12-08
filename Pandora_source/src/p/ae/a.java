// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ae;

import java.io.File;
import java.io.IOException;
import p.q.e;
import p.s.k;

// Referenced classes of package p.ae:
//            b

public class a
    implements e
{

    public a()
    {
    }

    public String a()
    {
        return "";
    }

    public k a(File file, int i, int j)
    {
        return new b(file);
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((File)obj, i, j);
    }
}
