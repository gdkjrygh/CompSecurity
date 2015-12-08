// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class Builder
    implements com.google.android.gms.common.api.onal
{
    public static final class Builder
    {

        boolean Xa;
        boolean Xb;
        int Xc;
        boolean Xd;
        int Xe;
        String Xf;
        ArrayList Xg;

        public Games.GamesOptions build()
        {
            return new Games.GamesOptions(this, null);
        }

        public Builder setSdkVariant(int i)
        {
            Xe = i;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag)
        {
            Xb = flag;
            Xc = 17;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag, int i)
        {
            Xb = flag;
            Xc = i;
            return this;
        }

        private Builder()
        {
            Xa = false;
            Xb = true;
            Xc = 17;
            Xd = false;
            Xe = 4368;
            Xf = null;
            Xg = new ArrayList();
        }

        Builder(Games._cls1 _pcls1)
        {
            this();
        }
    }


    public final boolean Xa;
    public final boolean Xb;
    public final int Xc;
    public final boolean Xd;
    public final int Xe;
    public final String Xf;
    public final ArrayList Xg;

    public static Builder builder()
    {
        return new Builder(null);
    }

    private Builder()
    {
        Xa = false;
        Xb = true;
        Xc = 17;
        Xd = false;
        Xe = 4368;
        Xf = null;
        Xg = new ArrayList();
    }

    Xg(Xg xg)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        Xa = builder1.Xa;
        Xb = builder1.Xb;
        Xc = builder1.Xc;
        Xd = builder1.Xd;
        Xe = builder1.Xe;
        Xf = builder1.Xf;
        Xg = builder1.Xg;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
