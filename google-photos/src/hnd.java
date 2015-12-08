// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.photos.remotemedia.ui.AlbumTitleCard;
import com.google.android.apps.photos.remotemedia.ui.Facepile;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hnd
    implements android.view.View.OnLayoutChangeListener, android.widget.TextView.OnEditorActionListener, nug, omb, ooq, oos, oov, ops, opv
{

    Context a;
    mmr b;
    ifj c;
    String d;
    String e;
    int f;
    private final List g = new ArrayList();
    private final boolean h;
    private iwc i;
    private hoc j;
    private hkl k;
    private fia l;
    private hqq m;
    private AlbumTitleCard n;
    private hnq o;

    public hnd(opd opd1, boolean flag)
    {
        f = hnp.a;
        opd1.a(this);
        h = flag;
    }

    static hnq a(hnd hnd1, hnq hnq)
    {
        hnd1.o = hnq;
        return hnq;
    }

    static void a(hnd hnd1)
    {
        hnf.a[hnd1.f - 1];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 193
    //                   2 199
    //                   3 222
    //                   4 259;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        hnd1.a(true);
        hnd1 = hnd1.n;
        int i1;
        int j1;
        if (((AlbumTitleCard) (hnd1)).d.getVisibility() == 0 && ((AlbumTitleCard) (hnd1)).b.getVisibility() == 8)
        {
            i1 = hnd1.getResources().getDimensionPixelSize(b.wD);
        } else
        {
            i1 = hnd1.getResources().getDimensionPixelSize(b.wG);
        }
        if (((AlbumTitleCard) (hnd1)).d.getVisibility() == 0)
        {
            j1 = hnd1.getResources().getDimensionPixelSize(b.wB);
        } else
        {
            j1 = hnd1.getResources().getDimensionPixelSize(b.wE);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ((AlbumTitleCard) (hnd1)).e.setPaddingRelative(i1, ((AlbumTitleCard) (hnd1)).e.getPaddingTop(), ((AlbumTitleCard) (hnd1)).e.getPaddingEnd(), j1);
        } else
        {
            ((AlbumTitleCard) (hnd1)).e.setPadding(i1, ((AlbumTitleCard) (hnd1)).e.getPaddingTop(), ((AlbumTitleCard) (hnd1)).e.getPaddingRight(), j1);
        }
        if (((AlbumTitleCard) (hnd1)).d.getVisibility() == 0 && ((AlbumTitleCard) (hnd1)).b.getVisibility() == 8)
        {
            i1 = hnd1.getResources().getDimensionPixelSize(b.wC);
        } else
        {
            i1 = hnd1.getResources().getDimensionPixelSize(b.wF);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ((AlbumTitleCard) (hnd1)).e.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, i1));
            return;
        } else
        {
            ((AlbumTitleCard) (hnd1)).e.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i1));
            return;
        }
_L2:
        hnd1.a(false);
        return;
_L3:
        hnd1.n.b.setVisibility(8);
_L6:
        hnd1.n.a(true);
          goto _L1
_L4:
        if (hnd1.n.a.getVisibility() == 8)
        {
            hnd1.n.b.setVisibility(0);
        }
        hnd1.n.a(false);
          goto _L1
