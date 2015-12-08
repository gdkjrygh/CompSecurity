// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import com.cardinalblue.android.piccollage.activities.KddiActivity;
import com.cardinalblue.android.piccollage.model.j;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            a

public class c extends a
{

    private final KddiActivity a;
    private final j d;

    public c(KddiActivity kddiactivity, j j1)
    {
        super(kddiactivity);
        a = kddiactivity;
        d = j1;
    }

    protected transient Integer a(Void avoid[])
    {
        return Integer.valueOf(d.e());
    }

    protected void a(Integer integer)
    {
        super.onPostExecute(integer);
        if (integer.intValue() == 0)
        {
            a.b();
        } else
        {
            if (integer.intValue() == 1)
            {
                a.a(a.getString(0x7f0701f1));
                return;
            }
            if (integer.intValue() == 2)
            {
                a.a();
                return;
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

    protected void onPreExecute()
    {
        super.a(a, 0x7f0701fa);
    }
}
