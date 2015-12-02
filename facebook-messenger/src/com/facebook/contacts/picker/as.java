// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import com.facebook.analytics.bp;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.g;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.widget.a.h;
import com.facebook.widget.a.j;
import com.facebook.widget.f;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.picker:
//            ar, ak, at, au, 
//            av, aw, ax, ay, 
//            ao, c, u, bb, 
//            bc, ba, az, ap, 
//            aq

public class as extends f
{

    private static final Class a = com/facebook/contacts/picker/as;
    private ak b;
    private c c;
    private h d;
    private View e;
    private View f;
    private EditText g;
    private ImageView h;
    private View i;
    private ViewGroup j;
    private ba k;
    private android.view.View.OnFocusChangeListener l;
    private bc m;
    private bb n;
    private ar o;

    public as(Context context, c c1, int i1)
    {
        super(context);
        o = ar.NONE;
        c = c1;
        b = new ak(context, c1, i1);
        addView(b);
        f = getViewRequired(i.friends_list_mask);
        g = (EditText)getViewRequired(i.friends_list_search);
        j = (ViewGroup)getViewRequired(i.contact_picker_search_section);
        e = getViewRequired(i.dummy_focus_elt);
        h = (ImageView)getViewRequired(i.contact_picker_search_magnifier);
        i = getViewRequired(i.contact_picker_search_progress);
        b.setOnContactListScrollListener(new at(this));
        g.setOnFocusChangeListener(new au(this));
        g.addTextChangedListener(new av(this));
        g.addTextChangedListener((TextWatcher)getInjector().a(com/facebook/analytics/bp));
        f.setOnTouchListener(new aw(this));
        b();
        d = new ax(this);
        h.setOnClickListener(new ay(this));
    }

    private void a(int i1)
    {
        if (i1 == 1)
        {
            ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(g.getWindowToken(), 0);
        }
    }

    static void a(as as1)
    {
        as1.f();
    }

    static void a(as as1, int i1)
    {
        as1.a(i1);
    }

    static void a(as as1, j j1)
    {
        as1.a(j1);
    }

    private void a(j j1)
    {
        if (j1 == j.FILTERING)
        {
            h.setVisibility(4);
            i.setVisibility(0);
            return;
        } else
        {
            h.setVisibility(0);
            i.setVisibility(4);
            return;
        }
    }

    private boolean a(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            g.setText("");
            e.requestFocusFromTouch();
            ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(g.getWindowToken(), 0);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(as as1, MotionEvent motionevent)
    {
        return as1.a(motionevent);
    }

    static EditText b(as as1)
    {
        return as1.g;
    }

    private void b(int i1)
    {
        com.facebook.debug.log.b.a(a, "Filtering complete");
        if (com.facebook.common.w.n.a(g.getText().toString().trim()))
        {
            b.a();
            a(ar.UNFILTERED);
        } else
        if (i1 == 0)
        {
            b.a(ao.NO_RESULTS);
            a(ar.FILTERED);
        } else
        {
            b.a();
            a(ar.FILTERED);
        }
        g();
    }

    static void b(as as1, int i1)
    {
        as1.b(i1);
    }

    private void f()
    {
        u u1 = c.a();
        String s = g.getText().toString().trim();
        if (com.facebook.common.w.n.a(s))
        {
            com.facebook.debug.log.b.a(a, "Empty search");
            a(ar.UNFILTERED);
            g();
            u1.a(null);
            b(c.getCount());
            a(j.FINISHED);
        } else
        {
            com.facebook.debug.log.b.a(a, "Performing filtering");
            a(ar.FILTERING);
            u1.a(s, d);
        }
        if (n != null)
        {
            n.a(s);
        }
    }

    private void g()
    {
        ListView listview;
        boolean flag;
        if (!g.hasFocus())
        {
            flag = false;
        } else
        if (o == ar.FILTERING)
        {
            flag = true;
        } else
        if (o == ar.FILTERED)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        listview = b.getListView();
        if (flag)
        {
            listview.setEnabled(false);
            f.setVisibility(0);
            return;
        } else
        {
            listview.setEnabled(true);
            f.setVisibility(8);
            return;
        }
    }

    public void a()
    {
        if (!g.hasFocus())
        {
            ListView listview = b.getListView();
            listview.setEnabled(true);
            listview.requestFocus();
            f.setVisibility(8);
        }
    }

    protected void a(View view, boolean flag)
    {
        int i1 = 1;
        Class class1 = a;
        if (!flag)
        {
            i1 = 0;
        }
        com.facebook.debug.log.b.a(class1, "Search box focus changed: %d", new Object[] {
            Integer.valueOf(i1)
        });
        if (l != null)
        {
            l.onFocusChange(view, flag);
        }
        if (flag) goto _L2; else goto _L1
_L1:
        a(ar.NONE);
        c.b();
_L4:
        g();
        return;
_L2:
        if (o == ar.NONE)
        {
            a(ar.UNFILTERED);
            if (m != null)
            {
                m.a();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(ar ar1)
    {
        o = ar1;
        if (k != null)
        {
            k.a(ar1);
        }
    }

    public void a(es es)
    {
        b.a(es);
        if (o != ar.NONE)
        {
            f();
        }
    }

    public void b()
    {
        b.a(ao.LOADING);
    }

    public boolean c()
    {
        return ar.FILTERED == o || ar.FILTERING == o;
    }

    public void d()
    {
        g.requestFocus();
        g.setSelection(g.getText().length());
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag = super.dispatchKeyEvent(keyevent);
        if (flag)
        {
            return flag;
        }
        if (keyevent.getKeyCode() == 4 && g.hasFocus())
        {
            g.setText("");
            e.requestFocusFromTouch();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        if (getSearchBoxText().length() == 0 && keyevent.getKeyCode() == 4 && keyevent.getAction() == 1)
        {
            e.requestFocusFromTouch();
        }
        return super.dispatchKeyEventPreIme(keyevent);
    }

    public void e()
    {
        setSearchBoxText("");
        e.requestFocusFromTouch();
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(g.getWindowToken(), 0);
        b.getListView().setSelection(0);
    }

    public ListView getListView()
    {
        return b.getListView();
    }

    public String getSearchBoxText()
    {
        return g.getText().toString();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        int i1 = getResources().getDimensionPixelSize(g.title_bar_height);
        configuration = j.getLayoutParams();
        configuration.height = i1;
        j.setLayoutParams(configuration);
        f();
    }

    public void setOnContactListScrollListener(ap ap)
    {
        b.setOnContactListScrollListener(new az(this, ap));
    }

    public void setOnFilterStateChangedListener(ba ba1)
    {
        k = ba1;
    }

    public void setOnRowClickedListener(aq aq)
    {
        b.setOnRowClickedListener(aq);
    }

    public void setOnSearchBoxFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        l = onfocuschangelistener;
    }

    public void setSearchBoxText(String s)
    {
        g.setText(s);
    }

    public void setSearchHint(String s)
    {
        g.setHint(s);
    }

    public void setSearchPerformedListener(bb bb1)
    {
        n = bb1;
    }

    public void setSearchStartedListener(bc bc1)
    {
        m = bc1;
    }

}
