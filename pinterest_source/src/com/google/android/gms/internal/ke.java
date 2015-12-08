// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.internal:
//            kd

public final class ke
    implements kd
{

    public ke()
    {
    }

    public final PendingResult c(GoogleApiClient googleapiclient)
    {
        return (new _cls1(googleapiclient)).gE();
    }

    private class _cls1 extends kf.a
    {

        final ke Nv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((kg)a1);
        }

        protected void a(kg kg1)
        {
            ((ki)kg1.hw()).a(new a(this));
        }

        _cls1(GoogleApiClient googleapiclient)
        {
            Nv = ke.this;
            super(googleapiclient);
        }

        private class a extends kb
        {

            private final com.google.android.gms.common.api.BaseImplementation.b Ea;

            public void aI(int i)
            {
                Ea.b(new Status(i));
            }

            public a(com.google.android.gms.common.api.BaseImplementation.b b)
            {
                Ea = b;
            }
        }

    }

}
