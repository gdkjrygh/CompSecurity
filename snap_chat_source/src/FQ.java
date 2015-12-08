// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.snapchat.android.Timber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class FQ
{
    public static interface a
    {

        public abstract void a();
    }


    private static FQ d = null;
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public a c;
    private FO e;

    protected FQ()
    {
        c = null;
        e = FO.a();
        FR.a();
        a("favorites", "path", "icon_path", 0);
    }

    static FO a(FQ fq)
    {
        return fq.e;
    }

    public static FQ a()
    {
        if (d == null)
        {
            d = new FQ();
        }
        return d;
    }

    public final void a(FP fp)
    {
        b.remove(Integer.valueOf(fp.e));
        int j = 0;
        int i;
        int k;
        for (i = -1; j < a.size(); i = k)
        {
            FP fp1 = (FP)a.get(j);
            k = i;
            if (i == -1)
            {
                k = i;
                if (fp1.e > fp.e)
                {
                    k = j;
                }
            }
            j++;
        }

        j = i;
        if (i == -1)
        {
            j = a.size();
        }
        a.add(j, fp);
    }

    public final void a(String s, String s1, String s2, int i)
    {
        int j = b.size();
        b.put(Integer.valueOf(j), new FP(s, s1, s2, i, j));
    }


    // Unreferenced inner class FQ$1

/* anonymous class */
    public final class _cls1 extends AsyncTask
    {

        private FP a;
        private FM.a b;
        private FQ c;

        protected final Object doInBackground(Object aobj[])
        {
            aobj = FQ.a(c);
            FP fp = a;
            boolean flag;
            if (fp.g)
            {
                flag = true;
            } else
            if (fp.h || Arrays.asList(((FO) (aobj)).a.fileList()).contains(fp.a) && ((FO) (aobj)).a(fp))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                Timber.f("StickerPackManager", "[Stickers] Not downloading sticker pack %s because it is already up to date.", new Object[] {
                    a.a
                });
            } else
            {
                Timber.f("StickerPackManager", "[Stickers] Downloading version %s of %s", new Object[] {
                    Integer.valueOf(a.d), a.a
                });
                (new FM(a, b)).execute();
            }
            return null;
        }

            public 
            {
                c = FQ.this;
                a = fp;
                b = a1;
                super();
            }
    }


    // Unreferenced inner class FQ$2

/* anonymous class */
    public final class _cls2 extends AsyncTask
    {

        final FP a;
        final com.snapchat.android.ui.chat.ChatStickersDrawerView.c b;
        final FQ c;

        protected final Object doInBackground(Object aobj[])
        {
            return FQ.a(c).b(a);
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (Drawable)obj;
            if (obj == null)
            {
                (new FL(a, new FL.a(this) {

                    private _cls2 a;

                    public final void a()
                    {
    public final class _cls2 extends AsyncTask
    {
                        a.c.a(a.a);
                        a.b.a(FQ.a(a.c).b(a.a));
                    }

            
            {
                a = _pcls2;
                super();
            }
                })).execute();
                return;
            } else
            {
                c.a(a);
                b.a(((Drawable) (obj)));
                return;
            }
        }

            public 
            {
                c = FQ.this;
                a = fp;
                b = c1;
                super();
            }
    }

}
