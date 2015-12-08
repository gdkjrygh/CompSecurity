// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class aof
    implements ann
{

    private final Context a;
    private final Uri b;
    private final aoj c;
    private InputStream d;

    private aof(Context context, Uri uri, aoj aoj1)
    {
        a = context;
        b = uri;
        c = aoj1;
    }

    public static aof a(Context context, Uri uri, aoi aoi)
    {
        return new aof(context, uri, new aoj(aoi, aly.b(context).c));
    }

    public final void a()
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        d.close();
        return;
        IOException ioexception;
        ioexception;
    }

    public final void a(amb amb, ano ano1)
    {
        int i;
        try
        {
            amb = c.b(a, b);
        }
        // Misplaced declaration of an exception variable
        catch (amb amb)
        {
            ano1.a(amb);
            return;
        }
        if (amb == null) goto _L2; else goto _L1
_L1:
        i = c.a(a, b);
_L4:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        amb = new anu(amb, i);
        d = amb;
        ano1.a(d);
        return;
_L2:
        i = -1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
    }

    public final amz c()
    {
        return amz.a;
    }

    public final Class d()
    {
        return java/io/InputStream;
    }
}
