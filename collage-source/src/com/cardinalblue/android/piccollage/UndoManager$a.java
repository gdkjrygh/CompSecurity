// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            UndoManager

static final class c
{

    private final UndoManager a;
    private final int b;
    private final ArrayList c;
    private ArrayList d;
    private CharSequence e;
    private boolean f;
    private boolean g;

    void a()
    {
        g = true;
    }

    void a(Parcel parcel)
    {
        int j = 1;
        if (d != null)
        {
            throw new IllegalStateException("Can't save state before committing");
        }
        parcel.writeInt(b);
        int i;
        if (f)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (g)
        {
            i = j;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        TextUtils.writeToParcel(e, parcel, 0);
        j = c.size();
        parcel.writeInt(j);
        for (i = 0; i < j; i++)
        {
            parcel.writeParcelable((doOperation)c.get(i), 0);
        }

    }

    void a(doOperation dooperation)
    {
        if (c.contains(dooperation))
        {
            throw new IllegalStateException((new StringBuilder()).append("Already holds ").append(dooperation).toString());
        }
        c.add(dooperation);
        if (d == null)
        {
            d = new ArrayList();
            d.add(dooperation);
        }
    }

    void a(CharSequence charsequence)
    {
        if (e != null)
        {
            e = charsequence;
        }
    }

    boolean b()
    {
        return f && !g;
    }

    boolean c()
    {
        return c.size() != 0;
    }

    boolean d()
    {
        for (int i = c.size() - 1; i >= 0; i--)
        {
            if (((doOperation)c.get(i)).a())
            {
                return true;
            }
        }

        return false;
    }

    void e()
    {
        int j = 0;
        int i;
        if (d != null)
        {
            i = d.size();
        } else
        {
            i = 0;
        }
        for (; j < i; j++)
        {
            ((doOperation)d.get(j)).b();
        }

        d = null;
    }

    void f()
    {
        for (int i = c.size() - 1; i >= 0; i--)
        {
            ((doOperation)c.get(i)).c();
        }

    }

    void g()
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            ((doOperation)c.get(i)).d();
        }

    }

    void h()
    {
    }

    doOperation(UndoManager undomanager, int i)
    {
        c = new ArrayList();
        f = true;
        a = undomanager;
        b = i;
    }

    b(UndoManager undomanager, Parcel parcel, ClassLoader classloader)
    {
        boolean flag1 = true;
        int i = 0;
        super();
        c = new ArrayList();
        f = true;
        a = undomanager;
        b = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g = flag;
        e = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        for (int j = parcel.readInt(); i < j; i++)
        {
            undomanager = (doOperation)parcel.readParcelable(classloader);
            c.add(undomanager);
        }

    }
}
