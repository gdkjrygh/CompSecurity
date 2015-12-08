// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            x, ae

public static final class c
    implements c
{
    public static final class a extends NotificationCompatBase.UnreadConversation
    {

        static final NotificationCompatBase.UnreadConversation.Factory a = new NotificationCompatBase.UnreadConversation.Factory() {

            public final NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
            {
                return new a(as, (ae)remoteinput, pendingintent, pendingintent1, as1, l);
            }

        };
        private final String b[];
        private final ae c;
        private final PendingIntent d;
        private final PendingIntent e;
        private final String f[];
        private final long g;

        public final String[] a()
        {
            return b;
        }

        public final PendingIntent b()
        {
            return d;
        }

        public final PendingIntent c()
        {
            return e;
        }

        public final String[] d()
        {
            return f;
        }

        public final long e()
        {
            return g;
        }

        public final volatile RemoteInputCompatBase.RemoteInput f()
        {
            return c;
        }


        a(String as[], ae ae, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
        {
            b = as;
            c = ae;
            e = pendingintent1;
            d = pendingintent;
            f = as1;
            g = l;
        }
    }

    public static final class a.a
    {

        private final List a = new ArrayList();
        private final String b;
        private ae c;
        private PendingIntent d;
        private PendingIntent e;
        private long f;

        public final a.a a(long l)
        {
            f = l;
            return this;
        }

        public final a.a a(PendingIntent pendingintent)
        {
            d = pendingintent;
            return this;
        }

        public final a.a a(PendingIntent pendingintent, ae ae)
        {
            c = ae;
            e = pendingintent;
            return this;
        }

        public final a.a a(String s)
        {
            a.add(s);
            return this;
        }

        public final a a()
        {
            String as[] = (String[])a.toArray(new String[a.size()]);
            String s = b;
            ae ae = c;
            PendingIntent pendingintent = e;
            PendingIntent pendingintent1 = d;
            long l = f;
            return new a(as, ae, pendingintent, pendingintent1, new String[] {
                s
            }, l);
        }

        public a.a(String s)
        {
            b = s;
        }
    }


    private Bitmap a;
    private a b;
    private int c;

    public final a a(a a1)
    {
        if (android.os.d.VERSION.SDK_INT < 21)
        {
            return a1;
        }
        Bundle bundle = new Bundle();
        if (a != null)
        {
            bundle.putParcelable("large_icon", a);
        }
        if (c != 0)
        {
            bundle.putInt("app_color", c);
        }
        if (b != null)
        {
            bundle.putBundle("car_conversation", x.a().a(b));
        }
        a1.d().putBundle("android.car.EXTENSIONS", bundle);
        return a1;
    }

    public final a a(a a1)
    {
        b = a1;
        return this;
    }

    public a.g()
    {
        c = 0;
    }
}
