// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;


// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class Builder
    implements com.google.android.gms.common.api.onal
{
    public static final class Builder
    {

        boolean HZ;
        boolean Ia;
        int Ib;
        boolean Ic;
        int Id;

        public Games.GamesOptions build()
        {
            return new Games.GamesOptions(this, null);
        }

        public Builder setSdkVariant(int i)
        {
            Id = i;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag)
        {
            Ia = flag;
            Ib = 17;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag, int i)
        {
            Ia = flag;
            Ib = i;
            return this;
        }

        private Builder()
        {
            HZ = false;
            Ia = true;
            Ib = 17;
            Ic = false;
            Id = 4368;
        }

        Builder(Games._cls1 _pcls1)
        {
            this();
        }
    }


    final boolean HZ;
    final boolean Ia;
    final int Ib;
    final boolean Ic;
    final int Id;

    public static Builder builder()
    {
        return new Builder(null);
    }

    private Builder()
    {
        HZ = false;
        Ia = true;
        Ib = 17;
        Ic = false;
        Id = 4368;
    }

    Id(Id id)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        HZ = builder1.HZ;
        Ia = builder1.Ia;
        Ib = builder1.Ib;
        Ic = builder1.Ic;
        Id = builder1.Id;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
