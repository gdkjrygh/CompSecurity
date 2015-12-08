// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import bolts.h;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.UndoManager;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.undo.ScrapUpdateOp;
import com.cardinalblue.android.piccollage.activities.undo.SwapFrameOp;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.a.a;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.c;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.n;
import com.cardinalblue.android.piccollage.view.o;
import com.squareup.a.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            u, b, i, q, 
//            d, l

public class CollageController
    implements g.a, k.b, com.cardinalblue.android.piccollage.view.PhotoProtoView.a
{
    public static class UpdateTapAnywhereEvent
        implements IGsonable
    {

        public final boolean a;

        public UpdateTapAnywhereEvent(boolean flag)
        {
            a = flag;
        }
    }

    public static interface a
    {

        public abstract void a(com.cardinalblue.android.piccollage.view.k k1, Exception exception);
    }

    public static interface b
    {

        public abstract void a(int i1);
    }


    private PhotoProtoView a;
    private final ArrayList b = new ArrayList();
    private final AbstractCollage c;
    private a d;
    private Executor e;
    private AtomicBoolean f;
    private AtomicBoolean g;
    private final k.d h = new k.d();
    private bolts.j.a i;

    public CollageController(AbstractCollage abstractcollage, PhotoProtoView photoprotoview, k.c c1)
    {
        f = new AtomicBoolean(false);
        g = new AtomicBoolean(false);
        c = abstractcollage;
        a = photoprotoview;
        a.setListener(this);
        a.a(this, c1);
    }

    private Bitmap a(Bitmap bitmap)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        int i1 = bitmap.getHeight();
        int j1 = bitmap.getWidth();
        boolean flag;
        if (j1 == i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return bitmap;
        } else
        {
            Bitmap bitmap1 = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmap, Math.round((i1 - j1) / 2), 0.0F, null);
            return bitmap1;
        }
    }

    private j a(ContentValues contentvalues, String s1)
    {
        return bolts.j.a(new Callable(s1, contentvalues) {

            final String a;
            final ContentValues b;
            final CollageController c;

            public com.cardinalblue.android.piccollage.view.k a()
                throws Exception
            {
                if (a.equals("images"))
                {
                    g g1 = com.cardinalblue.android.piccollage.view.h.a(com.cardinalblue.android.piccollage.controller.CollageController.a(c).getContext(), b);
                    g1.b(false);
                    return g1;
                }
                if (a.equals("texts"))
                {
                    return new n(com.cardinalblue.android.piccollage.controller.CollageController.a(c).getContext(), b);
                } else
                {
                    throw new IllegalArgumentException();
                }
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                c = CollageController.this;
                a = s1;
                b = contentvalues;
                super();
            }
        }).c(new i() {

            final CollageController a;

            public Void a(j j1)
                throws Exception
            {
                j1 = (com.cardinalblue.android.piccollage.view.k)j1.e();
                com.cardinalblue.android.piccollage.controller.CollageController.a(a, j1);
                a.a(j1, false);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = CollageController.this;
                super();
            }
        }, k.a);
    }

    static PhotoProtoView a(CollageController collagecontroller)
    {
        return collagecontroller.a;
    }

    private List a(int i1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = c.t().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if (k1.t() == i1)
            {
                arraylist.add(k1);
            }
        } while (true);
        return arraylist;
    }

    private List a(SQLiteDatabase sqlitedatabase, String s1, long l1)
    {
        ArrayList arraylist;
        sqlitedatabase = sqlitedatabase.query(s1, null, (new StringBuilder()).append("collage_id = ").append(l1).toString(), null, null, null, "z_index DESC");
        arraylist = new ArrayList();
        sqlitedatabase.moveToFirst();
        for (; !sqlitedatabase.isAfterLast(); sqlitedatabase.moveToNext())
        {
            ContentValues contentvalues = new ContentValues();
            DatabaseUtils.cursorRowToContentValues(sqlitedatabase, contentvalues);
            arraylist.add(a(contentvalues, s1));
        }

        break MISSING_BLOCK_LABEL_105;
        s1;
        sqlitedatabase.close();
        throw s1;
        sqlitedatabase.close();
        return arraylist;
    }

    private Callable a(Canvas canvas, com.cardinalblue.android.piccollage.controller.i i1, j j1, android.graphics.Bitmap.Config config)
    {
        return new Callable(i1, config, j1, canvas) {

            final com.cardinalblue.android.piccollage.controller.i a;
            final android.graphics.Bitmap.Config b;
            final j c;
            final Canvas d;
            final CollageController e;

            public Void a()
                throws Exception
            {
                if (!com.cardinalblue.android.b.g.a(((g)a.j()).i()))
                {
                    a.a(com.cardinalblue.android.piccollage.lib.g.a.d, b);
                }
                if (c != null)
                {
                    c.g();
                }
                g g1 = (g)a.j();
                d.save();
                if (g1.t() != -1)
                {
                    RectF rectf = com.cardinalblue.android.piccollage.controller.CollageController.b(e).s().a(g1.t()).a(com.cardinalblue.android.piccollage.controller.CollageController.a(e).getWidth(), com.cardinalblue.android.piccollage.controller.CollageController.a(e).getHeight(), false);
                    d.clipRect(rectf);
                }
                g1.b(d);
                d.restore();
                if (!com.cardinalblue.android.b.g.a(((g)a.j()).i()))
                {
                    a.a(com.cardinalblue.android.piccollage.lib.g.a.a, b);
                }
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                e = CollageController.this;
                a = i1;
                b = config;
                c = j1;
                d = canvas;
                super();
            }
        };
    }

    private Callable a(Canvas canvas, q q1, j j1)
    {
        return new Callable(j1, canvas, q1) {

            final j a;
            final Canvas b;
            final q c;
            final CollageController d;

            public Void a()
                throws Exception
            {
                if (a != null)
                {
                    a.g();
                }
                b.save();
                ((n)c.j()).b(b);
                b.restore();
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                d = CollageController.this;
                a = j1;
                b = canvas;
                c = q1;
                super();
            }
        };
    }

    private Callable a(Canvas canvas, u u1, j j1)
    {
        return new Callable(j1, u1, canvas) {

            final j a;
            final u b;
            final Canvas c;
            final CollageController d;

            public Void a()
                throws Exception
            {
                if (a != null)
                {
                    a.g();
                }
                o o1 = (o)b.j();
                c.save();
                if (o1.t() != -1)
                {
                    RectF rectf = com.cardinalblue.android.piccollage.controller.CollageController.b(d).s().a(o1.t()).a(com.cardinalblue.android.piccollage.controller.CollageController.a(d).getWidth(), com.cardinalblue.android.piccollage.controller.CollageController.a(d).getHeight(), false);
                    c.clipRect(rectf);
                }
                o1.h(true);
                o1.b(c);
                o1.h(false);
                c.restore();
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                d = CollageController.this;
                a = j1;
                b = u1;
                c = canvas;
                super();
            }
        };
    }

    static void a(CollageController collagecontroller, com.cardinalblue.android.piccollage.view.k k1)
    {
        collagecontroller.m(k1);
    }

    static void a(CollageController collagecontroller, com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        collagecontroller.c(k1, flag);
    }

    static AbstractCollage b(CollageController collagecontroller)
    {
        return collagecontroller.c;
    }

    static a c(CollageController collagecontroller)
    {
        return collagecontroller.d;
    }

    private void c(com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = j(k1);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!(k1 instanceof o)) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = new u((o)k1, this);
        ((u) (obj)).i();
        ((u) (obj)).k();
