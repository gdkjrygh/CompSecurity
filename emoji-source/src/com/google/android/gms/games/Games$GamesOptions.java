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

        boolean MM;
        boolean MN;
        int MO;
        boolean MP;
        int MQ;
        String MR;

        public Games.GamesOptions build()
        {
            return new Games.GamesOptions(this, null);
        }

        public Builder setSdkVariant(int i)
        {
            MQ = i;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag)
        {
            MN = flag;
            MO = 17;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag, int i)
        {
            MN = flag;
            MO = i;
            return this;
        }

        private Builder()
        {
            MM = false;
            MN = true;
            MO = 17;
            MP = false;
            MQ = 4368;
            MR = null;
        }

        Builder(Games._cls1 _pcls1)
        {
            this();
        }
    }


    final boolean MM;
    final boolean MN;
    final int MO;
    final boolean MP;
    final int MQ;
    final String MR;

    public static Builder builder()
    {
        return new Builder(null);
    }

    private Builder()
    {
        MM = false;
        MN = true;
        MO = 17;
        MP = false;
        MQ = 4368;
        MR = null;
    }

    MR(MR mr)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        MM = builder1.MM;
        MN = builder1.MN;
        MO = builder1.MO;
        MP = builder1.MP;
        MQ = builder1.MQ;
        MR = builder1.MR;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
