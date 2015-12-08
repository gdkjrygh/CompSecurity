// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

public abstract class fud
    implements ca, omb, oor, opv, opw
{

    public ar a;
    public Context b;
    private final int c;
    private am d;

    public fud(am am1, opd opd1, int i)
    {
        d = am1;
        c = i;
        opd1.a(this);
    }

    public fud(ar ar1, opd opd1, int i)
    {
        a = ar1;
        d = null;
        c = i;
        opd1.a(this);
    }

    private bz b()
    {
        if (d != null)
        {
            return d.k();
        } else
        {
            return a.n_();
        }
    }

    public final String a()
    {
        String s = String.valueOf(fud.getName());
        int i = c;
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    public final void a(Activity activity)
    {
        a = (ar)activity;
    }

    public void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        context = (fue)olm1.b(fue);
        if (context != null)
        {
            int i = c;
            olm1 = getClass().getName();
            bundle = (String)((fue) (context)).a.get(Integer.valueOf(i));
            if (bundle != null)
            {
                throw new IllegalStateException((new StringBuilder(String.valueOf(bundle).length() + 32 + String.valueOf(olm1).length())).append("Duplicate loader ID! Sources: ").append(bundle).append(", ").append(olm1).toString());
            }
            ((fue) (context)).a.put(Integer.valueOf(i), olm1);
        }
    }

    public final void b(Bundle bundle)
    {
        if (Log.isLoggable("DataLoaderMixin", 3))
        {
            String s = String.valueOf(bundle);
            (new StringBuilder(String.valueOf(s).length() + 36)).append("DataLoaderMixin.initLoader(), args: ").append(s);
        }
        b().a(c, bundle, this);
    }

    public final void c(Bundle bundle)
    {
        if (Log.isLoggable("DataLoaderMixin", 3))
        {
            String s = String.valueOf(bundle);
            (new StringBuilder(String.valueOf(s).length() + 39)).append("DataLoaderMixin.restartLoader(), args: ").append(s);
        }
        b().b(c, bundle, this);
    }
}
