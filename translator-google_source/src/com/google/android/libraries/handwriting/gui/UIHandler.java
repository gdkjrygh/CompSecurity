// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.base.a;
import com.google.android.libraries.handwriting.base.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            b, g, c, ak, 
//            ai, al, w, UndoButtonInterface, 
//            ad, d, i, HandwritingOverlayView, 
//            m, a, n, aj, 
//            t, GestureRecognizer, s, ah, 
//            j, aa, ag, ae

public class UIHandler extends Handler
    implements android.inputmethodservice.KeyboardView.OnKeyboardActionListener, b, g
{

    private String A;
    private int B;
    private boolean C;
    private View D;
    private boolean E;
    private final ak F = new ak(this);
    private boolean G;
    private final Object a;
    final al b;
    public HandwritingOverlayView c;
    public View d;
    final i e;
    int f;
    Stroke g;
    public final com.google.android.libraries.handwriting.gui.c h = new com.google.android.libraries.handwriting.gui.c();
    public com.google.android.libraries.handwriting.gui.a i;
    public UndoButtonInterface j;
    public final int k;
    public final int l;
    boolean m;
    boolean n;
    String o;
    ai p;
    private boolean q;
    private final SpannableStringBuilder r = new SpannableStringBuilder();
    private boolean s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private TextView z;

    public UIHandler(al al1, i i1, Object obj)
    {
        f = 0;
        s = false;
        B = 0;
        m = false;
        C = true;
        E = true;
        n = false;
        o = "";
        G = false;
        p = new ai(this);
        b = al1;
        a = obj;
        e = i1;
        al1 = b.getContext().getResources();
        k = al1.getInteger(w.space);
        t = al1.getInteger(w.nonspace);
        l = al1.getInteger(w.delete);
        v = al1.getInteger(w.globe_key);
        w = al1.getInteger(w.action);
        x = al1.getInteger(w.ink_hash);
        y = al1.getInteger(w.undo);
        u = al1.getInteger(w.emoji_mode);
        c.a = 9;
    }

    static TextView a(UIHandler uihandler)
    {
        return uihandler.z;
    }

    static String a(UIHandler uihandler, String s1)
    {
        uihandler.o = s1;
        return s1;
    }

    static void a(UIHandler uihandler, UndoButtonInterface.UndoButtonState undobuttonstate)
    {
        uihandler.a(undobuttonstate);
    }

    private void a(UndoButtonInterface.UndoButtonState undobuttonstate)
    {
        String s1 = String.valueOf(undobuttonstate);
        (new StringBuilder(String.valueOf(s1).length() + 20)).append("setUndoButtonState: ").append(s1);
        if (j == null)
        {
            return;
        } else
        {
            j.setState(undobuttonstate);
            return;
        }
    }

    static HandwritingOverlayView b(UIHandler uihandler)
    {
        return uihandler.c;
    }

    private void b(String s1)
    {
        int i1 = 0;
        if (z != null)
        {
            if (s1.isEmpty())
            {
                z.setVisibility(8);
                return;
            }
            if (z.getVisibility() == 0)
            {
                z.setText(s1);
                return;
            }
            z.setText("");
            z.setContentDescription(s1);
            z.setVisibility(0);
            int j1 = s1.length();
            int k1 = 200 / j1;
            while (i1 < j1 + 1) 
            {
                postDelayed(new ad(this, s1, i1), i1 * k1);
                i1++;
            }
        }
    }

    private void c(String s1)
    {
        d d1 = null;
        for (int i1 = 0; i1 < h.a.size();)
        {
            d d2 = d1;
            if (d1 != h.a(i1))
            {
                d2 = h.a(i1);
                e.a(d2.c, s1, d2.b, "");
            }
            i1++;
            d1 = d2;
        }

    }

    static boolean c(UIHandler uihandler)
    {
        return uihandler.m;
    }

    static void d(UIHandler uihandler)
    {
        uihandler.m = false;
    }

    private boolean d(float f1, float f2, long l1, float f3, int i1)
    {
        if (i1 == 0 && f == 0)
        {
            return false;
        }
        if (f == 0)
        {
            f = i1;
            g = e.h;
            String s1 = String.valueOf(g);
            (new StringBuilder(String.valueOf(s1).length() + 27)).append("currentStylusButtonStroke: ").append(s1);
            e.h = new Stroke();
        }
        g.a(f1, f2, l1, f3);
        return true;
    }

    static UndoButtonInterface e(UIHandler uihandler)
    {
        return uihandler.j;
    }

    private boolean e(float f1, float f2, long l1, float f3, int i1)
    {
        if (!d(f1, f2, l1, f3, i1))
        {
            return false;
        }
        StrokeList strokelist = e.e;
        for (i1 = strokelist.size() - 1; i1 >= 0; i1--)
        {
            if (Stroke.a((Stroke)strokelist.get(i1), g) != -1)
            {
                strokelist.remove(i1);
            }
        }

        c.a();
        c.a(e.e, false);
        if (!strokelist.isEmpty())
        {
            i j1 = e;
            i1 = j1.j + 1;
            j1.j = i1;
            j1.a(i1, j1.e, true);
        } else
        {
            j();
            c();
            d();
            b();
            e();
        }
        f = 0;
        g = null;
        return true;
    }

    static i f(UIHandler uihandler)
    {
        return uihandler.e;
    }

    static String g(UIHandler uihandler)
    {
        return uihandler.A;
    }

    static com.google.android.libraries.handwriting.gui.c h(UIHandler uihandler)
    {
        return uihandler.h;
    }

    static Object i(UIHandler uihandler)
    {
        return uihandler.a;
    }

    static al j(UIHandler uihandler)
    {
        return uihandler.b;
    }

    private void j()
    {
        obtainMessage(6).sendToTarget();
    }

    final String a()
    {
        return h.b();
    }

    public void a(float f1, float f2, long l1, float f3, int i1)
    {
        a("");
        c();
        r.clear();
        if (d(f1, f2, l1, f3, i1))
        {
            return;
        } else
        {
            i j1 = e;
            j1.c.removeMessages(1);
            j1.j = j1.j + 1;
            j1.h.a(f1, f2, l1, f3);
            return;
        }
    }

    public final void a(int i1)
    {
        obj = i.getCurrentResult();
        String s1 = String.valueOf(obj);
        boolean flag = i.a();
        boolean flag2 = e.e.isEmpty();
        int j1 = ((RecognitionResult) (obj)).a;
        int l1 = e.j;
        boolean flag5 = e.e();
        (new StringBuilder(String.valueOf(s1).length() + 177)).append("currentResult:").append(s1).append(" clickable:").append(flag).append(" strokes.empty() ").append(flag2).append(" currentResult.getRequestId()").append(j1).append(" mRecognizer.getCurrentRequestId():").append(l1).append(" mRecognizer.hasPendingRequests():").append(flag5);
        if (e.e.isEmpty() || obj != RecognitionResult.i && (((RecognitionResult) (obj)).a >= e.j || !e.e())) goto _L2; else goto _L1
_L1:
        if (!n)
        {
            o = "";
        }
        e.a();
        (new StringBuilder(41)).append("startContinuousWritingRequest ").append(i1);
        obj = new StrokeList(e.e, true);
        if (p.a() == 0 && !h.b().contains("\u2026"))
        {
            a("\u2026", com.google.android.libraries.handwriting.gui.ai.a, o, false);
        }
        Object obj2 = e;
        Object obj3 = p;
        obj = new n(((i) (obj2)).j, ((i) (obj2)).a, ((StrokeList) (obj)), ((o) (obj3)), ((i) (obj2)).b);
        obj2 = p;
        obj3 = String.valueOf(obj);
        (new StringBuilder(String.valueOf(obj3).length() + 5)).append("add: ").append(((String) (obj3)));
        synchronized (((ai) (obj2)).b)
        {
            ((ai) (obj2)).b.add(new aj(((ai) (obj2)), ((n) (obj)), i1));
        }
        e.n.submit(((Runnable) (obj)));
        e.b();
        c.a();
_L6:
        n = false;
_L4:
        return;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        if (p.a() > 0) goto _L4; else goto _L3
_L3:
        boolean flag1;
        boolean flag3;
        boolean flag6;
        if (obj == RecognitionResult.i)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag3 = q;
        flag6 = G;
        (new StringBuilder(72)).append("noncont.  mJustAfterSuggestionSelected: ").append(flag3).append(" hidden: ").append(flag6).append(" EMPTY: ").append(flag1);
        if (!flag1 && ((RecognitionResult) (obj)).a() > 0)
        {
            String s2 = ((RecognitionResult) (obj)).a(0).a;
            boolean flag4 = G;
            flag1 = flag4;
            if (h.a.size() > 0)
            {
                int k1 = h.a().b.a;
                Object obj1;
                int i2;
                if (flag4 && k1 == ((RecognitionResult) (obj)).a)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                i2 = ((RecognitionResult) (obj)).a;
                (new StringBuilder(46)).append("lastReqIdBk: ").append(k1).append(" crtReqId: ").append(i2);
            }
            if (!flag1)
            {
                a(((CharSequence) (s2)), ((RecognitionResult) (obj)), o, true);
            }
            (new StringBuilder(37)).append("noncont - result was submitted: ").append(flag1);
        }
        obj1 = b.getCurrentInputConnection();
        if (obj1 != null)
        {
            ((InputConnection) (obj1)).finishComposingText();
        }
        obj1 = h.b();
        c("confirmed");
        if (i1 != 32 || com.google.android.libraries.handwriting.gui.t.f(((String) (obj1))))
        {
            b.a((char)i1);
        }
        d();
        b();
        h.a.clear();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(int i1, int j1)
    {
        (new StringBuilder(38)).append("onSizeChanged: ").append(i1).append(" ").append(j1);
        i k1 = e;
        (new StringBuilder(40)).append("setWritingGuide: ").append(i1).append(" ").append(j1);
        k1.f = i1;
        k1.g = j1;
        k1.e.setWritingGuide(k1.f, k1.g);
        GestureRecognizer gesturerecognizer = k1.l;
        i1 = k1.f;
        j1 = k1.g;
        gesturerecognizer.g = i1;
        gesturerecognizer.h = j1;
        gesturerecognizer = k1.l;
        float f1 = k1.f;
        float f2 = k1.o.f;
        float f3 = k1.g;
        float f4 = k1.o.g;
        float f5 = k1.f;
        gesturerecognizer.e.a[0] = 0.0F;
        gesturerecognizer.e.a[1] = f1 * (1.0F - f2);
        gesturerecognizer.e.a[2] = f3 * f4;
        gesturerecognizer.e.a[3] = f5;
        gesturerecognizer = k1.l;
        f1 = k1.g;
        f2 = k1.o.d;
        f3 = k1.f;
        f4 = k1.o.e;
        f5 = k1.g;
        float f6 = k1.f;
        gesturerecognizer.f.a[0] = f1 * (1.0F - f2);
        gesturerecognizer.f.a[1] = f3 * (1.0F - f4);
        gesturerecognizer.f.a[2] = f5;
        gesturerecognizer.f.a[3] = f6;
    }

    public final void a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        boolean flag3 = true;
        String.format("old selection: [%d, %d] new selection: [%d, %d], composing: [%d, %d]", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1), Integer.valueOf(l1), Integer.valueOf(i2), Integer.valueOf(j2)
        });
        ak ak1 = F;
        ak1.a = k1;
        ak1.b = l1;
        ak1.c = i2;
        ak1.d = j2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (i2 != -1 || j2 != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k1 != l1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && l1 != j2)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag || l1 == j1)
        {
            flag3 = false;
        }
        (new StringBuilder(120)).append("hasComposingArea: ").append(flag).append("  userSelectedText: ").append(flag1).append(" cursorMovedFromEndOfComposing: ").append(flag2).append(" cursorMovedInSmartTextField: ").append(flag3);
        if (flag1 || flag2 || flag3)
        {
            InputConnection inputconnection = b.getCurrentInputConnection();
            if (inputconnection != null)
            {
                inputconnection.finishComposingText();
            }
            d();
            b();
            h.a.clear();
        }
    }

    public final void a(int i1, CharSequence charsequence, RecognitionResult recognitionresult)
    {
        InputConnection inputconnection;
        String s1 = String.valueOf(charsequence);
        String s3 = String.valueOf(recognitionresult);
        (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(s3).length())).append("index: ").append(i1).append(" selected: ").append(s1).append(" result: ").append(s3);
        c();
        inputconnection = b.getCurrentInputConnection();
        if (inputconnection == null) goto _L2; else goto _L1
