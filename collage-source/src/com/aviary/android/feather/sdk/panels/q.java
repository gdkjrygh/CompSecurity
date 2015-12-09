// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.aviary.android.feather.cds.h;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.library.d.a;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.filters.StickerFilter;
import com.aviary.android.feather.library.graphics.a.e;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.DragControllerService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.library.services.PreferenceService;
import com.aviary.android.feather.library.services.drag.DragView;
import com.aviary.android.feather.sdk.overlays.AviaryOverlay;
import com.aviary.android.feather.sdk.overlays.StickersOverlay;
import com.aviary.android.feather.sdk.widget.ImageViewDrawableOverlay;
import com.aviary.android.feather.sdk.widget.d;
import com.aviary.android.feather.sdk.widget.f;
import com.nineoldandroids.a.k;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.picasso.Picasso;
import it.sephiroth.android.library.picasso.n;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a, o

public class q extends com.aviary.android.feather.sdk.panels.a
    implements android.support.v4.content.Loader.OnLoadCompleteListener, com.aviary.android.feather.library.services.DragControllerService.a, com.aviary.android.feather.library.services.DragControllerService.b, com.aviary.android.feather.library.services.drag.a.a, o.a, it.sephiroth.android.library.widget.AdapterView.c
{
    static class a
    {

        String a;
        String b;

        a(String s1, String s2)
        {
            a = s1;
            b = s2;
        }
    }

    static class b
    {

        long a;
        String b;

        b(long l, String s1)
        {
            a = l;
            b = s1;
        }
    }

    class c extends CursorAdapter
    {

        int a;
        int b;
        int c;
        int d;
        final q e;
        private int f;
        private int g;
        private int h;
        private LayoutInflater i;

        private View a(Context context, Cursor cursor, ViewGroup viewgroup, int j)
        {
            int l;
            int i1;
            int j1;
            l = -2;
            i1 = com.aviary.android.feather.sdk.panels.q.c(e);
            j1 = getItemViewType(j);
            j1;
            JVM INSTR tableswitch 1 6: default 60
        //                       1 417
        //                       2 391
        //                       3 443
        //                       4 463
        //                       5 194
        //                       6 236;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L5:
            break MISSING_BLOCK_LABEL_463;
_L1:
            e.q.d("TYPE_NORMAL");
            context = null;
            j = i1;
_L8:
            context.setLayoutParams(new android.view.ViewGroup.LayoutParams(j, -1));
            View view;
            if (j1 == 1)
            {
                cursor = new f.e();
            } else
            {
                cursor = new f.d();
            }
            cursor.c = j1;
            cursor.b = (ImageView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
            cursor.a = (TextView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_text);
            if (((f.d) (cursor)).b != null)
            {
                viewgroup = ((f.d) (cursor)).b.getLayoutParams();
                viewgroup.height = com.aviary.android.feather.sdk.panels.q.d(e);
                viewgroup.width = com.aviary.android.feather.sdk.panels.q.d(e);
                ((f.d) (cursor)).b.setLayoutParams(viewgroup);
            }
            context.setTag(cursor);
            return context;
_L6:
            context = i.inflate(h, viewgroup, false);
            ((ImageView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image)).setImageResource(com.aviary.android.feather.sdk.R.drawable.aviary_sticker_item_getmore);
            j = com.aviary.android.feather.sdk.panels.q.c(e);
              goto _L8
_L7:
            view = i.inflate(h, viewgroup, false);
            ((ImageView)view.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image)).setImageResource(com.aviary.android.feather.sdk.R.drawable.aviary_sticker_item_getmore);
            l = com.aviary.android.feather.sdk.panels.q.c(e);
            if (com.aviary.android.feather.sdk.panels.q.c(e) * cursor.getCount() < viewgroup.getWidth() * 2)
            {
                view.setVisibility(4);
                j = 1;
                context = view;
            } else
            {
                j = l;
                context = view;
                if (viewgroup.getChildCount() > 0)
                {
                    j = l;
                    context = view;
                    if (com.aviary.android.feather.sdk.panels.q.a(e).getFirstVisiblePosition() == 0)
                    {
                        j = l;
                        context = view;
                        if (viewgroup.getChildAt(viewgroup.getChildCount() - 1).getRight() < viewgroup.getWidth())
                        {
                            view.setVisibility(4);
                            j = 1;
                            context = view;
                        }
                    }
                }
            }
              goto _L8
_L3:
            context = i.inflate(f, viewgroup, false);
            j = com.aviary.android.feather.sdk.panels.q.c(e);
              goto _L8
_L2:
            context = i.inflate(g, viewgroup, false);
            j = com.aviary.android.feather.sdk.panels.q.c(e);
              goto _L8
_L4:
            context = i.inflate(com.aviary.android.feather.sdk.R.layout.aviary_thumb_divider_right, viewgroup, false);
            j = l;
              goto _L8
            view = i.inflate(com.aviary.android.feather.sdk.R.layout.aviary_thumb_divider_left, viewgroup, false);
            if (com.aviary.android.feather.sdk.panels.q.c(e) * cursor.getCount() < viewgroup.getWidth() * 2)
            {
                view.setVisibility(4);
                j = 1;
                context = view;
            } else
            {
                j = l;
                context = view;
                if (viewgroup.getChildCount() > 0)
                {
                    j = l;
                    context = view;
                    if (com.aviary.android.feather.sdk.panels.q.a(e).getFirstVisiblePosition() == 0)
                    {
                        j = l;
                        context = view;
                        if (viewgroup.getChildAt(viewgroup.getChildCount() - 1).getRight() < viewgroup.getWidth())
                        {
                            view.setVisibility(4);
                            j = 1;
                            context = view;
                        }
                    }
                }
            }
              goto _L8
        }

        private void a(Cursor cursor)
        {
            if (cursor != null)
            {
                a = cursor.getColumnIndex("packagename");
                b = cursor.getColumnIndex("displayName");
                c = cursor.getColumnIndex("path");
                d = cursor.getColumnIndex("isFree");
            }
        }

        void a(View view, Context context, Cursor cursor, int j)
        {
            long l;
            view = (f.d)view.getTag();
            long l1 = -1L;
            l = l1;
            if (!cursor.isAfterLast())
            {
                l = l1;
                if (!cursor.isBeforeFirst())
                {
                    l = cursor.getLong(0);
                }
            }
            if (((f.d) (view)).c != 0) goto _L2; else goto _L1
_L1:
            view.d = l;
            return;
_L2:
            if (((f.d) (view)).c == 1)
            {
                context = (f.e)view;
                String s1 = cursor.getString(3);
                String s3 = cursor.getString(b);
                String s4 = cursor.getString(c);
                j = cursor.getInt(d);
                ((f.d) (view)).a.setText(s3);
                view.e = s1;
                context.h = j;
                if (((f.d) (view)).d != l)
                {
                    com.aviary.android.feather.sdk.panels.q.e(e).a(s4).a(com.aviary.android.feather.sdk.panels.q.d(e), com.aviary.android.feather.sdk.panels.q.d(e), true).a((new com.aviary.android.feather.sdk.utils.b.a()).a(e.B().a().getResources()).a(com.aviary.android.feather.cds.a.b.c).a(s4).c()).d().a(com.aviary.android.feather.sdk.R.drawable.aviary_ic_na).a(((f.d) (view)).b);
                }
            } else
            if (((f.d) (view)).c == 2)
            {
                context = cursor.getString(b);
                String s2 = cursor.getString(3);
                cursor = cursor.getString(c);
                ((f.d) (view)).a.setText(context);
                view.e = s2;
                view.f = cursor;
                view.g = com.aviary.android.feather.sdk.panels.q.f(e).contains(Long.valueOf(l));
                if (((f.d) (view)).d != l)
                {
                    com.aviary.android.feather.sdk.panels.q.a(e, view, l);
                } else
                {
                    e.q.c("icon already loaded...");
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void bindView(View view, Context context, Cursor cursor)
        {
        }

        public int getItemViewType(int j)
        {
            Cursor cursor = (Cursor)getItem(j);
            if (cursor != null)
            {
                return cursor.getInt(4);
            } else
            {
                return -1;
            }
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            if (!mDataValid)
            {
                throw new IllegalStateException("this should only be called when the cursor is valid");
            }
            View view1 = view;
            if (view == null)
            {
                view1 = a(mContext, mCursor, viewgroup, j);
            }
            a(view1, mContext, mCursor, j);
            return view1;
        }

        public int getViewTypeCount()
        {
            return 7;
        }

        public boolean hasStableIds()
        {
            return true;
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            return null;
        }

        public Cursor swapCursor(Cursor cursor)
        {
            e.q.b("swapCursor");
            a(cursor);
            return super.swapCursor(cursor);
        }

        public c(Context context, int j, int l, int i1, Cursor cursor)
        {
            e = q.this;
            super(context, cursor, 0);
            a(cursor);
            f = j;
            g = l;
            h = i1;
            i = LayoutInflater.from(context);
        }
    }

    static class d
        implements Callable
    {

        int a;
        String b;

        public Bitmap a()
            throws Exception
        {
            Object obj = new android.graphics.BitmapFactory.Options();
            obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            obj = BitmapFactory.decodeFile(b, ((android.graphics.BitmapFactory.Options) (obj)));
            if (a > 0 && obj != null)
            {
                Bitmap bitmap = com.aviary.android.feather.library.c.b.a(((Bitmap) (obj)), a, a);
                if (bitmap != obj)
                {
                    ((Bitmap) (obj)).recycle();
                    return bitmap;
                }
            }
            return ((Bitmap) (obj));
        }

        public Object call()
            throws Exception
        {
            return a();
        }

        public d(String s1, int j)
        {
            b = s1;
            a = j;
        }
    }

    class e extends CursorAdapter
    {

        LayoutInflater a;
        int b;
        String c;
        int d;
        int e;
        int f;
        final q g;

        private void a(Cursor cursor)
        {
            if (cursor != null)
            {
                d = cursor.getColumnIndex("item_id");
                e = cursor.getColumnIndex("item_identifier");
                f = cursor.getColumnIndex("item_packId");
            }
        }

        public String a()
        {
            return c;
        }

        public String a(int j)
        {
            return ((Cursor)getItem(j)).getString(e);
        }

        public void a(String s1)
        {
            c = s1;
        }

        public void bindView(View view, Context context, Cursor cursor)
        {
            view = (ImageView)view.findViewById(com.aviary.android.feather.sdk.R.id.image);
            context = cursor.getString(e);
            context = (new StringBuilder()).append(c).append("/").append(com.aviary.android.feather.cds.a.a(context, com.aviary.android.feather.cds.a.b.c, com.aviary.android.feather.cds.a.d.a)).toString();
            com.aviary.android.feather.sdk.panels.q.e(g).a(context).c().a(q.i(g), q.i(g), true).d().a(view);
        }

        public boolean hasStableIds()
        {
            return true;
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            context = a.inflate(b, null);
            context.setLayoutParams(new android.view.ViewGroup.LayoutParams(com.aviary.android.feather.sdk.panels.q.h(g), -1));
            return context;
        }

        public Cursor swapCursor(Cursor cursor)
        {
            a(cursor);
            return super.swapCursor(cursor);
        }

        public e(Context context, int j, Cursor cursor)
        {
            g = q.this;
            super(context, cursor, 0);
            b = j;
            a = LayoutInflater.from(context);
            a(cursor);
        }
    }


    private static final int A;
    private final List B = new ArrayList();
    private final List C = new ArrayList(0);
    private long D;
    private o E;
    private HListView F;
    private HListView G;
    private ViewFlipper H;
    private Picasso I;
    private Canvas J;
    private int K;
    private int L;
    private ConfigService M;
    private DragControllerService N;
    private PreferenceService O;
    private f P;
    private StickerFilter Q;
    private int R;
    private int S;
    private boolean T;
    private b U;
    protected CursorAdapter s;
    protected CursorAdapter t;
    protected CursorLoader u;
    protected ContentObserver v;
    int w;
    int x;
    List y;
    StickersOverlay z;

    public q(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
        T = true;
        w = 0;
        x = 0;
        y = new ArrayList(0);
    }

    private void K()
    {
        q.b("onSendEvents");
        if (B() != null)
        {
            com.aviary.android.feather.common.b.b b1 = B().h();
            Pair pair;
            for (Iterator iterator = y.iterator(); iterator.hasNext(); b1.a("stickers: item_saved", new String[] {
    "pack", (String)pair.first, "item", (String)pair.second
}))
            {
                pair = (Pair)iterator.next();
            }

        }
    }

    private void L()
    {
        if (f != null && !f.isRecycled())
        {
            f.recycle();
            f = null;
        }
        f = com.aviary.android.feather.library.c.b.a(g, android.graphics.Bitmap.Config.ARGB_8888);
        J = new Canvas(f);
    }

    private boolean M()
    {
        b(true);
        if (P != null)
        {
            P.a(true);
            P = null;
            return true;
        } else
        {
            return false;
        }
    }

    private void N()
    {
        q.b("onApplyCurrent");
        if (!O())
        {
            return;
        }
        Object obj = ((ImageViewDrawableOverlay)c).a(0);
        if (obj != null)
        {
            com.aviary.android.feather.library.graphics.a.e e1 = (com.aviary.android.feather.library.graphics.a.e)((com.aviary.android.feather.sdk.widget.d) (obj)).n();
            RectF rectf = ((com.aviary.android.feather.sdk.widget.d) (obj)).c();
            Rect rect = new Rect((int)rectf.left, (int)rectf.top, (int)rectf.right, (int)rectf.bottom);
            Matrix matrix = ((com.aviary.android.feather.sdk.widget.d) (obj)).d();
            Matrix matrix1 = new Matrix(c.getImageMatrix());
            if (matrix1.invert(matrix1));
            int j = J.save(1);
            J.concat(matrix);
            e1.a(false);
            ((com.aviary.android.feather.sdk.widget.d) (obj)).n().setBounds(rect);
            ((com.aviary.android.feather.sdk.widget.d) (obj)).n().draw(J);
            J.restoreToCount(j);
            c.invalidate();
            if (Q != null)
            {
                int l = g.getWidth();
                int i1 = g.getHeight();
                Q.a(rectf.left / (float)l, rectf.top / (float)i1);
                Q.b(rectf.right / (float)l, rectf.bottom / (float)i1);
                Q.a(Math.toRadians(((com.aviary.android.feather.sdk.widget.d) (obj)).i()));
                int j1 = e1.a();
                int k1 = e1.b();
                float f1 = rectf.width() / (float)j1;
                float f2 = rectf.height() / (float)k1;
                Q.c(rectf.centerX() / (float)l, rectf.centerY() / (float)i1);
                Q.d(f1, f2);
                obj = new com.aviary.android.feather.library.d.c();
                ((com.aviary.android.feather.library.d.c) (obj)).a(e1.d());
                ((com.aviary.android.feather.library.d.c) (obj)).b(e1.c());
                e.b(((com.aviary.android.feather.library.d.c) (obj)));
                e.e().a(Q.a().a(0));
                w = w + 1;
                y.add(Pair.create(e1.d(), e1.c()));
                Q = null;
            }
        }
        d(false);
        a(f, false, false);
    }

    private boolean O()
    {
        return ((ImageViewDrawableOverlay)c).getHighlightCount() > 0;
    }

    static long a(q q1, long l)
    {
        q1.D = l;
        return l;
    }

    private c a(Context context, Cursor cursor)
    {
        return new c(context, com.aviary.android.feather.sdk.R.layout.aviary_sticker_item, com.aviary.android.feather.sdk.R.layout.aviary_effect_item_external, com.aviary.android.feather.sdk.R.layout.aviary_effect_item_more, cursor);
    }

    static HListView a(q q1)
    {
        return q1.F;
    }

    private void a(long l, String s1)
    {
        q.c("onStickerPackSelected: %d, %s", new Object[] {
            Long.valueOf(l), s1
        });
        C.remove(Long.valueOf(l));
        M();
        U = new b(l, s1);
        E.a(2);
    }

    private void a(Cursor cursor, int j, boolean flag, boolean flag1)
    {
        q.c("onStickersPackListUpdated. firstIndex: %d, force: %b, smooth: %b", new Object[] {
            Integer.valueOf(j), Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        if (j <= 0)
        {
            j = 0;
        }
        if ((T || flag) && j > 0)
        {
            if (flag1)
            {
                F.a(j - 1, K / 2, 500);
            }
            F.f(j - 1, K / 2);
        }
        T = false;
    }

    private void a(com.aviary.android.feather.library.graphics.a.d d1, RectF rectf)
    {
        q.b((new StringBuilder()).append("addSticker: ").append(d1).append(", position: ").append(rectf).toString());
        com.aviary.android.feather.sdk.widget.d d2 = new com.aviary.android.feather.sdk.widget.d(c, ((ImageViewDrawableOverlay)c).getOverlayStyleId(), d1);
        d2.a(new com.aviary.android.feather.sdk.widget.d.b() {

            final q a;

            public void a()
            {
                com.aviary.android.feather.sdk.panels.q.a(a, true);
            }

            
            {
                a = q.this;
                super();
            }
        });
        Matrix matrix = c.getImageViewMatrix();
        int k1 = c.getWidth();
        int l1 = c.getHeight();
        int j;
        int l;
        int i1;
        int j1;
        if (rectf != null)
        {
            l = (int)rectf.width();
            j = (int)rectf.height();
        } else
        {
            l = (int)d1.k();
            j = (int)d1.j();
        }
        j1 = j;
        i1 = l;
        d1 = rectf;
        if (Math.max(l, j) > Math.min(c.getWidth(), c.getHeight()))
        {
            float f1 = (float)c.getWidth() / (float)l;
            float f2 = (float)c.getHeight() / (float)j;
            if (f1 >= f2)
            {
                f1 = f2;
            }
            i1 = (int)((float)l * (f1 / 2.0F));
            j1 = (int)((float)j * (f1 / 2.0F));
            d1 = rectf;
            if (rectf == null)
            {
                j = c.getWidth();
                l = c.getHeight();
                d1 = new RectF(j / 2 - i1 / 2, l / 2 - j1 / 2, j / 2 + i1 / 2, l / 2 + j1 / 2);
            }
            d1.inset((d1.width() - (float)i1) / 2.0F, (d1.height() - (float)j1) / 2.0F);
        }
        if (d1 != null)
        {
            l = (int)((RectF) (d1)).left;
            j = (int)((RectF) (d1)).top;
        } else
        {
            l = (k1 - i1) / 2;
            j = (l1 - j1) / 2;
        }
        d1 = new Matrix(matrix);
        d1.invert(d1);
        rectf = new float[4];
        rectf[0] = l;
        rectf[1] = j;
        rectf[2] = l + i1;
        rectf[3] = j + j1;
        com.aviary.android.feather.library.c.f.a(d1, rectf);
        d1 = new RectF(rectf[0], rectf[1], rectf[2], rectf[3]);
        rectf = new Rect(0, 0, k1, l1);
        d2.a(B().a(), matrix, rectf, d1, false);
        ((ImageViewDrawableOverlay)c).a(d2);
        ((ImageViewDrawableOverlay)c).setSelectedHighlightView(d2);
        x = x + 1;
    }

    private void a(f.d d1)
    {
        if (d1 == null || d1.b == null)
        {
            return;
        } else
        {
            com.nineoldandroids.view.a.b(d1.b, d1.b.getWidth() / 2);
            com.nineoldandroids.view.a.c(d1.b, d1.b.getHeight() / 2);
            com.nineoldandroids.a.c c1 = new com.nineoldandroids.a.c();
            c1.c(100L);
            c1.a(new DecelerateInterpolator(1.0F));
            c1.a(new com.nineoldandroids.a.a[] {
                k.a(d1.b, "alpha", new float[] {
                    0.0F, 1.0F
                }), k.a(d1.b, "scaleX", new float[] {
                    0.3F, 1.0F
                }), k.a(d1.b, "scaleY", new float[] {
                    0.3F, 1.0F
                })
            });
            d1 = k.a(d1.b, "rotation", new float[] {
                0.0F, 3F
            });
            d1.b(400L);
            d1.a(new CycleInterpolator(3F));
            com.nineoldandroids.a.c c2 = new com.nineoldandroids.a.c();
            c2.b(new com.nineoldandroids.a.a[] {
                c1, d1
            });
            c2.a(100L);
            c2.a();
            return;
        }
    }

    private void a(f.d d1, long l)
    {
        q.c("loadStickerPackIcon, %d (%s) = is new: %b", new Object[] {
            Long.valueOf(l), d1.e, Boolean.valueOf(C.contains(Long.valueOf(l)))
        });
        if (d1 != null && d1.f != null)
        {
            boolean flag;
            if (D == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q.b("shouldShake: %b, lastInstalledPack: %d, id: %d", new Object[] {
                Boolean.valueOf(flag), Long.valueOf(D), Long.valueOf(l)
            });
            if (flag)
            {
                com.nineoldandroids.view.a.a(d1.b, 0.0F);
                com.nineoldandroids.view.a.d(d1.b, 0.0F);
                com.nineoldandroids.view.a.e(d1.b, 0.0F);
            }
            I.a(new File((String)d1.f)).a().a((new com.aviary.android.feather.sdk.utils.b.a()).a(B().a().getResources()).a(com.aviary.android.feather.cds.a.b.c).a((String)d1.f).a(C.contains(Long.valueOf(l))).c()).d().a(com.aviary.android.feather.sdk.R.drawable.aviary_ic_na).a(d1.b, new it.sephiroth.android.library.picasso.c(d1, flag) {

                final f.d a;
                final boolean b;
                final q c;

                public void a()
                {
                    c.q.b("mLastInstalledPack: %d, holder.id: %d", new Object[] {
                        Long.valueOf(q.g(c)), Long.valueOf(a.d)
                    });
                    if (b)
                    {
                        com.aviary.android.feather.sdk.panels.q.a(c, a);
                        com.aviary.android.feather.sdk.panels.q.a(c, -1L);
                    }
                }

                public void b()
                {
                }

            
            {
                c = q.this;
                a = d1;
                b = flag;
                super();
            }
            });
            if (flag)
            {
                D = -1L;
            }
        }
    }

    static void a(q q1, f.d d1)
    {
        q1.a(d1);
    }

    static void a(q q1, f.d d1, long l)
    {
        q1.a(d1, l);
    }

    static void a(q q1, String s1, String s2, RectF rectf)
    {
        q1.a(s1, s2, rectf);
    }

    static void a(q q1, boolean flag)
    {
        q1.d(flag);
    }

    private void a(com.aviary.android.feather.sdk.widget.d d1, boolean flag)
    {
        q.b((new StringBuilder()).append("onClearCurrent. hv=").append(d1).append(", removed=").append(flag).toString());
        if (Q != null)
        {
            Q = null;
        }
        if (d1 != null)
        {
            Object obj = d1.n();
            if (flag && (obj instanceof com.aviary.android.feather.library.graphics.a.e))
            {
                String s1 = ((com.aviary.android.feather.library.graphics.a.e)obj).c();
                obj = ((com.aviary.android.feather.library.graphics.a.e)obj).d();
                HashMap hashmap = new HashMap();
                hashmap.put("item", s1);
                hashmap.put("pack", obj);
                B().h().a("stickers: item_deleted", hashmap);
                int j = y.lastIndexOf(Pair.create(obj, s1));
                if (j > -1)
                {
                    y.remove(j);
                }
            }
        }
        d1.a(null);
        ((ImageViewDrawableOverlay)c).b(d1);
        ((ImageViewDrawableOverlay)c).invalidate();
        if (flag)
        {
            x = x - 1;
        }
    }

    private final void a(com.aviary.android.feather.sdk.widget.f.a a1)
    {
        if (P != null)
        {
            if (P.j())
            {
                P.a(a1);
                b(false);
                return;
            }
            P.a(false);
            P = null;
        }
        a1 = com.aviary.android.feather.sdk.widget.f.a((com.aviary.android.feather.sdk.AviaryMainController.a)B().a(), a1);
        if (a1 != null)
        {
            a1.a(new com.aviary.android.feather.sdk.widget.f.b() {

                final q a;

            
            {
                a = q.this;
                super();
            }
            });
        }
        P = a1;
        b(false);
    }

    private void a(String s1, String s2, RectF rectf)
    {
        q.c("addSticker: %s - %s", new Object[] {
            s1, s2
        });
        N();
        Assert.assertNotNull(U);
        Assert.assertNotNull(s1);
        Object obj = new File(s1, com.aviary.android.feather.cds.a.a(s2, com.aviary.android.feather.cds.a.b.c, com.aviary.android.feather.cds.a.d.b));
        q.a((new StringBuilder()).append("file: ").append(((File) (obj)).getAbsolutePath()).toString());
        if (((File) (obj)).exists())
        {
            obj = new com.aviary.android.feather.library.graphics.a.e(B().a().getResources(), ((File) (obj)).getAbsolutePath(), s2, U.b);
            ((com.aviary.android.feather.library.graphics.a.e) (obj)).setAntiAlias(true);
            Q = new StickerFilter(s1, s2);
            Q.b(((com.aviary.android.feather.library.graphics.a.e) (obj)).a(), ((com.aviary.android.feather.library.graphics.a.e) (obj)).b());
            s1 = new HashMap();
            s1.put("item", s2);
            s1.put("pack", U.b);
            B().h().a("stickers: item_added", s1);
            a(((com.aviary.android.feather.library.graphics.a.d) (obj)), rectf);
            return;
        } else
        {
            q.c("file does not exists");
            Toast.makeText(B().a(), "Error loading the selected sticker", 0).show();
            return;
        }
    }

    private boolean a(long l)
    {
        if (a("quick-packId") || l > -1L)
        {
            if (l <= -1L)
            {
                Bundle bundle = p();
                l = bundle.getLong("quick-packId");
                bundle.remove("quick-packId");
            }
            if (l > -1L)
            {
                a((new com.aviary.android.feather.sdk.widget.f.a.a()).a(l).b(l).a(com.aviary.android.feather.cds.a.b.c).a("shop_details: opened").a("pack", String.valueOf(l)).a("from", "message").a());
                return true;
            }
        }
        return false;
    }

    static boolean a(q q1, int j)
    {
        return q1.b(j);
    }

    static boolean a(q q1, AdapterView adapterview, View view, int j, long l, boolean flag)
    {
        return q1.a(adapterview, view, j, l, flag);
    }

    private boolean a(AdapterView adapterview, View view, int j, long l, boolean flag)
    {
        q.b("startDrag");
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return false;
        }
        if (adapterview == null || view == null || adapterview.getAdapter() == null)
        {
            return false;
        }
        if (E.a() != 2)
        {
            return false;
        }
        if (view != null)
        {
            view = view.findViewById(com.aviary.android.feather.sdk.R.id.image);
            if (view != null)
            {
                if (adapterview.getAdapter() == null)
                {
                    return false;
                }
                Object obj = (e)adapterview.getAdapter();
                if (obj == null)
                {
                    return false;
                }
                adapterview = ((e) (obj)).a(j);
                obj = ((e) (obj)).a();
                if (adapterview == null || obj == null)
                {
                    return false;
                }
                B().h().a("stickers: drag_began", new String[] {
                    "item", adapterview
                });
                Object obj1 = (new StringBuilder()).append(((String) (obj))).append("/").append(com.aviary.android.feather.cds.a.a(adapterview, com.aviary.android.feather.cds.a.b.c, com.aviary.android.feather.cds.a.d.a)).toString();
                boolean flag1;
                try
                {
                    obj1 = (new d(((String) (obj1)), S)).a();
                    j = Math.abs(view.getWidth() - ((Bitmap) (obj1)).getWidth()) / 2;
                    int i1 = Math.abs(view.getHeight() - ((Bitmap) (obj1)).getHeight()) / 2;
                    flag1 = G().a(view, ((Bitmap) (obj1)), j, i1, this, new a(((String) (obj)), adapterview), DragControllerService.d, flag);
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                    return G().a(view, this, new a(((String) (obj)), adapterview), DragControllerService.d, flag);
                }
                return flag1;
            }
        }
        return false;
    }

    private void b(int j, int l)
    {
        q.c("createTutorialOverlayIfNecessary: %d, %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(l)
        });
        while (l != 1 || !n() || g() == null) 
        {
            return;
        }
        g().postDelayed(new StickersPanel._cls1(j), 200L);
    }

    private boolean b(int j)
    {
        q.c("createTutorialOverlayIfNecessaryDelayed: %d", new Object[] {
            Integer.valueOf(j)
        });
        break MISSING_BLOCK_LABEL_23;
_L5:
        if (j >= j1) goto _L2; else goto _L1
_L1:
        obj2 = F.getChildAt(j);
        obj1 = obj;
        i1 = l;
        flag1 = flag;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj2 = ((View) (obj2)).getTag();
        obj1 = obj;
        i1 = l;
        flag1 = flag;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj1 = obj;
        i1 = l;
        flag1 = flag;
        if (!(obj2 instanceof f.d))
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj2 = (f.d)obj2;
        if (((f.d) (obj2)).c != 2) goto _L4; else goto _L3
_L3:
        boolean flag2 = false;
_L7:
        if (!flag || l <= -1 || obj == null)
        {
            flag2 = false;
        }
        q.b("shouldProceed: %b", new Object[] {
            Boolean.valueOf(flag2)
        });
        if (!flag2)
        {
            if (z != null)
            {
                z.h();
                return false;
            }
        } else
        {
            q.b("free item index: %d", new Object[] {
                Integer.valueOf(l)
            });
            if (z == null)
            {
                if (AviaryOverlay.b(B(), 1))
                {
                    z = new StickersOverlay(B().b(), com.aviary.android.feather.sdk.R.style.AviaryWidget_Overlay_Stickers, ((View) (obj)));
                    return z.g();
                }
            } else
            {
                z.a(((View) (obj)));
                return false;
            }
        }
        do
        {
            return false;
        } while (!n() || E.a() != 1);
        j1 = F.getChildCount();
        obj = null;
        q.b("count: %d", new Object[] {
            Integer.valueOf(j1)
        });
        j = 0;
        flag = false;
        l = -1;
          goto _L5
_L4:
        obj1 = obj;
        i1 = l;
        flag1 = flag;
        if (((f.d) (obj2)).c == 1)
        {
            obj1 = (f.e)obj2;
            if (((f.e) (obj1)).h == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                obj = ((f.e) (obj1)).b;
                l = j;
            }
            q.b("%d = %s, free = %d", new Object[] {
                Integer.valueOf(j), ((f.e) (obj1)).e, Integer.valueOf(((f.e) (obj1)).h)
            });
            i1 = l;
            obj1 = obj;
        }
        j++;
        flag = flag1;
        obj = obj1;
        l = i1;
          goto _L5
_L2:
        flag2 = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean b(q q1)
    {
        return q1.M();
    }

    static int c(q q1)
    {
        return q1.K;
    }

    static int d(q q1)
    {
        return q1.R;
    }

    private void d(boolean flag)
    {
        q.b((new StringBuilder()).append("onClearCurrent. removed=").append(flag).toString());
        if (O())
        {
            a(((ImageViewDrawableOverlay)c).a(0), flag);
        }
    }

    static Picasso e(q q1)
    {
        return q1.I;
    }

    static List f(q q1)
    {
        return q1.C;
    }

    static long g(q q1)
    {
        return q1.D;
    }

    static int h(q q1)
    {
        return q1.L;
    }

    static int i(q q1)
    {
        return q1.S;
    }

    public void A()
    {
        super.A();
        if (z != null)
        {
            z.i();
            z = null;
        }
        if (G() != null)
        {
            G().b();
            G().b((com.aviary.android.feather.library.services.drag.a)c);
            G().a(null);
        }
        a(((com.aviary.android.feather.library.services.a) (null)));
        if (s != null)
        {
            s.changeCursor(null);
        }
        if (t != null)
        {
            t.changeCursor(null);
        }
        F.setAdapter(null);
        G.setAdapter(null);
        E.a(null);
        F.setOnItemClickListener(null);
        G.setOnItemClickListener(null);
        G.setOnItemLongClickListener(null);
        M();
        Context context = B().a();
        if (v != null)
        {
            context.getContentResolver().unregisterContentObserver(v);
        }
        if (u != null)
        {
            q.b("stop load cursorloader...");
            u.unregisterListener(this);
            u.stopLoading();
        }
    }

    protected void F()
    {
        N();
        K();
        super.a(e);
    }

    public com.aviary.android.feather.library.services.a G()
    {
        return N.a();
    }

    void H()
    {
        (new android.app.AlertDialog.Builder(B().a())).setTitle(com.aviary.android.feather.sdk.R.string.feather_attention).setMessage(com.aviary.android.feather.sdk.R.string.feather_tool_leave_question).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener() {

            final q a;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                a.B().e();
            }

            
            {
                a = q.this;
                super();
            }
        }).setNegativeButton(0x1040009, null).show();
    }

    protected void I()
    {
        q.b("updateInstalledPacks");
        if (H.getDisplayedChild() != 0)
        {
            H.setDisplayedChild(0);
        }
        s = a(B().a(), ((Cursor) (null)));
        F.setAdapter(s);
        Context context = B().a();
        if (u == null)
        {
            u = new CursorLoader(context, com.aviary.android.feather.common.utils.f.a(context, String.format(Locale.US, "packTray/%d/%d/%d/%s", new Object[] {
                Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), "sticker"
            })), null, null, null, null);
            u.registerListener(1, this);
            v = new ContentObserver(new Handler()) {

                final q a;

                public void onChange(boolean flag)
                {
                    a.q.b("mContentObserver::onChange");
                    super.onChange(flag);
                    if (a.n() && a.u != null && a.u.isStarted())
                    {
                        a.u.onContentChanged();
                    }
                }

            
            {
                a = q.this;
                super(handler);
            }
            };
            context.getContentResolver().registerContentObserver(com.aviary.android.feather.common.utils.f.a(context, "packTray/sticker"), false, v);
        }
        u.startLoading();
        F.setOnItemClickListener(this);
    }

    protected void J()
    {
        q.b("loadStickers");
        Context context = B().a();
        if (U != null)
        {
            String s1 = com.aviary.android.feather.cds.h.a(context, U.a);
            Cursor cursor = context.getContentResolver().query(com.aviary.android.feather.common.utils.f.a(context, (new StringBuilder()).append("pack/").append(U.a).append("/item/list").toString()), new String[] {
                "item_id as _id", "item_id", "item_packId", "item_identifier", "item_displayName"
            }, null, null, null);
            if (t == null)
            {
                t = new e(context, com.aviary.android.feather.sdk.R.layout.aviary_sticker_item_single, cursor);
                ((e)t).a(s1);
                G.setAdapter(t);
            } else
            {
                ((e)t).a(s1);
                t.changeCursor(cursor);
            }
            if (com.aviary.android.feather.common.utils.a.a)
            {
                G.setSelection(0);
            }
            G.setOnItemClickListener(new it.sephiroth.android.library.widget.AdapterView.c() {

                final q a;

                public void a(AdapterView adapterview, View view, int i1, long l1)
                {
                    a.q.b((new StringBuilder()).append("onItemClick: ").append(i1).toString());
                    adapterview = (e)adapterview.getAdapter();
                    view = (Cursor)adapterview.getItem(i1);
                    view = view.getString(view.getColumnIndex("item_identifier"));
                    com.aviary.android.feather.sdk.panels.q.b(a);
                    com.aviary.android.feather.sdk.panels.q.a(a, adapterview.a(), view, null);
                }

            
            {
                a = q.this;
                super();
            }
            });
            G.setOnItemLongClickListener(new it.sephiroth.android.library.widget.AdapterView.d() {

                final q a;

                public boolean a(AdapterView adapterview, View view, int i1, long l1)
                {
                    return com.aviary.android.feather.sdk.panels.q.a(a, adapterview, view, i1, l1, false);
                }

            
            {
                a = q.this;
                super();
            }
            });
            if (a("quick-contentId"))
            {
                q.b("hasOptions: Constants.QuickLaunch.CONTENT_VALUE");
                Bundle bundle = p();
                long l = bundle.getLong("quick-contentId", -1L);
                int j = 0;
                do
                {
label0:
                    {
                        if (j < t.getCount())
                        {
                            if (l != t.getItemId(j))
                            {
                                break label0;
                            }
                            q.b("performClick on : %d", new Object[] {
                                Integer.valueOf(j)
                            });
                            G.a(null, j, l);
                        }
                        bundle.remove("quick-contentId");
                        return;
                    }
                    j++;
                } while (true);
            }
        }
    }

    public void a(int j)
    {
    }

    public void a(int j, int l)
    {
        q.b((new StringBuilder()).append("OnStatusChange: ").append(j).append(" >> ").append(l).toString());
        l;
        JVM INSTR tableswitch 1 2: default 64
    //                   1 104
    //                   2 185;
           goto _L1 _L2 _L3
_L1:
        q.d((new StringBuilder()).append("unmanaged status change: ").append(j).append(" >> ").append(l).toString());
_L5:
        return;
_L2:
        G.setOnItemClickListener(null);
        G.setOnItemLongClickListener(null);
        if (H.getDisplayedChild() != 1)
        {
            H.setDisplayedChild(1);
        }
        if (j != A && j == 2)
        {
            h();
            if (G() != null)
            {
                G().b();
            }
            if (t != null)
            {
                t.changeCursor(null);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        J();
        if (H.getDisplayedChild() != 2)
        {
            H.setDisplayedChild(2);
        }
        if (G() != null)
        {
            G().a();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(Configuration configuration, Configuration configuration1)
    {
        q.b((new StringBuilder()).append("onConfigurationChanged: ").append(configuration).toString());
        if (P != null)
        {
            P.a(configuration);
        }
        super.a(configuration, configuration1);
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        E = new o();
        B.clear();
        C.clear();
        F = (HListView)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_list_packs);
        G = (HListView)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_list_stickers);
        H = (ViewFlipper)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_flipper);
        c = (ImageViewDrawableOverlay)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_overlay);
        M = (ConfigService)B().a(com/aviary/android/feather/library/services/ConfigService);
        O = (PreferenceService)B().a(com/aviary/android/feather/library/services/PreferenceService);
        ((ImageViewDrawableOverlay)c).setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        ((ImageViewDrawableOverlay)c).setForceSingleSelection(false);
        ((ImageViewDrawableOverlay)c).setDropTargetListener(this);
        ((ImageViewDrawableOverlay)c).setScaleWithContent(true);
        e.a(com.aviary.android.feather.headless.moa.c.a());
        I = Picasso.a(B().a());
        L();
        bitmap = (DragControllerService)B().a(com/aviary/android/feather/library/services/DragControllerService);
        bitmap.a((com.aviary.android.feather.library.services.drag.a)c);
        bitmap.a(c);
        bitmap.a(this);
        N = bitmap;
    }

    protected void a(Bitmap bitmap, com.aviary.android.feather.library.d.a a1)
    {
        l.put("item_count", String.valueOf(w));
        super.a(bitmap, a1);
    }

    public void a(Loader loader, Cursor cursor)
    {
        String s1;
        int j;
        int l;
        int i1;
        byte byte0;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        int l1;
        int i2;
        long l2;
        long l4;
        long l5;
        boolean flag4;
        boolean flag5;
        q.b((new StringBuilder()).append("onLoadComplete: ").append(cursor).append(", currentStatus: ").append(E.a()).toString());
        l2 = -1L;
        j1 = -1;
        i1 = -1;
        flag = true;
        byte0 = 1;
        l4 = -1L;
        long l3;
        if (!T && P != null && P.j() && P.k() != null && P.f() != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        k1 = 0;
        q.c("checkFromIap: %b", new Object[] {
            Boolean.valueOf(flag4)
        });
        l3 = l2;
        if (flag4)
        {
            loader = P.f();
            l3 = l2;
            if (loader.b() == loader.a())
            {
                l3 = l2;
                if (loader.b() > -1L)
                {
                    l3 = loader.b();
                }
            }
        }
        if (l3 > -1L)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        D = -1L;
        j = k1;
        l2 = l4;
        if (q())
        {
            j = k1;
            l2 = l4;
            if (T)
            {
                j = k1;
                l2 = l4;
                if (l == 0)
                {
                    loader = p();
                    l2 = loader.getLong("quick-packId", -1L);
                    l4 = loader.getLong("quick-contentId", -1L);
                    q.a("options_pack_id: %s, options_content_id: %s", new Object[] {
                        Long.valueOf(l2), Long.valueOf(l4)
                    });
                    loader.remove("quick-packId");
                    if (l2 > -1L && l4 > -1L)
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                }
            }
        }
        loader = new ArrayList();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        i2 = cursor.getPosition();
        flag1 = false;
        k1 = l;
        flag4 = false;
        l = i1;
        i1 = byte0;
        flag = j;
        byte0 = flag1;
_L11:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        if (cursor.getInt(4) != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        l5 = cursor.getLong(0);
        s1 = cursor.getString(3);
        q.b("%d = %s", new Object[] {
            Long.valueOf(l5), s1
        });
        loader.add(Long.valueOf(l5));
        if (B.contains(Long.valueOf(l5)) || T) goto _L6; else goto _L5
_L5:
        C.add(Long.valueOf(l5));
        q.b("adding %d (%s) to new packs", new Object[] {
            Long.valueOf(l5), s1
        });
        q.a("iapDialogFeaturedId: %d, pack_id: %d", new Object[] {
            Long.valueOf(D), Long.valueOf(l5)
        });
        flag1 = byte0;
        flag2 = flag;
        flag3 = k1;
        flag5 = flag4;
        l4 = l2;
        l1 = i1;
        j = j1;
        if (k1)
        {
            flag1 = byte0;
            flag2 = flag;
            flag3 = k1;
            flag5 = flag4;
            l4 = l2;
            l1 = i1;
            j = j1;
            if (l3 == l5)
            {
                flag1 = byte0;
                flag2 = flag;
                flag3 = k1;
                flag5 = flag4;
                l4 = l2;
                l1 = i1;
                j = j1;
                if (D == -1L)
                {
                    D = l5;
                    j = cursor.getPosition();
                    flag3 = false;
                    flag5 = true;
                    l1 = i1;
                    l4 = l2;
                    flag2 = flag;
                    flag1 = byte0;
                }
            }
        }
_L7:
        byte0 = flag1;
        flag = flag2;
        k1 = ((flag3) ? 1 : 0);
        flag4 = flag5;
        l2 = l4;
        i1 = l1;
        j1 = j;
        if (l == -1)
        {
            l = cursor.getPosition();
            byte0 = flag1;
            flag = flag2;
            k1 = ((flag3) ? 1 : 0);
            flag4 = flag5;
            l2 = l4;
            i1 = l1;
            j1 = j;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = byte0;
        flag2 = flag;
        flag3 = k1;
        flag5 = flag4;
        l4 = l2;
        l1 = i1;
        j = j1;
        if (flag)
        {
            q.a("checking options.. %s", new Object[] {
                s1
            });
            flag1 = byte0;
            flag2 = flag;
            flag3 = k1;
            flag5 = flag4;
            l4 = l2;
            l1 = i1;
            j = j1;
            if (l2 == l5)
            {
                flag1 = byte0;
                flag2 = flag;
                flag3 = k1;
                flag5 = flag4;
                l4 = l2;
                l1 = i1;
                j = j1;
                if (U == null)
                {
                    q.b("found pack to auto-select: %s", new Object[] {
                        s1
                    });
                    j = -1;
                    l4 = -1L;
                    U = new b(cursor.getLong(0), cursor.getString(3));
                    l1 = 2;
                    flag2 = false;
                    flag1 = true;
                    flag3 = k1;
                    flag5 = flag4;
                }
            }
        }
        if (true) goto _L7; else goto _L4
_L4:
        k1 = cursor.getCount();
        cursor.moveToPosition(i2);
        j = i1;
_L9:
        B.clear();
        B.addAll(loader);
        flag = byte0;
        byte byte1 = j;
        i1 = j1;
        if (l == 0)
        {
            flag = byte0;
            byte1 = j;
            i1 = j1;
            if (k1 == 1)
            {
                flag = byte0;
                byte1 = j;
                i1 = j1;
                if (cursor != null)
                {
                    flag = byte0;
                    byte1 = j;
                    i1 = j1;
                    if (E.a() != 2)
                    {
                        i1 = cursor.getPosition();
                        byte0 = j;
                        if (cursor.moveToFirst())
                        {
                            byte0 = j;
                            if (cursor.getInt(4) == 2)
                            {
                                q.a("one pack only, show it");
                                U = new b(cursor.getLong(0), cursor.getString(3));
                                byte0 = 2;
                            }
                        }
                        cursor.moveToPosition(i1);
                        flag = true;
                        i1 = -1;
                        byte1 = byte0;
                    }
                }
            }
        }
        j = E.a();
        q.b("mLastInstalledPack: %d", new Object[] {
            Long.valueOf(D)
        });
        q.b("lastInstalledPackIndex: %d", new Object[] {
            Integer.valueOf(i1)
        });
        q.a((new StringBuilder()).append("currentStatus: ").append(j).toString());
        q.a((new StringBuilder()).append("newStatus: ").append(byte1).toString());
        if (j != 2)
        {
            E.a(byte1);
        }
        s.changeCursor(cursor);
        boolean flag6;
        if (i1 >= 0)
        {
            flag6 = true;
            M();
        } else
        {
            flag6 = false;
            i1 = l;
        }
        a(cursor, i1, flag6, flag4);
        while (a(l2) || flag) 
        {
            return;
        }
        b(i1, E.a());
        return;
_L2:
        byte0 = 0;
        k1 = 0;
        flag4 = false;
        j = ((flag) ? 1 : 0);
        l = i1;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void a(com.aviary.android.feather.library.services.DragControllerService.b b1, Object obj, int j)
    {
        q.c("onDragStart: %s - %s", new Object[] {
            b1, obj
        });
    }

    public void a(com.aviary.android.feather.library.services.a a1)
    {
    }

    public void a(com.aviary.android.feather.library.services.drag.a a1, boolean flag)
    {
    }

    public void a(AdapterView adapterview, View view, int j, long l)
    {
        q.b((new StringBuilder()).append("onItemClick: ").append(j).toString());
        if (z != null)
        {
            z.h();
        }
        break MISSING_BLOCK_LABEL_43;
_L7:
        do
        {
            return;
        } while (!n() || E.a() != 1);
        adapterview = (f.d)view.getTag();
        if (adapterview == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((f.d) (adapterview)).c != 5 && ((f.d) (adapterview)).c != 6) goto _L2; else goto _L1
_L1:
        view = new HashMap();
        view.put("from", com.aviary.android.feather.library.filters.a.a.j.name().toLowerCase(Locale.US));
        if (((f.d) (adapterview)).c != 5) goto _L4; else goto _L3
_L3:
        view.put("side", "left");
_L5:
        B().h().a("shop_list: opened", view);
        a((new com.aviary.android.feather.sdk.widget.f.a.a()).a(com.aviary.android.feather.cds.a.b.c).b(-1L).a());
        return;
_L4:
        if (((f.d) (adapterview)).c == 6)
        {
            view.put("side", "right");
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (((f.d) (adapterview)).c != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        HashMap hashmap = new HashMap();
        hashmap.put("pack", ((f.d) (adapterview)).e);
        hashmap.put("from", "featured");
        B().h().a("shop_details: opened", hashmap);
        a((new com.aviary.android.feather.sdk.widget.f.a.a()).a(com.aviary.android.feather.cds.a.b.c).a(((f.d) (adapterview)).d).b(((f.d) (adapterview)).d).a());
        if (j > 0 && F.getChildCount() > 0)
        {
            j = view.getLeft();
            int i1 = (view.getRight() - j) / 2;
            int j1 = F.getWidth() / 2;
            F.postDelayed(new StickersPanel._cls2(j1 - (j + i1)), 300L);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (((f.d) (adapterview)).c != 2) goto _L7; else goto _L6
_L6:
        a(((f.d) (adapterview)).d, ((f.d) (adapterview)).e);
        if (((f.d) (adapterview)).g)
        {
            adapterview.g = false;
            a(((f.d) (adapterview)), ((f.d) (adapterview)).d);
            return;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(com.aviary.android.feather.library.services.DragControllerService.b b1, int j, int l, int i1, int j1, DragView dragview, Object obj)
    {
        return b1 == this;
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_stickers, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_stickers, viewgroup, false);
    }

    public void b(com.aviary.android.feather.library.services.DragControllerService.b b1, int j, int l, int i1, int j1, DragView dragview, Object obj)
    {
        q.b((new StringBuilder()).append("onDrop. source=").append(b1).append(", dragInfo=").append(obj).toString());
        while (!n() || obj == null || !(obj instanceof a)) 
        {
            return;
        }
        b1 = (a)obj;
        B().h().a("stickers: drag_suceeded");
        N();
        float f1 = dragview.getScaleFactor();
        float f2 = dragview.getWidth();
        float f3 = dragview.getHeight();
        int k1 = (int)(f2 / f1);
        int l1 = (int)(f3 / f1);
        j -= i1;
        l -= j1;
        dragview = new RectF(j, l, k1 + j, l1 + l);
        a(((a) (b1)).a, ((a) (b1)).b, dragview);
    }

    protected void c()
    {
        super.c();
        J = null;
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public void onLoadComplete(Loader loader, Object obj)
    {
        a(loader, (Cursor)obj);
    }

    public boolean t()
    {
        boolean flag;
        flag = false;
        q.b("onBackPressed");
        if (P == null) goto _L2; else goto _L1
_L1:
        if (!P.c()) goto _L4; else goto _L3
_L3:
        flag = true;
_L6:
        return flag;
_L4:
        M();
        return true;
_L2:
        if (z != null && z.n())
        {
            return true;
        }
        if (E.a() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (O())
        {
            H();
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (E.a() == 2)
        {
            int j;
            if (s != null)
            {
                j = s.getCount();
            } else
            {
                j = 0;
            }
            q.b("packsCount: %d", new Object[] {
                Integer.valueOf(j)
            });
            if (j > 1)
            {
                E.a(1);
                return true;
            }
            if (O())
            {
                H();
                return true;
            }
        } else
        {
            return super.t();
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public boolean v()
    {
        q.b("onCancel");
        if (O())
        {
            H();
            return true;
        } else
        {
            return super.v();
        }
    }

    public boolean x()
    {
label0:
        {
            boolean flag1 = false;
            com.aviary.android.feather.common.a.a.c c1 = q;
            StringBuilder stringbuilder = (new StringBuilder()).append("getIsChanged: ");
            boolean flag;
            if (x > 0 || O())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c1.b(stringbuilder.append(flag).toString());
            if (x <= 0)
            {
                flag = flag1;
                if (!O())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public void y()
    {
        super.y();
        y.clear();
        ((ImageViewDrawableOverlay)c).a();
        Q = null;
        if (u != null)
        {
            q.b("disposing cursorloader...");
            u.abandon();
            u.reset();
        }
        if (s != null)
        {
            com.aviary.android.feather.common.utils.d.a(s.getCursor());
        }
        if (t != null)
        {
            com.aviary.android.feather.common.utils.d.a(t.getCursor());
        }
        s = null;
        t = null;
        u = null;
    }

    public void z()
    {
        super.z();
        c.a(f, null, -1F, 8F);
        K = M.g(com.aviary.android.feather.sdk.R.dimen.aviary_sticker_pack_width);
        R = M.g(com.aviary.android.feather.sdk.R.dimen.aviary_sticker_pack_image_width);
        L = M.g(com.aviary.android.feather.sdk.R.dimen.aviary_sticker_single_item_width);
        S = M.g(com.aviary.android.feather.sdk.R.dimen.aviary_sticker_single_item_image_width);
        E.a(this);
        I();
        b().setVisibility(0);
        d();
    }

    static 
    {
        A = com.aviary.android.feather.sdk.panels.o.a;
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/panels/StickersPanel$1

/* anonymous class */
    class StickersPanel._cls1
        implements Runnable
    {

        final int a;
        final q b;

        public void run()
        {
            if (a < 0)
            {
                com.aviary.android.feather.sdk.panels.q.a(b, a);
            }
        }

            
            {
                b = q.this;
                a = j;
                super();
            }
    }


    // Unreferenced inner class com/aviary/android/feather/sdk/panels/StickersPanel$2

/* anonymous class */
    class StickersPanel._cls2
        implements Runnable
    {

        final int a;
        final q b;

        public void run()
        {
            com.aviary.android.feather.sdk.panels.q.a(b).c(-a, 500);
        }

            
            {
                b = q.this;
                a = j;
                super();
            }
    }

}