_L5:
        if (k1.W() == 0x80000000)
        {
            k1.h(j() + 1);
        }
        if (!s())
        {
            bolts.j.a(new Callable() {

                final CollageController a;

                public Object call()
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new UpdateTapAnywhereEvent(false));
                    return null;
                }

            
            {
                a = CollageController.this;
                super();
            }
            }, k.a);
        }
        b.add(obj);
        Collections.sort(b, new Comparator() {

            final CollageController a;

            public int a(l l1, l l2)
            {
                return l1.j().W() - l2.j().W();
            }

            public int compare(Object obj1, Object obj2)
            {
                return a((l)obj1, (l)obj2);
            }

            
            {
                a = CollageController.this;
                super();
            }
        });
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (k1.a() && k1.t() == -1)
        {
            k1.c(p());
        }
        a.a(k1, flag);
          goto _L1
        k1;
        throw k1;
_L4:
        g g1;
label0:
        {
            if (!(k1 instanceof g))
            {
                break MISSING_BLOCK_LABEL_257;
            }
            g1 = (g)k1;
            if (!(g1 instanceof c))
            {
                break label0;
            }
            obj = new com.cardinalblue.android.piccollage.controller.b(g1, this);
            i = bolts.j.a();
            ((com.cardinalblue.android.piccollage.controller.b) (obj)).a().a(new i(g1) {

                final g a;
                final CollageController b;

                public Void a(j j1)
                    throws Exception
                {
                    if (j1.c() || j1.d())
                    {
                        if (com.cardinalblue.android.piccollage.controller.CollageController.c(b) != null)
                        {
                            com.cardinalblue.android.piccollage.controller.CollageController.c(b).a(a, j1.f());
                        }
                        com.cardinalblue.android.piccollage.controller.CollageController.d(b).b(j1.f());
                        b.b(a, false);
                        return null;
                    }
                    if (com.cardinalblue.android.piccollage.controller.CollageController.a(b).b(a))
                    {
                        com.cardinalblue.android.piccollage.controller.CollageController.d(b).b(Boolean.valueOf(true));
                    } else
                    {
                        com.cardinalblue.android.piccollage.controller.CollageController.d(b).b(Boolean.valueOf(false));
                    }
                    a.b(false);
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                b = CollageController.this;
                a = g1;
                super();
            }
            }, k.a);
        }
          goto _L5
        obj = new com.cardinalblue.android.piccollage.controller.i((g)k1, this);
        ((com.cardinalblue.android.piccollage.controller.i) (obj)).a().a(new i(g1) {

            final g a;
            final CollageController b;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d() && a.m() == null)
                {
                    if (com.cardinalblue.android.piccollage.controller.CollageController.c(b) != null)
                    {
                        com.cardinalblue.android.piccollage.controller.CollageController.c(b).a(a, j1.f());
                    }
                    b.b(a, false);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = CollageController.this;
                a = g1;
                super();
            }
        }, k.a);
          goto _L5
