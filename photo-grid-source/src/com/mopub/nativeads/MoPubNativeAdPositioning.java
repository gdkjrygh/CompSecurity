// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.common.Preconditions;
import java.util.ArrayList;

public final class MoPubNativeAdPositioning
{

    public MoPubNativeAdPositioning()
    {
    }

    static MoPubClientPositioning a(MoPubClientPositioning mopubclientpositioning)
    {
        Preconditions.checkNotNull(mopubclientpositioning);
        MoPubClientPositioning mopubclientpositioning1 = new MoPubClientPositioning();
        MoPubClientPositioning.a(mopubclientpositioning1).addAll(MoPubClientPositioning.a(mopubclientpositioning));
        MoPubClientPositioning.a(mopubclientpositioning1, MoPubClientPositioning.b(mopubclientpositioning));
        return mopubclientpositioning1;
    }

    public static MoPubClientPositioning clientPositioning()
    {
        return new MoPubClientPositioning();
    }

    public static Builder newBuilder()
    {
        return new Builder();
    }

    public static MoPubServerPositioning serverPositioning()
    {
        return new MoPubServerPositioning();
    }

    private class MoPubClientPositioning
    {

        public static final int NO_REPEAT = 0x7fffffff;
        private final ArrayList a = new ArrayList();
        private int b;

        static int a(MoPubClientPositioning mopubclientpositioning, int i)
        {
            mopubclientpositioning.b = i;
            return i;
        }

        static ArrayList a(MoPubClientPositioning mopubclientpositioning)
        {
            return mopubclientpositioning.a;
        }

        static int b(MoPubClientPositioning mopubclientpositioning)
        {
            return mopubclientpositioning.b;
        }

        final List a()
        {
            return a;
        }

        public MoPubClientPositioning addFixedPosition(int i)
        {
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            int j;
            if (com.mopub.common.Preconditions.NoThrow.checkArgument(flag))
            {
                if ((j = Collections.binarySearch(a, Integer.valueOf(i))) < 0)
                {
                    a.add(~j, Integer.valueOf(i));
                    return this;
                }
            }
            return this;
        }

        final int b()
        {
            return b;
        }

        public MoPubClientPositioning enableRepeatingPositions(int i)
        {
            boolean flag = true;
            if (i <= 1)
            {
                flag = false;
            }
            if (!com.mopub.common.Preconditions.NoThrow.checkArgument(flag, "Repeating interval must be greater than 1"))
            {
                b = 0x7fffffff;
                return this;
            } else
            {
                b = i;
                return this;
            }
        }

        public MoPubClientPositioning()
        {
            b = 0x7fffffff;
        }
    }


    private class Builder extends MoPubClientPositioning
    {

        public final Builder addFixedPosition(int i)
        {
            super.addFixedPosition(i);
            return this;
        }

        public final volatile MoPubClientPositioning addFixedPosition(int i)
        {
            return addFixedPosition(i);
        }

        public final MoPubClientPositioning build()
        {
            return this;
        }

        public final Builder enableRepeatingPositions(int i)
        {
            super.enableRepeatingPositions(i);
            return this;
        }

        public final volatile MoPubClientPositioning enableRepeatingPositions(int i)
        {
            return enableRepeatingPositions(i);
        }

        public Builder()
        {
        }
    }


    private class MoPubServerPositioning
    {

        public MoPubServerPositioning()
        {
        }
    }

}
