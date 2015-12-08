// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.people:
//            People

public static final class Builder
    implements com.google.android.gms.common.api.ns
{
    public static final class Builder
    {

        public int clientApplicationId;

        public final People.PeopleOptions1p build()
        {
            boolean flag;
            if (clientApplicationId >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Must provide valid client application ID!");
            return new People.PeopleOptions1p(this, (byte)0);
        }

        public Builder()
        {
            clientApplicationId = -1;
        }
    }


    final int clientApplicationId;

    private Builder(Builder builder)
    {
        clientApplicationId = builder.clientApplicationId;
    }

    Builder(Builder builder, byte byte0)
    {
        this(builder);
    }
}