_L1:
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (i.getCurrentResult() != RecognitionResult.i) goto _L4; else goto _L3
_L3:
        inputconnection.finishComposingText();
        inputconnection.setComposingText(charsequence, 1);
_L5:
        inputconnection.finishComposingText();
_L2:
        b();
        d();
        h.a.clear();
        return;
_L4:
        String s4;
        Object obj1;
        s4 = a();
        obj1 = i.getCurrentResult();
        String s2 = s4;
        if (s4.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        s2 = s4;
        if (obj1 == RecognitionResult.i)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        s2 = s4;
        if (((RecognitionResult) (obj1)).a() <= 0)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        obj1 = ((RecognitionResult) (obj1)).a(0).a;
        s2 = s4;
        if (s4.endsWith(((String) (obj1))))
        {
            s2 = s4.substring(0, s4.length() - ((String) (obj1)).length());
        }
        s2 = String.valueOf(s2);
        String s5 = String.valueOf(charsequence);
        inputconnection.setComposingText((new StringBuilder(String.valueOf(s2).length() + 0 + String.valueOf(s5).length())).append(s2).append(s5).toString(), 1);
        e.a(charsequence.toString(), "selected", recognitionresult, (new StringBuilder(16)).append("cand=").append(i1).toString());
          goto _L5
        charsequence;
        obj;
        JVM INSTR monitorexit ;
        throw charsequence;
    }

    public final void a(RecognitionResult recognitionresult, String s1)
    {
        int i1 = 0;
        e.a(recognitionresult.a(0).a, "onkey", recognitionresult, "cont");
        String s2 = String.valueOf(recognitionresult);
        (new StringBuilder(String.valueOf(s2).length() + 22)).append("Set results From CWM: ").append(s2);
        while (i1 < recognitionresult.a()) 
        {
            ScoredCandidate scoredcandidate = recognitionresult.a(i1);
            Object obj = String.valueOf(scoredcandidate.a);
            String s3 = String.valueOf(s1);
            if (s3.length() != 0)
            {
                obj = ((String) (obj)).concat(s3);
            } else
            {
                obj = new String(((String) (obj)));
            }
            obj = new ScoredCandidate(((String) (obj)), scoredcandidate.b, scoredcandidate.c);
            if (i1 >= 0 && i1 < recognitionresult.e.size())
            {
                recognitionresult.e.set(i1, obj);
            }
            i1++;
        }
        obtainMessage(3, new ah(this, recognitionresult, true)).sendToTarget();
    }

    public void a(RecognitionResult recognitionresult, boolean flag)
    {
        String s1 = String.valueOf(recognitionresult);
        (new StringBuilder(String.valueOf(s1).length() + 13)).append("Set results: ").append(s1);
        obtainMessage(1, new ah(this, recognitionresult, flag)).sendToTarget();
    }

    public final void a(CharSequence charsequence, RecognitionResult recognitionresult, String s1, boolean flag)
    {
        String s2;
        String s3;
        InputConnection inputconnection;
        s2 = String.valueOf(charsequence);
        (new StringBuilder(String.valueOf(s2).length() + 23 + String.valueOf(s1).length())).append("text: '").append(s2).append("' mLastAdded: '").append(s1).append("'");
        s3 = h.b();
        s2 = String.valueOf(s3);
        if (s2.length() != 0)
        {
            "currentComposingText: ".concat(s2);
        } else
        {
            new String("currentComposingText: ");
        }
        s2 = s3;
        if (s3.endsWith(s1))
        {
            s2 = s3.substring(0, s3.length() - s1.length());
        }
        s1 = String.valueOf(s2);
        if (s1.length() != 0)
        {
            "currentComposingText: ".concat(s1);
        } else
        {
            new String("currentComposingText: ");
        }
        s1 = String.valueOf(charsequence);
        s3 = (new StringBuilder(String.valueOf(s2).length() + 0 + String.valueOf(s1).length())).append(s2).append(s1).toString();
        (new StringBuilder(String.valueOf(s3).length() + 20)).append("newComposingText: '").append(s3).append("'");
        s1 = ((String) (a));
        s1;
        JVM INSTR monitorenter ;
        inputconnection = b.getCurrentInputConnection();
        if (inputconnection != null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        s1;
        JVM INSTR monitorexit ;
        return;
        inputconnection.setComposingText(s3, 1);
        h.a(s2.length(), h.a.size(), charsequence.toString(), recognitionresult);
        s1;
        JVM INSTR monitorexit ;
        if (flag)
        {
            o = charsequence.toString();
        }
        charsequence = String.valueOf(h.b());
        if (charsequence.length() != 0)
        {
            "done: ".concat(charsequence);
            return;
        } else
        {
            new String("done: ");
            return;
        }
        charsequence;
        s1;
        JVM INSTR monitorexit ;
        throw charsequence;
    }

    public final void a(String s1)
    {
        removeMessages(5);
        if (s1 == null || s1.isEmpty())
        {
            obtainMessage(5, "").sendToTarget();
            return;
        }
        if (!s1.equals(A))
        {
            obtainMessage(5, s1).sendToTarget();
            A = s1;
            B = 0;
            return;
        }
        B = B + 1;
        if (B <= 3)
        {
            obtainMessage(5, s1).sendToTarget();
            return;
        } else
        {
            sendMessageDelayed(obtainMessage(5, s1), 10000L);
            return;
        }
    }

    public final void a(boolean flag)
    {
        (new StringBuilder(37)).append("setLastConfirmationWasNonSpace: ").append(flag);
        s = flag;
        e.q = flag;
    }

    public final void b()
    {
        a(RecognitionResult.i, false);
        q = false;
    }

    public final void b(float f1, float f2, long l1, float f3, int i1)
    {
        c();
        if (d(f1, f2, l1, f3, i1))
        {
            return;
        } else
        {
            e.h.a(f1, f2, l1, f3);
            return;
        }
    }

    public final void b(boolean flag)
    {
        (new StringBuilder(20)).append("hideResultInk: ").append(flag);
        G = flag;
        if (G)
        {
            n = false;
        }
    }

    public final void c()
    {
        q = false;
        removeMessages(2);
    }

    public final void c(float f1, float f2, long l1, float f3, int i1)
    {
        Object obj;
        i j1;
        StrokeList strokelist;
        Object obj2;
        a(UndoButtonInterface.UndoButtonState.UNDO);
        if (e(f1, f2, l1, f3, i1))
        {
            return;
        }
        j1 = e;
        j1.h.a(f1, f2, l1, f3);
        j1.e.add(j1.h);
        j1.j = j1.j + 1;
        j1.h = new Stroke();
        j1.e.setLastStrokeId(j1.j);
        j1.l.a = j1.o.a;
        j1.l.b = j1.o.b;
        obj = j1.c();
        GestureRecognizer gesturerecognizer = j1.l;
        int ai1[];
        boolean flag;
        if (j1.o.c && !com.google.android.libraries.handwriting.gui.t.b(((String) (obj))) && !com.google.android.libraries.handwriting.gui.t.c(((String) (obj))) && !com.google.android.libraries.handwriting.gui.t.d(((String) (obj))) && !com.google.android.libraries.handwriting.gui.t.e(((String) (obj))) && !j1.p)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gesturerecognizer.c = flag;
        j1.l.d = j1.o.i;
        ai1 = com.google.android.libraries.handwriting.gui.j.a;
        obj2 = j1.l;
        strokelist = j1.e;
        if (!strokelist.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = GestureRecognizer.Gesture.NOT_A_GESTURE;
_L3:
        double d1;
        Object obj1;
        Stroke stroke1;
        Object obj3;
        long l2;
        switch (ai1[((GestureRecognizer.Gesture) (obj)).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            j1.a(true);
            return;

        case 2: // '\002'
            j1.d();
            return;

        case 3: // '\003'
            j1.i.a();
            return;

        case 4: // '\004'
            j1.i.b();
            return;

        case 5: // '\005'
            Stroke stroke = new Stroke((Stroke)j1.e.get(j1.e.size() - 1));
            j1.e.remove(j1.e.size() - 1);
            j1.i.c();
            j1.e.add(stroke);
            j1.a(true);
            return;

        case 6: // '\006'
            j1.i.e();
            break;
        }
        break MISSING_BLOCK_LABEL_1898;
_L2:
        stroke1 = (Stroke)strokelist.get(strokelist.size() - 1);
        strokelist.remove(strokelist.size() - 1);
        if (!((GestureRecognizer) (obj2)).d)
        {
            break MISSING_BLOCK_LABEL_681;
        }
        if (stroke1.a().a > stroke1.b().a)
        {
            i1 = 0;
        } else
        if (stroke1.b().c - stroke1.a().c > 250L)
        {
            l1 = stroke1.b().c;
            l2 = stroke1.a().c;
            (new StringBuilder(54)).append("// Stroke took longer than 250ms: ").append(l1 - l2);
            i1 = 0;
        } else
        {
            obj = new a(stroke1);
            if ((double)((a) (obj)).a[1] > 0.050000000000000003D * (double)((GestureRecognizer) (obj2)).g)
            {
                f1 = ((a) (obj)).a[1];
                d1 = ((GestureRecognizer) (obj2)).g;
                (new StringBuilder(84)).append("// Stroke doesn't start in the leftmost 5%: ").append(f1).append(" ").append(0.050000000000000003D * d1);
                i1 = 0;
            } else
            {
label0:
                {
                    if (((a) (obj)).a() <= 3F * ((a) (obj)).b())
                    {
                        break label0;
                    }
                    f1 = ((a) (obj)).a();
                    f2 = ((a) (obj)).b();
                    (new StringBuilder(77)).append("// Stroke is not at least 3x as wide as high: ").append(f1).append(" ").append(f2 * 3F);
                    i1 = 0;
                }
            }
        }
_L4:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_681;
        }
        obj = GestureRecognizer.Gesture.GEST_FLING_FROM_LEFT;
          goto _L3
        obj = stroke1.a();
        obj3 = stroke1.iterator();
_L5:
label1:
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break MISSING_BLOCK_LABEL_675;
            }
            obj1 = (com.google.android.libraries.handwriting.base.Stroke.Point)((Iterator) (obj3)).next();
            if (((com.google.android.libraries.handwriting.base.Stroke.Point) (obj1)).a >= ((com.google.android.libraries.handwriting.base.Stroke.Point) (obj)).a)
            {
                break label1;
            }
            i1 = 0;
        }
          goto _L4
        obj = obj1;
          goto _L5
        i1 = 1;
          goto _L4
label2:
        {
            if (strokelist.isEmpty())
            {
                break label2;
            }
            obj = strokelist.getLast();
            if (((Stroke) (obj)).a.isEmpty())
            {
                break label2;
            }
            f1 = ((Stroke) (obj)).b().c;
            if ((float)stroke1.a().c - f1 < 250F)
            {
                break label2;
            }
            obj = new a(stroke1);
            if (((a) (obj)).a[0] >= 0.9F * (float)((GestureRecognizer) (obj2)).h)
            {
                i1 = 1;
            } else
            {
                if (((a) (obj)).a[2] > 0.1F * (float)((GestureRecognizer) (obj2)).h)
                {
                    break label2;
                }
                i1 = 1;
            }
        }
_L6:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_824;
        }
        strokelist.add(stroke1);
        obj = GestureRecognizer.Gesture.GEST_IGNORE;
          goto _L3
        i1 = 0;
          goto _L6
        if (!((GestureRecognizer) (obj2)).a)
        {
            break MISSING_BLOCK_LABEL_983;
        }
        if (!strokelist.isEmpty())
        {
            i1 = 0;
        } else
        if (!com.google.android.libraries.handwriting.gui.GestureRecognizer.a(stroke1, true))
        {
            i1 = 0;
        } else
        {
            obj = new a(stroke1);
            f1 = ((a) (obj)).b();
            if (((a) (obj)).a() > 0.3F * f1 || f1 < 50F)
            {
                i1 = 0;
            } else
            {
label3:
                {
                    if (strokelist.isEmpty())
                    {
                        break label3;
                    }
                    obj1 = new a(strokelist);
                    if (((a) (obj)).a[3] >= ((a) (obj1)).a[3] && ((a) (obj)).a[1] <= ((a) (obj1)).a[1])
                    {
                        break label3;
                    }
                    i1 = 0;
                }
            }
        }
