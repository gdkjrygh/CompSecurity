// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;


// Referenced classes of package com.vungle.publisher:
//            c, b, AdConfig

public class SafeBundleAdConfigFactory
{

    AdConfig a;

    public SafeBundleAdConfigFactory()
    {
    }

    public c get()
    {
        return new c(new b[] {
            a.a
        });
    }

    public transient c merge(AdConfig aadconfig[])
    {
        int i = 0;
        b ab[] = null;
        if (aadconfig != null)
        {
            ab = new b[aadconfig.length];
            int l = aadconfig.length;
            for (int j = 0; j < l; j++)
            {
                AdConfig adconfig = aadconfig[j];
                if (adconfig != null)
                {
                    int k = i + 1;
                    ab[i] = adconfig.a;
                    i = k;
                }
            }

        }
        return new c(ab);
    }
}
