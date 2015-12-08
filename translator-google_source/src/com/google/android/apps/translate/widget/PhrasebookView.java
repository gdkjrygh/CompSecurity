// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.w;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.apps.translate.e.l;
import com.google.android.apps.translate.e.n;
import com.google.android.apps.translate.e.v;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.p;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.sync.k;
import com.google.android.libraries.translate.sync.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate.widget:
//            as, ap, SearchTextBox, am, 
//            an, ao

public class PhrasebookView extends LinearLayout
    implements w, android.view.View.OnClickListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener, n, as, j, q
{

    private final ListView a = (ListView)findViewById(0x102000a);
    private final ap b;
    private final ViewFlipper c;
    private final SearchTextBox d;
    private final k e;
    private boolean f;
    private Menu g;
    private DrawerLayout h;
    private Activity i;
    private int j;
    private int k;
    private com.google.android.libraries.translate.e.k l;

    public PhrasebookView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = 0;
        k = 0;
        l = null;
        LayoutInflater.from(context).inflate(o.widget_phrase, this, true);
        b = new ap(context);
        a.setAdapter(b);
        a.setEmptyView(findViewById(m.msg_empty));
        a.setOnItemClickListener(this);
        a.setOnItemLongClickListener(this);
        c = (ViewFlipper)findViewById(m.top_bar);
        d = (SearchTextBox)findViewById(m.edit_input);
        findViewById(m.btn_clear_input).setOnClickListener(this);
        e = new k(context);
        findViewById(m.btn_signin).setOnClickListener(this);
        findViewById(m.btn_close_select).setOnClickListener(this);
        context = findViewById(m.btn_delete_select);
        context.setOnClickListener(this);
        context.setOnLongClickListener(new v());
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        g = com.google.android.apps.translate.e.l.a(findViewById(m.menu_overflow), p.phrase_menu, this);
    }

    static ap a(PhrasebookView phrasebookview)
    {
        return phrasebookview.b;
    }

    private void a(String s, boolean flag)
    {
        if (l != null)
        {
            l.cancel(true);
        }
        l = new am(this, s, flag);
        l.a(new Void[0]);
    }

    private void b(Account account)
    {
        byte byte1 = 8;
        byte byte0 = 0;
        boolean flag;
        if (account != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        account = findViewById(m.panel_signin);
        if (f)
        {
            byte0 = 8;
        }
        account.setVisibility(byte0);
        account = findViewById(m.buttery_progress);
        byte0 = byte1;
        if (f)
        {
            byte0 = 4;
        }
        account.setVisibility(byte0);
        e();
    }

    static void b(PhrasebookView phrasebookview)
    {
        phrasebookview.e();
    }

    static SearchTextBox c(PhrasebookView phrasebookview)
    {
        return phrasebookview.d;
    }

    private void d()
    {
        f();
        h();
        a("", true);
    }

    static void d(PhrasebookView phrasebookview)
    {
        phrasebookview.d();
    }

    private void e()
    {
        boolean flag1 = true;
        boolean flag = false;
        if (g != null)
        {
            View view = findViewById(m.menu_overflow);
            Menu menu = g;
            int i1;
            boolean flag2;
            if (!b.isEmpty())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            menu.findItem(m.phrase_refresh).setVisible(f);
            menu.findItem(m.phrase_search).setVisible(flag2);
            menu.findItem(m.phrase_sort).setVisible(flag2);
            i1 = ((flag1) ? 1 : 0);
            if (!flag2)
            {
                if (f)
                {
                    i1 = ((flag1) ? 1 : 0);
                } else
                {
                    i1 = 0;
                }
            }
            if (i1 != 0)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            view.setVisibility(i1);
        }
    }

    private void f()
    {
        if (c.getDisplayedChild() == 1)
        {
            c.setDisplayedChild(0);
            d.b();
            d.setSearchListener(null);
            a.setEmptyView(findViewById(m.msg_empty));
        }
    }

    private boolean g()
    {
        return a.getChoiceMode() == 2;
    }

    private void h()
    {
        if (g())
        {
            a.clearChoices();
            a.setChoiceMode(0);
            c.setDisplayedChild(k);
            e();
            a.setAdapter(b);
        }
    }

    public final void a()
    {
        Singleton.b().c("phrasebook");
        h();
    }

    public final void a(int i1)
    {
        if (i1 == 1 && h != null && !DrawerLayout.g(this))
        {
            d();
            b(e.a());
        }
    }

    public final void a(int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            return;

        case 4: // '\004'
            findViewById(m.buttery_progress).setVisibility(0);
            return;

        case 5: // '\005'
            findViewById(m.buttery_progress).setVisibility(4);
            break;
        }
        d();
    }

    public final void a(Account account)
    {
        b(account);
    }

    public final void a(String s)
    {
        a(s, false);
    }

    public final void b()
    {
        h();
        f();
    }

    public final void b(int i1)
    {
        if (i1 == m.phrase_search)
        {
            findViewById(m.msg_empty).setVisibility(8);
            a.setEmptyView(null);
            h();
            c.setDisplayedChild(1);
            d.setSearchListener(null);
            d.setText("");
            d.setSearchListener(this);
            postDelayed(new an(this), 100L);
        } else
        {
            if (i1 == m.phrase_refresh)
            {
                e.e();
                Singleton.b().a(Event.MANUAL_SYNC_REQUESTED, null, null);
                return;
            }
            if (i1 == m.phrase_sort)
            {
                CharSequence charsequence = getContext().getText(r.label_sort_alphabetically);
                CharSequence charsequence1 = getContext().getText(r.label_sort_by_time);
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
                i1 = com.google.android.libraries.translate.core.b.f(getContext());
                ao ao1 = new ao(this);
                builder.setSingleChoiceItems(new CharSequence[] {
                    charsequence, charsequence1
                }, i1, ao1).setTitle(r.label_sort).show();
                return;
            }
        }
    }

    public final void c()
    {
        f();
        d();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            4, 5
        });
    }

    public void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 != m.btn_signin) goto _L2; else goto _L1
