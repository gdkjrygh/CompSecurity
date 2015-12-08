// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.ResponseParser;
import com.spotify.mobile.android.spotlets.common.datasource.CosmosError;
import com.spotify.mobile.android.spotlets.common.task.TimeoutOrError;
import java.util.Iterator;
import java.util.Set;

public abstract class eov
    implements eox
{

    private static final ghl a = new ghl() {

        public final Object a(Object obj)
        {
            obj = (TimeoutOrError)obj;
            final class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[com.spotify.mobile.android.spotlets.common.task.TimeoutOrError.What.values().length];
                    try
                    {
                        a[com.spotify.mobile.android.spotlets.common.task.TimeoutOrError.What.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.spotify.mobile.android.spotlets.common.task.TimeoutOrError.What.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            com.spotify.mobile.android.spotlets.common.datasource.CosmosError.Reason reason;
            switch (_cls2.a[((TimeoutOrError) (obj)).a.ordinal()])
            {
            default:
                throw new AssertionError("TimeoutOrError is broken");

            case 1: // '\001'
                return (CosmosError)((TimeoutOrError) (obj)).b.c();

            case 2: // '\002'
                reason = com.spotify.mobile.android.spotlets.common.datasource.CosmosError.Reason.a;
                break;
            }
            return new CosmosError(new RuntimeException((new StringBuilder("Timed out after ")).append(((TimeoutOrError) (obj)).c).append(" ms").toString()));
        }

    };
    private final eoy b = new eoy();
    private final Resolver c;
    private final Handler d;
    private final ResponseParser e;

    protected eov(Class class1, Resolver resolver, Handler handler)
    {
        e = a(class1);
        c = (Resolver)ctz.a(resolver);
        d = (Handler)ctz.a(handler);
    }

    static Handler a(eov eov1)
    {
        return eov1.d;
    }

    static ResponseParser b(eov eov1)
    {
        return eov1.e;
    }

    protected abstract ResponseParser a(Class class1);

    public final eqm a(Request request, long l)
    {
        Object obj = new eow(this);
        request = (Request)ctz.a(request);
        ((eow) (obj)).b.c.resolve(request, ((eow) (obj)).a);
        request = d;
        obj = new eqr(((eqm) (obj)), l);
        if (!((eqr) (obj)).b.b() && !((eqr) (obj)).b.c)
        {
            obj.f = (Handler)ctz.a(request);
            request.postDelayed(((eqr) (obj)).a, ((eqr) (obj)).g);
        }
        request = ((eqm) (obj)).a(ghk.a(), a);
        obj = b;
        if (((eqm) (request)).c || request.b())
        {
            return request;
        } else
        {
            ((eoy) (obj)).a.add(request);
            request.a(new eoz(((eoy) (obj)), request));
            return request;
        }
    }

    public final volatile eqm a(Object obj)
    {
        return a((Request)obj, 32000L);
    }

    public final void a()
    {
        eoy eoy1 = b;
        for (Iterator iterator = eoy1.a.iterator(); iterator.hasNext(); ((eqm)iterator.next()).c()) { }
        eoy1.a.clear();
    }

}
