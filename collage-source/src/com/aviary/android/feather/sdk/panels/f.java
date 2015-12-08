// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.headless.filters.INativeFilter;
import com.aviary.android.feather.headless.moa.Moa;
import com.aviary.android.feather.headless.moa.MoaResult;
import com.aviary.android.feather.library.c.b;
import com.aviary.android.feather.library.filters.BorderFilter;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.library.services.LocalDataService;
import com.aviary.android.feather.library.services.PreferenceService;
import com.aviary.android.feather.sdk.overlays.AviaryOverlay;
import com.aviary.android.feather.sdk.overlays.FramesOverlay;
import com.aviary.android.feather.sdk.widget.EffectThumbLayout;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.picasso.Picasso;
import it.sephiroth.android.library.picasso.h;
import it.sephiroth.android.library.picasso.n;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            b

public class f extends com.aviary.android.feather.sdk.panels.b
    implements android.support.v4.content.Loader.OnLoadCompleteListener, android.widget.ViewSwitcher.ViewFactory, it.sephiroth.android.library.widget.AdapterView.c, it.sephiroth.android.library.widget.AdapterView.e
{
    class a extends com.aviary.android.feather.common.utils.os.a
    {

        ProgressDialog a;
        final f b;

        protected transient Void a(Void avoid[])
        {
            b.q.c("GenerateResultTask::doInBackground", new Object[] {
                b.c
            });
            for (; b.c.booleanValue(); b.q.a("waiting....")) { }
            return null;
        }

        protected void a()
        {
            a.setTitle(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_loading_title));
            a.setMessage(b.B().a().getString(com.aviary.android.feather.sdk.R.string.feather_effect_loading_message));
            a.setIndeterminate(true);
            a.setCancelable(false);
            a.show();
        }

        protected volatile void a(Object obj)
        {
            a((Void)obj);
        }

        protected void a(Void void1)
        {
            if (b.B().b().isFinishing())
            {
                return;
            }
            if (a.isShowing())
            {
                a.dismiss();
            }
            b.b(b.f);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        a()
        {
            b = f.this;
            super();
            a = new ProgressDialog(b.B().a());
        }
    }

    class b extends CursorAdapter
    {

        Object a;
        LayoutInflater b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        final f o;

        private View a(Context context, Cursor cursor, ViewGroup viewgroup, int i1)
        {
            byte byte0;
            int j1;
            byte0 = -2;
            j1 = getItemViewType(i1);
            j1;
            JVM INSTR tableswitch 1 6: default 52
        //                       1 402
        //                       2 381
        //                       3 428
        //                       4 448
        //                       5 195
        //                       6 264;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L5:
            break MISSING_BLOCK_LABEL_448;
_L1:
            context = b.inflate(c, viewgroup, false);
            i1 = com.aviary.android.feather.sdk.panels.f.b(o);
_L8:
            context.setLayoutParams(new android.view.ViewGroup.LayoutParams(i1, -1));
            if (j1 == 1)
            {
                cursor = new e();
            } else
            {
                cursor = new d();
            }
            cursor.c = j1;
            cursor.b = (ImageView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
            cursor.a = (TextView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_text);
            if (j1 != 2 && ((d) (cursor)).b != null)
            {
                viewgroup = ((d) (cursor)).b.getLayoutParams();
                viewgroup.height = o.u;
                viewgroup.width = o.u;
                ((d) (cursor)).b.setLayoutParams(viewgroup);
            }
            context.setTag(cursor);
            return context;
_L6:
            context = b.inflate(d, viewgroup, false);
            cursor = (ImageView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
            if (com.aviary.android.feather.sdk.panels.f.a(o) == com.aviary.android.feather.cds.a.b.b)
            {
                i1 = com.aviary.android.feather.sdk.R.drawable.aviary_effect_item_getmore;
            } else
            {
                i1 = com.aviary.android.feather.sdk.R.drawable.aviary_frame_item_getmore;
            }
            cursor.setImageResource(i1);
            i1 = com.aviary.android.feather.sdk.panels.f.b(o);
              goto _L8
_L7:
            context = b.inflate(d, viewgroup, false);
            cursor = (ImageView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
            if (com.aviary.android.feather.sdk.panels.f.a(o) == com.aviary.android.feather.cds.a.b.b)
            {
                i1 = com.aviary.android.feather.sdk.R.drawable.aviary_effect_item_getmore;
            } else
            {
                i1 = com.aviary.android.feather.sdk.R.drawable.aviary_frame_item_getmore;
            }
            cursor.setImageResource(i1);
            i1 = com.aviary.android.feather.sdk.panels.f.b(o);
            if (viewgroup.getChildCount() > 0 && o.a.getFirstVisiblePosition() == 0 && viewgroup.getChildAt(viewgroup.getChildCount() - 1).getRight() < viewgroup.getWidth())
            {
                context.setVisibility(4);
                i1 = 1;
            }
              goto _L8
_L3:
            context = b.inflate(f, viewgroup, false);
            i1 = byte0;
              goto _L8
_L2:
            context = b.inflate(e, viewgroup, false);
            i1 = com.aviary.android.feather.sdk.panels.f.b(o);
              goto _L8
_L4:
            context = b.inflate(com.aviary.android.feather.sdk.R.layout.aviary_thumb_divider_right, viewgroup, false);
            i1 = byte0;
              goto _L8
            cursor = b.inflate(com.aviary.android.feather.sdk.R.layout.aviary_thumb_divider_left, viewgroup, false);
            i1 = byte0;
            context = cursor;
            if (viewgroup.getChildCount() > 0)
            {
                i1 = byte0;
                context = cursor;
                if (o.a.getFirstVisiblePosition() == 0)
                {
                    i1 = byte0;
                    context = cursor;
                    if (viewgroup.getChildAt(viewgroup.getChildCount() - 1).getRight() < viewgroup.getWidth())
                    {
                        cursor.setVisibility(4);
                        i1 = 1;
                        context = cursor;
                    }
                }
            }
              goto _L8
        }

        private void a(Cursor cursor)
        {
            if (cursor != null)
            {
                h = cursor.getColumnIndex("_id");
                i = cursor.getColumnIndex("packagename");
                j = cursor.getColumnIndex("identifier");
                k = cursor.getColumnIndex("type");
                l = cursor.getColumnIndex("displayName");
                m = cursor.getColumnIndex("path");
                n = cursor.getColumnIndex("isFree");
                o.q.a((new StringBuilder()).append("mIdColumnIndex: ").append(h).toString());
                o.q.a((new StringBuilder()).append("mPackageNameColumnIndex: ").append(i).toString());
                o.q.a((new StringBuilder()).append("mIdentifierColumnIndex: ").append(j).toString());
                o.q.a((new StringBuilder()).append("mTypeColumnIndex: ").append(k).toString());
                o.q.a((new StringBuilder()).append("mDisplayNameColumnIndex: ").append(l).toString());
                o.q.a((new StringBuilder()).append("mPathColumnIndex: ").append(m).toString());
            }
        }

        protected it.sephiroth.android.library.picasso.f a(long l1, int i1, String s1, String s2)
        {
            return null;
        }

        void a(View view, Context context, Cursor cursor, int i1)
        {
            d d1 = (d)view.getTag();
            String s1;
            String s2;
            long l1;
            boolean flag;
            if (!cursor.isAfterLast() && !cursor.isBeforeFirst())
            {
                l1 = cursor.getLong(h);
            } else
            {
                l1 = -1L;
            }
            flag = ((Boolean)o.a.getCheckedItemPositions().get(i1, Boolean.valueOf(false))).booleanValue();
            if (d1.c != 0) goto _L2; else goto _L1
_L1:
            context = cursor.getString(l);
            s2 = cursor.getString(j);
            cursor = cursor.getString(m);
            d1.a.setText(context);
            d1.e = s2;
            if (d1.d != l1)
            {
                if (com.aviary.android.feather.sdk.panels.f.a(o) == com.aviary.android.feather.cds.a.b.b)
                {
                    context = (new StringBuilder()).append("custom.resource://").append(cursor).append("/").append(s2).append(".json").toString();
                } else
                {
                    context = cursor;
                    if (!cursor.startsWith("file://"))
                    {
                        context = (new StringBuilder()).append("file://").append(cursor).toString();
                    }
                    s1 = (new StringBuilder()).append(context).append("/").append(s2).append("-small.png").toString();
                    cursor = context;
                    context = s1;
                }
                cursor = a(i1, i1, s2, ((String) (cursor)));
                context = com.aviary.android.feather.sdk.panels.f.d(o).a(Uri.parse(context)).a(200L).a(com.aviary.android.feather.sdk.R.drawable.aviary_ic_na).a(f.c(o));
                if (cursor != null)
                {
                    context.a(cursor);
                }
                context.a(d1.b);
            }
            ((EffectThumbLayout)view).setIsOpened(flag);
_L4:
            d1.d = l1;
            return;
_L2:
            if (d1.c == 1)
            {
                view = (e)d1;
                context = cursor.getString(j);
                s1 = cursor.getString(l);
                s2 = cursor.getString(m);
                i1 = cursor.getInt(n);
                d1.a.setText(s1);
                d1.e = context;
                view.h = i1;
                if (d1.d != l1)
                {
                    com.aviary.android.feather.sdk.panels.f.d(o).a(s2).a((new com.aviary.android.feather.sdk.utils.b.a()).a(o.B().a().getResources()).a(com.aviary.android.feather.sdk.panels.f.a(o)).a(s2).c()).a(com.aviary.android.feather.sdk.R.drawable.aviary_ic_na).a(d1.b);
                }
            } else
            if (d1.c == 2)
            {
                view = d1.b.getDrawable();
                context = cursor.getString(l);
                if (view instanceof com.aviary.android.feather.sdk.a.d)
                {
                    ((com.aviary.android.feather.sdk.a.d)view).a(context);
                } else
                {
                    view = new com.aviary.android.feather.sdk.a.d(o.B().a(), com.aviary.android.feather.sdk.R.attr.aviaryEffectThumbDividerTextStyle, context);
                    d1.b.setImageDrawable(view);
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void bindView(View view, Context context, Cursor cursor)
        {
        }

        public int getItemViewType(int i1)
        {
            Cursor cursor = (Cursor)getItem(i1);
            if (cursor != null)
            {
                return cursor.getInt(k);
            } else
            {
                return -1;
            }
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            if (!mDataValid)
            {
                throw new IllegalStateException("this should only be called when the cursor is valid");
            }
            View view1 = view;
            if (view == null)
            {
                view1 = a(mContext, mCursor, viewgroup, i1);
            }
            a(view1, mContext, mCursor, i1);
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

        protected void onContentChanged()
        {
            super.onContentChanged();
            o.q.d("onContentChanged!!!!");
        }

        public Cursor swapCursor(Cursor cursor)
        {
            o.q.b("swapCursor");
            a(cursor);
            return super.swapCursor(cursor);
        }

        public b(Context context, int i1, int j1, int k1, int l1, Cursor cursor)
        {
            o = f.this;
            super(context, cursor, 0);
            a = new Object();
            g = -1;
            a(cursor);
            b = LayoutInflater.from(context);
            c = i1;
            d = j1;
            e = k1;
            f = l1;
        }
    }

    protected class c extends com.aviary.android.feather.common.utils.os.a
        implements android.content.DialogInterface.OnCancelListener
    {

        int a;
        String b;
        MoaResult c;
        com.aviary.android.feather.cds.s.a d;
        com.aviary.android.feather.headless.moa.d e;
        final f f;

        private INativeFilter a(com.aviary.android.feather.cds.s.a a1, int i)
        {
            try
            {
                a1 = f.a(a1, i, true);
            }
            // Misplaced declaration of an exception variable
            catch (com.aviary.android.feather.cds.s.a a1)
            {
                a1.printStackTrace();
                return null;
            }
            e = (com.aviary.android.feather.headless.moa.d)a1.a().clone();
            if (a1 instanceof BorderFilter)
            {
                ((BorderFilter)a1).a(false);
            }
            try
            {
                c = a1.a(f.g, f.f, 1, 1);
            }
            // Misplaced declaration of an exception variable
            catch (com.aviary.android.feather.cds.s.a a1)
            {
                a1.printStackTrace();
                c = null;
                return null;
            }
            return a1;
        }

        public transient Bitmap a(com.aviary.android.feather.cds.s.a aa[])
        {
            if (!isCancelled())
            {
                aa = aa[0];
                d = aa;
                a(((com.aviary.android.feather.cds.s.a) (aa)), a);
                f.c = Boolean.valueOf(true);
                if (!isCancelled())
                {
                    try
                    {
                        b();
                    }
                    // Misplaced declaration of an exception variable
                    catch (com.aviary.android.feather.cds.s.a aa[])
                    {
                        b = aa.getMessage();
                        aa.printStackTrace();
                        return null;
                    }
                    if (!isCancelled())
                    {
                        return c.outputBitmap;
                    }
                }
            }
            return null;
        }

        protected void a()
        {
            f.i();
        }

        public void a(Bitmap bitmap)
        {
            if (!f.n())
            {
                return;
            }
            f.f = bitmap;
            f.y = d;
            if (bitmap == null || c == null || c.active == 0)
            {
                c();
                if (b != null)
                {
                    f.a(b, 0x104000a, null);
                }
                f.c(false);
            } else
            {
                b(bitmap);
                if (f.y != null)
                {
                    bitmap = new HashMap();
                    bitmap.put("pack", f.y.d());
                    bitmap.put("item", f.y.b());
                    f.B().h().a((new StringBuilder()).append(f.C().name().toLowerCase(Locale.US)).append(": item_previewed").toString(), bitmap);
                    bitmap = new com.aviary.android.feather.library.d.c();
                    bitmap.a(f.y.d());
                    bitmap.b(f.y.b());
                    f.e.a(e);
                    f.e.a(bitmap);
                    f.l.put("item", f.y.b());
                    f.l.put("pack", f.y.d());
                } else
                {
                    f.e.a(null);
                    f.e.a(null);
                    f.l.remove("item");
                    f.l.remove("pack");
                }
            }
            f.j();
            f.c = Boolean.valueOf(false);
            com.aviary.android.feather.sdk.panels.f.a(f, null);
        }

        public volatile void a(Object obj)
        {
            a((Bitmap)obj);
        }

        public void b()
        {
            c.execute();
        }

        protected void b(Bitmap bitmap)
        {
            boolean flag = true;
            if (l.b())
            {
                Moa.a(bitmap);
            }
            f.a(bitmap, false, true);
            bitmap = f;
            if (f.y == null)
            {
                flag = false;
            }
            bitmap.c(flag);
        }

        protected void c()
        {
            f.a(f.g, true, true);
            f.c(false);
        }

        public Object doInBackground(Object aobj[])
        {
            return a((com.aviary.android.feather.cds.s.a[])aobj);
        }

        public void onCancel(DialogInterface dialoginterface)
        {
            cancel(true);
        }

        public void onCancelled()
        {
            super.onCancelled();
            if (c != null)
            {
                c.cancel();
            }
            f.c = Boolean.valueOf(false);
        }

        public c(int i)
        {
            f = f.this;
            super();
            a = i;
        }
    }

    static class d
    {

        protected TextView a;
        protected ImageView b;
        protected int c;
        protected long d;
        protected String e;
        protected Object f;
        protected boolean g;

        d()
        {
        }
    }

    static class e extends d
    {

        protected int h;

        e()
        {
        }
    }


    private static android.graphics.BitmapFactory.Options L;
    protected CursorLoader A;
    protected ContentObserver B;
    protected com.aviary.android.feather.sdk.widget.f C;
    FramesOverlay D;
    private final com.aviary.android.feather.cds.a.b E;
    private volatile boolean F;
    private c G;
    private int H;
    private Picasso I;
    private h J;
    private boolean K;
    private final List M;
    protected HListView a;
    protected View b;
    protected volatile Boolean c;
    protected ConfigService s;
    protected PreferenceService t;
    protected int u;
    protected Bitmap v;
    protected int w;
    protected boolean x;
    protected com.aviary.android.feather.cds.s.a y;
    protected CursorAdapter z;

    public f(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        this(iaviarycontroller, a1, com.aviary.android.feather.cds.a.b.a);
    }

    protected f(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1, com.aviary.android.feather.cds.a.b b1)
    {
        super(iaviarycontroller, a1);
        c = Boolean.valueOf(false);
        H = 80;
        w = 0;
        K = true;
        x = false;
        M = new ArrayList();
        E = b1;
    }

    private boolean G()
    {
        b(true);
        if (C != null)
        {
            C.a(true);
            C = null;
            return true;
        } else
        {
            return false;
        }
    }

    static com.aviary.android.feather.cds.a.b a(f f1)
    {
        return f1.E;
    }

    static c a(f f1, c c1)
    {
        f1.G = c1;
        return c1;
    }

    private void a(int i, long l1)
    {
        if (!n() || g() == null)
        {
            return;
        } else
        {
            g().postDelayed(new BordersPanel._cls4(i), l1);
            return;
        }
    }

    private void a(Cursor cursor, int i, boolean flag, boolean flag1, boolean flag2)
    {
        q.b((new StringBuilder()).append("onEffectListUpdated: first valid index:").append(i).toString());
        if (i <= 0)
        {
            i = 0;
        }
        if (K)
        {
            b.setVisibility(4);
            a.setVisibility(0);
        }
        if ((K || flag) && i > 0)
        {
            if (flag2)
            {
                a(i, 500L);
            }
            if (flag1)
            {
                a.a(i - 1, H / 2, 500);
            } else
            {
                a.f(i - 1, H / 2);
            }
        }
        if (K)
        {
            cursor = new AlphaAnimation(0.0F, 1.0F);
            cursor.setFillAfter(true);
            cursor.setDuration(B().a().getResources().getInteger(0x10e0002));
            a.startAnimation(cursor);
        }
        K = false;
    }

    private void a(com.aviary.android.feather.cds.s.a a1, int i)
    {
        q.b((new StringBuilder()).append("renderEffect: ").append(i).toString());
        b();
        G = a(i);
        G.execute(new com.aviary.android.feather.cds.s.a[] {
            a1
        });
    }

    private final void a(com.aviary.android.feather.sdk.widget.a a1)
    {
        q.c("displayIAPDialog: %s", new Object[] {
            a1
        });
        if (C != null)
        {
            if (C.j())
            {
                C.a(a1);
                b(false);
                return;
            }
            C.a(false);
            C = null;
        }
        a1 = com.aviary.android.feather.sdk.widget.f.a((com.aviary.android.feather.sdk.AviaryMainController.a)B().a(), a1);
        if (a1 != null)
        {
            a1.a(new com.aviary.android.feather.sdk.widget.b() {

                final f a;

            
            {
                a = f.this;
                super();
            }
            });
        }
        C = a1;
        b(false);
    }

    private boolean a(long l1)
    {
        q.c("openStorePanelIfRequired: %d", new Object[] {
            Long.valueOf(l1)
        });
        if (a("quick-packId") || l1 > -1L)
        {
            long l2;
            if (l1 > -1L)
            {
                l2 = l1;
            } else
            if (a("quick-packId"))
            {
                Bundle bundle = p();
                l2 = bundle.getLong("quick-packId");
                bundle.remove("quick-packId");
            } else
            {
                l2 = -1L;
            }
            q.b("iapPackageId: %d", new Object[] {
                Long.valueOf(l1)
            });
            if (l2 > -1L)
            {
                a((new com.aviary.android.feather.sdk.widget.a.a()).a(l2).b(l2).a("shop_details: opened").a(E).a("pack", String.valueOf(l2)).a("from", "message").a());
                return true;
            }
        }
        return false;
    }

    static boolean a(f f1, int i)
    {
        return f1.c(i);
    }

    static int b(f f1)
    {
        return f1.H;
    }

    private void b(int i)
    {
        q.c("createTutorialOverlayIfNecessary: %d", new Object[] {
            Integer.valueOf(i)
        });
        while (!n() || com.aviary.android.feather.cds.a.b.a != E || g() == null) 
        {
            return;
        }
        g().postDelayed(new BordersPanel._cls2(i), 200L);
    }

    static h c(f f1)
    {
        return f1.J;
    }

    private boolean c(int i)
    {
        q.c("createTutorialOverlayIfNecessaryDelayed: %d", new Object[] {
            Integer.valueOf(i)
        });
        if (n()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        int j;
        boolean flag;
        int i1;
        i1 = a.getChildCount();
        obj = null;
        q.b("count: %d", new Object[] {
            Integer.valueOf(i1)
        });
        i = 0;
        flag = false;
        j = -1;
_L11:
        if (i >= i1) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        boolean flag1;
        int k;
        obj2 = a.getChildAt(i);
        obj1 = obj;
        k = j;
        flag1 = flag;
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        obj2 = ((View) (obj2)).getTag();
        obj1 = obj;
        k = j;
        flag1 = flag;
        if (obj2 == null) goto _L6; else goto _L7
_L7:
        obj1 = obj;
        k = j;
        flag1 = flag;
        if (!(obj2 instanceof d)) goto _L6; else goto _L8
_L8:
        obj2 = (d)obj2;
        if (((d) (obj2)).c != 0) goto _L10; else goto _L9
_L9:
        boolean flag2 = false;
_L12:
        if (!flag || j <= -1 || obj == null)
        {
            flag2 = false;
        }
        q.b("shouldProceed: %b", new Object[] {
            Boolean.valueOf(flag2)
        });
        if (!flag2)
        {
            if (D != null)
            {
                D.h();
                return false;
            }
        } else
        {
            q.b("free item index: %d", new Object[] {
                Integer.valueOf(j)
            });
            if (D == null)
            {
                if (AviaryOverlay.b(B(), 3))
                {
                    D = new FramesOverlay(B().b(), com.aviary.android.feather.sdk.R.style.AviaryWidget_Overlay_Frames, ((View) (obj)));
                    return D.g();
                }
            } else
            {
                D.a(((View) (obj)));
                return false;
            }
        }
          goto _L1
_L10:
        obj1 = obj;
        k = j;
        flag1 = flag;
        if (((d) (obj2)).c == 1)
        {
            obj1 = (e)obj2;
            if (((e) (obj1)).h == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                obj = ((e) (obj1)).b;
                j = i;
            }
            q.b("%d = %s, free = %d", new Object[] {
                Integer.valueOf(i), ((e) (obj1)).e, Integer.valueOf(((e) (obj1)).h)
            });
            k = j;
            obj1 = obj;
        }
_L6:
        i++;
        flag = flag1;
        obj = obj1;
        j = k;
          goto _L11
_L4:
        flag2 = true;
          goto _L12
    }

    static Picasso d(f f1)
    {
        return f1.I;
    }

    private void d(int i)
    {
        if (z != null && i >= 0 && i < z.getCount())
        {
            Object obj = (Cursor)z.getItem(i);
            if (obj != null)
            {
                obj = com.aviary.android.feather.cds.s.a.a(((Cursor) (obj)));
                if (obj != null)
                {
                    a(((com.aviary.android.feather.cds.s.a) (obj)), i);
                    return;
                }
            }
        }
    }

    public void A()
    {
        j();
        a.setOnItemClickListener(null);
        a.setAdapter(null);
        G();
        if (D != null)
        {
            D.i();
            D = null;
        }
        B().a().getContentResolver().unregisterContentObserver(B);
        if (A != null)
        {
            q.b("disposing cursorloader...");
            A.unregisterListener(this);
            A.stopLoading();
            A.abandon();
            A.reset();
        }
        if (z != null)
        {
            com.aviary.android.feather.common.utils.d.a(z.getCursor());
        }
        z = null;
        A = null;
        super.A();
    }

    protected void F()
    {
        q.b((new StringBuilder()).append("onGenerateResult. isRendering: ").append(c).toString());
        if (c.booleanValue())
        {
            (new a()).execute(new Void[0]);
            return;
        } else
        {
            b(f);
            return;
        }
    }

    protected Bitmap a(Bitmap bitmap, int i, int j)
    {
        return ThumbnailUtils.extractThumbnail(bitmap, i, j);
    }

    protected CursorAdapter a(Context context, Cursor cursor)
    {
        return new b(context, com.aviary.android.feather.sdk.R.layout.aviary_frame_item, com.aviary.android.feather.sdk.R.layout.aviary_effect_item_more, com.aviary.android.feather.sdk.R.layout.aviary_effect_item_external, com.aviary.android.feather.sdk.R.layout.aviary_frame_item_divider, cursor);
    }

    protected INativeFilter a(com.aviary.android.feather.cds.s.a a1, int i, boolean flag)
        throws JSONException
    {
        double d1;
        Cursor cursor;
        BorderFilter borderfilter;
        borderfilter = (BorderFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.q);
        if (a1 == null || i <= -1)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        cursor = B().a().getContentResolver().query(com.aviary.android.feather.common.utils.f.a(B().a(), (new StringBuilder()).append("pack/content/item/").append(a1.a()).toString()), null, null, null, null);
        double d2 = 0.0D;
        d1 = d2;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        d1 = d2;
        if (cursor.moveToFirst())
        {
            d1 = (new JSONObject(new String(cursor.getBlob(cursor.getColumnIndex("item_options"))))).getDouble("width");
        }
        com.aviary.android.feather.common.utils.d.a(cursor);
        borderfilter.a(flag);
        borderfilter.a(d1);
        borderfilter.b(a1.b());
        borderfilter.a(a1.c());
        return borderfilter;
        a1;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw a1;
    }

    protected c a(int i)
    {
        return new c(i);
    }

    protected void a()
    {
        d(true);
    }

    public void a(Configuration configuration, Configuration configuration1)
    {
        if (C != null)
        {
            C.a(configuration);
        }
        super.a(configuration, configuration1);
    }

    public void a(Bitmap bitmap)
    {
        super.a(bitmap);
        if (n())
        {
            q.d("TODO: BordersPanel check this");
            a.setSelection(w);
        }
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        I = Picasso.a(B().a());
        M.clear();
        bitmap = new double[3];
        l.a(bitmap);
        int i = (int)(Math.max(bitmap[0], 2D) * 1048576D);
        q.a((new StringBuilder()).append("max size for cache: ").append(i).toString());
        J = new h(Math.min(i, 0x600000));
        L = new android.graphics.BitmapFactory.Options();
        L.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        s = (ConfigService)B().a(com/aviary/android/feather/library/services/ConfigService);
        t = (PreferenceService)B().a(com/aviary/android/feather/library/services/PreferenceService);
        x = ((LocalDataService)B().a(com/aviary/android/feather/library/services/LocalDataService)).l();
        a = (HListView)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_list);
        b = f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_loader);
        f = com.aviary.android.feather.library.c.b.a(g, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public void a(Loader loader, Cursor cursor)
    {
        q.b("onLoadComplete");
        long l1 = -1L;
        int j = -1;
        long l4 = -1L;
        long l6 = -1L;
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        long l2;
        long l3;
        boolean flag4;
        boolean flag5;
        if (!K && C != null && C.j() && C.k() != null && C.f() != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        flag2 = false;
        flag = false;
        l2 = l1;
        if (i != 0)
        {
            loader = C.f();
            l2 = l1;
            if (loader.b() == loader.a())
            {
                l2 = l1;
                if (loader.b() > -1L)
                {
                    l2 = loader.b();
                }
            }
        }
        if (l2 > -1L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = ((flag2) ? 1 : 0);
        l3 = l6;
        l1 = l4;
        if (q())
        {
            i = ((flag2) ? 1 : 0);
            l3 = l6;
            l1 = l4;
            if (K)
            {
                i = ((flag2) ? 1 : 0);
                l3 = l6;
                l1 = l4;
                if (!flag1)
                {
                    loader = p();
                    l1 = loader.getLong("quick-packId", -1L);
                    l3 = loader.getLong("quick-contentId", -1L);
                    String s1;
                    com.aviary.android.feather.common.a.a.c c1;
                    byte byte0;
                    long l5;
                    if (l1 > -1L && l3 > -1L)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    loader.remove("quick-packId");
                    loader.remove("quick-contentId");
                }
            }
        }
        loader = new ArrayList();
        boolean flag7;
        if (cursor != null)
        {
            int j1 = cursor.getPosition();
            flag4 = false;
            byte0 = -1;
            boolean flag3 = i;
            flag = false;
            flag5 = false;
            i = j;
            j = byte0;
            do
            {
                if (!cursor.moveToNext())
                {
                    break;
                }
                int i1 = cursor.getInt(4);
                if (i1 == 2)
                {
                    l5 = cursor.getLong(0);
                    s1 = cursor.getString(3);
                    c1 = q;
                    boolean flag6;
                    if (!M.contains(Long.valueOf(l5)))
                    {
                        flag6 = true;
                    } else
                    {
                        flag6 = false;
                    }
                    c1.b("%d = %s, is new: %b, first time: %b", new Object[] {
                        Long.valueOf(l5), s1, Boolean.valueOf(flag6), Boolean.valueOf(K)
                    });
                    loader.add(Long.valueOf(l5));
                    flag6 = flag4;
                    i1 = i;
                    if (!K)
                    {
                        flag6 = flag4;
                        i1 = i;
                        if (!M.contains(Long.valueOf(l5)))
                        {
                            q.b("adding %d (%s) to new packs", new Object[] {
                                Long.valueOf(l5), s1
                            });
                            q.b("iapDialogFeaturedId: %d, pack_id: %d", new Object[] {
                                Long.valueOf(l2), Long.valueOf(l5)
                            });
                            flag6 = flag4;
                            i1 = i;
                            if (flag1)
                            {
                                flag6 = flag4;
                                i1 = i;
                                if (l2 == l5)
                                {
                                    q.b("setting new position based on featured: %d", new Object[] {
                                        Long.valueOf(l5)
                                    });
                                    i1 = cursor.getPosition();
                                    flag6 = true;
                                }
                            }
                        }
                    }
                    flag4 = flag6;
                    i = i1;
                    if (j == -1)
                    {
                        j = cursor.getPosition();
                        flag4 = flag6;
                        i = i1;
                    }
                } else
                if (i1 == 0 && flag3 && l3 == cursor.getLong(0))
                {
                    i = cursor.getPosition();
                    flag3 = false;
                    flag = true;
                    flag5 = true;
                    l1 = -1L;
                }
            } while (true);
            cursor.moveToPosition(j1);
            int k = j;
            j = i;
            i = k;
        } else
        {
            i = -1;
            flag4 = false;
            flag5 = false;
        }
        M.clear();
        M.addAll(loader);
        z.changeCursor(cursor);
        q.b("lastInstalledPackIndex: %d", new Object[] {
            Integer.valueOf(j)
        });
        if (j >= 0)
        {
            flag7 = true;
            G();
        } else
        {
            flag7 = false;
            j = i;
        }
        a(cursor, j, flag7, flag4, flag5);
        while (a(l1) || flag || com.aviary.android.feather.cds.a.b.a != E) 
        {
            return;
        }
        b(j);
    }

    public void a(AdapterView adapterview)
    {
    }

    public void a(AdapterView adapterview, View view, int i, long l1)
    {
        q.b((new StringBuilder()).append("onItemClick: ").append(i).toString());
        if (D != null)
        {
            D.h();
        }
        int j = a.getCheckedItemCount();
        SparseArrayCompat sparsearraycompat = a.getCheckedItemPositions().clone();
        sparsearraycompat.remove(i);
        if (n())
        {
            adapterview = (d)view.getTag();
            if (adapterview != null)
            {
                boolean flag;
                if (((d) (adapterview)).c == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (((d) (adapterview)).c == 5 || ((d) (adapterview)).c == 6)
                {
                    if (((d) (adapterview)).c == 6)
                    {
                        adapterview = "right";
                    } else
                    {
                        adapterview = "left";
                    }
                    a((new com.aviary.android.feather.sdk.widget.a.a()).a(E).a("shop_list: opened").b(-1L).a("from", C().name().toLowerCase(Locale.US)).a("side", adapterview).a());
                } else
                if (((d) (adapterview)).c == 1)
                {
                    a((new com.aviary.android.feather.sdk.widget.a.a()).a(((d) (adapterview)).d).a(E).b(((d) (adapterview)).d).a("shop_details: opened").a("pack", ((d) (adapterview)).e).a("from", "featured").a());
                } else
                if (((d) (adapterview)).c == 0)
                {
                    G();
                    if (j > 0)
                    {
                        d(i);
                    } else
                    {
                        a(((com.aviary.android.feather.cds.s.a) (null)), -1);
                    }
                }
                if (flag)
                {
                    adapterview = (EffectThumbLayout)view;
                    if (adapterview.isChecked())
                    {
                        adapterview.a();
                    } else
                    {
                        adapterview.b();
                    }
                } else
                {
                    a.a(i, false);
                }
                if (sparsearraycompat.size() > 0 && flag)
                {
                    a.a(sparsearraycompat.keyAt(0), false);
                }
            }
        }
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_frames, viewgroup, false);
    }

    public void b(AdapterView adapterview, View view, int i, long l1)
    {
    }

    boolean b()
    {
        if (G != null)
        {
            j();
            return G.cancel(true);
        } else
        {
            return false;
        }
    }

    protected void c()
    {
        a.setAdapter(null);
        if (v != null && !v.isRecycled())
        {
            v.recycle();
        }
        v = null;
        super.c();
    }

    protected void d(boolean flag)
    {
        b.setVisibility(0);
        a.setVisibility(4);
        z = a(B().a(), ((Cursor) (null)));
        a.setAdapter(z);
        Context context = B().a();
        if (A == null)
        {
            String s1 = String.format(Locale.US, "packTray/%d/%d/%d/%s", new Object[] {
                Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(1), E.a()
            });
            q.b("uri: %s", new Object[] {
                s1
            });
            A = new CursorLoader(context, com.aviary.android.feather.common.utils.f.a(context, s1), null, null, null, null);
            A.registerListener(1, this);
            B = new ContentObserver(new Handler()) {

                final f a;

                public void onChange(boolean flag1)
                {
                    a.q.b("mContentObserver::onChange");
                    super.onChange(flag1);
                    if (a.n() && a.A != null && a.A.isStarted())
                    {
                        a.A.onContentChanged();
                    }
                }

            
            {
                a = f.this;
                super(handler);
            }
            };
            context.getContentResolver().registerContentObserver(com.aviary.android.feather.common.utils.f.a(context, (new StringBuilder()).append("packTray/").append(E.a()).toString()), false, B);
        }
        A.startLoading();
    }

    boolean d()
    {
        if (!F) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (C == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (C.c()) goto _L1; else goto _L3
_L3:
        G();
        return true;
        if (D != null && D.n()) goto _L1; else goto _L4
_L4:
        b();
        return false;
    }

    public boolean e()
    {
        return c.booleanValue();
    }

    public View makeView()
    {
        ImageViewTouch imageviewtouch = new ImageViewTouch(B().a(), null);
        imageviewtouch.setBackgroundColor(0);
        imageviewtouch.setDoubleTapEnabled(false);
        imageviewtouch.setScaleEnabled(false);
        imageviewtouch.setScrollEnabled(false);
        imageviewtouch.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        imageviewtouch.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return imageviewtouch;
    }

    public void onLoadComplete(Loader loader, Object obj)
    {
        a(loader, (Cursor)obj);
    }

    public boolean t()
    {
        if (d())
        {
            return true;
        } else
        {
            return super.t();
        }
    }

    public void w()
    {
        b();
        c = Boolean.valueOf(false);
        super.w();
    }

    public boolean x()
    {
        return super.x() || c.booleanValue();
    }

    public void y()
    {
        s = null;
        try
        {
            J.d();
        }
        catch (Exception exception) { }
        super.y();
    }

    public void z()
    {
        super.z();
        H = s.g(com.aviary.android.feather.sdk.R.dimen.aviary_frame_item_width);
        u = s.g(com.aviary.android.feather.sdk.R.dimen.aviary_frame_item_image_width);
        v = a(g, u, u);
        a.setOnItemClickListener(this);
        a();
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/panels/BordersPanel$2

/* anonymous class */
    class BordersPanel._cls2
        implements Runnable
    {

        final int a;
        final f b;

        public void run()
        {
            if (a < 0)
            {
                com.aviary.android.feather.sdk.panels.f.a(b, a);
            }
        }

            
            {
                b = f.this;
                a = i;
                super();
            }
    }


    // Unreferenced inner class com/aviary/android/feather/sdk/panels/BordersPanel$4

/* anonymous class */
    class BordersPanel._cls4
        implements Runnable
    {

        final int a;
        final f b;

        public void run()
        {
            if (b.n() && b.z != null && b.a != null)
            {
                b.a.a();
                if (a >= b.a.getFirstVisiblePosition() && a < b.a.getLastVisiblePosition() && a < b.z.getCount())
                {
                    View view = b.a.getChildAt(a - b.a.getFirstVisiblePosition());
                    if (view != null && (view instanceof EffectThumbLayout))
                    {
                        b.a.a(view, a, b.z.getItemId(a));
                        return;
                    }
                }
            }
        }

            
            {
                b = f.this;
                a = i;
                super();
            }
    }

}
