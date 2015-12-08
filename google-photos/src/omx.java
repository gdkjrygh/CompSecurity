// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class omx
    implements oou, opt, opu, opv
{

    public boolean a;
    private List b;
    private boolean c;
    private boolean d;

    omx(opd opd1)
    {
        b = new ArrayList();
        d = true;
        opd1.a(this);
    }

    omx(opd opd1, byte byte0)
    {
        b = new ArrayList();
        d = true;
        opd1.a(this);
    }

    private void a()
    {
        boolean flag;
        if (c && d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != a)
        {
            a = flag;
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                ((omz)iterator.next()).a(flag);
            }
        }
    }

    public final void V_()
    {
        c = false;
        a();
    }

    public final void X_()
    {
        c = true;
        a();
    }

    public final omz a(omz omz1)
    {
        b.add(omz1);
        return omz1;
    }

    public final void a(boolean flag)
    {
        d = flag;
        a();
    }
}
