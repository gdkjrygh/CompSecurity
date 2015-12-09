// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.os.AsyncTask;
import com.pandora.radio.data.y;
import com.pandora.radio.util.i;

// Referenced classes of package com.pandora.android.daydream:
//            DaydreamService

private class <init> extends AsyncTask
{

    final DaydreamService a;

    protected transient y a(Void avoid[])
    {
        return i.b();
    }

    protected void a(y y1)
    {
        DaydreamService.a(a, y1);
        DaydreamService.a(a, c);
        a.b();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((y)obj);
    }

    private (DaydreamService daydreamservice)
    {
        a = daydreamservice;
        super();
    }

    a(DaydreamService daydreamservice, a a1)
    {
        this(daydreamservice);
    }
}