_L7:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_983;
        }
        obj = GestureRecognizer.Gesture.GEST_BACKSPACE;
          goto _L3
        i1 = 1;
          goto _L7
label4:
        {
            if (!((GestureRecognizer) (obj2)).b)
            {
                break label4;
            }
            if (!com.google.android.libraries.handwriting.gui.GestureRecognizer.a(stroke1, false))
            {
                i1 = 0;
            } else
            {
                obj = new a(stroke1);
                f1 = ((a) (obj)).b();
                if (((a) (obj)).a() > 0.3F * f1 || f1 < 200F)
                {
                    i1 = 0;
                } else
                {
                    i1 = 1;
                }
            }
            if (i1 == 0)
            {
                break label4;
            }
            obj = GestureRecognizer.Gesture.GEST_SPACE;
        }
          goto _L3
        if (!((GestureRecognizer) (obj2)).c)
        {
            break MISSING_BLOCK_LABEL_1766;
        }
        if (strokelist.isEmpty()) goto _L9; else goto _L8
_L8:
        f1 = strokelist.getLast().b().c;
        f1 = (float)stroke1.a().c - f1;
        if (f1 >= 250F) goto _L11; else goto _L10
_L10:
        (new StringBuilder(32)).append("delta too short: ").append(f1);
_L9:
        i1 = 0;
