// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.internal.zzk;
import com.google.android.gms.internal.zzr;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class cjz extends zzk
{

    private final cjy j;
    private final cnd k;

    public cjz(String s, cjy cjy1, cnd cnd1)
    {
        super(s, new cnc(cnd1, cjy1) {

            private cnd a;
            private cjy b;

            public final void a(zzr zzr)
            {
                a.a(b.a());
            }

            
            {
                a = cnd1;
                b = cjy1;
                super();
            }
        });
        j = cjy1;
        k = cnd1;
    }

    protected final cnb a(cjd cjd1)
    {
        return cnb.a(new ByteArrayInputStream(cjd1.a), coy.a(cjd1));
    }

    protected final void a(Object obj)
    {
        obj = (InputStream)obj;
        k.a(j.a(((InputStream) (obj))));
    }
}
