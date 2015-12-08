// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;
import rx.internal.operators.OnSubscribeFromIterable;
import rx.internal.operators.OperatorMerge;
import rx.internal.operators.OperatorZip;

public class hew
{

    private static final hjp b;
    final hey a;

    public hew(hey hey1)
    {
        a = hey1;
    }

    public static final hew a()
    {
        return hex.a;
    }

    public static final hew a(hew hew1)
    {
        if (hew1.getClass() == hic)
        {
            return ((hic)hew1).d(hii.a());
        } else
        {
            return hew1.a(((hez) (new OperatorMerge(1))));
        }
    }

    public static final hew a(hew hew1, hew hew2)
    {
        return a(((hey) (new OnSubscribeFromIterable(Arrays.asList(new Object[] {
            hew1, hew2
        }))))).a(((hez) (hgn.a)));
    }

    public static final hew a(hew hew1, hew hew2, hew hew3, hew hew4, hfz hfz)
    {
        return hic.b(new hew[] {
            hew1, hew2, hew3, hew4
        }).a(((hez) (new OperatorZip(hfz))));
    }

    public static final hew a(hew hew1, hew hew2, hfx hfx)
    {
        return a(((hey) (new hgd(Arrays.asList(new hew[] {
            hew1, hew2
        }), new hgb._cls1(hfx)))));
    }

    public static final hew a(hey hey1)
    {
        return new hew(hjp.a(hey1));
    }

    public static final hew a(Object obj)
    {
        return hic.b(obj);
    }

    public static hfg a(hff hff1, hew hew1)
    {
        if (hff1 == null)
        {
            throw new IllegalArgumentException("observer can not be null");
        }
        if (hew1.a == null)
        {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        hff1.onStart();
        Object obj = hff1;
        if (!(hff1 instanceof hjj))
        {
            obj = new hjj(hff1);
        }
        try
        {
            hjp.b(hew1.a).a(obj);
            hff1 = hjp.a(((hfg) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (hff hff1)
        {
            hfp.a(hff1);
            try
            {
                ((hff) (obj)).onError(hjp.a(hff1));
            }
            // Misplaced declaration of an exception variable
            catch (hff hff1)
            {
                throw hff1;
            }
            // Misplaced declaration of an exception variable
            catch (hew hew1)
            {
                throw new RuntimeException((new StringBuilder("Error occurred attempting to subscribe [")).append(hff1.getMessage()).append("] and then again while trying to pass to onError.").toString(), hew1);
            }
            return hkr.b();
        }
        return hff1;
    }

    static hjp d()
    {
        return b;
    }

    public final hew a(hez hez)
    {
        return new hew(new _cls1(hez));
    }

    public final hew a(hfa hfa1)
    {
        return (hew)hfa1.call(this);
    }

    public final hew a(hfd hfd)
    {
        if (this instanceof hic)
        {
            return ((hic)this).c(hfd);
        } else
        {
            return a(((hez) (new hgw(hfd))));
        }
    }

    public final hew a(hfw hfw)
    {
        return a(((hez) (new hgq(hfw))));
    }

    public final hfg a(hfb hfb)
    {
        if (hfb instanceof hff)
        {
            return a((hff)hfb, this);
        } else
        {
            return a(((hff) (new _cls4(hfb))), this);
        }
    }

    public final hfg a(hff hff1)
    {
        hfg hfg;
        try
        {
            hff1.onStart();
            hjp.b(a).a(hff1);
            hfg = hjp.a(hff1);
        }
        catch (Throwable throwable)
        {
            hfp.a(throwable);
            try
            {
                hff1.onError(hjp.a(throwable));
            }
            // Misplaced declaration of an exception variable
            catch (hff hff1)
            {
                throw hff1;
            }
            // Misplaced declaration of an exception variable
            catch (hff hff1)
            {
                throw new RuntimeException((new StringBuilder("Error occurred attempting to subscribe [")).append(throwable.getMessage()).append("] and then again while trying to pass to onError.").toString(), hff1);
            }
            return hkr.b();
        }
        return hfg;
    }

    public final hew b()
    {
        return c().a(hhd.a);
    }

    public final hew b(hfd hfd)
    {
        if (this instanceof hic)
        {
            return ((hic)this).c(hfd);
        } else
        {
            return hic.b(this).a(new hhf(hfd));
        }
    }

    public final hew b(hfw hfw)
    {
        if (getClass() == hic)
        {
            return ((hic)this).d(hfw);
        }
        hfw = c(hfw);
        if (hfw.getClass() == hic)
        {
            return ((hic)hfw).d(hii.a());
        } else
        {
            return hfw.a(hgs.a);
        }
    }

    public final hew c()
    {
        return a(new hhg());
    }

    public final hew c(hfw hfw)
    {
        return a(new hgr(hfw));
    }

    static 
    {
        hjr hjr1 = hjr.a();
        if (hjr1.a.get() == null)
        {
            Object obj = hjr.a(hjp);
            if (obj == null)
            {
                hjr1.a.compareAndSet(null, hjq.a());
            } else
            {
                hjr1.a.compareAndSet(null, (hjp)obj);
            }
        }
        b = (hjp)hjr1.a.get();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}

}
