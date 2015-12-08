// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.view.inputmethod.InputConnection;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.base.StrokeList;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            o, UIHandler, al, c, 
//            aj, t, n

final class ai
    implements o
{

    public static final RecognitionResult a = new RecognitionResult("");
    final ArrayList b = new ArrayList();
    private final UIHandler c;

    ai(UIHandler uihandler)
    {
        c = uihandler;
    }

    private void b()
    {
        Object obj = UIHandler.i(c);
        obj;
        JVM INSTR monitorenter ;
        InputConnection inputconnection = UIHandler.j(c).getCurrentInputConnection();
        if (inputconnection != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        String s;
        c c1;
        int i;
        int j;
        inputconnection.beginBatchEdit();
        s = c.h.b();
        c1 = UIHandler.h(c);
        i = s.indexOf("\u2026");
        j = c1.b().indexOf("\u2026");
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        (new StringBuilder(51)).append("posOfPlaceHolderBk: ").append(j).append(" != posOfPlaceHolder");
        (new StringBuilder(29)).append("posOfPlaceHolder: ").append(i);
        if (i == -1) goto _L2; else goto _L1
_L1:
        c1.a(i, i + 1, "", RecognitionResult.i);
        inputconnection.setComposingText(s.substring(0, i), 1);
_L4:
        inputconnection.endBatchEdit();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (j == -1 || i != -1) goto _L4; else goto _L3
_L3:
        c1.a(j, j + 1, "", RecognitionResult.i);
          goto _L4
    }

    public final int a()
    {
        int i;
        synchronized (b)
        {
            i = b.size();
        }
        return i;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(n n, com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException recognitionfailedexception)
    {
        recognitionfailedexception = b.iterator();
        do
        {
            if (!recognitionfailedexception.hasNext())
            {
                break;
            }
            aj aj1 = (aj)recognitionfailedexception.next();
            if (n != aj1.a)
            {
                continue;
            }
            b.remove(aj1);
            if (b.isEmpty())
            {
                b();
            }
            break;
        } while (true);
    }

    public final void a(n n, StrokeList strokelist, RecognitionResult recognitionresult)
    {
        ArrayList arraylist = b;
        arraylist;
        JVM INSTR monitorenter ;
        UIHandler.a(c, "");
        Object obj = String.valueOf(recognitionresult);
        String s = String.valueOf(n);
        int i = b.size();
        (new StringBuilder(String.valueOf(obj).length() + 43 + String.valueOf(s).length())).append("start ").append(((String) (obj))).append(" runnable: ").append(s).append(" queue.size(): ").append(i);
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            aj aj1 = (aj)((Iterator) (obj)).next();
            String s2 = String.valueOf(aj1.a);
            (new StringBuilder(String.valueOf(s2).length() + 18)).append("trying to insert: ").append(s2);
            if (n != aj1.a)
            {
                continue;
            }
            aj1.c = recognitionresult;
            aj1.c.j = strokelist;
            break;
        } while (true);
        recognitionresult = ((RecognitionResult) (UIHandler.i(c)));
        recognitionresult;
        JVM INSTR monitorenter ;
        InputConnection inputconnection = UIHandler.j(c).getCurrentInputConnection();
        if (inputconnection != null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        recognitionresult;
        JVM INSTR monitorexit ;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        inputconnection.beginBatchEdit();
        b();
        int j;
        int k;
        k = -1;
        j = 0;
_L10:
        if (j >= b.size()) goto _L2; else goto _L1
_L1:
        (new StringBuilder(34)).append("updating composingText ").append(j);
        n = (aj)b.get(j);
        if (((aj) (n)).c != a) goto _L4; else goto _L3
_L3:
        (new StringBuilder(29)).append("pending result at ").append(j);
_L2:
        (new StringBuilder(33)).append("LastOneThatHasResult: ").append(k);
        if (k == -1) goto _L6; else goto _L5
_L5:
        n = ((aj)b.get(k)).c;
        strokelist = String.valueOf((char)((aj)b.get(k)).b);
          goto _L7
_L11:
        if (j > k) goto _L9; else goto _L8
_L8:
        (new StringBuilder(32)).append("Removing from queue: ").append(j);
        if (b.size() > j)
        {
            b.remove(j);
        }
        break MISSING_BLOCK_LABEL_776;
_L4:
        if (((aj) (n)).c.a() != 0)
        {
            break MISSING_BLOCK_LABEL_481;
        }
        (new StringBuilder(25)).append("no results at ").append(j);
          goto _L2
        n;
        recognitionresult;
        JVM INSTR monitorexit ;
        throw n;
        n;
        arraylist;
        JVM INSTR monitorexit ;
        throw n;
        (new StringBuilder(26)).append("not pending at ").append(j);
        strokelist = ((aj) (n)).c.a(0).a;
        if (j + 1 < b.size())
        {
            c.a(strokelist, ((aj) (n)).c, "", false);
            if (((aj) (n)).b != 32 || t.f(strokelist))
            {
                c.a(String.valueOf((char)((aj) (n)).b), RecognitionResult.i, "", false);
            }
        }
        n = UIHandler.h(c).b();
        (new StringBuilder(String.valueOf(n).length() + 14)).append("BookKeeper: '").append(n).append("'");
        k = j;
        j++;
          goto _L10
_L9:
        if (!b.isEmpty())
        {
            inputconnection.finishComposingText();
            c.e();
            c.a("\u2026", a, "", false);
            UIHandler.a(c, "");
        }
        String s1 = c.a();
        (new StringBuilder(String.valueOf(s1).length() + 38)).append("Finished updates - composing text: '").append(s1).append("'.");
        inputconnection.endBatchEdit();
        recognitionresult;
        JVM INSTR monitorexit ;
        if (!b.isEmpty() || n == null)
        {
            break MISSING_BLOCK_LABEL_761;
        }
        c.a(n, strokelist);
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L6:
        n = null;
        strokelist = "";
_L7:
        j = 0;
          goto _L11
        j++;
          goto _L11
    }

}
