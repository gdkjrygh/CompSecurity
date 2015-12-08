// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class ng.Object
    implements ng.Object
{

    final il.List this$1;

    public final void a()
    {
        nP.this.a(null, true);
    }

    public final void a(int i)
    {
        if (i == 401 && !nP.a(_fld0))
        {
            nP.b(_fld0);
            mCashAuthManager.a(null);
            nP.this.a(null);
            return;
        } else
        {
            b(null, false);
            return;
        }
    }

    ct()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class nP$1

/* anonymous class */
    final class nP._cls1
        implements np.a
    {

        final nP this$0;

        public final void a(np np)
        {
            nP.c(nP.this);
        }

        public final void a(np np, List list, boolean flag)
        {
            if (list == null || list.isEmpty())
            {
                nP.a(new nP._cls1._cls1()).execute();
                return;
            } else
            {
                nP.this.b(null, false);
                return;
            }
        }

        public final void b(np np)
        {
            nP.d(nP.this);
        }

        public final void b(np np, List list, boolean flag)
        {
            nP.this.b(null, false);
        }

            
            {
                this$0 = nP.this;
                super();
            }
    }

}
