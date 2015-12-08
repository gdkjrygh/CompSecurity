// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.fragments.logic.Flags;

final class duk
    implements hey
{

    final dxe a;

    public duk(dxe dxe1)
    {
        a = dxe1;
    }

    public final void a(Object obj)
    {
        obj = (hff)obj;
        dwx dwx = new dwx(((hff) (obj))) {

            private hff a;

            public final void a(Flags flags)
            {
                if (!a.isUnsubscribed())
                {
                    a.onNext(flags);
                }
_L1:
                return;
                flags;
                if (!a.isUnsubscribed())
                {
                    a.onError(flags);
                    return;
                }
                  goto _L1
            }

            
            {
                a = hff1;
                super();
            }
        };
        a.a(dwx);
        ((hff) (obj)).add(hkr.a(new hfr(dwx) {

            private dwx a;
            private duk b;

            public final void call()
            {
                b.a.b(a);
            }

            
            {
                b = duk.this;
                a = dwx;
                super();
            }
        }));
    }
}
