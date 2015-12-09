// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android;

import android.os.AsyncTask;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android:
//            PandoraService

private class a extends AsyncTask
{

    public String a;
    final PandoraService b;

    protected transient Object doInBackground(Object aobj[])
    {
        PandoraService.a(b, a);
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute(obj);
        s.k();
    }

    public (PandoraService pandoraservice, String s1)
    {
        b = pandoraservice;
        super();
        a = null;
        a = s1;
    }
}
