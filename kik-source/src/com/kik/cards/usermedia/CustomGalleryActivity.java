// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.cache.c;
import com.kik.cache.d;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.sdkutils.LazyLoadingImage;
import com.kik.sdkutils.ab;
import com.kik.sdkutils.b.b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.KikActivityBase;
import kik.android.util.cv;
import kik.android.widget.UserMediaImageThumbNailList;

// Referenced classes of package com.kik.cards.usermedia:
//            f, g, r, c, 
//            o, d, e, q

public class CustomGalleryActivity extends KikActivityBase
{
    abstract class a extends CursorAdapter
    {

        protected int a;
        final CustomGalleryActivity b;

        protected void a(int i1)
        {
            a = (b.getResources().getDisplayMetrics().widthPixels - (i1 + 1) * KikApplication.a(2)) / i1;
        }

        public boolean hasStableIds()
        {
            return true;
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            context = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030071, viewgroup, false);
            cursor = new a(this);
            cursor.a = (RelativeLayout)context.findViewById(0x7f0e0179);
            cursor.c = (LazyLoadingImage)context.findViewById(0x7f0e017a);
            cursor.b = (ImageView)context.findViewById(0x7f0e017c);
            cursor.d = context.findViewById(0x7f0e017b);
            cursor.e = null;
            context.setTag(cursor);
            return context;
        }

