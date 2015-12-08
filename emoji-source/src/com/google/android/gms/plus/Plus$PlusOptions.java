// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.internal.hm;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class Builder
    implements com.google.android.gms.common.api.tional
{
    public static final class Builder
    {

        String abr;
        final Set abs = new HashSet();

        public transient Builder addActivityTypes(String as[])
        {
            hm.b(as, "activityTypes may not be null.");
            for (int i = 0; i < as.length; i++)
            {
                abs.add(as[i]);
            }

            return this;
        }

        public Plus.PlusOptions build()
        {
            return new Plus.PlusOptions(this, null);
        }

        public Builder setServerClientId(String s)
        {
            abr = s;
            return this;
        }

        public Builder()
        {
        }
    }


    final String abr;
    final Set abs;

    public static Builder builder()
    {
        return new Builder();
    }

    private Builder()
    {
        abr = null;
        abs = new HashSet();
    }

    abs(abs abs1)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        abr = builder1.abr;
        abs = builder1.abs;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
