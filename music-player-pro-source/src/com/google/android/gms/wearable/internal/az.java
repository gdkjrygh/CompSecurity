// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, p, av, v, 
//            x, z, ab, ap, 
//            at

final class az
{
    static abstract class a extends com.google.android.gms.wearable.internal.a
    {

        private com.google.android.gms.common.api.BaseImplementation.b DA;

        public void A(Object obj)
        {
            com.google.android.gms.common.api.BaseImplementation.b b1 = DA;
            if (b1 != null)
            {
                b1.b(obj);
                DA = null;
            }
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            DA = b1;
        }
    }

    static final class b extends a
    {

        public void a(p p1)
        {
            A(new f.c(av.gN(p1.statusCode), p1.axI));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }

    static final class c extends a
    {

        public void a(v v1)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(v1.axL);
            A(new ak.b(av.gN(v1.statusCode), arraylist));
        }

        public c(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }

    static final class d extends a
    {

        public void a(x x1)
        {
            A(new f.b(av.gN(x1.statusCode), x1.axM));
        }

        public d(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }

    static final class e extends a
    {

        public void ab(DataHolder dataholder)
        {
            A(new DataItemBuffer(dataholder));
        }

        public e(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }

    static final class f extends a
    {

        public void a(z z1)
        {
            A(new f.d(av.gN(z1.statusCode), z1.axN));
        }

        public f(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }

    static final class g extends a
    {

        public void a(ab ab1)
        {
            A(new ak.c(av.gN(ab1.statusCode), ab1.axO));
        }

        public g(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }

    static final class h extends com.google.android.gms.wearable.internal.a
    {

        public void a(Status status)
        {
        }

        h()
        {
        }
    }

    static final class i extends a
    {

        private final List ayf;

        public void a(ap ap1)
        {
            A(new f.b(av.gN(ap1.statusCode), ap1.axM));
            if (ap1.statusCode != 0)
            {
                for (ap1 = ayf.iterator(); ap1.hasNext(); ((FutureTask)ap1.next()).cancel(true)) { }
            }
        }

        i(com.google.android.gms.common.api.BaseImplementation.b b1, List list)
        {
            super(b1);
            ayf = list;
        }
    }

    static final class j extends a
    {

        public void a(at at1)
        {
            A(new ah.b(av.gN(at1.statusCode), at1.ayd));
        }

        public j(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
        }
    }

}
