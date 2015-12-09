// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.os.AsyncTask;
import android.view.View;

// Referenced classes of package com.fitbit.util:
//            f

static final class  extends AsyncTask
{

    final View a;
    final tEnabled b;
    final boolean c;

    protected transient Void a(Void avoid[])
    {
        a(b);
        return null;
    }

    protected void a(Void void1)
    {
        if (a != null)
        {
            a.setEnabled(c);
        }
        b(b);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        if (a != null)
        {
            a.setEnabled(false);
        }
    }

    (View view,  , boolean flag)
    {
        a = view;
        b = ;
        c = flag;
        super();
    }
}
