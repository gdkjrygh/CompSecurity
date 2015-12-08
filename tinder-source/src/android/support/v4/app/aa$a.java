// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            aa, ai

public static final class <init> extends <init>
{
    public static final class a
    {

        public final Bundle a;
        private final int b;
        private final CharSequence c;
        private final PendingIntent d;
        private ArrayList e;

        public final a a(ai ai1)
        {
            if (e == null)
            {
                e = new ArrayList();
            }
            e.add(ai1);
            return this;
        }

        public final aa.a a()
        {
            ai aai[];
            if (e != null)
            {
                aai = (ai[])e.toArray(new ai[e.size()]);
            } else
            {
                aai = null;
            }
            return new aa.a(b, c, d, a, aai, (byte)0);
        }

        public a(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i, charsequence, pendingintent, new Bundle());
        }

        private a(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
        {
            b = i;
            c = aa.d.limitCharSequenceLength(charsequence);
            d = pendingintent;
            a = bundle;
        }
    }


    public static final a d = new ad.a.a() {

        public final ad.a a(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ak.a aa1[])
        {
            return new aa.a(i, charsequence, pendingintent, bundle, (ai[])(ai[])aa1, (byte)0);
        }

    };
    public int a;
    public CharSequence b;
    public PendingIntent c;
    private final Bundle e;
    private final ai f[];

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

    public final volatile e[] e()
    {
        return f;
    }


    public _cls1(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ai aai[])
    {
        a = i;
        b = limitCharSequenceLength(charsequence);
        c = pendingintent;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        e = bundle;
        f = aai;
    }

    f(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ai aai[], byte byte0)
    {
        this(i, charsequence, pendingintent, bundle, aai);
    }
}
