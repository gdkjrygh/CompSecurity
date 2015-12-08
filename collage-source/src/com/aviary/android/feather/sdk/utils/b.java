// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import it.sephiroth.android.library.picasso.q;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;

public class b
    implements q, Callable
{
    public static class a
    {

        Resources a;
        String b;
        com.aviary.android.feather.cds.a.b c;
        boolean d;
        boolean e;
        int f;
        private boolean g;

        public a a()
        {
            d = true;
            return this;
        }

        public a a(Resources resources)
        {
            a = resources;
            return this;
        }

        public a a(com.aviary.android.feather.cds.a.b b1)
        {
            c = b1;
            return this;
        }

        public a a(String s)
        {
            b = s;
            return this;
        }

        public a a(boolean flag)
        {
            g = flag;
            return this;
        }

        public a b()
        {
            e = true;
            return this;
        }

        public b c()
        {
            b b1 = new b();
            if (b == null)
            {
                throw new IllegalArgumentException("path cannot be null");
            }
            if (c == null)
            {
                throw new IllegalArgumentException("packType cannot be null");
            }
            if (a == null)
            {
                throw new IllegalArgumentException("resources cannot be null");
            } else
            {
                b.a(b1, b);
                b.a(b1, c);
                b1.a = new SoftReference(a);
                b.a(b1, d);
                b.b(b1, e);
                b.a(b1, f);
                b.c(b1, g);
                return b1;
            }
        }

        public a()
        {
            f = 255;
        }
    }


    SoftReference a;
    int b;
    int c;
    private String d;
    private com.aviary.android.feather.cds.a.b e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;

    b()
    {
        b = -1;
        c = -1;
    }

    static int a(b b1, int j)
    {
        b1.h = j;
        return j;
    }

    static com.aviary.android.feather.cds.a.b a(b b1, com.aviary.android.feather.cds.a.b b2)
    {
        b1.e = b2;
        return b2;
    }

    static String a(b b1, String s)
    {
        b1.d = s;
        return s;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.f = flag;
        return flag;
    }

    static boolean b(b b1, boolean flag)
    {
        b1.g = flag;
        return flag;
    }

    static boolean c(b b1, boolean flag)
    {
        b1.i = flag;
        return flag;
    }

    Bitmap a(Resources resources, Bitmap bitmap)
    {
        if (resources != null) goto _L2; else goto _L1
_L1:
        return bitmap;
_L2:
        if (com.aviary.android.feather.cds.a.b.b.equals(e))
        {
            Bitmap bitmap1;
            int j;
            if (!g)
            {
                bitmap1 = BitmapFactory.decodeResource(resources, com.aviary.android.feather.sdk.R.drawable.aviary_effects_pack_background);
            } else
            {
                bitmap1 = null;
            }
            if (bitmap1 != null)
            {
                Bitmap bitmap2 = com.aviary.android.feather.library.c.b.a(bitmap, 10F, 10F);
                bitmap1 = com.aviary.android.feather.library.c.b.a(new BitmapDrawable(resources, bitmap1), new BitmapDrawable(resources, bitmap2), 0.76F, 0.0F);
                resources = bitmap1;
                if (bitmap1 != null)
                {
                    resources = bitmap1;
                    if (!bitmap2.equals(bitmap1))
                    {
                        bitmap2.recycle();
                        resources = bitmap1;
                    }
                }
            } else
            {
                if (!f)
                {
                    break MISSING_BLOCK_LABEL_238;
                }
                resources = com.aviary.android.feather.library.c.b.a(bitmap, 12F, 12F);
            }
        } else
        {
            if (!com.aviary.android.feather.cds.a.b.c.equals(e))
            {
                break MISSING_BLOCK_LABEL_238;
            }
            if (!g)
            {
                if (i)
                {
                    j = com.aviary.android.feather.sdk.R.drawable.aviary_sticker_pack_background_glow;
                } else
                {
                    j = com.aviary.android.feather.sdk.R.drawable.aviary_sticker_pack_background;
                }
                bitmap1 = BitmapFactory.decodeResource(resources, j);
            } else
            {
                bitmap1 = null;
            }
            if (bitmap1 == null)
            {
                break MISSING_BLOCK_LABEL_238;
            }
            resources = com.aviary.android.feather.library.c.b.a(new BitmapDrawable(resources, bitmap1), new BitmapDrawable(resources, bitmap), 0.58F, 0.05F);
        }
        if (resources != null)
        {
            if (h == 255)
            {
                return resources;
            }
            bitmap1 = com.aviary.android.feather.library.c.b.a(resources, h);
            bitmap = bitmap1;
            if (!resources.equals(bitmap1))
            {
                resources.recycle();
                return bitmap1;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        resources = null;
        break MISSING_BLOCK_LABEL_98;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public Bitmap a(Bitmap bitmap)
    {
        Object obj = (Resources)a.get();
        Bitmap bitmap1;
        if (obj == null)
        {
            bitmap1 = null;
        } else
        {
            bitmap1 = bitmap;
            if (bitmap != null)
            {
                obj = a(((Resources) (obj)), bitmap);
                bitmap1 = bitmap;
                if (obj != null)
                {
                    bitmap1 = bitmap;
                    if (obj != bitmap)
                    {
                        bitmap.recycle();
                        return ((Bitmap) (obj));
                    }
                }
            }
        }
        return bitmap1;
    }

    public String a()
    {
        return (new StringBuilder()).append(d).append("_").append(e.name()).append("_").append(f).append("_").append(g).append("_").append(h).append("_").append(i).toString();
    }

    public Bitmap b()
        throws Exception
    {
        Object obj = null;
        Resources resources = (Resources)a.get();
        if (resources == null)
        {
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        Bitmap bitmap = obj;
        if (d != null)
        {
            bitmap = obj;
            if (d.length() > 0)
            {
                bitmap = BitmapFactory.decodeFile(d, options);
            }
        }
        if (bitmap == null)
        {
            bitmap = BitmapFactory.decodeResource(resources, b);
        }
        bitmap = a(bitmap);
        if (c > 0 && bitmap != null)
        {
            Bitmap bitmap1 = com.aviary.android.feather.library.c.b.a(bitmap, c, c);
            if (bitmap1 != null && bitmap != bitmap1)
            {
                bitmap.recycle();
                return bitmap1;
            }
        }
        return bitmap;
    }

    public Object call()
        throws Exception
    {
        return b();
    }
}
