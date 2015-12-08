// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.support.v4.widget.CursorAdapter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.aviary.android.feather.cds.billing.util.Purchase;
import com.aviary.android.feather.cds.billing.util.e;
import com.aviary.android.feather.cds.billing.util.h;
import com.aviary.android.feather.cds.i;
import com.aviary.android.feather.cds.p;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.f;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.library.services.LocalDataService;
import com.aviary.android.feather.sdk.AviaryMainController;
import com.aviary.android.feather.sdk.FeatherActivity;
import com.nineoldandroids.a.k;
import it.sephiroth.android.library.picasso.Picasso;
import it.sephiroth.android.library.picasso.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            f, b, IAPBuyButton

public class IAPDialogList extends LinearLayout
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, com.aviary.android.feather.cds.billing.util.d.d
{
    class a extends com.a.a.a.a.a
    {

        final IAPDialogList a;

        protected com.nineoldandroids.a.a a(ViewGroup viewgroup, View view)
        {
            return com.nineoldandroids.a.k.a(view, "translationY", new float[] {
                (float)(view.getHeight() / 2), 0.0F
            });
        }

        public a(BaseAdapter baseadapter)
        {
            a = IAPDialogList.this;
            super(baseadapter);
        }
    }

    private class b extends CursorAdapter
    {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        final IAPDialogList g;

        protected void a(Cursor cursor)
        {
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.c("initCursor: %s", new Object[] {
                cursor
            });
            if (cursor != null)
            {
                a = cursor.getColumnIndex("pack_id");
                b = cursor.getColumnIndex("content_displayName");
                c = cursor.getColumnIndex("content_iconPath");
                d = cursor.getColumnIndex("pack_identifier");
                e = cursor.getColumnIndex("content_numItems");
            }
        }

        public void bindView(View view, Context context, Cursor cursor)
        {
            a a1;
            int i1;
            i1 = getItemViewType(cursor.getPosition());
            a1 = (a)view.getTag();
            if (a1 != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (i1 != 0) goto _L4; else goto _L3
_L3:
            long l1 = cursor.getLong(a);
            view = cursor.getString(b);
            context = cursor.getString(c);
            String s = cursor.getString(d);
            int k1 = cursor.getInt(e);
            if (context != null)
            {
                cursor = ((Cursor) (a1.e.getTag()));
                int j1 = context.hashCode();
                boolean flag;
                boolean flag1;
                if ((cursor instanceof Integer) && ((Integer)cursor).intValue() == j1)
                {
                    com.aviary.android.feather.sdk.widget.IAPDialogList.a.c("no need to download the icon again");
                    flag = false;
                } else
                {
                    flag = true;
                }
                flag1 = flag;
                if (flag)
                {
                    IAPDialogList.d(g).a(context).a(f, f, true).d().a((new com.aviary.android.feather.sdk.utils.b.a()).a(g.getResources()).a(context).a(com.aviary.android.feather.sdk.widget.IAPDialogList.a(g).c()).b().a().c()).a(a1.e, new it.sephiroth.android.library.picasso.c(this, a1, context) {

                        final b.a a;
                        final String b;
                        final b c;

                        public void a()
                        {
                            a.e.setTag(Integer.valueOf(b.hashCode()));
                        }

                        public void b()
                        {
                        }

            
            {
                c = b1;
                a = a1;
                b = s;
                super();
            }
                    });
                    flag1 = flag;
                }
            } else
            {
                a1.e.setImageBitmap(null);
                a1.e.setTag(null);
                flag1 = true;
            }
            a1.a = l1;
            a1.b = s;
            if (flag1)
            {
                a1.c.setText(view);
                a1.a(k1, com.aviary.android.feather.sdk.widget.IAPDialogList.a(g).c());
            }
            if (IAPDialogList.b(g) == null || IAPDialogList.b(g).m() == null) goto _L1; else goto _L5
_L5:
            view = (com.aviary.android.feather.cds.h.a)IAPDialogList.b(g).a.get(Long.valueOf(a1.a));
            if (view == null && IAPDialogList.b(g).b.containsKey(Long.valueOf(a1.a)))
            {
                view = (com.aviary.android.feather.cds.h.a)IAPDialogList.b(g).b.get(Long.valueOf(a1.a));
            }
            if (view != null) goto _L7; else goto _L6
_L6:
            if (IAPDialogList.b(g).c == null) goto _L9; else goto _L8
_L8:
            if (!IAPDialogList.b(g).c.c(a1.b)) goto _L11; else goto _L10
_L10:
            view = new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.d);
_L13:
            context = view;
            if (view == null)
            {
                com.aviary.android.feather.sdk.widget.IAPDialogList.a.e("%d, option is null", new Object[] {
                    Long.valueOf(a1.a)
                });
                context = new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.h);
            }
            a1.f.a(context, a1.a);
            return;
_L11:
            if (IAPDialogList.b(g).c.d(a1.b))
            {
                view = IAPDialogList.b(g).c.a(a1.b);
                view = new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.a, view.b());
                continue; /* Loop/switch isn't completed */
            }
              goto _L9
_L7:
            view = new com.aviary.android.feather.cds.h.b(view);
            continue; /* Loop/switch isn't completed */
_L4:
            a1.c.setText(com.aviary.android.feather.sdk.R.string.feather_store_checking_additional_packs);
            return;
_L9:
            view = null;
            if (true) goto _L13; else goto _L12
_L12:
        }

        public int getItemViewType(int i1)
        {
            return getItemId(i1) <= -1L ? 1 : 0;
        }

        public int getViewTypeCount()
        {
            return 2;
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            int i1 = getItemViewType(cursor.getPosition());
            cursor = new a(this);
            if (i1 == 0)
            {
                context = LayoutInflater.from(context).inflate(com.aviary.android.feather.sdk.R.layout.aviary_iap_list_item, viewgroup, false);
                viewgroup = (IAPBuyButton)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_buy_button);
                TextView textview = (TextView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_title);
                TextView textview1 = (TextView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_text);
                ImageView imageview = (ImageView)context.findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
                cursor.c = textview;
                cursor.d = textview1;
                cursor.e = imageview;
                cursor.f = viewgroup;
                ((a) (cursor)).f.setOnClickListener(g);
            } else
            {
                context = LayoutInflater.from(context).inflate(0x1090003, viewgroup, false);
                cursor.c = (TextView)context.findViewById(0x1020014);
            }
            context.setTag(cursor);
            return context;
        }

        public Cursor swapCursor(Cursor cursor)
        {
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.c("swapCursor: %s", new Object[] {
                cursor
            });
            a(cursor);
            return super.swapCursor(cursor);
        }

        public b(Context context, Cursor cursor)
        {
            g = IAPDialogList.this;
            super(context, cursor, false);
            f = context.getResources().getDimensionPixelSize(com.aviary.android.feather.sdk.R.dimen.aviary_store_list_icon_size);
            a(cursor);
        }
    }

    class b.a
    {

        long a;
        String b;
        TextView c;
        TextView d;
        ImageView e;
        IAPBuyButton f;
        com.aviary.android.feather.cds.a.b g;
        int h;
        final b i;

        public void a()
        {
            StringBuilder stringbuilder = new StringBuilder();
            String s = com.aviary.android.feather.sdk.utils.a.a(i.g.getContext(), g);
            if (h > 0)
            {
                stringbuilder.append((new StringBuilder()).append(h).append(" ").append(s).toString());
            } else
            {
                stringbuilder.append("");
            }
            d.setText(stringbuilder.toString());
        }

        public void a(int i1, com.aviary.android.feather.cds.a.b b1)
        {
            g = b1;
            h = i1;
            a();
        }

        b.a(b b1)
        {
            i = b1;
            super();
            h = 0;
        }
    }

    class c extends com.aviary.android.feather.common.utils.os.a
    {

        Cursor a;
        Cursor b;
        Cursor c;
        List d;
        int e;
        com.aviary.android.feather.cds.a.b f;
        com.aviary.android.feather.cds.billing.util.f g;
        final IAPDialogList h;

        private void a(List list, Cursor cursor)
        {
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("removeFromCursor");
            do
            {
                if (!cursor.moveToNext())
                {
                    break;
                }
                com.aviary.android.feather.cds.m.a a1 = com.aviary.android.feather.cds.m.a.a(cursor);
                if (list.contains(a1.a()))
                {
                    com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("\tremoving: %s", new Object[] {
                        a1.a()
                    });
                    list.remove(a1.a());
                }
            } while (true);
        }

        com.aviary.android.feather.cds.billing.util.f a(Cursor cursor, i i1)
            throws com.aviary.android.feather.cds.billing.util.c
        {
            Object obj = null;
            com.aviary.android.feather.cds.billing.util.f f1 = obj;
            if (cursor != null)
            {
                ArrayList arraylist = new ArrayList();
                for (; cursor.moveToNext(); arraylist.add(com.aviary.android.feather.cds.m.a.a(cursor).a())) { }
                f1 = obj;
                if (i1.c())
                {
                    f1 = i1.a(true, arraylist, null);
                }
            }
            return f1;
        }

        protected transient HashMap a(com.aviary.android.feather.cds.a.b ab[])
        {
            com.aviary.android.feather.sdk.widget.b b1;
            e e1;
            HashMap hashmap;
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("QueryInventoryAsyncTask::doInBackground");
            hashmap = new HashMap();
            f = ab[0];
            b1 = IAPDialogList.b(h).m();
            e1 = b1.f().a();
            if (IAPDialogList.b(h) != null && h.c()) goto _L2; else goto _L1
_L1:
            return hashmap;
_L2:
            try
            {
                a = h.a(f);
            }
            catch (SQLiteException sqliteexception)
            {
                sqliteexception.printStackTrace();
            }
            if (a == null || e1 == null || !e1.c() || g != null) goto _L4; else goto _L3
_L3:
            g = a(a, b1.f());
            a.moveToPosition(-1);
_L4:
            if (IAPDialogList.b(h) == null || !h.c()) goto _L1; else goto _L5
_L5:
            Object obj1 = null;
            Object obj = obj1;
            if (g != null)
            {
                d = a(g, ab[0]);
                obj = obj1;
                if (d != null)
                {
                    obj = (new StringBuilder()).append("pack_identifier IN (").append(com.aviary.android.feather.cds.h.a(d)).append(")").toString();
                }
            }
            static class _cls4
            {

                static final int a[];

                static 
                {
                    a = new int[com.aviary.android.feather.cds.h.a.values().length];
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.f.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.c.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.j.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.h.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.e.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.g.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.i.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.h.a.k.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            Exception exception;
            if (obj != null)
            {
                try
                {
                    b = h.a(ab[0], ((String) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (com.aviary.android.feather.cds.a.b ab[])
                {
                    ab.printStackTrace();
                }
            }
            if (a == null) goto _L1; else goto _L6
_L6:
            if (b != null)
            {
                c = new MergeCursor(new Cursor[] {
                    a, b
                });
            } else
            {
                c = a;
            }
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("final cursor size: %d", new Object[] {
                Integer.valueOf(c.getCount())
            });
_L11:
            if (!c.moveToNext()) goto _L1; else goto _L7
_L7:
            ab = com.aviary.android.feather.cds.m.a.a(c);
            ab.a(com.aviary.android.feather.cds.n.a.a(c));
            obj = com.aviary.android.feather.cds.h.a(h.getContext(), ab);
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("result: %s", new Object[] {
                obj
            });
            com.aviary.android.feather.sdk.widget._cls4.a[((com.aviary.android.feather.cds.h.a) (obj)).ordinal()];
            JVM INSTR tableswitch 9 9: default 482
        //                       9 314;
               goto _L8 _L9
_L9:
            continue; /* Loop/switch isn't completed */
_L8:
            hashmap.put(Long.valueOf(ab.p()), obj);
            if (true) goto _L11; else goto _L10
_L10:
            ab;
            throw ab;
            exception;
            exception.printStackTrace();
            a.moveToPosition(-1);
              goto _L4
            ab;
            a.moveToPosition(-1);
            throw ab;
        }

        List a(com.aviary.android.feather.cds.billing.util.f f1, com.aviary.android.feather.cds.a.b b1)
        {
            com.aviary.android.feather.cds.billing.util.f f2 = null;
            if (f1 != null)
            {
                f1 = f1.e("inapp");
                f2 = f1;
                if (f1 != null)
                {
                    com.aviary.android.feather.cds.h.b(f1, b1.a());
                    f2 = f1;
                }
            }
            return f2;
        }

        protected void a()
        {
        }

        protected volatile void a(Object obj)
        {
            a((HashMap)obj);
        }

        protected void a(HashMap hashmap)
        {
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("QueryInventoryAsyncTask::PostExecute");
            com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("result: %s", new Object[] {
                hashmap
            });
            if (!h.c() || IAPDialogList.b(h) == null)
            {
                return;
            }
            Context context = h.getContext();
            Object obj = IAPDialogList.b(h).m().f().a();
            if (obj != null && ((e) (obj)).d())
            {
                com.aviary.android.feather.sdk.widget.IAPDialogList.a.c(((e) (obj)).b());
                String s;
                if (((e) (obj)).a() != -1011)
                {
                    if (!"amazon".equals("production"))
                    {
                        Toast.makeText(context, ((e) (obj)).b(), 0).show();
                    } else
                    {
                        com.aviary.android.feather.sdk.widget.IAPDialogList.a.d("failure: %s", new Object[] {
                            ((e) (obj)).b()
                        });
                    }
                }
            }
            if (c != null && d != null)
            {
                c.moveToPosition(-1);
                a(d, c);
                if (d.size() > 0 && e == 0)
                {
                    com.aviary.android.feather.sdk.widget.IAPDialogList.a.a("need to download missing packs...");
                    obj = new MatrixCursor(c.getColumnNames());
                    ((MatrixCursor) (obj)).addRow(new Object[] {
                        Integer.valueOf(-1), Integer.valueOf(-1), "", "", Integer.valueOf(-1), "", "", "", "", "", 
                        Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(0)
                    });
                    c = new MergeCursor(new Cursor[] {
                        c, obj
                    });
                    obj = (String)com.aviary.android.feather.sdk.widget.IAPDialogList.e(h).a("extra-api-key-secret", "");
                    s = (String)com.aviary.android.feather.sdk.widget.IAPDialogList.e(h).a("extra-billing-public-key", "");
                    context.startService(com.aviary.android.feather.common.a.c(context, f.a(), ((String) (obj)), s));
                }
            }
            IAPDialogList.b(h).b.clear();
            IAPDialogList.b(h).b.putAll(hashmap);
            IAPDialogList.b(h).c = g;
            com.aviary.android.feather.sdk.widget.IAPDialogList.f(h).changeCursor(c);
            IAPDialogList.g(h).setVisibility(8);
            com.aviary.android.feather.sdk.widget.IAPDialogList.h(h).setVisibility(8);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((com.aviary.android.feather.cds.a.b[])aobj);
        }

        public c(int i1, com.aviary.android.feather.cds.billing.util.f f1)
        {
            h = IAPDialogList.this;
            super();
            e = i1;
            g = f1;
        }
    }

    static interface d
    {

        public abstract void a(long l1, com.aviary.android.feather.cds.a.b b1, String s);
    }


    static com.aviary.android.feather.common.a.a.c a;
    BroadcastReceiver b;
    private boolean c;
    private f.a d;
    private CursorAdapter e;
    private com.a.a.a.a f;
    private com.aviary.android.feather.sdk.widget.f g;
    private ListView h;
    private Button i;
    private View j;
    private View k;
    private Button l;
    private View m;
    private d n;
    private Picasso o;
    private LocalDataService p;

    public IAPDialogList(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new BroadcastReceiver() {

            final IAPDialogList a;

            public void onReceive(Context context1, Intent intent)
            {
                com.aviary.android.feather.sdk.widget.IAPDialogList.a.b("downloadMissingPacksCompletedReceiver");
                int i1;
                if (context1 != null && intent != null)
                {
                    context1 = intent.getStringExtra("packType");
                    i1 = intent.getIntExtra("error", 0);
                    break MISSING_BLOCK_LABEL_33;
                }
                do
                {
                    return;
                } while (!a.c() || context1 == null || com.aviary.android.feather.sdk.widget.IAPDialogList.a(a) == null || com.aviary.android.feather.sdk.widget.IAPDialogList.a(a).c() == null || !context1.equals(com.aviary.android.feather.sdk.widget.IAPDialogList.a(a).c().a()));
                a.a(i1, IAPDialogList.b(a).c);
            }

            
            {
                a = IAPDialogList.this;
                super();
            }
        };
    }

    static f.a a(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.d;
    }

    static com.aviary.android.feather.sdk.widget.f b(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.g;
    }

    static ListView c(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.h;
    }

    static Picasso d(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.o;
    }

    private void d()
    {
        a.b("onUpdate");
        if (!c() || getHandler() == null)
        {
            return;
        } else
        {
            k.setVisibility(8);
            int i1 = getResources().getInteger(0x10e0001);
            getHandler().postDelayed(new Runnable() {

                final IAPDialogList a;

                public void run()
                {
                    a.a(0, null);
                }

            
            {
                a = IAPDialogList.this;
                super();
            }
            }, i1 + 300);
            return;
        }
    }

    static LocalDataService e(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.p;
    }

    private void e()
    {
        a.b("onError");
        j.setVisibility(8);
        k.setVisibility(0);
    }

    static CursorAdapter f(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.e;
    }

    private void f()
    {
        a.b("onRestoreAll");
        Toast.makeText(getContext(), com.aviary.android.feather.sdk.R.string.feather_restore_all_request_sent, 0).show();
        Object obj = (String)p.a("extra-api-key-secret", "");
        String s = (String)p.a("extra-billing-public-key", "");
        obj = com.aviary.android.feather.common.a.b(getContext(), d.c().a(), ((String) (obj)), s);
        if (g.l().startService(((Intent) (obj))) != null)
        {
            g();
        }
    }

    static View g(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.j;
    }

    private void g()
    {
        Context context = getContext();
        if (context != null)
        {
            android.support.v4.app.NotificationCompat.Builder builder = com.aviary.android.feather.cds.p.a(context);
            builder.setProgress(100, 0, true);
            ((NotificationManager)context.getSystemService("notification")).notify(22322, builder.build());
        }
    }

    static View h(IAPDialogList iapdialoglist)
    {
        return iapdialoglist.k;
    }

    protected Cursor a(com.aviary.android.feather.cds.a.b b1)
        throws SQLiteException
    {
        a.c("createCursorForAvailablePAcks(%s)", new Object[] {
            b1
        });
        if (!c())
        {
            return null;
        } else
        {
            b1 = (new StringBuilder()).append("pack/type/").append(b1.a()).append("/content/available/list").toString();
            return getContext().getContentResolver().query(com.aviary.android.feather.common.utils.f.a(getContext(), b1), new String[] {
                "pack_id as _id", "pack_id", "pack_type", "pack_identifier", "content_id", "content_contentPath", "content_contentURL", "content_displayName", "content_iconPath", "content_iconUrl", 
                "content_isFree", "content_purchased", "content_packId", "content_numItems"
            }, null, null, "content_purchased ASC, pack_displayOrder ASC");
        }
    }

    protected Cursor a(com.aviary.android.feather.cds.a.b b1, String s)
        throws SQLiteException
    {
        a.c("createCursorForHiddenPacks(%s)", new Object[] {
            b1
        });
        if (!c())
        {
            return null;
        }
        if (s == null)
        {
            throw new IllegalArgumentException("selection cannot be null");
        } else
        {
            b1 = (new StringBuilder()).append("pack/type/").append(b1.a()).append("/content/hidden/list").toString();
            return getContext().getContentResolver().query(com.aviary.android.feather.common.utils.f.a(getContext(), b1), new String[] {
                "pack_id as _id", "pack_id", "pack_type", "pack_identifier", "content_id", "content_contentPath", "content_contentURL", "content_displayName", "content_iconPath", "content_iconUrl", 
                "content_isFree", "content_purchased", "content_packId", "content_numItems"
            }, s, null, "content_purchased ASC, pack_displayOrder ASC");
        }
    }

    protected CursorAdapter a()
    {
        return new b(getContext(), null);
    }

    void a(int i1, com.aviary.android.feather.cds.billing.util.f f1)
    {
        a.b("runInventoryAsyncTask");
        (new c(i1, f1)).execute(new com.aviary.android.feather.cds.a.b[] {
            d.c()
        });
    }

    void a(long l1, String s, int i1)
    {
        if (e != null && d != null && c() && s != null && s.equals(d.c().a()))
        {
            a.c("onDownloadStatusChanged: id: %d, type: %s, status: %d", new Object[] {
                Long.valueOf(l1), s, Integer.valueOf(i1)
            });
            e.notifyDataSetChanged();
        }
    }

    void a(long l1, String s, Purchase purchase)
    {
        if (e != null && c() && d != null && s != null && s.equals(d.c().a()))
        {
            a.c("onPurchaseSuccess( %d, %s )", new Object[] {
                Long.valueOf(l1), s
            });
            e.notifyDataSetChanged();
        }
    }

    public void a(e e1)
    {
label0:
        {
            a.c("onIabSetupFinished: %s", new Object[] {
                e1
            });
            if (d != null && c())
            {
                if (e1 == null)
                {
                    break label0;
                }
                a.a("mData not null and result is success");
                d();
            }
            return;
        }
        e();
    }

    public void a(f.a a1, com.aviary.android.feather.sdk.widget.f f1)
    {
label0:
        {
            a.c("update: %s", new Object[] {
                a1
            });
            g = f1;
            d = (f.a)a1.clone();
            if (c() && g.m().d())
            {
                if (!g.m().e())
                {
                    break label0;
                }
                a.a("valid iabResult");
                d();
            }
            return;
        }
        a.a("setup not yet started");
        g.m().a(true, this);
    }

    void a(String s, int i1)
    {
        a.c("onSubscriptionPurchased: identifier: %s, purchased: %d", new Object[] {
            s, Integer.valueOf(i1)
        });
        if (e != null && c() && d != null)
        {
            a(0, g.c);
        }
    }

    void b()
    {
        a.b("onServiceFinished");
        if (c() && d != null)
        {
            a(0, ((com.aviary.android.feather.cds.billing.util.f) (null)));
        }
    }

    void b(long l1, String s, int i1)
    {
        if (e != null && c() && d != null && s != null && s.equals(d.c().a()))
        {
            a.c("onPackInstalled: id: %d, type: %s, purchased: %d", new Object[] {
                Long.valueOf(l1), s, Integer.valueOf(i1)
            });
            e.notifyDataSetChanged();
        }
    }

    boolean c()
    {
        return getContext() != null && c;
    }

    public f.a getData()
    {
        return d;
    }

    protected void onAttachedToWindow()
    {
        a.b("onAttachedToWindow");
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        FeatherActivity featheractivity = (FeatherActivity)getContext();
        c = true;
        h = (ListView)findViewById(0x102000a);
        i = (Button)findViewById(com.aviary.android.feather.sdk.R.id.aviary_restore_all_button);
        i.setOnClickListener(this);
        m = findViewById(com.aviary.android.feather.sdk.R.id.restore_all_container);
        j = findViewById(com.aviary.android.feather.sdk.R.id.aviary_iap_list_progress);
        k = findViewById(com.aviary.android.feather.sdk.R.id.aviary_error_message);
        l = (Button)k.findViewById(com.aviary.android.feather.sdk.R.id.aviary_retry_button);
        l.setOnClickListener(this);
        View view = m;
        byte byte0;
        if ("amazon".equals("production"))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        ((TextView)k.findViewById(com.aviary.android.feather.sdk.R.id.aviary_retry_text)).setText(com.aviary.android.feather.sdk.R.string.feather_an_error_occurred);
        o = Picasso.a(getContext());
        p = (LocalDataService)featheractivity.A().a(com/aviary/android/feather/library/services/LocalDataService);
        featheractivity.registerReceiver(b, new IntentFilter((new StringBuilder()).append(featheractivity.getPackageName()).append(".cds.downloadMissingPacksCompleted").toString()));
        h.setOnItemClickListener(this);
        h.setItemsCanFocus(true);
        e = a();
        if (android.os.Build.VERSION.SDK_INT >= 16 && com.aviary.android.feather.common.utils.l.e() >= 1000)
        {
            f = new a(e);
            f.a(h);
            h.setAdapter(f);
            return;
        } else
        {
            h.setAdapter(e);
            return;
        }
    }

    public void onClick(View view)
    {
        a.b("onClick");
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        i1 = view.getId();
        if (i1 == com.aviary.android.feather.sdk.R.id.aviary_restore_all_button)
        {
            f();
            return;
        }
        if (i1 == com.aviary.android.feather.sdk.R.id.aviary_retry_button)
        {
            j.setVisibility(0);
            k.setVisibility(8);
            a(d, g);
            return;
        }
        if (i1 != com.aviary.android.feather.sdk.R.id.aviary_buy_button || !(view instanceof IAPBuyButton)) goto _L1; else goto _L3
_L3:
        IAPBuyButton iapbuybutton;
        Object obj;
        iapbuybutton = (IAPBuyButton)view;
        obj = (ViewGroup)view.getParent();
        view = iapbuybutton.getPackOption();
        if (view == null || obj == null) goto _L1; else goto _L4
_L4:
        obj = (ViewGroup)((ViewGroup) (obj)).getParent();
        if (obj == null) goto _L1; else goto _L5
_L5:
        obj = ((ViewGroup) (obj)).getTag();
        if (!(obj instanceof b.a)) goto _L1; else goto _L6
_L6:
        obj = (b.a)obj;
        if (obj == null || ((b.a) (obj)).a < 0L || ((b.a) (obj)).b == null) goto _L1; else goto _L7
_L7:
        switch (com.aviary.android.feather.sdk.widget._cls4.a[((com.aviary.android.feather.cds.h.b) (view)).b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            g.m().a(((b.a) (obj)).a, ((b.a) (obj)).b, d.c().a(), "shop_list", ((com.aviary.android.feather.cds.h.b) (view)).a);
            return;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
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
            g.m().a(((b.a) (obj)).a, ((b.a) (obj)).b, d.c().a(), "top_store", flag1, flag, flag2, flag3);
            return;

        case 7: // '\007'
            g.b.put(Long.valueOf(((b.a) (obj)).a), com.aviary.android.feather.cds.h.a.g);
            iapbuybutton.a(new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.g), ((b.a) (obj)).a);
            g.m().a(true, this);
            return;

        case 2: // '\002'
            break;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected void onDetachedFromWindow()
    {
        a.b("onDetachedFromWindow");
        l.setOnClickListener(null);
        if (e != null)
        {
            e.changeCursor(null);
        }
        h.setAdapter(null);
        if (f != null)
        {
            f.a(null);
        }
        getContext().unregisterReceiver(b);
        c = false;
        super.onDetachedFromWindow();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        a.c("onItemClick: position: %d, id: %d", new Object[] {
            Integer.valueOf(i1), Long.valueOf(l1)
        });
        if (n != null && l1 > -1L)
        {
            adapterview = ((AdapterView) (view.getTag()));
            if (adapterview instanceof b.a)
            {
                adapterview = ((b.a)adapterview).b;
                n.a(l1, d.c(), adapterview);
            }
        }
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        a.b((new StringBuilder()).append("onVisibilityChanged: ").append(i1).toString());
        super.onVisibilityChanged(view, i1);
        if (i1 == 0)
        {
            getHandler().postDelayed(new Runnable() {

                final IAPDialogList a;

                public void run()
                {
                    if (IAPDialogList.c(a) != null)
                    {
                        IAPDialogList.c(a).clearFocus();
                        IAPDialogList.c(a).clearChoices();
                        IAPDialogList.c(a).invalidateViews();
                    }
                }

            
            {
                a = IAPDialogList.this;
                super();
            }
            }, 100L);
        }
    }

    public void setOnPackSelectedListener(d d1)
    {
        n = d1;
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("IAPDialogList", com.aviary.android.feather.common.a.a.d.a);
    }
}
