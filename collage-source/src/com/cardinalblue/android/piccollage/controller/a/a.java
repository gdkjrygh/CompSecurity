// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            b

public abstract class a extends b
{

    protected ProgressDialog b;
    protected Context c;

    protected a(Context context)
    {
        c = context;
        b = new ProgressDialog(context);
    }

    protected void a(Context context, int i)
    {
        if (context != null && (context instanceof Activity) && ((Activity)context).isFinishing())
        {
            cancel(true);
            return;
        } else
        {
            b.setMessage(context.getString(i));
            b.setProgressStyle(0);
            b.show();
            b.setCancelable(true);
            return;
        }
    }

    protected void a(String s)
    {
        b.setMessage(s);
        b.show();
    }

    protected void onCancelled()
    {
        if (b != null && b.isShowing())
        {
            try
            {
                b.cancel();
            }
            catch (IllegalArgumentException illegalargumentexception) { }
            b = null;
        }
    }

    protected void onCancelled(Object obj)
    {
        onCancelled();
    }

    protected void onPostExecute(Object obj)
    {
        k.a(b);
        b = null;
    }
}
