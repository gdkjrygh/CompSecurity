// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kik.android.chat.KikApplication;
import kik.android.gifs.a.a;
import kik.android.gifs.view.EmojiLruCache;

public final class as extends android.support.v7.widget.RecyclerView.a
{
    static final class a extends android.support.v7.widget.RecyclerView.t
    {

        public a(View view)
        {
            super(view);
        }
    }

    static final class b extends android.support.v7.widget.RecyclerView.t
        implements android.view.View.OnClickListener
    {

        ImageView j;
        private GifSearchFragment.b k;
        private String l;
        private String m;

        static void a(b b1, String s, String s1)
        {
            b1.l = s;
            b1.m = s1;
        }

        static void a(b b1, GifSearchFragment.b b2)
        {
            b1.k = b2;
        }

        public final void onClick(View view)
        {
            k.a(l, m);
        }

        public b(ImageView imageview)
        {
            super(imageview);
            j = imageview;
            j.setOnClickListener(this);
        }
    }


    private final List a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final int d;
    private Context e;
    private GifSearchFragment.b f;
    private Paint g;
    private EmojiLruCache h;
    private HashMap i;

    public as(List list, Context context, GifSearchFragment.b b1)
    {
        e = context;
        a = list;
        d = context.getResources().getDimensionPixelSize(0x7f0d0013);
        f = b1;
        h = EmojiLruCache.a(e);
        g = new Paint();
        g.setTextSize(KikApplication.a(30));
        g.setTextAlign(android.graphics.Paint.Align.CENTER);
        i = new HashMap();
    }

    private boolean a(kik.android.gifs.a.a a1)
    {
        return g.measureText(a1.a()) >= 50F;
    }

    public final int a()
    {
        return b.size() + 1;
    }

    public final int a(int j)
    {
        return j > 0 ? 1 : 0;
    }

    public final android.support.v7.widget.RecyclerView.t a(ViewGroup viewgroup, int j)
    {
        if (j == 0)
        {
            viewgroup = new Space(e);
            viewgroup.setMinimumHeight(e.getResources().getDimensionPixelSize(0x7f0d0017) + KikApplication.a(8));
            return new a(viewgroup);
        } else
        {
            return new b((ImageView)LayoutInflater.from(e).inflate(0x7f03004b, viewgroup, false));
        }
    }

    public final void a(android.support.v7.widget.RecyclerView.t t, int j)
    {
        Object obj;
label0:
        {
            if (t instanceof b)
            {
                obj = (kik.android.gifs.a.a)b.get(j - 1);
                kik.android.widget.b.a((b)t, f);
                Bitmap bitmap;
                String s;
                if (a(((kik.android.gifs.a.a) (obj))))
                {
                    kik.android.widget.b.a((b)t, ((kik.android.gifs.a.a) (obj)).a(), ((kik.android.gifs.a.a) (obj)).a());
                } else
                {
                    kik.android.widget.b.a((b)t, ((kik.android.gifs.a.a) (obj)).a(), ((kik.android.gifs.a.a) (obj)).b());
                }
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    break label0;
                }
                s = ((kik.android.gifs.a.a) (obj)).a();
                bitmap = h.a(s);
                obj = bitmap;
                if (bitmap == null)
                {
                    j = d;
                    obj = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(((Bitmap) (obj)));
                    j = canvas.getWidth() / 2;
                    canvas.drawColor(-1);
                    if (g.measureText(s) > (float)d * 1.5F)
                    {
                        g.setTextSize(KikApplication.a(15));
                        int k = (int)((float)(canvas.getHeight() / 2) - (g.descent() + g.ascent()) / 2.0F);
                        canvas.drawText(s, j, k, g);
                        g.setTextSize(KikApplication.a(30));
                    } else
                    {
                        int l = (int)((float)(canvas.getHeight() / 2) - (g.descent() + g.ascent()) / 2.0F);
                        canvas.drawText(s, j, l, g);
                    }
                    h.put(s, obj);
                }
                ((b)t).j.setImageBitmap(((Bitmap) (obj)));
            }
            return;
        }
        ImageView imageview = ((b)t).j;
        String s1 = ((kik.android.gifs.a.a) (obj)).a();
        obj = h.a(s1);
        t = ((android.support.v7.widget.RecyclerView.t) (obj));
        if (obj == null)
        {
            j = d;
            t = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.RGB_565);
            Drawable drawable = e.getResources().getDrawable(((Integer)i.get(s1)).intValue());
            Canvas canvas1 = new Canvas(t);
            canvas1.drawColor(-1);
            drawable.setBounds(5, 5, j - 5, j - 5);
            drawable.draw(canvas1);
            h.put(s1, t);
        }
        imageview.setImageBitmap(t);
    }

    public final void d()
    {
        b.clear();
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
_L1:
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.android.gifs.a.a a1 = (kik.android.gifs.a.a)iterator.next();
            if (a(a1))
            {
                b.add(a1);
            }
        } while (true);
          goto _L3
_L2:
        Iterator iterator1 = a.iterator();
_L5:
        if (iterator1.hasNext())
        {
            kik.android.gifs.a.a a2 = (kik.android.gifs.a.a)iterator1.next();
            String s1 = a2.a();
            int j;
            if (s1.length() != 2)
            {
                j = 0;
            } else
            {
                j = Character.toCodePoint(s1.charAt(0), s1.charAt(1));
                String s = (new StringBuilder("emoji_u")).append(Integer.toString(j, 16)).toString();
                if (s1.equals("\u2764\uFE0F"))
                {
                    s = "emoji_heart";
                }
                j = e.getResources().getIdentifier(s, "drawable", e.getPackageName());
                if (j == 0)
                {
                    j = 0;
                } else
                {
                    i.put(s1, Integer.valueOf(j));
                }
            }
            if (j != 0)
            {
                b.add(a2);
            }
            continue; /* Loop/switch isn't completed */
        }
_L3:
        super.c();
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final List e()
    {
        return a;
    }
}
