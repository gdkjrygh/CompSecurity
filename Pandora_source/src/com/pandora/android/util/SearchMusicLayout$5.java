// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.AsyncTask;
import com.pandora.android.provider.b;
import com.pandora.radio.data.v;
import p.cw.c;
import p.cx.x;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            SearchMusicLayout

class a extends AsyncTask
{

    final String a;
    final SearchMusicLayout b;

    protected void a(v av[])
    {
        if (!isCancelled())
        {
            com.pandora.android.util.SearchMusicLayout.a(b, av);
        }
    }

    protected transient v[] a(Object aobj[])
    {
        if (isCancelled())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        String s;
        aobj = b.a.b().e();
        s = a;
        boolean flag;
        if (!com.pandora.android.util.SearchMusicLayout.c(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aobj = ((x) (aobj)).a(s, flag, SearchMusicLayout.m(b));
        return ((v []) (aobj));
        aobj;
        p.df.a.b("SearchMusicLayout", "Autocomplete error", ((Throwable) (aobj)));
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((v[])obj);
    }

    (SearchMusicLayout searchmusiclayout, String s)
    {
        b = searchmusiclayout;
        a = s;
        super();
    }
}
