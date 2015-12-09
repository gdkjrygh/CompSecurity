// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import com.cardinalblue.android.b.i;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.PicUsersData;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            b

public class g extends b
{
    public static interface a
    {

        public abstract void a(PicUsersData picusersdata);

        public abstract void a(Exception exception);
    }


    private a a;
    private Exception b;
    private int c;
    private final String d;

    public g(a a1, String s, int j)
    {
        c = 0;
        a = a1;
        d = s;
        c = j;
    }

    protected transient PicUsersData a(String as[])
    {
        try
        {
            as = f.a(d, c, i.a(as));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            b = as;
            return null;
        }
        return as;
    }

    protected void a(PicUsersData picusersdata)
    {
        super.onPostExecute(picusersdata);
        if (!isCancelled() && a != null)
        {
            if (b != null)
            {
                a.a(b);
                return;
            }
            if (picusersdata != null)
            {
                a.a(picusersdata);
                return;
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((PicUsersData)obj);
    }
}
