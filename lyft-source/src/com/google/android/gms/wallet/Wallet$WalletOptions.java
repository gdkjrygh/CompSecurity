// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.Locale;

public final class Builder
    implements com.google.android.gms.common.api.ions
{

    public final int a;
    public final int b;

    private Builder()
    {
        class Builder
        {

            private int a;
            private int b;

            static int a(Builder builder)
            {
                return builder.a;
            }

            static int b(Builder builder)
            {
                return builder.b;
            }

            public Builder a(int i)
            {
                if (i == 0 || i == 2 || i == 1 || i == 3)
                {
                    a = i;
                    return this;
                } else
                {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                        Integer.valueOf(i)
                    }));
                }
            }

            public Wallet.WalletOptions a()
            {
                return new Wallet.WalletOptions(this, null);
            }

            public Builder b(int i)
            {
                if (i == 0 || i == 1)
                {
                    b = i;
                    return this;
                } else
                {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[] {
                        Integer.valueOf(i)
                    }));
                }
            }

            public Builder()
            {
                a = 3;
                b = 0;
            }
        }

        this(new Builder());
    }

    Builder(Builder builder)
    {
        this();
    }

    private Builder(Builder builder)
    {
        a = Builder.a(builder);
        b = Builder.b(builder);
    }

    Builder(Builder builder, Builder builder1)
    {
        this(builder);
    }
}
