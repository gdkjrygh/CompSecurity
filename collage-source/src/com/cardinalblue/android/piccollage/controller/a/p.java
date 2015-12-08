// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Context;
import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.PicUser;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            b

public class p extends b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(PicUser picuser);
    }


    private a a;
    private Context b;
    private Exception c;

    public p(Context context, a a1)
    {
        b = context;
        a = a1;
    }

    protected transient PicUser a(String as[])
    {
        as = as[0];
        if (TextUtils.isEmpty(as))
        {
            break MISSING_BLOCK_LABEL_24;
        }
        as = f.v(as);
        return as;
        as;
        c = as;
        c = new Exception("Upload avatar file uri is invalid, it should not be null.");
        return null;
    }

    protected void a(PicUser picuser)
    {
        super.onPostExecute(picuser);
        if (!isCancelled() && a != null)
        {
            if (c != null)
            {
                com.cardinalblue.android.piccollage.a.f.a(c);
                a.a();
                return;
            }
            if (picuser != null)
            {
                k.a(b, 0x7f0702b7, 1);
                a.a(picuser);
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
        a((PicUser)obj);
    }
}
