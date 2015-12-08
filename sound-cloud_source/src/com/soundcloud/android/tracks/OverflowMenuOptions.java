// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;


public abstract class OverflowMenuOptions
{
    public static abstract class Builder
    {

        public abstract OverflowMenuOptions build();

        public abstract Builder showAllEngagements(boolean flag);

        public abstract Builder showOffline(boolean flag);

        public Builder()
        {
        }
    }


    public OverflowMenuOptions()
    {
    }

    public static Builder builder()
    {
        return (new AutoValue_OverflowMenuOptions.Builder()).showAllEngagements(false).showOffline(false);
    }

    public abstract boolean showAllEngagements();

    public abstract boolean showOffline();
}
