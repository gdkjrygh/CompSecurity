// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.OutputStream;
import org.json.JSONArray;

// Referenced classes of package b.a:
//            bb, eu

public abstract class db extends bb
{

    public db()
    {
    }

    public abstract JSONArray a();

    public final void a(OutputStream outputstream)
    {
        String s = a().toString();
        (new StringBuilder("BREADCRUMB WRITING ")).append(s);
        eu.b();
        outputstream.write(s.getBytes());
    }
}
