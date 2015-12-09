// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONObject;

final class ang.Object
    implements Runnable
{

    final JSONObject a;
    final String b;
    private bjl c;

    public final void run()
    {
        bjl.a(c, bjl.d().b());
        bjl.b(c).a(new ckp() {

            private bjl._cls2 a;

            public final void a(Object obj)
            {
                obj = (cae)obj;
                try
                {
                    ((cae) (obj)).a("AFMA_getAdapterLessMediationAd", a.a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    bka.b("Error requesting an ad url", ((Throwable) (obj)));
                }
                bjl.h_().a(a.b);
            }

            
            {
                a = bjl._cls2.this;
                super();
            }
        }, new ckn() {

            private bjl._cls2 a;

            public final void a()
            {
                bjl.h_().a(a.b);
            }

            
            {
                a = bjl._cls2.this;
                super();
            }
        });
    }

    (bjl bjl1, JSONObject jsonobject, String s)
    {
        c = bjl1;
        a = jsonobject;
        b = s;
        super();
    }
}
