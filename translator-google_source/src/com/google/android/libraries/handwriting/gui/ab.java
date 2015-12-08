// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.os.Message;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.base.StrokeList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            aa, UIHandler, ac, HandwritingOverlayView, 
//            ah, i, al, a, 
//            c, d

public class ab
    implements aa
{

    private TextView a;
    public UIHandler b;
    public HandwritingOverlayView c;
    public int d;
    public boolean e;
    public boolean f;
    public View g;
    private boolean h;

    public ab()
    {
    }

    public final void a()
    {
        b.h();
        b.b();
    }

    public void a(int k, String s)
    {
        (new StringBuilder(String.valueOf(s).length() + 28)).append("errorMessage: (").append(k).append(") ").append(s);
    }

    public final void a(RecognitionResult recognitionresult, int k, boolean flag)
    {
        String s = String.valueOf(recognitionresult);
        String s1 = String.valueOf(recognitionresult.j);
        (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append("onRecognitionEnd: ").append(s).append(" strokes = ").append(s1);
        boolean flag1;
        if (k == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a(recognitionresult, flag1);
        if (recognitionresult.a() > 0 && flag1 && flag)
        {
            UIHandler uihandler = b;
            k = d;
            String s2 = String.valueOf(recognitionresult.a(0).a);
            (new StringBuilder(String.valueOf(s2).length() + 44)).append("Triggering auto select of ").append(s2).append(" in ").append(k).append("ms.");
            uihandler.sendMessageDelayed(uihandler.obtainMessage(2, recognitionresult), k);
        } else
        {
            UIHandler uihandler1 = b;
            String s3 = String.valueOf(recognitionresult);
            (new StringBuilder(String.valueOf(s3).length() + 15)).append("updateResults: ").append(s3);
            uihandler1.obtainMessage(4, new ah(uihandler1, recognitionresult, true)).sendToTarget();
        }
        if (c != null && recognitionresult.j != StrokeList.EMPTY)
        {
            c.post(new ac(this, recognitionresult));
        }
    }

    public final void a(String s)
    {
        if (a != null)
        {
            a.setText(s);
        }
    }

    public final void b()
    {
        b.a(32);
        b.a(false);
    }

    public final void c()
    {
        b.a(-32);
        b.a(true);
    }

    public final void d()
    {
        UIHandler uihandler = b;
        uihandler.c.a();
        if (!uihandler.e.e.isEmpty())
        {
            uihandler.c.a(uihandler.e.e, false);
            return;
        }
        Object obj = String.valueOf("removed-last-stroke");
        String s;
        if (((String) (obj)).length() != 0)
        {
            "removeLastEntryFromBookKeeperAndComposing feedbackMode:".concat(((String) (obj)));
        } else
        {
            new String("removeLastEntryFromBookKeeperAndComposing feedbackMode:");
        }
        if (uihandler.b.getCurrentInputConnection() == null)
        {
            obj = "";
        } else
        {
            obj = uihandler.a();
        }
        s = ((String) (obj));
        if (uihandler.i.getCurrentResult().a() > 0)
        {
            String s1 = uihandler.i.getCurrentResult().a(0).a;
            (new StringBuilder(String.valueOf(obj).length() + 18 + String.valueOf(s1).length())).append("composing: ").append(((String) (obj))).append(" top1: ").append(s1);
            s = String.valueOf(uihandler.h.b());
            if (s.length() != 0)
            {
                "currentBookkeeper: ".concat(s);
            } else
            {
                new String("currentBookkeeper: ");
            }
            uihandler.h.a(((String) (obj)).length() - s1.length(), ((String) (obj)).length(), "", RecognitionResult.i);
            s = String.valueOf(uihandler.h.b());
            if (s.length() != 0)
            {
                "currentBookkeeper: ".concat(s);
            } else
            {
                new String("currentBookkeeper: ");
            }
            uihandler.e.a(s1, "removed-last-stroke", uihandler.i.getCurrentResult(), "");
            s = ((String) (obj));
            if (((String) (obj)).endsWith(s1))
            {
                s = ((String) (obj)).substring(0, ((String) (obj)).length() - s1.length());
            }
        }
        obj = String.valueOf(s);
        if (((String) (obj)).length() != 0)
        {
            "new composing: ".concat(((String) (obj)));
        } else
        {
            new String("new composing: ");
        }
        obj = uihandler.b.getCurrentInputConnection();
        if (obj != null)
        {
            ((InputConnection) (obj)).setComposingText(s, 1);
        }
        uihandler.d();
        if (s.length() > 0 && uihandler.h.a.size() > s.length() - 1)
        {
            obj = uihandler.h.a(s.length() - 1).b;
            if (obj != RecognitionResult.i && ((RecognitionResult) (obj)).a() > 0)
            {
                s = String.valueOf(((RecognitionResult) (obj)).a(0).a);
                if (s.length() != 0)
                {
                    "from BookKeeper: ".concat(s);
                } else
                {
                    new String("from BookKeeper: ");
                }
            }
            uihandler.i.setResult(((RecognitionResult) (obj)), true);
            uihandler.c(false);
        } else
        {
            uihandler.b();
        }
        uihandler.b(true);
    }

    public final boolean e()
    {
        UIHandler uihandler = b;
        d d1;
        if (uihandler.e.e.isEmpty())
        {
            if ((d1 = uihandler.h.a()) != null)
            {
                uihandler.a(d1.b, true);
                uihandler.b(false);
                uihandler.n = true;
                uihandler.c.a();
                if (uihandler.e.e.isEmpty())
                {
                    d d2 = uihandler.h.a();
                    int l = d2.b.j.size();
                    (new StringBuilder(20)).append("strokes: ").append(l);
                    i k = uihandler.e;
                    StrokeList strokelist = uihandler.h.a().b.j;
                    if (strokelist != null)
                    {
                        k.e = strokelist;
                    }
                    uihandler.o = d2.c;
                }
                uihandler.c.a(uihandler.e.e, false);
                uihandler.c();
                return true;
            }
        }
        return false;
    }

    public final boolean f()
    {
        return f;
    }

    public final void g()
    {
        h = true;
        e = false;
        if (g != null)
        {
            g.setVisibility(0);
        }
    }

    public final void h()
    {
        e = true;
        h = false;
        if (g != null)
        {
            g.setVisibility(8);
        }
    }

    public final String i()
    {
        if (b == null)
        {
            return "";
        } else
        {
            return b.f();
        }
    }

    public final String j()
    {
        if (b == null)
        {
            return "";
        } else
        {
            return b.g();
        }
    }
}
