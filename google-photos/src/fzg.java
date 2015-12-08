// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.photos.edittext.EditTextHolder;
import java.util.Iterator;
import java.util.List;

public final class fzg extends hgu
{

    private final String a;
    private final fgf b;
    private EditTextHolder c;

    fzg(String s, fgf fgf1)
    {
        p.a(s);
        p.a(fgf1);
        b = fgf1;
        a = s;
    }

    public final int a()
    {
        return q.aq;
    }

    public final void a(afn afn)
    {
        c = fzh.a((fzh)afn);
        afn = b;
        EditTextHolder edittextholder = c;
        String s = a;
        if (edittextholder != null && edittextholder == ((fgf) (afn)).c)
        {
            if (afn.a())
            {
                edittextholder.c();
            }
        } else
        {
            afn.c = edittextholder;
            if (edittextholder != null)
            {
                ((fgf) (afn)).c.setSaveEnabled(true);
                ((fgf) (afn)).c.b.setOnEditorActionListener(afn);
                EditTextHolder edittextholder1 = ((fgf) (afn)).c;
                fgg fgg1 = new fgg(afn);
                edittextholder1.a.setOnClickListener(fgg1);
                for (Iterator iterator = ((fgf) (afn)).a.iterator(); iterator.hasNext(); ((fgk)iterator.next()).a(((fgf) (afn)).c)) { }
                ((fgf) (afn)).a.clear();
                afn.a(s);
                if (((fgf) (afn)).b != null)
                {
                    android.util.SparseArray sparsearray = ((fgf) (afn)).b;
                    if (((fgf) (afn)).c != null)
                    {
                        ((fgf) (afn)).c.restoreHierarchyState(sparsearray);
                        return;
                    }
                }
            }
        }
    }
}
