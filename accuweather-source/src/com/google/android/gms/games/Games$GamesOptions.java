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

        boolean MJ;
        boolean MK;
        int ML;
        boolean MM;
        int MN;
        String MO;

        public Games.GamesOptions build()
        {
            return new Games.GamesOptions(this, null);
        }

        public Builder setSdkVariant(int i)
        {
            MN = i;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag)
        {
            MK = flag;
            ML = 17;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag, int i)
        {
            MK = flag;
            ML = i;
            return this;
        }

        private Builder()
        {
            MJ = false;
            MK = true;
            ML = 17;
            MM = false;
            MN = 4368;
            MO = null;
        }

        Builder(Games._cls1 _pcls1)
        {
            this();
        }
    }


    final boolean MJ;
    final boolean MK;
    final int ML;
    final boolean MM;
    final int MN;
    final String MO;

    public static Builder builder()
    {
        return new Builder(null);
    }

    private Builder()
    {
        MJ = false;
        MK = true;
        ML = 17;
        MM = false;
        MN = 4368;
        MO = null;
    }

    MO(MO mo)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        MJ = builder1.MJ;
        MK = builder1.MK;
        ML = builder1.ML;
        MM = builder1.MM;
        MN = builder1.MN;
        MO = builder1.MO;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
