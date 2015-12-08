// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, DeleteDataItemsResponse, ak, GetCapabilityResponse, 
//            GetDataItemResponse, GetFdForAssetResponse, PutDataResponse, SendMessageResponse

final class an
{
    static abstract class a extends com.google.android.gms.wearable.internal.a
    {

        private com.google.android.gms.common.api.k.b a;

        public final void a(Object obj)
        {
            com.google.android.gms.common.api.k.b b1 = a;
            if (b1 != null)
            {
                b1.a(obj);
                a = null;
            }
        }

        public a(com.google.android.gms.common.api.k.b b1)
        {
            a = b1;
        }
    }

    static final class b extends a
    {

        public final void a(DeleteDataItemsResponse deletedataitemsresponse)
        {
            a(new bg.b(ak.a(deletedataitemsresponse.b), deletedataitemsresponse.c));
        }

        public b(com.google.android.gms.common.api.k.b b1)
        {
            super(b1);
        }
    }

    static final class c extends a
    {

        public final void a(GetCapabilityResponse getcapabilityresponse)
        {
            a(new ax.b(ak.a(getcapabilityresponse.b), new ax.a(getcapabilityresponse.c)));
        }

        public c(com.google.android.gms.common.api.k.b b1)
        {
            super(b1);
        }
    }

    static final class d extends a
    {

        public final void a(GetDataItemResponse getdataitemresponse)
        {
            a(new bg.a(ak.a(getdataitemresponse.b), getdataitemresponse.c));
        }

        public d(com.google.android.gms.common.api.k.b b1)
        {
            super(b1);
        }
    }

    static final class e extends a
    {

        public final void a(GetFdForAssetResponse getfdforassetresponse)
        {
            a(new bg.c(ak.a(getfdforassetresponse.b), getfdforassetresponse.c));
        }

        public e(com.google.android.gms.common.api.k.b b1)
        {
            super(b1);
        }
    }

    static final class f extends com.google.android.gms.wearable.internal.a
    {

        public final void a(Status status)
        {
        }

        f()
        {
        }
    }

    static final class g extends a
    {

        private final List a;

        public final void a(PutDataResponse putdataresponse)
        {
            a(new bg.a(ak.a(putdataresponse.b), putdataresponse.c));
            if (putdataresponse.b != 0)
            {
                for (putdataresponse = a.iterator(); putdataresponse.hasNext(); ((FutureTask)putdataresponse.next()).cancel(true)) { }
            }
        }

        g(com.google.android.gms.common.api.k.b b1, List list)
        {
            super(b1);
            a = list;
        }
    }

    static final class h extends a
    {

        public final void a(SendMessageResponse sendmessageresponse)
        {
            a(new z.b(ak.a(sendmessageresponse.b), sendmessageresponse.c));
        }

        public h(com.google.android.gms.common.api.k.b b1)
        {
            super(b1);
        }
    }

}
