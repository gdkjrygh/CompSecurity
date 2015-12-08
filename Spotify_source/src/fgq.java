// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.CpuArchitecture;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class fgq
    implements fha
{

    final Set a = new LinkedHashSet();
    public EditText b;
    final Drawable c;
    boolean d;
    private final Context e;
    private final View f;
    private final Drawable g;
    private final dcr h;
    private android.widget.TextView.OnEditorActionListener i;

    public fgq(rf rf1)
    {
        i = new android.widget.TextView.OnEditorActionListener() {

            private fgq a;

            public final boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                boolean flag1;
                if (j == 3)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (j == 0 && keyevent != null && keyevent.getAction() == 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (flag1 || j != 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (j != 0)
                {
                    keyevent = a;
                    if (((fgq) (keyevent)).a.isEmpty())
                    {
                        j = 0;
                    } else
                    {
                        textview = keyevent.b();
                        for (keyevent = ((fgq) (keyevent)).a.iterator(); keyevent.hasNext(); ((fhb)keyevent.next()).b(textview)) { }
                        j = 1;
                    }
                    if (j != 0)
                    {
                        return true;
                    }
                }
                return false;
            }

            
            {
                a = fgq.this;
                super();
            }
        };
        e = (Context)ctz.a(rf1);
        h = (dcr)dcq.a(((Toolbar)ctz.a((Toolbar)rf1.findViewById(0x7f110400))).findViewById(0x7f1103e9));
        dcr dcr1 = h;
        View view = LayoutInflater.from(rf1.f().f()).inflate(0x7f030019, null);
        f = view;
        dcr1.a(view);
        b = (EditText)f.findViewById(0x7f110295);
        if (gcl.e)
        {
            CpuArchitecture cpuarchitecture = CpuArchitecture.a;
            float f1;
            boolean flag;
            if (CpuArchitecture.a() == cpuarchitecture)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                b.setInputType(b.getInputType() | 0x80000);
            }
        }
        f1 = rf1.getResources().getDimensionPixelSize(0x7f0c007d);
        g = new dfz(rf1, SpotifyIcon.N, f1);
        c = new dfz(rf1, SpotifyIcon.ai, f1);
        a();
        b.addTextChangedListener(new gbp() {

            private int a;
            private fgq b;

            public final void afterTextChanged(Editable editable)
            {
                Object obj = b;
                String s = fgq.a(editable);
                for (obj = ((fgq) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); ((fhb)((Iterator) (obj)).next()).a(s)) { }
                if (editable != null && a != editable.length())
                {
                    b.a();
                    a = editable.length();
                    editable = b;
                    boolean flag1;
                    if (a > 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    editable.d = flag1;
                }
            }

            
            {
                b = fgq.this;
                super();
                a = b.b.length();
            }
        });
        b.setOnEditorActionListener(i);
        b.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private fgq a;

            public final void onFocusChange(View view1, boolean flag1)
            {
                for (view1 = a.a.iterator(); view1.hasNext(); ((fhb)view1.next()).a(flag1)) { }
            }

            
            {
                a = fgq.this;
                super();
            }
        });
        b.setOnTouchListener(new android.view.View.OnTouchListener() {

            private final Rect a = new Rect();
            private boolean b;
            private fgq c;

            public final boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (!c.d)
                {
                    break MISSING_BLOCK_LABEL_208;
                }
                float f2 = motionevent.getX();
                float f3 = motionevent.getY();
                c.c.copyBounds(a);
                a.offsetTo(c.b.getWidth() - c.b.getPaddingRight() - a.width(), c.b.getPaddingTop());
                view1 = a;
                view1.left = ((Rect) (view1)).left - 5;
                view1 = a;
                view1.top = ((Rect) (view1)).top - 5;
                view1 = a;
                view1.right = ((Rect) (view1)).right + 5;
                view1 = a;
                view1.bottom = ((Rect) (view1)).bottom + 5;
                if (!a.contains((int)f2, (int)f3))
                {
                    break MISSING_BLOCK_LABEL_208;
                }
                if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
                b = true;
_L4:
                return true;
_L2:
                if (motionevent.getAction() != 1 || !b) goto _L4; else goto _L3
_L3:
                view1 = c;
                ((fgq) (view1)).b.getText().clear();
                view1.c();
                return true;
                if (motionevent.getAction() == 0)
                {
                    b = false;
                }
                return false;
            }

            
            {
                c = fgq.this;
                super();
            }
        });
        a(false);
    }

    static String a(Editable editable)
    {
        if (editable != null)
        {
            return editable.toString();
        } else
        {
            return "";
        }
    }

    final void a()
    {
        Drawable drawable;
        if (b.length() > 0)
        {
            drawable = c;
        } else
        {
            drawable = null;
        }
        b.setCompoundDrawablesWithIntrinsicBounds(g, null, drawable, null);
    }

    public final void a(int j)
    {
        b.setHint(j);
    }

    public final void a(fhb fhb)
    {
        a.add(ctz.a(fhb));
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            if (h.b() != f)
            {
                h.a(f);
            }
            h.a(true);
            return;
        } else
        {
            h.a(false);
            return;
        }
    }

    public final String b()
    {
        return a(b.getText());
    }

    public final void b(fhb fhb)
    {
        a.remove(ctz.a(fhb));
    }

    public final void c()
    {
        b.requestFocus();
        ((InputMethodManager)e.getSystemService("input_method")).showSoftInput(b, 1);
    }

    public final void d()
    {
        h.a(null);
    }
}
