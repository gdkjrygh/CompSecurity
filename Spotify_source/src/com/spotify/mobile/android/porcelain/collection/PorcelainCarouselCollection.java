// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.collection;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import drf;
import java.util.Arrays;

// Referenced classes of package com.spotify.mobile.android.porcelain.collection:
//            PorcelainLinearCollection

public interface PorcelainCarouselCollection
    extends PorcelainLinearCollection, drf
{

    public static final ImmutableList b = ImmutableList.a(Lists.a(Arrays.asList(Size.values()), Size.a()));

    public abstract String getBackground();

    public abstract BackgroundStyle getBackgroundStyle();

    public abstract CharSequence getTitle();


    private class Size extends Enum
    {

        public static final Size a;
        public static final Size b;
        public static final Size c;
        public static final Size d;
        private static final ctv e = new ctv() {

            public final Object a(Object obj)
            {
                return Integer.valueOf(((Size)obj).viewType);
            }

        };
        private static final Size f[];
        public final boolean compact;
        public final boolean small;
        public final int viewType;

        static ctv a()
        {
            return e;
        }

        public static Size valueOf(String s)
        {
            return (Size)Enum.valueOf(com/spotify/mobile/android/porcelain/collection/PorcelainCarouselCollection$Size, s);
        }

        public static Size[] values()
        {
            return (Size[])f.clone();
        }

        static 
        {
            a = new Size("NORMAL", 0, 0x7f1100ef, false, false);
            b = new Size("COMPACT", 1, 0x7f1100f0, true, false);
            c = new Size("SMALL", 2, 0x7f1100f2, false, true);
            d = new Size("SMALL_COMPACT", 3, 0x7f1100f1, true, true);
            f = (new Size[] {
                a, b, c, d
            });
        }

        private Size(String s, int i, int j, boolean flag, boolean flag1)
        {
            super(s, i);
            viewType = j;
            compact = flag;
            small = flag1;
        }
    }

}
