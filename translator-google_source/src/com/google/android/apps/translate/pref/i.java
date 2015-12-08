// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.l;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.widget.HiddenSlideView;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a.a;
import com.google.android.libraries.translate.offline.a.d;
import com.google.android.libraries.translate.offline.a.g;
import com.google.android.libraries.translate.offline.a.h;
import com.google.android.libraries.translate.offline.a.n;
import com.google.android.libraries.translate.offline.a.p;
import com.google.android.libraries.translate.offline.b;
import com.google.android.libraries.translate.offline.f;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;

// Referenced classes of package com.google.android.apps.translate.pref:
//            j, k, o, l, 
//            m, q, n, r

public final class i extends a
{

    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    final d a;
    private final Map h = Maps.b();
    private final List i = new ArrayList();
    private final com.google.android.libraries.translate.offline.o j;
    private final Context k;
    private final com.google.android.libraries.translate.offline.d l;
    private final ConnectivityManager m;
    private final View n;
    private final List o = new ArrayList();
    private final CharSequence p;
    private final CharSequence q;
    private final Runnable r = new com.google.android.apps.translate.pref.j(this);
    private final Runnable s = new com.google.android.apps.translate.pref.k(this);
    private final LayoutInflater t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private com.google.android.libraries.translate.offline.OfflinePackage.Status y;
    private final PackageType z;

    public i(Context context, View view, PackageType packagetype)
    {
        u = false;
        v = false;
        w = false;
        x = false;
        j = (com.google.android.libraries.translate.offline.o)Singleton.c.b();
        k = context;
        l = ((com.google.android.libraries.translate.offline.o)Singleton.c.b()).d;
        t = LayoutInflater.from(k);
        a = new d(j, this);
        m = (ConnectivityManager)k.getSystemService("connectivity");
        n = view;
        p = k.getString(r.description_add_offline_package);
        q = k.getString(r.description_remove_offline_package);
        for (context = Collections.unmodifiableList(com.google.android.libraries.translate.languages.e.a(context).a).iterator(); context.hasNext(); o.add(view.getShortName()))
        {
            view = (Language)context.next();
        }

        view = Singleton.b();
        if (packagetype == PackageType.WORD_LENS)
        {
            context = "wordlens_packs";
        } else
        {
            context = "offline_packs";
        }
        view.c(context);
        z = packagetype;
    }

    private static int a(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        if (flag1)
        {
            if (flag3)
            {
                return r.msg_starting_download;
            }
            if (flag2)
            {
                if (flag)
                {
                    return r.msg_starting_download;
                } else
                {
                    return r.msg_waiting_wifi;
                }
            }
            if (flag)
            {
                return r.msg_waiting_network;
            } else
            {
                return r.msg_waiting_wifi;
            }
        }
        if (flag3)
        {
            return r.msg_starting_download;
        } else
        {
            return r.msg_waiting_wifi;
        }
    }

    static Context a(i i1)
    {
        return i1.k;
    }

    private h a(int i1)
    {
        return (h)i.get(i1);
    }

    static List b(i i1)
    {
        return i1.o;
    }

