// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import com.cardinalblue.android.piccollage.model.gson.ImageScrapModel;
import com.cardinalblue.android.piccollage.model.gson.VideoScrapModel;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            l, g, c, o

public class h
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/view/h$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NORMAL", 0);
            b = new a("BACKGROUND", 1);
            c = new a("STICKER", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public h()
    {
    }

    public static g a(Context context, ContentValues contentvalues)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        boolean flag1 = true;
        boolean flag;
        if (contentvalues.getAsInteger("is_editable").intValue() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (contentvalues.getAsInteger("has_frame").intValue() != 1)
        {
            flag1 = false;
        }
        if (!flag1 && !flag)
        {
            return new l(context, contentvalues);
        } else
        {
            return new g(context, contentvalues);
        }
    }

    public static g a(Context context, Bitmap bitmap)
    {
        return a(context, bitmap, a.a);
    }

    public static g a(Context context, Bitmap bitmap, a a1)
    {
        if (bitmap == null)
        {
            throw new IllegalArgumentException("bitmap should not be null");
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            return g.a(context, bitmap);

        case 1: // '\001'
            return new c(context, bitmap);

        case 2: // '\002'
            return new l(context, bitmap);
        }
    }

    public static g a(Context context, ImageScrapModel imagescrapmodel)
    {
        if (VideoScrapModel.TYPE_VIDEO_SCRAP.equals(imagescrapmodel.getScrapType()))
        {
            return new o(context, (VideoScrapModel)imagescrapmodel);
        }
        if (imagescrapmodel.isSticker())
        {
            return new l(context, imagescrapmodel);
        }
        if (imagescrapmodel.isBackground())
        {
            return new c(context, imagescrapmodel);
        } else
        {
            return new g(context, imagescrapmodel);
        }
    }
}
