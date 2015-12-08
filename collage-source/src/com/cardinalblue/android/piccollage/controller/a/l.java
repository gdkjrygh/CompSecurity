// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            b

public class l extends b
{
    public static interface a
    {

        public abstract void a(CBCollagesResponse cbcollagesresponse);

        public abstract void a(Throwable throwable);
    }


    private boolean a;
    private a b;
    private Throwable c;

    public l(boolean flag, a a1)
    {
        a = flag;
        b = a1;
    }

    protected transient CBCollagesResponse a(String as[])
    {
        as = as[0];
        if (TextUtils.isEmpty(as))
        {
            return null;
        }
        try
        {
            if (a)
            {
                return f.g(as);
            }
            as = f.e(as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            com.cardinalblue.android.piccollage.a.f.a(as);
            c = as;
            return null;
        }
        return as;
    }

    public void a(a a1)
    {
        b = a1;
    }

    protected void a(CBCollagesResponse cbcollagesresponse)
    {
label0:
        {
            super.onPostExecute(cbcollagesresponse);
            if (!isCancelled() && b != null)
            {
                if (cbcollagesresponse == null)
                {
                    break label0;
                }
                b.a(cbcollagesresponse);
            }
            return;
        }
        b.a(c);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((CBCollagesResponse)obj);
    }
}
