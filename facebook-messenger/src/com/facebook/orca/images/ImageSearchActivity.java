// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.analytics.bp;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.common.w.n;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.server.aq;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.cache.a;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.widget.titlebar.c;
import com.facebook.zero.ui.l;
import java.util.List;

// Referenced classes of package com.facebook.orca.images:
//            i, a, b, c, 
//            d, e, f, g

public class ImageSearchActivity extends i
    implements d
{

    private EmptyListViewItem A;
    private BlueServiceFragment B;
    private String C;
    private int D;
    private Bundle E;
    private String F;
    private int G;
    private int H;
    private com.facebook.zero.ui.o I;
    private l J;
    private com.facebook.orca.images.i p;
    private InputMethodManager q;
    private a r;
    private com.facebook.widget.titlebar.a s;
    private EditText t;
    private Button u;
    private GridView v;
    private RelativeLayout w;
    private TextView x;
    private TextView y;
    private TextView z;

    public ImageSearchActivity()
    {
        D = -1;
        G = -1;
    }

    static EditText a(ImageSearchActivity imagesearchactivity)
    {
        return imagesearchactivity.t;
    }

    static void a(ImageSearchActivity imagesearchactivity, int i1)
    {
        imagesearchactivity.c(i1);
    }

    static void a(ImageSearchActivity imagesearchactivity, Bundle bundle)
    {
        imagesearchactivity.c(bundle);
    }

    static void a(ImageSearchActivity imagesearchactivity, boolean flag)
    {
        imagesearchactivity.b(flag);
    }

    private void a(String s1, int i1)
    {
        if (B.a())
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("AppId", "D41D8CD98F00B204E9800998ECF8427E465C0750");
            bundle.putString("Query", s1);
            bundle.putString("Sources", "Image");
            bundle.putString("Version", "2.0");
            bundle.putString("Market", "en-us");
            bundle.putString("Adult", "Strict");
            bundle.putString("Image.Count", "8");
            bundle.putString("Image.Offset", Integer.toString(i1 * 8));
            G = i1;
            F = s1;
            B.a(aq.B, bundle);
            v.setVisibility(8);
            w.setVisibility(8);
            A.setVisibility(0);
            A.a(true);
            A.setMessage(getString(o.image_search_loading));
            return;
        }
    }

    static InputMethodManager b(ImageSearchActivity imagesearchactivity)
    {
        return imagesearchactivity.q;
    }

    private void b(boolean flag)
    {
        if (C != null)
        {
            if (flag && D > 0)
            {
                a(C, D - 1);
                return;
            }
            if (!flag && D < H - 1)
            {
                a(C, D + 1);
                return;
            }
        }
    }

    private void c(int i1)
    {
        Object obj = m.a(Uri.parse(((Bundle)p.a(i1).getParcelable("Thumbnail")).getString("Url"))).a();
        obj = r.f(((m) (obj)).i());
        if (obj != null)
        {
            Intent intent = new Intent();
            intent.setData(((Uri) (obj)));
            setResult(-1, intent);
            finish();
        }
    }

    private void c(Bundle bundle)
    {
        if (!d(bundle))
        {
            k();
            return;
        } else
        {
            bundle = (Bundle)bundle.getParcelable("SearchResponse");
            H = Math.min(((Bundle)bundle.getParcelable("Image")).getInt("Total") / 8, 8);
            D = G;
            C = F;
            E = bundle;
            G = -1;
            F = null;
            l();
            return;
        }
    }

    static void c(ImageSearchActivity imagesearchactivity)
    {
        imagesearchactivity.j();
    }

    static void d(ImageSearchActivity imagesearchactivity)
    {
        imagesearchactivity.k();
    }

    private boolean d(Bundle bundle)
    {
        bundle = (Bundle)bundle.getParcelable("SearchResponse");
        if (bundle == null)
        {
            return false;
        }
        bundle = (Bundle)bundle.getParcelable("Image");
        if (bundle == null)
        {
            return false;
        }
        return bundle.getParcelableArrayList("Results") != null;
    }

    private void j()
    {
        String s1;
        for (s1 = t.getText().toString(); n.a(s1) || B.a();)
        {
            return;
        }

        a(s1, 0);
    }

    private void k()
    {
        G = -1;
        F = null;
        D = -1;
        C = null;
        E = null;
        A.a(false);
        A.setMessage(getString(o.image_search_failed_to_load_images));
        A.setVisibility(0);
        v.setVisibility(8);
    }

    private void l()
    {
        boolean flag = false;
        A.a(false);
        Object obj = ((Bundle)E.getParcelable("Image")).getParcelableArrayList("Results");
        if (((List) (obj)).size() == 0)
        {
            A.setVisibility(0);
            A.setMessage(getString(o.image_search_no_results));
            w.setVisibility(8);
            v.setVisibility(8);
            return;
        }
        v.setVisibility(0);
        A.setVisibility(8);
        p.a(((List) (obj)));
        if (D == -1 || H < 2)
        {
            w.setVisibility(8);
            return;
        }
        w.setVisibility(0);
        x.setText(getString(o.image_search_range, new Object[] {
            Integer.valueOf(D + 1), Integer.valueOf(H)
        }));
        obj = y;
        int i1;
        if (D > 0)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = z;
        if (D < H - 1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 4;
        }
        ((TextView) (obj)).setVisibility(i1);
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_image_search);
        bundle = i();
        p = (com.facebook.orca.images.i)bundle.a(com/facebook/orca/images/i);
        q = (InputMethodManager)bundle.a(android/view/inputmethod/InputMethodManager);
        r = (a)bundle.a(com/facebook/ui/images/cache/a);
        I = (com.facebook.zero.ui.o)bundle.a(com/facebook/zero/ui/o);
        J = (l)bundle.a(com/facebook/zero/ui/l);
        com.facebook.widget.titlebar.c.a(this);
        s = (com.facebook.widget.titlebar.a)b(com.facebook.i.titlebar);
        t = (EditText)b(com.facebook.i.image_search_query);
        u = (Button)b(com.facebook.i.image_search_button);
        v = (GridView)b(com.facebook.i.image_search_grid);
        w = (RelativeLayout)b(com.facebook.i.image_search_page_range_container);
        x = (TextView)b(com.facebook.i.image_search_page_range);
        y = (TextView)b(com.facebook.i.image_search_page_range_prev);
        z = (TextView)b(com.facebook.i.image_search_page_range_next);
        A = (EmptyListViewItem)b(com.facebook.i.image_search_empty_item);
        u.setOnClickListener(new com.facebook.orca.images.a(this));
        t.setOnEditorActionListener(new b(this));
        t.addTextChangedListener((TextWatcher)i().a(com/facebook/analytics/bp));
        B = BlueServiceFragment.a(this, "imageSearchOperation");
        B.a(new com.facebook.orca.images.c(this));
        B.a(new com.facebook.orca.m.a(s));
        y.setClickable(true);
        y.setOnClickListener(new com.facebook.orca.images.d(this));
        z.setClickable(true);
        z.setOnClickListener(new e(this));
        v.setAdapter(p);
        v.setOnItemClickListener(new f(this));
        J.a(com.facebook.zero.a.c.j, getString(o.zero_image_search_dialog_content), new g(this));
        J.a(com.facebook.zero.a.c.j, f());
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.IMAGE_SEARCH_ACTIVITY_NAME;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        C = bundle.getString("currentQuery");
        D = bundle.getInt("currentPage");
        E = bundle.getBundle("currentResponse");
        F = bundle.getString("loadingQuery");
        G = bundle.getInt("loadingPage");
        H = bundle.getInt("numPages");
        if (D >= 0)
        {
            l();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("currentQuery", C);
        bundle.putInt("currentPage", D);
        bundle.putBundle("currentResponse", E);
        bundle.putString("loadingQuery", F);
        bundle.putInt("loadingPage", G);
        bundle.putInt("numPages", H);
    }
}
