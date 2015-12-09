// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.fragments.logic.Flags;

final class dui
    implements hez
{

    fyu a;
    boolean b;
    Flags c;

    public dui(fyu fyu)
    {
        a = fyu;
    }

    public final Object call(Object obj)
    {
        obj = (hff)obj;
        return new hff(((hff) (obj)), ((hff) (obj))) {

            private hff a;
            private dui b;

            public final void onCompleted()
            {
                a.onCompleted();
            }

            public final void onError(Throwable throwable)
            {
                a.onError(throwable);
            }

            public final void onNext(Object obj1)
            {
                obj1 = (Flags)obj1;
                Flags flags = b.c;
                b.c = ((Flags) (obj1));
                if (b.b)
                {
                    if (fyv.a(b.a, flags, ((Flags) (obj1))))
                    {
                        a.onNext(obj1);
                        return;
                    } else
                    {
                        request(1L);
                        return;
                    }
                } else
                {
                    b.b = true;
                    a.onNext(obj1);
                    return;
                }
            }

            
            {
                b = dui.this;
                a = hff2;
                super(hff1);
            }
        };
    }
}
