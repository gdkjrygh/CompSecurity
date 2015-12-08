// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.content.Context;
import b.a.a.a.a.b.ab;
import b.a.a.a.a.b.l;
import b.a.a.a.f;
import b.a.a.a.q;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.a.a:
//            av, b

final class au
{

    private final Context a;
    private final File b;
    private ab c;

    public au(Context context, File file)
    {
        this(context, file, (byte)0);
    }

    private au(Context context, File file, byte byte0)
    {
        a = context;
        b = file;
        c = null;
    }

    final b a()
    {
        if (c == null)
        {
            return null;
        }
        int ai[] = new int[1];
        ai[0] = 0;
        byte abyte0[] = new byte[c.a()];
        try
        {
            c.a(new av(this, abyte0, ai));
        }
        catch (IOException ioexception)
        {
            f.c().c("Fabric", "A problem occurred while reading the Crashlytics log file.", ioexception);
        }
        return com.a.a.b.a(abyte0, ai[0]);
    }

    final void b()
    {
        l.a(c, "There was a problem closing the Crashlytics log file.");
        c = null;
    }
}
