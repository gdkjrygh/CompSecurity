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

        boolean VD;
        boolean VE;
        int VF;
        boolean VG;
        int VH;
        String VI;
        ArrayList VJ;

        public Games.GamesOptions build()
        {
            return new Games.GamesOptions(this, null);
        }

        public Builder setSdkVariant(int i)
        {
            VH = i;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag)
        {
            VE = flag;
            VF = 17;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag, int i)
        {
            VE = flag;
            VF = i;
            return this;
        }

        private Builder()
        {
            VD = false;
            VE = true;
            VF = 17;
            VG = false;
            VH = 4368;
            VI = null;
            VJ = new ArrayList();
        }

        Builder(Games._cls1 _pcls1)
        {
            this();
        }
    }


    public final boolean VD;
    public final boolean VE;
    public final int VF;
    public final boolean VG;
    public final int VH;
    public final String VI;
    public final ArrayList VJ;

    public static Builder builder()
    {
        return new Builder(null);
    }

    private Builder()
    {
        VD = false;
        VE = true;
        VF = 17;
        VG = false;
        VH = 4368;
        VI = null;
        VJ = new ArrayList();
    }

    VJ(VJ vj)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        VD = builder1.VD;
        VE = builder1.VE;
        VF = builder1.VF;
        VG = builder1.VG;
        VH = builder1.VH;
        VI = builder1.VI;
        VJ = builder1.VJ;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
