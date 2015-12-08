// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.v;
import com.ford.syncV4.e.e;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.ford.syncV4.e.c:
//            y

public final class bi extends e
{

    public bi()
    {
        super("Show");
    }

    public final void a(v v)
    {
        if (v != null)
        {
            b.put("alignment", v);
            return;
        } else
        {
            b.remove("alignment");
            return;
        }
    }

    public final void a(y y)
    {
        if (y != null)
        {
            b.put("graphic", y);
            return;
        } else
        {
            b.remove("graphic");
            return;
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            b.put("mainField1", s);
            return;
        } else
        {
            b.remove("mainField1");
            return;
        }
    }

    public final void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("softButtons", vector);
            return;
        } else
        {
            b.remove("softButtons");
            return;
        }
    }

    public final void b(String s)
    {
        if (s != null)
        {
            b.put("mainField2", s);
            return;
        } else
        {
            b.remove("mainField2");
            return;
        }
    }

    public final void c(String s)
    {
        if (s != null)
        {
            b.put("mainField3", s);
            return;
        } else
        {
            b.remove("mainField3");
            return;
        }
    }

    public final void d(String s)
    {
        if (s != null)
        {
            b.put("mainField4", s);
            return;
        } else
        {
            b.remove("mainField4");
            return;
        }
    }

    public final void e(String s)
    {
        if (s != null)
        {
            b.put("statusBar", s);
            return;
        } else
        {
            b.remove("statusBar");
            return;
        }
    }
}
