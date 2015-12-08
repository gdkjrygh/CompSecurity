// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            dh, df

public final class dg
{

    public int a;
    public int b;

    public dg(Throwable throwable)
    {
label0:
        {
            super();
            a = dh.d.ordinal();
            b = df.a.ordinal();
            if (throwable != null)
            {
                a = dh.a(throwable);
                if (a != dh.d.ordinal())
                {
                    break label0;
                }
                b = df.a(throwable).a();
            }
            return;
        }
        b = Integer.parseInt(throwable.getMessage());
    }
}
