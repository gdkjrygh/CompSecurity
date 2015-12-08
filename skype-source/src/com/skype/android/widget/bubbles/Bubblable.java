// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.bubbles;

import android.content.res.Resources;
import android.view.View;

public interface Bubblable
{
    public static final class Direction extends Enum
    {

        public static final Direction a;
        public static final Direction b;
        public static final Direction c;
        private static final Direction i[];
        private final int d;
        private int e;
        private int f;
        private int g;
        private int h;

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(com/skype/android/widget/bubbles/Bubblable$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])i.clone();
        }

        public final int a()
        {
            return d;
        }

        public final void a(View view)
        {
            Resources resources = view.getResources();
            view.setPadding(resources.getDimensionPixelSize(e), resources.getDimensionPixelSize(f), resources.getDimensionPixelSize(g), resources.getDimensionPixelSize(h));
        }

        static 
        {
            a = new Direction("INBOUND", 0, 0x7f0e002a, 0x7f0c009d, 0x7f0c0071, 0x7f0c009e, 0x7f0c0070);
            b = new Direction("OUTBOUND", 1, 0x7f0e0032, 0x7f0c00ba, 0x7f0c0071, 0x7f0c00bb, 0x7f0c0070);
            c = new Direction("NO_BUBBLE", 2, 0x7f0e0031, 0x7f0c0201, 0x7f0c0203, 0x7f0c0202, 0x7f0c0200);
            i = (new Direction[] {
                a, b, c
            });
        }

        private Direction(String s, int j, int k, int l, int i1, int j1, int k1)
        {
            super(s, j);
            d = k;
            e = l;
            f = i1;
            g = j1;
            h = k1;
        }
    }


    public abstract void setDirectionState(Direction direction, boolean flag);
}
