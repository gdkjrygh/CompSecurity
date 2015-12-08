// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class crx
    implements cqj
{

    public crx()
    {
    }

    public final bra a(bqu bqu1, String s, String s1, byte abyte0[])
    {
        return bqu1.a(new csx(bqu1, s, s1, abyte0) {

            private String a;
            private String c;
            private byte d[];

            protected final brc a(Status status)
            {
                return new cry(status, -1);
            }

            protected final void a(bqr bqr)
            {
                bqr = (cso)bqr;
                String s2 = a;
                String s3 = c;
                byte abyte1[] = d;
                ((crt)bqr.p()).a(new csn(this), s2, s3, abyte1);
            }

            
            {
                a = s;
                c = s1;
                d = abyte0;
                super(bqu1);
            }
        });
    }
}
