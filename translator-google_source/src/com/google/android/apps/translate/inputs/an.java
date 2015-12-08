// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.os.AsyncTask;
import com.google.android.apps.unveil.env.j;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class an extends AsyncTask
{

    final Camera2InputPopup a;
    private boolean b;

    public an(Camera2InputPopup camera2inputpopup, boolean flag)
    {
        a = camera2inputpopup;
        super();
        b = true;
        b = flag;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return Camera2InputPopup.a(a, b);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (j)obj;
        Camera2InputPopup.a(a, ((j) (obj)));
        a.g();
    }
}
