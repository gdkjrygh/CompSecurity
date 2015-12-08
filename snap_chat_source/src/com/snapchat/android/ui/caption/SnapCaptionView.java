// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import Bt;
import FB;
import Fx;
import Ja;
import Jo;
import MB;
import MU;
import Mf;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.snapchat.android.Timber;
import com.snapchat.android.database.SharedPreferenceKey;
import com.squareup.otto.Bus;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText, CaptionTypeEnums

public abstract class SnapCaptionView extends FrameLayout
{

    protected final CaptionEditText a;
    protected int b;
    protected int c;
    protected boolean d;
    private XmlResourceParser e;

    public SnapCaptionView(Context context)
    {
        super(context);
        d = false;
        InputMethodManager inputmethodmanager = (InputMethodManager)context.getSystemService("input_method");
        setFocusable(true);
        setFocusableInTouchMode(true);
        new Ja(context);
        e = c();
        a = b(context);
        a.g = true;
        f();
        d();
        a.g = false;
        a.c = inputmethodmanager;
        addView(a);
    }

    private void b(int i1)
    {
        if (a.f)
        {
            return;
        } else
        {
            a.b(i1);
            a.a(false);
            return;
        }
    }

    private void c(int i1)
    {
        a.b(i1);
    }

    public Bundle a()
    {
        Bt.a(d, a.i());
        Bundle bundle = new Bundle();
        bundle.putFloat("captionPreviousYPercentageOnScreen", (float)o() / (float)b);
        bundle.putString("captionViewText", l());
        bundle.putBoolean("isEditing", a.n);
        bundle.putInt("captionType", e().ordinal());
        bundle.putInt("keyboardHeight", a.i());
        bundle.putParcelableArrayList("captionInitializationColorSpans", a.j());
        if (a.m > 0)
        {
            bundle.putInt("captionMaxLength", a.m);
        }
        return bundle;
    }

    protected final void a(int i1)
    {
        a.a(i1);
    }

    public void a(Bundle bundle, boolean flag)
    {
        boolean flag1 = false;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a.b(bundle.getInt("keyboardHeight"));
        Object obj = bundle.getString("captionViewText");
        if (obj != null)
        {
            a.g = true;
            a.setText(((CharSequence) (obj)));
            a.g = false;
        }
        if (!flag && TextUtils.isEmpty(((CharSequence) (obj))))
        {
            a.setVisibility(4);
        } else
        {
            a.setVisibility(0);
        }
        a.setCursorVisible(false);
        a.n = bundle.getBoolean("isEditing");
        obj = bundle.getParcelableArrayList("captionInitializationColorSpans");
        a.a(((java.util.ArrayList) (obj)));
        a(bundle, flag, a);
        if (!a.n)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a.e();
_L4:
        if (flag1)
        {
            Mf.a().a(new MB(a.n));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        a.c();
        a.setSelection(l().length());
        a.setCursorVisible(true);
        flag1 = true;
          goto _L4
    }

    protected void a(Bundle bundle, boolean flag, CaptionEditText captionedittext)
    {
        float f1 = bundle.getFloat("captionPreviousYPercentageOnScreen");
        int i1 = captionedittext.getHeight();
        float f2 = f1 * (float)b;
        float f3 = ((float)i1 + f2) - (float)b;
        f1 = f2;
        if (f3 > 0.0F)
        {
            f1 = f2 - f3;
        }
        captionedittext.b(f1);
    }

    public final void a(MotionEvent motionevent)
    {
        while (a.getVisibility() == 0 && !a.c(motionevent) || motionevent.getAction() != 1) 
        {
            return;
        }
        b((int)motionevent.getY());
    }

    public void a(boolean flag)
    {
        if (!a.n || a.f)
        {
            return;
        } else
        {
            a.b(flag);
            return;
        }
    }

    protected abstract CaptionEditText b(Context context);

    protected void b()
    {
        a.b((o() * b) / c);
    }

    public final boolean b(MotionEvent motionevent)
    {
        if (a.getVisibility() != 0)
        {
            return false;
        } else
        {
            return a.c(motionevent);
        }
    }

    protected abstract XmlResourceParser c();

    protected void d()
    {
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return a.dispatchTouchEvent(motionevent);
    }

    public abstract CaptionTypeEnums e();

    public final boolean f()
    {
        boolean flag1 = true;
        boolean flag2 = d;
        android.util.DisplayMetrics displaymetrics;
        boolean flag;
        if (!Jo.f(getContext()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (d != flag2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        displaymetrics = getContext().getResources().getDisplayMetrics();
        c = Jo.a(displaymetrics, d);
        b = Jo.b(displaymetrics, d);
        a.c(d);
        a.b(Bt.o(d));
        if (flag)
        {
            b();
        }
        return flag;
    }

    public final void g()
    {
        if (!d)
        {
            b = Jo.i(getContext());
            return;
        } else
        {
            b = Jo.b(getResources().getDisplayMetrics(), d);
            return;
        }
    }

    public final void h()
    {
        b(b / 2);
    }

    public final boolean i()
    {
        return a.n;
    }

    public final boolean j()
    {
        return a.o;
    }

    protected final AttributeSet k()
    {
        int i1 = 0;
_L4:
        int j1 = e.next();
        i1 = j1;
_L2:
        if (i1 == 2 && TextUtils.equals(e.getName(), "EditText"))
        {
            return Xml.asAttributeSet(e);
        }
        break; /* Loop/switch isn't completed */
        Object obj;
        obj;
_L5:
        Timber.a("SnapCaptionView", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        return null;
        obj;
          goto _L5
    }

    public final String l()
    {
        if (a.isInEditMode())
        {
            return a.getEditableText().toString();
        } else
        {
            return a.getText().toString();
        }
    }

    public final boolean m()
    {
        return TextUtils.isEmpty(a.getText());
    }

    public final void n()
    {
        a.h = true;
    }

    protected final int o()
    {
        return (int)a.l;
    }

    public void onKeyDownEvent(MU mu)
    {
        while (a.n || mu.event.getUnicodeChar() == 0) 
        {
            return;
        }
        c((int)(0.62D * (double)b));
        a.a(true);
        a.append(String.valueOf((char)mu.event.getUnicodeChar()));
    }

    protected final int p()
    {
        return (int)a.k;
    }

    public final Fx q()
    {
        if (TextUtils.isEmpty(a.getText()))
        {
            return null;
        } else
        {
            return a.k();
        }
    }

    public void setCaptionEditTextOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        a.setOnTouchListener(ontouchlistener);
    }

    public void setInterface(FB fb)
    {
        a.setInterface(fb);
    }

    public void setIsVideoSnap(boolean flag)
    {
        a.j = flag;
    }

    public void setText(String s)
    {
        a.setText(s);
        a.setVisibility(0);
        int i1 = Jo.a(a);
        int j1 = PreferenceManager.getDefaultSharedPreferences(getContext()).getInt(SharedPreferenceKey.KEYBOARD_HEIGHT_PORTRAIT.getKey(), -1);
        if (j1 == -1)
        {
            c((int)((float)b * 0.6F));
        } else
        {
            c(j1 - i1);
        }
        a.a(0, o());
    }
}
