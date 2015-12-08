// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import android.graphics.Point;

public final class ChannelSpanSizeLookup extends android.support.v7.widget.GridLayoutManager.b
{
    public static final class Layout extends Enum
    {

        private static final Layout $VALUES[];
        private static Layout a;
        private static Layout b;
        private static Layout c;
        private static Layout d;
        private static Layout e;
        private static Layout f;
        private static Layout g;
        private static Layout h;
        private static Layout i;
        private static Layout j;
        private static Layout k;
        private static Layout l;
        private static Layout m;
        public final int mLayoutFormat[];

        public static Layout valueOf(String s)
        {
            return (Layout)Enum.valueOf(com/snapchat/android/discover/ui/fragment/ChannelSpanSizeLookup$Layout, s);
        }

        public static Layout[] values()
        {
            return (Layout[])$VALUES.clone();
        }

        public final int[] getLayoutFormat()
        {
            return mLayoutFormat;
        }

        static 
        {
            a = new Layout("ZERO", 0, new int[0]);
            b = new Layout("ONE", 1, new int[] {
                1
            });
            c = new Layout("TWO", 2, new int[] {
                1, 1
            });
            d = new Layout("THREE", 3, new int[] {
                1, 1, 1
            });
            e = new Layout("FOUR", 4, new int[] {
                1, 1, 1, 1
            });
            f = new Layout("FIVE", 5, new int[] {
                1, 3, 1
            });
            g = new Layout("SIX", 6, new int[] {
                3, 2, 1
            });
            h = new Layout("SEVEN", 7, new int[] {
                2, 3, 2
            });
            i = new Layout("EIGHT", 8, new int[] {
                2, 3, 2, 1
            });
            j = new Layout("NINE", 9, new int[] {
                2, 3, 3, 1
            });
            k = new Layout("TEN", 10, new int[] {
                2, 3, 3, 2
            });
            l = new Layout("ELEVEN", 11, new int[] {
                3, 3, 3, 2
            });
            m = new Layout("TWELVE", 12, new int[] {
                3, 3, 3, 3
            });
            $VALUES = (new Layout[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m
            });
        }

        private Layout(String s, int i1, int ai[])
        {
            super(s, i1);
            mLayoutFormat = ai;
        }
    }


    public final Layout b;
    public final int c;

    public ChannelSpanSizeLookup(int i)
    {
        c = Math.max(0, i);
        Layout layout;
        if (c > 12)
        {
            layout = null;
        } else
        {
            layout = Layout.values()[c];
        }
        b = layout;
    }

    public final int a(int i)
    {
        if (c != 0)
        {
            if (a())
            {
                if (b(i))
                {
                    return 6 / (c % 3);
                } else
                {
                    return 2;
                }
            }
            Point point = new Point();
            a(point, i);
            if (point.x >= 0)
            {
                return 6 / b.mLayoutFormat[point.x];
            }
        }
        return 0;
    }

    public final void a(Point point, int i)
    {
        int k;
        int l;
        int i1;
label0:
        {
            int j = 0;
            if (a())
            {
                point.y = i % 3;
                point.x = i / 3;
                return;
            }
            int ai[] = b.mLayoutFormat;
            for (k = 0; k < ai.length; k = l)
            {
                j = i - ai[k];
                i1 = i;
                l = j;
                if (j < 0)
                {
                    break label0;
                }
                l = k + 1;
                k = j;
                j = i;
                i = k;
            }

            l = i;
            i1 = j;
        }
        if (l < 0)
        {
            point.x = k;
            point.y = i1;
            return;
        } else
        {
            point.x = -1;
            point.y = -1;
            return;
        }
    }

    public final boolean a()
    {
        return c > 12;
    }

    public final boolean b(int i)
    {
        return i >= c - c % 3;
    }
}
