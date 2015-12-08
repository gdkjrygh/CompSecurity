// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.List;

public final class cdx extends cjc
{

    final ckw a;
    final cdz b;
    private final String c;

    cdx(ckw ckw, cdz cdz1, String s)
    {
        a = ckw;
        b = cdz1;
        c = s;
        bkv.r().a.add(this);
    }

    public final void a()
    {
        b.a(c);
        cjj.a.post(new Runnable() {

            private cdx a;

            public final void run()
            {
                cdy cdy1 = bkv.r();
                cdx cdx1 = a;
                cdy1.a.remove(cdx1);
            }

            
            {
                a = cdx.this;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        cjj.a.post(new _cls1());
        throw exception;
    }

    public final void b()
    {
        b.b();
    }
}
