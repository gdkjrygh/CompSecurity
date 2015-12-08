// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.AsyncTask;
import arp;
import arr;

// Referenced classes of package com.facebook.widget:
//            LoginButton

public final class a extends AsyncTask
{

    private String a;
    private LoginButton b;

    protected final Object doInBackground(Object aobj[])
    {
        return arp.a(a, false);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (arr)obj;
        LoginButton.a(b, ((arr) (obj)));
    }

    (LoginButton loginbutton, String s)
    {
        b = loginbutton;
        a = s;
        super();
    }
}
