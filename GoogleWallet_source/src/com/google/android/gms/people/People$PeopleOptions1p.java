// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.people:
//            People

public static final class Builder
    implements com.google.android.gms.common.api.ns
{
    public static final class Builder
    {

        int aBH;

        public final People.PeopleOptions1p build()
        {
            boolean flag;
            if (aBH > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kn.b(flag, "Must provide valid client application ID!");
            return new People.PeopleOptions1p(this, null);
        }

        public final Builder setClientApplicationId(int i)
        {
            aBH = i;
            return this;
        }

        public Builder()
        {
        }
    }


    private final int aBH;

    static int a(Builder.aBH abh)
    {
        return abh.aBH;
    }

    private Builder(Builder builder)
    {
        aBH = builder.aBH;
    }

    Builder(Builder builder, Builder builder1)
    {
        this(builder);
    }
}
