// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.cheat.popup;

import android.os.AsyncTask;

// Referenced classes of package com.google.android.gms.games.ui.cheat.popup:
//            CodeListenerBasePopup

private static final class <init> extends AsyncTask
{

    private CodeListenerBasePopup mPopup;

    protected final volatile Object doInBackground(Object aobj[])
    {
        mPopup = ((CodeListenerBasePopup[])aobj)[0];
        CodeListenerBasePopup.access$300(mPopup);
        return null;
    }

    protected final volatile void onPostExecute(Object obj)
    {
        if (mPopup.shouldDisplay())
        {
            CodeListenerBasePopup.access$400(mPopup);
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
