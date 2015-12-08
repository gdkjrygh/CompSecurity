// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.os.AsyncTask;

// Referenced classes of package com.tinder.utils:
//            e

final class <init> extends AsyncTask
{

    final e a;

    protected final Object doInBackground(Object aobj[])
    {
        return e.a(a).a();
    }

    protected final void onPostExecute(Object obj)
    {
        e.b(a).a(obj);
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
