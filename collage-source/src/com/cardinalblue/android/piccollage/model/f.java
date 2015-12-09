// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.graphics.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            g

public abstract class com.cardinalblue.android.piccollage.model.f
{
    private static class a
    {

        private static com.cardinalblue.android.piccollage.model.g a(List list)
        {
            float f1 = 0.0F;
            Object obj = null;
            Iterator iterator = list.iterator();
            list = obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.cardinalblue.android.piccollage.model.g g1 = (com.cardinalblue.android.piccollage.model.g)iterator.next();
                float f2 = g1.d() * g1.e();
                if (f2 > f1)
                {
                    f1 = f2;
                    list = g1;
                }
            } while (true);
            return list;
        }

        private static void a(com.cardinalblue.android.piccollage.model.g g1, Random random, Path path, List list)
        {
            if (!list.contains(g1))
            {
                return;
            }
            list.remove(g1);
            float f1 = g1.f();
            float f2 = g1.g();
            float f3 = g1.h();
            float f4 = 0.4F + random.nextFloat() / 5F;
            float f5 = g1.d();
            float f6 = g1.e();
            if ((double)f5 > (double)f6 * 1.5D)
            {
                g1 = new com.cardinalblue.android.piccollage.model.g(f5 * f4, f6, f1, f2, f3);
                random = new com.cardinalblue.android.piccollage.model.g(f5 * (1.0F - f4), f6, f1 + f5 * f4, f2, f3);
                path.moveTo(f5 * f4 + f1, f2);
                path.lineTo(f5 * f4 + f1, f6 + f2);
            } else
            {
                g1 = new com.cardinalblue.android.piccollage.model.g(f5, f6 * f4, f1, f2, f3);
                random = new com.cardinalblue.android.piccollage.model.g(f5, f6 * (1.0F - f4), f1, f2 + f6 * f4, f3);
                path.moveTo(f1, f6 * f4 + f2);
                path.lineTo(f1 + f5, f6 * f4 + f2);
            }
            list.add(g1);
            list.add(random);
        }

        public static void a(List list, Random random, Path path)
        {
            if (random.nextBoolean())
            {
                b(list, random, path);
                return;
            } else
            {
                c(list, random, path);
                return;
            }
        }

        private static void b(List list, Random random, Path path)
        {
            a(a(list), random, path, list);
        }

        private static void c(List list, Random random, Path path)
        {
            a((com.cardinalblue.android.piccollage.model.g)list.get(random.nextInt(list.size())), random, path, list);
        }

