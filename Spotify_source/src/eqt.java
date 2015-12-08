// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public final class eqt extends eqm
{

    final int a;
    int b;
    boolean f;
    private final eqn g = new eqn() {

        private eqt a;

        public final void a(Object obj)
        {
            a.f = true;
        }

        public final void b(Object obj)
        {
        }

            
            {
                a = eqt.this;
                super();
            }
    };
    private final eqo h = new eqo() {

        private eqt a;

        protected final void a()
        {
            eqt eqt1 = a;
            eqt1.b = eqt1.b + 1;
            eqt1 = a;
            if (!((eqm) (eqt1)).c)
            {
                if (eqt1.f)
                {
                    eqt1.d();
                    eqt1.d(eqt1.e());
                } else
                if (eqt1.b == eqt1.a)
                {
                    eqt1.c(eqt1.e());
                    return;
                }
            }
        }

            
            {
                a = eqt.this;
                super();
            }
    };
    private final ImmutableList i;
    private final ImmutableList j;

    public eqt(ImmutableList immutablelist, ImmutableList immutablelist1)
    {
        i = (ImmutableList)ctz.a(immutablelist);
        j = (ImmutableList)ctz.a(immutablelist1);
        a = immutablelist.size() + immutablelist1.size();
        for (immutablelist1 = immutablelist1.a(); immutablelist1.hasNext(); ((eqm)immutablelist1.next()).a(h)) { }
        for (immutablelist = immutablelist.a(); immutablelist.hasNext(); immutablelist1.a(h))
        {
            immutablelist1 = (eqm)immutablelist.next();
            immutablelist1.a(g);
        }

    }

    protected final void a()
    {
        d();
    }

    final void d()
    {
        for (cvh cvh = i.a(); cvh.hasNext(); ((eqm)cvh.next()).c()) { }
        for (cvh cvh1 = j.a(); cvh1.hasNext(); ((eqm)cvh1.next()).c()) { }
    }

    final eqv e()
    {
        ImmutableList immutablelist = i;
        ImmutableList immutablelist1 = j;
        return new eqv(eqv.a(immutablelist), eqv.a(immutablelist1));
    }
}