    private void e()
    {
        ArrayList arraylist;
        boolean flag2;
        flag2 = false;
        arraylist = new ArrayList();
        if (!u) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L8:
        if (!flag) goto _L4; else goto _L3
_L3:
        boolean flag1 = false;
_L6:
        ((HiddenSlideView)n.findViewById(m.offline_apk_needs_to_be_upgraded)).a(flag1);
        ((HiddenSlideView)n.findViewById(m.offline_updates_available)).a(flag2);
        if (flag2)
        {
            n.findViewById(m.btn_update_pkg).setOnClickListener(new p(arraylist, j, k, r));
        }
        return;
_L2:
        Iterator iterator = h.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!((h)iterator.next()).d.f());
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        flag1 = j.f;
        if (!flag1)
        {
            Iterator iterator1 = h.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                h h1 = (h)iterator1.next();
                if (h1.d.h())
                {
                    arraylist.add(h1.d);
                }
            } while (true);
            if (arraylist.size() > 0)
            {
                flag2 = true;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean f()
    {
        Object obj;
        boolean flag1;
        flag1 = false;
        try
        {
            com.google.android.libraries.translate.offline.f.a(k);
        }
        catch (OfflineTranslationException offlinetranslationexception)
        {
            Singleton.b().a(offlinetranslationexception.getErrorCode(), (new LogParams()).addParam("cause", "manageOfflineLanguageView"));
            i.clear();
            h.clear();
            ((TextView)n.findViewById(0x1020004)).setText(offlinetranslationexception.getErrorMessage(k));
            return false;
        }
        if (!i.isEmpty() && !h.isEmpty())
        {
            return true;
        }
        ((TextView)n.findViewById(0x1020004)).setText("");
        obj = new com.google.android.apps.translate.pref.o(this);
        j.a(((com.google.android.libraries.translate.e.l) (obj)), false);
        ((com.google.android.apps.translate.pref.o) (obj)).postDelayed(((Runnable) (obj)), 3000L);
        obj = j.a.values().iterator();
_L2:
        Iterator iterator;
        boolean flag;
        flag = flag1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_225;
        }
        iterator = ((List)((Iterator) (obj)).next()).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((OfflinePackage)iterator.next()).d()) goto _L4; else goto _L3
_L3:
        flag = true;
        if (!flag)
        {
            com.google.android.libraries.translate.offline.b.a(k).b();
        }
        n.findViewById(m.btn_core_pkg_info).setOnClickListener(new com.google.android.apps.translate.pref.l(this));
        n.findViewById(m.btn_open_play_store).setOnClickListener(new com.google.android.apps.translate.pref.m(this));
        return true;
    }

    final void a()
    {
        if (f())
        {
            d();
        }
    }

    public final void a(boolean flag, com.google.android.libraries.translate.offline.OfflinePackage.Status status)
    {
        u = flag;
        y = status;
        ((HiddenSlideView)n.findViewById(m.offline_waiting_for_core)).a(u);
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        i.clear();
        h.clear();
        i.add(new h(k.getString(r.title_installed), d));
        obj2 = j.c(z).iterator();
_L5:
        if (!((Iterator) (obj2)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = (OfflinePackage)((Iterator) (obj2)).next();
        obj = ((OfflinePackage) (obj1)).a(k, false);
        if (!((OfflinePackage) (obj1)).f) goto _L4; else goto _L3
_L3:
        int i1 = c;
_L6:
        Object obj3;
        boolean flag;
        obj3 = new q(this, ((String) (obj)), i1, ((OfflinePackage) (obj1)));
        obj3.e = true;
        if (!((OfflinePackage) (obj1)).f())
        {
            break MISSING_BLOCK_LABEL_463;
        }
        flag = ((OfflinePackage) (obj1)).h();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        obj = j.b(((OfflinePackage) (obj1)));
_L14:
        obj3.f = new n(((OfflinePackage) (obj)), j, k, l, s);
        i.add(obj3);
        h.put(((OfflinePackage) (obj1)).a, obj3);
          goto _L5
        obj;
        throw obj;
_L4:
        i1 = b;
          goto _L6
_L2:
        i.add(new h(k.getString(r.label_all), d));
        obj2 = new ArrayList();
        obj3 = j.d(z).iterator();
_L10:
        if (!((Iterator) (obj3)).hasNext()) goto _L8; else goto _L7
_L7:
        OfflinePackage offlinepackage = (OfflinePackage)((Iterator) (obj3)).next();
        if (offlinepackage.f) goto _L10; else goto _L9
_L9:
        obj1 = (q)h.get(offlinepackage.a);
        obj = obj1;
        if (obj1 != null) goto _L12; else goto _L11
_L11:
        com.google.android.libraries.translate.offline.o o1;
        Context context;
        obj1 = new q(this, offlinepackage.a(k, false), b, offlinepackage);
        o1 = j;
        context = k;
        if (offlinepackage.b != PackageType.WORD_LENS)
        {
            break MISSING_BLOCK_LABEL_452;
        }
        obj = Event.WORDLENS_DOWNLOAD_FROM_SETTINGS;
_L13:
        obj1.f = new com.google.android.libraries.translate.offline.a.i(offlinepackage, o1, context, ((Event) (obj)), r, false);
        obj = obj1;
_L12:
        ((List) (obj2)).add(obj);
          goto _L10
        obj;
_L8:
        Collections.sort(((List) (obj2)));
        i.addAll(((Collection) (obj2)));
        e();
        notifyDataSetChanged();
        this;
        JVM INSTR monitorexit ;
        return;
        obj = Event.OFFLINE_DOWNLOAD_FROM_SETTINGS;
          goto _L13
        obj;
          goto _L5
        obj = obj1;
          goto _L14
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = j.c(z).iterator();
_L2:
        OfflinePackage offlinepackage;
        h h1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_72;
            }
            offlinepackage = (OfflinePackage)((Iterator) (obj)).next();
            h1 = (h)h.get(offlinepackage.a);
        } while (h1 == null);
        h1.d = offlinepackage;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
        v = com.google.android.libraries.translate.offline.b.a(k).a();
        if (m == null) goto _L4; else goto _L3
_L3:
        exception = m.getActiveNetworkInfo();
_L8:
        if (exception == null) goto _L6; else goto _L5
_L5:
        if (!exception.isConnected()) goto _L6; else goto _L7
_L7:
        boolean flag = true;
_L9:
        w = flag;
        exception = m.getNetworkInfo(1);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (!exception.isConnected())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        flag = true;
_L10:
        x = flag;
        e();
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        exception = null;
          goto _L8
_L6:
        flag = false;
          goto _L9
        flag = false;
          goto _L10
    }

    public final void d()
    {
        d d1 = a;
        PackageType packagetype = z;
        d1.a();
        d1.b();
        d1.e = new Timer();
        d1.e.scheduleAtFixedRate(new g(d1, packagetype), 100L, 5000L);
    }

    public final int getCount()
    {
        return i.size();
    }

    public final Object getItem(int i1)
    {
        return a(i1);
    }

    public final long getItemId(int i1)
    {
        return (long)i1;
    }

    public final int getItemViewType(int i1)
    {
        h h1 = a(i1);
        if (h1.c == b)
        {
            return 0;
        }
        return h1.c != c ? 2 : 1;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        h h1;
        h1 = a(i1);
        viewgroup = view;
        if (view == null)
        {
            view = t.inflate(h1.c, null);
            viewgroup = view;
            if (h1.d != null)
            {
                viewgroup = new com.google.android.apps.translate.b.b(k.getResources(), j.offline_pin_downloading);
                viewgroup.setLevel(0);
                view.findViewById(m.offline_package_pin_status).setBackgroundDrawable(viewgroup);
                viewgroup = view;
            }
        }
        ((TextView)viewgroup.findViewById(0x1020014)).setText(h1.b);
        view = (ImageView)viewgroup.findViewById(m.offline_package_pin_status);
        i1 = viewgroup.getContext().getResources().getColor(j.offline_pin_idle);
        if (view != null)
        {
            view.setColorFilter(i1, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        if (h1.d != null && !h1.d.f) goto _L2; else goto _L1
_L1:
        return viewgroup;
_L2:
        TextView textview;
        Object obj;
        Object obj1;
        boolean flag;
        obj = h1.d;
        textview = (TextView)viewgroup.findViewById(0x1020015);
        obj1 = viewgroup.findViewById(m.btn_error);
        ((View) (obj1)).setVisibility(8);
        viewgroup.findViewById(m.offline_package_pin_status_click_area).setOnClickListener(h1.f);
        if (h1.e)
        {
            break; /* Loop/switch isn't completed */
        }
        textview.setText("");
        view.setImageResource(f);
        flag = view.getBackground().setLevel(0);
        view.setContentDescription(p);
_L5:
        if (flag)
        {
            view.getBackground().invalidateSelf();
            return viewgroup;
        }
        if (true) goto _L1; else goto _L3
_L3:
        view.setContentDescription(q);
        switch (com.google.android.apps.translate.pref.n.a[((OfflinePackage) (obj)).c.ordinal()])
        {
        default:
            long l1 = ((OfflinePackage) (obj)).c();
            long l2 = ((OfflinePackage) (obj)).b();
            long l3 = (360L * l1) / l2;
            com.google.android.libraries.translate.offline.OfflinePackage.Status status = ((OfflinePackage) (obj)).c;
            int j1 = (int)l3;
            flag = u;
            obj1 = y;
            boolean flag1 = l.a(((OfflinePackage) (obj)));
            boolean flag2 = v;
            boolean flag3 = w;
            boolean flag4 = x;
            int ai[];
            if (flag || j1 <= 0)
            {
                if (flag && obj1 == com.google.android.libraries.translate.offline.OfflinePackage.Status.PAUSED || j1 <= 0)
                {
                    i1 = a(flag1, flag2, flag3, flag4);
                } else
                {
                    i1 = r.msg_starting_download;
                }
                j1 = 0;
            } else
            {
                i1 = 0;
            }
            if (status == com.google.android.libraries.translate.offline.OfflinePackage.Status.PAUSED)
            {
                i1 = a(flag1, flag2, flag3, flag4);
            }
            ai = new int[2];
            ai[0] = i1;
            ai[1] = j1;
            if (ai[0] == 0)
            {
                obj = String.valueOf(Formatter.formatFileSize(k, l1));
                obj1 = String.valueOf(Formatter.formatFileSize(k, l2));
                textview.setText((new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(obj1).length())).append(((String) (obj))).append("/").append(((String) (obj1))).toString());
            } else
            {
                textview.setText(ai[0]);
            }
            flag = view.getBackground().setLevel(ai[1]);
            view.setImageResource(f);
            break;

        case 1: // '\001'
            textview.setText("");
            view.setImageResource(e);
            flag = view.getBackground().setLevel(0);
            break;

        case 2: // '\002'
            textview.setText("");
            ((View) (obj1)).setVisibility(0);
            ((View) (obj1)).setOnClickListener(new com.google.android.apps.translate.pref.r(((OfflinePackage) (obj)), j, k, l, this));
            flag = view.getBackground().setLevel(0);
            view.setImageResource(g);
            break;

        case 3: // '\003'
            textview.setText(r.msg_processing);
            flag = view.getBackground().setLevel(360);
            view.setImageResource(f);
            break;

        case 4: // '\004'
            textview.setText("");
            flag = view.getBackground().setLevel(360);
            view.setImageResource(f);
            break;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int getViewTypeCount()
    {
        return 3;
    }

    public final boolean isEnabled(int i1)
    {
        return a(i1).c != d;
    }

    static 
    {
        b = o.offline_language_item_row;
        c = o.offline_default_language_row;
        d = o.offline_language_header_row;
        e = l.ic_download_completed;
        f = l.ic_file_download_black_24dp;
        g = l.ic_error_black_24dp;
    }
}
