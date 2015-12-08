// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            x, ae

public static final class <init> extends ficationCompatBase.Action
{
    public static final class a
    {

        private final int a;
        private final CharSequence b;
        private final PendingIntent c;
        private final Bundle d;
        private ArrayList e;

        public final a a(ae ae1)
        {
            if (e == null)
            {
                e = new ArrayList();
            }
            e.add(ae1);
            return this;
        }

        public final x.a a()
        {
            ae aae[];
            if (e != null)
            {
                aae = (ae[])e.toArray(new ae[e.size()]);
            } else
            {
                aae = null;
            }
            return new x.a(a, b, c, d, aae, (byte)0);
        }

        public a(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i, charsequence, pendingintent, new Bundle());
        }

        private a(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
        {
            a = i;
            b = x.d.d(charsequence);
            c = pendingintent;
            d = bundle;
        }
    }


    public static final ficationCompatBase.Action.Factory d = new NotificationCompatBase.Action.Factory() {

        public final NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
        {
            return new x.a(i, charsequence, pendingintent, bundle, (ae[])aremoteinput, (byte)0);
        }

        public final volatile NotificationCompatBase.Action[] newArray(int i)
        {
            return new x.a[i];
        }

    };
    public int a;
    public CharSequence b;
    public PendingIntent c;
    private final Bundle e;
    private final ae f[];

    public final int a()
    {
        return a;
    }

    public final CharSequence b()
    {
        return b;
    }

    public final PendingIntent c()
    {
        return c;
    }

    public final Bundle d()
    {
        return e;
    }

    public final volatile teInputCompatBase.RemoteInput[] e()
    {
        return f;
    }


    public _cls1(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ae aae[])
    {
        a = i;
        b = d(charsequence);
        c = pendingintent;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        e = bundle;
        f = aae;
    }

    f(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ae aae[], byte byte0)
    {
        this(i, charsequence, pendingintent, bundle, aae);
    }
}
