// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.internal.jx;
import java.util.HashSet;
import java.util.Set;

public final class Builder
    implements com.google.android.gms.common.api.tional
{

    final String anr;
    final Set ans;

    public static Builder builder()
    {
        return new Builder();
    }

    private Builder()
    {
        anr = null;
        ans = new HashSet();
    }

    ans(ans ans1)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        class Builder
        {

            String anr;
            final Set ans = new HashSet();

            public final transient Builder addActivityTypes(String as[])
            {
                jx.b(as, "activityTypes may not be null.");
                for (int i = 0; i < as.length; i++)
                {
                    ans.add(as[i]);
                }

                return this;
            }

            public final Plus.PlusOptions build()
            {
                return new Plus.PlusOptions(this, null);
            }

            public final Builder setServerClientId(String s)
            {
                anr = s;
                return this;
            }

            public Builder()
            {
            }
        }

        anr = builder1.anr;
        ans = builder1.ans;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
