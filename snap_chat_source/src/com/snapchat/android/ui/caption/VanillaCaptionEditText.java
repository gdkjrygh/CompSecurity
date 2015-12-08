// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import Fx;
import Gr;
import MB;
import Mf;
import Mo;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Handler;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText, CaptionTypeEnums

public class VanillaCaptionEditText extends CaptionEditText
    implements Gr.a
{

    int t;
    int u;
    private Gr v;

    public VanillaCaptionEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        v = new Gr(this);
        setInputType(16577);
        s = new TextWatcher() {

            private VanillaCaptionEditText a;

            public final void afterTextChanged(Editable editable)
            {
                if (!a.g) goto _L2; else goto _L1
_L1:
                return;
_L2:
                String s;
                String s1;
                s1 = editable.toString();
                VanillaCaptionEditText vanillacaptionedittext = a;
                s = s1;
                do
                {
label0:
                    {
                        boolean flag;
                        if (vanillacaptionedittext.getPaint().measureText(s) > 0.975F * (float)vanillacaptionedittext.u)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                        s = s.substring(0, s.length() - 1);
                    }
                } while (true);
                if (!TextUtils.equals(s1, s))
                {
                    a.a(s.length());
                    a.g = true;
                    editable.clear();
                    editable.append(s);
                    a.m = s.length();
                    a.g = false;
                } else
                if (a.m > 0)
                {
                    a.m = Math.max(a.m, s1.length());
                }
                if (!a.i) goto _L1; else goto _L3
_L3:
                if (a.l())
                {
                    Mf.a().a(new Mo(6));
                    return;
                }
                continue; /* Loop/switch isn't completed */
                if (((CaptionEditText) (a)).j) goto _L1; else goto _L4
_L4:
                Mf.a().a(new Mo(-1));
                return;
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
            }

            
            {
                a = VanillaCaptionEditText.this;
                super();
            }
        };
        addTextChangedListener(s);
    }

    public final volatile Object a()
    {
        return this;
    }

    protected final void a(boolean flag)
    {
        n = true;
        if (!flag)
        {
            Runnable runnable = new Runnable() {

                private VanillaCaptionEditText a;

                public final void run()
                {
                    if (!((CaptionEditText) (a)).a && a.n)
                    {
                        a.e = -1;
                        a.a(true);
                    }
                }

            
            {
                a = VanillaCaptionEditText.this;
                super();
            }
            };
            (new Handler()).postDelayed(runnable, 600L);
            if (e == -1)
            {
                super.c.toggleSoftInput(2, 0);
                b();
                return;
            }
        }
        super.a(flag);
        g = true;
    }

    public final volatile boolean a(Object obj, Gr.c c1)
    {
        obj = (VanillaCaptionEditText)obj;
        float f2 = c1.b;
        float f1 = f2;
        if (f2 < (float)r)
        {
            f1 = r;
        }
        f2 = f1;
        if (f1 > (float)q)
        {
            f2 = q;
        }
        ((VanillaCaptionEditText) (obj)).a(0.0F, f2);
        return true;
    }

    protected final void b(MotionEvent motionevent)
    {
        v.a(motionevent);
    }

    public final void b(Object obj, Gr.c c1)
    {
        obj = (VanillaCaptionEditText)obj;
        c1.a(0.0F, ((VanillaCaptionEditText) (obj)).getY(), false, ((VanillaCaptionEditText) (obj)).getScaleX(), false, ((VanillaCaptionEditText) (obj)).getScaleX(), ((VanillaCaptionEditText) (obj)).getScaleY(), false, 0.0F);
    }

    public final void b(boolean flag)
    {
        n = false;
        boolean flag1 = super.a;
        super.c.hideSoftInputFromWindow(getWindowToken(), 0, b);
        if (TextUtils.isEmpty(getText()) || flag1)
        {
            setVisibility(4);
        }
        clearFocus();
        getRootView().requestFocus();
        setCursorVisible(false);
        setGravity(17);
        if (!flag) goto _L2; else goto _L1
_L1:
        startAnimation(g());
_L4:
        Mf.a().a(new MB(false));
        return;
_L2:
        if (!TextUtils.isEmpty(getText()))
        {
            setY((int)super.l);
            setVisibility(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void c()
    {
        setGravity(3);
    }

    public final boolean c(MotionEvent motionevent)
    {
        Matrix matrix = new Matrix();
        getMatrix().invert(matrix);
        float af[] = new float[2];
        af[0] = motionevent.getX();
        af[1] = motionevent.getY();
        matrix.mapPoints(af);
        return af[1] < (float)getHeight() && af[1] > 0.0F;
    }

    protected final int d()
    {
        return e - getHeight();
    }

    protected final void e()
    {
        ((Activity)getContext()).getWindow().setSoftInputMode(16);
        super.e();
        setGravity(3);
        requestFocus();
        setSelection(getText().length());
        setCursorVisible(true);
    }

    protected final Animation f()
    {
        return new CaptionEditText.b(this, 0, 0, (int)super.l, d());
    }

    protected final Animation g()
    {
        if (TextUtils.isEmpty(getText()))
        {
            return new CaptionEditText.a(this, false);
        } else
        {
            return new CaptionEditText.b(this, 0, 0, d(), (int)super.l);
        }
    }

    protected final Fx k()
    {
        return new Fx(CaptionTypeEnums.NON_FAT_VANILLA_CAPTION_TYPE, false, false, false);
    }

    protected final boolean l()
    {
        return getPaint().measureText(getText().toString()) > 0.975F * (float)Math.min(u, t);
    }
}
