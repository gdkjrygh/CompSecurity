// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.internal.o;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class Builder
    implements com.google.android.gms.common.api.tional
{
    public static final class Builder
    {

        String alb;
        final Set alc = new HashSet();

        public transient Builder addActivityTypes(String as[])
        {
            o.b(as, "activityTypes may not be null.");
            for (int i = 0; i < as.length; i++)
            {
                alc.add(as[i]);
            }

            return this;
        }

        public Plus.PlusOptions build()
        {
            return new Plus.PlusOptions(this, null);
        }

        public Builder setServerClientId(String s)
        {
            alb = s;
            return this;
        }

        public Builder()
        {
        }
    }


    final String alb;
    final Set alc;

    public static Builder builder()
    {
        return new Builder();
    }

    private Builder()
    {
        alb = null;
        alc = new HashSet();
    }

    alc(alc alc1)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        alb = builder1.alb;
        alc = builder1.alc;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
