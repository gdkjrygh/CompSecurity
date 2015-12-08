// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.List;

public class ool extends opd
{

    private opi b;
    private opi c;
    private opi d;
    private opi e;

    public ool()
    {
    }

    public final void a()
    {
        d = a(((opi) (new ooo(this))));
    }

    public final void a(Intent intent)
    {
        for (int k = 0; k < a.size(); k++)
        {
            opv opv1 = (opv)a.get(k);
            if (opv1 instanceof ooh)
            {
                ((ooh)opv1).a(intent);
            }
        }

    }

    public final void a(Bundle bundle)
    {
        b = a(((opi) (new oom(this, bundle))));
    }

    public final void a(boolean flag)
    {
        for (int k = 0; k < a.size(); k++)
        {
            a.get(k);
        }

    }

    public final boolean a(int k, KeyEvent keyevent)
    {
        boolean flag1 = false;
        int l = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (l < a.size())
                {
                    keyevent = (opv)a.get(l);
                    if (!(keyevent instanceof oof) || !((oof)keyevent).a(k))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            l++;
        } while (true);
    }

    public final boolean a(KeyEvent keyevent)
    {
        boolean flag1 = false;
        int k = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (k < a.size())
                {
                    opv opv1 = (opv)a.get(k);
                    if (!(opv1 instanceof onz) || !((onz)opv1).a(keyevent))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            k++;
        } while (true);
    }

    public final void b()
    {
        b(d);
        super.b();
    }

    public final void b(Intent intent)
    {
        for (int k = 0; k < a.size(); k++)
        {
            opv opv1 = (opv)a.get(k);
            if (opv1 instanceof ook)
            {
                ((ook)opv1).a(intent);
            }
        }

    }

    public final void b(Bundle bundle)
    {
        c = a(new oon(this, bundle));
    }

    public final boolean b(int k, KeyEvent keyevent)
    {
        boolean flag1 = false;
        int l = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (l < a.size())
                {
                    keyevent = (opv)a.get(l);
                    if (!(keyevent instanceof oog) || !((oog)keyevent).b(k))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            l++;
        } while (true);
    }

    public final void c()
    {
        b(c);
        b(b);
        super.c();
    }

    public final void d()
    {
        e = a(new oop(this));
    }

    public final void e()
    {
        b(e);
        for (int k = 0; k < a.size(); k++)
        {
            opv opv1 = (opv)a.get(k);
            if (opv1 instanceof ooe)
            {
                ((ooe)opv1).d();
            }
        }

    }

    public final void f()
    {
        for (int k = 0; k < a.size(); k++)
        {
            a.get(k);
        }

    }

    public final void g()
    {
        for (int k = 0; k < a.size(); k++)
        {
            a.get(k);
        }

    }

    public final void h()
    {
        for (int k = 0; k < a.size(); k++)
        {
            opv opv1 = (opv)a.get(k);
            if (opv1 instanceof oob)
            {
                ((oob)opv1).c();
            }
        }

    }

    public final void i()
    {
        for (int k = 0; k < a.size(); k++)
        {
            opv opv1 = (opv)a.get(k);
            if (opv1 instanceof ooa)
            {
                ((ooa)opv1).a();
            }
        }

    }

    public final boolean j()
    {
        boolean flag1 = false;
        int k = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (k < a.size())
                {
                    opv opv1 = (opv)a.get(k);
                    if (!(opv1 instanceof ood) || !((ood)opv1).d())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            k++;
        } while (true);
    }
}
