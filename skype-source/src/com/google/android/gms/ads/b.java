// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.f;
import com.google.android.gms.ads.internal.client.g;
import com.google.android.gms.ads.internal.client.j;
import com.google.android.gms.ads.internal.client.r;
import com.google.android.gms.ads.internal.client.s;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.internal.by;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.dg;

// Referenced classes of package com.google.android.gms.ads:
//            c, a

public class b
{
    public static final class a
    {

        private final Context a;
        private final s b;

        public final a a(com.google.android.gms.ads.a a1)
        {
            try
            {
                b.a(new f(a1));
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.ads.a a1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Failed to set AdListener.", a1);
                return this;
            }
            return this;
        }

        public final a a(com.google.android.gms.ads.formats.b b1)
        {
            try
            {
                b.a(new NativeAdOptionsParcel(b1));
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.ads.formats.b b1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Failed to specify native ad options", b1);
                return this;
            }
            return this;
        }

        public final a a(com.google.android.gms.ads.formats.c.a a1)
        {
            try
            {
                b.a(new by(a1));
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.ads.formats.c.a a1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Failed to add app install ad listener", a1);
                return this;
            }
            return this;
        }

        public final a a(com.google.android.gms.ads.formats.d.a a1)
        {
            try
            {
                b.a(new bz(a1));
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.ads.formats.d.a a1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Failed to add content ad listener", a1);
                return this;
            }
            return this;
        }

        public final b a()
        {
            b b1;
            try
            {
                b1 = new b(a, b.a());
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.b.a("Failed to build AdLoader.", remoteexception);
                return null;
            }
            return b1;
        }

        private a(Context context, s s1)
        {
            a = context;
            b = s1;
        }

        public a(Context context, String s1)
        {
            this(context, g.a(context, s1, new dg()));
        }
    }


    private final j a;
    private final Context b;
    private final r c;

    b(Context context, r r1)
    {
        this(context, r1, j.a());
    }

    private b(Context context, r r1, j j1)
    {
        b = context;
        c = r1;
        a = j1;
    }

    public final void a(c c1)
    {
        c1 = c1.a();
        try
        {
            c.a(j.a(b, c1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to load ad.", c1);
        }
    }
}
