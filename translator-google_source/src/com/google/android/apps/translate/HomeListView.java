// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.anim.f;
import com.google.android.apps.translate.b.a;
import com.google.android.apps.translate.e.p;
import com.google.android.apps.translate.e.t;
import com.google.android.apps.translate.e.w;
import com.google.android.apps.translate.offline.OfflineDownloadReceiver;
import com.google.android.apps.translate.widget.FloatingInputCard;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a.i;
import com.google.android.libraries.translate.offline.b;
import com.google.android.libraries.translate.offline.o;
import com.google.android.libraries.translate.speech.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translate:
//            k, o, a, e, 
//            r, m, d, c

public class HomeListView extends ListView
    implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, t, j
{

    private final int a;
    private final View b;
    private final com.google.android.apps.translate.a c;
    private final com.google.android.apps.translate.e.a d;
    private FloatingInputCard e;
    private com.google.android.libraries.translate.e.k f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private View k;
    private View l;
    private View m;
    private View n;
    private View o;
    private View p;

    public HomeListView(Context context, AttributeSet attributeset)
    {
        String s;
        String s1;
        Pair pair;
        super(context, attributeset);
        g = 0;
        h = 0;
        i = 0;
        j = getResources().getDimensionPixelSize(k.floating_input_visible_height_min);
        k = null;
        a = getResources().getDimensionPixelSize(k.floating_input_holder_height);
        b = View.inflate(context, o.card_fixed_container, null);
        attributeset = new p(this, this);
        setOnTouchListener(attributeset);
        d = attributeset;
        c = new com.google.android.apps.translate.a(context, b);
        setAdapter(c);
        context = new w(context);
        attributeset = PreferenceManager.getDefaultSharedPreferences(((w) (context)).a);
        s = attributeset.getString("key_version_name", "");
        s1 = attributeset.getString("key_welcome_version_name", "");
        pair = com.google.android.libraries.translate.e.d.d();
        attributeset.getInt("key_version_code", 0);
        ((Integer)pair.second).intValue();
        attributeset.edit().putInt("key_version_code", ((Integer)pair.second).intValue()).commit();
        if (!TextUtils.equals(s1, (CharSequence)pair.first)) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        k = context;
        if (k != null)
        {
            c.a(new ArrayList(), k);
        }
        setOnItemClickListener(this);
        return;
_L2:
        if (!TextUtils.equals(s, (CharSequence)pair.first))
        {
            attributeset.edit().putString("key_version_name", (String)pair.first).commit();
        }
        attributeset = View.inflate(((w) (context)).a, o.card_whats_new, null);
        attributeset = w.a(((w) (context)).a, attributeset);
        context = attributeset;
        if (attributeset == null)
        {
            context = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static View a(HomeListView homelistview)
    {
        return homelistview.k;
    }

    private void a(PackageType packagetype)
    {
        OfflinePackage offlinepackage;
        Object obj;
        int i1;
        boolean flag;
        int k1;
        offlinepackage = null;
        i1 = 0;
        Iterator iterator = ((o)Singleton.c.b()).c(packagetype).iterator();
        obj = null;
        k1 = 0;
        flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            OfflinePackage offlinepackage1 = (OfflinePackage)iterator.next();
            if (offlinepackage1.f())
            {
                k1++;
                obj = (c)Singleton.e.b();
                String s = offlinepackage1.a;
                flag = ((c) (obj)).b.contains(s) | flag;
                obj = offlinepackage1;
            } else
            if (com.google.android.libraries.translate.offline.OfflinePackage.Status.ERROR.equals(offlinepackage1.c))
            {
                offlinepackage = offlinepackage1;
                i1++;
            }
        } while (true);
        com.google.android.apps.translate.e.a[packagetype.ordinal()];
        JVM INSTR tableswitch 1 2: default 164
    //                   1 165
    //                   2 653;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (k1 > 0)
        {
            if (l == null)
            {
                packagetype = (ViewGroup)b;
                l = LayoutInflater.from(getContext()).inflate(o.card_offline_progress, packagetype, false);
                packagetype.addView(l);
            }
            Object obj1 = (TextView)l.findViewById(0x1020014);
            if (k1 > 1)
            {
                packagetype = getContext().getString(r.title_multiple_offline_pkg_progress, new Object[] {
                    Integer.valueOf(k1)
                });
            } else
            {
                packagetype = getContext().getString(r.title_offline_pkg_progress, new Object[] {
                    ((OfflinePackage) (obj)).a(getContext(), false)
                });
            }
            ((TextView) (obj1)).setText(packagetype);
            packagetype = (TextView)l.findViewById(0x1020015);
            if (com.google.android.libraries.translate.offline.b.a(getContext()).a())
            {
                k1 = r.label_more_details;
            } else
            {
                k1 = r.msg_downloading_wifi_only;
            }
            packagetype.setText(k1);
            l.setVisibility(0);
            packagetype = l.findViewById(m.progress_content);
            packagetype.setOnClickListener(new com.google.android.apps.translate.e.j(OfflineDownloadReceiver.b(getContext(), PackageType.TRANSLATE), Event.OFFLINE_PROGRESS_CARD_CLICKED));
            obj = com.google.android.libraries.translate.e.o.f(getContext());
            obj1 = l.findViewById(m.speech_download);
            if (flag && obj != null)
            {
                ((View) (obj1)).setVisibility(0);
                ((View) (obj1)).setOnClickListener(new com.google.android.apps.translate.e.j(((android.content.Intent) (obj)), Event.OFFLINE_SPEECH_MANAGEMENT_OPENED));
                com.google.android.apps.translate.b.a.a(packagetype, a.b);
            } else
            {
                ((View) (obj1)).setVisibility(8);
                com.google.android.apps.translate.b.a.a(packagetype, a.a);
            }
        } else
        if (l != null)
        {
            l.setVisibility(8);
        }
        if (i1 > 0)
        {
            if (m == null)
            {
                packagetype = (ViewGroup)b;
                m = LayoutInflater.from(getContext()).inflate(o.card_offline_download_error, packagetype, false);
                packagetype.addView(m);
                m.setOnClickListener(new com.google.android.apps.translate.e.j(OfflineDownloadReceiver.b(getContext(), PackageType.TRANSLATE), Event.OFFLINE_ERROR_CARD_CLICKED));
            }
            obj = (TextView)m.findViewById(0x1020014);
            if (i1 > 1)
            {
                packagetype = getContext().getString(r.title_multiple_offline_pkg_failed, new Object[] {
                    Integer.valueOf(i1)
                });
            } else
            {
                packagetype = getContext().getString(r.title_offline_pkg_failed, new Object[] {
                    offlinepackage.a(getContext(), false)
                });
            }
            ((TextView) (obj)).setText(packagetype);
            m.setVisibility(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (m == null) goto _L1; else goto _L4
_L4:
        m.setVisibility(8);
        return;
_L3:
        if (k1 > 0)
        {
            if (n == null)
            {
                packagetype = (ViewGroup)b;
                n = LayoutInflater.from(getContext()).inflate(o.card_offline_progress, packagetype, false);
                packagetype.addView(n);
            }
            TextView textview = (TextView)n.findViewById(0x1020014);
            int j1;
            if (k1 > 1)
            {
                packagetype = getContext().getString(r.title_multiple_instant_pkg_progress, new Object[] {
                    Integer.valueOf(k1)
                });
            } else
            {
                packagetype = getContext().getString(r.title_instant_pkg_progress, new Object[] {
                    ((OfflinePackage) (obj)).a(getContext(), false)
                });
            }
            textview.setText(packagetype);
            packagetype = (TextView)n.findViewById(0x1020015);
            if (com.google.android.libraries.translate.offline.b.a(getContext()).a())
            {
                j1 = r.label_more_details;
            } else
            {
                j1 = r.msg_downloading_wifi_only;
            }
            packagetype.setText(j1);
            n.setVisibility(0);
            n.findViewById(m.progress_content).setOnClickListener(new com.google.android.apps.translate.e.j(OfflineDownloadReceiver.b(getContext(), PackageType.WORD_LENS), Event.WORDLENS_DOWNLOAD_PROGRESS_CARD_CLICKED));
            n.findViewById(m.speech_download).setVisibility(8);
        } else
        if (n != null)
        {
            n.setVisibility(8);
        }
        if (i1 > 0)
        {
            if (o == null)
            {
                packagetype = (ViewGroup)b;
                o = LayoutInflater.from(getContext()).inflate(o.card_offline_download_error, packagetype, false);
                packagetype.addView(o);
                o.setOnClickListener(new com.google.android.apps.translate.e.j(OfflineDownloadReceiver.b(getContext(), PackageType.WORD_LENS), Event.WORDLENS_DOWNLOAD_ERROR_CARD_CLICKED));
            }
            obj = (TextView)o.findViewById(0x1020014);
            if (i1 > 1)
            {
                packagetype = getContext().getString(r.title_multiple_instant_pkg_failed, new Object[] {
                    Integer.valueOf(i1)
                });
            } else
            {
                packagetype = getContext().getString(r.title_instant_pkg_failed, new Object[] {
                    offlinepackage.a(getContext(), false)
                });
            }
            ((TextView) (obj)).setText(packagetype);
            o.setVisibility(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (o == null) goto _L1; else goto _L5
_L5:
        o.setVisibility(8);
        return;
    }

    static com.google.android.apps.translate.a b(HomeListView homelistview)
    {
        return homelistview.c;
    }

    private void c()
    {
        Object obj = com.google.android.libraries.translate.languages.e.a(getContext());
        Language alanguage[] = com.google.android.libraries.translate.core.b.a(getContext(), ((com.google.android.libraries.translate.languages.d) (obj)));
        String s = alanguage[0].getShortName();
        String s1 = alanguage[1].getShortName();
        alanguage = (o)Singleton.c.b();
        Object obj1 = alanguage.b(s, s1);
        if (obj1 != null && ((OfflinePackage) (obj1)).c == com.google.android.libraries.translate.offline.OfflinePackage.Status.AVAILABLE && com.google.android.libraries.translate.core.b.b(getContext(), s, s1) > 0)
        {
            if (p == null)
            {
                ViewGroup viewgroup = (ViewGroup)b;
                p = LayoutInflater.from(getContext()).inflate(o.card_instant_download, viewgroup, false);
                viewgroup.addView(p);
            }
            OfflinePackage aofflinepackage[] = com.google.android.libraries.translate.offline.a.i.a(((OfflinePackage) (obj1)), alanguage);
            obj1 = com.google.android.libraries.translate.offline.a.i.a(getContext(), aofflinepackage);
            ((TextView)p.findViewById(0x1020015)).setText(((CharSequence) (obj1)));
            p.setVisibility(0);
            p.findViewById(m.instant_download).setOnClickListener(new com.google.android.apps.translate.d(this, alanguage, aofflinepackage));
        } else
        if (p != null)
        {
            p.setVisibility(8);
            return;
        }
    }

    public final void a()
    {
        if (k != null)
        {
            c.a();
            k = null;
            PreferenceManager.getDefaultSharedPreferences((new w(getContext())).a).edit().putString("key_welcome_version_name", (String)com.google.android.libraries.translate.e.d.d().first).commit();
        }
    }

    public final void a(int i1, Bundle bundle)
    {
        i1;
        JVM INSTR lookupswitch 6: default 60
    //                   6: 92
    //                   7: 92
    //                   13: 80
    //                   14: 61
    //                   20: 122
    //                   22: 96;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L4:
        c.a(new ArrayList(), k);
        return;
_L3:
        if (getVisibility() == 0)
        {
            b();
            return;
        }
          goto _L1
_L2:
        c();
_L6:
        if (k == null || w.a(getContext(), k) != null) goto _L1; else goto _L7
_L7:
        a();
        return;
_L5:
        a(PackageType.TRANSLATE);
        a(PackageType.WORD_LENS);
        c();
        return;
    }

    public final transient void a(int ai[])
    {
        int j1 = ai.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            int k1 = ai[i1];
            if (k1 == 1 && k != null)
            {
                a();
            } else
            if (k1 < c.getCount())
            {
                Entry entry = (Entry)c.getItem(k1);
                c.a(entry);
                (new com.google.android.libraries.translate.c.c()).a(getContext()).c(entry);
                Singleton.b().a(Event.HISTORY_REMOVE, entry.getFromLanguageShortName(), entry.getToLanguageShortName());
            }
            i1++;
        }
    }

    public final boolean a(int i1)
    {
        return i1 > 0;
    }

    public final void b()
    {
        if (f != null)
        {
            f.cancel(true);
        }
        f = new com.google.android.apps.translate.c(this);
        f.a(new Void[0]);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            14, 13, 20, 22, 6, 7
        });
        a(20, null);
    }

    protected void onDetachedFromWindow()
    {
        com.google.android.libraries.translate.e.h.a(this);
        super.onDetachedFromWindow();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (Entry)c.getItem(i1);
        if (adapterview != null && !"null".equals(adapterview.getToLanguageShortName()))
        {
            Singleton.b().a(Event.HISTORY_VIEW_ITEM_EXPANSIONS, null, null);
            view = com.google.android.libraries.translate.languages.e.a().a(getContext(), Locale.getDefault());
            view = com.google.android.apps.translate.e.k.a(adapterview.getInputText(), adapterview.getFromLanguage(view), adapterview.getToLanguage(view), null);
            view.putString("output", adapterview.getOutputText());
            com.google.android.libraries.translate.e.h.a(3, view);
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        boolean flag;
        flag = false;
        j1 = 0;
        k1 = j;
        if (i1 == 0)
        {
            k1 = Math.max(a + b.getTop(), j);
        }
        abslistview = getChildAt(0);
        if (abslistview != null) goto _L2; else goto _L1
_L1:
        i = 0;
        h = 0;
_L4:
        g = i1;
        abslistview = e.getAnimation();
        if (isEnabled() && (abslistview == null || abslistview.hasEnded()))
        {
            e.a(k1, j1);
        }
        return;
_L2:
        if (g != i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = abslistview.getTop() - h;
_L5:
        i = abslistview.getHeight();
        h = abslistview.getTop();
        if (true) goto _L4; else goto _L3
_L3:
        if (g == i1 - 1)
        {
            j1 = abslistview.getTop() - (i + h);
        } else
        {
            j1 = ((flag) ? 1 : 0);
            if (g == i1 + 1)
            {
                j1 = (abslistview.getTop() + abslistview.getHeight()) - h;
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        boolean flag = true;
        abslistview = d;
        if (i1 == 1)
        {
            flag = false;
        }
        abslistview.a(flag);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag)
        {
            a(20, null);
        }
    }

    public void setFloatingInputCard(FloatingInputCard floatinginputcard, boolean flag, int i1)
    {
        e = floatinginputcard;
        if (flag)
        {
            layoutChildren();
            Object obj;
            Object obj1;
            int j1;
            int k1;
            if (getFirstVisiblePosition() == 0)
            {
                j1 = a + b.getTop();
            } else
            {
                j1 = 0;
            }
            obj = e;
            obj.f = true;
            obj1 = (android.view.ViewGroup.MarginLayoutParams)((FloatingInputCard) (obj)).getLayoutParams();
            k1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).topMargin;
            ((FloatingInputCard) (obj)).a(j1, 0);
            if (i1 > 0x80000000)
            {
                obj1.topMargin = k1 - i1;
                ((FloatingInputCard) (obj)).c.getLayoutParams().height = ((FloatingInputCard) (obj)).c.getMeasuredHeight();
                obj1 = new com.google.android.apps.translate.anim.e(new f[] {
                    (new com.google.android.apps.translate.anim.c(((View) (obj)))).a("topMargin", 0), (new com.google.android.apps.translate.anim.c(((FloatingInputCard) (obj)).c)).a("height", 0)
                });
                ((com.google.android.apps.translate.anim.e) (obj1)).setAnimationListener(new com.google.android.apps.translate.widget.e(((FloatingInputCard) (obj))));
                ((com.google.android.apps.translate.anim.e) (obj1)).a(((FloatingInputCard) (obj)).getContext(), 0x10e0000);
                ((FloatingInputCard) (obj)).startAnimation(((Animation) (obj1)));
                AnimationScheme.FADE.showView(((FloatingInputCard) (obj)).a);
            } else
            {
                obj1.topMargin = 0;
                ((FloatingInputCard) (obj)).a.setVisibility(0);
                ((FloatingInputCard) (obj)).c.setVisibility(8);
            }
            ((FloatingInputCard) (obj)).setCursorBlink();
        }
        if (floatinginputcard == null)
        {
            obj = null;
        } else
        {
            obj = this;
        }
        setOnScrollListener(((android.widget.AbsListView.OnScrollListener) (obj)));
        if (floatinginputcard != null)
        {
            Singleton.b().c("home");
        }
    }
}