_L14:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_1766;
        }
        strokelist.add(stroke1);
        obj = GestureRecognizer.Gesture.GEST_NEW_WORD;
          goto _L3
_L11:
        if (stroke1.a.size() <= 2) goto _L9; else goto _L12
_L12:
        obj3 = new a(stroke1);
        obj2 = new a(strokelist);
        if (((a) (obj3)).a[1] >= ((a) (obj2)).a[3]) goto _L9; else goto _L13
_L13:
        if (((a) (obj3)).a[3] > ((a) (obj2)).a[1] || (double)((a) (obj3)).b() <= 0.40000000000000002D * (double)((a) (obj3)).a())
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 1;
          goto _L14
        if (((a) (obj3)).a[3] > ((a) (obj2)).a[3] && ((a) (obj3)).a[1] > ((a) (obj2)).a[1] || strokelist.size() == 1 && (double)((a) (obj2)).b() < 0.40000000000000002D * (double)((a) (obj2)).a()) goto _L9; else goto _L15
_L15:
        if ((double)((a) (obj3)).a() <= 0.59999999999999998D * (double)((a) (obj2)).a() || (double)((a) (obj3)).b() <= 0.5D * (double)((a) (obj3)).a())
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 1;
          goto _L14
        if (!((a) (obj3)).a(((a) (obj2)))) goto _L9; else goto _L16
