// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;


// Referenced classes of package rx.internal.a:
//            bT

static final class d extends d
{

    final int d;

    final void b()
    {
        if (c > d)
        {
            d d1 = (d)((d)get()).get();
            if (d1 == null)
            {
                throw new IllegalStateException("Empty list!");
            }
            super.c = super.c - 1;
            set(d1);
        }
    }

    public ateException(int i)
    {
        d = i;
    }
}
