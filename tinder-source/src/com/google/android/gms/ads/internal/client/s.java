// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            n, AdSizeParcel, e, d, 
//            a

public final class s
{

    public a a;
    public n b;
    public c c[];
    public String d;
    public com.google.android.gms.ads.a.a e;
    public com.google.android.gms.ads.purchase.a f;
    public com.google.android.gms.ads.purchase.b g;
    public com.google.android.gms.ads.a.b h;
    public boolean i;
    private com.google.android.gms.ads.internal.client.a j;
    private ViewGroup k;

    public final c a()
    {
        Object obj;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = b.a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = new c(((AdSizeParcel) (obj)).f, ((AdSizeParcel) (obj)).c, ((AdSizeParcel) (obj)).b);
        return ((c) (obj));
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.b.c("Failed to get the current AdSize.", remoteexception);
        if (c != null)
        {
            return c[0];
        } else
        {
            return null;
        }
    }

    public final void a(a a1)
    {
        a = a1;
        if (b == null || a1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        new e(a1);
        return;
        a1;
        com.google.android.gms.ads.internal.util.client.b.c("Failed to set the AdListener.", a1);
        return;
    }

    public final void a(com.google.android.gms.ads.internal.client.a a1)
    {
        j = a1;
        if (b == null || a1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        new d(a1);
        return;
        a1;
        com.google.android.gms.ads.internal.util.client.b.c("Failed to set the AdClickListener.", a1);
        return;
    }

    public final void a(String s1)
    {
        if (d != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            d = s1;
            return;
        }
    }

    public final transient void a(c ac[])
    {
        if (c != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        } else
        {
            b(ac);
            return;
        }
    }

    public final String b()
    {
        String s1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s1 = b.b();
        return s1;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.b.c("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public final transient void b(c ac[])
    {
        c = ac;
        try
        {
            if (b != null)
            {
                new AdSizeParcel(k.getContext(), c);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c ac[])
        {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to set the ad size.", ac);
        }
        k.requestLayout();
    }
}
