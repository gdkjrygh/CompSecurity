// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.io.PrintWriter;
import java.io.StringWriter;

final class nbq extends AsyncTask
{

    private nbl a;

    nbq(nbl nbl1)
    {
        a = nbl1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = new StringWriter();
        a.b(new PrintWriter(((java.io.Writer) (aobj))));
        b.a(4, "ImageResourceManager", ((StringWriter) (aobj)).toString());
        return null;
    }
}