_L5:
        if (hnd1.n.a.getVisibility() == 8)
        {
            hnd1.n.b.setVisibility(0);
        }
          goto _L6
    }

    static void a(hnd hnd1, View view, ekq ekq)
    {
        b.a(view, new msm(pwz.a));
        view.setOnClickListener(new msj(new hnj(hnd1)));
    }

    static void a(hnd hnd1, boolean flag, boolean flag1)
    {
        hnd1.a(true, flag1);
    }

    private void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            n.b.setVisibility(8);
            n.a.setVisibility(0);
            n.a.requestFocus();
            String s = n.a.getText().toString();
            if (a.getResources().getString(c.dS).equals(s))
            {
                n.a.setSelection(0);
                n.a.setText("");
            } else
            {
                n.a.setSelection(s.length());
            }
            if (flag1)
            {
                c(true);
                return;
            } else
            {
                n.a.clearFocus();
                return;
            }
        } else
        {
            n.a.setSelection(0);
            n.a.clearComposingText();
            n.a.setVisibility(8);
            n.b.setVisibility(0);
            c(false);
            return;
        }
    }

    static fia b(hnd hnd1)
    {
        return hnd1.l;
    }

    private void b()
    {
        String s = n.a.getText().toString();
        if (s.length() != 0) goto _L2; else goto _L1
_L1:
        n.a.setText(e);
_L4:
        if (o != null && i != null)
        {
            i.a().b(o);
        }
        a(false, false);
        return;
_L2:
        if (!s.equals(e))
        {
            d = e;
            a(s);
            j.a(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static hoc c(hnd hnd1)
    {
        return hnd1.j;
    }

    private void c(boolean flag)
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)a.getSystemService("input_method");
        if (inputmethodmanager == null)
        {
            return;
        }
        if (flag)
        {
            inputmethodmanager.showSoftInput(n.a, 1);
            return;
        } else
        {
            inputmethodmanager.hideSoftInputFromWindow(n.a.getWindowToken(), 0);
            return;
        }
    }

    static hnq d(hnd hnd1)
    {
        return hnd1.o;
    }

    static iwc e(hnd hnd1)
    {
        return hnd1.i;
    }

    static AlbumTitleCard f(hnd hnd1)
    {
        return hnd1.n;
    }

    static void g(hnd hnd1)
    {
        hnd1.b();
    }

    public final void a()
    {
        if (k != null)
        {
            k.a.a(this);
        }
        n.removeOnLayoutChangeListener(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        i = (iwc)olm1.a(iwc);
        j = (hoc)olm1.a(hoc);
        k = (hkl)olm1.b(hkl);
        b = (mmr)olm1.a(mmr);
        c = (ifj)olm1.a(ifj);
        l = (fia)olm1.a(fia);
        m = (hqq)olm1.a(hqq);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = bundle.getString("title_text");
            a(e);
            a(((hno) (new hne(this, bundle))));
            d = bundle.getString("old_title_text");
            if (bundle.getBoolean("edit_text_on"))
            {
                b(false);
                return;
            }
        }
    }

    public final void a(View view, Bundle bundle)
    {
        n = (AlbumTitleCard)view.findViewById(ag.Y);
        n.a.setOnEditorActionListener(this);
        n.b.setOnClickListener(new hng(this));
        n.addOnLayoutChangeListener(this);
        for (view = g.iterator(); view.hasNext(); ((hno)view.next()).a(n)) { }
        g.clear();
        boolean flag;
        if (k != null)
        {
            k.a.a(this, false);
            flag = k.b;
        } else
        {
            flag = false;
        }
        if (h && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, false);
    }

    void a(hno hno1)
    {
        if (n != null)
        {
            hno1.a(n);
            return;
        } else
        {
            g.add(hno1);
            return;
        }
    }

    public final void a(String s)
    {
        a(((hno) (new hnk(this, s))));
        e = s;
    }

    public final void a(List list)
    {
        a(((hno) (new hnm(this, list))));
    }

    public final void a(boolean flag)
    {
        AlbumTitleCard albumtitlecard = n;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        albumtitlecard.setVisibility(i1);
    }

    public final void b(String s)
    {
        a(new hnl(this, s));
    }

    public final void b(boolean flag)
    {
        if (!h)
        {
            return;
        } else
        {
            a(new hnn(this, flag));
            return;
        }
    }

    public final void b_(Object obj)
    {
        obj = (hkl)obj;
        boolean flag;
        if (h && ((hkl) (obj)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, false);
        if (h && !((hkl) (obj)).b)
        {
            b();
        }
    }

    public final void e(Bundle bundle)
    {
        boolean flag;
        if (n.a.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("edit_text_on", flag);
        bundle.putString("title_text", e);
        bundle.putString("edit_text", n.a.getText().toString());
        bundle.putString("old_title_text", d);
    }

    public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        while (keyevent != null && keyevent.getAction() != 1 || i1 != 6) 
        {
            return false;
        }
        b();
        return false;
    }

    public final void onLayoutChange(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2)
    {
        m.f();
    }
}
