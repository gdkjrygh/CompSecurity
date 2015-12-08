// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class oai extends nzw
{

    List a;
    public boolean b;
    private int c;
    private boolean d;

    public oai(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        b = true;
        c = 0;
        d = false;
        a = new ArrayList();
        context = context.obtainStyledAttributes(attributeset, oaw.G, l, 0);
        b = context.getBoolean(oaw.H, b);
        context.recycle();
    }

    private boolean d(nzw nzw1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        nzw1.j();
        flag = a.remove(nzw1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        nzw1;
        this;
        JVM INSTR monitorexit ;
        throw nzw1;
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        int i1 = c();
        for (int l = 0; l < i1; l++)
        {
            d(l).a(bundle);
        }

    }

    public boolean a(nzw nzw1)
    {
        nzw1.e(e());
        return true;
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        int i1 = c();
        for (int l = 0; l < i1; l++)
        {
            d(l).b(bundle);
        }

    }

    public final boolean b(nzw nzw1)
    {
        int i1;
        if (a.contains(nzw1))
        {
            return true;
        }
        if (nzw1.l == 0x7fffffff)
        {
            if (b)
            {
                int l = c;
                c = l + 1;
                nzw1.b(l);
            }
            if (nzw1 instanceof oai)
            {
                ((oai)nzw1).b = b;
            }
        }
        int j1 = Collections.binarySearch(a, nzw1);
        i1 = j1;
        if (j1 < 0)
        {
            i1 = -j1 - 1;
        }
        if (!a(nzw1))
        {
            return false;
        }
        this;
        JVM INSTR monitorenter ;
        a.add(i1, nzw1);
        this;
        JVM INSTR monitorexit ;
        nzw1.a(super.h);
        if (d)
        {
            nzw1.i();
        }
        h();
        return true;
        nzw1;
        this;
        JVM INSTR monitorexit ;
        throw nzw1;
    }

    public final int c()
    {
        return a.size();
    }

    public final nzw c(CharSequence charsequence)
    {
        if (TextUtils.equals(super.n, charsequence))
        {
            return this;
        }
        int i1 = c();
        for (int l = 0; l < i1; l++)
        {
            nzw nzw1 = d(l);
            String s = nzw1.n;
            if (s != null && s.equals(charsequence))
            {
                return nzw1;
            }
            if (!(nzw1 instanceof oai))
            {
                continue;
            }
            nzw1 = ((oai)nzw1).c(charsequence);
            if (nzw1 != null)
            {
                return nzw1;
            }
        }

        return null;
    }

    public final boolean c(nzw nzw1)
    {
        boolean flag = d(nzw1);
        h();
        return flag;
    }

    public final nzw d(int l)
    {
        return (nzw)a.get(l);
    }

    public final void d(boolean flag)
    {
        super.d(flag);
        int i1 = c();
        for (int l = 0; l < i1; l++)
        {
            d(l).e(flag);
        }

    }

    public final void i()
    {
        super.i();
        d = true;
        int i1 = c();
        for (int l = 0; l < i1; l++)
        {
            d(l).i();
        }

    }

    protected final void j()
    {
        super.j();
        d = false;
    }

    public boolean k()
    {
        return true;
    }
}
