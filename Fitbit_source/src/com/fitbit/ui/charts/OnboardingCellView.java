// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

// Referenced classes of package com.fitbit.ui.charts:
//            OnboardingCellView_

public class OnboardingCellView extends LinearLayout
{
    public static class TileType extends Enum
    {

        public static final TileType a;
        public static final TileType b;
        public static final TileType c;
        public static final TileType d;
        public static final TileType e;
        public static final TileType f;
        public static final TileType g;
        public static final TileType h;
        private static final TileType i[];
        private final int id;
        private final int image;
        final int text;
        private final int url;

        public static TileType valueOf(String s)
        {
            return (TileType)Enum.valueOf(com/fitbit/ui/charts/OnboardingCellView$TileType, s);
        }

        public static TileType[] values()
        {
            return (TileType[])i.clone();
        }

        public CharSequence a(Context context, TileType tiletype)
        {
            tiletype = (new StringBuilder()).append(context.getString(text));
            if (a())
            {
                context = context.getString(0x7f08038f);
            } else
            {
                context = "";
            }
            return tiletype.append(context).toString();
        }

        public String a(Context context)
        {
            return context.getString(url);
        }

        public boolean a()
        {
            return url != 0;
        }

        public int b()
        {
            return image;
        }

        public int c()
        {
            return id;
        }

        static 
        {
            a = new TileType("STEPS", 0, 0x7f0203ad, 0x7f0804f3, 0x7f0804f2, 0);
            b = new TileType("CALORIES", 1, 0x7f0203a8, 0x7f0800b5, 0x7f0800b4, 1);
            c = new TileType("EXERCISE", 2, 0x7f0203a9, 0x7f08019e, 0, 2);
            d = new TileType("FOOD_LOGGING", 3, 0x7f0203aa, 0x7f080213, 0, 3);
            e = new TileType("HEART_RATE", 4, 0x7f0203ab, 0x7f08024b, 0x7f08024a, 4);
            f = new TileType("BIKE", 5, 0x7f0203a7, 0x7f08008c, 0x7f0805e9, 5);
            g = new TileType("SLEEP", 6, 0x7f0203ac, 0x7f0804d0, 0x7f08062c, 6);
        /* block-local class not found */
        class _cls1 {}

            h = new _cls1("SLEEP_NEWS", 7, 0x7f0202f0, 0x7f0804cf, 0, 7);
            i = (new TileType[] {
                a, b, c, d, e, f, g, h
            });
        }

        private TileType(String s, int j, int k, int l, int i1, int j1)
        {
            super(s, j);
            image = k;
            text = l;
            url = i1;
            id = j1;
        }

        TileType(String s, int j, int k, int l, int i1, int j1, _cls1 _pcls1)
        {
            this(s, j, k, l, i1, j1);
        }
    }


    protected TextView a;
    protected LoadablePicassoImageView b;
    private TileType c;

    public OnboardingCellView(Context context)
    {
        super(context);
    }

    public static OnboardingCellView a(Context context)
    {
        return OnboardingCellView_.b(context);
    }

    public static boolean b(TileType tiletype)
    {
        return true;
    }

    public void a(TileType tiletype)
    {
        c = tiletype;
        Context context = getContext();
        if (context != null)
        {
            a.setText(tiletype.a(context, tiletype));
            b.setImageResource(tiletype.b());
            if (tiletype.a() || tiletype == TileType.h)
            {
                setOnClickListener(new _cls1(tiletype, context));
            } else
            {
                setFocusable(false);
            }
            setOnLongClickListener(new _cls2(context, tiletype));
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
