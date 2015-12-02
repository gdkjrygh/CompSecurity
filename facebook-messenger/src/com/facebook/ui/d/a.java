// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import com.facebook.analytics.av;
import com.facebook.config.a.b;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.facebook.o;

// Referenced classes of package com.facebook.ui.d:
//            d, b, c

public class a
{

    private final Context a;
    private final d b;
    private final av c;
    private String d;
    private String e;
    private ServiceException f;
    private android.content.DialogInterface.OnClickListener g;
    private Activity h;
    private DialogFragment i;
    private javax.inject.a j;

    public a(Context context, d d1, javax.inject.a a1, av av1)
    {
        a = context;
        b = d1;
        j = a1;
        c = av1;
    }

    static Activity a(a a1)
    {
        return a1.h;
    }

    public static a a(Context context)
    {
        t t1 = t.a(context);
        return new a(context, (d)t1.a(com/facebook/ui/d/d), t1.b(com/facebook/config/a/b), (av)t1.a(com/facebook/analytics/av));
    }

    static DialogFragment b(a a1)
    {
        return a1.i;
    }

    static Context c(a a1)
    {
        return a1.a;
    }

    static ServiceException d(a a1)
    {
        return a1.f;
    }

    public AlertDialog a()
    {
        Object obj;
        String s1;
        Object obj1;
        android.app.AlertDialog.Builder builder;
        if (f != null)
        {
            String s = b.a(f, false, false);
            obj = s;
            if (s == null)
            {
                obj = e;
            }
        } else
        {
            obj = e;
        }
        s1 = ((String) (obj));
        if (obj == null)
        {
            s1 = a.getString(o.generic_error_message);
        }
        obj1 = g;
        obj = obj1;
        if (obj1 == null)
        {
            obj = new com.facebook.ui.d.b(this);
        }
        obj1 = new c(this);
        builder = new android.app.AlertDialog.Builder(a);
        builder.setTitle(d);
        builder.setMessage(s1);
        builder.setPositiveButton(a.getString(o.dialog_ok), ((android.content.DialogInterface.OnClickListener) (obj)));
        if (f != null && j.b() != b.PUBLIC)
        {
            builder.setNeutralButton(a.getString(o.report_error_button), ((android.content.DialogInterface.OnClickListener) (obj1)));
        }
        c.a("error_dialog", true);
        obj = builder.create();
        com.facebook.base.b.a.a(((android.app.Dialog) (obj)));
        ((AlertDialog) (obj)).show();
        return ((AlertDialog) (obj));
    }

    public a a(int k)
    {
        d = a.getString(k);
        return this;
    }

    public a a(Activity activity)
    {
        h = activity;
        return this;
    }

    public a a(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        g = onclicklistener;
        return this;
    }

    public a a(DialogFragment dialogfragment)
    {
        i = dialogfragment;
        return this;
    }

    public a a(ServiceException serviceexception)
    {
        f = serviceexception;
        return this;
    }

    public a a(String s)
    {
        d = s;
        return this;
    }

    public a b(int k)
    {
        e = a.getString(k);
        return this;
    }

    public a b(String s)
    {
        e = s;
        return this;
    }
}
