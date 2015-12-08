// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import com.cardinalblue.android.piccollage.controller.a.a;
import com.cardinalblue.android.piccollage.controller.network.f;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PublicCollageActivity

public static class a extends com.cardinalblue.android.piccollage.controller.a.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    private a a;

    protected transient Boolean a(String as[])
    {
        try
        {
            f.n(as[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public void a(a a1)
    {
        a = a1;
    }

    protected void a(Boolean boolean1)
    {
label0:
        {
            super.onPostExecute(boolean1);
            if (a != null)
            {
                if (!boolean1.booleanValue())
                {
                    break label0;
                }
                a.a();
            }
            return;
        }
        a.b();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        a(c.getString(0x7f070246));
    }

    protected a(Context context)
    {
        super(context);
    }
}