label1:
        {
            if (!(k1 instanceof n))
            {
                break label1;
            }
            obj = new q((n)k1);
        }
          goto _L5
        throw new IllegalArgumentException("Scrap is not ImageScrap nor TextScrap.");
          goto _L1
    }

    static bolts.j.a d(CollageController collagecontroller)
    {
        return collagecontroller.i;
    }

    private void d(int i1, int j1)
    {
        for (Iterator iterator = c.t().iterator(); iterator.hasNext();)
        {
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if (k1.t() != -1)
            {
                a.a(k1, true, false);
            } else
            {
                float f1 = (1.0F * k1.L()) / (float)i1;
                k1.d(k1.K(), f1 * (float)j1);
            }
        }

        c.c();
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.PhotoProtoView.ShapeChangeEvent(i1, j1));
    }

    private boolean j(com.cardinalblue.android.piccollage.view.k k1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((l)iterator.next()).j().equals(k1))
            {
                return true;
            }
        }

        return false;
    }

    private void k(com.cardinalblue.android.piccollage.view.k k1)
    {
        this;
        JVM INSTR monitorenter ;
        if (k1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        l l1 = b(k1);
        if (l1 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!g.get())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException((new StringBuilder("Scrap (")).append(k1).append(") can not be found in CollageController.").toString()));
          goto _L1
        k1;
        throw k1;
        b.remove(l1);
        a.a(k1);
        if (s())
        {
            com.cardinalblue.android.piccollage.controller.d.a().c(new UpdateTapAnywhereEvent(true));
        }
          goto _L1
    }

    private int l(com.cardinalblue.android.piccollage.view.k k1)
    {
        int i1;
        if (b == null)
        {
            return -1;
        }
        i1 = 0;
_L3:
        if (i1 >= b.size())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (!((l)b.get(i1)).j().equals(k1)) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i1++;
          goto _L3
        i1 = -1;
          goto _L1
    }

    private void m(com.cardinalblue.android.piccollage.view.k k1)
    {
        if (c.v() != a.getHeight())
        {
            int i1 = c.v();
            int j1 = a.getHeight();
            float f1 = (1.0F * k1.L()) / (float)i1;
            k1.d(k1.K(), f1 * (float)j1);
        }
    }

    private Executor o()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = (ActivityManager)a.getContext().getSystemService("activity");
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        int i1;
        if (com.cardinalblue.android.b.k.a(((ActivityManager) (obj))))
        {
            i1 = 1;
        } else
        {
            i1 = 5;
        }
        e = Executors.newFixedThreadPool(i1);
        obj = e;
        this;
        JVM INSTR monitorexit ;
        return ((Executor) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    private int p()
    {
        int i1 = c.s().b().size();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = c.t().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if (k1.t() != -1)
            {
                arraylist.add(Integer.valueOf(k1.t()));
            }
        } while (true);
        return com.cardinalblue.android.b.k.a(arraylist, i1, -1);
    }

    private void q()
    {
        boolean flag = false;
        Iterator iterator = c.t().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if (k1.a())
            {
                k1.c(-1);
                i1++;
            }
        } while (true);
        int l2 = c.s().b().size();
        if (l2 == 0)
        {
            for (Iterator iterator1 = c.t().iterator(); iterator1.hasNext(); ((com.cardinalblue.android.piccollage.view.k)iterator1.next()).c(-1)) { }
        } else
        {
            Object obj = new Random(System.currentTimeMillis());
            int ai[];
            if (l2 >= i1)
            {
                ai = new int[l2];
                for (i1 = 0; i1 < l2; i1++)
                {
                    ai[i1] = i1;
                }

            } else
            {
                ai = new int[i1];
                int l1 = 0;
                while (l1 < i1) 
                {
                    int j2;
                    if (l1 < l2)
                    {
                        j2 = l1;
                    } else
                    {
                        j2 = ((Random) (obj)).nextInt(l2);
                    }
                    ai[l1] = j2;
                    l1++;
                }
            }
            for (i1 = 0; i1 < l2 / 2; i1++)
            {
                int j1 = ((Random) (obj)).nextInt(l2);
                int i2 = ((Random) (obj)).nextInt(l2);
                int i3 = ai[j1];
                ai[j1] = ai[i2];
                ai[i2] = i3;
            }

            obj = c.t().iterator();
            i1 = ((flag) ? 1 : 0);
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                com.cardinalblue.android.piccollage.view.k k2 = (com.cardinalblue.android.piccollage.view.k)((Iterator) (obj)).next();
                if (k2.a())
                {
                    b(k2, ai[i1]);
                    i1++;
                }
            } while (true);
            c.c();
        }
    }

    private void r()
    {
        c c1 = c.g();
        if (c1 != null)
        {
            l l1 = b(c1);
            if (l1 instanceof com.cardinalblue.android.piccollage.controller.b)
            {
                ((com.cardinalblue.android.piccollage.controller.b)l1).a().c(new i(c1) {

                    final g a;
                    final CollageController b;

                    public Object then(j j1)
                        throws Exception
                    {
                        if (j1.e() != null)
                        {
                            com.cardinalblue.android.piccollage.controller.CollageController.a(b).a(a);
                            com.cardinalblue.android.piccollage.controller.CollageController.b(b).c();
                        }
                        return null;
                    }

            
            {
                b = CollageController.this;
                a = g1;
                super();
            }
                }, k.a);
            }
        }
    }

    private boolean s()
    {
        if (c.t().size() == 1)
        {
            c c1 = c.g();
            if (c1 != null && "assets://backgrounds/default.png".equals(c1.i()))
            {
                return true;
            }
        }
        return false;
    }

    public int a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l1 = (l)iterator.next();
            if (l1 instanceof com.cardinalblue.android.piccollage.controller.i)
            {
                int i1 = ((com.cardinalblue.android.piccollage.controller.i)l1).f();
                if (i1 > 0)
                {
                    arraylist.add(Integer.valueOf(i1));
                }
            }
        } while (true);
        return com.cardinalblue.android.b.k.a(arraylist);
    }

    public Bitmap a(int i1, int j1)
    {
        int k1 = c.w();
        int l1 = c.v();
        float f1;
        if (l1 > k1)
        {
            f1 = ((float)j1 * 1.0F) / (float)l1;
        } else
        {
            f1 = ((float)i1 * 1.0F) / (float)k1;
        }
        if (i1 == j1)
        {
            Bitmap bitmap;
            if (l1 > k1)
            {
                i1 = (int)((float)k1 * f1);
            } else
            {
                j1 = (int)((float)l1 * f1);
            }
            try
            {
                bitmap = a(a.a(i1, j1, f1, android.graphics.Bitmap.Config.ARGB_8888));
            }
            catch (com.cardinalblue.android.piccollage.model.k.a a1)
            {
                com.cardinalblue.android.piccollage.a.f.a(a1);
                return null;
            }
            return bitmap;
        } else
        {
            return a.a(i1, j1, f1, android.graphics.Bitmap.Config.ARGB_8888);
        }
    }

    public Bitmap a(int i1, int j1, android.graphics.Bitmap.Config config, b b1)
        throws OutOfMemoryError
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Bitmap bitmap;
        h h1;
        Canvas canvas;
        int k1;
        Collections.sort(b, new Comparator() {

            final CollageController a;

            public int a(l l2, l l3)
            {
                l2 = l2.j();
                l3 = l3.j();
                int j2 = a.j() + 1;
                int i2;
                if (l2.t() == -1)
                {
                    i2 = l2.W() + j2;
                } else
                {
                    i2 = l2.W();
                }
                if (l3.t() == -1)
                {
                    j2 = l3.W() + j2;
                } else
                {
                    j2 = l3.W();
                }
                return i2 - j2;
            }

            public int compare(Object obj1, Object obj2)
            {
                return a((l)obj1, (l)obj2);
            }

            
            {
                a = CollageController.this;
                super();
            }
        });
        k1 = Math.round(100F / (float)b.size());
        h1 = new h(Integer.valueOf(0));
        bitmap = Bitmap.createBitmap(i1, j1, config);
        canvas = new Canvas(bitmap);
        Log.v("PC", (new StringBuilder()).append("CollageController.canvas size : ").append(canvas.getWidth()).append(" x ").append(canvas.getHeight()).append(" output size : ").append(i1).append(" x ").append(j1).toString());
        obj = canvas.getMatrix();
        ((Matrix) (obj)).setRectToRect(new RectF(0.0F, 0.0F, c.w(), c.v()), new RectF(0.0F, 0.0F, i1, j1), android.graphics.Matrix.ScaleToFit.START);
        canvas.setMatrix(((Matrix) (obj)));
        obj = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        i.a().g();
