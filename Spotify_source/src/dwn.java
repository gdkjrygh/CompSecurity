// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Set;

public class dwn extends dwj
{

    dws f;
    private final dwr g = new dwr() {

        private dwn a;

        public final void a(dws dws1)
        {
            a.f = dws1;
        }

        public final void a(Object obj)
        {
            ((dwi)a.f()).a(obj);
        }

        public final boolean a()
        {
            return a.c();
        }

        public final void b(Object obj)
        {
            ((dwi)a.f()).b(obj);
        }

            
            {
                a = dwn.this;
                super();
            }
    };
    private dwq h;

    public dwn(Context context, Class class1, dwl dwl)
    {
        super(context, class1, dwl);
        h = new dwq(g);
    }

    public final void a(Object obj)
    {
        dwq dwq1 = h;
        dwq1.b.add(obj);
        if (dwq1.a.a())
        {
            dwq1.a.a(obj);
        }
    }

    public final void b()
    {
        f.b();
        super.b();
    }

    public final void b(Object obj)
    {
        dwq dwq1 = h;
        dwq1.b.remove(obj);
        if (dwq1.a.a())
        {
            dwq1.a.b(obj);
        }
    }

    protected final void e()
    {
        super.e();
        f.a();
    }
}
