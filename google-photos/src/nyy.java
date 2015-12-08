// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;

public final class nyy extends nyu
{

    private final oxc a = new oxc();
    private final int b;

    public nyy(Context context, nyg nyg, qlr qlr1, qlw qlw)
    {
        super(context, nyg, "mutate", new owu(), new owv(), "plusdatamixer", "oauth2:https://www.googleapis.com/auth/plus.native");
        a.a(qlr1, qlw);
        b = qmb.b(qlr1.b);
    }

    public final void a(int i, String s, IOException ioexception)
    {
        owv owv1 = (owv)t();
        boolean flag;
        if (owv1 != null && owv1.a.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 200 && ioexception == null && flag)
        {
            Object obj = c();
            s = String.valueOf(((pxc) (obj)).b);
            ioexception = String.valueOf(((pxc) (obj)).a);
            obj = String.valueOf(((pxc) (obj)).c);
            super.a(500, (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(ioexception).length() + String.valueOf(obj).length())).append(s).append("::").append(ioexception).append(": ").append(((String) (obj))).toString(), null);
            return;
        } else
        {
            super.a(i, s, ioexception);
            return;
        }
    }

    protected final void a(qlw qlw)
    {
        qlw = (owu)qlw;
        oxf oxf1 = new oxf();
        oxf1.a = Integer.valueOf(b);
        oxf1.b = a;
        qlw.b = oxf1;
        qlw.a = b.a(h, g);
    }

    protected final void b(qlw qlw)
    {
        qlw = (owv)qlw;
        if (((owv) (qlw)).a.b != null)
        {
            a(200, null, null);
        }
        b.a(g, ((owv) (qlw)).b);
    }

    public final pxc c()
    {
        return ((owv)t()).a.b;
    }

    public final boolean u()
    {
        owv owv1 = (owv)t();
        return owv1 != null && owv1.a != null && owv1.a.b != null;
    }
}