_L1:
        if (!com.google.android.libraries.translate.e.o.g || i.checkSelfPermission("android.permission.GET_ACCOUNTS") == 0) goto _L4; else goto _L3
_L3:
        view = i;
        i1 = m.btn_signin;
        view.requestPermissions(new String[] {
            "android.permission.GET_ACCOUNTS"
        }, i1);
_L6:
        return;
_L4:
        e.a(i, this);
        return;
_L2:
        if (i1 == m.btn_clear_input)
        {
            if (d.getText().length() == 0)
            {
                f();
                d();
                return;
            } else
            {
                d.setText("");
                return;
            }
        }
        if (i1 == m.btn_close_select)
        {
            h();
            return;
        }
        if (i1 == m.btn_delete_select)
        {
            Object obj = a.getCheckedItemPositions();
            view = new ArrayList();
            for (int j1 = ((SparseBooleanArray) (obj)).size() - 1; j1 >= 0; j1--)
            {
                if (((SparseBooleanArray) (obj)).valueAt(j1))
                {
                    view.add(b.getItem(((SparseBooleanArray) (obj)).keyAt(j1)));
                }
            }

            obj = com.google.android.libraries.translate.c.b.b();
            ((com.google.android.libraries.translate.c.b) (obj)).a(view, ((com.google.android.libraries.translate.c.b) (obj)).a(getContext()), getContext());
            Entry entry;
            for (Iterator iterator = view.iterator(); iterator.hasNext(); b.remove(entry))
            {
                entry = (Entry)iterator.next();
            }

            Singleton.b().a(Event.BULK_UNSTARS_TRANSLATION, null, null, view.size());
            h();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onDetachedFromWindow()
    {
        com.google.android.libraries.translate.e.h.a(this);
        super.onDetachedFromWindow();
    }

    public void onGlobalLayout()
    {
        if (h != null && h.getWidth() != j)
        {
            j = h.getWidth();
            int i1 = getResources().getDimensionPixelSize(com.google.android.apps.translate.k.phrase_nav_panel_max_width);
            int j1 = getResources().getDimensionPixelSize(com.google.android.apps.translate.k.phrase_nav_panel_min_space);
            getLayoutParams().width = Math.min(i1, j - j1);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (!g()) goto _L2; else goto _L1
_L1:
        adapterview = a.getCheckedItemPositions();
        i1 = 0;
        for (int j1 = adapterview.size() - 1; j1 >= 0; j1--)
        {
            if (adapterview.valueAt(j1))
            {
                i1++;
            }
        }

        if (i1 != 0) goto _L4; else goto _L3
_L3:
        h();
_L6:
        return;
_L4:
        ((TextView)findViewById(m.txt_selection_count)).setText(String.valueOf(i1));
        return;
_L2:
        Singleton.b().a(Event.FAVORITES_VIEW_ITEM_EXPANSIONS, null, null);
        adapterview = (Entry)b.getItem(i1);
        view = com.google.android.libraries.translate.languages.e.a().a(getContext(), Locale.getDefault());
        view = com.google.android.apps.translate.e.k.a(adapterview.getInputText(), adapterview.getFromLanguage(view), adapterview.getToLanguage(view), null);
        view.putString("output", adapterview.getOutputText());
        com.google.android.libraries.translate.e.h.a(3, view);
        if (h != null)
        {
            h.f(this);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (!g())
        {
            a.setChoiceMode(2);
            a.setItemChecked(i1, true);
            k = c.getDisplayedChild();
            c.setDisplayedChild(2);
            ((TextView)findViewById(m.txt_selection_count)).setText("1");
            return true;
        } else
        {
            return false;
        }
    }

    public void setParents(DrawerLayout drawerlayout, Activity activity)
    {
        h = drawerlayout;
        i = activity;
        h.setDrawerListener(this);
    }
}