_L7:
        Executor executor;
        Iterator iterator;
        a.a(canvas);
        executor = o();
        iterator = b.iterator();
        obj = null;
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        l l1 = (l)iterator.next();
        if (l1 instanceof com.cardinalblue.android.piccollage.controller.b) goto _L4; else goto _L3
_L3:
        if (!(l1 instanceof com.cardinalblue.android.piccollage.controller.i)) goto _L6; else goto _L5
_L5:
        obj = bolts.j.a(a(canvas, (com.cardinalblue.android.piccollage.controller.i)l1, ((j) (obj)), config), executor);
_L8:
        ((j) (obj)).a(new i(h1, k1, b1) {

            final h a;
            final int b;
            final b c;
            final CollageController d;

            public Void a(j j2)
                throws Exception
            {
                j2 = a;
                int i2 = b;
                j2.a(Integer.valueOf(((Integer)a.a()).intValue() + i2));
                if (c != null)
                {
                    c.a(((Integer)a.a()).intValue());
                }
                return null;
            }

            public Object then(j j2)
                throws Exception
            {
                return a(j2);
            }

            
            {
                d = CollageController.this;
                a = h1;
                b = i1;
                c = b1;
                super();
            }
        }, j.b);
          goto _L4
        obj;
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
          goto _L7
        config;
        throw config;
