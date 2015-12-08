// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.os.AsyncTask;
import android.webkit.WebView;

final class z extends AsyncTask
{

    private WebView a;

    z()
    {
    }

    protected final volatile Object doInBackground(Object aobj[])
    {
        a = ((WebView[])aobj)[0];
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        a.removeAllViews();
        a.destroy();
    }
}
