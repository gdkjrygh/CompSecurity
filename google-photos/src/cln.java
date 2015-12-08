// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class cln
{

    private static final ekk a = (new ekm()).b(fwd).b(elt).b(fzu).a();
    private final Context b;
    private final noj c;
    private final amh d;
    private final fli e;
    private final int f;
    private final String g;
    private ekp h;

    public cln(Context context, noj noj1, int i, String s)
    {
        b = context;
        c = noj1;
        f = i;
        g = s;
        d = (amh)olm.a(context, amh);
        e = (fli)olm.a(context, fli);
    }

    private ekp c()
    {
        if (h != null)
        {
            return h;
        } else
        {
            ekq ekq1 = (ekq)c.a(f, Collections.singletonList(g));
            h = (ekp)((List)b.a(b, ekq1).a(ekq1, ekw.a, a).a()).get(0);
            return h;
        }
    }

    public final long a()
    {
        Object obj;
        long l;
        try
        {
            obj = (fzu)c().b(fzu);
        }
        catch (eke eke1)
        {
            return 0L;
        }
        if (obj == null)
        {
            return 0L;
        }
        obj = ((fzu) (obj)).a.c;
        if (obj == null)
        {
            return 0L;
        }
        l = ((Long) (obj)).longValue();
        return l;
    }

    public File b()
    {
        Object obj;
        Object obj2;
        obj2 = c();
        obj = (fwd)((ekp) (obj2)).b(fwd);
        obj2 = ((elt)((ekp) (obj2)).a(elt)).e();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        Object obj1;
        boolean flag;
        if (!b.c(((fwd) (obj)).a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        return new File(((fwd) (obj)).a.getPath());
        obj = (File)d.a(java/io/File).a(ayt.b(true)).a(obj2).a(e.d()).b().get();
        return ((File) (obj));
        obj1;
_L2:
        throw new IOException("Could not open media stream: ", ((Throwable) (obj1)));
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