_L16:
label5:
        {
            if (!com.google.android.libraries.handwriting.gui.GestureRecognizer.a(stroke1))
            {
                break label5;
            }
            i1 = 1;
        }
          goto _L14
        if (!((a) (obj3)).a(((a) (obj2))))
        {
            obj = new a(new float[] {
                0.0F, 0.0F, 0.0F, 0.0F
            });
        } else
        {
            obj1 = new a(((a) (obj3)).a);
            if (((a) (obj2)).a[0] > ((a) (obj1)).a[0])
            {
                f1 = ((a) (obj2)).a[0];
                ((a) (obj1)).a[0] = f1;
            }
            if (((a) (obj2)).a[2] < ((a) (obj1)).a[2])
            {
                f1 = ((a) (obj2)).a[2];
                ((a) (obj1)).a[2] = f1;
            }
            if (((a) (obj2)).a[1] > ((a) (obj1)).a[1])
            {
                f1 = ((a) (obj2)).a[1];
                ((a) (obj1)).a[1] = f1;
            }
            obj = obj1;
            if (((a) (obj2)).a[3] < ((a) (obj1)).a[3])
            {
                f1 = ((a) (obj2)).a[3];
                ((a) (obj1)).a[3] = f1;
                obj = obj1;
            }
        }
        obj1 = new a(((a) (obj3)).a);
        if (((a) (obj2)).a[0] < ((a) (obj1)).a[0])
        {
            f1 = ((a) (obj2)).a[0];
            ((a) (obj1)).a[0] = f1;
        }
        if (((a) (obj2)).a[2] > ((a) (obj1)).a[2])
        {
            f1 = ((a) (obj2)).a[2];
            ((a) (obj1)).a[2] = f1;
        }
        if (((a) (obj2)).a[1] < ((a) (obj1)).a[1])
        {
            f1 = ((a) (obj2)).a[1];
            ((a) (obj1)).a[1] = f1;
        }
        if (((a) (obj2)).a[3] > ((a) (obj1)).a[3])
        {
            f1 = ((a) (obj2)).a[3];
            ((a) (obj1)).a[3] = f1;
        }
        if ((double)((a) (obj)).c() <= 0.29999999999999999D * (double)((a) (obj1)).c()) goto _L9; else goto _L17
