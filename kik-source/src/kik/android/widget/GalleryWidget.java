// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.cache.u;
import com.kik.h.b;
import com.kik.l.ab;
import com.kik.sdkutils.y;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import kik.a.e.g;
import kik.a.e.v;
import kik.android.ah;
import kik.android.chat.KikApplication;
import kik.android.chat.fragment.KikFragmentBase;
import kik.android.f.a.f;
import kik.android.util.KikSpinner;
import kik.android.util.ak;
import kik.android.util.av;
import kik.android.util.by;
import kik.android.util.ct;

// Referenced classes of package kik.android.widget:
//            ae, af, ak, ap, 
//            aa, z, KikNetworkedImageView, aq, 
//            ad

public class GalleryWidget extends KikFragmentBase
    implements b, kik.android.e.b
{
    public static interface a
    {

        public abstract void a();
    }


    public static final HashSet a = new HashSet(Arrays.asList(new String[] {
        ".mp4"
    }));
    public static String b;
    private static String g;
    protected View _dimBackground;
    protected KikSpinner _folderDropdown;
    protected GridView _grid;
    protected TextView _noPhotosText;
    protected View _topDivider;
    protected com.kik.android.a c;
    protected v d;
    protected ab e;
    protected ad f;
    private Cursor h;
    private int i;
    private z j;
    private g k;
    private aa l;
    private boolean m;
    private boolean n;
    private Activity o;
    private int p;
    private boolean q;
    private a r;
    private android.widget.AdapterView.OnItemSelectedListener s;
    private android.widget.AdapterView.OnItemLongClickListener t;
    private android.widget.AdapterView.OnItemClickListener x;

    public GalleryWidget()
    {
        m = false;
        n = true;
        q = false;
        r = null;
        s = new ae(this);
        t = new af(this);
        x = new kik.android.widget.ak(this);
    }

    static a a(GalleryWidget gallerywidget, a a1)
    {
        gallerywidget.r = a1;
        return a1;
    }

    static aa a(GalleryWidget gallerywidget)
    {
        return gallerywidget.l;
    }

    static void a(GalleryWidget gallerywidget, String s1)
    {
        gallerywidget.b(s1);
    }

    static void a(GalleryWidget gallerywidget, String s1, long l1)
    {
        boolean flag = y.a(18);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (ak.c(s1))
        {
            gallerywidget.b(new ap(gallerywidget));
            return;
        }
        try
        {
            s1 = kik.android.f.a.f.a().a(gallerywidget.o, s1, l1, flag, gallerywidget.e);
            gallerywidget.k.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            gallerywidget.a("", gallerywidget.o.getString(0x7f09035b));
        }
        return;
    }

    static void a(GalleryWidget gallerywidget, String s1, long l1, int i1, boolean flag)
    {
        boolean flag2 = true;
        com.kik.android.a.f f1 = gallerywidget.c.b("Video Trimmer Opened").a("Index", i1).a("Is Recent", kik.android.widget.aa.b().equals(g));
        boolean flag1;
        if (gallerywidget._folderDropdown.getVisibility() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        f1 = f1.a("Is Maximized", flag1);
        if (gallerywidget.o.getResources().getConfiguration().orientation == 2)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        by.b(f1.a("Is Landscape", flag1).a("Forced", flag).a("Video Length", l1).a("Is From Intent", false), s1);
    }

    static void a(GalleryWidget gallerywidget, String s1, long l1, boolean flag, int i1)
    {
        boolean flag1 = true;
        com.kik.android.a.f f1 = gallerywidget.c.b("Video Selected").a("Index", i1).a("Album Name", kik.android.widget.aa.b()).a("Is Recent", kik.android.widget.aa.b().equals(g)).a("From Trimmer", flag);
        if (gallerywidget._folderDropdown.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f1 = f1.a("Is Maximized", flag);
        if (gallerywidget.o.getResources().getConfiguration().orientation == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        by.b(f1.a("Is Landscape", flag).a("Video Length", ct.c(s1)).a("Video Orginal Length", l1).a("Is From Intent", false), s1);
    }

    static void a(GalleryWidget gallerywidget, boolean flag, int i1, String s1)
    {
        boolean flag1 = true;
        s1 = gallerywidget.c.b("Photo Selected").a("Index", i1).a("Album Name", s1).a("Is Recent", s1.equals(g)).a("From Preview", flag);
        if (gallerywidget._folderDropdown.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = s1.a("Is Maximized", flag);
        if (gallerywidget.o.getResources().getConfiguration().orientation == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        s1.a("Is Landscape", flag).b();
    }

    private void b(String s1)
    {
        c(s1);
        if (h != null)
        {
            if (h.getCount() == 0)
            {
                s1 = g;
                l.a();
            }
            l.a(s1);
            j.swapCursor(h);
            j.notifyDataSetChanged();
        }
    }

    static void b(GalleryWidget gallerywidget, String s1)
    {
        try
        {
            s1 = new File(s1);
            s1 = kik.android.f.a.f.a().a(gallerywidget.o, s1, gallerywidget.d);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            gallerywidget.a("", gallerywidget.o.getString(0x7f090134));
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        gallerywidget.k.a(s1);
    }

    static boolean b(GalleryWidget gallerywidget)
    {
        return gallerywidget.n;
    }

    private void c(String s1)
    {
        if (h != null)
        {
            h.close();
        }
        h = a(s1);
    }

    static boolean c(GalleryWidget gallerywidget)
    {
        gallerywidget.n = false;
        return false;
    }

    static Cursor d(GalleryWidget gallerywidget)
    {
        return gallerywidget.h;
    }

    static String d()
    {
        return g;
    }

    static Activity e(GalleryWidget gallerywidget)
    {
        return gallerywidget.o;
    }

    private void e()
    {
        boolean flag1 = false;
        com.kik.android.a.f f1 = c.b("Gallery Tray Opened").a("Album List Size", l.getCount()).a("Total Photos Count", p);
        boolean flag;
        if (o.getResources().getConfiguration().orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f1 = f1.a("Is Landscape", flag);
        flag = flag1;
        if (_folderDropdown.getVisibility() == 0)
        {
            flag = true;
        }
        f1.a("Is Maximized", flag).a("Has Permission", true).b();
    }

    private void f()
    {
        int i1 = (int)TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics());
        _grid.setColumnWidth(g());
        _grid.setHorizontalSpacing(i1);
        _grid.setVerticalSpacing(i1);
    }

    private int g()
    {
        DisplayMetrics displaymetrics = o.getResources().getDisplayMetrics();
        float f1 = (float)displaymetrics.widthPixels / displaymetrics.density;
        return (int)TypedValue.applyDimension(1, (float)Math.floor((double)(f1 + 2.0F) / Math.floor((f1 + 2.0F) / 87F)) - 2.0F, displaymetrics);
    }

    public final Cursor a(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = g;
        }
        String s3;
        Object obj;
        if (!s2.equals(g) && !s2.equals(b))
        {
            s1 = new String[1];
            s1[0] = s2;
            s3 = "bucket_display_name = ?";
        } else
        {
            s1 = null;
            s3 = null;
        }
        if (s3 != null)
        {
            obj = (new StringBuilder()).append(s3).append(" and duration <> 0 and _data LIKE '%.mp4'").toString();
        } else
        {
            obj = "duration <> 0 and _data LIKE '%.mp4'";
        }
        obj = o.getContentResolver().query(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id", "_data", "bucket_display_name", "date_added", "duration"
        }, ((String) (obj)), s1, "_id DESC");
        if (b.equals(s2))
        {
            s1 = ((String) (obj));
        } else
        {
            s1 = o.getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] {
                "_id", "_data", "bucket_display_name", "date_added"
            }, s3, s1, "_id DESC");
            if (obj != null || s1 != null)
            {
                s1 = new ah(new Cursor[] {
                    obj, s1
                }, "date_added");
            } else
            {
                s1 = null;
            }
        }
        if (s1 != null)
        {
            s1.moveToFirst();
        }
        return s1;
    }

    public final void a()
    {
        if (!q)
        {
            q = true;
            _dimBackground.setVisibility(0);
        }
    }

    public final void a(long l1, String s1, KikNetworkedImageView kiknetworkedimageview, int i1, boolean flag)
    {
        if (l1 < 0L)
        {
            return;
        } else
        {
            Activity activity = o;
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = 2;
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
            int j1 = g();
            options.outHeight = j1;
            options.outWidth = j1;
            kiknetworkedimageview.a(u.a(l1, s1, flag, activity, i1, options), f, i1, i1, true, true);
            return;
        }
    }

    protected final void a(String s1, String s2)
    {
        Toast.makeText(o, s2, 1).show();
    }

    public final void a(g g1)
    {
        k = g1;
        if (_folderDropdown != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        e();
        l.a();
        c(((String) (null)));
        if (h == null) goto _L1; else goto _L3
_L3:
        int i1 = p;
        int j1 = h.getCount();
        p = j1;
        b(kik.android.widget.aa.b());
        if (i1 < j1)
        {
            _grid.post(new aq(this));
        }
        if (!m)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (h.getCount() <= 0) goto _L1; else goto _L4
_L4:
        m = false;
        _noPhotosText.setVisibility(8);
        _topDivider.setVisibility(8);
        return;
        if (h.getCount() != 0) goto _L1; else goto _L5
_L5:
        m = true;
        _noPhotosText.setVisibility(0);
        _folderDropdown.setVisibility(8);
        _topDivider.setVisibility(0);
        return;
    }

    public final void a(kik.android.chat.fragment.KikChatFragment.e e1)
    {
        if (_folderDropdown != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.android.chat.fragment.KikChatFragment.e.values().length];
                try
                {
                    a[kik.android.chat.fragment.KikChatFragment.e.e.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[kik.android.chat.fragment.KikChatFragment.e.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[kik.android.chat.fragment.KikChatFragment.e.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[kik.android.chat.fragment.KikChatFragment.e.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (kik.android.widget._cls1.a[e1.ordinal()])
        {
        default:
            return;

        case 4: // '\004'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            if (!m)
            {
                av.a(_folderDropdown, KikApplication.a(48));
                return;
            }
            break;

        case 2: // '\002'
            av.a(_folderDropdown, KikApplication.a(0));
            return;

        case 3: // '\003'
            b(g);
            _folderDropdown.setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (m) goto _L1; else goto _L4
_L4:
        _folderDropdown.getLayoutParams().height = KikApplication.a(48);
        _folderDropdown.setVisibility(0);
        return;
    }

    public final void b()
    {
        if (q)
        {
            q = false;
            av.b(_dimBackground, 150);
        }
    }

    public final void c()
    {
        if (r != null)
        {
            r.a();
            r = null;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        f();
        j.a(g());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
        o = getActivity();
        g = o.getResources().getString(0x7f0901e6);
        b = o.getResources().getString(0x7f090358);
        c(((String) (null)));
        if (h != null)
        {
            i = h.getColumnIndexOrThrow("_id");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = layoutinflater.inflate(0x7f03004a, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        _folderDropdown.setVisibility(8);
        _folderDropdown.setContentDescription("AUTOMATION_GALLERY_DROPDOWN");
        l = new aa(this, layoutinflater, i, g);
        _folderDropdown.setAdapter(l);
        _folderDropdown.setOnItemSelectedListener(s);
        _grid.setContentDescription("AUTOMATION_GALLERY_PHOTO_LIST");
        f();
        j = new z(this, viewgroup.getContext(), h, g(), i);
        _grid.setAdapter(j);
        _grid.setOnItemClickListener(x);
        _grid.setOnItemLongClickListener(t);
        if (h != null)
        {
            p = h.getCount();
            h.moveToFirst();
        }
        if (h == null || h.getCount() == 0)
        {
            _noPhotosText.setVisibility(0);
            _topDivider.setVisibility(0);
            m = true;
        }
        _folderDropdown.a(this);
        _folderDropdown.setOnTouchListener(new kik.android.widget.ad(this));
        e();
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (h != null)
        {
            h.close();
        }
    }

}
