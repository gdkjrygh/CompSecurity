// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            b

public class f extends b
{
    public static interface a
    {

        public abstract void a(WebPhoto webphoto);

        public abstract void a(Exception exception);

        public abstract void b(WebPhoto webphoto);

        public abstract void w();
    }


    private Exception a;
    private a b;
    private boolean c;

    public f()
    {
    }

    protected transient WebPhoto a(String as[])
    {
        if (as == null || as.length <= 0 || as.length >= 3)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        as = as[0];
        as = com.cardinalblue.android.piccollage.controller.network.f.j(as);
        return as;
        as;
        a = as;
        com.cardinalblue.android.piccollage.a.f.a(as);
        return null;
    }

    public void a(a a1, boolean flag)
    {
        b = a1;
        c = flag;
    }

    protected void a(WebPhoto webphoto)
    {
        super.onPostExecute(webphoto);
        if (isCancelled() && b != null)
        {
            b.w();
        } else
        if (b != null)
        {
            if (a != null)
            {
                b.a(a);
                return;
            }
            if (webphoto != null)
            {
                if (c)
                {
                    b.b(webphoto);
                    return;
                } else
                {
                    b.a(webphoto);
                    return;
                }
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onCancelled()
    {
        super.onCancelled();
        if (b != null)
        {
            b.w();
        }
    }

    protected void onPostExecute(Object obj)
    {
        a((WebPhoto)obj);
    }
}
