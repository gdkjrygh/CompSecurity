// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            i, j, q, l

final class k
    implements Runnable
{

    final i a;
    final j b;
    final q c;

    k(i i1, j j1, q q1)
    {
        a = i1;
        b = j1;
        c = q1;
        super();
    }

    public final void run()
    {
        j j1 = (j)a.then(b);
        if (j1 == null)
        {
            try
            {
                c.a(null);
                return;
            }
            catch (Exception exception)
            {
                c.a(exception);
            }
            break MISSING_BLOCK_LABEL_53;
        }
        j1.a(new l(this));
        return;
    }
}
