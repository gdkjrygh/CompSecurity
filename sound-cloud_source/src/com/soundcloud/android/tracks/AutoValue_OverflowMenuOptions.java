// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;


// Referenced classes of package com.soundcloud.android.tracks:
//            OverflowMenuOptions

final class AutoValue_OverflowMenuOptions extends OverflowMenuOptions
{
    static final class Builder extends OverflowMenuOptions.Builder
    {

        private Boolean showAllEngagements;
        private Boolean showOffline;

        public final OverflowMenuOptions build()
        {
            String s = "";
            if (showOffline == null)
            {
                s = (new StringBuilder()).append("").append(" showOffline").toString();
            }
            String s1 = s;
            if (showAllEngagements == null)
            {
                s1 = (new StringBuilder()).append(s).append(" showAllEngagements").toString();
            }
            if (!s1.isEmpty())
            {
                throw new IllegalStateException((new StringBuilder("Missing required properties:")).append(s1).toString());
            } else
            {
                return new AutoValue_OverflowMenuOptions(showOffline.booleanValue(), showAllEngagements.booleanValue(), null);
            }
        }

        public final OverflowMenuOptions.Builder showAllEngagements(boolean flag)
        {
            showAllEngagements = Boolean.valueOf(flag);
            return this;
        }

        public final OverflowMenuOptions.Builder showOffline(boolean flag)
        {
            showOffline = Boolean.valueOf(flag);
            return this;
        }

        Builder()
        {
        }

        Builder(OverflowMenuOptions overflowmenuoptions)
        {
            showOffline = Boolean.valueOf(overflowmenuoptions.showOffline());
            showAllEngagements = Boolean.valueOf(overflowmenuoptions.showAllEngagements());
        }
    }


    private final boolean showAllEngagements;
    private final boolean showOffline;

    private AutoValue_OverflowMenuOptions(boolean flag, boolean flag1)
    {
        showOffline = flag;
        showAllEngagements = flag1;
    }

    AutoValue_OverflowMenuOptions(boolean flag, boolean flag1, _cls1 _pcls1)
    {
        this(flag, flag1);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof OverflowMenuOptions)
            {
                if (showOffline != ((OverflowMenuOptions) (obj = (OverflowMenuOptions)obj)).showOffline() || showAllEngagements != ((OverflowMenuOptions) (obj)).showAllEngagements())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        char c;
        if (showOffline)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!showAllEngagements)
        {
            c1 = '\u04D5';
        }
        return (c ^ 0xf4243) * 0xf4243 ^ c1;
    }

    public final boolean showAllEngagements()
    {
        return showAllEngagements;
    }

    public final boolean showOffline()
    {
        return showOffline;
    }

    public final String toString()
    {
        return (new StringBuilder("OverflowMenuOptions{showOffline=")).append(showOffline).append(", showAllEngagements=").append(showAllEngagements).append("}").toString();
    }
}