        public a(Context context, Cursor cursor, int i1)
        {
            b = CustomGalleryActivity.this;
            super(context, cursor);
            a(i1);
        }
    }

    protected final class a.a
    {

        RelativeLayout a;
        ImageView b;
        LazyLoadingImage c;
        View d;
        q e;
        final a f;

        protected a.a(a a1)
        {
            f = a1;
            super();
        }
    }

    final class b extends a
    {

        Map c;
        int d;
        final CustomGalleryActivity e;

        protected final void a(int i1)
        {
            super.a(i1);
            d = i1;
        }

        public final void a(q q1)
        {
            if (q1 != null)
            {
                CustomGalleryActivity.a(e).remove(q1.a());
            }
            com.kik.cards.usermedia.CustomGalleryActivity.f(e).a(q1);
            if (c.containsKey(q1))
            {
                q1 = (a.a)c.get(q1);
                ((a.a) (q1)).b.setImageResource(0x7f070047);
                cv.e(new View[] {
                    ((a.a) (q1)).d
                });
            }
            e.a();
        }

        public final void bindView(View view, Context context, Cursor cursor)
        {
            view = (a.a)view.getTag();
            if (((a.a) (view)).e != null)
            {
                c.remove(((a.a) (view)).e);
            }
            int i1 = cursor.getPosition();
            long l1 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            context = new q(Long.valueOf(l1), cursor.getInt(cursor.getColumnIndexOrThrow("orientation")));
            ((a.a) (view)).c.a(context, com.kik.cards.usermedia.CustomGalleryActivity.d(e), com.kik.cards.usermedia.CustomGalleryActivity.d(e).c(), CustomGalleryActivity.e(e));
            ((a.a) (view)).a.setOnClickListener(new a(this, i1, view));
            cursor = (android.widget.AbsListView.LayoutParams)((a.a) (view)).a.getLayoutParams();
            cursor.width = a;
            cursor.height = a;
            ((a.a) (view)).a.setLayoutParams(cursor);
            view.e = context;
            c.put(context, view);
            if (CustomGalleryActivity.a(e).containsKey(Long.valueOf(l1)))
            {
                ((a.a) (view)).b.setImageResource(0x7f070048);
                cv.b(new View[] {
                    ((a.a) (view)).d
                });
                return;
            } else
            {
                ((a.a) (view)).b.setImageResource(0x7f070047);
                cv.e(new View[] {
                    ((a.a) (view)).d
                });
                return;
            }
        }

        public b(Context context, Cursor cursor, int i1)
        {
            e = CustomGalleryActivity.this;
            super(context, cursor, i1);
            c = new HashMap();
            d = 0;
            d = i1;
        }
    }

    final class b.a
        implements android.view.View.OnClickListener
    {

        final b a;
        private int b;
        private a.a c;

        public final void onClick(View view)
        {
            CustomGalleryActivity.g(a.e).moveToPosition(b);
            long l1 = CustomGalleryActivity.g(a.e).getLong(CustomGalleryActivity.g(a.e).getColumnIndexOrThrow("_id"));
            view = new q(Long.valueOf(l1), CustomGalleryActivity.g(a.e).getInt(CustomGalleryActivity.g(a.e).getColumnIndexOrThrow("orientation")));
            String s1 = CustomGalleryActivity.g(a.e).getString(CustomGalleryActivity.g(a.e).getColumnIndexOrThrow("_data"));
            if (CustomGalleryActivity.a(a.e).remove(Long.valueOf(l1)) == null && CustomGalleryActivity.a(a.e).size() < CustomGalleryActivity.h(a.e))
            {
                CustomGalleryActivity.a(a.e).put(Long.valueOf(l1), a.e. new d(s1, Long.valueOf(ab.a())));
                a.e.a(b);
            } else
            if (CustomGalleryActivity.a(a.e).size() >= CustomGalleryActivity.h(a.e))
            {
                com.kik.cards.usermedia.CustomGalleryActivity.i(a.e).show();
            }
            if (CustomGalleryActivity.a(a.e).containsKey(Long.valueOf(l1)))
            {
                com.kik.cards.usermedia.CustomGalleryActivity.f(a.e).a(CustomGalleryActivity.j(a.e), com.kik.cards.usermedia.CustomGalleryActivity.d(a.e).c(), CustomGalleryActivity.e(a.e), view);
            } else
            {
                com.kik.cards.usermedia.CustomGalleryActivity.f(a.e).a(view);
            }
            a.e.a();
            if (CustomGalleryActivity.a(a.e).containsKey(Long.valueOf(l1)))
            {
                c.b.setImageResource(0x7f070048);
                cv.b(new View[] {
                    c.d
                });
                return;
            } else
            {
                cv.e(new View[] {
                    c.d
                });
                c.b.setImageResource(0x7f070047);
                return;
            }
        }

        public b.a(b b1, int i1, a.a a1)
        {
            a = b1;
            super();
            b = i1;
            c = a1;
        }
    }

    private final class c
        implements Comparator
    {

        final CustomGalleryActivity a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (d)obj;
            obj1 = (d)obj1;
            return ((d) (obj)).a().compareTo(((d) (obj1)).a());
        }

        private c()
        {
            a = CustomGalleryActivity.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d
    {

        final CustomGalleryActivity a;
        private String b;
        private Long c;

        public final Long a()
        {
            return c;
        }

        public final String b()
        {
            return b;
        }

        public d(String s1, Long long1)
        {
            a = CustomGalleryActivity.this;
            super();
            b = s1;
            c = long1;
        }
    }


    i a;
    private int e;
    private Cursor f;
    private GridView g;
    private View h;
    private LinearLayout i;
    private View j;
    private UserMediaImageThumbNailList k;
    private TextView l;
    private o m;
    private com.kik.cache.d n;
    private com.kik.cache.c o;
    private com.kik.sdkutils.b.b p;
    private HashMap q;
    private f r;
    private int s;
    private Toast t;

    public CustomGalleryActivity()
    {
        e = 0;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = new HashMap();
        r = new f();
        s = 0;
        t = null;
        a = new com.kik.cards.usermedia.f(this);
    }

    static HashMap a(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.q;
    }

    static int b(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.s;
    }

    static GridView c(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.g;
    }

    static com.kik.cache.d d(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.n;
    }

    static com.kik.sdkutils.b.b e(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.p;
    }

    static UserMediaImageThumbNailList f(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.k;
    }

    static Cursor g(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.f;
    }

    static int h(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.e;
    }

    static Toast i(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.t;
    }

    static com.kik.cache.c j(CustomGalleryActivity customgalleryactivity)
    {
        return customgalleryactivity.o;
    }

    protected final void a()
    {
        cv.b(new View[] {
            l
        });
        if (q.size() == 0)
        {
            l.setText(getString(0x7f090307));
        } else
        if (q.size() == 1)
        {
            l.setText(String.format(getString(0x7f0902ee), new Object[] {
                Integer.valueOf(q.size())
            }));
        } else
        {
            l.setText(String.format(getString(0x7f0902ef), new Object[] {
                Integer.valueOf(q.size())
            }));
        }
        if (q.size() <= 0)
        {
            cv.e(new View[] {
                i, j
            });
        }
    }

    protected final void a(int i1)
    {
        int j1 = ((b)g.getAdapter()).d;
        cv.b(new View[] {
            i, j
        });
        int l1 = g.getAdapter().getCount();
        int k1 = l1 % j1;
        if (k1 != 0)
        {
            j1 = k1;
        }
        if (i1 >= l1 - j1)
        {
            g.smoothScrollToPosition(i1);
            g.postDelayed(new g(this, i1), 100L);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        a a1;
        byte byte0;
        byte0 = 3;
        super.onConfigurationChanged(configuration);
        a1 = (a)g.getAdapter();
        if (configuration.orientation != 1) goto _L2; else goto _L1
_L1:
        g.setNumColumns(3);
_L4:
        a1.a(byte0);
        a1.notifyDataSetChanged();
        g.requestLayout();
        return;
_L2:
        if (configuration.orientation == 2)
        {
            g.setNumColumns(5);
            byte0 = 5;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        e = bundle.getInt("extra.maxselections");
        s = bundle.getInt("extra.minselections", 0);
        setContentView(0x7f03000c);
        bundle = new r();
        p = new com.kik.cards.usermedia.c();
        m = new o(bundle, getContentResolver(), getResources());
        n = new com.kik.cache.c(m, bundle, p, (Math.min(Math.max(16, ((ActivityManager)getSystemService("activity")).getMemoryClass()), 64) / 16) * 25);
        o = new com.kik.cache.c(m, bundle, p, e);
        g = (GridView)findViewById(0x7f0e0060);
        h = findViewById(0x7f0e0136);
        i = (LinearLayout)findViewById(0x7f0e005e);
        j = findViewById(0x7f0e0061);
        k = (UserMediaImageThumbNailList)findViewById(0x7f0e0135);
        l = (TextView)findViewById(0x7f0e0078);
        f = managedQuery(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id", "_size", "_data", "date_added", "orientation"
        }, "", null, "date_added DESC");
        byte byte0;
        if (getResources().getConfiguration().orientation == 1)
        {
            byte0 = 3;
        } else
        {
            byte0 = 5;
        }
        g.setNumColumns(byte0);
        bundle = new b(this, f, byte0);
        g.setAdapter(bundle);
        if (e == 1)
        {
            bundle = getString(0x7f09032a);
        } else
        {
            bundle = getString(0x7f09032c, new Object[] {
                Integer.valueOf(e)
            });
        }
        t = Toast.makeText(this, bundle, 0);
        if (g == null || g.getCount() == 0)
        {
            cv.b(new View[] {
                findViewById(0x7f0e005f)
            });
        } else
        {
            cv.e(new View[] {
                findViewById(0x7f0e005f)
            });
        }
        setResult(0);
        h.setOnClickListener(new com.kik.cards.usermedia.d(this));
        r.a(k.a(), a);
        a();
        bundle = findViewById(0x7f0e001d);
        if (bundle != null)
        {
            bundle.setOnClickListener(new e(this));
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        m.d();
        r.a();
        n.b();
        n = null;
        o.b();
        o = null;
    }
}
