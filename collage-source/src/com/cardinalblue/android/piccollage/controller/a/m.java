// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeSearchResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            b

public class m extends b
{
    public static interface a
    {

        public abstract void a(CBYoutubeSearchResponse cbyoutubesearchresponse);

        public abstract void a(Throwable throwable);
    }


    private boolean a;
    private a b;
    private Throwable c;

    public m(boolean flag, a a1)
    {
        a = flag;
        b = a1;
    }

    protected transient CBYoutubeSearchResponse a(String as[])
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
                return f.h(as);
            }
            as = f.f(as);
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

    protected void a(CBYoutubeSearchResponse cbyoutubesearchresponse)
    {
label0:
        {
            super.onPostExecute(cbyoutubesearchresponse);
            if (!isCancelled() && b != null)
            {
                if (cbyoutubesearchresponse == null)
                {
                    break label0;
                }
                b.a(cbyoutubesearchresponse);
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
        a((CBYoutubeSearchResponse)obj);
    }
}
