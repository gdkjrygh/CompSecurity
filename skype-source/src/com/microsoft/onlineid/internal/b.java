// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.microsoft.onlineid.d;

// Referenced classes of package com.microsoft.onlineid.internal:
//            c

public class b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        private static final a k[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/internal/b$a, s);
        }

        public static a[] values()
        {
            return (a[])k.clone();
        }

        public final String a()
        {
            return (new StringBuilder("com.microsoft.msa.authenticator.")).append(name()).toString();
        }

        static 
        {
            a = new a("AccountName", 0);
            b = new a("AccountPuid", 1);
            c = new a("ClientPackageName", 2);
            d = new a("ClientStateBundle", 3);
            e = new a("CobrandingId", 4);
            f = new a("Continuation", 5);
            g = new a("FlowToken", 6);
            h = new a("IsSdkRequest", 7);
            i = new a("ResultReceiver", 8);
            j = new a("Scope", 9);
            k = (new a[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    protected final Context a;
    protected final Intent b;

    public b(Context context, Intent intent)
    {
        a = context;
        b = intent;
    }

    private void a(int i1, c c1)
    {
        ResultReceiver resultreceiver = i();
        if (resultreceiver != null)
        {
            resultreceiver.send(i1, c1.a());
        }
    }

    public final Intent a()
    {
        return b;
    }

    public final b a(Bundle bundle)
    {
        b.putExtra(com.microsoft.onlineid.internal.a.d.a(), bundle);
        return this;
    }

    public final b a(ResultReceiver resultreceiver)
    {
        b.putExtra(a.i.a(), resultreceiver);
        return this;
    }

    public final b a(d d1)
    {
        b.putExtra(a.j.a(), d1);
        return this;
    }

    public final b a(b b1)
    {
        b.putExtra(a.f.a(), b1.b);
        return this;
    }

    public final b a(String s)
    {
        b.putExtra(a.b.a(), s);
        return this;
    }

    public final b a(boolean flag)
    {
        b.putExtra(a.h.a(), flag);
        return this;
    }

    public final void a(PendingIntent pendingintent)
    {
        a(2, (new c()).a(pendingintent));
    }

    public final void a(c c1)
    {
        Intent intent = h();
        if (intent != null)
        {
            intent.fillIn((new Intent()).putExtras(c1.a()), 0);
            a.startService(intent);
            return;
        } else
        {
            a(-1, c1);
            return;
        }
    }

    public final void a(Exception exception)
    {
        a(1, (new c()).a(exception));
    }

    public final Context b()
    {
        return a;
    }

    public final b b(String s)
    {
        b.putExtra(a.c.a(), s);
        return this;
    }

    public final b c(String s)
    {
        b.putExtra(a.g.a(), s);
        return this;
    }

    public final String c()
    {
        return b.getStringExtra(a.a.a());
    }

    public final b d(String s)
    {
        b.putExtra(a.e.a(), s);
        return this;
    }

    public final String d()
    {
        return b.getStringExtra(a.b.a());
    }

    public final String e()
    {
        return b.getStringExtra(a.c.a());
    }

    public final String f()
    {
        return b.getStringExtra(a.g.a());
    }

    public final d g()
    {
        return (d)b.getSerializableExtra(a.j.a());
    }

    public final Intent h()
    {
        return (Intent)b.getParcelableExtra(a.f.a());
    }

    public final ResultReceiver i()
    {
        return (ResultReceiver)b.getParcelableExtra(a.i.a());
    }

    public final boolean j()
    {
        return i() != null;
    }

    public final String k()
    {
        return b.getStringExtra(a.e.a());
    }

    public final Bundle l()
    {
        return b.getBundleExtra(com.microsoft.onlineid.internal.a.d.a());
    }

    public final boolean m()
    {
        return b.getBooleanExtra(a.h.a(), false);
    }

    public final void n()
    {
        a(0, new c());
    }

    public void o()
    {
        a.startService(b);
    }
}
