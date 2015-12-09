// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ek
{

    public final int a;
    public final int b;
    public int c;
    public el d;
    private Object e;

    public ek(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public final Object a()
    {
        if (e != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return e;
        } else
        {
            e = new em._cls1(a, b, c, new en() {

                private ek a;

                public final void a(int i)
                {
                    a.a(i);
                }

                public final void b(int i)
                {
                    a.b(i);
                }

            
            {
                a = ek.this;
                super();
            }
            });
            return e;
        }
    }

    public void a(int i)
    {
    }

    public void b(int i)
    {
    }
}
