// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

abstract class bpe extends bpi
{

    bqb a;

    bpe(bqu bqu)
    {
        super(bqu);
        a = new bqb() {

            private bpe a;

            public final void a()
            {
                a.a(bpe.b(new Status(2103)));
            }

            public final void a(int i)
            {
                a.a(new bpf(new Status(i)));
            }

            
            {
                a = bpe.this;
                super();
            }
        };
    }

    public static bpb b(Status status)
    {
        return new bpb(status) {

            private Status a;

            public final Status c()
            {
                return a;
            }

            
            {
                a = status;
                super();
            }
        };
    }

    public final brc a(Status status)
    {
        return b(status);
    }
}