        private a()
        {
        }
    }

    public static class b extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            com.cardinalblue.android.piccollage.model.g g1 = new com.cardinalblue.android.piccollage.model.g(1.0F, 0.5F, 0.0F, 0.0F, b);
            com.cardinalblue.android.piccollage.model.g g2 = new com.cardinalblue.android.piccollage.model.g(1.0F, 0.5F, 0.0F, 0.5F, b);
            list.add(g1);
            list.add(g2);
            b(i1 - 2, list);
        }

        protected void b()
        {
            a(0.0F, 0.5F, 1.0F, 0.5F);
        }

        public b()
        {
        }
    }

    public static class c extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            com.cardinalblue.android.piccollage.model.g g1 = new com.cardinalblue.android.piccollage.model.g(1.0F, 0.33F, 0.0F, 0.0F, b);
            com.cardinalblue.android.piccollage.model.g g2 = new com.cardinalblue.android.piccollage.model.g(1.0F, 0.67F, 0.0F, 0.33F, b);
            list.add(g1);
            list.add(g2);
            b(i1 - 2, list);
        }

        protected void b()
        {
            a(0.0F, 0.33F, 1.0F, 0.33F);
        }

        public c()
        {
        }
    }

    public static class d extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            com.cardinalblue.android.piccollage.model.g g1 = new com.cardinalblue.android.piccollage.model.g(1.0F, 0.67F, 0.0F, 0.0F, b);
            com.cardinalblue.android.piccollage.model.g g2 = new com.cardinalblue.android.piccollage.model.g(1.0F, 0.33F, 0.0F, 0.67F, b);
            list.add(g1);
            list.add(g2);
            b(i1 - 2, list);
        }

        protected void b()
        {
            a(0.0F, 0.67F, 1.0F, 0.67F);
        }

        public d()
        {
        }
    }

    public static class e extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            com.cardinalblue.android.piccollage.model.g g1 = new com.cardinalblue.android.piccollage.model.g(0.5F, 1.0F, 0.0F, 0.0F, b);
            com.cardinalblue.android.piccollage.model.g g2 = new com.cardinalblue.android.piccollage.model.g(0.5F, 1.0F, 0.5F, 0.0F, b);
            list.add(g1);
            list.add(g2);
            b(i1 - 2, list);
        }

        protected void b()
        {
            a(0.5F, 0.0F, 0.5F, 1.0F);
        }

        public e()
        {
        }
    }

    public static class f extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.33F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.34F, 0.0F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.33F, 0.0F, 0.67F, b));
            b(i1 - 3, list);
        }

        protected void b()
        {
            a(0.0F, 0.33F, 1.0F, 0.33F);
            a(0.0F, 0.67F, 1.0F, 0.67F);
        }

        public f()
        {
        }
    }

    public static class g extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            com.cardinalblue.android.piccollage.model.g g1 = new com.cardinalblue.android.piccollage.model.g(0.5F, 0.5F, 0.0F, 0.0F, b);
            com.cardinalblue.android.piccollage.model.g g2 = new com.cardinalblue.android.piccollage.model.g(0.5F, 0.5F, 0.5F, 0.0F, b);
            com.cardinalblue.android.piccollage.model.g g3 = new com.cardinalblue.android.piccollage.model.g(0.5F, 0.5F, 0.0F, 0.5F, b);
            com.cardinalblue.android.piccollage.model.g g4 = new com.cardinalblue.android.piccollage.model.g(0.5F, 0.5F, 0.5F, 0.5F, b);
            list.add(g1);
            list.add(g2);
            list.add(g3);
            list.add(g4);
            b(i1 - 4, list);
        }

        protected void b()
        {
            a(0.5F, 0.0F, 0.5F, 1.0F);
            a(0.0F, 0.5F, 1.0F, 0.5F);
        }

        public g()
        {
        }
    }

    public static final class h extends Enum
    {

        public static final h a;
        public static final h b;
        public static final h c;
        public static final h d;
        public static final h e;
        public static final h f;
        public static final h g;
        public static final h h;
        public static final h i;
        public static final h j;
        public static final h k;
        public static final h l;
        public static final h m;
        public static final h n;
        public static final h o;
        public static final h p;
        private static final h r[];
        private final String q;

        public static h a(String s)
        {
            h ah[] = values();
            int j1 = ah.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                h h1 = ah[i1];
                if (h1.a().equals(s))
                {
                    return h1;
                }
            }

            return a;
        }

        public static h valueOf(String s)
        {
            return (h)Enum.valueOf(com/cardinalblue/android/piccollage/model/f$h, s);
        }

        public static h[] values()
        {
            return (h[])r.clone();
        }

        public String a()
        {
            return q;
        }

        static 
        {
            a = new h("FRAME_0", 0, "free");
            b = new h("FRAME_2_1", 1, "1x2");
            c = new h("FRAME_2_2", 2, "1 small top + 1 bigger bottom");
            d = new h("FRAME_2_3", 3, "1 bigger top + 1 small bottom");
            e = new h("FRAME_2_4", 4, "2x1");
            f = new h("FRAME_3_1", 5, "1x3");
            g = new h("FRAME_3_2", 6, "1+2");
            h = new h("FRAME_3_3", 7, "3x1");
            i = new h("FRAME_4_1", 8, "2x2");
            j = new h("FRAME_4_2", 9, "1x4");
            k = new h("FRAME_4_3", 10, "1 top + 3 bottom");
            l = new h("FRAME_4_4", 11, "3 top + 1 bottom");
            m = new h("FRAME_5_1", 12, "1 + 2 + 2");
            n = new h("FRAME_5_2", 13, "2 + 1 + 2");
            o = new h("FRAME_6_1", 14, "2x3");
            p = new h("FRAME_9_1", 15, "3x3");
            r = (new h[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p
            });
        }

        private h(String s, int i1, String s1)
        {
            super(s, i1);
            q = s1;
        }
    }

    public static class i extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 1.0F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.5F, 0.5F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.5F, 0.5F, 0.5F, b));
            b(i1 - 3, list);
        }

        protected void b()
        {
            a(0.5F, 0.0F, 0.5F, 1.0F);
            a(0.5F, 0.5F, 1.0F, 0.5F);
        }

        public i()
        {
        }
    }

    public static class j extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 1.0F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.34F, 1.0F, 0.33F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 1.0F, 0.67F, 0.0F, b));
            b(i1 - 3, list);
        }

        protected void b()
        {
            a(0.33F, 0.0F, 0.33F, 1.0F);
            a(0.67F, 0.0F, 0.67F, 1.0F);
        }

        public j()
        {
        }
    }

    public static class k extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.25F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.25F, 0.0F, 0.25F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.25F, 0.0F, 0.5F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.25F, 0.0F, 0.75F, b));
            b(i1 - 4, list);
        }

        protected void b()
        {
            a(0.0F, 0.25F, 1.0F, 0.25F);
            a(0.0F, 0.5F, 1.0F, 0.5F);
            a(0.0F, 0.75F, 1.0F, 0.75F);
        }

        public k()
        {
        }
    }

    public static class l extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.33F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.67F, 0.0F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.34F, 0.67F, 0.33F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.67F, 0.67F, 0.33F, b));
            b(i1 - 4, list);
        }

        protected void b()
        {
            a(0.0F, 0.33F, 1.0F, 0.33F);
            a(0.33F, 0.33F, 0.33F, 1.0F);
            a(0.67F, 0.33F, 0.67F, 1.0F);
        }

        public l()
        {
        }
    }

    public static class m extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.33F, 0.0F, 0.67F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.67F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.34F, 0.67F, 0.33F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.67F, 0.67F, 0.0F, b));
            b(i1 - 4, list);
        }

        protected void b()
        {
            a(0.0F, 0.67F, 1.0F, 0.67F);
            a(0.33F, 0.0F, 0.33F, 0.67F);
            a(0.67F, 0.0F, 0.67F, 0.67F);
        }

        public m()
        {
        }
    }

    public static class n extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.33F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.34F, 0.0F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.34F, 0.5F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.0F, 0.67F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.5F, 0.67F, b));
            b(i1 - 5, list);
        }

        protected void b()
        {
            a(0.0F, 0.33F, 1.0F, 0.33F);
            a(0.0F, 0.67F, 1.0F, 0.67F);
            a(0.5F, 0.33F, 0.5F, 1.0F);
        }

        public n()
        {
        }
    }

    public static class o extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.5F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(1.0F, 0.34F, 0.0F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.0F, 0.67F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.5F, 0.67F, b));
            b(i1 - 5, list);
        }

        protected void b()
        {
            a(0.0F, 0.33F, 1.0F, 0.33F);
            a(0.0F, 0.67F, 1.0F, 0.67F);
            a(0.5F, 0.0F, 0.5F, 0.33F);
            a(0.5F, 0.67F, 0.5F, 1.0F);
        }

        public o()
        {
        }
    }

    public static class p extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.5F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.34F, 0.0F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.34F, 0.5F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.0F, 0.67F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.5F, 0.33F, 0.5F, 0.67F, b));
            b(i1 - 6, list);
        }

        protected void b()
        {
            a(0.0F, 0.33F, 1.0F, 0.33F);
            a(0.0F, 0.67F, 1.0F, 0.67F);
            a(0.5F, 0.0F, 0.5F, 1.0F);
        }

        public p()
        {
        }
    }

    public static class q extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.33F, 0.0F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.34F, 0.33F, 0.33F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.33F, 0.67F, 0.0F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.34F, 0.0F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.34F, 0.34F, 0.33F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.34F, 0.67F, 0.33F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.33F, 0.0F, 0.67F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.34F, 0.33F, 0.33F, 0.67F, b));
            list.add(new com.cardinalblue.android.piccollage.model.g(0.33F, 0.33F, 0.67F, 0.67F, b));
            b(i1 - 9, list);
        }

        protected void b()
        {
            a(0.0F, 0.33F, 1.0F, 0.33F);
            a(0.0F, 0.67F, 1.0F, 0.67F);
            a(0.33F, 0.0F, 0.33F, 1.0F);
            a(0.67F, 0.0F, 0.67F, 1.0F);
        }

        public q()
        {
        }
    }

    public static class r extends com.cardinalblue.android.piccollage.model.f
    {

        public void a(int i1, List list)
        {
        }

        protected void b()
        {
        }

        public r()
        {
        }
    }


    protected Path a;
    protected float b;

    public com.cardinalblue.android.piccollage.model.f()
    {
        a = a();
        b();
        b = 0.025F;
    }

    public static Path a()
    {
        Path path = new Path();
        path.moveTo(0.0F, 0.0F);
        path.lineTo(0.0F, 1.0F);
        path.lineTo(1.0F, 1.0F);
        path.lineTo(1.0F, 0.0F);
        path.close();
        return path;
    }

    public static com.cardinalblue.android.piccollage.model.f a(h h1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[h.values().length];
                try
                {
                    a[h.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[h.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[h.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[h.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[h.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[h.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[h.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[h.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[h.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[h.j.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[h.k.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[h.l.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[h.m.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[h.n.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[h.o.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[h.p.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[h1.ordinal()])
        {
        default:
            return new r();

        case 1: // '\001'
            return new r();

        case 2: // '\002'
            return new b();

        case 3: // '\003'
            return new c();

        case 4: // '\004'
            return new d();

        case 5: // '\005'
            return new e();

        case 6: // '\006'
            return new f();

        case 7: // '\007'
            return new i();

        case 8: // '\b'
            return new j();

        case 9: // '\t'
            return new g();

        case 10: // '\n'
            return new k();

        case 11: // '\013'
            return new l();

        case 12: // '\f'
            return new m();

        case 13: // '\r'
            return new n();

        case 14: // '\016'
            return new o();

        case 15: // '\017'
            return new p();

        case 16: // '\020'
            return new q();
        }
    }

    protected void a(float f1, float f2, float f3, float f4)
    {
        a.moveTo(f1, f2);
        a.lineTo(f3, f4);
    }

    public abstract void a(int i1, List list);

    protected abstract void b();

    protected void b(int i1, List list)
    {
        if (i1 > 0)
        {
            Random random = new Random(System.currentTimeMillis());
            int j1 = 0;
            while (j1 < i1) 
            {
                a.a(list, random, a);
                j1++;
            }
        }
    }

    public Path c()
    {
        return a;
    }
}
