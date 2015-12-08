// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.skype.android.config.ecs.EcsConfiguration;

public class DefaultAvatars
{
    public static final class AvatarSize extends Enum
    {

        public static final AvatarSize a;
        public static final AvatarSize b;
        public static final AvatarSize c;
        private static final AvatarSize d[];

        public static AvatarSize valueOf(String s)
        {
            return (AvatarSize)Enum.valueOf(com/skype/android/res/DefaultAvatars$AvatarSize, s);
        }

        public static AvatarSize[] values()
        {
            return (AvatarSize[])d.clone();
        }

        static 
        {
            a = new AvatarSize("SMALL", 0);
            b = new AvatarSize("MEDIUM", 1);
            c = new AvatarSize("LARGE", 2);
            d = (new AvatarSize[] {
                a, b, c
            });
        }

        private AvatarSize(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class AvatarType extends Enum
    {

        public static final AvatarType a;
        public static final AvatarType b;
        public static final AvatarType c;
        public static final AvatarType d;
        public static final AvatarType e;
        public static final AvatarType f;
        private static final AvatarType g[];

        public static AvatarType valueOf(String s)
        {
            return (AvatarType)Enum.valueOf(com/skype/android/res/DefaultAvatars$AvatarType, s);
        }

        public static AvatarType[] values()
        {
            return (AvatarType[])g.clone();
        }

        static 
        {
            a = new AvatarType("ECHO123", 0);
            b = new AvatarType("SKYPEOUT", 1);
            c = new AvatarType("DEFAULT", 2);
            d = new AvatarType("GROUP", 3);
            e = new AvatarType("BLOCKED", 4);
            f = new AvatarType("EMAIL", 5);
            g = (new AvatarType[] {
                a, b, c, d, e, f
            });
        }

        private AvatarType(String s, int i)
        {
            super(s, i);
        }
    }


    private Context a;
    private EcsConfiguration b;
    private int c[];
    private int d[];

    public DefaultAvatars(Application application, EcsConfiguration ecsconfiguration)
    {
        a = application;
        b = ecsconfiguration;
        c = a(0x7f0a0003);
        d = a(0x7f0a0004);
    }

    private boolean a(String s)
    {
        return b.areVariableDefaultAvatarBackgroundColorsSupported() && s != null;
    }

    private int[] a(int i)
    {
        TypedArray typedarray = a.getResources().obtainTypedArray(i);
        int ai[] = new int[typedarray.length()];
        for (i = 0; i < typedarray.length(); i++)
        {
            ai[i] = typedarray.getResourceId(i, 0);
        }

        typedarray.recycle();
        return ai;
    }

    private int b(String s)
    {
        int ai[] = c;
        long l = 5381L;
        for (int i = 0; i < s.length(); i++)
        {
            l = l + (l << 5) + (long)s.charAt(i);
        }

        int j;
        if (l == 0x8000000000000000L)
        {
            l = 0L;
        } else
        {
            l = Math.abs(l);
        }
        j = ai[(int)(l % (long)c.length)];
        return a.getResources().getColor(j);
    }

    public final Drawable a(AvatarType avatartype, AvatarSize avatarsize)
    {
        return a(avatartype, avatarsize, null);
    }

    public final Drawable a(AvatarType avatartype, AvatarSize avatarsize, String s)
    {
        int i;
        if (a(s))
        {
            s = new ColorDrawable(b(s));
        } else
        {
            s = a.getResources().getDrawable(0x7f0201cb);
        }
        i = avatartype.ordinal() * AvatarSize.values().length + avatarsize.ordinal();
        if (i < d.length)
        {
            i = d[i];
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            return new LayerDrawable(new Drawable[] {
                s, a.getResources().getDrawable(i)
            });
        } else
        {
            return null;
        }
    }

    public final void a(View view, String s)
    {
        if (a(s))
        {
            view.setBackgroundColor(b(s));
            return;
        } else
        {
            view.setBackgroundResource(0x7f0201cb);
            return;
        }
    }

    public final Bitmap b(AvatarType avatartype, AvatarSize avatarsize, String s)
    {
        avatartype = a(avatartype, avatarsize, s);
        avatarsize = Bitmap.createBitmap(avatartype.getIntrinsicWidth(), avatartype.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        s = new Canvas(avatarsize);
        avatartype.setBounds(0, 0, s.getWidth(), s.getHeight());
        avatartype.draw(s);
        return avatarsize;
    }
}
