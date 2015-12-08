// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abK
{
    public static interface a
    {

        public abstract int a(aec aec);
    }


    public abY a;
    public abF b;
    public abH c;
    public abZ d;
    public abT e;
    private abM f;

    public abK(abY aby, abF abf)
    {
        if (aby == null)
        {
            throw new NullPointerException("unprocessedInsns == null");
        } else
        {
            a = aby;
            b = abf;
            c = null;
            d = null;
            e = null;
            f = null;
            return;
        }
    }

    public final void a()
    {
        if (f != null)
        {
            return;
        }
        abY aby = a;
        if (aby.d >= 0)
        {
            throw new UnsupportedOperationException("already processed");
        } else
        {
            abN aabn[] = aby.a();
            aby.a(aabn);
            aby.b(aabn);
            aby.b();
            java.util.ArrayList arraylist = aby.b;
            int i = aby.d;
            f = abM.a(arraylist, aby.a + i);
            d = abZ.b();
            e = abT.a(f);
            c = b.a();
            a = null;
            b = null;
            return;
        }
    }

    public final abM b()
    {
        a();
        return f;
    }
}