_L17:
        i1 = 1;
          goto _L14
        strokelist.add(stroke1);
        obj = GestureRecognizer.Gesture.NOT_A_GESTURE;
          goto _L3
    }

    final void c(boolean flag)
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        m = false;
        (new StringBuilder(37)).append("lastThingFromBookkeeperdisplay: ").append(flag);
        obj = e.c();
        if (com.google.android.libraries.handwriting.gui.t.b(((String) (obj))))
        {
            obj = Location.RIGHT;
        } else
        if (com.google.android.libraries.handwriting.gui.t.g(((String) (obj))))
        {
            obj = Location.GONE;
        } else
        {
            obj = Location.LEFT;
        }
        c.a();
        obj2 = h.a();
        if (obj2 == null)
        {
            return;
        }
        obj3 = String.valueOf(((d) (obj2)).b);
        (new StringBuilder(String.valueOf(obj3).length() + 31)).append("lastthingFromBookkeperdisplay: ").append(((String) (obj3)));
        obj2 = ((d) (obj2)).b.j;
        obj4 = new a(((StrokeList) (obj2)));
        a(UndoButtonInterface.UndoButtonState.BACK);
        obj3 = new Paint(c.getStrokePreviouslyRecognizedPaint());
        com.google.android.libraries.handwriting.gui.ag.a[((Location) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 212
    //                   1 316
    //                   2 333
    //                   3 359;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_359;
_L1:
        float f1;
        float f2;
        ((Paint) (obj3)).setAlpha(0);
        f2 = 0.0F;
        f1 = 0.0F;
_L5:
        if (flag)
        {
            Object obj1;
            ArgbEvaluator argbevaluator;
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                obj1 = new PathInterpolator(0.4F, 0.0F, 0.2F, 1.0F);
            } else
            {
                obj1 = new AccelerateDecelerateInterpolator();
            }
            obj4 = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            argbevaluator = new ArgbEvaluator();
            ((ValueAnimator) (obj4)).setDuration(400L);
            ((ValueAnimator) (obj4)).addUpdateListener(new ae(this, ((ValueAnimator) (obj4)), ((android.view.animation.Interpolator) (obj1)), ((Paint) (obj3)), argbevaluator, ((StrokeList) (obj2)), f1, f2));
            ((ValueAnimator) (obj4)).start();
            return;
        } else
        {
            c.getAnimationLayer().a();
            c.getAnimationLayer().a(((StrokeList) (obj2)), f1, f2, ((Paint) (obj3)));
            return;
        }
_L2:
        f1 = -0.9F * ((a) (obj4)).a[3];
        f2 = 0.0F;
          goto _L5
_L3:
        f1 = 0.9F * ((float)e.f - ((a) (obj4)).a[1]);
        f2 = 0.0F;
          goto _L5
        f2 = 0.9F * ((a) (obj4)).a[2];
        f1 = 0.0F;
          goto _L5
    }

    public final void d()
    {
        m = true;
        if (c != null)
        {
            c.a();
        }
        e.b();
        a(UndoButtonInterface.UndoButtonState.NONE);
        o = "";
        b(false);
        i i1 = e;
        String s1 = f();
        if (i1.e != null && s1 != null)
        {
            i1.e.setPreContext(s1);
        }
        i1 = e;
        s1 = g();
        if (i1.e != null && s1 != null)
        {
            i1.e.setPostContext(s1);
        }
        a(A);
    }

    public final void e()
    {
        h.a.clear();
    }

    public final String f()
    {
        Object obj = b.getCurrentInputConnection();
        if (obj == null)
        {
            return "";
        }
        obj = ((InputConnection) (obj)).getTextBeforeCursor(20, 0);
        if (obj == null)
        {
            return "";
        }
        obj = ((CharSequence) (obj)).toString();
        String s1 = String.valueOf(obj);
        if (s1.length() != 0)
        {
            "preContext = ".concat(s1);
            return ((String) (obj));
        } else
        {
            new String("preContext = ");
            return ((String) (obj));
        }
    }

    public final String g()
    {
        Object obj = b.getCurrentInputConnection();
        if (obj == null)
        {
            return "";
        }
        obj = ((InputConnection) (obj)).getTextAfterCursor(20, 0);
        if (obj == null)
        {
            return "";
        } else
        {
            return ((CharSequence) (obj)).toString();
        }
    }

    public final void h()
    {
        if (!e.e.isEmpty())
        {
            c();
            e.a();
            e.b();
            c.a();
            return;
        }
        if (i.getCurrentResult() != RecognitionResult.i)
        {
            j();
        }
        b.c();
        h.a.clear();
        d();
        c.a();
    }

    public void handleMessage(Message message)
    {
        String s1 = String.valueOf(message);
        (new StringBuilder(String.valueOf(s1).length() + 18)).append("Handling message: ").append(s1);
        message.what;
        JVM INSTR tableswitch 1 6: default 76
    //                   1 82
    //                   2 537
    //                   3 82
    //                   4 82
    //                   5 724
    //                   6 736;
           goto _L1 _L2 _L3 _L2 _L2 _L4 _L5
_L1:
        super.handleMessage(message);
_L14:
        return;
_L2:
        Object obj = (ah)message.obj;
        RecognitionResult recognitionresult = ((ah) (obj)).a;
        this;
        JVM INSTR monitorenter ;
        String s3 = String.valueOf(obj);
        String s4 = String.valueOf(recognitionresult);
        (new StringBuilder(String.valueOf(s3).length() + 16 + String.valueOf(s4).length())).append("results=").append(s3).append("result: ").append(s4);
        if (i != null && i.getCurrentResult().g < recognitionresult.g || message.what == 3)
        {
            o = "";
        }
        boolean flag = ((ah) (obj)).b;
        if (i != null)
        {
            i.setResult(recognitionresult, flag);
            int i1 = recognitionresult.a();
            int k1 = d.getVisibility();
            int l1 = d.getWindowVisibility();
            (new StringBuilder(128)).append("suggestions.size() = ").append(i1).append(" mHandwritingView.getVisibility = ").append(k1).append(" mHandwritingView.getWindowVisibility = ").append(l1);
        }
        int j1;
        boolean flag1;
        boolean flag2;
        if (recognitionresult != RecognitionResult.i && recognitionresult.a() != 0)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (D == null) goto _L7; else goto _L6
_L6:
        obj = D;
        if (!flag1) goto _L9; else goto _L8
_L8:
        if (!E) goto _L9; else goto _L10
_L10:
        j1 = 0;
_L12:
        ((View) (obj)).setVisibility(j1);
_L7:
        if (F.a == F.b)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        (new StringBuilder(67)).append("handleMessage: selectionIsEmpty:").append(flag2).append(" resultWithoutCandidates:").append(flag1);
        this;
        JVM INSTR monitorexit ;
        if (message.what != 1)
        {
            if (message.what != 4)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (recognitionresult.a() > 0 && C)
            {
                a(recognitionresult.a(0).a, recognitionresult, o, true);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L9:
        j1 = 8;
        if (true) goto _L12; else goto _L11
_L11:
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
        if (message.what != 3) goto _L14; else goto _L13
_L13:
        if (recognitionresult.a() > 0)
        {
            a(recognitionresult.a(0).a, recognitionresult, o, true);
        }
        if (e.e.isEmpty() && e.h.a.isEmpty())
        {
            c(false);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        message = ((RecognitionResult)message.obj).a(0).a;
        String s2 = String.valueOf(message);
        (new StringBuilder(String.valueOf(s2).length() + 21)).append("Auto select received ").append(s2);
        if (!q)
        {
            e.a(message.toString(), "auto", i.getCurrentResult(), "");
            r.clear();
            r.append(message);
            a(r, i.getCurrentResult(), o, true);
            message = String.valueOf(r);
            (new StringBuilder(String.valueOf(message).length() + 25)).append("commitSuggestion: text='").append(message).append("'");
            d();
            b(true);
            c(true);
        }
        q = true;
        a(true);
        return;
_L4:
        b((String)message.obj);
        return;
_L5:
        message = b.getCurrentInputConnection();
        if (message != null)
        {
            message.finishComposingText();
            return;
        }
        if (true) goto _L14; else goto _L15
_L15:
    }

    public final void i()
    {
        c("finish");
        InputConnection inputconnection = b.getCurrentInputConnection();
        if (inputconnection != null)
        {
            inputconnection.finishComposingText();
        }
        c();
        d();
        b();
        h.a.clear();
    }

    public void onKey(int i1, int ai1[])
    {
        (new StringBuilder(17)).append("onKey ").append(i1);
        c();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        a(i1);
_L4:
        b();
        return;
_L2:
        if (i1 == l)
        {
            h();
        } else
        if (i1 != v && i1 != u)
        {
            (new StringBuilder(28)).append("unknown keycode: ").append(i1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPress(int i1)
    {
    }

    public void onRelease(int i1)
    {
    }

    public void onText(CharSequence charsequence)
    {
    }

    public void swipeDown()
    {
    }

    public void swipeLeft()
    {
    }

    public void swipeRight()
    {
    }

    public void swipeUp()
    {
    }

    private class Location extends Enum
    {

        public static final Location GONE;
        public static final Location LEFT;
        public static final Location RIGHT;
        public static final Location TOP;
        private static final Location a[];

        public static Location valueOf(String s1)
        {
            return (Location)Enum.valueOf(com/google/android/libraries/handwriting/gui/UIHandler$Location, s1);
        }

        public static Location[] values()
        {
            return (Location[])a.clone();
        }

        static 
        {
            GONE = new Location("GONE", 0);
            LEFT = new Location("LEFT", 1);
            RIGHT = new Location("RIGHT", 2);
            TOP = new Location("TOP", 3);
            a = (new Location[] {
                GONE, LEFT, RIGHT, TOP
            });
        }

        private Location(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
