// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.bi;
import com.google.android.gms.common.internal.bl;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public final class 
{

    private final com.google.android.gms.ads.internal.client.sEnabled a = new com.google.android.gms.ads.internal.client.sEnabled();

    static com.google.android.gms.ads.internal.client. a( )
    {
        return .a;
    }

    public final a addCategoryExclusion(String s)
    {
        a.(s);
        return this;
    }

    public final a addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        a.(class1, bundle);
        return this;
    }

    public final a addCustomTargeting(String s, String s1)
    {
        a.(s, s1);
        return this;
    }

    public final a addCustomTargeting(String s, List list)
    {
        if (list != null)
        {
            a.(s, bi.a(",").a(new StringBuilder(), list).toString());
        }
        return this;
    }

    public final a addKeyword(String s)
    {
        a.(s);
        return this;
    }

    public final a addNetworkExtras(NetworkExtras networkextras)
    {
        a.(networkextras);
        return this;
    }

    public final a addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        a.(class1, bundle);
        return this;
    }

    public final a addTestDevice(String s)
    {
        a.(s);
        return this;
    }

    public final PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, (byte)0);
    }

    public final a setBirthday(Date date)
    {
        a.(date);
        return this;
    }

    public final a setContentUrl(String s)
    {
        bl.a(s, "Content URL must be non-null.");
        bl.a(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        a.(s);
        return this;
    }

    public final a setGender(int i)
    {
        a.(i);
        return this;
    }

    public final a setLocation(Location location)
    {
        a.(location);
        return this;
    }

    public final a setManualImpressionsEnabled(boolean flag)
    {
        a.sEnabled(flag);
        return this;
    }

    public final sionsEnabled setPublisherProvidedId(String s)
    {
        a.sEnabled(s);
        return this;
    }

    public final a setRequestAgent(String s)
    {
        a.sEnabled(s);
        return this;
    }

    public final a tagForChildDirectedTreatment(boolean flag)
    {
        a.sEnabled(flag);
        return this;
    }

    public ()
    {
    }
}
