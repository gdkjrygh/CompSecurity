// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.appboy.e:
//            a

private static final class a extends AsyncTask
{

    private final Context a;

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (Intent[])aobj;
        if (a != null)
        {
            return com.appboy.e.a.b(a, ((Intent) (aobj[0])));
        } else
        {
            return null;
        }
    }

    protected final void onPostExecute(Object obj)
    {
label0:
        {
            obj = (Intent)obj;
            if (obj != null && a != null)
            {
                if (obj == null)
                {
                    break label0;
                }
                a.startActivity(((Intent) (obj)));
            }
            return;
        }
        com.appboy.e.a.a();
    }

    public ontext(Context context)
    {
        a = context;
    }
}
