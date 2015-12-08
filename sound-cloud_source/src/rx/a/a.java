// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.a;

import com.soundcloud.android.rx.RxUtils;
import rx.Y;
import rx.b;
import rx.b.f;
import rx.g.c;

// Referenced classes of package rx.a:
//            b

public abstract class a
    implements f
{

    private static final b FINISH_SEQUENCE = b.never();
    private b nextPage;
    private c pages;
    private Y subscription;

    public a()
    {
        nextPage = FINISH_SEQUENCE;
        subscription = RxUtils.invalidSubscription();
    }

    public static b finish()
    {
        return FINISH_SEQUENCE;
    }

    public b currentPage()
    {
        return page(nextPage);
    }

    public boolean hasNext()
    {
        return nextPage != FINISH_SEQUENCE;
    }

    public void next()
    {
        if (!subscription.isUnsubscribed() && hasNext())
        {
            pages.onNext(nextPage);
        }
    }

    public b page(b b1)
    {
        return b.create(new rx.a.b(this, b1));
    }




/*
    static c access$002(a a1, c c1)
    {
        a1.pages = c1;
        return c1;
    }

*/



/*
    static Y access$102(a a1, Y y)
    {
        a1.subscription = y;
        return y;
    }

*/



/*
    static b access$202(a a1, b b1)
    {
        a1.nextPage = b1;
        return b1;
    }

*/

}
