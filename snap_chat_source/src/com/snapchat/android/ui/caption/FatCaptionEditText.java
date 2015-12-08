// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import FB;
import Fx;
import Fz;
import Gr;
import Jo;
import MB;
import Mf;
import Mo;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText, CaptionColorRange, CaptionTypeEnums

public class FatCaptionEditText extends CaptionEditText
    implements Gr.a
{

    protected boolean A;
    public boolean B;
    private Gr C;
    private final GestureDetector D;
    private final ScaleGestureDetector E;
    private boolean F;
    private CaptionColorRange G;
    private ForegroundColorSpan H;
    double t;
    double u;
    protected float v;
    protected float w;
    protected double x;
    protected double y;
    protected boolean z;

    public FatCaptionEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        C = new Gr(this);
        v = 0.0F;
        w = 1.0F;
        x = -1D;
        y = -1D;
        z = false;
        A = false;
        F = false;
        B = false;
        setLayerType(1, null);
        setInputType(0x240c1);
        setGravity(51);
        D = new GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() {

            private FatCaptionEditText a;

            public final void onLongPress(MotionEvent motionevent)
            {
                if (a.n && !a.B)
                {
                    FatCaptionEditText.a(a);
                    a.B = true;
                    a.performLongClick();
                }
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionevent)
            {
                a.B = false;
                FatCaptionEditText.a(a);
                return true;
            }

            
            {
                a = FatCaptionEditText.this;
                super();
            }
        });
        E = new ScaleGestureDetector(context, new android.view.ScaleGestureDetector.OnScaleGestureListener() {

            private FatCaptionEditText a;

            public final boolean onScale(ScaleGestureDetector scalegesturedetector)
            {
                a.z = true;
                a.A = true;
                a.p = false;
                FatCaptionEditText.a(a, a.x * (double)scalegesturedetector.getScaleFactor());
                return true;
            }

            public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
            {
                FatCaptionEditText.a(a, true);
                return true;
            }

            public final void onScaleEnd(ScaleGestureDetector scalegesturedetector)
            {
                FatCaptionEditText.a(a, false);
            }

            
            {
                a = FatCaptionEditText.this;
                super();
            }
        });
        s = new TextWatcher() {

            private FatCaptionEditText a;

            public final void afterTextChanged(Editable editable)
            {
                if (!a.g && !FatCaptionEditText.b(a))
                {
                    a.B = false;
                    if (FatCaptionEditText.a(editable))
                    {
                        a.b(true);
                        return;
                    }
                    if (a.i && !((CaptionEditText) (a)).j)
                    {
                        Mf.a().a(new Mo(-1));
                        return;
                    }
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int i1, int j1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int i1, int j1)
            {
            }

            
            {
                a = FatCaptionEditText.this;
                super();
            }
        };
        addTextChangedListener(s);
        setOnLongClickListener(new Fz());
    }

    static CaptionColorRange a(FatCaptionEditText fatcaptionedittext)
    {
        fatcaptionedittext.G = null;
        return null;
    }

    private void a(double d1)
    {
        double d2;
        if (d1 > t)
        {
            d2 = t;
        } else
        {
            d2 = d1;
            if (d1 < u)
            {
                d2 = u;
            }
        }
        if (n)
        {
            x = d2;
        } else
        {
            y = d2;
        }
        l();
    }

    private void a(Editable editable, int i, int i1, int j1)
    {
        ForegroundColorSpan aforegroundcolorspan[] = (ForegroundColorSpan[])editable.getSpans(0, getText().length(), android/text/style/ForegroundColorSpan);
        Object obj = new ArrayList();
        ArrayList arraylist = new ArrayList();
        int i3 = aforegroundcolorspan.length;
        int k1 = 0;
        int l1 = j1;
        int j2 = i1;
        while (k1 < i3) 
        {
            ForegroundColorSpan foregroundcolorspan = aforegroundcolorspan[k1];
            int l2 = editable.getSpanStart(foregroundcolorspan);
            int k2 = editable.getSpanEnd(foregroundcolorspan);
            int j3 = foregroundcolorspan.getForegroundColor();
            if (j3 == i && l2 <= i1 && k2 >= j1)
            {
                return;
            }
            boolean flag1 = false;
            boolean flag = flag1;
            int i2 = j2;
            if (l2 < i1)
            {
                flag = flag1;
                i2 = j2;
                if (k2 > i1)
                {
                    flag = true;
                    boolean flag2;
                    if (i != j3)
                    {
                        arraylist.add(new CaptionColorRange(j3, l2, i1));
                        i2 = j2;
                    } else
                    {
                        i2 = l2;
                    }
                }
            }
            flag2 = flag;
            j2 = l1;
            if (l2 < j1)
            {
                flag2 = flag;
                j2 = l1;
                if (k2 > j1)
                {
                    flag2 = true;
                    if (i != j3)
                    {
                        arraylist.add(new CaptionColorRange(j3, j1, k2));
                        j2 = l1;
                    } else
                    {
                        j2 = k2;
                    }
                }
            }
            if (flag2)
            {
                ((List) (obj)).add(foregroundcolorspan);
            }
            k1++;
            l1 = j2;
            j2 = i2;
        }
        arraylist.add(new CaptionColorRange(i, j2, l1));
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); editable.removeSpan(obj))
        {
            obj = (ForegroundColorSpan)iterator.next();
            Timber.c("FatCaptionEditText", "removing a color span: %s [%s, %s]", new Object[] {
                Integer.valueOf(((ForegroundColorSpan) (obj)).getForegroundColor()), Integer.valueOf(editable.getSpanStart(obj)), Integer.valueOf(editable.getSpanEnd(obj))
            });
        }

        a(editable, ((List) (arraylist)));
    }

    private void a(Editable editable, List list)
    {
        editable = new SpannableString(editable);
        CaptionColorRange captioncolorrange;
        for (list = list.iterator(); list.hasNext(); editable.setSpan(H, captioncolorrange.b, captioncolorrange.c, 34))
        {
            captioncolorrange = (CaptionColorRange)list.next();
            Timber.c("FatCaptionEditText", "adding a new color span: %s [%s, %s]", new Object[] {
                Integer.valueOf(captioncolorrange.a), Integer.valueOf(captioncolorrange.b), Integer.valueOf(captioncolorrange.c)
            });
            H = new ForegroundColorSpan(captioncolorrange.a);
        }

        setText(editable, android.widget.TextView.BufferType.SPANNABLE);
    }

    static void a(FatCaptionEditText fatcaptionedittext, double d1)
    {
        fatcaptionedittext.a(d1);
    }

    protected static boolean a(Editable editable)
    {
        int i = editable.toString().lastIndexOf('\n');
        if (i != -1)
        {
            editable.replace(i, i + 1, "");
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(FatCaptionEditText fatcaptionedittext, boolean flag)
    {
        fatcaptionedittext.F = flag;
        return flag;
    }

    static boolean b(FatCaptionEditText fatcaptionedittext)
    {
        return fatcaptionedittext.F;
    }

    private void o()
    {
        String s = getText().toString();
        if (TextUtils.isEmpty(s))
        {
            a(t);
            return;
        }
        StringTokenizer stringtokenizer = new StringTokenizer(s);
        s = "";
        do
        {
            if (!stringtokenizer.hasMoreTokens())
            {
                break;
            }
            String s1 = stringtokenizer.nextToken();
            if (getPaint().measureText(s1) > getPaint().measureText(s))
            {
                s = s1;
            }
        } while (true);
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        float f1 = getPaint().getTextSize() / getPaint().measureText(s);
        a((float)(Jo.a(displaymetrics, i) - getPaddingLeft() - getPaddingRight() - 15) * f1);
    }

    public final volatile Object a()
    {
        FatCaptionEditText fatcaptionedittext = this;
        if (!o)
        {
            fatcaptionedittext = null;
        }
        return fatcaptionedittext;
    }

    protected final void a(ArrayList arraylist)
    {
        SpannableString spannablestring = new SpannableString(getText());
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            CaptionColorRange captioncolorrange = (CaptionColorRange)arraylist.next();
            if (captioncolorrange.c <= getText().length())
            {
                spannablestring.setSpan(new ForegroundColorSpan(captioncolorrange.a), captioncolorrange.b, captioncolorrange.c, 34);
            }
        } while (true);
        setText(spannablestring, android.widget.TextView.BufferType.SPANNABLE);
    }

    protected final void a(boolean flag)
    {
        if (F)
        {
            return;
        }
        n = true;
        l();
        n();
        if (!flag)
        {
            Runnable runnable = new Runnable() {

                private FatCaptionEditText a;

                public final void run()
                {
                    if (!((CaptionEditText) (a)).a && a.n)
                    {
                        a.e = -1;
                        a.a(true);
                    }
                }

            
            {
                a = FatCaptionEditText.this;
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
        setMaxHeight(e - d.e());
    }

    protected final boolean a(MotionEvent motionevent)
    {
        boolean flag = E.onTouchEvent(motionevent);
        if (!F)
        {
            flag = D.onTouchEvent(motionevent);
            if (!B)
            {
                return super.a(motionevent);
            }
        }
        return flag;
    }

    public final boolean a(Object obj, Gr.c c1)
    {
        float f1 = 5F;
        obj = (FatCaptionEditText)obj;
        float f2 = c1.a();
        if (f2 <= 5F)
        {
            f1 = f2;
        }
        if (p)
        {
            f2 = c1.a;
        } else
        {
            f2 = ((CaptionEditText) (obj)).k;
        }
        ((FatCaptionEditText) (obj)).a(f2, c1.b);
        v = (float)((double)(c1.b() * 180F) / 3.1415926535897931D);
        w = f1;
        ((FatCaptionEditText) (obj)).setRotation(v);
        ((FatCaptionEditText) (obj)).setScaleX(w);
        ((FatCaptionEditText) (obj)).setScaleY(w);
        if (v != 0.0F || w != 1.0F)
        {
            p = true;
        }
        return true;
    }

    protected final void b(MotionEvent motionevent)
    {
        C.a(motionevent);
    }

    public final void b(Object obj, Gr.c c1)
    {
        obj = (FatCaptionEditText)obj;
        float f1;
        if (p)
        {
            f1 = ((FatCaptionEditText) (obj)).getX();
        } else
        {
            f1 = ((CaptionEditText) (obj)).k;
        }
        c1.a(f1, ((FatCaptionEditText) (obj)).getY(), true, ((FatCaptionEditText) (obj)).getScaleX(), true, ((FatCaptionEditText) (obj)).getScaleX(), ((FatCaptionEditText) (obj)).getScaleY(), true, (float)Math.toRadians(((FatCaptionEditText) (obj)).getRotation()));
    }

    public final void b(boolean flag)
    {
        n = false;
        B = false;
        if (z)
        {
            y = x;
            m();
            z = false;
        }
        n();
        ((Activity)getContext()).getWindow().setSoftInputMode(16);
        super.c.hideSoftInputFromWindow(getWindowToken(), 0);
        setRotation(v);
        setScaleX(w);
        setScaleY(w);
        if (TextUtils.isEmpty(getText()))
        {
            setVisibility(4);
        }
        clearFocus();
        getRootView().requestFocus();
        setCursorVisible(false);
        if (flag)
        {
            startAnimation(g());
        } else
        {
            a((int)super.k, (int)super.l);
        }
        Mf.a().a(new MB(false));
        if (!TextUtils.isEmpty(getText()))
        {
            h();
            setMaxHeight((q + getHeight()) - r);
        }
    }

    protected final void c()
    {
        setRotation(0.0F);
        setScaleX(1.0F);
        setScaleY(1.0F);
        a(0, d());
    }

    public final boolean c(MotionEvent motionevent)
    {
        Matrix matrix = new Matrix();
        getMatrix().invert(matrix);
        float af[] = new float[2];
        af[0] = motionevent.getX();
        af[1] = motionevent.getY();
        matrix.mapPoints(af);
        float f4 = getResources().getDimension(0x7f0a0093) / w / 2.0F;
        float f1 = getHeight() / 2;
        float f2 = Math.max(f1, f4);
        float f3 = getWidth() / 2;
        f4 = Math.max(f3, f4);
        return (new RectF(f3 - f4, f1 - f2, f4 + f3, f1 + f2)).contains(af[0], af[1]);
    }

    protected final int d()
    {
        return e - Math.min(getHeight(), e - d.e());
    }

    protected void e()
    {
        c();
        super.e();
        setSelection(getText().length());
        setCursorVisible(true);
        setMaxHeight(e - d.e());
    }

    protected final Animation f()
    {
        return new CaptionEditText.b(this, (int)super.k, 0, (int)super.l, d());
    }

    protected final Animation g()
    {
        if (TextUtils.isEmpty(getText()))
        {
            return new CaptionEditText.a(this, false);
        } else
        {
            return new CaptionEditText.b(this, 0, (int)super.k, d(), Math.min((int)super.l, q));
        }
    }

    protected final ArrayList j()
    {
        ArrayList arraylist = new ArrayList();
        ForegroundColorSpan aforegroundcolorspan[] = (ForegroundColorSpan[])getText().getSpans(0, getText().length(), android/text/style/ForegroundColorSpan);
        Timber.c("FatCaptionEditText", "Total colors : %s", new Object[] {
            Integer.valueOf(aforegroundcolorspan.length)
        });
        int j1 = aforegroundcolorspan.length;
        int i1 = 0;
        for (int i = 0; i1 < j1; i++)
        {
            ForegroundColorSpan foregroundcolorspan = aforegroundcolorspan[i1];
            Timber.c("FatCaptionEditText", "[%s] color : %s (%s, %s)", new Object[] {
                Integer.valueOf(i), Integer.valueOf(foregroundcolorspan.getForegroundColor()), Integer.valueOf(getText().getSpanStart(foregroundcolorspan)), Integer.valueOf(getText().getSpanEnd(foregroundcolorspan))
            });
            arraylist.add(new CaptionColorRange(foregroundcolorspan.getForegroundColor(), getText().getSpanStart(foregroundcolorspan), getText().getSpanEnd(foregroundcolorspan)));
            i1++;
        }

        return arraylist;
    }

    protected Fx k()
    {
        CaptionTypeEnums captiontypeenums = CaptionTypeEnums.FAT_CAPTION_TYPE;
        boolean flag1 = p;
        boolean flag;
        if (j().size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new Fx(captiontypeenums, flag1, flag, A);
    }

    protected final void l()
    {
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        if (!n) goto _L2; else goto _L1
_L1:
        if (x >= 0.0D) goto _L4; else goto _L3
_L3:
        o();
_L6:
        return;
_L4:
        if (Math.abs(x - (double)getTextSize()) > 1.0D)
        {
            setTextSize(1, (float)x / displaymetrics.density);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (y < 0.0D)
        {
            o();
            return;
        }
        if (Math.abs(y - (double)getTextSize()) > 1.0D)
        {
            setTextSize(1, (float)y / displaymetrics.density);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void m()
    {
        w = 1.0F;
        v = 0.0F;
        a(0.0F);
    }

    protected final void n()
    {
        byte byte0;
        if (n)
        {
            byte0 = -1;
        } else
        {
            byte0 = -2;
        }
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(byte0, -2));
        invalidate();
    }

    public void setColor(int i)
    {
        boolean flag;
        int i1;
        int j1;
label0:
        {
label1:
            {
                B = false;
                j1 = getSelectionStart();
                i1 = getSelectionEnd();
                if (j1 != -1 && i1 != -1)
                {
                    if (j1 == i1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        i1 = getText().length();
                        j1 = 0;
                    }
                    if (G == null || G.b != j1 || G.c != i1 || G.a == i)
                    {
                        break label0;
                    }
                    if (H != null)
                    {
                        getText().removeSpan(H);
                    }
                    H = new ForegroundColorSpan(i);
                    G = new CaptionColorRange(i, j1, i1);
                    getText().setSpan(H, j1, i1, 34);
                    setText(getText(), android.widget.TextView.BufferType.SPANNABLE);
                    if (!flag)
                    {
                        break label1;
                    }
                    setSelection(getText().length());
                }
                return;
            }
            setSelection(j1, i1);
            return;
        }
        if (G == null)
        {
            if (flag)
            {
                getText().clearSpans();
                List list = Collections.singletonList(new CaptionColorRange(i, 0, i1));
                a(getText(), list);
                setSelection(getText().length());
            } else
            {
                a(getText(), i, j1, i1);
                setSelection(j1, i1);
            }
        }
        G = new CaptionColorRange(i, j1, i1);
    }
}
