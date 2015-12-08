// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.widget.CursorAdapter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aviary.android.feather.cds.billing.util.Purchase;
import com.aviary.android.feather.cds.billing.util.e;
import com.aviary.android.feather.cds.h;
import com.aviary.android.feather.cds.i;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.common.utils.f;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.library.services.BadgeService;
import com.aviary.android.feather.sdk.AviaryMainController;
import com.aviary.android.feather.sdk.FeatherActivity;
import it.sephiroth.android.library.picasso.Picasso;
import it.sephiroth.android.library.picasso.n;
import java.io.File;
import java.util.Arrays;
import junit.framework.AssertionFailedError;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryWorkspace, AviaryWorkspaceIndicator, IAPBuyButton, AviaryTextView, 
//            f, b, CellLayout

public class IAPDialogDetail extends LinearLayout
    implements android.view.View.OnClickListener, com.aviary.android.feather.cds.billing.util.d.d, AviaryWorkspace.a
{
    class a extends com.aviary.android.feather.common.utils.os.a
    {

        long a;
        com.aviary.android.feather.cds.billing.util.f b;
        final IAPDialogDetail c;

        private com.aviary.android.feather.cds.h.b a(Context context, com.aviary.android.feather.cds.m.a a1)
        {
            if (context == null)
            {
                return null;
            }
            context = com.aviary.android.feather.cds.h.d(context, a1.p());
            if (context != null)
            {
                context = new com.aviary.android.feather.cds.h.b((com.aviary.android.feather.cds.h.a)((Pair) (context)).first, null);
            } else
            {
                context = null;
            }
            return context;
        }

        com.aviary.android.feather.cds.billing.util.f a(String s1, i i1)
            throws com.aviary.android.feather.cds.billing.util.c
        {
            Object obj = null;
            java.util.List list = Arrays.asList(new String[] {
                s1
            });
            s1 = obj;
            if (i1.c())
            {
                s1 = i1.a(true, list, null);
            }
            return s1;
        }

        protected transient com.aviary.android.feather.cds.h.b a(com.aviary.android.feather.cds.billing.util.f af[])
        {
            IAPDialogDetail.c().b("DeterminePackOptionAsyncTask.doInBackground");
            break MISSING_BLOCK_LABEL_10;
            if (c.b() && IAPDialogDetail.j(c) != null)
            {
                Object obj = c.getContext();
                b = af[0];
                af = IAPDialogDetail.j(c).m();
                if (af != null)
                {
                    i i1 = af.f();
                    com.aviary.android.feather.cds.m.a a1 = com.aviary.android.feather.cds.h.c(((Context) (obj)), a);
                    if (a1 != null)
                    {
                        com.aviary.android.feather.cds.h.b b1 = a(((Context) (obj)), a1);
                        obj = new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a(((Context) (obj)), a1), null);
                        IAPDialogDetail.c().b("downloadStatus: %s", new Object[] {
                            b1
                        });
                        IAPDialogDetail.c().b("optionsStatus: %s", new Object[] {
                            obj
                        });
                        if (b1 != null)
                        {
                            if (b1.b == com.aviary.android.feather.cds.h.a.k && com.aviary.android.feather.cds.h.a.a(((com.aviary.android.feather.cds.h.b) (obj)).b))
                            {
                                return ((com.aviary.android.feather.cds.h.b) (obj));
                            } else
                            {
                                return b1;
                            }
                        }
                        if (com.aviary.android.feather.cds.h.a.b(((com.aviary.android.feather.cds.h.b) (obj)).b) || com.aviary.android.feather.cds.h.a.c(((com.aviary.android.feather.cds.h.b) (obj)).b))
                        {
                            return ((com.aviary.android.feather.cds.h.b) (obj));
                        }
                        if (i1 != null && i1.b_() && b == null)
                        {
                            try
                            {
                                b = a(a1.a(), i1);
                            }
                            catch (Exception exception)
                            {
                                exception.printStackTrace();
                            }
                        }
                        if (b != null)
                        {
                            return af.a(a1.a(), b);
                        }
                    }
                }
            }
            return null;
        }

        protected void a()
        {
        }

        protected void a(com.aviary.android.feather.cds.h.b b1)
        {
            IAPDialogDetail.c().b("DeterminePackOptionAsyncTask::onPostExecute: %s", new Object[] {
                b1
            });
            while (!c.b() || isCancelled() || com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(c) == null || com.aviary.android.feather.sdk.widget.IAPDialogDetail.f(c) == null || IAPDialogDetail.j(c) == null || IAPDialogDetail.j(c).m() == null || !IAPDialogDetail.j(c).m().d() || com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(c).p() != a) 
            {
                return;
            }
            com.aviary.android.feather.cds.h.b b2 = b1;
            if (b1 == null)
            {
                b2 = new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.h);
            }
            c.a(b2, IAPDialogDetail.k(c));
        }

        protected volatile void a(Object obj)
        {
            a((com.aviary.android.feather.cds.h.b)obj);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((com.aviary.android.feather.cds.billing.util.f[])aobj);
        }

        a(long l1)
        {
            c = IAPDialogDetail.this;
            super();
            a = l1;
        }
    }

    class b extends com.aviary.android.feather.common.utils.os.a
    {

        int a;
        long b;
        final IAPDialogDetail c;

        protected transient String a(Long along[])
        {
            Object obj;
            IAPDialogDetail.c().b("LoadPreviewsAsyncTask::doInBackground");
            if (!c.b())
            {
                return null;
            }
            b = along[0].longValue();
            along = c.getContext();
            com.aviary.android.feather.common.utils.l.a(c.getResources().getInteger(0x10e0001) + 300 + 300);
            along = com.aviary.android.feather.cds.h.c(along, b);
            if (along == null || along.f() == null)
            {
                a = 2;
                return null;
            }
            obj = along.f().h();
            if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
            com.aviary.android.feather.cds.f.a a1;
            obj = new File(((String) (obj)));
            a1 = com.aviary.android.feather.cds.f.a(com.aviary.android.feather.cds.a.a.a, com.aviary.android.feather.cds.a.b.a(along.b()));
            a1.a(c.getContext(), along.f().p(), ((File) (obj)), false);
            along = along.f().h();
            return along;
            along;
            a = 2;
_L4:
            return null;
_L2:
            a = 1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected void a()
        {
            com.aviary.android.feather.sdk.widget.IAPDialogDetail.h(c).setVisibility(8);
            com.aviary.android.feather.sdk.widget.IAPDialogDetail.i(c).setVisibility(0);
        }

        protected volatile void a(Object obj)
        {
            a((String)obj);
        }

        protected void a(String s1)
        {
            IAPDialogDetail.c().c("LoadPreviewsAsyncTask::PostExecute: %s, %d", new Object[] {
                s1, Integer.valueOf(a)
            });
            while (!c.b() || com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(c) == null || com.aviary.android.feather.sdk.widget.IAPDialogDetail.f(c) == null || com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(c).p() != b) 
            {
                return;
            }
            if (s1 != null)
            {
                com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(c, com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(c), s1);
                return;
            }
            if (a == 2)
            {
                IAPDialogDetail.g(c);
                return;
            } else
            {
                (c. new c()).execute(new Long[] {
                    Long.valueOf(b)
                });
                return;
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Long[])aobj);
        }

        b()
        {
            c = IAPDialogDetail.this;
            super();
        }
    }

    class c extends com.aviary.android.feather.common.utils.os.a
    {

        final IAPDialogDetail a;
        private Throwable b;
        private long c;

        protected transient String a(Long along[])
        {
            IAPDialogDetail.c().a("PreviewDownloadAsyncTask::doInBackground");
            if (a.b() && com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(a) != null && com.aviary.android.feather.sdk.widget.IAPDialogDetail.f(a) != null)
            {
                c = along[0].longValue();
                along = a.getContext();
                if (along != null)
                {
                    com.aviary.android.feather.cds.d.b b1 = com.aviary.android.feather.cds.d.a(com.aviary.android.feather.cds.a.a.a);
                    try
                    {
                        along = b1.a(along, c);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Long along[])
                    {
                        b = along;
                        return null;
                    }
                    return along;
                }
            }
            return null;
        }

        protected void a()
        {
            com.aviary.android.feather.sdk.widget.IAPDialogDetail.i(a).setVisibility(0);
            com.aviary.android.feather.sdk.widget.IAPDialogDetail.h(a).setVisibility(8);
        }

        protected volatile void a(Object obj)
        {
            a((String)obj);
        }

        protected void a(String s1)
        {
            IAPDialogDetail.c().b("PreviewDownloadAsyncTask::PostExecute: %s", new Object[] {
                s1
            });
            if (!isCancelled() && a.b() && com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(a) != null && com.aviary.android.feather.sdk.widget.IAPDialogDetail.f(a) != null)
            {
                if (com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(a).p() != c)
                {
                    IAPDialogDetail.c().c("different pack");
                    return;
                }
                if (s1 != null)
                {
                    com.aviary.android.feather.sdk.widget.IAPDialogDetail.i(a).setVisibility(8);
                    com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(a, com.aviary.android.feather.sdk.widget.IAPDialogDetail.e(a), s1);
                }
                if (b != null)
                {
                    IAPDialogDetail.g(a);
                    return;
                }
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Long[])aobj);
        }

        c()
        {
            a = IAPDialogDetail.this;
            super();
        }
    }

    class d extends CursorAdapter
    {

        LayoutInflater a;
        int b;
        String c;
        String d;
        int e;
        int f;
        int g;
        int h;
        final IAPDialogDetail i;

        private void a(Cursor cursor)
        {
            if (cursor != null)
            {
                g = cursor.getColumnIndex("item_displayName");
                h = cursor.getColumnIndex("item_identifier");
                f = cursor.getColumnIndex("pack_type");
            }
        }

        private void c()
        {
            IAPDialogDetail.c().b("recycleBitmaps");
            int k1 = com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getChildCount();
            for (int i1 = 0; i1 < k1; i1++)
            {
                CellLayout celllayout = (CellLayout)com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getChildAt(i1);
                int l1 = celllayout.getChildCount();
                for (int j1 = 0; j1 < l1; j1++)
                {
                    Object obj = (ImageView)celllayout.getChildAt(j1);
                    if (obj == null)
                    {
                        continue;
                    }
                    android.graphics.drawable.Drawable drawable = ((ImageView) (obj)).getDrawable();
                    if (drawable == null || !(drawable instanceof BitmapDrawable))
                    {
                        continue;
                    }
                    ((ImageView) (obj)).setImageBitmap(null);
                    obj = ((BitmapDrawable)drawable).getBitmap();
                    if (obj != null && !((Bitmap) (obj)).isRecycled())
                    {
                        ((Bitmap) (obj)).recycle();
                    }
                }

            }

        }

        public String a()
        {
            return c;
        }

        public void a(int i1)
        {
            b = i1;
        }

        public void a(int i1, int j1, ImageView imageview, boolean flag, int k1, int l1)
        {
            Object obj = (Cursor)getItem(j1);
            if (obj != null && !((Cursor) (obj)).isAfterLast() && imageview != null)
            {
                String s2 = ((Cursor) (obj)).getString(h);
                String s1 = ((Cursor) (obj)).getString(g);
                obj = ((Cursor) (obj)).getString(f);
                s2 = (new File(a(), (new StringBuilder()).append(s2).append(d).toString())).getAbsolutePath();
                k1 = s2.hashCode();
                Integer integer = (Integer)imageview.getTag();
                if (integer != null && integer.equals(Integer.valueOf(k1)))
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (flag)
                {
                    if (j1 == 0)
                    {
                        imageview.setTag(null);
                        imageview.setImageBitmap(null);
                    }
                } else
                if (j1 == 0)
                {
                    IAPDialogDetail.d(i).a(s2).b(i1).c().a(com.aviary.android.feather.sdk.R.drawable.aviary_ic_na).a(new com.aviary.android.feather.sdk.a.a(s2, s1, ((String) (obj)))).a(imageview, new it.sephiroth.android.library.picasso.c(this, imageview, k1) {

                        final ImageView a;
                        final int b;
                        final d c;

                        public void a()
                        {
                            a.setTag(Integer.valueOf(b));
                        }

                        public void b()
                        {
                        }

            
            {
                c = d1;
                a = imageview;
                b = i1;
                super();
            }
                    });
                    return;
                }
            }
        }

        public void a(Context context)
        {
            mContext = context;
        }

        public void a(String s1)
        {
            c = s1;
        }

        public int b()
        {
            return super.getCount();
        }

        public void b(String s1)
        {
            d = s1;
        }

        public void bindView(View view, Context context, Cursor cursor)
        {
            int j1 = cursor.getPosition() * i.c;
            cursor = (CellLayout)view;
            cursor.setNumCols(i.b);
            cursor.setNumRows(i.a);
            int i1 = 0;
            while (i1 < i.c) 
            {
                CellLayout.a a1 = cursor.a();
                int k1;
                int l1;
                if (a1 == null)
                {
                    context = cursor.getChildAt(i1);
                } else
                {
                    context = a.inflate(com.aviary.android.feather.sdk.widget.IAPDialogDetail.b(i), com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i), false);
                    cursor.addView(context, -1, new CellLayout.b(a1.b, a1.c, a1.d, a1.e));
                }
                context = (ImageView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
                k1 = com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getWidth() / i.b;
                l1 = com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getHeight() / i.a;
                if (j1 + i1 < b())
                {
                    a(i1 * 60, j1 + i1, context, IAPDialogDetail.c(i), k1, l1);
                } else
                if (context != null)
                {
                    context.setImageBitmap(null);
                }
                i1++;
            }
            view.requestLayout();
        }

        public int getCount()
        {
            return (int)Math.ceil((double)super.getCount() / (double)i.c);
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            return a.inflate(b, viewgroup, false);
        }

        public Cursor swapCursor(Cursor cursor)
        {
            a(cursor);
            c();
            return super.swapCursor(cursor);
        }

        public d(Context context, String s1, int i1, Cursor cursor)
        {
            i = IAPDialogDetail.this;
            super(context, cursor, false);
            b = i1;
            a = LayoutInflater.from(getContext());
            c = s1;
            e = context.getResources().getDisplayMetrics().densityDpi;
            a(cursor);
        }
    }


    private static com.aviary.android.feather.common.a.a.c z;
    int a;
    int b;
    int c;
    private f.a d;
    private com.aviary.android.feather.cds.m.a e;
    private long f;
    private Picasso g;
    private BadgeService h;
    private com.aviary.android.feather.sdk.widget.f i;
    private d j;
    private int k;
    private int l;
    private View m;
    private View n;
    private TextView o;
    private TextView p;
    private AviaryTextView q;
    private AviaryTextView r;
    private IAPBuyButton s;
    private AviaryWorkspace t;
    private AviaryWorkspaceIndicator u;
    private View v;
    private View w;
    private boolean x;
    private boolean y;

    public IAPDialogDetail(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        k = com.aviary.android.feather.sdk.R.layout.aviary_iap_workspace_screen_stickers;
        l = com.aviary.android.feather.sdk.R.layout.aviary_iap_cell_item_effects;
        x = true;
        a = 1;
        b = 1;
        if (com.aviary.android.feather.common.utils.l.f() >= 127D)
        {
            flag = false;
        }
        x = flag;
    }

    static AviaryWorkspace a(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.t;
    }

    private void a(Resources resources, String s1)
    {
        if ("effect".equals(s1) || "frame".equals(s1))
        {
            k = com.aviary.android.feather.sdk.R.layout.aviary_iap_workspace_screen_effects;
            b = resources.getInteger(com.aviary.android.feather.sdk.R.integer.aviary_iap_dialog_cols_effects);
            a = resources.getInteger(com.aviary.android.feather.sdk.R.integer.aviary_iap_dialog_rows_effects);
            l = com.aviary.android.feather.sdk.R.layout.aviary_iap_cell_item_effects;
        } else
        {
            k = com.aviary.android.feather.sdk.R.layout.aviary_iap_workspace_screen_stickers;
            b = resources.getInteger(com.aviary.android.feather.sdk.R.integer.aviary_iap_dialog_cols_stickers);
            a = resources.getInteger(com.aviary.android.feather.sdk.R.integer.aviary_iap_dialog_rows_stickers);
            l = com.aviary.android.feather.sdk.R.layout.aviary_iap_cell_item_stickers;
        }
        c = a * b;
    }

    private void a(com.aviary.android.feather.cds.m.a a1, String s1)
    {
        if (a1 != null && b())
        {
            Object obj = (Long)t.getTag();
            if (obj != null && ((Long) (obj)).longValue() == a1.p())
            {
                z.c("ok, don't reload the workspace, same tag found");
                m.setVisibility(8);
                return;
            }
            obj = getContext().getContentResolver().query(com.aviary.android.feather.common.utils.f.a(getContext(), (new StringBuilder()).append("pack/").append(a1.p()).append("/item/list").toString()), new String[] {
                "item_id as _id", "pack_type", "item_id", "item_identifier", "item_displayName"
            }, null, null, null);
            j.a(s1);
            j.changeCursor(((Cursor) (obj)));
            t.setOnPageChangeListener(this);
            t.setTag(Long.valueOf(a1.p()));
            m.setVisibility(8);
            if (obj == null || ((Cursor) (obj)).getCount() <= c)
            {
                u.setVisibility(4);
                return;
            } else
            {
                u.setVisibility(0);
                return;
            }
        } else
        {
            z.d("invalid plugin");
            j.changeCursor(null);
            t.setTag(null);
            t.setOnPageChangeListener(null);
            u.setVisibility(4);
            return;
        }
    }

    static void a(IAPDialogDetail iapdialogdetail, com.aviary.android.feather.cds.m.a a1, String s1)
    {
        iapdialogdetail.a(a1, s1);
    }

    static int b(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.l;
    }

    static com.aviary.android.feather.common.a.a.c c()
    {
        return z;
    }

    static boolean c(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.x;
    }

    static Picasso d(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.g;
    }

    private void d()
    {
        if (com.aviary.android.feather.cds.h.h(getContext()))
        {
            z.a("handleSubscriptionInUI: true");
            if (w != null)
            {
                w.setOnClickListener(this);
                w.setVisibility(0);
            }
        } else
        {
            z.a("handleSubscriptionInUI: false");
            if (w != null)
            {
                w.setOnClickListener(null);
                w.setVisibility(8);
                return;
            }
        }
    }

    static com.aviary.android.feather.cds.m.a e(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.e;
    }

    private void e()
    {
        z.b("onDownloadError");
        n.setVisibility(0);
        m.setVisibility(8);
        s.setVisibility(8);
        j.changeCursor(null);
        t.setTag(null);
        q.setText("");
        if (o != null)
        {
            o.setText(com.aviary.android.feather.sdk.R.string.feather_item_not_found);
        }
    }

    static f.a f(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.d;
    }

    private void f()
    {
        z.b("onDownloadPreviewError");
        n.setVisibility(0);
        m.setVisibility(8);
        j.changeCursor(null);
        t.setTag(null);
        if (o != null)
        {
            o.setText(com.aviary.android.feather.sdk.R.string.feather_iap_failed_download_previews);
        }
    }

    static void g(IAPDialogDetail iapdialogdetail)
    {
        iapdialogdetail.f();
    }

    static View h(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.n;
    }

    static View i(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.m;
    }

    static com.aviary.android.feather.sdk.widget.f j(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.i;
    }

    static long k(IAPDialogDetail iapdialogdetail)
    {
        return iapdialogdetail.f;
    }

    private void setPackContent(com.aviary.android.feather.cds.m.a a1)
    {
        z.c("setPackContent: %s", new Object[] {
            a1
        });
        if (b() && f >= 0L && d != null)
        {
            if (a1 == null || a1.f() == null)
            {
                z.d("pack or pack.content are null!");
                e();
                return;
            }
            e = a1;
            f = a1.p();
            m.setVisibility(8);
            q.setText(e.f().f());
            q.setSelected(true);
            AviaryTextView aviarytextview = r;
            if (e.f().g() != null)
            {
                a1 = e.f().g();
            } else
            {
                a1 = "";
            }
            aviarytextview.setText(a1);
            if (h != null)
            {
                h.a(e.a());
            }
            a(getContext().getResources(), e.b());
            j.a(getContext());
            j.a(k);
            j.b(com.aviary.android.feather.cds.a.a(e.b()));
            j.a(null);
            u.setVisibility(4);
            if (v != null)
            {
                v.requestFocus();
                v.requestFocusFromTouch();
            }
            if (i != null)
            {
                if (i.m().e())
                {
                    a(((e) (null)));
                    return;
                } else
                {
                    i.m().a(true, this);
                    return;
                }
            }
        }
    }

    void a()
    {
        if (!b() || e == null || d == null)
        {
            return;
        } else
        {
            z.b("onServiceFinished");
            d();
            return;
        }
    }

    public void a(int i1, int j1)
    {
        boolean flag;
        flag = false;
        z.b((new StringBuilder()).append("onPageChanged: ").append(j1).append(" >> ").append(i1).toString());
        break MISSING_BLOCK_LABEL_41;
_L6:
        d d1;
        int k1;
        int l1;
        int i2;
        int j2;
        do
        {
            return;
        } while (!x || getContext() == null || t == null);
        d1 = (d)t.getAdapter();
        l1 = i1 * c;
        i2 = c;
        j2 = d1.b();
        k1 = l1;
_L2:
        Object obj;
        if (k1 >= l1 + i2)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (CellLayout)t.b(i1);
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = (ImageView)((CellLayout) (obj)).getChildAt(k1 - l1);
        int k2 = t.getWidth() / b;
        int l2 = t.getHeight() / a;
        if (k1 < j2)
        {
            d1.a(k1 * 60, k1, ((ImageView) (obj)), false, k2, l2);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        if (!x || j1 == i1) goto _L6; else goto _L5
_L5:
        CellLayout celllayout = (CellLayout)t.b(j1);
        if (celllayout != null)
        {
            i1 = ((flag) ? 1 : 0);
            while (i1 < celllayout.getChildCount()) 
            {
                ImageView imageview = (ImageView)celllayout.getChildAt(i1).findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
                if (imageview != null)
                {
                    imageview.setImageBitmap(null);
                    imageview.setTag(null);
                }
                i1++;
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    void a(long l1, String s1, int i1)
    {
        if (b() && e != null && d != null)
        {
            z.c("onDownloadStatusChanged: %d, %s, %d", new Object[] {
                Long.valueOf(l1), s1, Integer.valueOf(i1)
            });
            if (l1 == e.p())
            {
                (new a(e.p())).execute(new com.aviary.android.feather.cds.billing.util.f[] {
                    i.c
                });
            }
        }
    }

    void a(long l1, String s1, Purchase purchase)
    {
        if (b() && e != null && l1 == e.p())
        {
            z.c("onPurchaseSuccess: %d - %s", new Object[] {
                Long.valueOf(l1), s1
            });
            (new a(e.p())).execute(new com.aviary.android.feather.cds.billing.util.f[] {
                i.c
            });
        }
    }

    public void a(e e1)
    {
        z.c("onIabSetupFinished: %s", new Object[] {
            e1
        });
        if (b() && e != null && d != null)
        {
            (new a(e.p())).execute(new com.aviary.android.feather.cds.billing.util.f[] {
                i.c
            });
            (new b()).execute(new Long[] {
                Long.valueOf(e.p())
            });
        }
    }

    void a(com.aviary.android.feather.cds.h.b b1, long l1)
    {
        z.c("setPackOption: %s", new Object[] {
            b1
        });
        if (s != null)
        {
            s.a(b1, l1);
        }
    }

    public void a(f.a a1, com.aviary.android.feather.sdk.widget.f f1)
    {
        z.c("update: %s", new Object[] {
            a1
        });
        z.b("isValidContext: %b", new Object[] {
            Boolean.valueOf(b())
        });
        while (a1 == null || !b() || !f1.m().d()) 
        {
            return;
        }
        i = f1;
        d = (f.a)a1.clone();
        f = d.a();
        e = null;
        a(new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.g), -1L);
        q.setText("");
        r.setText("");
        j.changeCursor(null);
        t.setTag(null);
        n.setVisibility(8);
        setPackContent(com.aviary.android.feather.cds.h.c(getContext(), f));
        d();
    }

    void a(String s1, int i1)
    {
        if (b() && e != null && d != null)
        {
            z.c("onSubscriptionPurchased: %s, %d", new Object[] {
                s1, Integer.valueOf(i1)
            });
            (new a(e.p())).execute(new com.aviary.android.feather.cds.billing.util.f[] {
                i.c
            });
        }
    }

    void b(long l1, String s1, int i1)
    {
        if (b() && e != null && l1 == e.p())
        {
            z.c("onPackInstalled: %d, %s, %d", new Object[] {
                Long.valueOf(l1), s1, Integer.valueOf(i1)
            });
            (new a(e.p())).execute(new com.aviary.android.feather.cds.billing.util.f[] {
                i.c
            });
        }
    }

    boolean b()
    {
        return y && getContext() != null;
    }

    public f.a getData()
    {
        return d;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        z.b("onAttachedToWindow");
        y = true;
        h = (BadgeService)((FeatherActivity)getContext()).A().a(com/aviary/android/feather/library/services/BadgeService);
        g = Picasso.a(getContext());
        s = (IAPBuyButton)findViewById(com.aviary.android.feather.sdk.R.id.aviary_buy_button);
        v = findViewById(com.aviary.android.feather.sdk.R.id.aviary_head);
        q = (AviaryTextView)findViewById(com.aviary.android.feather.sdk.R.id.aviary_title);
        r = (AviaryTextView)findViewById(com.aviary.android.feather.sdk.R.id.aviary_description);
        t = (AviaryWorkspace)findViewById(com.aviary.android.feather.sdk.R.id.aviary_workspace);
        u = (AviaryWorkspaceIndicator)findViewById(com.aviary.android.feather.sdk.R.id.aviary_workspace_indicator);
        m = findViewById(com.aviary.android.feather.sdk.R.id.aviary_progress);
        w = findViewById(com.aviary.android.feather.sdk.R.id.aviary_subscription_banner);
        n = findViewById(com.aviary.android.feather.sdk.R.id.aviary_error_message);
        if (n != null)
        {
            o = (TextView)n.findViewById(com.aviary.android.feather.sdk.R.id.aviary_retry_text);
            p = (TextView)n.findViewById(com.aviary.android.feather.sdk.R.id.aviary_retry_button);
            if (p != null)
            {
                p.setOnClickListener(this);
            }
        }
        s.setOnClickListener(this);
        j = new d(getContext(), null, -1, null);
        t.setAdapter(j);
        t.setIndicator(u);
    }

    public void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 == p.getId())
        {
            a(getData(), i);
        } else
        {
            if (i1 == w.getId())
            {
                i.a("shop_details");
                return;
            }
            if (i1 == s.getId())
            {
                view = ((IAPBuyButton)view).getPackOption();
                static class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.aviary.android.feather.cds.h.a.values().length];
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.j.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.h.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.e.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.g.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.i.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.aviary.android.feather.cds.h.a.k.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (view != null)
                {
                    switch (com.aviary.android.feather.sdk.widget._cls1.a[((com.aviary.android.feather.cds.h.b) (view)).b.ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                        i.m().a(e.p(), e.a(), e.b(), "shop_detail", ((com.aviary.android.feather.cds.h.b) (view)).a);
                        return;

                    case 2: // '\002'
                    case 3: // '\003'
                    case 4: // '\004'
                    case 5: // '\005'
                        boolean flag;
                        boolean flag1;
                        boolean flag2;
                        boolean flag3;
                        if (((com.aviary.android.feather.cds.h.b) (view)).b == com.aviary.android.feather.cds.h.a.b)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (((com.aviary.android.feather.cds.h.b) (view)).b == com.aviary.android.feather.cds.h.a.d)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (((com.aviary.android.feather.cds.h.b) (view)).b == com.aviary.android.feather.cds.h.a.j)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        if (((com.aviary.android.feather.cds.h.b) (view)).b == com.aviary.android.feather.cds.h.a.c)
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                        i.m().a(e.p(), e.a(), e.b(), "shop_detail", flag1, flag, flag2, flag3);
                        return;

                    case 6: // '\006'
                        a(new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.g), f);
                        i.m().a(true, this);
                        return;

                    case 7: // '\007'
                    case 8: // '\b'
                    case 9: // '\t'
                    case 10: // '\n'
                        z.a("Do nothing here");
                        return;
                    }
                }
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        z.b("onDetachedFromWindow");
        try
        {
            i.b().h().a("shop_details: closed");
        }
        catch (Throwable throwable) { }
        s.setOnClickListener(null);
        w.setOnClickListener(null);
        p.setOnClickListener(null);
        t.setTag(null);
        j.changeCursor(null);
        t.setAdapter(null);
        t.setOnPageChangeListener(null);
        y = false;
        super.onDetachedFromWindow();
    }

    static 
    {
        z = com.aviary.android.feather.common.a.a.a("IAPDialogDetail", com.aviary.android.feather.common.a.a.d.a);
    }
}
