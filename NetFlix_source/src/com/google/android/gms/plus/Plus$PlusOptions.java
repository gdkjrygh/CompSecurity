// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.internal.fq;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class Builder
    implements com.google.android.gms.common.api.tional
{
    public static final class Builder
    {

        String TJ;
        final Set TK = new HashSet();

        public transient Builder addActivityTypes(String as[])
        {
            fq.b(as, "activityTypes may not be null.");
            for (int i = 0; i < as.length; i++)
            {
                TK.add(as[i]);
            }

            return this;
        }

        public Plus.PlusOptions build()
        {
            return new Plus.PlusOptions(this, null);
        }

        public Builder setServerClientId(String s)
        {
            TJ = s;
            return this;
        }

        public Builder()
        {
        }
    }


    final String TJ;
    final Set TK;

    public static Builder builder()
    {
        return new Builder();
    }

    private Builder()
    {
        TJ = null;
        TK = new HashSet();
    }

    TK(TK tk)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        TJ = builder1.TJ;
        TK = builder1.TK;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
