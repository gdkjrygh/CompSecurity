// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.os.AsyncTask;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

private static final class <init> extends AsyncTask
{

    private BasePopup mPopup;

    protected final volatile Object doInBackground(Object aobj[])
    {
        mPopup = ((BasePopup[])aobj)[0];
        mPopup.loadView();
        return null;
    }

    protected final volatile void onPostExecute(Object obj)
    {
        if (mPopup.shouldDisplay())
        {
            BasePopup.access$200(mPopup);
        }
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
