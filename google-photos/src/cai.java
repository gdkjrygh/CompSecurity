// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;

public final class cai extends AsyncTask
{

    private final noj a;
    private final cak b;
    private final Context c;
    private final int d;

    public cai(Context context, noj noj1, cak cak1)
    {
        c = (Context)b.a(context, "context", null);
        a = (noj)b.a(noj1, "movieMakerProvider", null);
        b = (cak)b.a(cak1, "listener", null);
        d = noj1.c(c);
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (String[])aobj;
        return Boolean.valueOf(a.d(c, d, ((String) (aobj[0]))));
    }

    protected final void onPostExecute(Object obj)
    {
        ((Boolean)obj).booleanValue();
    }
}