_L6:
label0:
        {
            if (!(l1 instanceof q))
            {
                break label0;
            }
            obj = bolts.j.a(a(canvas, (q)l1, ((j) (obj))), executor);
        }
          goto _L8
        if (!(l1 instanceof u))
        {
            break MISSING_BLOCK_LABEL_435;
        }
        obj = bolts.j.a(a(canvas, (u)l1, ((j) (obj))), executor);
          goto _L8
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        ((j) (obj)).g();
_L9:
        Log.v("PC", "CollageController.captureIncrementally end...");
        this;
        JVM INSTR monitorexit ;
        return bitmap;
        config;
        config.printStackTrace();
          goto _L9
        obj = null;
          goto _L8
    }

    public j a(boolean flag)
    {
        com.cardinalblue.android.piccollage.model.a.a a1;
        Object obj;
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        obj = c;
        boolean flag1 = ((AbstractCollage) (obj)).e();
        if (flag)
        {
            a.a(com.cardinalblue.android.piccollage.view.PhotoProtoView.b.c, c.w(), c.v());
        } else
        if (!flag1)
        {
            PhotoProtoView photoprotoview = a;
            com.cardinalblue.android.piccollage.view.PhotoProtoView.b b1;
            if (((AbstractCollage) (obj)).y())
            {
                b1 = com.cardinalblue.android.piccollage.view.PhotoProtoView.b.b;
            } else
            {
                b1 = com.cardinalblue.android.piccollage.view.PhotoProtoView.b.a;
            }
            photoprotoview.setShape(b1);
        } else
        {
            a.setShape(com.cardinalblue.android.piccollage.view.PhotoProtoView.b.a);
        }
        g.set(true);
        if (!flag1)
        {
            return bolts.j.a(new Callable(((AbstractCollage) (obj))) {

                final AbstractCollage a;
                final CollageController b;

                public Void a()
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.controller.CollageController.a(b).a(a.s());
                    com.cardinalblue.android.piccollage.view.k k1;
                    for (Iterator iterator1 = a.t().iterator(); iterator1.hasNext(); com.cardinalblue.android.piccollage.controller.CollageController.a(b, k1, false))
                    {
                        k1 = (com.cardinalblue.android.piccollage.view.k)iterator1.next();
                    }

                    String s1 = a.l();
                    if (!TextUtils.isEmpty(s1))
                    {
                        com.cardinalblue.android.piccollage.a.b.b(s1);
                    }
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                b = CollageController.this;
                a = abstractcollage;
                super();
            }
            }, k.a);
        }
        arraylist = new ArrayList();
        a1 = com.cardinalblue.android.piccollage.model.a.a.a(com.cardinalblue.android.b.k.a());
        sqlitedatabase = a1.getReadableDatabase();
        try
        {
            a.a(((AbstractCollage) (obj)).s());
            for (Iterator iterator = ((AbstractCollage) (obj)).t().iterator(); iterator.hasNext(); c((com.cardinalblue.android.piccollage.view.k)iterator.next(), false)) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a1.close();
            return bolts.j.a(((Exception) (obj)));
        }
        arraylist.addAll(a(sqlitedatabase, "images", ((AbstractCollage) (obj)).p()));
        arraylist.addAll(a(sqlitedatabase, "texts", ((AbstractCollage) (obj)).p()));
        obj = bolts.j.a(arraylist).a(new i(a1) {

            final com.cardinalblue.android.piccollage.model.a.a a;
            final CollageController b;

            public Void a(j j1)
                throws Exception
            {
                a.close();
                if (j1.d())
                {
                    throw j1.f();
                } else
                {
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = CollageController.this;
                a = a1;
                super();
            }
        });
        return ((j) (obj));
    }

    public com.cardinalblue.android.piccollage.view.k a(float f1, float f2)
    {
        com.cardinalblue.android.piccollage.view.k k2 = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        com.cardinalblue.android.piccollage.view.k k1 = null;
_L4:
        return k1;
_L2:
        List list;
        d d1;
        int i1;
        list = a.getScraps();
        d1 = c.s();
        if (d1 != null && d1.b().size() != 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        i1 = list.size() - 1;
_L5:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        k2 = (com.cardinalblue.android.piccollage.view.k)list.get(i1);
        k1 = k2;
        if (k2.a(f1, f2)) goto _L4; else goto _L3
_L3:
        i1--;
          goto _L5
        return null;
        i1 = list.size() - 1;
_L9:
        if (i1 < 0) goto _L7; else goto _L6
_L6:
        com.cardinalblue.android.piccollage.view.k k3;
        k3 = (com.cardinalblue.android.piccollage.view.k)list.get(i1);
        if (!k3.a(f1, f2))
        {
            break MISSING_BLOCK_LABEL_211;
        }
        k1 = k3;
        if (k3.t() == -1) goto _L4; else goto _L8
_L8:
        if (!d1.a(k3.t()).a(f1, f2, c.w(), c.v()) || k2 != null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        k1 = k3;
_L10:
        i1--;
        k2 = k1;
          goto _L9
_L7:
        return k2;
        k1 = k2;
          goto _L10
    }

    public com.cardinalblue.android.piccollage.view.k a(k.d d1)
    {
        return a(d1.g(), d1.h());
    }

    public void a(float f1)
    {
        c.a(f1);
        a.a(f1);
    }

    public void a(long l1)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l2 = (l)iterator.next();
            if (l2 instanceof com.cardinalblue.android.piccollage.controller.i)
            {
                ((com.cardinalblue.android.piccollage.controller.i)l2).b((int)l1);
            }
        } while (true);
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void a(d d1, boolean flag)
    {
        c.a(d1);
        a.a(d1);
        if (flag)
        {
            q();
        }
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1)
    {
        this;
        JVM INSTR monitorenter ;
        b(k1, true);
        this;
        JVM INSTR monitorexit ;
        return;
        k1;
        throw k1;
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, int i1)
    {
        b(k1, i1);
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, k.d d1)
    {
        h.a(d1);
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, k.e e1)
    {
        float f1 = k1.P();
        e1.a(k1.K(), k1.L(), true, f1, false, f1, f1, true, k1.Q());
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, k.e e1, k.d d1)
    {
        if (k1.b())
        {
            h.a(d1);
            k1.a(e1);
            k1.a(c.s(), c.w(), c.v(), d1.g(), d1.h());
            c.c();
            a.postInvalidate();
            if (k1 instanceof g)
            {
                ((g)k1).b(d1.g(), d1.h());
            }
        }
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(k1);
        c(k1, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        k1;
        throw k1;
    }

    public volatile void a(Object obj, k.d d1)
    {
        a((com.cardinalblue.android.piccollage.view.k)obj, d1);
    }

    public volatile void a(Object obj, k.e e1)
    {
        a((com.cardinalblue.android.piccollage.view.k)obj, e1);
    }

    public volatile void a(Object obj, k.e e1, k.d d1)
    {
        a((com.cardinalblue.android.piccollage.view.k)obj, e1, d1);
    }

    public void a(String s1)
    {
        c.c(s1);
        try
        {
            a.a(new d(s1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.a(com.cardinalblue.android.piccollage.model.d.a());
        }
    }

    public boolean a(g g1, UndoManager undomanager)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        c c1 = c.g();
        if (c1 == null) goto _L2; else goto _L1
_L1:
        Object obj1 = b(c1);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = new com.cardinalblue.android.piccollage.controller.b(c1, this);
        b.add(obj);
        obj1 = new StringBuilder("#4560 Can't find bg controller");
        ((StringBuilder) (obj1)).append(", collage: ").append(c.t()).append(", controllers: ").append(b);
        com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException(((StringBuilder) (obj1)).toString()));
        if (undomanager == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        undomanager.a("update background");
        obj1 = c1.y();
        ((com.cardinalblue.android.piccollage.controller.b)obj).a(g1.i());
        obj = g1.m();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        c1.a(g1.m().copy(android.graphics.Bitmap.Config.ARGB_8888, false));
_L3:
        c1.a(g1.Q());
        c1.c(g1.j());
        r();
        if (undomanager == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        undomanager.a(new ScrapUpdateOp(((com.cardinalblue.android.piccollage.model.gson.BaseScrapModel) (obj1)), c1.y(), 4));
        undomanager.d();
        flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        com.cardinalblue.android.piccollage.a.f.a(outofmemoryerror);
          goto _L3
        g1;
        throw g1;
_L2:
        g1 = g1.A();
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        if (undomanager == null)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        undomanager.a("update background");
        undomanager.a(new ScrapUpdateOp(Collage.d("assets://backgrounds/default.png").y(), g1.y(), 4));
        undomanager.d();
        a(((com.cardinalblue.android.piccollage.view.k) (g1)), false);
        flag = true;
          goto _L4
        com.cardinalblue.android.b.k.a(a.getContext(), 0x7f0700d5, 0);
          goto _L4
    }

    public float b()
    {
        Iterator iterator = b.iterator();
        float f1 = 0.0F;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l1 = (l)iterator.next();
            if (l1 instanceof com.cardinalblue.android.piccollage.controller.i)
            {
                float f2 = ((com.cardinalblue.android.piccollage.controller.i)l1).g();
                if (f2 > 0.0F && f2 > f1)
                {
                    f1 = f2;
                }
            }
        } while (true);
        return Math.min(Math.max(f1, 3F), 6F);
    }

    public l b(com.cardinalblue.android.piccollage.view.k k1)
    {
        Iterator iterator;
        if (b == null)
        {
            return null;
        }
        iterator = b.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        l l1 = (l)iterator.next();
        if (!l1.j().equals(k1)) goto _L4; else goto _L3
_L3:
        k1 = l1;
_L6:
        return k1;
_L2:
        k1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object b(float f1, float f2)
    {
        return a(f1, f2);
    }

    public Object b(k.d d1)
    {
        return a(d1);
    }

    public void b(int i1, int j1)
    {
        if (i1 > 0 && j1 > 0)
        {
            c.a(i1, j1);
        }
    }

    public void b(com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(k1, flag);
        k(k1);
        if (k1 instanceof c)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("unpredictable background deletion").append(", background: ").append(k1).append(", stack trace: ").append(Thread.currentThread().getStackTrace());
            com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException(stringbuilder.toString()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        k1;
        throw k1;
    }

    public boolean b(com.cardinalblue.android.piccollage.view.k k1, int i1)
    {
        List list;
        if (-1 == i1 || !k1.a() || a == null)
        {
            return false;
        }
        list = a(i1);
        k1.c(i1);
        if (k1.u() == -1 || !a(k1.u()).isEmpty() || list.size() != 1) goto _L2; else goto _L1
_L1:
        a.a(k1, true, false);
        ((com.cardinalblue.android.piccollage.view.k)list.get(0)).c(k1.u());
        a.a((com.cardinalblue.android.piccollage.view.k)list.get(0), true, true);
_L4:
        k1.d(i1);
        c.c();
        a.postInvalidate();
        return true;
_L2:
        int j1 = list.size();
        if (j1 == 0)
        {
            a.a(k1, true, false);
        } else
        if (j1 == 1 && list.contains(k1))
        {
            boolean flag = k1.af();
            a.a(k1, flag, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void c()
    {
        b.clear();
        d = null;
        a = null;
        f.set(true);
    }

    public void c(int i1, int j1)
    {
        r();
        int k1 = c.v();
        c.a(i1);
        c.b(j1);
        if (i1 > 0 && j1 > 0)
        {
            c.a(i1, j1);
        }
        d(k1, j1);
    }

    public void c(com.cardinalblue.android.piccollage.view.k k1, int i1)
    {
        if (k1 == null)
        {
            return;
        } else
        {
            k1.c(i1);
            a.a(k1, true, false);
            k1.d(i1);
            return;
        }
    }

    public boolean c(com.cardinalblue.android.piccollage.view.k k1)
    {
        int j1;
        if (!f.get())
        {
            if ((j1 = l(k1)) != -1)
            {
                if (k1.t() != -1)
                {
                    b(k1, k1.t());
                }
                k1.h(1);
                com.cardinalblue.android.piccollage.a.b.ac();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    k1 = ((l)b.get(i1)).j();
                    k1.h(k1.W() + 1);
                }

                c.c();
                i();
                return true;
            }
        }
        return false;
    }

    public SwapFrameOp d(com.cardinalblue.android.piccollage.view.k k1, int i1)
    {
        Object obj = a(i1);
        if (k1.u() != -1 && a(k1.u()).isEmpty() && ((List) (obj)).size() == 1)
        {
            obj = (com.cardinalblue.android.piccollage.view.k)((List) (obj)).get(0);
            return new SwapFrameOp(new com.cardinalblue.android.piccollage.activities.undo.SwapFrameOp.SwapUnit(k1.U(), ((com.cardinalblue.android.piccollage.view.k) (obj)).U(), k1.u(), i1), new com.cardinalblue.android.piccollage.activities.undo.SwapFrameOp.SwapUnit(k1.U(), ((com.cardinalblue.android.piccollage.view.k) (obj)).U(), i1, k1.u()));
        } else
        {
            return new SwapFrameOp(new com.cardinalblue.android.piccollage.activities.undo.SwapFrameOp.SwapUnit(k1.U(), i1), new com.cardinalblue.android.piccollage.activities.undo.SwapFrameOp.SwapUnit(k1.U(), k1.t()));
        }
    }

    public void d()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l1 = (l)iterator.next();
            if (l1 instanceof com.cardinalblue.android.piccollage.controller.i)
            {
                ((com.cardinalblue.android.piccollage.controller.i)l1).a(0);
            }
        } while (true);
    }

    public boolean d(com.cardinalblue.android.piccollage.view.k k1)
    {
        if (f.get())
        {
            return false;
        }
        c.c();
        if (k1.t() == -1) goto _L2; else goto _L1
_L1:
        Object obj = a(k1.t());
        if (((List) (obj)).size() <= 1) goto _L4; else goto _L3
_L3:
        int i1;
        i1 = k1.W();
        obj = ((List) (obj)).iterator();
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        if (((com.cardinalblue.android.piccollage.view.k)((Iterator) (obj)).next()).W() <= i1) goto _L8; else goto _L7
_L7:
        boolean flag = true;
_L11:
        if (!flag)
        {
            k1.d(-1);
            k1.c(-1);
        }
_L9:
        e(k1);
_L2:
        k1.h(j() + 1);
        if (a.a(k1))
        {
            a.a(k1, false);
        }
        Collections.sort(b, new Comparator() {

            final CollageController a;

            public int a(l l1, l l2)
            {
                return l1.j().W() - l2.j().W();
            }

            public int compare(Object obj1, Object obj2)
            {
                return a((l)obj1, (l)obj2);
            }

            
            {
                a = CollageController.this;
                super();
            }
        });
        return true;
_L4:
        k1.d(k1.t());
        k1.c(-1);
        if (true) goto _L9; else goto _L6
_L6:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void e()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l1 = (l)iterator.next();
            if (l1 instanceof com.cardinalblue.android.piccollage.controller.i)
            {
                ((com.cardinalblue.android.piccollage.controller.i)l1).h();
            }
        } while (true);
    }

    public boolean e(com.cardinalblue.android.piccollage.view.k k1)
    {
        return b(k1, k1.t());
    }

    public void f()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l1 = (l)iterator.next();
            if (l1 instanceof com.cardinalblue.android.piccollage.controller.i)
            {
                ((com.cardinalblue.android.piccollage.controller.i)l1).i();
            }
        } while (true);
    }

    public void f(com.cardinalblue.android.piccollage.view.k k1)
    {
        for (Iterator iterator = c.t().iterator(); iterator.hasNext();)
        {
            com.cardinalblue.android.piccollage.view.k k2 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if (k2 != k1 && k2.t() == k1.t())
            {
                return;
            }
        }

        k1.d(k1.t());
    }

    public void g()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((l)iterator.next()).c()) { }
        b.clear();
        d = null;
        a = null;
        f.set(true);
    }

    public boolean g(com.cardinalblue.android.piccollage.view.k k1)
    {
        if (k1 == null)
        {
            return false;
        }
        Iterator iterator = c.t().iterator();
        int i1 = 0x7fffffff;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.view.k k2 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if (!(k2 instanceof c) && k2.W() < i1)
            {
                i1 = k2.W();
            }
        } while (true);
        if (i1 == 0x7fffffff)
        {
            return true;
        }
        boolean flag;
        if (i1 == k1.W())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public void h()
    {
        if (f.get())
        {
            return;
        } else
        {
            a.d();
            return;
        }
    }

    public void h(com.cardinalblue.android.piccollage.view.k k1)
        throws IOException, InterruptedException
    {
        k1 = b(k1);
        if (k1 == null)
        {
            com.cardinalblue.android.piccollage.a.f.a(new NullPointerException("could not found the scrap controller"));
            return;
        }
        if (!(k1 instanceof com.cardinalblue.android.piccollage.controller.i))
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException("saveResourceForScrap only accept ImageScrap for now."));
            return;
        } else
        {
            k1.b().g();
            return;
        }
    }

    public void i()
    {
        a.c();
        Collections.sort(b, new Comparator() {

            final CollageController a;

            public int a(l l1, l l2)
            {
                return l1.j().W() - l2.j().W();
            }

            public int compare(Object obj, Object obj1)
            {
                return a((l)obj, (l)obj1);
            }

            
            {
                a = CollageController.this;
                super();
            }
        });
    }

    public void i(com.cardinalblue.android.piccollage.view.k k1)
    {
        float f1 = (float)Math.min(c.w(), c.v()) / ((float)Math.max(k1.S(), k1.T()) * 2.0F);
        float f2 = ((float)k1.S() * f1) / 2.0F + 100F;
        float f3 = ((float)k1.T() * f1) / 2.0F + 100F;
        k1.a(com.cardinalblue.android.b.k.a(f2, (float)c.w() - f2), com.cardinalblue.android.b.k.a(f3, (float)c.v() - f3), f1, com.cardinalblue.android.b.k.a(-0.1745329F, 0.1745329F));
    }

    public int j()
    {
        Iterator iterator = b.iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l1 = (l)iterator.next();
            if (l1.j().W() > i1)
            {
                i1 = l1.j().W();
            }
        } while (true);
        return i1;
    }

    public boolean k()
    {
        for (Iterator iterator = c.t().iterator(); iterator.hasNext();)
        {
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if ((k1 instanceof g) && ((g)k1).g())
            {
                return true;
            }
        }

        return false;
    }

    public boolean l()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (!((l)iterator.next()).d())
            {
                return false;
            }
        }

        return true;
    }

    public j m()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            l l1 = (l)iterator.next();
            if (!l1.d())
            {
                arraylist.add(l1.b());
            }
        } while (true);
        return bolts.j.a(arraylist);
    }

    public int n()
    {
        if (c.g() == null)
        {
            return c.t().size();
        } else
        {
            return c.t().size() - 1;
        }
    }

    public UpdateTapAnywhereEvent produceUpdateTapEvent()
    {
        boolean flag;
        if (b.size() <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new UpdateTapAnywhereEvent(flag);
    }
}
