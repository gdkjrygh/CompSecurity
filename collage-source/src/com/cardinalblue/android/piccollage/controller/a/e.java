// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.app.ProgressDialog;
import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.KddiActivity;
import com.cardinalblue.android.piccollage.model.j;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            b

public class e extends b
{

    private KddiActivity a;
    private j b;
    private ProgressDialog c;

    public e(KddiActivity kddiactivity, j j1)
    {
        a = kddiactivity;
        b = j1;
    }

    protected transient Integer a(String as[])
    {
        if (as == null)
        {
            return Integer.valueOf(0);
        }
        as = as[0];
        if (TextUtils.isEmpty(as))
        {
            return Integer.valueOf(0);
        } else
        {
            return Integer.valueOf(b.a(as));
        }
    }

    protected void a(Integer integer)
    {
        k.a(a, c);
        c = null;
        if (integer.intValue() == 0)
        {
            a.b();
        } else
        if (integer.intValue() == 2)
        {
            a.a();
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

    protected void onPreExecute()
    {
        c = new ProgressDialog(a);
        c.setMessage(a.getString(0x7f0701fa));
        c.setProgressStyle(0);
        k.b(a, c);
    }
}
