// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            e, d

public final class c
{

    public final LinkedList a = new LinkedList();
    private String b;

    public c()
    {
        b = null;
    }

    private static LinkedList a(String s, d d1)
    {
        LinkedList linkedlist = new LinkedList();
        s = new StringCharacterIterator(s);
        for (char c1 = s.first(); c1 != '\uFFFF'; c1 = s.next())
        {
            linkedlist.add(new e(c1, d1));
        }

        return linkedlist;
    }

    private void a(int i, int j)
    {
        String.format("startPosition=%s stopPosition=%s contents=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), b()
        });
        for (int k = i; k < j; k++)
        {
            if (i >= 0 && i < a.size())
            {
                a.remove(i);
            }
        }

    }

    private void c()
    {
        String s = b();
        (new StringBuilder(String.valueOf(s).length() + 29)).append("Full content of the field:\n'").append(s).append("'");
        String s1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); (new StringBuilder(String.valueOf(s1).length() + 21)).append("RecognizedCharacter: ").append(s1))
        {
            s1 = String.valueOf((e)iterator.next());
        }

    }

    public final d a()
    {
        if (a.isEmpty())
        {
            return null;
        } else
        {
            return ((e)a.getLast()).b;
        }
    }

    public final d a(int i)
    {
        (new StringBuilder(32)).append("getBookkeepingEntry: ").append(i);
        if (i >= 0 && a.size() > i)
        {
            return ((e)a.get(i)).b;
        } else
        {
            return d.a;
        }
    }

    public final void a(int i, int j, String s, RecognitionResult recognitionresult)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        k = i;
        if (i < 0)
        {
            k = 0;
        }
        (new StringBuilder(String.valueOf(s).length() + 56)).append("startPosition=").append(k).append(" stopPosition=").append(j).append(" text=").append(s);
        recognitionresult = new d(recognitionresult, s);
        s = a(s, ((d) (recognitionresult)));
        if (((d) (recognitionresult)).b != null && ((d) (recognitionresult)).b.b() != null)
        {
            b = ((d) (recognitionresult)).b.b();
        }
        a(k, j);
        if (k <= a.size())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        a.addAll(s);
_L1:
        if (com.google.android.libraries.handwriting.base.c.a > 0)
        {
            c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a.addAll(k, s);
          goto _L1
        s;
        throw s;
    }

    public final String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(((e)iterator.next()).a)) { }
        return stringbuilder.toString();
    }
}
