// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.gms.common.ConnectionResult;

final class kpz extends AsyncTask
{

    final jyn a;
    final kqb b;

    kpz(jyn jyn1, kqb kqb1)
    {
        a = jyn1;
        b = kqb1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        if (a.c().b())
        {
            b.a().a(new kqa(this));
        } else
        {
            a.d();
        }
        return null;
    }
}
