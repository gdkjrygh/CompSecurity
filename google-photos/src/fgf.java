// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.photos.edittext.EditTextHolder;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;
import java.util.ArrayList;
import java.util.List;

public final class fgf
    implements android.widget.TextView.OnEditorActionListener, omb, opp, ops, opv
{

    public final List a;
    public SparseArray b;
    public EditTextHolder c;
    private final fgm d;
    private fgl e;
    private Context f;
    private iwc g;
    private noz h;
    private String i;
    private String j;

    public fgf(opd opd1, fgm fgm1)
    {
        this(opd1, fgm1, (byte)0);
    }

    private fgf(opd opd1, fgm fgm1, byte byte0)
    {
        a = new ArrayList();
        p.a(fgm1);
        d = fgm1;
        opd1.a(this);
    }

    static fgl a(fgf fgf1, fgl fgl)
    {
        fgf1.e = fgl;
        return fgl;
    }

    static fgm a(fgf fgf1)
    {
        return fgf1.d;
    }

    private void a(fgk fgk1)
    {
        if (c != null)
        {
            fgk1.a(c);
            return;
        } else
        {
            a.add(fgk1);
            return;
        }
    }

    static Context b(fgf fgf1)
    {
        return fgf1.f;
    }

    static fgl c(fgf fgf1)
    {
        return fgf1.e;
    }

    static iwc d(fgf fgf1)
    {
        return fgf1.g;
    }

    static EditTextHolder e(fgf fgf1)
    {
        return fgf1.c;
    }

    private void e()
    {
        if (c != null)
        {
            Object obj = c.a();
            if (!((String) (obj)).equals(j))
            {
                i = j;
                if (h.a())
                {
                    noy.a("newEditText", obj);
                    noy.a("oldStaticText", i);
                }
                a(((String) (obj)));
                d.a(((String) (obj)));
            }
            f();
            obj = c;
            Object obj1 = f;
            ((EditTextHolder) (obj)).b.setVisibility(8);
            ((EditTextHolder) (obj)).a.setVisibility(0);
            obj1 = EditTextHolder.a(((Context) (obj1)));
            if (obj1 != null)
            {
                ((InputMethodManager) (obj1)).hideSoftInputFromWindow(((EditTextHolder) (obj)).b.getWindowToken(), 0);
                return;
            }
        }
    }

    private void f()
    {
        if (e == null || g == null)
        {
            return;
        } else
        {
            g.a().b(e);
            return;
        }
    }

    static void f(fgf fgf1)
    {
        fgf1.e();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        f = context;
        g = (iwc)olm1.a(iwc);
        h = noz.a(context, 2, "EditTextHolderCtrl", new String[0]);
        if (bundle != null)
        {
            j = bundle.getString("photos_edittext_static_text");
            a(j);
            a(((fgk) (new fgh(this, bundle))));
            i = bundle.getString("photos_edittext_old_text");
            b = bundle.getSparseParcelableArray("photos_edittext_edit_text_holder_state");
            if (bundle.getBoolean("photos_edittext_edit_text_on"))
            {
                c();
                return;
            }
        }
    }

    public final void a(String s)
    {
        a(((fgk) (new fgi(this, s))));
        j = s;
    }

    public final boolean a()
    {
        return c != null && c.b();
    }

    public final void am_()
    {
        if (c != null && c.b())
        {
            e();
        }
    }

    public final void c()
    {
        a(new fgj(this));
    }

    public final void d()
    {
        a(i);
        f();
    }

    public final void e(Bundle bundle)
    {
        if (c != null)
        {
            if (h.a())
            {
                noy.a("STATE_STATIC_TEXT", j);
                noy.a("STATE_OLD_TEXT", i);
            }
            bundle.putString("photos_edittext_static_text", j);
            bundle.putString("photos_edittext_old_text", i);
            if (c != null)
            {
                if (h.a())
                {
                    noy.a("STATE_EDIT_TEXT_ON", Boolean.valueOf(c.b()));
                    noy.a("STATE_EDIT_TEXT", c.a());
                }
                bundle.putBoolean("photos_edittext_edit_text_on", c.b());
                bundle.putString("photos_edittext_edit_text", c.a());
                SparseArray sparsearray;
                if (c == null)
                {
                    sparsearray = null;
                } else
                {
                    sparsearray = new SparseArray();
                    c.saveHierarchyState(sparsearray);
                }
                bundle.putSparseParcelableArray("photos_edittext_edit_text_holder_state", sparsearray);
                return;
            }
        }
    }

    public final boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
    {
        while (keyevent != null && keyevent.getAction() != 1 || k != 6) 
        {
            return false;
        }
        e();
        return false;
    }
}
